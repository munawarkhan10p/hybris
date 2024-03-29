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
package de.hybris.platform.personalizationfacades.data;

import de.hybris.platform.personalizationfacades.data.SegmentData;
import de.hybris.platform.personalizationfacades.data.TriggerData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Segment trigger
 */
@ApiModel(value="segmentTrigger", description="Segment trigger")
public  class SegmentTriggerData extends TriggerData 
{

 

	/** <i>Generated property</i> for <code>SegmentTriggerData.segments</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="segments") 	
	private List<SegmentData> segments;

	/** <i>Generated property</i> for <code>SegmentTriggerData.groupBy</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="groupBy") 	
	private String groupBy;
	
	public SegmentTriggerData()
	{
		// default constructor
	}
	
		
	
	public void setSegments(final List<SegmentData> segments)
	{
		this.segments = segments;
	}

		
	
	public List<SegmentData> getSegments() 
	{
		return segments;
	}
	
		
	
	public void setGroupBy(final String groupBy)
	{
		this.groupBy = groupBy;
	}

		
	
	public String getGroupBy() 
	{
		return groupBy;
	}
	


}
