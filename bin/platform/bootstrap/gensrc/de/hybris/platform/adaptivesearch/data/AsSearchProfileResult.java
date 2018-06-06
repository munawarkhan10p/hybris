/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:30 PM
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
package de.hybris.platform.adaptivesearch.data;

import java.io.Serializable;
import de.hybris.platform.adaptivesearch.data.AsBoostRule;
import de.hybris.platform.adaptivesearch.data.AsConfigurationHolder;
import de.hybris.platform.adaptivesearch.data.AsExcludedFacet;
import de.hybris.platform.adaptivesearch.data.AsExcludedItem;
import de.hybris.platform.adaptivesearch.data.AsFacet;
import de.hybris.platform.adaptivesearch.data.AsPromotedFacet;
import de.hybris.platform.adaptivesearch.data.AsPromotedItem;
import de.hybris.platform.adaptivesearch.enums.AsBoostItemsMergeMode;
import de.hybris.platform.adaptivesearch.enums.AsBoostRulesMergeMode;
import de.hybris.platform.adaptivesearch.enums.AsFacetsMergeMode;
import de.hybris.platform.core.PK;
import java.util.List;
import java.util.Map;

public  class AsSearchProfileResult  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsSearchProfileResult.facetsMergeMode</code> property defined at extension <code>adaptivesearch</code>. */
		
	private AsFacetsMergeMode facetsMergeMode;

	/** <i>Generated property</i> for <code>AsSearchProfileResult.facets</code> property defined at extension <code>adaptivesearch</code>. */
		
	private Map<String,AsConfigurationHolder<AsFacet>> facets;

	/** <i>Generated property</i> for <code>AsSearchProfileResult.promotedFacets</code> property defined at extension <code>adaptivesearch</code>. */
		
	private Map<String,AsConfigurationHolder<AsPromotedFacet>> promotedFacets;

	/** <i>Generated property</i> for <code>AsSearchProfileResult.excludedFacets</code> property defined at extension <code>adaptivesearch</code>. */
		
	private Map<String,AsConfigurationHolder<AsExcludedFacet>> excludedFacets;

	/** <i>Generated property</i> for <code>AsSearchProfileResult.boostItemsMergeMode</code> property defined at extension <code>adaptivesearch</code>. */
		
	private AsBoostItemsMergeMode boostItemsMergeMode;

	/** <i>Generated property</i> for <code>AsSearchProfileResult.promotedItems</code> property defined at extension <code>adaptivesearch</code>. */
		
	private Map<PK,AsConfigurationHolder<AsPromotedItem>> promotedItems;

	/** <i>Generated property</i> for <code>AsSearchProfileResult.excludedItems</code> property defined at extension <code>adaptivesearch</code>. */
		
	private Map<PK,AsConfigurationHolder<AsExcludedItem>> excludedItems;

	/** <i>Generated property</i> for <code>AsSearchProfileResult.boostRulesMergeMode</code> property defined at extension <code>adaptivesearch</code>. */
		
	private AsBoostRulesMergeMode boostRulesMergeMode;

	/** <i>Generated property</i> for <code>AsSearchProfileResult.boostRules</code> property defined at extension <code>adaptivesearch</code>. */
		
	private List<AsConfigurationHolder<AsBoostRule>> boostRules;
	
	public AsSearchProfileResult()
	{
		// default constructor
	}
	
		
	
	public void setFacetsMergeMode(final AsFacetsMergeMode facetsMergeMode)
	{
		this.facetsMergeMode = facetsMergeMode;
	}

		
	
	public AsFacetsMergeMode getFacetsMergeMode() 
	{
		return facetsMergeMode;
	}
	
		
	
	public void setFacets(final Map<String,AsConfigurationHolder<AsFacet>> facets)
	{
		this.facets = facets;
	}

		
	
	public Map<String,AsConfigurationHolder<AsFacet>> getFacets() 
	{
		return facets;
	}
	
		
	
	public void setPromotedFacets(final Map<String,AsConfigurationHolder<AsPromotedFacet>> promotedFacets)
	{
		this.promotedFacets = promotedFacets;
	}

		
	
	public Map<String,AsConfigurationHolder<AsPromotedFacet>> getPromotedFacets() 
	{
		return promotedFacets;
	}
	
		
	
	public void setExcludedFacets(final Map<String,AsConfigurationHolder<AsExcludedFacet>> excludedFacets)
	{
		this.excludedFacets = excludedFacets;
	}

		
	
	public Map<String,AsConfigurationHolder<AsExcludedFacet>> getExcludedFacets() 
	{
		return excludedFacets;
	}
	
		
	
	public void setBoostItemsMergeMode(final AsBoostItemsMergeMode boostItemsMergeMode)
	{
		this.boostItemsMergeMode = boostItemsMergeMode;
	}

		
	
	public AsBoostItemsMergeMode getBoostItemsMergeMode() 
	{
		return boostItemsMergeMode;
	}
	
		
	
	public void setPromotedItems(final Map<PK,AsConfigurationHolder<AsPromotedItem>> promotedItems)
	{
		this.promotedItems = promotedItems;
	}

		
	
	public Map<PK,AsConfigurationHolder<AsPromotedItem>> getPromotedItems() 
	{
		return promotedItems;
	}
	
		
	
	public void setExcludedItems(final Map<PK,AsConfigurationHolder<AsExcludedItem>> excludedItems)
	{
		this.excludedItems = excludedItems;
	}

		
	
	public Map<PK,AsConfigurationHolder<AsExcludedItem>> getExcludedItems() 
	{
		return excludedItems;
	}
	
		
	
	public void setBoostRulesMergeMode(final AsBoostRulesMergeMode boostRulesMergeMode)
	{
		this.boostRulesMergeMode = boostRulesMergeMode;
	}

		
	
	public AsBoostRulesMergeMode getBoostRulesMergeMode() 
	{
		return boostRulesMergeMode;
	}
	
		
	
	public void setBoostRules(final List<AsConfigurationHolder<AsBoostRule>> boostRules)
	{
		this.boostRules = boostRules;
	}

		
	
	public List<AsConfigurationHolder<AsBoostRule>> getBoostRules() 
	{
		return boostRules;
	}
	


}
