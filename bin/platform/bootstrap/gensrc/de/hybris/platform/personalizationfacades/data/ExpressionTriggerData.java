/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:31 PM
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
package de.hybris.platform.personalizationfacades.data;

import de.hybris.platform.personalizationfacades.data.ExpressionData;
import de.hybris.platform.personalizationfacades.data.TriggerData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Expression trigger
 */
@ApiModel(value="expressionTrigger", description="Expression trigger")
public  class ExpressionTriggerData extends TriggerData 
{

 

	/** <i>Generated property</i> for <code>ExpressionTriggerData.expression</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="expression") 	
	private ExpressionData expression;
	
	public ExpressionTriggerData()
	{
		// default constructor
	}
	
		
	
	public void setExpression(final ExpressionData expression)
	{
		this.expression = expression;
	}

		
	
	public ExpressionData getExpression() 
	{
		return expression;
	}
	


}
