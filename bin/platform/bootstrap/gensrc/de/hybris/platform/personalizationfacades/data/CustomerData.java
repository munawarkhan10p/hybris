/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:39 PM
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
package de.hybris.platform.personalizationfacades.data;

import java.io.Serializable;
import de.hybris.platform.personalizationfacades.data.CustomerSegmentationData;
import java.util.List;

public  class CustomerData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CustomerData.uid</code> property defined at extension <code>personalizationfacades</code>. */
		
	private String uid;

	/** <i>Generated property</i> for <code>CustomerData.segmentLinks</code> property defined at extension <code>personalizationfacades</code>. */
		
	private List<CustomerSegmentationData> segmentLinks;
	
	public CustomerData()
	{
		// default constructor
	}
	
		
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

		
	
	public String getUid() 
	{
		return uid;
	}
	
		
	
	public void setSegmentLinks(final List<CustomerSegmentationData> segmentLinks)
	{
		this.segmentLinks = segmentLinks;
	}

		
	
	public List<CustomerSegmentationData> getSegmentLinks() 
	{
		return segmentLinks;
	}
	


}
