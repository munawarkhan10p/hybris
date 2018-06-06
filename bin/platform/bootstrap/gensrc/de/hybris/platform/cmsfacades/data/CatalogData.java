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
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;
import de.hybris.platform.cmsfacades.data.CatalogVersionData;
import java.util.List;
import java.util.Map;

public  class CatalogData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CatalogData.catalogId</code> property defined at extension <code>cmsfacades</code>. */
		
	private String catalogId;

	/** <i>Generated property</i> for <code>CatalogData.name</code> property defined at extension <code>cmsfacades</code>. */
		
	private Map<String, String> name;

	/** <i>Generated property</i> for <code>CatalogData.versions</code> property defined at extension <code>cmssmarteditwebservices</code>. */
		
	private List<CatalogVersionData> versions;
	
	public CatalogData()
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
	
		
	
	public void setName(final Map<String, String> name)
	{
		this.name = name;
	}

		
	
	public Map<String, String> getName() 
	{
		return name;
	}
	
		
	
	public void setVersions(final List<CatalogVersionData> versions)
	{
		this.versions = versions;
	}

		
	
	public List<CatalogVersionData> getVersions() 
	{
		return versions;
	}
	


}
