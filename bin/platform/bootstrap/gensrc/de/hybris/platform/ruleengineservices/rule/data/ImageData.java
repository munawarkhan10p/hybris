/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:41 PM
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
package de.hybris.platform.ruleengineservices.rule.data;

import java.io.Serializable;

public  class ImageData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ImageData.url</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String url;

	/** <i>Generated property</i> for <code>ImageData.altText</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String altText;

	/** <i>Generated property</i> for <code>ImageData.format</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String format;
	
	public ImageData()
	{
		// default constructor
	}
	
		
	
	public void setUrl(final String url)
	{
		this.url = url;
	}

		
	
	public String getUrl() 
	{
		return url;
	}
	
		
	
	public void setAltText(final String altText)
	{
		this.altText = altText;
	}

		
	
	public String getAltText() 
	{
		return altText;
	}
	
		
	
	public void setFormat(final String format)
	{
		this.format = format;
	}

		
	
	public String getFormat() 
	{
		return format;
	}
	


}
