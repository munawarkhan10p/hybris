/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:31 PM
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
package de.hybris.platform.ycommercewebservices.storesession.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.storesession.data.LanguageData;
import java.util.Collection;

public  class LanguageDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>LanguageDataList.languages</code> property defined at extension <code>ycommercewebservices</code>. */
		
	private Collection<LanguageData> languages;
	
	public LanguageDataList()
	{
		// default constructor
	}
	
		
	
	public void setLanguages(final Collection<LanguageData> languages)
	{
		this.languages = languages;
	}

		
	
	public Collection<LanguageData> getLanguages() 
	{
		return languages;
	}
	


}
