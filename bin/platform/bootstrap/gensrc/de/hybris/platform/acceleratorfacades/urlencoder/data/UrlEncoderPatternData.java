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
package de.hybris.platform.acceleratorfacades.urlencoder.data;

import java.io.Serializable;

public  class UrlEncoderPatternData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>UrlEncoderPatternData.pattern</code> property defined at extension <code>acceleratorfacades</code>. */
		
	private String pattern;

	/** <i>Generated property</i> for <code>UrlEncoderPatternData.redirectRequired</code> property defined at extension <code>acceleratorfacades</code>. */
		
	private boolean redirectRequired;
	
	public UrlEncoderPatternData()
	{
		// default constructor
	}
	
		
	
	public void setPattern(final String pattern)
	{
		this.pattern = pattern;
	}

		
	
	public String getPattern() 
	{
		return pattern;
	}
	
		
	
	public void setRedirectRequired(final boolean redirectRequired)
	{
		this.redirectRequired = redirectRequired;
	}

		
	
	public boolean isRedirectRequired() 
	{
		return redirectRequired;
	}
	


}
