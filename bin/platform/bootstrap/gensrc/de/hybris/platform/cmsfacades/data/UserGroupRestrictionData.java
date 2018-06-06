/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:37 PM
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

import java.util.List;

public  class UserGroupRestrictionData extends AbstractRestrictionData 
{

 

	/** <i>Generated property</i> for <code>UserGroupRestrictionData.includeSubgroups</code> property defined at extension <code>cmsfacades</code>. */
		
	private boolean includeSubgroups;

	/** <i>Generated property</i> for <code>UserGroupRestrictionData.userGroups</code> property defined at extension <code>cmsfacades</code>. */
		
	private List<String> userGroups;
	
	public UserGroupRestrictionData()
	{
		// default constructor
	}
	
		
	
	public void setIncludeSubgroups(final boolean includeSubgroups)
	{
		this.includeSubgroups = includeSubgroups;
	}

		
	
	public boolean isIncludeSubgroups() 
	{
		return includeSubgroups;
	}
	
		
	
	public void setUserGroups(final List<String> userGroups)
	{
		this.userGroups = userGroups;
	}

		
	
	public List<String> getUserGroups() 
	{
		return userGroups;
	}
	


}
