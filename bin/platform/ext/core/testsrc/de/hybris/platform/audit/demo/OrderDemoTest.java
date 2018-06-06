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

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.audit.AuditableTest;
import de.hybris.platform.audit.TypeAuditReportConfig;
import de.hybris.platform.audit.internal.config.AuditConfigService;
import de.hybris.platform.audit.internal.config.AuditReportConfig;
import de.hybris.platform.audit.view.AuditViewService;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.HybrisEnumValue;
import de.hybris.platform.core.PK;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.enumeration.EnumerationValueModel;
import de.hybris.platform.core.model.order.OrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.directpersistence.audit.impl.DefaultPersistenceAuditService;
import de.hybris.platform.servicelayer.ServicelayerBaseTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.type.TypeService;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class OrderDemoTest extends ServicelayerBaseTest implements AuditableTest
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

	private ProductModel product;


	@Before
	public void setUp() throws Exception
	{
		auditTestConfigManager = new AuditTestConfigManager(persistenceAuditService);
		auditTestConfigManager.enableAuditingForTypes("Product", "Order", "OrderEntry", "Unit", "Currency");
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
	public void shouldAuditOrdersAndEntries_showEntries()
	{
		final UserModel user = modelService.create(UserModel.class);
		user.setUid(UUID.randomUUID().toString());
		modelService.save(user);


		final CurrencyModel euroCurrency = modelService.create(CurrencyModel.class);
		euroCurrency.setIsocode("EUR");
		euroCurrency.setSymbol("E");

		final CurrencyModel plnCurrency = modelService.create(CurrencyModel.class);
		plnCurrency.setIsocode("PLN");
		plnCurrency.setSymbol("zl");

		final UnitModel unit = modelService.create(UnitModel.class);
		unit.setCode(UUID.randomUUID().toString());
		unit.setUnitType("pieces");

		modelService.saveAll(euroCurrency, plnCurrency, unit);



		final OrderModel order = modelService.create(OrderModel.class);
		order.setCode(UUID.randomUUID().toString());
		order.setUser(user);
		final Date firstDate = getDate(2012, 10, 1);
		order.setDate(firstDate);
		order.setCurrency(euroCurrency);

		modelService.save(order);


		final OrderEntryModel orderEntry = modelService.create(OrderEntryModel.class);
		orderEntry.setOrder(order);
		orderEntry.setProduct(product);
		orderEntry.setUnit(unit);
		orderEntry.setQuantity(Long.valueOf(1L));

		modelService.save(orderEntry);

		orderEntry.setQuantity(Long.valueOf(2L));
		modelService.save(orderEntry);

		final Date secondDate = getDate(2012, 10, 2);
		order.setDate(secondDate);

		modelService.save(order);

		final AuditReportConfig testConfig = loadConfigFromFile("audit.test/order-audit.xml");
		auditViewService
				.getViewOn(
						TypeAuditReportConfig.builder().withConfig(testConfig).withRootTypePk(order.getPk()).withFullReport().build())
				.collect(toList());

		// FIXME entries are displayed
		System.out.println("* * *");
	}



	@Test
	public void shouldAuditOrdersAndEntries()
	{
		final UserModel user = modelService.create(UserModel.class);
		user.setUid(UUID.randomUUID().toString());
		modelService.save(user);


		final CurrencyModel euroCurrency = modelService.create(CurrencyModel.class);
		euroCurrency.setIsocode("EUR");
		euroCurrency.setSymbol("E");

		final CurrencyModel plnCurrency = modelService.create(CurrencyModel.class);
		plnCurrency.setIsocode("PLN");
		plnCurrency.setSymbol("zl");

		final UnitModel unit = modelService.create(UnitModel.class);
		unit.setCode(UUID.randomUUID().toString());
		unit.setUnitType("pieces");

		modelService.saveAll(euroCurrency, plnCurrency, unit);



		final OrderModel order = modelService.create(OrderModel.class);
		order.setCode(UUID.randomUUID().toString());
		order.setUser(user);
		final Date firstDate = getDate(2012, 10, 1);
		order.setDate(firstDate);
		order.setCurrency(euroCurrency);

		modelService.save(order);


		final OrderEntryModel orderEntry = modelService.create(OrderEntryModel.class);
		orderEntry.setOrder(order);
		orderEntry.setProduct(product);
		orderEntry.setUnit(unit);
		orderEntry.setQuantity(Long.valueOf(1L));

		modelService.save(orderEntry);

		orderEntry.setQuantity(Long.valueOf(2L));
		modelService.save(orderEntry);

		final Date secondDate = getDate(2012, 10, 2);
		order.setDate(secondDate);

		modelService.save(order);

		final AuditReportConfig testConfig = loadConfigFromFile("audit.test/user-order-audit.xml");
		auditViewService
				.getViewOn(
						TypeAuditReportConfig.builder().withConfig(testConfig).withRootTypePk(user.getPk()).withFullReport().build())
				.collect(toList());

		// FIXME entries are not displayed
		System.out.println("* * *");
	}


	private Date getDate(final int year, final int month, final int dayOfMonth)
	{
		final LocalDate firstOrderDate = LocalDate.of(year, month, dayOfMonth);
		final Date firstDate = Date.from(firstOrderDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

		return firstDate;
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

		product = modelService.create(ProductModel.class);
		product.setCode(UUID.randomUUID().toString());

		product.setName(PRODUCT_NAME_EN_1, Locale.ENGLISH);
		product.setName(PRODUCT_NAME_DE_1, Locale.GERMAN);

		product.setCatalogVersion(catalogVersion);


		modelService.saveAll();
	}

}
