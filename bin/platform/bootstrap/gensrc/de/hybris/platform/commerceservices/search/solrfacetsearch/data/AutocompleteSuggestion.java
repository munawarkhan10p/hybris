/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:39 PM
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
package de.hybris.platform.commerceservices.search.solrfacetsearch.data;

import java.io.Serializable;

/**
 * Represents a single keyword suggestion.
 */
public  class AutocompleteSuggestion  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AutocompleteSuggestion.term</code> property defined at extension <code>commerceservices</code>. */
		
	private String term;
	
	public AutocompleteSuggestion()
	{
		// default constructor
	}
	
		
	
	public void setTerm(final String term)
	{
		this.term = term;
	}

		
	
	public String getTerm() 
	{
		return term;
	}
	


}
