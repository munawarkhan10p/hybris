/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:35 PM
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

import de.hybris.platform.adaptivesearch.enums.AsBoostType;
import de.hybris.platform.adaptivesearchbackoffice.data.AbstractEditorData;

public  class BoostRuleEditorData extends AbstractEditorData 
{

 

	/** <i>Generated property</i> for <code>BoostRuleEditorData.indexProperty</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private String indexProperty;

	/** <i>Generated property</i> for <code>BoostRuleEditorData.boostType</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private AsBoostType boostType;

	/** <i>Generated property</i> for <code>BoostRuleEditorData.boost</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private Float boost;
	
	public BoostRuleEditorData()
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
	
		
	
	public void setBoostType(final AsBoostType boostType)
	{
		this.boostType = boostType;
	}

		
	
	public AsBoostType getBoostType() 
	{
		return boostType;
	}
	
		
	
	public void setBoost(final Float boost)
	{
		this.boost = boost;
	}

		
	
	public Float getBoost() 
	{
		return boost;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final BoostRuleEditorData other = (BoostRuleEditorData) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getIndexProperty(), other.getIndexProperty()) 
			.append(getBoostType(), other.getBoostType()) 
			.append(getBoost(), other.getBoost()) 
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
		.append(getBoostType()) 
		.append(getBoost()) 
		.toHashCode();
	}

}
