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
package de.hybris.platform.commercefacades.user.data;

import de.hybris.platform.commercefacades.user.data.UserGroupData;
import java.util.List;

public  class CustomerListData extends UserGroupData 
{

 

	/** <i>Generated property</i> for <code>CustomerListData.additionalColumnsKeys</code> property defined at extension <code>commercefacades</code>. */
		
	private List<String> additionalColumnsKeys;

	/** <i>Generated property</i> for <code>CustomerListData.searchBoxEnabled</code> property defined at extension <code>commercefacades</code>. */
		
	private boolean searchBoxEnabled;
	
	public CustomerListData()
	{
		// default constructor
	}
	
		
	
	public void setAdditionalColumnsKeys(final List<String> additionalColumnsKeys)
	{
		this.additionalColumnsKeys = additionalColumnsKeys;
	}

		
	
	public List<String> getAdditionalColumnsKeys() 
	{
		return additionalColumnsKeys;
	}
	
		
	
	public void setSearchBoxEnabled(final boolean searchBoxEnabled)
	{
		this.searchBoxEnabled = searchBoxEnabled;
	}

		
	
	public boolean isSearchBoxEnabled() 
	{
		return searchBoxEnabled;
	}
	


}
