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
package de.hybris.platform.adaptivesearch.data;

import java.io.Serializable;
import de.hybris.platform.adaptivesearch.data.AsDocumentData;
import de.hybris.platform.adaptivesearch.data.AsFacetData;
import de.hybris.platform.adaptivesearch.data.AsPaginationData;
import de.hybris.platform.adaptivesearch.data.AsSearchProfileResult;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.category.model.CategoryModel;
import java.util.List;

public  class AsSearchResultData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsSearchResultData.pagination</code> property defined at extension <code>adaptivesearch</code>. */
		
	private AsPaginationData pagination;

	/** <i>Generated property</i> for <code>AsSearchResultData.results</code> property defined at extension <code>adaptivesearch</code>. */
		
	private List<AsDocumentData> results;

	/** <i>Generated property</i> for <code>AsSearchResultData.facets</code> property defined at extension <code>adaptivesearch</code>. */
		
	private List<AsFacetData> facets;

	/** <i>Generated property</i> for <code>AsSearchResultData.searchProfileResult</code> property defined at extension <code>adaptivesearch</code>. */
		
	private AsSearchProfileResult searchProfileResult;

	/** <i>Generated property</i> for <code>AsSearchResultData.catalogVersions</code> property defined at extension <code>adaptivesearch</code>. */
		
	private List<CatalogVersionModel> catalogVersions;

	/** <i>Generated property</i> for <code>AsSearchResultData.categoryPath</code> property defined at extension <code>adaptivesearch</code>. */
		
	private List<CategoryModel> categoryPath;
	
	public AsSearchResultData()
	{
		// default constructor
	}
	
		
	
	public void setPagination(final AsPaginationData pagination)
	{
		this.pagination = pagination;
	}

		
	
	public AsPaginationData getPagination() 
	{
		return pagination;
	}
	
		
	
	public void setResults(final List<AsDocumentData> results)
	{
		this.results = results;
	}

		
	
	public List<AsDocumentData> getResults() 
	{
		return results;
	}
	
		
	
	public void setFacets(final List<AsFacetData> facets)
	{
		this.facets = facets;
	}

		
	
	public List<AsFacetData> getFacets() 
	{
		return facets;
	}
	
		
	
	public void setSearchProfileResult(final AsSearchProfileResult searchProfileResult)
	{
		this.searchProfileResult = searchProfileResult;
	}

		
	
	public AsSearchProfileResult getSearchProfileResult() 
	{
		return searchProfileResult;
	}
	
		
	
	public void setCatalogVersions(final List<CatalogVersionModel> catalogVersions)
	{
		this.catalogVersions = catalogVersions;
	}

		
	
	public List<CatalogVersionModel> getCatalogVersions() 
	{
		return catalogVersions;
	}
	
		
	
	public void setCategoryPath(final List<CategoryModel> categoryPath)
	{
		this.categoryPath = categoryPath;
	}

		
	
	public List<CategoryModel> getCategoryPath() 
	{
		return categoryPath;
	}
	


}
