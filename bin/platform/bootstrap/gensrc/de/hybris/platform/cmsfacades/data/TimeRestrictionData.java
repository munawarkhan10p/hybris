/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:31 PM
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

import java.util.Date;

public  class TimeRestrictionData extends AbstractRestrictionData 
{

 

	/** <i>Generated property</i> for <code>TimeRestrictionData.activeFrom</code> property defined at extension <code>cmsfacades</code>. */
		
	private Date activeFrom;

	/** <i>Generated property</i> for <code>TimeRestrictionData.activeUntil</code> property defined at extension <code>cmsfacades</code>. */
		
	private Date activeUntil;
	
	public TimeRestrictionData()
	{
		// default constructor
	}
	
		
	
	public void setActiveFrom(final Date activeFrom)
	{
		this.activeFrom = activeFrom;
	}

		
	
	public Date getActiveFrom() 
	{
		return activeFrom;
	}
	
		
	
	public void setActiveUntil(final Date activeUntil)
	{
		this.activeUntil = activeUntil;
	}

		
	
	public Date getActiveUntil() 
	{
		return activeUntil;
	}
	


}
