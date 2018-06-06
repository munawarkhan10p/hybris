/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:34 PM
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

import java.util.List;
import java.util.Map;

public  class ProductCarouselComponentData extends AbstractCMSComponentData 
{

 

	/** <i>Generated property</i> for <code>ProductCarouselComponentData.title</code> property defined at extension <code>cmsfacades</code>. */
		
	private Map<String, String> title;

	/** <i>Generated property</i> for <code>ProductCarouselComponentData.products</code> property defined at extension <code>cmsfacades</code>. */
		
	private List<String> products;

	/** <i>Generated property</i> for <code>ProductCarouselComponentData.categories</code> property defined at extension <code>cmsfacades</code>. */
		
	private List<String> categories;
	
	public ProductCarouselComponentData()
	{
		// default constructor
	}
	
		
	
	public void setTitle(final Map<String, String> title)
	{
		this.title = title;
	}

		
	
	public Map<String, String> getTitle() 
	{
		return title;
	}
	
		
	
	public void setProducts(final List<String> products)
	{
		this.products = products;
	}

		
	
	public List<String> getProducts() 
	{
		return products;
	}
	
		
	
	public void setCategories(final List<String> categories)
	{
		this.categories = categories;
	}

		
	
	public List<String> getCategories() 
	{
		return categories;
	}
	


}
