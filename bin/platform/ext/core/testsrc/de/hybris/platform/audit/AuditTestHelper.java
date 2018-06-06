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
import de.hybris.platform.catalog.model.CatalogUnawareMediaModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.directpersistence.audit.impl.DefaultPersistenceAuditService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.testframework.PropertyConfigSwitcher;
import de.hybris.platform.testframework.seed.TestDataCreator;

import java.util.ArrayList;
import java.util.List;


public class AuditTestHelper
{
	protected ModelService modelService;
	protected UserService userService;

	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	public void setPersistenceAuditService(final DefaultPersistenceAuditService persistenceAuditService)
	{
		this.persistenceAuditService = persistenceAuditService;
	}

	protected DefaultPersistenceAuditService persistenceAuditService;

	private final List<PropertyConfigSwitcher> auditedTypes = new ArrayList<>();

	public UserModel prepareTestDataForIntegrationTest() throws InterruptedException
	{
		final TestDataCreator creator = new TestDataCreator(modelService);

		final UserModel user = creator.createUser("adam", "Adam");
		final TitleModel title1 = creator.createTitle("Mr", "Mister");
		final TitleModel title2 = creator.createTitle("Engr.", "Engineer");

		final AddressModel address1 = creator.createAddress("Sosnowiec", "Moniuszki", user);
		final AddressModel address2 = creator.createAddress("Tokyo", "Konichiwa", user);
		final AddressModel address3 = creator.createAddress("New York", "55th St.", user);

		address1.setTitle(title1);
		address2.setTitle(title2);
		address3.setTitle(title1);

		user.setDefaultPaymentAddress(address1);
		user.setDefaultShipmentAddress(address3);

		final MediaModel testMedia = modelService.create(CatalogUnawareMediaModel.class);
		testMedia.setCode("nice profile picture of me");
		user.setProfilePicture(testMedia);

		modelService.save(title1);
		modelService.save(title2);
		modelService.save(address1);
		modelService.save(address2);
		modelService.save(address3);
		modelService.save(testMedia);
		modelService.save(user);

		//enable auditing
		enableAuditingForTypes("User", "Address", "CatalogUnawareMedia", "Title");

		//create historical data
		persistenceAuditService.clearAuditDataForType("User");
		persistenceAuditService.clearAuditDataForType("Address");
		persistenceAuditService.clearAuditDataForType("CatalogUnawareMedia");
		persistenceAuditService.clearAuditDataForType("Title");

		user.setName("SomeBetterNameForUser");
		modelService.save(user);

		address1.setStreetname("Chopina");
		modelService.save(address1);

		testMedia.setCode("ugly picture of me");
		modelService.save(testMedia);

		// some additional not-referenced address to test filtering
		final AddressModel address4 = creator.createAddress("Warsaw", "Krakowskie Przedmiescie",
				creator.createUser("tom", "Tommy"));
		address4.setStreetnumber("1");
		modelService.save(address4);

		//additional address which was referenced in the past
		final TitleModel historicalTitle = creator.createTitle("Sir", "Sir");

		final AddressModel historicalAddress = modelService.create(AddressModel.class);
		historicalAddress.setTitle(historicalTitle);
		historicalAddress.setTown("Krakow");
		historicalAddress.setStreetname("Rynek");
		historicalAddress.setOwner(user);
		modelService.save(historicalAddress);

		modelService.remove(historicalTitle);
		modelService.remove(historicalAddress);
		return user;
	}

	public AuditReportConfig createTestConfigForIntegrationTest()
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
								ResolvesBy.builder().withResolverBeanId("typeReferencesResolver").withExpression("title").build() //
						).build() //
				).build();

		final Type media = Type.builder().withCode("Media") //
				.withAtomicAttributes( //
						AtomicAttribute.builder().withQualifier("code").build() //
				) //
				.build();

		// this is handling of PrincipalGroupRelation and seems to be working fine
		final Type principalGroup = Type.builder().withCode("PrincipalGroup").build();

		final Type user = Type.builder().withCode("User") //
				.withAtomicAttributes( //
						AtomicAttribute.builder().withQualifier("uid").build(), //
						AtomicAttribute.builder().withQualifier("name").build() //
				) //
				.withReferenceAttributes( //
						ReferenceAttribute.builder().withQualifier("defaultPaymentAddress").withType(address).withResolvesBy( //
								ResolvesBy.builder().withResolverBeanId("typeReferencesResolver").withExpression("defaultPaymentAddress")
										.build())
								.build(), //
						ReferenceAttribute.builder().withQualifier("defaultShipmentAddress").withType(address).withResolvesBy( //
								ResolvesBy.builder().withResolverBeanId("typeReferencesResolver").withExpression("defaultShipmentAddress")
										.build())
								.build(), //
						ReferenceAttribute.builder().withQualifier("groups").withType(principalGroup).withResolvesBy( //
								ResolvesBy.builder().withResolverBeanId("typeReferencesResolver").withExpression("groups").build())
								.build(), //
						ReferenceAttribute.builder().withQualifier("profilepicture").withType(media).withResolvesBy( //
								ResolvesBy.builder().withResolverBeanId("typeReferencesResolver").withExpression("profilepicture")
										.build())
								.build() //
				) //
				.build();

		final AuditReportConfig reportConfig = AuditReportConfig.builder() //
				.withGivenRootType(user) //
				.withName("testConfig") //
				.withAuditRecordsProvider("auditRecordsProvider").withTypes(user, address, title, media, principalGroup) //
				.build();

		return reportConfig;
	}

	public AuditReportConfig createTestConfigWithVirtualAttributeForIntegrationTest()
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
								ResolvesBy.builder().withResolverBeanId("typeReferencesResolver").withExpression("title").build() //
						).build() //
				).build();

		final Type media = Type.builder().withCode("Media") //
				.withAtomicAttributes( //
						AtomicAttribute.builder().withQualifier("code").build() //
				) //
				.build();

		// this is handling of PrincipalGroupRelation and seems to be working fine
		final Type principalGroup = Type.builder().withCode("PrincipalGroup").build();

		final Type user = Type.builder().withCode("User") //
				.withAtomicAttributes( //
						AtomicAttribute.builder().withQualifier("uid").build(), //
						AtomicAttribute.builder().withQualifier("name").build() //
				) //
				.withReferenceAttributes( //
						ReferenceAttribute.builder().withQualifier("groups").withType(principalGroup).withResolvesBy( //
								ResolvesBy.builder().withResolverBeanId("typeReferencesResolver").withExpression("groups").build())
								.build(), //
						ReferenceAttribute.builder().withQualifier("profilepicture").withType(media).withResolvesBy( //
								ResolvesBy.builder().withResolverBeanId("typeReferencesResolver").withExpression("profilepicture")
										.build())
								.build() //
				) //
				.withVirtualAttributes( //
						VirtualAttribute.builder().withExpression("ownedAddresses").withMany(Boolean.TRUE).withType(address)
								.withResolvesBy( //
										ResolvesBy.builder().withExpression("owner").withResolverBeanId("virtualReferencesResolver").build() //
								).build()).build();

		final AuditReportConfig reportConfig = AuditReportConfig.builder() //
				.withGivenRootType(user) //
				.withName("testConfig") //
				.withAuditRecordsProvider("auditRecordsProvider").withTypes(user, address, title, media, principalGroup) //
				.build();

		return reportConfig;

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

	public void resetAuditConfiguration()
	{
		for (final PropertyConfigSwitcher switcher : auditedTypes)
		{
			switcher.switchBackToDefault();
		}
	}
}
