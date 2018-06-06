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
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public  class CatalogVersionData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CatalogVersionData.uid</code> property defined at extension <code>cmsfacades</code>. */
		
	private String uid;

	/** <i>Generated property</i> for <code>CatalogVersionData.name</code> property defined at extension <code>cmsfacades</code>. */
		
	private Map<String, String> name;

	/** <i>Generated property</i> for <code>CatalogVersionData.catalogVersionDetails</code> property defined at extension <code>cmsfacades</code>. */
		
	private Collection<CatalogVersionDetailData> catalogVersionDetails;

	/** <i>Generated property</i> for <code>CatalogVersionData.active</code> property defined at extension <code>cmsfacades</code>. */
		
	private Boolean active;

	/** <i>Generated property</i> for <code>CatalogVersionData.pageDisplayConditions</code> property defined at extension <code>cmsfacades</code>. */
		
	private List<DisplayConditionData> pageDisplayConditions;

	/** <i>Generated property</i> for <code>CatalogVersionData.version</code> property defined at extension <code>cmsfacades</code>. */
		
	private String version;

	/** <i>Generated property</i> for <code>CatalogVersionData.thumbnailUrl</code> property defined at extension <code>cmsfacades</code>. */
		
	private String thumbnailUrl;

	/** <i>Generated property</i> for <code>CatalogVersionData.uuid</code> property defined at extension <code>cmsfacades</code>. */
		
	private String uuid;
	
	public CatalogVersionData()
	{
		// default constructor
	}
	
	@Deprecated
    /**
     * @deprecated Deprecated since 6.4, attribute releated to CatalogModel, please use de.hybris.platform.cmssmarteditwebservices.data.CatalogData instead.
     */
		
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

	@Deprecated
	/**
	 * @deprecated Deprecated since 6.4, attribute releated to CatalogModel, please use de.hybris.platform.cmssmarteditwebservices.data.CatalogData instead.
	 */
		
	
	public String getUid() 
	{
		return uid;
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
     * @deprecated Deprecated since 6.4, attribute releated to CatalogModel, please use de.hybris.platform.cmssmarteditwebservices.data.CatalogData instead.
     */
		
	
	public void setCatalogVersionDetails(final Collection<CatalogVersionDetailData> catalogVersionDetails)
	{
		this.catalogVersionDetails = catalogVersionDetails;
	}

	@Deprecated
	/**
	 * @deprecated Deprecated since 6.4, attribute releated to CatalogModel, please use de.hybris.platform.cmssmarteditwebservices.data.CatalogData instead.
	 */
		
	
	public Collection<CatalogVersionDetailData> getCatalogVersionDetails() 
	{
		return catalogVersionDetails;
	}
	
		
	
	public void setActive(final Boolean active)
	{
		this.active = active;
	}

		
	
	public Boolean getActive() 
	{
		return active;
	}
	
		
	
	public void setPageDisplayConditions(final List<DisplayConditionData> pageDisplayConditions)
	{
		this.pageDisplayConditions = pageDisplayConditions;
	}

		
	
	public List<DisplayConditionData> getPageDisplayConditions() 
	{
		return pageDisplayConditions;
	}
	
		
	
	public void setVersion(final String version)
	{
		this.version = version;
	}

		
	
	public String getVersion() 
	{
		return version;
	}
	
		
	
	public void setThumbnailUrl(final String thumbnailUrl)
	{
		this.thumbnailUrl = thumbnailUrl;
	}

		
	
	public String getThumbnailUrl() 
	{
		return thumbnailUrl;
	}
	
		
	
	public void setUuid(final String uuid)
	{
		this.uuid = uuid;
	}

		
	
	public String getUuid() 
	{
		return uuid;
	}
	


}
