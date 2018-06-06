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
package de.hybris.platform.cmswebservices.dto;

import java.io.Serializable;

public  class CMSItemSearchWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CMSItemSearchWsDTO.mask</code> property defined at extension <code>cmswebservices</code>. */
		
	private String mask;

	/** <i>Generated property</i> for <code>CMSItemSearchWsDTO.typeCode</code> property defined at extension <code>cmswebservices</code>. */
		
	private String typeCode;

	/** <i>Generated property</i> for <code>CMSItemSearchWsDTO.catalogId</code> property defined at extension <code>cmswebservices</code>. */
		
	private String catalogId;

	/** <i>Generated property</i> for <code>CMSItemSearchWsDTO.catalogVersion</code> property defined at extension <code>cmswebservices</code>. */
		
	private String catalogVersion;

	/** <i>Generated property</i> for <code>CMSItemSearchWsDTO.itemSearchParams</code> property defined at extension <code>cmswebservices</code>. */
		
	private String itemSearchParams;
	
	public CMSItemSearchWsDTO()
	{
		// default constructor
	}
	
		
	
	public void setMask(final String mask)
	{
		this.mask = mask;
	}

		
	
	public String getMask() 
	{
		return mask;
	}
	
		
	
	public void setTypeCode(final String typeCode)
	{
		this.typeCode = typeCode;
	}

		
	
	public String getTypeCode() 
	{
		return typeCode;
	}
	
		
	
	public void setCatalogId(final String catalogId)
	{
		this.catalogId = catalogId;
	}

		
	
	public String getCatalogId() 
	{
		return catalogId;
	}
	
		
	
	public void setCatalogVersion(final String catalogVersion)
	{
		this.catalogVersion = catalogVersion;
	}

		
	
	public String getCatalogVersion() 
	{
		return catalogVersion;
	}
	
		
	
	public void setItemSearchParams(final String itemSearchParams)
	{
		this.itemSearchParams = itemSearchParams;
	}

		
	
	public String getItemSearchParams() 
	{
		return itemSearchParams;
	}
	


}
