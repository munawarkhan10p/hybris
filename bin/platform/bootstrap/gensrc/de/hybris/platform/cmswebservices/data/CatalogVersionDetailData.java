/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:34 PM
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
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;
import java.util.Map;

/**
 * @deprecated Deprecated since 6.4, please use de.hybris.platform.cmssmarteditwebservices.data.CatalogData instead.
 */
@Deprecated
public  class CatalogVersionDetailData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CatalogVersionDetailData.catalogId</code> property defined at extension <code>cmswebservices</code>. */
		
	private String catalogId;

	/** <i>Generated property</i> for <code>CatalogVersionDetailData.redirectUrl</code> property defined at extension <code>cmswebservices</code>. */
		
	private String redirectUrl;

	/** <i>Generated property</i> for <code>CatalogVersionDetailData.name</code> property defined at extension <code>cmswebservices</code>. */
		
	private Map<String, String> name;

	/** <i>Generated property</i> for <code>CatalogVersionDetailData.version</code> property defined at extension <code>cmswebservices</code>. */
		
	private String version;

	/** <i>Generated property</i> for <code>CatalogVersionDetailData.active</code> property defined at extension <code>cmswebservices</code>. */
		
	private Boolean active;

	/** <i>Generated property</i> for <code>CatalogVersionDetailData.thumbnailUrl</code> property defined at extension <code>cmswebservices</code>. */
		
	private String thumbnailUrl;
	
	public CatalogVersionDetailData()
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
	
		
	
	public void setRedirectUrl(final String redirectUrl)
	{
		this.redirectUrl = redirectUrl;
	}

		
	
	public String getRedirectUrl() 
	{
		return redirectUrl;
	}
	
		
	
	public void setName(final Map<String, String> name)
	{
		this.name = name;
	}

		
	
	public Map<String, String> getName() 
	{
		return name;
	}
	
		
	
	public void setVersion(final String version)
	{
		this.version = version;
	}

		
	
	public String getVersion() 
	{
		return version;
	}
	
		
	
	public void setActive(final Boolean active)
	{
		this.active = active;
	}

		
	
	public Boolean getActive() 
	{
		return active;
	}
	
		
	
	public void setThumbnailUrl(final String thumbnailUrl)
	{
		this.thumbnailUrl = thumbnailUrl;
	}

		
	
	public String getThumbnailUrl() 
	{
		return thumbnailUrl;
	}
	


}
