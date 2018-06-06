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
package de.hybris.platform.solrfacetsearch.config;

import java.io.Serializable;

public  class SearchQuerySort  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SearchQuerySort.field</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private String field;

	/** <i>Generated property</i> for <code>SearchQuerySort.ascending</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private boolean ascending;
	
	public SearchQuerySort()
	{
		// default constructor
	}
	
		
	
	public void setField(final String field)
	{
		this.field = field;
	}

		
	
	public String getField() 
	{
		return field;
	}
	
		
	
	public void setAscending(final boolean ascending)
	{
		this.ascending = ascending;
	}

		
	
	public boolean isAscending() 
	{
		return ascending;
	}
	


}
