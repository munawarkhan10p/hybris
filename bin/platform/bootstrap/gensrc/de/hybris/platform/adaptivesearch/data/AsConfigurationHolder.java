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
package de.hybris.platform.adaptivesearch.data;

import java.io.Serializable;

public  class AsConfigurationHolder<T>  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsConfigurationHolder<T>.configuration</code> property defined at extension <code>adaptivesearch</code>. */
		
	private T configuration;

	/** <i>Generated property</i> for <code>AsConfigurationHolder<T>.replacedConfigurationUid</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String replacedConfigurationUid;

	/** <i>Generated property</i> for <code>AsConfigurationHolder<T>.data</code> property defined at extension <code>adaptivesearch</code>. */
		
	private Object data;
	
	public AsConfigurationHolder()
	{
		// default constructor
	}
	
		
	
	public void setConfiguration(final T configuration)
	{
		this.configuration = configuration;
	}

		
	
	public T getConfiguration() 
	{
		return configuration;
	}
	
		
	
	public void setReplacedConfigurationUid(final String replacedConfigurationUid)
	{
		this.replacedConfigurationUid = replacedConfigurationUid;
	}

		
	
	public String getReplacedConfigurationUid() 
	{
		return replacedConfigurationUid;
	}
	
		
	
	public void setData(final Object data)
	{
		this.data = data;
	}

		
	
	public Object getData() 
	{
		return data;
	}
	


}
