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
package de.hybris.platform.commercefacades.storesession.data;

import java.io.Serializable;

public  class LanguageData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>LanguageData.isocode</code> property defined at extension <code>commercefacades</code>. */
		
	private String isocode;

	/** <i>Generated property</i> for <code>LanguageData.name</code> property defined at extension <code>commercefacades</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>LanguageData.nativeName</code> property defined at extension <code>commercefacades</code>. */
		
	private String nativeName;

	/** <i>Generated property</i> for <code>LanguageData.active</code> property defined at extension <code>commercefacades</code>. */
		
	private boolean active;

	/** <i>Generated property</i> for <code>LanguageData.required</code> property defined at extension <code>cmsfacades</code>. */
		
	private boolean required;
	
	public LanguageData()
	{
		// default constructor
	}
	
		
	
	public void setIsocode(final String isocode)
	{
		this.isocode = isocode;
	}

		
	
	public String getIsocode() 
	{
		return isocode;
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	
		
	
	public void setNativeName(final String nativeName)
	{
		this.nativeName = nativeName;
	}

		
	
	public String getNativeName() 
	{
		return nativeName;
	}
	
		
	
	public void setActive(final boolean active)
	{
		this.active = active;
	}

		
	
	public boolean isActive() 
	{
		return active;
	}
	
		
	
	public void setRequired(final boolean required)
	{
		this.required = required;
	}

		
	
	public boolean isRequired() 
	{
		return required;
	}
	


}
