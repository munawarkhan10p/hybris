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
package de.hybris.platform.commerceservices.search.flexiblesearch.data;

import java.io.Serializable;

public  class SortQueryData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SortQueryData.sortCode</code> property defined at extension <code>commerceservices</code>. */
		
	private String sortCode;

	/** <i>Generated property</i> for <code>SortQueryData.sortName</code> property defined at extension <code>commerceservices</code>. */
		
	private String sortName;

	/** <i>Generated property</i> for <code>SortQueryData.query</code> property defined at extension <code>commerceservices</code>. */
		
	private String query;
	
	public SortQueryData()
	{
		// default constructor
	}
	
		
	
	public void setSortCode(final String sortCode)
	{
		this.sortCode = sortCode;
	}

		
	
	public String getSortCode() 
	{
		return sortCode;
	}
	
		
	
	public void setSortName(final String sortName)
	{
		this.sortName = sortName;
	}

		
	
	public String getSortName() 
	{
		return sortName;
	}
	
		
	
	public void setQuery(final String query)
	{
		this.query = query;
	}

		
	
	public String getQuery() 
	{
		return query;
	}
	


}
