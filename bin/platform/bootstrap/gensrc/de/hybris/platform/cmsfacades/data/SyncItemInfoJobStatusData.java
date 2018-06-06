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
import de.hybris.platform.core.model.ItemModel;

public  class SyncItemInfoJobStatusData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SyncItemInfoJobStatusData.item</code> property defined at extension <code>cmsfacades</code>. */
		
	private ItemModel item;

	/** <i>Generated property</i> for <code>SyncItemInfoJobStatusData.syncStatus</code> property defined at extension <code>cmsfacades</code>. */
		
	private String syncStatus;
	
	public SyncItemInfoJobStatusData()
	{
		// default constructor
	}
	
		
	
	public void setItem(final ItemModel item)
	{
		this.item = item;
	}

		
	
	public ItemModel getItem() 
	{
		return item;
	}
	
		
	
	public void setSyncStatus(final String syncStatus)
	{
		this.syncStatus = syncStatus;
	}

		
	
	public String getSyncStatus() 
	{
		return syncStatus;
	}
	


}
