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
package de.hybris.platform.adaptivesearchbackoffice.data;

import java.io.Serializable;
import de.hybris.platform.adaptivesearch.data.AsSearchResultData;
import de.hybris.platform.adaptivesearchbackoffice.data.NavigationContextData;
import de.hybris.platform.adaptivesearchbackoffice.data.SearchContextData;

public  class SearchResultData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SearchResultData.navigationContext</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private NavigationContextData navigationContext;

	/** <i>Generated property</i> for <code>SearchResultData.searchContext</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private SearchContextData searchContext;

	/** <i>Generated property</i> for <code>SearchResultData.asSearchResult</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private AsSearchResultData asSearchResult;
	
	public SearchResultData()
	{
		// default constructor
	}
	
		
	
	public void setNavigationContext(final NavigationContextData navigationContext)
	{
		this.navigationContext = navigationContext;
	}

		
	
	public NavigationContextData getNavigationContext() 
	{
		return navigationContext;
	}
	
		
	
	public void setSearchContext(final SearchContextData searchContext)
	{
		this.searchContext = searchContext;
	}

		
	
	public SearchContextData getSearchContext() 
	{
		return searchContext;
	}
	
		
	
	public void setAsSearchResult(final AsSearchResultData asSearchResult)
	{
		this.asSearchResult = asSearchResult;
	}

		
	
	public AsSearchResultData getAsSearchResult() 
	{
		return asSearchResult;
	}
	


}
