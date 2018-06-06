/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:38 PM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.ruleengine;

import java.io.Serializable;
import java.util.Map;

public  class ExecutionContext  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** this map contains entries of rule code and referenced engine rule version<br/><br/><i>Generated property</i> for <code>ExecutionContext.ruleVersions</code> property defined at extension <code>ruleengine</code>. */
		
	private Map<String, Long> ruleVersions;
	
	public ExecutionContext()
	{
		// default constructor
	}
	
		
	
	public void setRuleVersions(final Map<String, Long> ruleVersions)
	{
		this.ruleVersions = ruleVersions;
	}

		
	
	public Map<String, Long> getRuleVersions() 
	{
		return ruleVersions;
	}
	


}
