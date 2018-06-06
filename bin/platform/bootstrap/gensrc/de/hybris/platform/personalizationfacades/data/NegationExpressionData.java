/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:41 PM
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Negation expression
 */
@ApiModel(value="expression", description="Negation expression")
public  class NegationExpressionData extends ExpressionData 
{

 

	/** <i>Generated property</i> for <code>NegationExpressionData.element</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="element") 	
	private ExpressionData element;
	
	public NegationExpressionData()
	{
		// default constructor
	}
	
		
	
	public void setElement(final ExpressionData element)
	{
		this.element = element;
	}

		
	
	public ExpressionData getElement() 
	{
		return element;
	}
	


}
