/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:30 PM
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
package de.hybris.platform.smarteditwebservices.data;

import java.io.Serializable;
import java.util.Map;

public  class TranslationMapData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>TranslationMapData.value</code> property defined at extension <code>smarteditwebservices</code>. */
		
	private Map<String, String> value;
	
	public TranslationMapData()
	{
		// default constructor
	}
	
		
	
	public void setValue(final Map<String, String> value)
	{
		this.value = value;
	}

		
	
	public Map<String, String> getValue() 
	{
		return value;
	}
	


}
