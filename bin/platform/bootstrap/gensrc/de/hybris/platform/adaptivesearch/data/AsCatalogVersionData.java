/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:40 PM
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

public  class AsCatalogVersionData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsCatalogVersionData.catalogId</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String catalogId;

	/** <i>Generated property</i> for <code>AsCatalogVersionData.version</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String version;

	/** <i>Generated property</i> for <code>AsCatalogVersionData.active</code> property defined at extension <code>adaptivesearch</code>. */
		
	private boolean active;

	/** <i>Generated property</i> for <code>AsCatalogVersionData.name</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String name;
	
	public AsCatalogVersionData()
	{
		// default constructor
	}
	
		
	
	public void setCatalogId(final String catalogId)
	{
		this.catalogId = catalogId;
	}

		
	
	public String getCatalogId() 
	{
		return catalogId;
	}
	
		
	
	public void setVersion(final String version)
	{
		this.version = version;
	}

		
	
	public String getVersion() 
	{
		return version;
	}
	
		
	
	public void setActive(final boolean active)
	{
		this.active = active;
	}

		
	
	public boolean isActive() 
	{
		return active;
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final AsCatalogVersionData other = (AsCatalogVersionData) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getCatalogId(), other.getCatalogId()) 
			.append(getVersion(), other.getVersion()) 
			.append(isActive(), other.isActive())
			.append(getName(), other.getName()) 
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
		.append(getCatalogId()) 
		.append(getVersion()) 
		.append(isActive())
		.append(getName()) 
		.toHashCode();
	}

}
