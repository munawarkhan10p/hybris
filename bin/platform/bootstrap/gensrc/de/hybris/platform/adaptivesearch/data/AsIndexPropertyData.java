/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:39 PM
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
package de.hybris.platform.adaptivesearch.data;

import java.io.Serializable;
import de.hybris.platform.adaptivesearch.enums.AsBoostOperator;
import java.util.Set;

public  class AsIndexPropertyData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsIndexPropertyData.code</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>AsIndexPropertyData.name</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>AsIndexPropertyData.type</code> property defined at extension <code>adaptivesearch</code>. */
		
	private Class<?> type;

	/** <i>Generated property</i> for <code>AsIndexPropertyData.allowFacet</code> property defined at extension <code>adaptivesearch</code>. */
		
	private boolean allowFacet;

	/** <i>Generated property</i> for <code>AsIndexPropertyData.supportedBoostOperators</code> property defined at extension <code>adaptivesearch</code>. */
		
	private Set<AsBoostOperator> supportedBoostOperators;
	
	public AsIndexPropertyData()
	{
		// default constructor
	}
	
		
	
	public void setCode(final String code)
	{
		this.code = code;
	}

		
	
	public String getCode() 
	{
		return code;
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	
		
	
	public void setType(final Class<?> type)
	{
		this.type = type;
	}

		
	
	public Class<?> getType() 
	{
		return type;
	}
	
		
	
	public void setAllowFacet(final boolean allowFacet)
	{
		this.allowFacet = allowFacet;
	}

		
	
	public boolean isAllowFacet() 
	{
		return allowFacet;
	}
	
		
	
	public void setSupportedBoostOperators(final Set<AsBoostOperator> supportedBoostOperators)
	{
		this.supportedBoostOperators = supportedBoostOperators;
	}

		
	
	public Set<AsBoostOperator> getSupportedBoostOperators() 
	{
		return supportedBoostOperators;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final AsIndexPropertyData other = (AsIndexPropertyData) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getCode(), other.getCode()) 
			.append(getName(), other.getName()) 
			.append(getType(), other.getType()) 
			.append(isAllowFacet(), other.isAllowFacet())
			.append(getSupportedBoostOperators(), other.getSupportedBoostOperators()) 
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
		.append(getCode()) 
		.append(getName()) 
		.append(getType()) 
		.append(isAllowFacet())
		.append(getSupportedBoostOperators()) 
		.toHashCode();
	}

}
