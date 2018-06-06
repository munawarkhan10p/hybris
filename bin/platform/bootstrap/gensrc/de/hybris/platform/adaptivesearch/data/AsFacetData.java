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
package de.hybris.platform.adaptivesearch.data;

import java.io.Serializable;
import de.hybris.platform.adaptivesearch.data.AsFacetValueData;
import java.util.Collection;

public  class AsFacetData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsFacetData.indexProperty</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String indexProperty;

	/** <i>Generated property</i> for <code>AsFacetData.name</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>AsFacetData.values</code> property defined at extension <code>adaptivesearch</code>. */
		
	private Collection<AsFacetValueData> values;
	
	public AsFacetData()
	{
		// default constructor
	}
	
		
	
	public void setIndexProperty(final String indexProperty)
	{
		this.indexProperty = indexProperty;
	}

		
	
	public String getIndexProperty() 
	{
		return indexProperty;
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	
		
	
	public void setValues(final Collection<AsFacetValueData> values)
	{
		this.values = values;
	}

		
	
	public Collection<AsFacetValueData> getValues() 
	{
		return values;
	}
	


}
