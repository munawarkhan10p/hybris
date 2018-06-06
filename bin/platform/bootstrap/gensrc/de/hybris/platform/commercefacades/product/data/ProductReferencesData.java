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
package de.hybris.platform.commercefacades.product.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.product.data.ProductReferenceData;
import java.util.List;

public  class ProductReferencesData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ProductReferencesData.references</code> property defined at extension <code>commercefacades</code>. */
		
	private List<ProductReferenceData> references;
	
	public ProductReferencesData()
	{
		// default constructor
	}
	
		
	
	public void setReferences(final List<ProductReferenceData> references)
	{
		this.references = references;
	}

		
	
	public List<ProductReferenceData> getReferences() 
	{
		return references;
	}
	


}
