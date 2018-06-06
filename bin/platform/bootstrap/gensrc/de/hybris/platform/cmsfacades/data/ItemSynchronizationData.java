/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:41 PM
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

public  class ItemSynchronizationData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ItemSynchronizationData.itemId</code> property defined at extension <code>cmsfacades</code>. */
		
	private String itemId;

	/** <i>Generated property</i> for <code>ItemSynchronizationData.itemType</code> property defined at extension <code>cmsfacades</code>. */
		
	private String itemType;
	
	public ItemSynchronizationData()
	{
		// default constructor
	}
	
		
	
	public void setItemId(final String itemId)
	{
		this.itemId = itemId;
	}

		
	
	public String getItemId() 
	{
		return itemId;
	}
	
		
	
	public void setItemType(final String itemType)
	{
		this.itemType = itemType;
	}

		
	
	public String getItemType() 
	{
		return itemType;
	}
	


}
