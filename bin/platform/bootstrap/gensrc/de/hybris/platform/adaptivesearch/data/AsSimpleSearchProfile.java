/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:30 PM
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

import de.hybris.platform.adaptivesearch.data.AbstractAsSearchProfile;
import de.hybris.platform.adaptivesearch.data.AsConfigurableSearchConfiguration;

public  class AsSimpleSearchProfile extends AbstractAsSearchProfile 
{

 

	/** <i>Generated property</i> for <code>AsSimpleSearchProfile.searchConfiguration</code> property defined at extension <code>adaptivesearch</code>. */
		
	private AsConfigurableSearchConfiguration searchConfiguration;
	
	public AsSimpleSearchProfile()
	{
		// default constructor
	}
	
		
	
	public void setSearchConfiguration(final AsConfigurableSearchConfiguration searchConfiguration)
	{
		this.searchConfiguration = searchConfiguration;
	}

		
	
	public AsConfigurableSearchConfiguration getSearchConfiguration() 
	{
		return searchConfiguration;
	}
	


}
