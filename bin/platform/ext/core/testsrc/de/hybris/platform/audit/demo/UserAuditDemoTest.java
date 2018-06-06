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
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.RegionModel;
import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.directpersistence.audit.AuditRecord;
import de.hybris.platform.directpersistence.audit.impl.DefaultPersistenceAuditService;
import de.hybris.platform.servicelayer.ServicelayerTransactionalBaseTest;
import de.hybris.platform.servicelayer.exceptions.SystemException;
import de.hybris.platform.servicelayer.model.ModelService;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class UserAuditDemoTest extends ServicelayerTransactionalBaseTest implements AuditableTest
{
	public static final String NAME = "name";
	public static final String APPARTMENT = "appartment";
	public static final String USER = "User";
	public static final String OWNED_ADDRESSES = "owned addresses";
	public static final String DESCRIPTION = "description";
	public static final String CUSTOMER_ID = "customerID";
	public static final String LOGIN_DISABLED = "loginDisabled";
	public static final String HMC_LOGIN_DISABLED = "hmcLoginDisabled";
	public static final String ENCODED_PASSWORD = "encodedPassword";
	public static final String PASSWORD_QUESTION = "passwordQuestion";
	public static final String PASSWORD_ANSWER = "passwordAnswer";
	public static final String UID = "uid";

	public static final String MGR = "mgr";
	public static final String SIR = "sir";
	public static final String MADAME = "madame";
	public static final String PHD = "phd";
	public static final String GMBH = "gmbh";

	@Resource
	protected DefaultPersistenceAuditService persistenceAuditService;
	@Resource
	private ModelService modelService;
	@Resource
	private AuditConfigService auditConfigService;
	@Resource
	private AuditViewService auditViewService;

	private AuditTestConfigManager auditTestConfigManager;

	@Before
	public void setUp() throws Exception
	{
		auditTestConfigManager = new AuditTestConfigManager(persistenceAuditService);
		assumeAuditEnabled();
		auditTestConfigManager.enableAuditingForTypes(USER, "Title", "Address", "PrincipalGroup", "Country", "Region");
		persistenceAuditService.clearAuditDataForType(USER);
		persistenceAuditService.clearAuditDataForType("Title");
		persistenceAuditService.clearAuditDataForType("Address");
		persistenceAuditService.clearAuditDataForType("Country");
		persistenceAuditService.clearAuditDataForType("Region");
	}

	@After
	public void cleanup()
	{
		auditTestConfigManager.resetAuditConfiguration();
	}

	@Test
	public void shouldAuditE2EUserData()
	{
		final UserModel u2 = modelService.create(UserModel.class);
		u2.setUid(UUID.randomUUID().toString());
		u2.setName("Name");
		u2.setDescription("My user description");
		modelService.save(u2);

		u2.setName("Thomas");
		modelService.save(u2);

		u2.setName("Jack");
		modelService.save(u2);


		final UserModel u = modelService.create(UserModel.class);
		u.setUid(UUID.randomUUID().toString());
		u.setName("u1name_1");
		u.setDescription("u1description_1");

		u.setLoginDisabled(false);
		u.setHmcLoginDisabled(Boolean.FALSE);

		modelService.save(u);

		u.setName("u1name_2");
		u.setPassword("u1password_2");
		u.setPasswordQuestion("u1passwordQuestion_2");
		u.setPasswordAnswer("u1passwordAnswer_2");
		u.setLoginDisabled(true);
		u.setHmcLoginDisabled(Boolean.TRUE);

		modelService.save(u);

		final UserModel u3 = modelService.create(UserModel.class);
		u3.setUid(UUID.randomUUID().toString());
		u3.setName("Jenny");
		u3.setDescription("Jenny Account");

		u.setName("u1name_3");
		u.setDescription("u1description_3");

		u2.setDescription("Description");
		u2.setName("Sherlock");

		modelService.saveAll(u3, u, u2);

		final List<AuditRecord> user = persistenceAuditService.getAuditRecordsForType(USER, u.getPk());
		assertThat(user.get(0).getAttribute(NAME)).isEqualTo("u1name_1");
		assertThat(user.get(1).getAttribute(NAME)).isEqualTo("u1name_2");

		final AuditReportConfig testConfig = loadConfigFromFile("audit.test/user-audit.xml");
		final List<ReportView> u1ReportView = auditViewService
				.getViewOn(TypeAuditReportConfig.builder().withConfig(testConfig).withRootTypePk(u.getPk()).withFullReport().build())
				.collect(toList());

		final ReportView reportView = u1ReportView.get(0);
		final Map<String, Object> reportedUserData1 = (Map<String, Object>) reportView.getPayload().get(USER);
		assertThat(reportedUserData1).hasSize(10);

		assertThat(reportedUserData1.get(UID)).isEqualTo(u.getUid());
		assertThat(reportedUserData1.get(NAME)).isEqualTo("u1name_1");
		assertThat(reportedUserData1.get(DESCRIPTION)).isEqualTo("u1description_1");
		assertThat(reportedUserData1.get(LOGIN_DISABLED)).isEqualTo(Boolean.FALSE);
		assertThat(reportedUserData1.get(HMC_LOGIN_DISABLED)).isEqualTo(Boolean.FALSE);

		final ReportView reportView2 = u1ReportView.get(1);
		final Map<String, Object> reportedUserData2 = (Map<String, Object>) reportView2.getPayload().get(USER);
		assertThat(reportedUserData2).hasSize(10);

		assertThat(reportedUserData2.get(UID)).isEqualTo(u.getUid());
		assertThat(reportedUserData2.get(NAME)).isEqualTo("u1name_2");
		assertThat(reportedUserData2.get(DESCRIPTION)).isEqualTo("u1description_1");
		assertThat(reportedUserData2.get(ENCODED_PASSWORD)).isEqualTo("u1password_2");
		assertThat(reportedUserData2.get(PASSWORD_QUESTION)).isEqualTo("u1passwordQuestion_2");
		assertThat(reportedUserData2.get(PASSWORD_ANSWER)).isEqualTo("u1passwordAnswer_2");
		assertThat(reportedUserData2.get(LOGIN_DISABLED)).isEqualTo(Boolean.TRUE);
		assertThat(reportedUserData2.get(HMC_LOGIN_DISABLED)).isEqualTo(Boolean.TRUE);

		assertThat(reportedUserData2.get(DESCRIPTION)).isEqualTo("u1description_1");

		final ReportView reportView3 = u1ReportView.get(2);
		final Map<String, Object> reportedUserData3 = (Map<String, Object>) reportView3.getPayload().get(USER);
		assertThat(reportedUserData3).hasSize(10);

		assertThat(reportedUserData3.get(UID)).isEqualTo(u.getUid());
		assertThat(reportedUserData3.get(NAME)).isEqualTo("u1name_3");
		assertThat(reportedUserData3.get(DESCRIPTION)).isEqualTo("u1description_3");
		assertThat(reportedUserData3.get(ENCODED_PASSWORD)).isEqualTo("u1password_2");
		assertThat(reportedUserData3.get(PASSWORD_QUESTION)).isEqualTo("u1passwordQuestion_2");
		assertThat(reportedUserData3.get(PASSWORD_ANSWER)).isEqualTo("u1passwordAnswer_2");
		assertThat(reportedUserData3.get(LOGIN_DISABLED)).isEqualTo(Boolean.TRUE);
		assertThat(reportedUserData3.get(HMC_LOGIN_DISABLED)).isEqualTo(Boolean.TRUE);
	}

	@Test
	public void shouldAuditCustomerData()
	{
		final CustomerModel customer = modelService.create(CustomerModel.class);
		customer.setUid(UUID.randomUUID().toString());
		final String name_1 = "name_1";
		customer.setName(name_1);
		final String description_1 = "description_1";
		customer.setDescription(description_1);
		final String customerId_1 = "customerId_1";
		customer.setCustomerID(customerId_1);

		modelService.save(customer);

		final String name_2 = "name_2";
		customer.setName(name_2);
		final String description_2 = "description_2";
		customer.setDescription(description_2);
		final String customerId_2 = "customerId_2";
		customer.setCustomerID(customerId_2);
		modelService.save(customer);

		final List<AuditRecord> user = persistenceAuditService.getAuditRecordsForType(USER, customer.getPk());
		assertThat(user.get(0).getAttribute(NAME)).isEqualTo(name_1);

		final AuditReportConfig testConfig = loadConfigFromFile("audit.test/customer-audit.xml");
		final List<ReportView> u1ReportView = auditViewService.getViewOn(
				TypeAuditReportConfig.builder().withConfig(testConfig).withRootTypePk(customer.getPk()).withFullReport().build())
				.collect(toList());

		final Map<String, Object> reportedCustomerData1 = (Map<String, Object>) u1ReportView.get(0).getPayload().get(USER);
		final Map<String, Object> reportedCustomerData2 = (Map<String, Object>) u1ReportView.get(1).getPayload().get(USER);

		assertThat(reportedCustomerData1.get(NAME)).isEqualTo(name_1);
		assertThat(reportedCustomerData1.get(DESCRIPTION)).isEqualTo(description_1);
		assertThat(reportedCustomerData1.get(CUSTOMER_ID)).isEqualTo(customerId_1);

		assertThat(reportedCustomerData2.get(NAME)).isEqualTo(name_2);
		assertThat(reportedCustomerData2.get(DESCRIPTION)).isEqualTo(description_2);
		assertThat(reportedCustomerData2.get(CUSTOMER_ID)).isEqualTo(customerId_2);
	}


	@Test
	public void shouldAuditUserAndPrincipalGroup()
	{
		final UserModel u1 = modelService.create(UserModel.class);
		u1.setUid(UUID.randomUUID().toString());
		u1.setName("name1");
		u1.setDescription("description1");
		modelService.save(u1);

		final UserGroupModel userGroup1 = modelService.create(UserGroupModel.class);
		userGroup1.setUid(UUID.randomUUID().toString());
		userGroup1.setLocName("group1_1");
		modelService.save(userGroup1);

		final UserGroupModel userGroup2 = modelService.create(UserGroupModel.class);
		userGroup2.setUid(UUID.randomUUID().toString());
		userGroup2.setLocName("group2_1");
		modelService.save(userGroup2);

		final Set<PrincipalGroupModel> groups = new HashSet<>();
		groups.add(userGroup1);
		u1.setGroups(groups);

		modelService.save(u1);


		final Set<PrincipalGroupModel> groups2 = new HashSet<>();
		groups2.add(userGroup1);
		groups2.add(userGroup2);
		u1.setGroups(groups2);

		modelService.save(u1);

		userGroup1.setLocName("group1_2");
		modelService.save(userGroup1);

		userGroup1.setLocName("group1_3");
		modelService.save(userGroup1);

		u1.setName("name2");
		modelService.save(u1);

		// type code PrincipalGroup doesn't work!
		final AuditReportConfig testConfig = loadConfigFromFile("audit.test/user-groups-audit.xml");
		final List<ReportView> u1ReportView = auditViewService
				.getViewOn(TypeAuditReportConfig.builder().withConfig(testConfig).withRootTypePk(u1.getPk()).withFullReport().build())
				.collect(toList());


		final Map<String, Object> user1 = (Map) u1ReportView.get(0).getPayload().get(USER);

		assertThat(user1.get(NAME)).isEqualTo("name1");

		final Map<String, Object> user2 = (Map) u1ReportView.get(1).getPayload().get(USER);

		assertThat(user2.get(NAME)).isEqualTo("name1");
		assertThat(user2.get(NAME)).isEqualTo("name1");
	}

	@Test
	public void shouldAuditUserAndAddresses()
	{
		final UserModel u1 = modelService.create(UserModel.class);
		u1.setUid(UUID.randomUUID().toString());
		final String name1 = "name1";
		u1.setName(name1);
		final String description1 = "description1";
		u1.setDescription(description1);
		modelService.save(u1);

		final AddressModel address = modelService.create(AddressModel.class);
		address.setStreetname("street");
		address.setStreetnumber("1");
		final String apartment_1 = "apartment_1";
		address.setAppartment(apartment_1);
		address.setOwner(u1);

		modelService.save(address);

		final String apartment_2 = "apartment_2";
		address.setAppartment(apartment_2);
		modelService.save(address);


		final String apartment_3 = "apartment_3";
		address.setAppartment(apartment_3);
		modelService.save(address);

		final String name2 = "name2";
		u1.setName(name2);
		modelService.save(u1);

		final String apartment_4 = "apartment_4";
		address.setAppartment(apartment_4);
		modelService.save(address);

		final AuditReportConfig testConfig = loadConfigFromFile("audit.test/user-address-audit.xml");
		final List<ReportView> u1ReportView = auditViewService
				.getViewOn(TypeAuditReportConfig.builder().withConfig(testConfig).withRootTypePk(u1.getPk()).withFullReport().build())
				.collect(toList());

		assertThat(u1ReportView).hasSize(6);

		final Map<String, Object> userReport1 = (Map<String, Object>) u1ReportView.get(0).getPayload().get(USER);
		assertThat(userReport1.get(NAME)).isEqualTo(name1);
		assertThat(userReport1.containsKey(DESCRIPTION)).isFalse();
		assertThat((List) userReport1.get(OWNED_ADDRESSES)).hasSize(0);

		final Map<String, Object> userReport2 = (Map) u1ReportView.get(1).getPayload().get(USER);
		assertThat(userReport2.get(NAME)).isEqualTo(name1);
		assertThat((List) userReport2.get(OWNED_ADDRESSES)).hasSize(1);
		assertThat(((List<Map<String, Object>>) userReport2.get(OWNED_ADDRESSES)).get(0).get(APPARTMENT)).isEqualTo(apartment_1);

		final Map<String, Object> userReport3 = (Map) u1ReportView.get(2).getPayload().get(USER);
		assertThat(userReport3.get(NAME)).isEqualTo(name1);
		assertThat((List) userReport3.get(OWNED_ADDRESSES)).hasSize(1);
		assertThat(((List<Map<String, Object>>) userReport3.get(OWNED_ADDRESSES)).get(0).get(APPARTMENT)).isEqualTo(apartment_2);

		final Map<String, Object> userReport4 = (Map) u1ReportView.get(3).getPayload().get(USER);
		assertThat(userReport4.get(NAME)).isEqualTo(name1);
		assertThat((List) userReport4.get(OWNED_ADDRESSES)).hasSize(1);
		assertThat(((List<Map<String, Object>>) userReport4.get(OWNED_ADDRESSES)).get(0).get(APPARTMENT)).isEqualTo(apartment_3);

		final Map<String, Object> userReport5 = (Map) u1ReportView.get(4).getPayload().get(USER);
		assertThat(userReport5.get(NAME)).isEqualTo(name2);
		assertThat((List) userReport5.get(OWNED_ADDRESSES)).hasSize(1);
		assertThat(((List<Map<String, Object>>) userReport5.get(OWNED_ADDRESSES)).get(0).get(APPARTMENT)).isEqualTo(apartment_3);

		final Map<String, Object> userReport6 = (Map) u1ReportView.get(5).getPayload().get(USER);
		assertThat(userReport6.get(NAME)).isEqualTo(name2);
		assertThat((List) userReport6.get(OWNED_ADDRESSES)).hasSize(1);
		assertThat(((List<Map<String, Object>>) userReport6.get(OWNED_ADDRESSES)).get(0).get(APPARTMENT)).isEqualTo(apartment_4);
	}


	@Test
	public void shouldAuditUserAndAddressesAndTitles()
	{
		final TitleModel universityTitle = modelService.create(TitleModel.class);
		universityTitle.setCode(MGR);
		universityTitle.setName(MGR);

		final TitleModel personalTitle = modelService.create(TitleModel.class);

		personalTitle.setCode(SIR);
		personalTitle.setName(SIR);

		modelService.saveAll(universityTitle, personalTitle);

		personalTitle.setCode(MADAME);
		personalTitle.setName(MADAME);
		modelService.save(personalTitle);

		final UserModel u1 = modelService.create(UserModel.class);
		u1.setUid(UUID.randomUUID().toString());
		final String name1 = "name1";
		u1.setName(name1);
		modelService.save(u1);

		final AddressModel address = modelService.create(AddressModel.class);
		address.setStreetname("street");
		address.setStreetnumber("1");
		final String apartment_1 = "apartment_1";
		address.setAppartment(apartment_1);
		address.setOwner(u1);

		address.setTitle(universityTitle);

		modelService.save(address);

		universityTitle.setCode(PHD);
		universityTitle.setName(PHD);
		modelService.save(universityTitle);

		address.setTitle(personalTitle);
		modelService.save(address);

		personalTitle.setCode(GMBH);
		personalTitle.setName(GMBH);
		modelService.save(personalTitle);

		final AuditReportConfig testConfig = loadConfigFromFile("audit.test/user-address-audit.xml");
		final List<ReportView> u1ReportView = auditViewService
				.getViewOn(TypeAuditReportConfig.builder().withConfig(testConfig).withRootTypePk(u1.getPk()).withFullReport().build())
				.collect(toList());

		final Map<String, Object> userAudit1 = getUser(u1ReportView.get(0));

		assertThat(userAudit1.get(UserModel.NAME)).isEqualTo("name1");
		assertThat(userAudit1.get("owned addresses")).isInstanceOf(List.class);
		assertThat((List) userAudit1.get("owned addresses")).isEmpty();

		final Map<String, Object> userAudit2 = getUser(u1ReportView.get(1));
		assertThat(userAudit2.get("owned addresses")).isInstanceOf(List.class);
		assertThat((List) userAudit2.get("owned addresses")).hasSize(1);

		final Map<String, Object> addressAudit2 = getAddress(u1ReportView.get(1), 0);
		assertThat(addressAudit2.get(AddressModel.APPARTMENT)).isEqualTo("apartment_1");
		assertThat(addressAudit2.get("street")).isEqualTo("street");

		final Map<String, Object> titleAudit2 = getAddressTitle(u1ReportView.get(1), 0);
		assertThat(titleAudit2).isNotNull();

		assertThat((Map) titleAudit2.get(TitleModel.NAME)).containsEntry("en", MGR);

		final Map<String, Object> titleAudit3 = getAddressTitle(u1ReportView.get(2), 0);
		assertThat(titleAudit3).isNotNull();
		assertThat((Map) titleAudit3.get(TitleModel.NAME)).containsEntry("en", PHD);
		assertThat(titleAudit3.get(TitleModel.CODE)).isEqualTo(PHD);

		final Map<String, Object> titleAudit4 = getAddressTitle(u1ReportView.get(3), 0);
		assertThat(titleAudit4).isNotNull();
		assertThat((Map) titleAudit4.get(TitleModel.NAME)).containsEntry("en", MADAME);
		assertThat(titleAudit4.get(TitleModel.CODE)).isEqualTo(MADAME);

		final Map<String, Object> titleAudit5 = getAddressTitle(u1ReportView.get(4), 0);
		assertThat(titleAudit5).isNotNull();
		assertThat((Map) titleAudit5.get(TitleModel.NAME)).containsEntry("en", GMBH);
		assertThat(titleAudit5.get(TitleModel.CODE)).isEqualTo(GMBH);

		assertThat(titleAudit2.get(TitleModel.CODE)).isEqualTo(MGR);
	}

	@Test
	public void shouldAuditCountryRegions()
	{
		final CountryModel poland = modelService.create(CountryModel.class);
		poland.setIsocode(UUID.randomUUID().toString());
		poland.setName("poland");


		final RegionModel silesia = modelService.create(RegionModel.class);
		silesia.setIsocode(UUID.randomUUID().toString());
		silesia.setName("silesia");
		silesia.setCountry(poland);

		final RegionModel lesserPoland = modelService.create(RegionModel.class);
		lesserPoland.setIsocode(UUID.randomUUID().toString());
		lesserPoland.setName("lesser poland");
		lesserPoland.setCountry(poland);

		modelService.saveAll(poland, silesia, lesserPoland);


		final UserModel u1 = modelService.create(UserModel.class);
		u1.setUid(UUID.randomUUID().toString());
		u1.setName("name1");
		modelService.save(u1);

		final AddressModel address = modelService.create(AddressModel.class);
		address.setStreetname("street");
		address.setOwner(u1);
		address.setCountry(poland);
		address.setRegion(silesia);

		modelService.save(address);

		address.setRegion(lesserPoland);
		modelService.save(address);


		final AuditReportConfig testConfig = loadConfigFromFile("audit.test/user-address-country.xml");
		final List<ReportView> u1ReportView = auditViewService
				.getViewOn(TypeAuditReportConfig.builder().withConfig(testConfig).withRootTypePk(u1.getPk()).withFullReport().build())
				.collect(toList());

		final Map<String, Object> region1 = getRegion(u1ReportView.get(1), 0);
		final Map<String, Object> country1 = getCountry(u1ReportView.get(1), 0);

		assertThat((Map) region1.get("name")).containsEntry("en", "silesia");
		assertThat((Map) country1.get("name")).containsEntry("en", "poland");

		assertThat(country1.get("regions")).isNotNull();
		assertThat((ArrayList) country1.get("regions")).hasSize(2);

		final Map<String, Object> region2 = getRegion(u1ReportView.get(2), 0);
		final Map<String, Object> country2 = getCountry(u1ReportView.get(2), 0);

		assertThat((Map) region2.get("name")).containsEntry("en", "lesser poland");
		assertThat((Map) country2.get("name")).containsEntry("en", "poland");

		assertThat(country2.get("regions")).isNotNull();
		assertThat((ArrayList) country2.get("regions")).hasSize(2);
	}

	private Map<String, Object> getUser(final ReportView reportView)
	{
		return (Map<String, Object>) reportView.getPayload().get("User");
	}

	private Map<String, Object> getAddress(final ReportView reportView, final int idx)
	{
		final Map<String, Object> user = getUser(reportView);

		final List userAddresses = (List) user.get("owned addresses");
		return (Map<String, Object>) userAddresses.get(idx);
	}

	private Map<String, Object> getAddressTitle(final ReportView reportView, final int idx)
	{
		final Map<String, Object> address = getAddress(reportView, idx);
		return (Map<String, Object>) address.get("title");
	}

	private Map<String, Object> getRegion(final ReportView reportView, final int idx)
	{
		final Map<String, Object> address = getAddress(reportView, idx);
		return (Map<String, Object>) address.get("region");
	}

	private Map<String, Object> getCountry(final ReportView reportView, final int idx)
	{
		final Map<String, Object> address = getAddress(reportView, idx);
		return (Map<String, Object>) address.get("country");
	}


	@Test
	public void shouldFailIfUserReportIsExecutedForCatlog()
	{
		final CatalogModel catalog = modelService.create(CatalogModel.class);
		catalog.setId(UUID.randomUUID().toString());

		modelService.save(catalog);

		final AuditReportConfig testConfig = loadConfigFromFile("audit.test/user-audit.xml");

		try
		{
			auditViewService.getViewOn(
					TypeAuditReportConfig.builder().withConfig(testConfig).withRootTypePk(catalog.getPk()).withFullReport().build());
		}
		catch (final Exception ex)
		{
			assertThat(ex).isInstanceOf(SystemException.class);
			assertThat(ex).hasMessageContaining("Failed to execute");
		}
	}

	@Test
	public void shouldGenerateAuditForDeletedUser()
	{

		final UserModel user = modelService.create(UserModel.class);
		user.setUid(UUID.randomUUID().toString());
		final String name = "someName";
		user.setName(name);
		modelService.save(user);


		modelService.remove(user);


		final AuditReportConfig testConfig = loadConfigFromFile("audit.test/user-audit.xml");
		final List<ReportView> reportView = auditViewService
				.getViewOn(
						TypeAuditReportConfig.builder().withConfig(testConfig).withRootTypePk(user.getPk()).withFullReport().build())
				.collect(toList());

		assertThat(reportView.size()).isEqualTo(1);

		final Map<String, Object> userMap = (Map<String, Object>) reportView.get(0).getPayload().get(USER);
		assertThat(userMap.get(NAME)).isEqualTo(name);
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
}
