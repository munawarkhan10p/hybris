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
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public  class SiteData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SiteData.uid</code> property defined at extension <code>cmsfacades</code>. */
		
	private String uid;

	/** <i>Generated property</i> for <code>SiteData.previewUrl</code> property defined at extension <code>cmsfacades</code>. */
		
	private String previewUrl;

	/** <i>Generated property</i> for <code>SiteData.redirectUrl</code> property defined at extension <code>cmsfacades</code>. */
		
	private String redirectUrl;

	/** <i>Generated property</i> for <code>SiteData.name</code> property defined at extension <code>cmsfacades</code>. */
		
	private Map<String, String> name;

	/** <i>Generated property</i> for <code>SiteData.thumbnailUrl</code> property defined at extension <code>cmsfacades</code>. */
		
	private String thumbnailUrl;

	/** <i>Generated property</i> for <code>SiteData.contentCatalogs</code> property defined at extension <code>cmsfacades</code>. */
		
	private List<String> contentCatalogs;
	
	public SiteData()
	{
		// default constructor
	}
	
		
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

		
	
	public String getUid() 
	{
		return uid;
	}
	
		
	
	public void setPreviewUrl(final String previewUrl)
	{
		this.previewUrl = previewUrl;
	}

		
	
	public String getPreviewUrl() 
	{
		return previewUrl;
	}
	
	@Deprecated
    /**
     * @deprecated Deprecated since 6.4
     */
		
	
	public void setRedirectUrl(final String redirectUrl)
	{
		this.redirectUrl = redirectUrl;
	}

	@Deprecated
	/**
	 * @deprecated Deprecated since 6.4
	 */
		
	
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
	
	@Deprecated
    /**
     * @deprecated Deprecated since 6.4, please use de.hybris.platform.cmssmarteditwebservices.data.CatalogData instead.
     */
		
	
	public void setThumbnailUrl(final String thumbnailUrl)
	{
		this.thumbnailUrl = thumbnailUrl;
	}

	@Deprecated
	/**
	 * @deprecated Deprecated since 6.4, please use de.hybris.platform.cmssmarteditwebservices.data.CatalogData instead.
	 */
		
	
	public String getThumbnailUrl() 
	{
		return thumbnailUrl;
	}
	
		
	
	public void setContentCatalogs(final List<String> contentCatalogs)
	{
		this.contentCatalogs = contentCatalogs;
	}

		
	
	public List<String> getContentCatalogs() 
	{
		return contentCatalogs;
	}
	


}
