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
package de.hybris.platform.commercefacades.consent.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.consent.data.ConsentData;

public  class ConsentTemplateData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ConsentTemplateData.id</code> property defined at extension <code>commercefacades</code>. */
		
	private String id;

	/** <i>Generated property</i> for <code>ConsentTemplateData.name</code> property defined at extension <code>commercefacades</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>ConsentTemplateData.description</code> property defined at extension <code>commercefacades</code>. */
		
	private String description;

	/** <i>Generated property</i> for <code>ConsentTemplateData.version</code> property defined at extension <code>commercefacades</code>. */
		
	private Integer version;

	/** <i>Generated property</i> for <code>ConsentTemplateData.consentData</code> property defined at extension <code>commercefacades</code>. */
		
	private ConsentData consentData;
	
	public ConsentTemplateData()
	{
		// default constructor
	}
	
		
	
	public void setId(final String id)
	{
		this.id = id;
	}

		
	
	public String getId() 
	{
		return id;
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	
		
	
	public void setDescription(final String description)
	{
		this.description = description;
	}

		
	
	public String getDescription() 
	{
		return description;
	}
	
		
	
	public void setVersion(final Integer version)
	{
		this.version = version;
	}

		
	
	public Integer getVersion() 
	{
		return version;
	}
	
		
	
	public void setConsentData(final ConsentData consentData)
	{
		this.consentData = consentData;
	}

		
	
	public ConsentData getConsentData() 
	{
		return consentData;
	}
	


}
