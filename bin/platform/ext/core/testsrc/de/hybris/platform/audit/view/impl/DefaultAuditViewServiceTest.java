package de.hybris.platform.audit.view.impl;

import static org.assertj.core.api.Assertions.assertThat;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.audit.AbstractAuditTest;
import de.hybris.platform.audit.TypeAuditReportConfig;
import de.hybris.platform.audit.view.AuditViewService;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Stream;

import javax.annotation.Resource;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;


@IntegrationTest
public class DefaultAuditViewServiceTest extends AbstractAuditTest
{
	@Resource
	private AuditViewService auditViewService;

	/**
	 * This is just a testing method to manually check produced json. It should assert content later on.
	 */
	@Test
	public void shouldProduceReportView() throws Exception
	{
        final TypeAuditReportConfig config = TypeAuditReportConfig.builder().withConfig(testAuditReportConfig).withRootTypePk(user1.getPk()).build();
        final Stream<ReportView> reportView = auditViewService.getViewOn(config);

		final StringBuilder sb = new StringBuilder();

		reportView.forEach(v -> sb.append(toJson(v.getPayload())));

		assertThat(sb.toString()).isNotEmpty();
	}

	private String toJson(final Map input)
	{
		final ObjectMapper mapper = new ObjectMapper();
		try
		{
			return mapper.writeValueAsString(input);
		}
		catch (final IOException e)
		{
			throw new IllegalStateException(e);
		}
	}

}
