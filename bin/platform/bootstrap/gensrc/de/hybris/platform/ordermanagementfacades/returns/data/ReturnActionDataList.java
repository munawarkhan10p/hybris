/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:39 PM
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
package de.hybris.platform.ordermanagementfacades.returns.data;

import java.io.Serializable;
import de.hybris.platform.basecommerce.enums.ReturnAction;
import java.util.List;

public  class ReturnActionDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ReturnActionDataList.returnActions</code> property defined at extension <code>ordermanagementfacades</code>. */
		
	private List<ReturnAction> returnActions;
	
	public ReturnActionDataList()
	{
		// default constructor
	}
	
		
	
	public void setReturnActions(final List<ReturnAction> returnActions)
	{
		this.returnActions = returnActions;
	}

		
	
	public List<ReturnAction> getReturnActions() 
	{
		return returnActions;
	}
	


}
