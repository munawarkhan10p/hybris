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
package de.hybris.platform.personalizationservices.process.data;

import java.io.Serializable;
import java.math.BigDecimal;

public  class CxAnonymousToSegment  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CxAnonymousToSegment.segment</code> property defined at extension <code>personalizationservices</code>. */
		
	private String segment;

	/** <i>Generated property</i> for <code>CxAnonymousToSegment.affinity</code> property defined at extension <code>personalizationservices</code>. */
		
	private BigDecimal affinity;
	
	public CxAnonymousToSegment()
	{
		// default constructor
	}
	
		
	
	public void setSegment(final String segment)
	{
		this.segment = segment;
	}

		
	
	public String getSegment() 
	{
		return segment;
	}
	
		
	
	public void setAffinity(final BigDecimal affinity)
	{
		this.affinity = affinity;
	}

		
	
	public BigDecimal getAffinity() 
	{
		return affinity;
	}
	


}
