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
package de.hybris.platform.ycommercewebservices.queues.data;

import java.io.Serializable;

public  class OrderStatusUpdateElementData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>OrderStatusUpdateElementData.code</code> property defined at extension <code>ycommercewebservices</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>OrderStatusUpdateElementData.status</code> property defined at extension <code>ycommercewebservices</code>. */
		
	private String status;

	/** <i>Generated property</i> for <code>OrderStatusUpdateElementData.baseSiteId</code> property defined at extension <code>ycommercewebservices</code>. */
		
	private String baseSiteId;
	
	public OrderStatusUpdateElementData()
	{
		// default constructor
	}
	
		
	
	public void setCode(final String code)
	{
		this.code = code;
	}

		
	
	public String getCode() 
	{
		return code;
	}
	
		
	
	public void setStatus(final String status)
	{
		this.status = status;
	}

		
	
	public String getStatus() 
	{
		return status;
	}
	
		
	
	public void setBaseSiteId(final String baseSiteId)
	{
		this.baseSiteId = baseSiteId;
	}

		
	
	public String getBaseSiteId() 
	{
		return baseSiteId;
	}
	


}
