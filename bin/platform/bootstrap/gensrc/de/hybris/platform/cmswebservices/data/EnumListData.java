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
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;
import java.util.List;

/**
 * Deprecated as of version 6.2
 */
public  class EnumListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>EnumListData.enums</code> property defined at extension <code>cmswebservices</code>. */
		
	private List<EnumData> enums;
	
	public EnumListData()
	{
		// default constructor
	}
	
		
	
	public void setEnums(final List<EnumData> enums)
	{
		this.enums = enums;
	}

		
	
	public List<EnumData> getEnums() 
	{
		return enums;
	}
	


}
