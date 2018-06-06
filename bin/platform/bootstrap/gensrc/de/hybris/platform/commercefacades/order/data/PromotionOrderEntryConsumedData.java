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
package de.hybris.platform.commercefacades.order.data;

import java.io.Serializable;

public  class PromotionOrderEntryConsumedData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PromotionOrderEntryConsumedData.code</code> property defined at extension <code>commercefacades</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>PromotionOrderEntryConsumedData.adjustedUnitPrice</code> property defined at extension <code>commercefacades</code>. */
		
	private Double adjustedUnitPrice;

	/** <i>Generated property</i> for <code>PromotionOrderEntryConsumedData.orderEntryNumber</code> property defined at extension <code>commercefacades</code>. */
		
	private Integer orderEntryNumber;

	/** <i>Generated property</i> for <code>PromotionOrderEntryConsumedData.quantity</code> property defined at extension <code>commercefacades</code>. */
		
	private Long quantity;
	
	public PromotionOrderEntryConsumedData()
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
	
		
	
	public void setAdjustedUnitPrice(final Double adjustedUnitPrice)
	{
		this.adjustedUnitPrice = adjustedUnitPrice;
	}

		
	
	public Double getAdjustedUnitPrice() 
	{
		return adjustedUnitPrice;
	}
	
		
	
	public void setOrderEntryNumber(final Integer orderEntryNumber)
	{
		this.orderEntryNumber = orderEntryNumber;
	}

		
	
	public Integer getOrderEntryNumber() 
	{
		return orderEntryNumber;
	}
	
		
	
	public void setQuantity(final Long quantity)
	{
		this.quantity = quantity;
	}

		
	
	public Long getQuantity() 
	{
		return quantity;
	}
	


}
