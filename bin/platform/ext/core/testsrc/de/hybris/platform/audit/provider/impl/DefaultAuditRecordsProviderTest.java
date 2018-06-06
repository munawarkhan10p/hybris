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
import de.hybris.platform.audit.AbstractAuditTest;
import de.hybris.platform.audit.TypeAuditReportConfig;
import de.hybris.platform.audit.provider.AuditRecordsProvider;
import de.hybris.platform.core.PK;
import de.hybris.platform.directpersistence.audit.AuditRecord;
import de.hybris.platform.directpersistence.audit.JsonAuditRecord;
import de.hybris.platform.directpersistence.audit.ModelAuditRecord;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;


@IntegrationTest
public class DefaultAuditRecordsProviderTest extends AbstractAuditTest
{
	@Resource
	private AuditRecordsProvider auditRecordsProvider;

	@Override
	public void setUp() throws Exception
	{
		super.setUp();
		assumeAuditEnabled();
	}

	@Test
	public void shouldReturnAuditRecordsForConfigAndDataDefinedInMainSetup() throws Exception
	{
		// given
		final PK userPk = user1.getPk();
		final TypeAuditReportConfig config = TypeAuditReportConfig.builder().withConfig(testAuditReportConfig)
				.withRootTypePk(userPk).build();

		// when
		final List<AuditRecord> records = auditRecordsProvider.getRecords(config).collect(toList());

		// then
		assertThat(records).isNotNull().hasSize(10);

		assertThat(records.get(0)).isInstanceOf(JsonAuditRecord.class);
		assertThat(records.get(0).getType()).isEqualTo("User");
		assertThat(records.get(0).getAttribute("uid")).isEqualTo("adam");
		assertThat(records.get(0).getAttribute("name")).isEqualTo("Adam");
		assertThat(records.get(0).getAttribute("addresses")).isNull();
		assertThat(records.get(0).getAttribute("defaultpaymentaddress")).isNull();
		assertThat(records.get(0).getAttribute("defaultshipmentaddress")).isNull();
		assertThat(records.get(0).getPk()).isEqualTo(userPk);

		assertThat(records.get(1)).isInstanceOf(ModelAuditRecord.class);
		assertThat(records.get(1).getType()).isEqualTo("Title");
		assertThat(records.get(1).getAttribute("code")).isEqualTo("Mr");
		final Map<String, String> nameMap = (Map<String, String>) records.get(1).getAttribute("name");
		assertThat(nameMap.get("en")).isEqualTo("Mister");
		assertThat(records.get(1).getPk()).isEqualTo(title1.getPk());

		assertThat(records.get(2)).isInstanceOf(ModelAuditRecord.class);
		assertThat(records.get(2).getType()).isEqualTo("Title");
		assertThat(records.get(2).getAttribute("code")).isEqualTo("Engr.");
		final Map<String, String> nameMap2 = (Map<String, String>) records.get(2).getAttribute("name");
		assertThat(nameMap2.get("en")).isEqualTo("Engineer");
		assertThat(records.get(2).getPk()).isEqualTo(title2.getPk());

		assertThat(records.get(3)).isInstanceOf(JsonAuditRecord.class);
		assertThat(records.get(3).getType()).isEqualTo("Address");
		assertThat(records.get(3).getAttribute("town")).isEqualTo("Sosnowiec");
		assertThat(records.get(3).getAttribute("streetname")).isEqualTo("Moniuszki");
		assertThat(records.get(3).getAttribute("title")).isNull();
		assertThat(records.get(3).getAttribute("owner")).isEqualTo(userPk);
		assertThat(records.get(3).getPk()).isEqualTo(address1.getPk());

		assertThat(records.get(4)).isInstanceOf(JsonAuditRecord.class);
		assertThat(records.get(4).getType()).isEqualTo("Address");
		assertThat(records.get(4).getAttribute("town")).isEqualTo("Tokyo");
		assertThat(records.get(4).getAttribute("streetname")).isEqualTo("Konnichiwa");
		assertThat(records.get(4).getAttribute("title")).isNull();
		assertThat(records.get(4).getAttribute("owner")).isEqualTo(userPk);
		assertThat(records.get(4).getPk()).isEqualTo(address2.getPk());

		assertThat(records.get(5)).isInstanceOf(JsonAuditRecord.class);
		assertThat(records.get(5).getType()).isEqualTo("Address");
		assertThat(records.get(5).getAttribute("town")).isEqualTo("New York");
		assertThat(records.get(5).getAttribute("streetname")).isEqualTo("55th St.");
		assertThat(records.get(5).getAttribute("title")).isNull();
		assertThat(records.get(5).getAttribute("owner")).isEqualTo(userPk);
		assertThat(records.get(5).getPk()).isEqualTo(address3.getPk());

		assertThat(records.get(6)).isInstanceOf(ModelAuditRecord.class);
		assertThat(records.get(6).getType()).isEqualTo("Address");
		assertThat(records.get(6).getAttribute("town")).isEqualTo("Sosnowiec");
		assertThat(records.get(6).getAttribute("streetname")).isEqualTo("Moniuszki");
		assertThat(records.get(6).getAttribute("title")).isEqualTo(title1.getPk());
		assertThat(records.get(6).getAttribute("owner")).isEqualTo(userPk);
		assertThat(records.get(6).getPk()).isEqualTo(address1.getPk());

		assertThat(records.get(7)).isInstanceOf(ModelAuditRecord.class);
		assertThat(records.get(7).getType()).isEqualTo("Address");
		assertThat(records.get(7).getAttribute("town")).isEqualTo("Tokyo");
		assertThat(records.get(7).getAttribute("streetname")).isEqualTo("Konnichiwa");
		assertThat(records.get(7).getAttribute("title")).isEqualTo(title2.getPk());
		assertThat(records.get(7).getAttribute("owner")).isEqualTo(userPk);
		assertThat(records.get(7).getPk()).isEqualTo(address2.getPk());

		assertThat(records.get(8)).isInstanceOf(ModelAuditRecord.class);
		assertThat(records.get(8).getType()).isEqualTo("Address");
		assertThat(records.get(8).getAttribute("town")).isEqualTo("New York");
		assertThat(records.get(8).getAttribute("streetname")).isEqualTo("55th St.");
		assertThat(records.get(8).getAttribute("title")).isEqualTo(title1.getPk());
		assertThat(records.get(8).getAttribute("owner")).isEqualTo(userPk);
		assertThat(records.get(8).getPk()).isEqualTo(address3.getPk());

		assertThat(records.get(9)).isInstanceOf(ModelAuditRecord.class);
		assertThat(records.get(9).getType()).isEqualTo("User");
		assertThat(records.get(9).getAttribute("uid")).isEqualTo("adam");
		assertThat(records.get(9).getAttribute("name")).isEqualTo("Adam");
		//TODO: verify but "virtual" address will not be displayed as this is attribute in user
		//	assertThat(records.get(9).getAttribute("addresses")).isInstanceOf(Collection.class);
		//	assertThat((Collection) records.get(9).getAttribute("addresses")).containsOnly(address1.getPk(), address2.getPk(),
		//			address3.getPk());
		assertThat(records.get(9).getAttribute("defaultpaymentaddress")).isEqualTo(address1.getPk());
		assertThat(records.get(9).getAttribute("defaultshipmentaddress")).isEqualTo(address3.getPk());
		assertThat(records.get(9).getPk()).isEqualTo(userPk);
	}

