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
package de.hybris.platform.solrfacetsearch.config;

import java.io.Serializable;
import de.hybris.platform.solrfacetsearch.config.ValueRange;
import de.hybris.platform.solrfacetsearch.config.ValueRangeType;
import java.util.List;

public  class ValueRangeSet  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ValueRangeSet.qualifier</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private String qualifier;

	/** <i>Generated property</i> for <code>ValueRangeSet.valueRanges</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private List<ValueRange> valueRanges;

	/** <i>Generated property</i> for <code>ValueRangeSet.type</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private ValueRangeType type;
	
	public ValueRangeSet()
	{
		// default constructor
	}
	
		
	
	public void setQualifier(final String qualifier)
	{
		this.qualifier = qualifier;
	}

		
	
	public String getQualifier() 
	{
		return qualifier;
	}
	
		
	
	public void setValueRanges(final List<ValueRange> valueRanges)
	{
		this.valueRanges = valueRanges;
	}

		
	
	public List<ValueRange> getValueRanges() 
	{
		return valueRanges;
	}
	
		
	
	public void setType(final ValueRangeType type)
	{
		this.type = type;
	}

		
	
	public ValueRangeType getType() 
	{
		return type;
	}
	


}
