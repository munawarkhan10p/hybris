/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:32 PM
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

public  class CxVariationKey  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CxVariationKey.variationCode</code> property defined at extension <code>personalizationservices</code>. */
		
	private String variationCode;

	/** <i>Generated property</i> for <code>CxVariationKey.customizationCode</code> property defined at extension <code>personalizationservices</code>. */
		
	private String customizationCode;
	
	public CxVariationKey()
	{
		// default constructor
	}
	
		
	
	public void setVariationCode(final String variationCode)
	{
		this.variationCode = variationCode;
	}

		
	
	public String getVariationCode() 
	{
		return variationCode;
	}
	
		
	
	public void setCustomizationCode(final String customizationCode)
	{
		this.customizationCode = customizationCode;
	}

		
	
	public String getCustomizationCode() 
	{
		return customizationCode;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final CxVariationKey other = (CxVariationKey) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getVariationCode(), other.getVariationCode()) 
			.append(getCustomizationCode(), other.getCustomizationCode()) 
			.isEquals();
		} 
		catch (ClassCastException c)
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return new org.apache.commons.lang.builder.HashCodeBuilder()
		.append(getVariationCode()) 
		.append(getCustomizationCode()) 
		.toHashCode();
	}

}
