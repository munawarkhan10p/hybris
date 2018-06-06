/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:38 PM
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
import java.util.Date;

public  class ConsentData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ConsentData.code</code> property defined at extension <code>commercefacades</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>ConsentData.consentGivenDate</code> property defined at extension <code>commercefacades</code>. */
		
	private Date consentGivenDate;

	/** <i>Generated property</i> for <code>ConsentData.consentWithdrawnDate</code> property defined at extension <code>commercefacades</code>. */
		
	private Date consentWithdrawnDate;
	
	public ConsentData()
	{
		// default constructor
	}
	
		
	
	public void setCode(final String code)
	{
		this.code = code;
	}

		
	
	public String getCode() 
	{
		return code;
	}
	
		
	
	public void setConsentGivenDate(final Date consentGivenDate)
	{
		this.consentGivenDate = consentGivenDate;
	}

		
	
	public Date getConsentGivenDate() 
	{
		return consentGivenDate;
	}
	
		
	
	public void setConsentWithdrawnDate(final Date consentWithdrawnDate)
	{
		this.consentWithdrawnDate = consentWithdrawnDate;
	}

		
	
	public Date getConsentWithdrawnDate() 
	{
		return consentWithdrawnDate;
	}
	


}
