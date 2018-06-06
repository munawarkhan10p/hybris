/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Jun 5, 2018 12:47:37 PM
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

import de.hybris.platform.adaptivesearch.data.AbstractAsSearchConfiguration;
import de.hybris.platform.adaptivesearch.data.AsBoostRule;
import de.hybris.platform.adaptivesearch.data.AsExcludedFacet;
import de.hybris.platform.adaptivesearch.data.AsExcludedItem;
import de.hybris.platform.adaptivesearch.data.AsFacet;
import de.hybris.platform.adaptivesearch.data.AsPromotedFacet;
import de.hybris.platform.adaptivesearch.data.AsPromotedItem;
import de.hybris.platform.adaptivesearch.enums.AsBoostItemsMergeMode;
import de.hybris.platform.adaptivesearch.enums.AsBoostRulesMergeMode;
import de.hybris.platform.adaptivesearch.enums.AsFacetsMergeMode;
import java.util.List;

public  class AsConfigurableSearchConfiguration extends AbstractAsSearchConfiguration 
{

 

	/** <i>Generated property</i> for <code>AsConfigurableSearchConfiguration.facetsMergeMode</code> property defined at extension <code>adaptivesearch</code>. */
		
	private AsFacetsMergeMode facetsMergeMode;

	/** <i>Generated property</i> for <code>AsConfigurableSearchConfiguration.promotedFacets</code> property defined at extension <code>adaptivesearch</code>. */
		
	private List<AsPromotedFacet> promotedFacets;

	/** <i>Generated property</i> for <code>AsConfigurableSearchConfiguration.facets</code> property defined at extension <code>adaptivesearch</code>. */
		
	private List<AsFacet> facets;

	/** <i>Generated property</i> for <code>AsConfigurableSearchConfiguration.excludedFacets</code> property defined at extension <code>adaptivesearch</code>. */
		
	private List<AsExcludedFacet> excludedFacets;

	/** <i>Generated property</i> for <code>AsConfigurableSearchConfiguration.boostItemsMergeMode</code> property defined at extension <code>adaptivesearch</code>. */
		
	private AsBoostItemsMergeMode boostItemsMergeMode;

	/** <i>Generated property</i> for <code>AsConfigurableSearchConfiguration.promotedItems</code> property defined at extension <code>adaptivesearch</code>. */
		
	private List<AsPromotedItem> promotedItems;

	/** <i>Generated property</i> for <code>AsConfigurableSearchConfiguration.excludedItems</code> property defined at extension <code>adaptivesearch</code>. */
		
	private List<AsExcludedItem> excludedItems;

	/** <i>Generated property</i> for <code>AsConfigurableSearchConfiguration.boostRulesMergeMode</code> property defined at extension <code>adaptivesearch</code>. */
		
	private AsBoostRulesMergeMode boostRulesMergeMode;

	/** <i>Generated property</i> for <code>AsConfigurableSearchConfiguration.boostRules</code> property defined at extension <code>adaptivesearch</code>. */
		
	private List<AsBoostRule> boostRules;
	
	public AsConfigurableSearchConfiguration()
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
	
		
	
	public void setPromotedFacets(final List<AsPromotedFacet> promotedFacets)
	{
		this.promotedFacets = promotedFacets;
	}

		
	
	public List<AsPromotedFacet> getPromotedFacets() 
	{
		return promotedFacets;
	}
	
		
	
	public void setFacets(final List<AsFacet> facets)
	{
		this.facets = facets;
	}

		
	
	public List<AsFacet> getFacets() 
	{
		return facets;
	}
	
		
	
	public void setExcludedFacets(final List<AsExcludedFacet> excludedFacets)
	{
		this.excludedFacets = excludedFacets;
	}

		
	
	public List<AsExcludedFacet> getExcludedFacets() 
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
	
		
	
	public void setPromotedItems(final List<AsPromotedItem> promotedItems)
	{
		this.promotedItems = promotedItems;
	}

		
	
	public List<AsPromotedItem> getPromotedItems() 
	{
		return promotedItems;
	}
	
		
	
	public void setExcludedItems(final List<AsExcludedItem> excludedItems)
	{
		this.excludedItems = excludedItems;
	}

		
	
	public List<AsExcludedItem> getExcludedItems() 
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
	
		
	
	public void setBoostRules(final List<AsBoostRule> boostRules)
	{
		this.boostRules = boostRules;
	}

		
	
	public List<AsBoostRule> getBoostRules() 
	{
		return boostRules;
	}
	


}
