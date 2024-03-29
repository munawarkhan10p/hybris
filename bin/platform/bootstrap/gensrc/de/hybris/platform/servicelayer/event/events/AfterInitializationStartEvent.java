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
package de.hybris.platform.servicelayer.event.events;

import java.io.Serializable;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;

import de.hybris.platform.util.JspContext;
import java.util.Map;

public  class AfterInitializationStartEvent  extends AbstractEvent {


	/** <i>Generated property</i> for <code>AfterInitializationStartEvent.params</code> property defined at extension <code>core</code>. */
		
	private Map<String, String> params;

	/** <i>Generated property</i> for <code>AfterInitializationStartEvent.ctx</code> property defined at extension <code>core</code>. */
		
	private JspContext ctx;
	
	public AfterInitializationStartEvent()
	{
		super();
	}

	public AfterInitializationStartEvent(final Serializable source)
	{
		super(source);
	}
	
	
	
	public void setParams(final Map<String, String> params)
	{
		this.params = params;
	}
	
	
	
	public Map<String, String> getParams() 
	{
		return params;
	}
	
	
	
	public void setCtx(final JspContext ctx)
	{
		this.ctx = ctx;
	}
	
	
	
	public JspContext getCtx() 
	{
		return ctx;
	}
	


}