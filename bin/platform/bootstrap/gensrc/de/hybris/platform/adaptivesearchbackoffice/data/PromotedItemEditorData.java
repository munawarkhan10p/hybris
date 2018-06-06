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
package de.hybris.platform.adaptivesearchbackoffice.data;

import de.hybris.platform.adaptivesearchbackoffice.data.AbstractEditorData;
import de.hybris.platform.core.PK;

public  class PromotedItemEditorData extends AbstractEditorData 
{

 

	/** <i>Generated property</i> for <code>PromotedItemEditorData.itemPk</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private PK itemPk;
	
	public PromotedItemEditorData()
	{
		// default constructor
	}
	
		
	
	public void setItemPk(final PK itemPk)
	{
		this.itemPk = itemPk;
	}

		
	
	public PK getItemPk() 
	{
		return itemPk;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final PromotedItemEditorData other = (PromotedItemEditorData) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getItemPk(), other.getItemPk()) 
			.isEquals();
		} 
		catch (ClassCastException c)
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return new org.apache.commons.lang.builder.HashCodeBuilder()
		.append(getItemPk()) 
		.toHashCode();
	}

}
