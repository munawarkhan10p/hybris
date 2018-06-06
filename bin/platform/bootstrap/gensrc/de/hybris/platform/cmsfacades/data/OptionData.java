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
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;

public  class OptionData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>OptionData.value</code> property defined at extension <code>cmsfacades</code>. */
		
	private String value;

	/** <i>Generated property</i> for <code>OptionData.id</code> property defined at extension <code>cmsfacades</code>. */
		
	private String id;

	/** <i>Generated property</i> for <code>OptionData.label</code> property defined at extension <code>cmsfacades</code>. */
		
	private String label;
	
	public OptionData()
	{
		// default constructor
	}
	
	@Deprecated
    /**
     * @deprecated Deprecated since 6.4, please use the id attribute of OptionData instead.
     */
		
	
	public void setValue(final String value)
	{
		this.value = value;
	}

	@Deprecated
	/**
	 * @deprecated Deprecated since 6.4, please use the id attribute of OptionData instead.
	 */
		
	
	public String getValue() 
	{
		return value;
	}
	
		
	
	public void setId(final String id)
	{
		this.id = id;
	}

		
	
	public String getId() 
	{
		return id;
	}
	
		
	
	public void setLabel(final String label)
	{
		this.label = label;
	}

		
	
	public String getLabel() 
	{
		return label;
	}
	


}
