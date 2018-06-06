/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:40 PM
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
package de.hybris.platform.adaptivesearchbackoffice.data;

import java.io.Serializable;

public  class PaginationRequestData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PaginationRequestData.activePage</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private int activePage;

	/** <i>Generated property</i> for <code>PaginationRequestData.pageSize</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private int pageSize;
	
	public PaginationRequestData()
	{
		// default constructor
	}
	
		
	
	public void setActivePage(final int activePage)
	{
		this.activePage = activePage;
	}

		
	
	public int getActivePage() 
	{
		return activePage;
	}
	
		
	
	public void setPageSize(final int pageSize)
	{
		this.pageSize = pageSize;
	}

		
	
	public int getPageSize() 
	{
		return pageSize;
	}
	


}
