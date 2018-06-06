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

import de.hybris.platform.directpersistence.audit.PersistenceAuditService;
import de.hybris.platform.directpersistence.audit.impl.DefaultPersistenceAuditService;
import de.hybris.platform.testframework.PropertyConfigSwitcher;

import java.util.ArrayList;
import java.util.List;


public class AuditTestConfigManager
{
	private final List<PropertyConfigSwitcher> auditedTypes = new ArrayList<>();
	private final DefaultPersistenceAuditService persistenceAuditService;

	public AuditTestConfigManager(final DefaultPersistenceAuditService persistenceAuditService)
	{
		this.persistenceAuditService = persistenceAuditService;
	}

	public void enableAuditingForTypes(final String... types)
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
