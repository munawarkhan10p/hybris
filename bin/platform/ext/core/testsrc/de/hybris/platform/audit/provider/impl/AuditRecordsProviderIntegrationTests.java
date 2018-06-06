/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2017 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.audit.provider.impl;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.audit.AuditTestHelper;
import de.hybris.platform.audit.AuditableTest;
import de.hybris.platform.audit.TypeAuditReportConfig;
import de.hybris.platform.audit.internal.config.AuditReportConfig;
import de.hybris.platform.audit.provider.AuditRecordsProvider;
import de.hybris.platform.audit.view.AuditViewService;
import de.hybris.platform.audit.view.impl.ReportView;
import de.hybris.platform.core.PK;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.directpersistence.audit.AuditRecord;
import de.hybris.platform.directpersistence.audit.AuditType;
import de.hybris.platform.directpersistence.audit.PersistenceAuditService;
import de.hybris.platform.directpersistence.audit.impl.DefaultPersistenceAuditService;
import de.hybris.platform.servicelayer.ServicelayerTransactionalBaseTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.testframework.PropertyConfigSwitcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class AuditRecordsProviderIntegrationTests extends ServicelayerTransactionalBaseTest implements AuditableTest
{
	private final PropertyConfigSwitcher persistenceLegacyModeSwitch = new PropertyConfigSwitcher("persistence.legacy.mode");

	@Resource
	protected ModelService modelService;

	@Resource
	protected UserService userService;

	@Resource
	private PersistenceAuditService persistenceAuditService;

	@Resource
	private AuditRecordsProvider auditRecordsProvider;

	@Resource
	private AuditViewService auditViewService;

	AuditTestHelper helper = new AuditTestHelper();

	@Before
	public void setUp() throws Exception
	{
		assumeAuditEnabled();
		helper.setModelService(modelService);
		helper.setPersistenceAuditService((DefaultPersistenceAuditService) persistenceAuditService);
		helper.setUserService(userService);

		persistenceLegacyModeSwitch.switchToValue("false");
	}

	@After
	public void cleanup()
	{
		helper.resetAuditConfiguration();
		persistenceLegacyModeSwitch.switchBackToDefault();
	}

	@Test
	public void shouldReturnAuditRecordsForConfig() throws Exception
	{
		// given
		final AuditReportConfig testAuditReportConfig = helper.createTestConfigForIntegrationTest();
		final UserModel user = helper.prepareTestDataForIntegrationTest();
		final PK userPk = user.getPk();
		final TypeAuditReportConfig config = TypeAuditReportConfig.builder().withConfig(testAuditReportConfig)
				.withRootTypePk(userPk).build();

		// when
		final List<AuditRecord> records = auditRecordsProvider.getRecords(config).collect(toList());

		assertNumberOfAvailableAuditRecords();

		//TODO; some PrincipalGroupRelation data should be present..at least used to be present..maybe it was created by some other test..verify it
		assertThat(records).isNotNull().hasSize(8);

		assertThat(records.get(0).getType()).isEqualTo("Title");
		assertThat(records.get(0).getAttribute("code")).isEqualTo("Mr");
		assertThat(records.get(0).getAuditType()).isEqualTo(AuditType.CURRENT);

		assertThat(records.get(1).getType()).isEqualTo("Address");
		assertThat(records.get(1).getAttribute("town")).isEqualTo("Sosnowiec");
		assertThat(records.get(1).getAuditType()).isEqualTo(AuditType.MODIFICATION);

		assertThat(records.get(2).getType()).isEqualTo("Address");
		assertThat(records.get(2).getAttribute("town")).isEqualTo("New York");
		assertThat(records.get(2).getAuditType()).isEqualTo(AuditType.CURRENT);

		assertThat(records.get(3).getType()).isEqualTo("Media");
		assertThat(records.get(3).getAttribute("code")).isEqualTo("nice profile picture of me");
		assertThat(records.get(3).getAuditType()).isEqualTo(AuditType.MODIFICATION);

		assertThat(records.get(4).getType()).isEqualTo("User");
		assertThat(records.get(4).getAttribute("name")).isEqualTo("Adam");
		assertThat(records.get(4).getAuditType()).isEqualTo(AuditType.MODIFICATION);

		assertThat(records.get(5).getType()).isEqualTo("User");
		assertThat(records.get(5).getAttribute("name")).isEqualTo("SomeBetterNameForUser");
		assertThat(records.get(5).getAuditType()).isEqualTo(AuditType.CURRENT);

		assertThat(records.get(6).getType()).isEqualTo("Address");
		assertThat(records.get(6).getAttribute("town")).isEqualTo("Sosnowiec");
		assertThat(records.get(6).getAttribute("streetname")).isEqualTo("Chopina");
		assertThat(records.get(6).getAuditType()).isEqualTo(AuditType.CURRENT);

		assertThat(records.get(7).getType()).isEqualTo("Media");
		assertThat(records.get(7).getAttribute("code")).isEqualTo("ugly picture of me");
		assertThat(records.get(7).getAuditType()).isEqualTo(AuditType.CURRENT);
	}


	@Test
	public void shouldReturnAuditRecordsForConfigWithVirtualAttribute() throws Exception
	{
		// given
		final AuditReportConfig testAuditReportConfig = helper.createTestConfigWithVirtualAttributeForIntegrationTest();
		final UserModel user = helper.prepareTestDataForIntegrationTest();
		final PK userPk = user.getPk();
		final TypeAuditReportConfig config = TypeAuditReportConfig.builder().withConfig(testAuditReportConfig)
				.withRootTypePk(userPk).build();

		// when
		final List<AuditRecord> records = auditRecordsProvider.getRecords(config).collect(toList());

		assertNumberOfAvailableAuditRecords();

		assertThat(records).isNotNull().hasSize(12);

		assertThat(records.get(0).getType()).isEqualTo("Title");
		assertThat(records.get(0).getAttribute("code")).isEqualTo("Mr");
		assertThat(records.get(0).getAuditType()).isEqualTo(AuditType.CURRENT);

		assertThat(records.get(1).getType()).isEqualTo("Title");
		assertThat(records.get(1).getAttribute("code")).isEqualTo("Engr.");
		assertThat(records.get(1).getAuditType()).isEqualTo(AuditType.CURRENT);

		assertThat(records.get(2).getType()).isEqualTo("Address");
		assertThat(records.get(2).getAttribute("town")).isEqualTo("Sosnowiec");
		assertThat(records.get(2).getAuditType()).isEqualTo(AuditType.MODIFICATION);

		assertThat(records.get(3).getType()).isEqualTo("Address");
		assertThat(records.get(3).getAttribute("town")).isEqualTo("Tokyo");
		assertThat(records.get(3).getAuditType()).isEqualTo(AuditType.CURRENT);

		assertThat(records.get(4).getType()).isEqualTo("Address");
		assertThat(records.get(4).getAttribute("town")).isEqualTo("New York");
		assertThat(records.get(3).getAuditType()).isEqualTo(AuditType.CURRENT);

		assertThat(records.get(5).getType()).isEqualTo("Media");
		assertThat(records.get(5).getAttribute("code")).isEqualTo("nice profile picture of me");
		assertThat(records.get(5).getAuditType()).isEqualTo(AuditType.MODIFICATION);

		assertThat(records.get(6).getType()).isEqualTo("User");
		assertThat(records.get(6).getAttribute("name")).isEqualTo("Adam");
		assertThat(records.get(6).getAuditType()).isEqualTo(AuditType.MODIFICATION);

		assertThat(records.get(7).getType()).isEqualTo("User");
		assertThat(records.get(7).getAttribute("name")).isEqualTo("SomeBetterNameForUser");
		assertThat(records.get(7).getAuditType()).isEqualTo(AuditType.CURRENT);

		assertThat(records.get(8).getType()).isEqualTo("Address");
		assertThat(records.get(8).getAttribute("town")).isEqualTo("Sosnowiec");
		assertThat(records.get(8).getAttribute("streetname")).isEqualTo("Chopina");
		assertThat(records.get(8).getAuditType()).isEqualTo(AuditType.CURRENT);

		assertThat(records.get(9).getType()).isEqualTo("Media");
		assertThat(records.get(9).getAttribute("code")).isEqualTo("ugly picture of me");
		assertThat(records.get(9).getAuditType()).isEqualTo(AuditType.CURRENT);

		assertThat(records.get(10).getType()).isEqualTo("Title");
		assertThat(records.get(10).getAttribute("code")).isEqualTo("Sir");
		assertThat(records.get(10).getAuditType()).isEqualTo(AuditType.DELETION);

		assertThat(records.get(11).getType()).isEqualTo("Address");
		assertThat(records.get(11).getAttribute("town")).isEqualTo("Krakow");
		assertThat(records.get(11).getAuditType()).isEqualTo(AuditType.DELETION);
	}

	private void assertNumberOfAvailableAuditRecords()
	{
		//assert audit records available to be sure it is all fine
		assertThat(persistenceAuditService.getAuditRecordsForType("User")).isNotNull().hasSize(1);

		final List<AuditRecord> addressAuditRecords = persistenceAuditService.getAuditRecordsForType("Address");
		assertThat(addressAuditRecords).isNotNull().hasSize(3);
		assertThat(addressAuditRecords.get(0).getAttribute("town")).isEqualTo("Sosnowiec");
		assertThat(addressAuditRecords.get(1).getAttribute("town")).isEqualTo("Warsaw");
		assertThat(addressAuditRecords.get(2).getAttribute("town")).isEqualTo("Krakow");

		assertThat(persistenceAuditService.getAuditRecordsForType("Media")).isNotNull().hasSize(1);

		final List<AuditRecord> titleAuditRecords = persistenceAuditService.getAuditRecordsForType("Title");
		assertThat(titleAuditRecords).isNotNull().hasSize(1);
		assertThat(titleAuditRecords.get(0).getAttribute("code")).isEqualTo("Sir");
		assertThat(titleAuditRecords.get(0).getAuditType()).isEqualTo(AuditType.DELETION);
	}

	@Test
	public void shouldProduceReportViewForConfig() throws Exception
	{
		final AuditReportConfig testAuditReportConfig = helper.createTestConfigForIntegrationTest();
		final UserModel user = helper.prepareTestDataForIntegrationTest();
		final List<ReportView> reportView = auditViewService.getViewOn(TypeAuditReportConfig.builder()
				.withConfig(testAuditReportConfig).withRootTypePk(user.getPk()).withFullReport().build()).collect(toList());

		final TypeAuditReportConfig config = TypeAuditReportConfig.builder().withConfig(testAuditReportConfig)
				.withRootTypePk(user.getPk()).build();
		final List<AuditRecord> records = auditRecordsProvider.getRecords(config).collect(toList());

		assertThat(reportView.size()).isEqualTo(4);

		final ReportView reportView0 = reportView.get(0);
		final Map<String, Object> reportViewPayload0 = reportView0.getPayload();
		final Map<String, Object> reportUser0 = (Map<String, Object>) reportViewPayload0.get("User");
		assertThat(reportUser0.get("name")).isEqualTo("Adam");
		assertThat(reportView0.getTimestamp()).isEqualTo(records.get(4).getTimestamp());

		final ReportView reportView1 = reportView.get(1);
		final Map<String, Object> reportViewPayload1 = reportView1.getPayload();
		final Map<String, Object> reportUser1 = (Map<String, Object>) reportViewPayload1.get("User");
		assertThat(reportUser1.get("name")).isEqualTo("SomeBetterNameForUser");
		final Map<String, Object> reportPaymentAddress1 = (Map<String, Object>) reportUser1.get("defaultpaymentaddress");
		assertThat(reportPaymentAddress1.get("streetname")).isEqualTo("Moniuszki");
		assertThat(reportView1.getTimestamp()).isEqualTo(records.get(5).getTimestamp());

		final ReportView reportView2 = reportView.get(2);
		final Map<String, Object> reportViewPayload2 = reportView2.getPayload();
		final Map<String, Object> reportUser2 = (Map<String, Object>) reportViewPayload2.get("User");
		final Map<String, Object> reportPaymentAddress2 = (Map<String, Object>) reportUser2.get("defaultpaymentaddress");
		assertThat(reportPaymentAddress2.get("streetname")).isEqualTo("Chopina");
		assertThat(reportView2.getTimestamp()).isEqualTo(records.get(6).getTimestamp());

		final ReportView reportView3 = reportView.get(3);
		final Map<String, Object> reportViewPayload3 = reportView3.getPayload();
		final Map<String, Object> reportUser3 = (Map<String, Object>) reportViewPayload3.get("User");
		final Map<String, Object> reportMedia3 = (Map<String, Object>) reportUser3.get("profilepicture");
		assertThat(reportMedia3.get("code")).isEqualTo("ugly picture of me");
		assertThat(reportView3.getTimestamp()).isEqualTo(records.get(7).getTimestamp());
	}

	@Test
	public void shouldProduceReportViewForConfigWithVirtualAttribute() throws Exception
	{
		final AuditReportConfig testAuditReportConfig = helper.createTestConfigWithVirtualAttributeForIntegrationTest();
		final UserModel user = helper.prepareTestDataForIntegrationTest();
		final List<ReportView> reportView = auditViewService.getViewOn(TypeAuditReportConfig.builder()
				.withConfig(testAuditReportConfig).withRootTypePk(user.getPk()).withFullReport().build()).collect(toList());

		final TypeAuditReportConfig config = TypeAuditReportConfig.builder().withConfig(testAuditReportConfig)
				.withRootTypePk(user.getPk()).build();
		final List<AuditRecord> records = auditRecordsProvider.getRecords(config).collect(toList());

		assertThat(reportView.size()).isEqualTo(6);

		final ReportView reportView0 = reportView.get(0);
		final Map<String, Object> reportViewPayload0 = reportView0.getPayload();
		final Map<String, Object> reportUser0 = (Map<String, Object>) reportViewPayload0.get("User");
		assertThat(reportUser0.get("name")).isEqualTo("Adam");
		assertThat(reportView0.getTimestamp()).isEqualTo(records.get(6).getTimestamp());

		final ReportView reportView1 = reportView.get(1);
		final Map<String, Object> reportViewPayload1 = reportView1.getPayload();
		final Map<String, Object> reportUser1 = (Map<String, Object>) reportViewPayload1.get("User");
		assertThat(reportUser1.get("name")).isEqualTo("SomeBetterNameForUser");
		final ArrayList addresses1 = (ArrayList) reportUser1.get("ownedaddresses");
		assertThat(addresses1.size()).isEqualTo(3);
		assertContainsAddress(addresses1, "Moniuszki");
		assertThat(reportView1.getTimestamp()).isEqualTo(records.get(7).getTimestamp());

		final ReportView reportView2 = reportView.get(2);
		final Map<String, Object> reportViewPayload2 = reportView2.getPayload();
		final Map<String, Object> reportUser2 = (Map<String, Object>) reportViewPayload2.get("User");
		final ArrayList addresses2 = (ArrayList) reportUser2.get("ownedaddresses");
		assertThat(addresses2.size()).isEqualTo(3);
		assertContainsAddress(addresses2, "Chopina");
		assertThat(reportView2.getTimestamp()).isEqualTo(records.get(8).getTimestamp());

		final ReportView reportView3 = reportView.get(3);
		final Map<String, Object> reportViewPayload3 = reportView3.getPayload();
		final Map<String, Object> reportUser3 = (Map<String, Object>) reportViewPayload3.get("User");
		final Map<String, Object> reportMedia3 = (Map<String, Object>) reportUser3.get("profilepicture");
		assertThat(reportMedia3.get("code")).isEqualTo("ugly picture of me");
		assertThat(reportView3.getTimestamp()).isEqualTo(records.get(9).getTimestamp());

		final ReportView reportView4 = reportView.get(4);
		final Map<String, Object> reportViewPayload4 = reportView4.getPayload();
		final Map<String, Object> reportUser4 = (Map<String, Object>) reportViewPayload4.get("User");
		final ArrayList addresses4 = (ArrayList) reportUser4.get("ownedaddresses");
		assertThat(addresses4.size()).isEqualTo(4);
		assertContainsAddress(addresses4, "Rynek");
		assertThat(reportView4.getTimestamp()).isEqualTo(records.get(11).getTimestamp());

		final ReportView reportView5 = reportView.get(5);
		final Map<String, Object> reportViewPayload5 = reportView5.getPayload();
		final Map<String, Object> reportUser5 = (Map<String, Object>) reportViewPayload5.get("User");
		final ArrayList addresses5 = (ArrayList) reportUser5.get("ownedaddresses");
		assertThat(addresses5.size()).isEqualTo(3);
		assertContainsAddress(addresses5, "Chopina");
		assertThat(reportView5.getTimestamp()).isEqualTo(records.get(11).getCurrentTimestamp());
	}

	public void assertContainsAddress(final ArrayList addresses, final String streetname)
	{
		boolean contains = false;
		for (final Object address : addresses)
		{
			if (((Map<String, Object>) address).get("streetname").equals(streetname))
			{
				contains = true;
				break;
			}
		}

		assertThat(contains).isTrue();
	}
}
