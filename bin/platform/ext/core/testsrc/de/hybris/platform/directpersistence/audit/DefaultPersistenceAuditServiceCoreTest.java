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

package de.hybris.platform.directpersistence.audit;

import static org.fest.assertions.Assertions.assertThat;

import de.hybris.platform.audit.AuditableTest;
import de.hybris.platform.audit.demo.AuditTestConfigManager;
import de.hybris.platform.catalog.model.AgreementModel;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.PK;
import de.hybris.platform.core.Registry;
import de.hybris.platform.directpersistence.audit.impl.DefaultPersistenceAuditService;
import de.hybris.platform.servicelayer.ServicelayerBaseTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.testframework.PropertyConfigSwitcher;
import de.hybris.platform.util.persistence.PersistenceUtils;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DefaultPersistenceAuditServiceCoreTest extends ServicelayerBaseTest implements AuditableTest
{
	private final String AGREEMENT_TYPE = "Agreement";

	@Resource
	private PersistenceAuditService persistenceAuditService;

	@Resource
	private ModelService modelService;

	private AuditTestConfigManager auditTestConfigManager;

	private final PropertyConfigSwitcher persistenceLegacyModeSwitch = new PropertyConfigSwitcher("persistence.legacy.mode");

	@Before
	public void enableAuditData()
	{
		auditTestConfigManager = new AuditTestConfigManager((DefaultPersistenceAuditService) persistenceAuditService);
		persistenceAuditService.clearAuditDataForType(AGREEMENT_TYPE);
		auditTestConfigManager.enableAuditingForTypes(AGREEMENT_TYPE);
		assumeAuditEnabled();
	}

	@After
	public void resetPersistence()
	{
		auditTestConfigManager.resetAuditConfiguration();
	}

	@Test
	public void shouldAuditChangesOnAgreementsJalo()
	{
		persistenceLegacyModeSwitch.switchToValue("true");

		assertThat(PersistenceUtils.isPersistenceLegacyModeEnabled()).isTrue();

		shouldAuditChangesOnAgreements();
	}

	@Test
	public void shouldAuditChangesOnAgreementsSld()
	{
		persistenceLegacyModeSwitch.switchToValue("false");

		assertThat(PersistenceUtils.isPersistenceLegacyModeEnabled()).isFalse();

		shouldAuditChangesOnAgreements();
	}

	private void shouldAuditChangesOnAgreements()
	{
		final CatalogVersionModel catalogVersion = createCatalogAndCatalogVersion();

		final AgreementModel agreement = createAgreement(catalogVersion);
		modelService.save(agreement);

		final PK agreementPk = agreement.getPk();

		agreement.setEnddate(getDate(2012, Month.DECEMBER, 12));
		modelService.save(agreement);

		agreement.getModifiedtime();

		modelService.remove(agreement);

		final List<AuditRecord> audits = persistenceAuditService.getAuditRecordsForType(AGREEMENT_TYPE);

		assertThat(audits).hasSize(2);

		final AuditRecord modificationAudit = audits.get(0);
		final AuditRecord deletionAudit = audits.get(1);

		assertThat(modificationAudit.getAuditType()).isEqualTo(AuditType.MODIFICATION);
		assertThat(modificationAudit.getPk()).isEqualTo(agreementPk);
		//		assertThat(modificationAudit.getTimestamp()).isEqualTo(modificationTime); - some miliseconds diffrences on both SLD and JALO - we need to check this
		assertThat(modificationAudit.getType()).isEqualTo(AGREEMENT_TYPE);
		assertThat(modificationAudit.getChangingUser())
				.isEqualTo(Registry.getCurrentTenant().getActiveSession().getUser().getUid());


		assertThat(deletionAudit.getAuditType()).isEqualTo(AuditType.DELETION);
		assertThat(deletionAudit.getPk()).isEqualTo(agreementPk);
		assertThat(deletionAudit.getType()).isEqualTo(AGREEMENT_TYPE);
		assertThat(deletionAudit.getChangingUser()).isEqualTo(Registry.getCurrentTenant().getActiveSession().getUser().getUid());
	}

	private AgreementModel createAgreement(final CatalogVersionModel catalogVersion)
	{
		final AgreementModel agreement = modelService.create(AgreementModel.class);
		agreement.setId(asUUID());
		agreement.setEnddate(getDate(2012, Month.DECEMBER, 1));
		agreement.setCatalogVersion(catalogVersion);
		return agreement;
	}


	private Date getDate(final int year, final Month month, final int dayOfMonth)
	{
		return Date.from(LocalDate.of(year, month, dayOfMonth).atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

	private CatalogVersionModel createCatalogAndCatalogVersion()
	{
		final CatalogModel defaultCatalog = modelService.create(CatalogModel.class);
		defaultCatalog.setId(asUUID());
		defaultCatalog.setDefaultCatalog(Boolean.TRUE);

		final CatalogVersionModel version1 = modelService.create(CatalogVersionModel.class);
		version1.setCatalog(defaultCatalog);
		version1.setVersion(asUUID());

		modelService.saveAll();
		return version1;
	}

	private static String asUUID()
	{
		return UUID.randomUUID().toString();
	}

}
