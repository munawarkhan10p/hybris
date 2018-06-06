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
package de.hybris.platform.customerticketingfacades.data;

import java.io.Serializable;

public  class TicketEventAttachmentData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>TicketEventAttachmentData.filename</code> property defined at extension <code>customerticketingfacades</code>. */
		
	private String filename;

	/** <i>Generated property</i> for <code>TicketEventAttachmentData.URL</code> property defined at extension <code>customerticketingfacades</code>. */
		
	private String URL;
	
	public TicketEventAttachmentData()
	{
		// default constructor
	}
	
		
	
	public void setFilename(final String filename)
	{
		this.filename = filename;
	}

		
	
	public String getFilename() 
	{
		return filename;
	}
	
		
	
	public void setURL(final String URL)
	{
		this.URL = URL;
	}

		
	
	public String getURL() 
	{
		return URL;
	}
	


}
