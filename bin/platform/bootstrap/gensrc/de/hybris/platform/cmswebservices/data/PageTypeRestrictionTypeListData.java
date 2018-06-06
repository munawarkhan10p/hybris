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
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;
import de.hybris.platform.cmswebservices.data.PageTypeRestrictionTypeData;
import java.util.List;

public  class PageTypeRestrictionTypeListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PageTypeRestrictionTypeListData.pageTypeRestrictionTypeList</code> property defined at extension <code>cmswebservices</code>. */
		
	private List<PageTypeRestrictionTypeData> pageTypeRestrictionTypeList;
	
	public PageTypeRestrictionTypeListData()
	{
		// default constructor
	}
	
		
	
	public void setPageTypeRestrictionTypeList(final List<PageTypeRestrictionTypeData> pageTypeRestrictionTypeList)
	{
		this.pageTypeRestrictionTypeList = pageTypeRestrictionTypeList;
	}

		
	
	public List<PageTypeRestrictionTypeData> getPageTypeRestrictionTypeList() 
	{
		return pageTypeRestrictionTypeList;
	}
	


}
