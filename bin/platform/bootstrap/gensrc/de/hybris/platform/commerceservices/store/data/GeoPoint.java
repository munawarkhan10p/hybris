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
package de.hybris.platform.commerceservices.store.data;

import java.io.Serializable;

public  class GeoPoint  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>GeoPoint.latitude</code> property defined at extension <code>commerceservices</code>. */
		
	private double latitude;

	/** <i>Generated property</i> for <code>GeoPoint.longitude</code> property defined at extension <code>commerceservices</code>. */
		
	private double longitude;
	
	public GeoPoint()
	{
		// default constructor
	}
	
		
	
	public void setLatitude(final double latitude)
	{
		this.latitude = latitude;
	}

		
	
	public double getLatitude() 
	{
		return latitude;
	}
	
		
	
	public void setLongitude(final double longitude)
	{
		this.longitude = longitude;
	}

		
	
	public double getLongitude() 
	{
		return longitude;
	}
	


}
