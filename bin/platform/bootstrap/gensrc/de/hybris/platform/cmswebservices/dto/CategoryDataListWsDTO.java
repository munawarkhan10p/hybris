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
package de.hybris.platform.cmswebservices.dto;

import java.io.Serializable;
import de.hybris.platform.webservicescommons.dto.PaginationWsDTO;
import java.util.List;

public  class CategoryDataListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CategoryDataListWsDTO.productCategories</code> property defined at extension <code>cmswebservices</code>. */
		
	private List<CategoryWsDTO> productCategories;

	/** <i>Generated property</i> for <code>CategoryDataListWsDTO.pagination</code> property defined at extension <code>cmswebservices</code>. */
		
	private PaginationWsDTO pagination;
	
	public CategoryDataListWsDTO()
	{
		// default constructor
	}
	
		
	
	public void setProductCategories(final List<CategoryWsDTO> productCategories)
	{
		this.productCategories = productCategories;
	}

		
	
	public List<CategoryWsDTO> getProductCategories() 
	{
		return productCategories;
	}
	
		
	
	public void setPagination(final PaginationWsDTO pagination)
	{
		this.pagination = pagination;
	}

		
	
	public PaginationWsDTO getPagination() 
	{
		return pagination;
	}
	


}
