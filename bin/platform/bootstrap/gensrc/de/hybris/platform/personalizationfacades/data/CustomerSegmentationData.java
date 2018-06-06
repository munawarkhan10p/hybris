/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:34 PM
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
package de.hybris.platform.personalizationfacades.data;

import java.io.Serializable;
import de.hybris.platform.personalizationfacades.data.CustomerData;
import de.hybris.platform.personalizationfacades.data.SegmentData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * Customer segmentation
 */
@ApiModel(value="customerSegmentation", description="Customer segmentation")
public  class CustomerSegmentationData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CustomerSegmentationData.code</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="code") 	
	private String code;

	/** <i>Generated property</i> for <code>CustomerSegmentationData.affinity</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="affinity") 	
	private BigDecimal affinity;

	/** <i>Generated property</i> for <code>CustomerSegmentationData.customer</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="customer") 	
	private CustomerData customer;

	/** <i>Generated property</i> for <code>CustomerSegmentationData.segment</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="segment") 	
	private SegmentData segment;
	
	public CustomerSegmentationData()
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
	
		
	
	public void setAffinity(final BigDecimal affinity)
	{
		this.affinity = affinity;
	}

		
	
	public BigDecimal getAffinity() 
	{
		return affinity;
	}
	
		
	
	public void setCustomer(final CustomerData customer)
	{
		this.customer = customer;
	}

		
	
	public CustomerData getCustomer() 
	{
		return customer;
	}
	
		
	
	public void setSegment(final SegmentData segment)
	{
		this.segment = segment;
	}

		
	
	public SegmentData getSegment() 
	{
		return segment;
	}
	


}
