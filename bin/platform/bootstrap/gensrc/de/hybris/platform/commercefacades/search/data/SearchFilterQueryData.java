/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:38 PM
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
package de.hybris.platform.commercefacades.search.data;

import java.io.Serializable;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.FilterQueryOperator;
import java.util.Set;

public  class SearchFilterQueryData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SearchFilterQueryData.key</code> property defined at extension <code>commercefacades</code>. */
		
	private String key;

	/** <i>Generated property</i> for <code>SearchFilterQueryData.operator</code> property defined at extension <code>commercefacades</code>. */
		
	private FilterQueryOperator operator;

	/** <i>Generated property</i> for <code>SearchFilterQueryData.values</code> property defined at extension <code>commercefacades</code>. */
		
	private Set<String> values;
	
	public SearchFilterQueryData()
	{
		// default constructor
	}
	
		
	
	public void setKey(final String key)
	{
		this.key = key;
	}

		
	
	public String getKey() 
	{
		return key;
	}
	
		
	
	public void setOperator(final FilterQueryOperator operator)
	{
		this.operator = operator;
	}

		
	
	public FilterQueryOperator getOperator() 
	{
		return operator;
	}
	
		
	
	public void setValues(final Set<String> values)
	{
		this.values = values;
	}

		
	
	public Set<String> getValues() 
	{
		return values;
	}
	


}
