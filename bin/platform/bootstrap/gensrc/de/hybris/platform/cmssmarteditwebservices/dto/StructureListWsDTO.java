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
package de.hybris.platform.cmssmarteditwebservices.dto;

import java.io.Serializable;
import de.hybris.platform.cmssmarteditwebservices.dto.StructureWsDTO;
import java.util.List;

public  class StructureListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>StructureListWsDTO.structures</code> property defined at extension <code>cmssmarteditwebservices</code>. */
		
	private List<StructureWsDTO> structures;
	
	public StructureListWsDTO()
	{
		// default constructor
	}
	
		
	
	public void setStructures(final List<StructureWsDTO> structures)
	{
		this.structures = structures;
	}

		
	
	public List<StructureWsDTO> getStructures() 
	{
		return structures;
	}
	


}
