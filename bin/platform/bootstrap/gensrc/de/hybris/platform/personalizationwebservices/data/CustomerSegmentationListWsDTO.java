/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:32 PM
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
package de.hybris.platform.personalizationwebservices.data;

import java.io.Serializable;
import de.hybris.platform.personalizationfacades.data.CustomerSegmentationData;
import de.hybris.platform.webservicescommons.dto.PaginationWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * List of customer segmentations
 */
@ApiModel(value="customerSegmentationList", description="List of customer segmentations")
public  class CustomerSegmentationListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CustomerSegmentationListWsDTO.pagination</code> property defined at extension <code>personalizationwebservices</code>. */
	@ApiModelProperty(name="pagination") 	
	private PaginationWsDTO pagination;

	/** <i>Generated property</i> for <code>CustomerSegmentationListWsDTO.customerSegmentations</code> property defined at extension <code>personalizationwebservices</code>. */
	@ApiModelProperty(name="customerSegmentations") 	
	private List<CustomerSegmentationData> customerSegmentations;
	
	public CustomerSegmentationListWsDTO()
	{
		// default constructor
	}
	
		
	
	public void setPagination(final PaginationWsDTO pagination)
	{
		this.pagination = pagination;
	}

		
	
	public PaginationWsDTO getPagination() 
	{
		return pagination;
	}
	
		
	
	public void setCustomerSegmentations(final List<CustomerSegmentationData> customerSegmentations)
	{
		this.customerSegmentations = customerSegmentations;
	}

		
	
	public List<CustomerSegmentationData> getCustomerSegmentations() 
	{
		return customerSegmentations;
	}
	


}