	@Test
	public void shouldReturnAuditRecordsForConfigAndDataDefinedInMainSetup_ModifiedAddressRefInUser() throws Exception
	{
		// given
		user1.setDefaultShipmentAddress(null);
		modelService.save(user1);
		final PK userPk = user1.getPk();
		final TypeAuditReportConfig config = TypeAuditReportConfig.builder().withConfig(testAuditReportConfig)
				.withRootTypePk(userPk).build();

		// when
		final List<AuditRecord> records = auditRecordsProvider.getRecords(config).collect(toList());

		// then
		assertThat(records).isNotNull().hasSize(11);

		assertThat(records.get(0)).isInstanceOf(JsonAuditRecord.class);
		assertThat(records.get(0).getType()).isEqualTo("User");
		assertThat(records.get(0).getAttribute("uid")).isEqualTo("adam");
		assertThat(records.get(0).getAttribute("name")).isEqualTo("Adam");
		assertThat(records.get(0).getAttribute("addresses")).isNull();
		assertThat(records.get(0).getAttribute("defaultpaymentaddress")).isNull();
		assertThat(records.get(0).getAttribute("defaultshipmentaddress")).isNull();
		assertThat(records.get(0).getPk()).isEqualTo(userPk);

		assertThat(records.get(1)).isInstanceOf(ModelAuditRecord.class);
		assertThat(records.get(1).getType()).isEqualTo("Title");
		assertThat(records.get(1).getAttribute("code")).isEqualTo("Mr");
		final Map<String, String> nameMap = (Map<String, String>) records.get(1).getAttribute("name");
		assertThat(nameMap.get("en")).isEqualTo("Mister");
		assertThat(records.get(1).getPk()).isEqualTo(title1.getPk());

		assertThat(records.get(2)).isInstanceOf(ModelAuditRecord.class);
		assertThat(records.get(2).getType()).isEqualTo("Title");
		assertThat(records.get(2).getAttribute("code")).isEqualTo("Engr.");
		final Map<String, String> nameMap2 = (Map<String, String>) records.get(2).getAttribute("name");
		assertThat(nameMap2.get("en")).isEqualTo("Engineer");
		assertThat(records.get(2).getPk()).isEqualTo(title2.getPk());

		assertThat(records.get(3)).isInstanceOf(JsonAuditRecord.class);
		assertThat(records.get(3).getType()).isEqualTo("Address");
		assertThat(records.get(3).getAttribute("town")).isEqualTo("Sosnowiec");
		assertThat(records.get(3).getAttribute("streetname")).isEqualTo("Moniuszki");
		assertThat(records.get(3).getAttribute("title")).isNull();
		assertThat(records.get(3).getPk()).isEqualTo(address1.getPk());

		assertThat(records.get(4)).isInstanceOf(JsonAuditRecord.class);
		assertThat(records.get(4).getType()).isEqualTo("Address");
		assertThat(records.get(4).getAttribute("town")).isEqualTo("Tokyo");
		assertThat(records.get(4).getAttribute("streetname")).isEqualTo("Konnichiwa");
		assertThat(records.get(4).getAttribute("title")).isNull();
		assertThat(records.get(4).getPk()).isEqualTo(address2.getPk());

		assertThat(records.get(5)).isInstanceOf(JsonAuditRecord.class);
		assertThat(records.get(5).getType()).isEqualTo("Address");
		assertThat(records.get(5).getAttribute("town")).isEqualTo("New York");
		assertThat(records.get(5).getAttribute("streetname")).isEqualTo("55th St.");
		assertThat(records.get(5).getAttribute("title")).isNull();
		assertThat(records.get(5).getPk()).isEqualTo(address3.getPk());

		assertThat(records.get(6)).isInstanceOf(ModelAuditRecord.class);
		assertThat(records.get(6).getType()).isEqualTo("Address");
		assertThat(records.get(6).getAttribute("town")).isEqualTo("Sosnowiec");
		assertThat(records.get(6).getAttribute("streetname")).isEqualTo("Moniuszki");
		assertThat(records.get(6).getAttribute("title")).isEqualTo(title1.getPk());
		assertThat(records.get(6).getPk()).isEqualTo(address1.getPk());

		assertThat(records.get(7)).isInstanceOf(ModelAuditRecord.class);
		assertThat(records.get(7).getType()).isEqualTo("Address");
		assertThat(records.get(7).getAttribute("town")).isEqualTo("Tokyo");
		assertThat(records.get(7).getAttribute("streetname")).isEqualTo("Konnichiwa");
		assertThat(records.get(7).getAttribute("title")).isEqualTo(title2.getPk());
		assertThat(records.get(7).getPk()).isEqualTo(address2.getPk());

		assertThat(records.get(8)).isInstanceOf(ModelAuditRecord.class);
		assertThat(records.get(8).getType()).isEqualTo("Address");
		assertThat(records.get(8).getAttribute("town")).isEqualTo("New York");
		assertThat(records.get(8).getAttribute("streetname")).isEqualTo("55th St.");
		assertThat(records.get(8).getAttribute("title")).isEqualTo(title1.getPk());
		assertThat(records.get(8).getPk()).isEqualTo(address3.getPk());

		assertThat(records.get(9)).isInstanceOf(JsonAuditRecord.class);
		assertThat(records.get(9).getType()).isEqualTo("User");
		assertThat(records.get(9).getAttribute("uid")).isEqualTo("adam");
		assertThat(records.get(9).getAttribute("name")).isEqualTo("Adam");
		//TODO: verify but "virtual" address will not be displayed as this is attribute in user
		//	assertThat(records.get(9).getAttribute("addresses")).isInstanceOf(Collection.class);
		//assertThat((Collection) records.get(9).getAttribute("addresses")).containsOnly(address1.getPk(), address2.getPk(),
		//		address3.getPk());
		assertThat(records.get(9).getAttribute("defaultpaymentaddress")).isEqualTo(address1.getPk());
		assertThat(records.get(9).getAttribute("defaultshipmentaddress")).isEqualTo(address3.getPk());
		assertThat(records.get(9).getPk()).isEqualTo(userPk);

		assertThat(records.get(10)).isInstanceOf(ModelAuditRecord.class);
		assertThat(records.get(10).getType()).isEqualTo("User");
		assertThat(records.get(10).getAttribute("uid")).isEqualTo("adam");
		assertThat(records.get(10).getAttribute("name")).isEqualTo("Adam");
		//TODO: verify but "virtual" address will not be displayed as this is attribute in user
		//assertThat(records.get(10).getAttribute("addresses")).isInstanceOf(Collection.class);
		//assertThat((Collection) records.get(10).getAttribute("addresses")).containsOnly(address1.getPk(), address2.getPk(),
		//		address3.getPk());
		assertThat(records.get(10).getAttribute("defaultpaymentaddress")).isEqualTo(address1.getPk());
		assertThat(records.get(10).getAttribute("defaultshipmentaddress")).isNull();
		assertThat(records.get(10).getPk()).isEqualTo(userPk);
	}

}
