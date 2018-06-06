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

import java.io.Serializable;
import de.hybris.platform.personalizationfacades.data.ActionData;
import de.hybris.platform.personalizationfacades.data.CustomizationData;
import de.hybris.platform.personalizationfacades.data.TriggerData;
import de.hybris.platform.personalizationfacades.enums.ItemStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Variation
 */
@ApiModel(value="variation", description="Variation")
public  class VariationData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>VariationData.code</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="code") 	
	private String code;

	/** <i>Generated property</i> for <code>VariationData.name</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="name") 	
	private String name;

	/** <i>Generated property</i> for <code>VariationData.active</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="active") 	
	private boolean active;

	/** This is deprecated field (use status field instead)<br/><br/><i>Generated property</i> for <code>VariationData.enabled</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="enabled", value="This is deprecated field (use status field instead)") 	
	private boolean enabled;

	/** <i>Generated property</i> for <code>VariationData.rank</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="rank") 	
	private Integer rank;

	/** <i>Generated property</i> for <code>VariationData.status</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="status", allowableValues="ENABLED,DISABLED,DELETED") 	
	private ItemStatus status;

	/** <i>Generated property</i> for <code>VariationData.customization</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="customization") 	
	private CustomizationData customization;

	/** <i>Generated property</i> for <code>VariationData.triggers</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="triggers") 	
	private List<TriggerData> triggers;

	/** <i>Generated property</i> for <code>VariationData.actions</code> property defined at extension <code>personalizationfacades</code>. */
	@ApiModelProperty(name="actions") 	
	private List<ActionData> actions;
	
	public VariationData()
	{
		// default constructor
	}
	
		
	
	public void setCode(final String code)
	{
		this.code = code;
	}

		
	
	public String getCode() 
	{
		return code;
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	
		
	
	public void setActive(final boolean active)
	{
		this.active = active;
	}

		
	
	public boolean isActive() 
	{
		return active;
	}
	
	@Deprecated
    /**
     * @deprecated Use status field instead
     */
		
	
	public void setEnabled(final boolean enabled)
	{
		this.enabled = enabled;
	}

	@Deprecated
	/**
	 * @deprecated Use status field instead
	 */
		
	
	public boolean isEnabled() 
	{
		return enabled;
	}
	
		
	
	public void setRank(final Integer rank)
	{
		this.rank = rank;
	}

		
	
	public Integer getRank() 
	{
		return rank;
	}
	
		
	
	public void setStatus(final ItemStatus status)
	{
		this.status = status;
	}

		
	
	public ItemStatus getStatus() 
	{
		return status;
	}
	
		
	
	public void setCustomization(final CustomizationData customization)
	{
		this.customization = customization;
	}

		
	
	public CustomizationData getCustomization() 
	{
		return customization;
	}
	
		
	
	public void setTriggers(final List<TriggerData> triggers)
	{
		this.triggers = triggers;
	}

		
	
	public List<TriggerData> getTriggers() 
	{
		return triggers;
	}
	
		
	
	public void setActions(final List<ActionData> actions)
	{
		this.actions = actions;
	}

		
	
	public List<ActionData> getActions() 
	{
		return actions;
	}
	


}
