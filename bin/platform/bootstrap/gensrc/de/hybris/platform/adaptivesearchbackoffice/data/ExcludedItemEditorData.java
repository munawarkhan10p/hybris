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
package de.hybris.platform.adaptivesearchbackoffice.data;

import de.hybris.platform.adaptivesearchbackoffice.data.AbstractEditorData;
import de.hybris.platform.core.PK;

public  class ExcludedItemEditorData extends AbstractEditorData 
{

 

	/** <i>Generated property</i> for <code>ExcludedItemEditorData.indexProperty</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private String indexProperty;

	/** <i>Generated property</i> for <code>ExcludedItemEditorData.itemPk</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private PK itemPk;
	
	public ExcludedItemEditorData()
	{
		// default constructor
	}
	
		
	
	public void setIndexProperty(final String indexProperty)
	{
		this.indexProperty = indexProperty;
	}

		
	
	public String getIndexProperty() 
	{
		return indexProperty;
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
			final ExcludedItemEditorData other = (ExcludedItemEditorData) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getIndexProperty(), other.getIndexProperty()) 
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
		.append(getIndexProperty()) 
		.append(getItemPk()) 
		.toHashCode();
	}

}
