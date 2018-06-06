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
package de.hybris.platform.commercewebservicescommons.dto.catalog;

import de.hybris.platform.commercewebservicescommons.dto.catalog.AbstractCatalogItemWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.catalog.CategoryHierarchyWsDTO;
import java.util.Collection;

public  class CatalogVersionWsDTO extends AbstractCatalogItemWsDTO 
{

 

	/** <i>Generated property</i> for <code>CatalogVersionWsDTO.categories</code> property defined at extension <code>commercewebservicescommons</code>. */
		
	private Collection<CategoryHierarchyWsDTO> categories;
	
	public CatalogVersionWsDTO()
	{
		// default constructor
	}
	
		
	
	public void setCategories(final Collection<CategoryHierarchyWsDTO> categories)
	{
		this.categories = categories;
	}

		
	
	public Collection<CategoryHierarchyWsDTO> getCategories() 
	{
		return categories;
	}
	


}
