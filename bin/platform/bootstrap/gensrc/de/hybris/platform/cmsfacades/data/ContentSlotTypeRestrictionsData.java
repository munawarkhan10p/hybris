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
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;
import java.util.List;

public  class ContentSlotTypeRestrictionsData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ContentSlotTypeRestrictionsData.contentSlotUid</code> property defined at extension <code>cmsfacades</code>. */
		
	private String contentSlotUid;

	/** <i>Generated property</i> for <code>ContentSlotTypeRestrictionsData.validComponentTypes</code> property defined at extension <code>cmsfacades</code>. */
		
	private List<String> validComponentTypes;
	
	public ContentSlotTypeRestrictionsData()
	{
		// default constructor
	}
	
		
	
	public void setContentSlotUid(final String contentSlotUid)
	{
		this.contentSlotUid = contentSlotUid;
	}

		
	
	public String getContentSlotUid() 
	{
		return contentSlotUid;
	}
	
		
	
	public void setValidComponentTypes(final List<String> validComponentTypes)
	{
		this.validComponentTypes = validComponentTypes;
	}

		
	
	public List<String> getValidComponentTypes() 
	{
		return validComponentTypes;
	}
	


}
