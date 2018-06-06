/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:35 PM
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

public  class SyncItemStatusWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SyncItemStatusWsDTO.itemId</code> property defined at extension <code>cmswebservices</code>. */
		
	private String itemId;

	/** <i>Generated property</i> for <code>SyncItemStatusWsDTO.itemType</code> property defined at extension <code>cmswebservices</code>. */
		
	private String itemType;

	/** <i>Generated property</i> for <code>SyncItemStatusWsDTO.name</code> property defined at extension <code>cmswebservices</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>SyncItemStatusWsDTO.status</code> property defined at extension <code>cmswebservices</code>. */
		
	private String status;

	/** <i>Generated property</i> for <code>SyncItemStatusWsDTO.lastSyncStatus</code> property defined at extension <code>cmswebservices</code>. */
		
	private Long lastSyncStatus;

	/** <i>Generated property</i> for <code>SyncItemStatusWsDTO.dependentItemTypesOutOfSync</code> property defined at extension <code>cmswebservices</code>. */
		
	private List<ItemTypeWsDTO> dependentItemTypesOutOfSync;

	/** <i>Generated property</i> for <code>SyncItemStatusWsDTO.selectedDependencies</code> property defined at extension <code>cmswebservices</code>. */
		
	private List<SyncItemStatusWsDTO> selectedDependencies;

	/** <i>Generated property</i> for <code>SyncItemStatusWsDTO.sharedDependencies</code> property defined at extension <code>cmswebservices</code>. */
		
	private List<SyncItemStatusWsDTO> sharedDependencies;
	
	public SyncItemStatusWsDTO()
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
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	
		
	
	public void setStatus(final String status)
	{
		this.status = status;
	}

		
	
	public String getStatus() 
	{
		return status;
	}
	
		
	
	public void setLastSyncStatus(final Long lastSyncStatus)
	{
		this.lastSyncStatus = lastSyncStatus;
	}

		
	
	public Long getLastSyncStatus() 
	{
		return lastSyncStatus;
	}
	
		
	
	public void setDependentItemTypesOutOfSync(final List<ItemTypeWsDTO> dependentItemTypesOutOfSync)
	{
		this.dependentItemTypesOutOfSync = dependentItemTypesOutOfSync;
	}

		
	
	public List<ItemTypeWsDTO> getDependentItemTypesOutOfSync() 
	{
		return dependentItemTypesOutOfSync;
	}
	
		
	
	public void setSelectedDependencies(final List<SyncItemStatusWsDTO> selectedDependencies)
	{
		this.selectedDependencies = selectedDependencies;
	}

		
	
	public List<SyncItemStatusWsDTO> getSelectedDependencies() 
	{
		return selectedDependencies;
	}
	
		
	
	public void setSharedDependencies(final List<SyncItemStatusWsDTO> sharedDependencies)
	{
		this.sharedDependencies = sharedDependencies;
	}

		
	
	public List<SyncItemStatusWsDTO> getSharedDependencies() 
	{
		return sharedDependencies;
	}
	


}
