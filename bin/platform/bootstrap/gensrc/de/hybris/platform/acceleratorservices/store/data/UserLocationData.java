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
package de.hybris.platform.acceleratorservices.store.data;

import java.io.Serializable;
import de.hybris.platform.commerceservices.store.data.GeoPoint;

public  class UserLocationData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>UserLocationData.searchTerm</code> property defined at extension <code>acceleratorservices</code>. */
		
	private String searchTerm;

	/** <i>Generated property</i> for <code>UserLocationData.point</code> property defined at extension <code>acceleratorservices</code>. */
		
	private GeoPoint point;
	
	public UserLocationData()
	{
		// default constructor
	}
	
		
	
	public void setSearchTerm(final String searchTerm)
	{
		this.searchTerm = searchTerm;
	}

		
	
	public String getSearchTerm() 
	{
		return searchTerm;
	}
	
		
	
	public void setPoint(final GeoPoint point)
	{
		this.point = point;
	}

		
	
	public GeoPoint getPoint() 
	{
		return point;
	}
	


}
