/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:33 PM
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
package de.hybris.platform.ruleengineservices.rule.data;

import java.io.Serializable;
import de.hybris.platform.ruleengineservices.rule.data.RuleParameterData;
import java.util.Map;

public  class RuleActionData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RuleActionData.definitionId</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String definitionId;

	/** <i>Generated property</i> for <code>RuleActionData.parameters</code> property defined at extension <code>ruleengineservices</code>. */
		
	private Map<String,RuleParameterData> parameters;
	
	public RuleActionData()
	{
		// default constructor
	}
	
		
	
	public void setDefinitionId(final String definitionId)
	{
		this.definitionId = definitionId;
	}

		
	
	public String getDefinitionId() 
	{
		return definitionId;
	}
	
		
	
	public void setParameters(final Map<String,RuleParameterData> parameters)
	{
		this.parameters = parameters;
	}

		
	
	public Map<String,RuleParameterData> getParameters() 
	{
		return parameters;
	}
	


}
