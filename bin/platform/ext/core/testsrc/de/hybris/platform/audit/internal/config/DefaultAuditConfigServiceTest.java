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
package de.hybris.platform.audit.internal.config;

import static org.assertj.core.api.Assertions.assertThat;

import de.hybris.platform.audit.AbstractAuditTest;
import de.hybris.platform.core.model.audit.AuditReportConfigModel;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.google.common.collect.Iterables;


public class DefaultAuditConfigServiceTest extends AbstractAuditTest
{
	@Resource
	private DefaultAuditConfigService auditConfigService;

	@Resource
	private XMLAuditReportConfigReader xmlAuditReportConfigReader;

	@Test
	public void shouldStoreConfig() throws Exception
	{
		// given
		final String xml = auditConfigService.toXml(testAuditReportConfig);

		// when
		final AuditReportConfigModel testConfig = auditConfigService.storeConfiguration("testConfig", xml);

		// then
		assertThat(testConfig).isNotNull();
		assertThat(modelService.isNew(testConfig)).isFalse();
		assertThat(testConfig.getActive()).isTrue();
		assertThat(testConfig.getCode()).isEqualTo("testConfig");
		assertThat(testConfig.getContent()).isEqualTo(xml);
	}

	@Test
	public void shouldUnmarshallConfig() throws Exception
	{
		// given
		final String xml = auditConfigService.toXml(testAuditReportConfig);

		// when
		final AuditReportConfig config = xmlAuditReportConfigReader
				.fromXml(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)));

		// then
		verifyTestConfig(config);
	}

	@Test
	public void shouldFindExistingConfig() throws Exception
	{
		// given
		final String xml = auditConfigService.toXml(testAuditReportConfig);
		auditConfigService.storeConfiguration("testConfig", xml);

		// when
		final AuditReportConfig testConfig = auditConfigService.getConfigForName("testConfig");

		// then
		verifyTestConfig(testConfig);
	}

	private void verifyTestConfig(final AuditReportConfig config)
	{
		assertThat(config).isNotNull();
		assertThat(config.getName()).isEqualTo("testConfig");
		assertThat(config.getGivenRootType()).isNotNull();
		assertThat(config.getTypes()).hasSize(3);

		final Type userType = config.getType("User");
		final Type addressType = config.getType("Address");
		final Type titleType = config.getType("Title");

		AuditConfigTypeAssert.assertThat(userType).hasCode("User");
		AuditConfigTypeAssert.assertThat(userType).hasNumOfAtomicAttributes(2);
		AuditConfigTypeAssert.assertThat(userType).hasNumOfReferenceAttributes(2);
		AuditConfigTypeAssert.assertThat(userType).hasNumOfVirtualAttributes(1);
		AuditConfigTypeAssert.assertThat(userType).cointainsOnlyAtomicAttributes("name", "uid");
		AuditConfigTypeAssert.assertThat(userType).cointainsOnlyReferenceAttributes("defaultPaymentAddress",
				"defaultShipmentAddress");

		AuditConfigTypeAssert.assertThat(addressType).hasCode("Address");
		AuditConfigTypeAssert.assertThat(addressType).hasNumOfAtomicAttributes(2);
		AuditConfigTypeAssert.assertThat(addressType).hasNumOfReferenceAttributes(1);
		AuditConfigTypeAssert.assertThat(addressType).hasNumOfVirtualAttributes(0);
		AuditConfigTypeAssert.assertThat(addressType).cointainsOnlyAtomicAttributes("town", "streetname");
		AuditConfigTypeAssert.assertThat(addressType).cointainsOnlyReferenceAttributes("title");

		AuditConfigTypeAssert.assertThat(titleType).hasCode("Title");
		AuditConfigTypeAssert.assertThat(titleType).hasNumOfAtomicAttributes(2);
		AuditConfigTypeAssert.assertThat(titleType).hasNumOfReferenceAttributes(0);
		AuditConfigTypeAssert.assertThat(titleType).hasNumOfVirtualAttributes(0);
		AuditConfigTypeAssert.assertThat(titleType).cointainsOnlyAtomicAttributes("code", "name");
	}

	@Test
	public void shouldMergeTwoConfigurations_defaultModeAppend() throws Exception
	{
		// given
		final Type address = Type.builder() //
				.withCode("Address") //
				.withAtomicAttributes(AtomicAttribute.builder().withQualifier("pobox").withDisplayKey("address.pobox").build()) //
				.build();
		final AuditReportConfig additionalReportConfig = AuditReportConfig.builder().withName("testConfig").withTypes(address)
				.build();

		// when
		final AuditReportConfig mergedConfiguration = auditConfigService.mergeConfigurations(testAuditReportConfig,
				additionalReportConfig);

		// then
		verifyMergedConfiguration(mergedConfiguration);
	}


	@Test
	public void shouldMergeTwoConfigurations_declaredModeAppend() throws Exception
	{
		// given
		final Type address = Type.builder() //
				.withCode("Address") //
				.withAtomicAttributes(AtomicAttribute.builder().withQualifier("pobox").withDisplayKey("address.pobox").build()) //
				.withCombineMode("append").build();
		final AuditReportConfig additionalReportConfig = AuditReportConfig.builder().withName("testConfig").withTypes(address)
				.build();

		// when
		final AuditReportConfig mergedConfiguration = auditConfigService.mergeConfigurations(testAuditReportConfig,
				additionalReportConfig);

		// then
		verifyMergedConfiguration(mergedConfiguration);
	}

	private void verifyMergedConfiguration(final AuditReportConfig config)
	{
		assertThat(config).isNotNull();
		assertThat(config.getName()).isEqualTo("testConfig");
		assertThat(config.getGivenRootType()).isNotNull();
		assertThat(config.getTypes()).hasSize(3);

		final Type userType = config.getType("User");
		final Type addressType = config.getType("Address");
		final Type titleType = config.getType("Title");

		AuditConfigTypeAssert.assertThat(userType).hasCode("User");
		AuditConfigTypeAssert.assertThat(userType).hasNumOfAtomicAttributes(2);
		AuditConfigTypeAssert.assertThat(userType).hasNumOfReferenceAttributes(2);
		AuditConfigTypeAssert.assertThat(userType).hasNumOfVirtualAttributes(1);
		AuditConfigTypeAssert.assertThat(userType).cointainsOnlyAtomicAttributes("name", "uid");
		AuditConfigTypeAssert.assertThat(userType).cointainsOnlyReferenceAttributes("defaultPaymentAddress",
				"defaultShipmentAddress");

		AuditConfigTypeAssert.assertThat(addressType).hasCode("Address");
		AuditConfigTypeAssert.assertThat(addressType).hasNumOfAtomicAttributes(3);
		AuditConfigTypeAssert.assertThat(addressType).hasNumOfReferenceAttributes(1);
		AuditConfigTypeAssert.assertThat(addressType).hasNumOfVirtualAttributes(0);
		AuditConfigTypeAssert.assertThat(addressType).cointainsOnlyAtomicAttributes("town", "streetname", "pobox");
		AuditConfigTypeAssert.assertThat(addressType).cointainsOnlyReferenceAttributes("title");

		AuditConfigTypeAssert.assertThat(titleType).hasCode("Title");
		AuditConfigTypeAssert.assertThat(titleType).hasNumOfAtomicAttributes(2);
		AuditConfigTypeAssert.assertThat(titleType).hasNumOfReferenceAttributes(0);
		AuditConfigTypeAssert.assertThat(titleType).hasNumOfVirtualAttributes(0);
		AuditConfigTypeAssert.assertThat(titleType).cointainsOnlyAtomicAttributes("code", "name");
	}

	@Test
	public void shouldMergeTwoConfigurations_declaredModeReplace() throws Exception
	{
		// given
		final Type address = Type.builder() //
				.withCode("Address") //
				.withAtomicAttributes(AtomicAttribute.builder().withQualifier("pobox").withDisplayKey("address.pobox").build()) //
				.withCombineMode("replace").build();
		final AuditReportConfig additionalReportConfig = AuditReportConfig.builder().withName("testConfig").withTypes(address)
				.build();

		// when
		final AuditReportConfig mergedConfiguration = auditConfigService.mergeConfigurations(testAuditReportConfig,
				additionalReportConfig);

		// then
		assertThat(mergedConfiguration).isNotNull();
		assertThat(mergedConfiguration.getName()).isEqualTo("testConfig");
		assertThat(mergedConfiguration.getGivenRootType()).isNotNull();
		assertThat(mergedConfiguration.getTypes()).hasSize(3);

		final Type userType = mergedConfiguration.getType("User");
		final Type addressType = mergedConfiguration.getType("Address");
		final Type titleType = mergedConfiguration.getType("Title");

		AuditConfigTypeAssert.assertThat(userType).hasCode("User");
		AuditConfigTypeAssert.assertThat(userType).hasNumOfAtomicAttributes(2);
		AuditConfigTypeAssert.assertThat(userType).hasNumOfReferenceAttributes(2);
		AuditConfigTypeAssert.assertThat(userType).hasNumOfVirtualAttributes(1);
		AuditConfigTypeAssert.assertThat(userType).cointainsOnlyAtomicAttributes("name", "uid");
		AuditConfigTypeAssert.assertThat(userType).cointainsOnlyReferenceAttributes("defaultPaymentAddress",
				"defaultShipmentAddress");

		AuditConfigTypeAssert.assertThat(addressType).hasCode("Address");
		AuditConfigTypeAssert.assertThat(addressType).hasNumOfAtomicAttributes(1);
		AuditConfigTypeAssert.assertThat(addressType).hasNumOfReferenceAttributes(0);
		AuditConfigTypeAssert.assertThat(addressType).hasNumOfVirtualAttributes(0);
		AuditConfigTypeAssert.assertThat(addressType).cointainsOnlyAtomicAttributes("pobox");

		AuditConfigTypeAssert.assertThat(titleType).hasCode("Title");
		AuditConfigTypeAssert.assertThat(titleType).hasNumOfAtomicAttributes(2);
		AuditConfigTypeAssert.assertThat(titleType).hasNumOfReferenceAttributes(0);
		AuditConfigTypeAssert.assertThat(titleType).hasNumOfVirtualAttributes(0);
		AuditConfigTypeAssert.assertThat(titleType).cointainsOnlyAtomicAttributes("code", "name");
	}

	@Test
	public void shouldMergeTwoConfigurations_declaredModeRemove() throws Exception
	{
		// given
		final Type address = Type.builder() //
				.withCode("Address").withCombineMode("remove").build();
		final AuditReportConfig additionalReportConfig = AuditReportConfig.builder().withName("testConfig").withTypes(address)
				.build();

		// when
		final AuditReportConfig mergedConfiguration = auditConfigService.mergeConfigurations(testAuditReportConfig,
				additionalReportConfig);

		// then
		assertThat(mergedConfiguration).isNotNull();
		assertThat(mergedConfiguration.getName()).isEqualTo("testConfig");
		assertThat(mergedConfiguration.getGivenRootType()).isNotNull();
		assertThat(mergedConfiguration.getTypes()).hasSize(2);
		assertThat(mergedConfiguration.getType("Address")).isNull();

		final Type userType = mergedConfiguration.getType("User");
		final Type titleType = mergedConfiguration.getType("Title");

		AuditConfigTypeAssert.assertThat(userType).hasCode("User");
		AuditConfigTypeAssert.assertThat(userType).hasNumOfAtomicAttributes(2);
		AuditConfigTypeAssert.assertThat(userType).hasNumOfReferenceAttributes(2);
		AuditConfigTypeAssert.assertThat(userType).hasNumOfVirtualAttributes(1);
		AuditConfigTypeAssert.assertThat(userType).cointainsOnlyAtomicAttributes("name", "uid");
		AuditConfigTypeAssert.assertThat(userType).cointainsOnlyReferenceAttributes("defaultPaymentAddress",
				"defaultShipmentAddress");

		AuditConfigTypeAssert.assertThat(titleType).hasCode("Title");
		AuditConfigTypeAssert.assertThat(titleType).hasNumOfAtomicAttributes(2);
		AuditConfigTypeAssert.assertThat(titleType).hasNumOfReferenceAttributes(0);
		AuditConfigTypeAssert.assertThat(titleType).hasNumOfVirtualAttributes(0);
		AuditConfigTypeAssert.assertThat(titleType).cointainsOnlyAtomicAttributes("code", "name");
	}

	static class AuditConfigTypeAssert extends AbstractAssert<AuditConfigTypeAssert, Type>
	{
		public AuditConfigTypeAssert(final Type actual)
		{
			super(actual, AuditConfigTypeAssert.class);
		}

		public static AuditConfigTypeAssert assertThat(final Type type)
		{
			return new AuditConfigTypeAssert(type);
		}

		public AuditConfigTypeAssert hasCode(final String code)
		{
			Assertions.assertThat(actual.getCode()).isNotNull().isEqualTo(code);
			return this;
		}

		public AuditConfigTypeAssert hasNumOfReferenceAttributes(final int num)
		{
			Assertions.assertThat(actual.getReferenceAttributes()).hasSize(num);
			return this;
		}

		public AuditConfigTypeAssert hasNumOfVirtualAttributes(final int num)
		{
			Assertions.assertThat(actual.getVirtualAttributes()).hasSize(num);
			return this;
		}


		public AuditConfigTypeAssert hasNumOfAtomicAttributes(final int num)
		{
			Assertions.assertThat(actual.getAtomicAttributes()).hasSize(num);
			return this;
		}

		public AuditConfigTypeAssert cointainsOnlyAtomicAttributes(final String... qualifiers)
		{
			final List<String> foundQualifiers = actual.getAtomicAttributes().stream().map(AtomicAttribute::getQualifier)
					.collect(Collectors.toList());
			Assertions.assertThat(foundQualifiers).containsOnly(toLowerCase(qualifiers));
			return this;
		}

		public AuditConfigTypeAssert cointainsOnlyReferenceAttributes(final String... qualifiers)
		{
			final List<String> foundQualifiers = actual.getReferenceAttributes().stream().map(ReferenceAttribute::getQualifier)
					.collect(Collectors.toList());
			Assertions.assertThat(foundQualifiers).containsOnly(toLowerCase(qualifiers));
			return this;
		}

		public AuditConfigTypeAssert cointainsOnlyVirtualAttributes(final String... expressions)
		{
			final List<String> foundExpressions = actual.getVirtualAttributes().stream().map(VirtualAttribute::getExpression)
					.collect(Collectors.toList());
			Assertions.assertThat(foundExpressions).containsOnly(toLowerCase(expressions));
			return this;
		}

		private String[] toLowerCase(final String... qualifiers)
		{
			final List<String> result = Arrays.stream(qualifiers).map(String::toLowerCase).collect(Collectors.toList());
			return Iterables.toArray(result, String.class);
		}
	}

}
