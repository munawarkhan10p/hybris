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
import de.hybris.platform.adaptivesearch.enums.AsFacetType;

public  class AbstractAsFacetConfiguration  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AbstractAsFacetConfiguration.uid</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String uid;

	/** <i>Generated property</i> for <code>AbstractAsFacetConfiguration.indexProperty</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String indexProperty;

	/** <i>Generated property</i> for <code>AbstractAsFacetConfiguration.priority</code> property defined at extension <code>adaptivesearch</code>. */
		
	private Integer priority;

	/** <i>Generated property</i> for <code>AbstractAsFacetConfiguration.facetType</code> property defined at extension <code>adaptivesearch</code>. */
		
	private AsFacetType facetType;

	/** <i>Generated property</i> for <code>AbstractAsFacetConfiguration.valuesSortProvider</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String valuesSortProvider;

	/** <i>Generated property</i> for <code>AbstractAsFacetConfiguration.valuesDisplayNameProvider</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String valuesDisplayNameProvider;

	/** <i>Generated property</i> for <code>AbstractAsFacetConfiguration.topValuesProvider</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String topValuesProvider;
	
	public AbstractAsFacetConfiguration()
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
	
		
	
	public void setIndexProperty(final String indexProperty)
	{
		this.indexProperty = indexProperty;
	}

		
	
	public String getIndexProperty() 
	{
		return indexProperty;
	}
	
		
	
	public void setPriority(final Integer priority)
	{
		this.priority = priority;
	}

		
	
	public Integer getPriority() 
	{
		return priority;
	}
	
		
	
	public void setFacetType(final AsFacetType facetType)
	{
		this.facetType = facetType;
	}

		
	
	public AsFacetType getFacetType() 
	{
		return facetType;
	}
	
		
	
	public void setValuesSortProvider(final String valuesSortProvider)
	{
		this.valuesSortProvider = valuesSortProvider;
	}

		
	
	public String getValuesSortProvider() 
	{
		return valuesSortProvider;
	}
	
		
	
	public void setValuesDisplayNameProvider(final String valuesDisplayNameProvider)
	{
		this.valuesDisplayNameProvider = valuesDisplayNameProvider;
	}

		
	
	public String getValuesDisplayNameProvider() 
	{
		return valuesDisplayNameProvider;
	}
	
		
	
	public void setTopValuesProvider(final String topValuesProvider)
	{
		this.topValuesProvider = topValuesProvider;
	}

		
	
	public String getTopValuesProvider() 
	{
		return topValuesProvider;
	}
	


}
