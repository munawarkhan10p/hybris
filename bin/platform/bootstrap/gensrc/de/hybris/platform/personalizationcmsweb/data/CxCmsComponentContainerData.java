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
package de.hybris.platform.personalizationcmsweb.data;

import java.io.Serializable;

public  class CxCmsComponentContainerData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CxCmsComponentContainerData.uid</code> property defined at extension <code>personalizationcmsweb</code>. */
		
	private String uid;

	/** <i>Generated property</i> for <code>CxCmsComponentContainerData.defaultComponentUid</code> property defined at extension <code>personalizationcmsweb</code>. */
		
	private String defaultComponentUid;
	
	public CxCmsComponentContainerData()
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
	
		
	
	public void setDefaultComponentUid(final String defaultComponentUid)
	{
		this.defaultComponentUid = defaultComponentUid;
	}

		
	
	public String getDefaultComponentUid() 
	{
		return defaultComponentUid;
	}
	


}
