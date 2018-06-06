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
package de.hybris.platform.cmsfacades.data;

import java.util.List;

public  class CategoryRestrictionData extends AbstractRestrictionData 
{

 

	/** <i>Generated property</i> for <code>CategoryRestrictionData.recursive</code> property defined at extension <code>cmsfacades</code>. */
		
	private boolean recursive;

	/** <i>Generated property</i> for <code>CategoryRestrictionData.categories</code> property defined at extension <code>cmsfacades</code>. */
		
	private List<String> categories;
	
	public CategoryRestrictionData()
	{
		// default constructor
	}
	
		
	
	public void setRecursive(final boolean recursive)
	{
		this.recursive = recursive;
	}

		
	
	public boolean isRecursive() 
	{
		return recursive;
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
