/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:40 PM
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
package de.hybris.platform.personalizationwebservices.data;

import java.io.Serializable;
import de.hybris.platform.personalizationfacades.data.VariationData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * List of variations
 */
@ApiModel(value="variationList", description="List of variations")
public  class VariationListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>VariationListWsDTO.variations</code> property defined at extension <code>personalizationwebservices</code>. */
	@ApiModelProperty(name="variations") 	
	private List<VariationData> variations;
	
	public VariationListWsDTO()
	{
		// default constructor
	}
	
		
	
	public void setVariations(final List<VariationData> variations)
	{
		this.variations = variations;
	}

		
	
	public List<VariationData> getVariations() 
	{
		return variations;
	}
	


}
