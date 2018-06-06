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
package de.hybris.platform.webservicescommons.dto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Pagination info
 */
@ApiModel(value="pagination", description="Pagination info")
public  class PaginationWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** Number of elements on this page<br/><br/><i>Generated property</i> for <code>PaginationWsDTO.count</code> property defined at extension <code>webservicescommons</code>. */
	@ApiModelProperty(name="count", value="Number of elements on this page") 	
	private int count;

	/** Total number of elements<br/><br/><i>Generated property</i> for <code>PaginationWsDTO.totalCount</code> property defined at extension <code>webservicescommons</code>. */
	@ApiModelProperty(name="totalCount", value="Total number of elements") 	
	private long totalCount;

	/** Current page number<br/><br/><i>Generated property</i> for <code>PaginationWsDTO.page</code> property defined at extension <code>webservicescommons</code>. */
	@ApiModelProperty(name="page", value="Current page number") 	
	private int page;

	/** Total number of pages<br/><br/><i>Generated property</i> for <code>PaginationWsDTO.totalPages</code> property defined at extension <code>webservicescommons</code>. */
	@ApiModelProperty(name="totalPages", value="Total number of pages") 	
	private int totalPages;
	
	public PaginationWsDTO()
	{
		// default constructor
	}
	
		
	
	public void setCount(final int count)
	{
		this.count = count;
	}

		
	
	public int getCount() 
	{
		return count;
	}
	
		
	
	public void setTotalCount(final long totalCount)
	{
		this.totalCount = totalCount;
	}

		
	
	public long getTotalCount() 
	{
		return totalCount;
	}
	
		
	
	public void setPage(final int page)
	{
		this.page = page;
	}

		
	
	public int getPage() 
	{
		return page;
	}
	
		
	
	public void setTotalPages(final int totalPages)
	{
		this.totalPages = totalPages;
	}

		
	
	public int getTotalPages() 
	{
		return totalPages;
	}
	


}
