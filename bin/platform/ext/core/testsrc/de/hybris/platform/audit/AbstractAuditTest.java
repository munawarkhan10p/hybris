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
package de.hybris.platform.audit;

import de.hybris.platform.audit.internal.config.AtomicAttribute;
import de.hybris.platform.audit.internal.config.AuditReportConfig;
import de.hybris.platform.audit.internal.config.ReferenceAttribute;
import de.hybris.platform.audit.internal.config.ResolvesBy;
import de.hybris.platform.audit.internal.config.Type;
import de.hybris.platform.audit.internal.config.VirtualAttribute;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.directpersistence.audit.impl.DefaultPersistenceAuditService;
import de.hybris.platform.servicelayer.ServicelayerTransactionalBaseTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.testframework.PropertyConfigSwitcher;
import de.hybris.platform.testframework.seed.TestDataCreator;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;


public abstract class AbstractAuditTest extends ServicelayerTransactionalBaseTest implements AuditableTest
{
	@Resource
	protected ModelService modelService;
	@Resource
	protected UserService userService;
	@Resource
	protected DefaultPersistenceAuditService persistenceAuditService;
	protected AuditReportConfig testAuditReportConfig;
	protected UserModel user1;
	protected TitleModel title1, title2;
	protected AddressModel address1, address2, address3;
	protected TestDataCreator creator;
	private final List<PropertyConfigSwitcher> auditedTypes = new ArrayList<>();

	@Before
	public void setUp() throws Exception
	{
		enableAuditingForTypes("User", "Address", "Title");
		createTestData();
		testAuditReportConfig = createTestConfig();
	}

	@After
	public void cleanup()
	{
		resetAuditConfiguration();
	}

	private AuditReportConfig createTestConfig()
	{

		final Type title = Type.builder().withCode("Title") //
				.withAtomicAttributes( //
						AtomicAttribute.builder().withQualifier("code").build(), //
						AtomicAttribute.builder().withQualifier("name").build() //
				) //
				.build();

		final Type address = Type.builder() //
				.withCode("Address") //
				.withAtomicAttributes( //
						AtomicAttribute.builder().withQualifier("town").build(), //
						AtomicAttribute.builder().withQualifier("streetname").build() //
				) //
				.withReferenceAttributes( //
						ReferenceAttribute.builder().withQualifier("title").withType(title).withResolvesBy( //
								ResolvesBy.builder().withResolverBeanId("typeReferencesResolver").withExpression("title").build()).build() //
				).build();

		final Type user = Type.builder().withCode("User") //
				.withAtomicAttributes( //
						AtomicAttribute.builder().withQualifier("uid").build(), //
						AtomicAttribute.builder().withQualifier("name").build() //
				) //
				.withReferenceAttributes( //
						ReferenceAttribute.builder().withQualifier("defaultPaymentAddress").withType(address).withResolvesBy( //
								ResolvesBy.builder().withResolverBeanId("typeReferencesResolver").withExpression("defaultPaymentAddress")
										.build() //
						).build(), //
						ReferenceAttribute.builder().withQualifier("defaultShipmentAddress").withType(address).withResolvesBy( //
								ResolvesBy.builder().withResolverBeanId("typeReferencesResolver").withExpression("defaultShipmentAddress")
										.build() //
						).build()).withVirtualAttributes( //
								VirtualAttribute.builder().withExpression("ownedAddresses").withMany(Boolean.TRUE).withType(address)
										.withResolvesBy( //
												ResolvesBy.builder().withExpression("owner").withResolverBeanId("virtualReferencesResolver")
														.build() //
										).build()).build();



		final AuditReportConfig reportConfig = AuditReportConfig.builder() //
				.withGivenRootType(user) //
				.withName("testConfig") //
				.withAuditRecordsProvider("auditRecordsProvider").withTypes(user, address, title) //
				.build();

		return reportConfig;

	}

	private void createTestData() throws Exception
	{
		creator = new TestDataCreator(modelService);

		user1 = creator.createUser("adam", "Adam");
		waitNumSeconds(1);
		title1 = creator.createTitle("Mr", "Mister");
		waitNumSeconds(1);
		title2 = creator.createTitle("Engr.", "Engineer");
		waitNumSeconds(1);
		address1 = creator.createAddress("Sosnowiec", "Moniuszki", user1);
		waitNumSeconds(1);
		address2 = creator.createAddress("Tokyo", "Konnichiwa", user1);
		waitNumSeconds(1);
		address3 = creator.createAddress("New York", "55th St.", user1);
		waitNumSeconds(1);
		address1.setTitle(title1);
		modelService.save(address1);
		waitNumSeconds(1);
		address2.setTitle(title2);
		modelService.save(address2);
		waitNumSeconds(1);
		address3.setTitle(title1);
		modelService.save(address3);
		waitNumSeconds(1);
		user1.setDefaultPaymentAddress(address1);
		user1.setDefaultShipmentAddress(address3);
		modelService.save(user1);
		waitNumSeconds(1);
	}

	protected void saveModelAndWait(final ItemModel model) throws Exception
	{
		modelService.save(model);
		waitNumSeconds(1);
	}

	protected void waitNumSeconds(final int seconds) throws Exception
	{
		Thread.sleep(Duration.ofSeconds(seconds).toMillis());
	}

	private void enableAuditingForTypes(final String... types)
	{
		for (final String type : types)
		{
			final PropertyConfigSwitcher switcher = new PropertyConfigSwitcher("audit." + type + ".enabled");
			switcher.switchToValue("true");
			auditedTypes.add(switcher);
		}

		persistenceAuditService.refreshConfiguredAuditTypes();
	}

	private void resetAuditConfiguration()
	{
		for (final PropertyConfigSwitcher switcher : auditedTypes)
		{
			switcher.switchBackToDefault();
		}
	}
}
