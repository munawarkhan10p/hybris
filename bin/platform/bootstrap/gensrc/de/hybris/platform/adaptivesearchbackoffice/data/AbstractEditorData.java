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
import de.hybris.platform.core.model.ItemModel;

public abstract  class AbstractEditorData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AbstractEditorData.uid</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private String uid;

	/** <i>Generated property</i> for <code>AbstractEditorData.label</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private String label;

	/** <i>Generated property</i> for <code>AbstractEditorData.current</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private boolean current;

	/** <i>Generated property</i> for <code>AbstractEditorData.override</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private boolean override;

	/** <i>Generated property</i> for <code>AbstractEditorData.inSearchResult</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private boolean inSearchResult;

	/** <i>Generated property</i> for <code>AbstractEditorData.model</code> property defined at extension <code>adaptivesearchbackoffice</code>. */
		
	private ItemModel model;
	
	public AbstractEditorData()
	{
		// default constructor
	}
	
		
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

		
	
	public String getUid() 
	{
		return uid;
	}
	
		
	
	public void setLabel(final String label)
	{
		this.label = label;
	}

		
	
	public String getLabel() 
	{
		return label;
	}
	
		
	
	public void setCurrent(final boolean current)
	{
		this.current = current;
	}

		
	
	public boolean isCurrent() 
	{
		return current;
	}
	
		
	
	public void setOverride(final boolean override)
	{
		this.override = override;
	}

		
	
	public boolean isOverride() 
	{
		return override;
	}
	
		
	
	public void setInSearchResult(final boolean inSearchResult)
	{
		this.inSearchResult = inSearchResult;
	}

		
	
	public boolean isInSearchResult() 
	{
		return inSearchResult;
	}
	
		
	
	public void setModel(final ItemModel model)
	{
		this.model = model;
	}

		
	
	public ItemModel getModel() 
	{
		return model;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final AbstractEditorData other = (AbstractEditorData) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getUid(), other.getUid()) 
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
		.append(getUid()) 
		.toHashCode();
	}

}
