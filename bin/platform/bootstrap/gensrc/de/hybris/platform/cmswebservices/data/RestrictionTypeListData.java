/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:33 PM
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
import de.hybris.platform.cmswebservices.data.RestrictionTypeData;
import java.util.List;

public  class RestrictionTypeListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RestrictionTypeListData.restrictionTypes</code> property defined at extension <code>cmswebservices</code>. */
		
	private List<RestrictionTypeData> restrictionTypes;
	
	public RestrictionTypeListData()
	{
		// default constructor
	}
	
		
	
	public void setRestrictionTypes(final List<RestrictionTypeData> restrictionTypes)
	{
		this.restrictionTypes = restrictionTypes;
	}

		
	
	public List<RestrictionTypeData> getRestrictionTypes() 
	{
		return restrictionTypes;
	}
	


}
