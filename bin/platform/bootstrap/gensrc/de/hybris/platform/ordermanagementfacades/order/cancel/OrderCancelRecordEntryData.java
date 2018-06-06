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
package de.hybris.platform.ordermanagementfacades.order.cancel;

import java.io.Serializable;
import de.hybris.platform.basecommerce.enums.CancelReason;

public  class OrderCancelRecordEntryData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>OrderCancelRecordEntryData.cancelResult</code> property defined at extension <code>ordermanagementfacades</code>. */
		
	private String cancelResult;

	/** <i>Generated property</i> for <code>OrderCancelRecordEntryData.refusedMessage</code> property defined at extension <code>ordermanagementfacades</code>. */
		
	private String refusedMessage;

	/** <i>Generated property</i> for <code>OrderCancelRecordEntryData.cancelReason</code> property defined at extension <code>ordermanagementfacades</code>. */
		
	private CancelReason cancelReason;
	
	public OrderCancelRecordEntryData()
	{
		// default constructor
	}
	
		
	
	public void setCancelResult(final String cancelResult)
	{
		this.cancelResult = cancelResult;
	}

		
	
	public String getCancelResult() 
	{
		return cancelResult;
	}
	
		
	
	public void setRefusedMessage(final String refusedMessage)
	{
		this.refusedMessage = refusedMessage;
	}

		
	
	public String getRefusedMessage() 
	{
		return refusedMessage;
	}
	
		
	
	public void setCancelReason(final CancelReason cancelReason)
	{
		this.cancelReason = cancelReason;
	}

		
	
	public CancelReason getCancelReason() 
	{
		return cancelReason;
	}
	


}
