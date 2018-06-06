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
package de.hybris.platform.commerceservices.service.data;

import java.io.Serializable;
import de.hybris.platform.core.model.order.OrderModel;

public  class CommerceOrderResult  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** the OrderModel<br/><br/><i>Generated property</i> for <code>CommerceOrderResult.order</code> property defined at extension <code>commerceservices</code>. */
		
	private OrderModel order;
	
	public CommerceOrderResult()
	{
		// default constructor
	}
	
		
	
	public void setOrder(final OrderModel order)
	{
		this.order = order;
	}

		
	
	public OrderModel getOrder() 
	{
		return order;
	}
	


}
