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
package de.hybris.platform.adaptivesearch.data;

import java.io.Serializable;

public  class AsFacetValueData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsFacetValueData.name</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>AsFacetValueData.displayName</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String displayName;

	/** <i>Generated property</i> for <code>AsFacetValueData.count</code> property defined at extension <code>adaptivesearch</code>. */
		
	private long count;

	/** <i>Generated property</i> for <code>AsFacetValueData.selected</code> property defined at extension <code>adaptivesearch</code>. */
		
	private boolean selected;
	
	public AsFacetValueData()
	{
		// default constructor
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	
		
	
	public void setDisplayName(final String displayName)
	{
		this.displayName = displayName;
	}

		
	
	public String getDisplayName() 
	{
		return displayName;
	}
	
		
	
	public void setCount(final long count)
	{
		this.count = count;
	}

		
	
	public long getCount() 
	{
		return count;
	}
	
		
	
	public void setSelected(final boolean selected)
	{
		this.selected = selected;
	}

		
	
	public boolean isSelected() 
	{
		return selected;
	}
	


}
