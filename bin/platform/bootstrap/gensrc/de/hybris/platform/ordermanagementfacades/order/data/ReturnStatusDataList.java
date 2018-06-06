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
package de.hybris.platform.ordermanagementfacades.order.data;

import java.io.Serializable;
import de.hybris.platform.basecommerce.enums.ReturnStatus;
import java.util.List;

public  class ReturnStatusDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ReturnStatusDataList.statuses</code> property defined at extension <code>ordermanagementfacades</code>. */
		
	private List<ReturnStatus> statuses;
	
	public ReturnStatusDataList()
	{
		// default constructor
	}
	
		
	
	public void setStatuses(final List<ReturnStatus> statuses)
	{
		this.statuses = statuses;
	}

		
	
	public List<ReturnStatus> getStatuses() 
	{
		return statuses;
	}
	


}
