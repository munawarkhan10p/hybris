/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:32 PM
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
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;
import java.util.Collection;

public  class SiteListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SiteListData.sites</code> property defined at extension <code>cmswebservices</code>. */
		
	private Collection<SiteData> sites;
	
	public SiteListData()
	{
		// default constructor
	}
	
		
	
	public void setSites(final Collection<SiteData> sites)
	{
		this.sites = sites;
	}

		
	
	public Collection<SiteData> getSites() 
	{
		return sites;
	}
	


}
