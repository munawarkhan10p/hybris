/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:35 PM
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
package de.hybris.platform.personalizationservices.data;

import java.io.Serializable;

public  class CxAbstractActionResult  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CxAbstractActionResult.actionCode</code> property defined at extension <code>personalizationservices</code>. */
		
	private String actionCode;

	/** <i>Generated property</i> for <code>CxAbstractActionResult.customizationCode</code> property defined at extension <code>personalizationservices</code>. */
		
	private String customizationCode;

	/** <i>Generated property</i> for <code>CxAbstractActionResult.variationCode</code> property defined at extension <code>personalizationservices</code>. */
		
	private String variationCode;
	
	public CxAbstractActionResult()
	{
		// default constructor
	}
	
		
	
	public void setActionCode(final String actionCode)
	{
		this.actionCode = actionCode;
	}

		
	
	public String getActionCode() 
	{
		return actionCode;
	}
	
		
	
	public void setCustomizationCode(final String customizationCode)
	{
		this.customizationCode = customizationCode;
	}

		
	
	public String getCustomizationCode() 
	{
		return customizationCode;
	}
	
		
	
	public void setVariationCode(final String variationCode)
	{
		this.variationCode = variationCode;
	}

		
	
	public String getVariationCode() 
	{
		return variationCode;
	}
	


}
