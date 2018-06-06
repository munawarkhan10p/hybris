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
package de.hybris.platform.audit.internal.config.validation;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.audit.AbstractAuditTest;
import de.hybris.platform.audit.internal.config.AuditConfigService;
import de.hybris.platform.audit.internal.config.AuditReportConfig;

import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resource;
import javax.xml.bind.UnmarshalException;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.assertj.core.api.ThrowableAssert;
import org.junit.Test;


@IntegrationTest
public class AuditReportConfigValidatorTest extends AbstractAuditTest
{

	@Resource
	private AuditConfigService auditConfigService;


	@Test
	public void shuldFailForVirtualAttributeType()
	{
		//given & when
		final Throwable actual = ThrowableAssert
				.catchThrowable(() -> loadConfigFromFile("audit.test/validation-wrong-virtual-type.xml"));
		//then
		assertThat(actual.getCause().getCause()).isInstanceOf(AuditConfigValidationException.class);
		assertThat(actual.getCause().getCause().getMessage()).contains("No correct type");
	}

	@Test
	public void shuldFailForReferenceAttributeType()
	{
		//given & when
		final Throwable actual = ThrowableAssert
				.catchThrowable(() -> loadConfigFromFile("audit.test/validation-wrong-reference-type.xml"));
		//then
		assertThat(actual.getCause().getCause()).isInstanceOf(AuditConfigValidationException.class);
		assertThat(actual.getCause().getCause().getMessage()).contains("No correct type");
	}


	@Test
	public void shuldFailForGivenRootType()
	{
		//given & when
		final Throwable actual = ThrowableAssert
				.catchThrowable(() -> loadConfigFromFile("audit.test/validation-wrong-given-root-type.xml"));
		//then
		assertThat(actual.getCause().getCause()).isInstanceOf(AuditConfigValidationException.class);
		assertThat(actual.getCause().getCause().getMessage()).contains("No correct type");
	}

	@Test
	public void shuldFailForSubType()
	{
		//given & when
		final Throwable actual = ThrowableAssert
				.catchThrowable(() -> loadConfigFromFile("audit.test/validation-wrong-sub-type.xml"));
		//then
		assertThat(actual.getCause().getCause()).isInstanceOf(AuditConfigValidationException.class);
		assertThat(actual.getCause().getCause().getMessage()).contains("No correct type");
	}

	@Test
	public void shuldFailForInvalidXml()
	{
		//given & when
		final Throwable actual = ThrowableAssert.catchThrowable(() -> loadConfigFromFile("audit.test/validation-invalidxml.xml"));
		//then
		assertTrue(ExceptionUtils.indexOfThrowable(actual, UnmarshalException.class) >= 0);
	}

	@Test
	public void shuldFailForRepeatedReferenceAttributesXml()
	{
		//given & when
		final Throwable actual = ThrowableAssert
				.catchThrowable(() -> loadConfigFromFile("audit.test/validation-duplicated-ref-attrs.xml"));
		//then
		assertTrue(ExceptionUtils.indexOfThrowable(actual, UnmarshalException.class) >= 0);
	}


	@Test
	public void shuldFailForNotExistingAttribut()
	{
		//given & when
		final Throwable actual = ThrowableAssert
				.catchThrowable(() -> loadConfigFromFile("audit.test/validation-wrong-attribute.xml"));
		//then
		assertThat(actual.getCause().getCause()).isInstanceOf(AuditConfigValidationException.class);
	}

	@Test
	public void shuldFailForNotExistingAtomicAttribut()
	{
		//given & when
		final Throwable actual = ThrowableAssert
				.catchThrowable(() -> loadConfigFromFile("audit.test/validation-wrong-atomic-attribute.xml"));
		//then
		assertThat(actual.getCause().getCause()).isInstanceOf(AuditConfigValidationException.class);
	}

	@Test
	public void shuldNotFailForAtomicAttributeInSubType()
	{
		//given & when
		final Throwable actual = ThrowableAssert
				.catchThrowable(() -> loadConfigFromFile("audit.test/validation-correct-atomic-attribute.xml"));
		//then
		assertThat(actual).isNull();

	}


	private AuditReportConfig loadConfigFromFile(final String file)
	{
		try (InputStream resourceAsStream = AuditReportConfigValidatorTest.class.getClassLoader().getResourceAsStream(file))
		{
			final String xml = IOUtils.toString(resourceAsStream, UTF_8);
			auditConfigService.storeConfiguration(file, xml);
			return auditConfigService.getConfigForName(file);
		}
		catch (final IOException e)
		{
			throw new RuntimeException(e);
		}
	}

}
