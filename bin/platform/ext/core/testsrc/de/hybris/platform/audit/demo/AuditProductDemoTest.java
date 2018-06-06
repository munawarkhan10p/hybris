/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */

package de.hybris.platform.audit.demo;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.audit.AuditableTest;
import de.hybris.platform.audit.TypeAuditReportConfig;
import de.hybris.platform.audit.internal.config.AuditConfigService;
import de.hybris.platform.audit.internal.config.AuditReportConfig;
import de.hybris.platform.audit.view.AuditViewService;
import de.hybris.platform.audit.view.impl.ReportView;
import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.HybrisEnumValue;
import de.hybris.platform.core.PK;
import de.hybris.platform.core.model.enumeration.EnumerationValueModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.directpersistence.audit.AuditRecord;
import de.hybris.platform.directpersistence.audit.impl.DefaultPersistenceAuditService;
import de.hybris.platform.servicelayer.ServicelayerBaseTest;
import de.hybris.platform.servicelayer.exceptions.SystemException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.type.TypeService;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.io.IOUtils;
import org.assertj.core.data.Offset;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class AuditProductDemoTest extends ServicelayerBaseTest implements AuditableTest
{
	private static final String PRODUCT = "Product";
	private static final String PRODUCT_NAME_EN_1 = "prod_en_1";
	private static final String PRODUCT_NAME_DE_1 = "prod_de_1";

	private static final String PRODUCT_EAN_1 = "ean_1";
	private static final String PRODUCT_MANUFACTURER_1 = "manufact_1";

	@Resource
	private TypeService typeService;
	@Resource
	private DefaultPersistenceAuditService persistenceAuditService;
	@Resource
	private ModelService modelService;
	@Resource
	private AuditConfigService auditConfigService;
	@Resource
	private AuditViewService auditViewService;

	private AuditTestConfigManager auditTestConfigManager;

	private CatalogModel catalog;
	private CatalogVersionModel catalogVersion;

	@Before
	public void setUp() throws Exception
	{
		auditTestConfigManager = new AuditTestConfigManager(persistenceAuditService);
		auditTestConfigManager.enableAuditingForTypes("Product");
		assumeAuditEnabled();

		getOrCreateLanguage("en");
		getOrCreateLanguage("de");

		createCatalogAndCatalogVersion();
	}

	@After
	public void cleanup()
	{
		auditTestConfigManager.resetAuditConfiguration();
	}

	@Test
	public void shouldFailIfConfiguredRootObjectDoesNotMatchPKType()
	{
		final ProductModel product = modelService.create(ProductModel.class);
		product.setCode(UUID.randomUUID().toString());
		product.setName("prod_en_1", Locale.ENGLISH);
		product.setName("prod_de_1", Locale.GERMAN);
		product.setCatalogVersion(catalogVersion);

		modelService.save(product);

		final AuditReportConfig testConfig = loadConfigFromFile("audit.test/customer-audit.xml");

		try
		{
			auditViewService.getViewOn(
					TypeAuditReportConfig.builder().withConfig(testConfig).withRootTypePk(product.getPk()).withFullReport().build());
		}
		catch (final Exception ex)
		{
			assertThat(ex).isInstanceOf(SystemException.class);
		}
	}

	@Test
	public void shouldAuditProductData()
	{
		modelService.saveAll(catalog, catalogVersion);

		final ProductModel product = modelService.create(ProductModel.class);
		product.setCode(UUID.randomUUID().toString());

		product.setName(PRODUCT_NAME_EN_1, Locale.ENGLISH);
		product.setName(PRODUCT_NAME_DE_1, Locale.GERMAN);

		product.setCatalogVersion(catalogVersion);

		final LocalDate startLocalDate = LocalDate.of(2012, 1, 1);
		final LocalDate endLocalDate = LocalDate.of(2012, 1, 2);

		final Date startDate = Date.from(startLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		final Date endDate = Date.from(endLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

		product.setDescription("description_1");
		product.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
		product.setOnlineDate(startDate);
		product.setOfflineDate(endDate);

		product.setPriceQuantity(Double.valueOf(10.0));
		product.setMinOrderQuantity(Integer.valueOf(1));
		product.setMaxOrderQuantity(Integer.valueOf(10));

		product.setEan(PRODUCT_EAN_1);
		product.setManufacturerName(PRODUCT_MANUFACTURER_1);

		product.setRemarks("remark_en_1", Locale.ENGLISH);
		product.setRemarks("remark_de_1", Locale.GERMAN);
		modelService.save(product);

		product.setApprovalStatus(ArticleApprovalStatus.APPROVED);
		product.setName("prod_en_2", Locale.ENGLISH);
		product.setRemarks("remark_en_2", Locale.ENGLISH);
		modelService.save(product);

		product.setName("prod_en_3", Locale.ENGLISH);
		modelService.save(product);

		assertAuditRecords(catalogVersion, product, startDate, endDate);

		final AuditReportConfig testConfig = loadConfigFromFile("audit.test/product-audit.xml");
		final List<ReportView> u1ReportView = auditViewService
				.getViewOn(
						TypeAuditReportConfig.builder().withConfig(testConfig).withRootTypePk(product.getPk()).withFullReport().build())
				.collect(toList());

		final Map<String, Object> productReport1 = (Map<String, Object>) u1ReportView.get(0).getPayload().get(PRODUCT);

		assertThat(productReport1.get(ProductModel.CATALOGVERSION)).isEqualTo(catalogVersion.getPk());
		assertThat(productReport1.get(ProductModel.ONLINEDATE)).isEqualTo(startDate);
		assertThat(productReport1.get(ProductModel.OFFLINEDATE)).isEqualTo(endDate);

		assertThat(productReport1.get(ProductModel.EAN)).isEqualTo(PRODUCT_EAN_1);
		assertThat(productReport1.get(ProductModel.MANUFACTURERNAME)).isEqualTo(PRODUCT_MANUFACTURER_1);
		assertThat(productReport1.get(ProductModel.APPROVALSTATUS))
				.isEqualTo(getFixedEnumValuePk(ArticleApprovalStatus.UNAPPROVED));

		assertThat(productReport1.get(ProductModel.MINORDERQUANTITY)).isEqualTo(Integer.valueOf(1));
		assertThat(productReport1.get(ProductModel.MAXORDERQUANTITY)).isEqualTo(Integer.valueOf(10));
		assertThat((Double) productReport1.get(ProductModel.PRICEQUANTITY)).isEqualTo(10.0, Offset.offset(Double.valueOf(0.1)));

		assertThat(localizedAttribute(productReport1, "name")).containsEntry("de", "prod_de_1").containsEntry("en", "prod_en_1");
		assertThat(localizedAttribute(productReport1, "remarks")).containsEntry("de", "remark_de_1").containsEntry("en",
				"remark_en_1");
		assertThat(localizedAttribute(productReport1, "description")).containsEntry("en", "description_1");

		final Map<String, Object> productReport2 = (Map<String, Object>) u1ReportView.get(1).getPayload().get(PRODUCT);
		assertThat(productReport2.get(ProductModel.APPROVALSTATUS)).isEqualTo(getFixedEnumValuePk(ArticleApprovalStatus.APPROVED));

		assertThat(localizedAttribute(productReport2, "name")).containsEntry("de", "prod_de_1").containsEntry("en", "prod_en_2");
		assertThat(localizedAttribute(productReport2, "remarks")).containsEntry("de", "remark_de_1").containsEntry("en",
				"remark_en_2");
		assertThat(localizedAttribute(productReport2, "description")).containsEntry("en", "description_1");

		final Map<String, Object> productReport3 = (Map<String, Object>) u1ReportView.get(2).getPayload().get(PRODUCT);

		assertThat(localizedAttribute(productReport3, "name")).containsEntry("de", "prod_de_1").containsEntry("en", "prod_en_3");
		assertThat(localizedAttribute(productReport2, "remarks")).containsEntry("de", "remark_de_1").containsEntry("en",
				"remark_en_2");
		assertThat(localizedAttribute(productReport3, "description")).containsEntry("en", "description_1");
	}

	private Map<String, Object> localizedAttribute(final Map<String, Object> map, final String key)
	{
		return (Map<String, Object>) map.get(key);
	}

	void assertAuditRecords(final CatalogVersionModel catalogVersion, final ProductModel product, final Date startDate,
			final Date endDate)
	{
		final List<AuditRecord> auditRecordsForType = persistenceAuditService.getAuditRecordsForType(ProductModel._TYPECODE,
				product.getPk());
		final AuditRecord auditRecord1 = auditRecordsForType.get(0);

		assertThat((PK) auditRecord1.getAttribute("catalogversion")).isEqualTo(catalogVersion.getPk());
		assertThat((String) auditRecord1.getAttribute("name", "en")).isEqualTo(PRODUCT_NAME_EN_1);
		assertThat((String) auditRecord1.getAttribute("name", "de")).isEqualTo(PRODUCT_NAME_DE_1);

		assertThat((String) auditRecord1.getAttribute("ean")).isEqualTo(PRODUCT_EAN_1);
		assertThat((String) auditRecord1.getAttribute("manufacturername")).isEqualTo(PRODUCT_MANUFACTURER_1);

		assertThat((String) auditRecord1.getAttribute("remarks", "en")).isEqualTo("remark_en_1");
		assertThat((String) auditRecord1.getAttribute("remarks", "de")).isEqualTo("remark_de_1");

		final Object onlinedate = auditRecord1.getAttribute("onlinedate");
		final Object offlinedate = auditRecord1.getAttribute("offlinedate");

		assertThat(onlinedate).isEqualTo(startDate);
		assertThat(offlinedate).isEqualTo(endDate);

		assertThat((PK) auditRecord1.getAttribute("catalogversion")).isEqualTo(catalogVersion.getPk());
		assertThat((PK) auditRecord1.getAttribute("approvalstatus"))
				.isEqualTo(getFixedEnumValuePk(ArticleApprovalStatus.UNAPPROVED));

		final AuditRecord auditRecord2 = auditRecordsForType.get(1);

		assertThat((PK) auditRecord2.getAttribute("approvalstatus")).isEqualTo(getFixedEnumValuePk(ArticleApprovalStatus.APPROVED));

		assertThat((String) auditRecord2.getAttribute("name", "en")).isEqualTo("prod_en_2");
		assertThat((String) auditRecord2.getAttribute("name", "de")).isEqualTo("prod_de_1");

		assertThat((String) auditRecord2.getAttribute("remarks", "en")).isEqualTo("remark_en_2");
		assertThat((String) auditRecord2.getAttribute("remarks", "de")).isEqualTo("remark_de_1");
	}

	private PK getFixedEnumValuePk(final HybrisEnumValue fixedEnum)
	{
		final EnumerationValueModel enumValue = typeService.getEnumerationValue(fixedEnum.getType(), fixedEnum.getCode());
		return enumValue.getPk();
	}

	private AuditReportConfig loadConfigFromFile(final String file)
	{
		try (InputStream resourceAsStream = UserAuditDemoTest.class.getClassLoader().getResourceAsStream(file))
		{
			final String xml = IOUtils.toString(resourceAsStream, UTF_8);
			auditConfigService.storeConfiguration("testConfig", xml);
			return auditConfigService.getConfigForName("testConfig");
		}
		catch (final IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	private void createCatalogAndCatalogVersion()
	{
		catalog = modelService.create(CatalogModel.class);
		catalog.setId(UUID.randomUUID().toString());

		catalogVersion = modelService.create(CatalogVersionModel.class);
		catalogVersion.setVersion(UUID.randomUUID().toString());
		catalogVersion.setCatalog(catalog);
	}

}
