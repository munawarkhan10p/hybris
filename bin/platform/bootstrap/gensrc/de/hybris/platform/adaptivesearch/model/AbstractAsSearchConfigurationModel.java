/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 5, 2018 12:47:08 PM                     ---
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
 *  
 */
package de.hybris.platform.adaptivesearch.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type AbstractAsSearchConfiguration first defined at extension adaptivesearch.
 */
@SuppressWarnings("all")
public class AbstractAsSearchConfigurationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "AbstractAsSearchConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractAsSearchConfiguration.catalogVersion</code> attribute defined at extension <code>adaptivesearch</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractAsSearchConfiguration.uid</code> attribute defined at extension <code>adaptivesearch</code>. */
	public static final String UID = "uid";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractAsSearchConfiguration.uniqueIdx</code> attribute defined at extension <code>adaptivesearch</code>. */
	public static final String UNIQUEIDX = "uniqueIdx";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractAsSearchConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractAsSearchConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _uid initial attribute declared by type <code>AbstractAsSearchConfiguration</code> at extension <code>adaptivesearch</code>
	 * @param _uniqueIdx initial attribute declared by type <code>AbstractAsSearchConfiguration</code> at extension <code>adaptivesearch</code>
	 */
	@Deprecated
	public AbstractAsSearchConfigurationModel(final String _uid, final String _uniqueIdx)
	{
		super();
		setUid(_uid);
		setUniqueIdx(_uniqueIdx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>AbstractAsSearchConfiguration</code> at extension <code>adaptivesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>AbstractAsSearchConfiguration</code> at extension <code>adaptivesearch</code>
	 * @param _uniqueIdx initial attribute declared by type <code>AbstractAsSearchConfiguration</code> at extension <code>adaptivesearch</code>
	 */
	@Deprecated
	public AbstractAsSearchConfigurationModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid, final String _uniqueIdx)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
		setUniqueIdx(_uniqueIdx);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAsSearchConfiguration.catalogVersion</code> attribute defined at extension <code>adaptivesearch</code>. 
	 * @return the catalogVersion
	 */
	@Accessor(qualifier = "catalogVersion", type = Accessor.Type.GETTER)
	public CatalogVersionModel getCatalogVersion()
	{
		return getPersistenceContext().getPropertyValue(CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAsSearchConfiguration.uid</code> attribute defined at extension <code>adaptivesearch</code>. 
	 * @return the uid
	 */
	@Accessor(qualifier = "uid", type = Accessor.Type.GETTER)
	public String getUid()
	{
		return getPersistenceContext().getPropertyValue(UID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAsSearchConfiguration.uniqueIdx</code> attribute defined at extension <code>adaptivesearch</code>. 
	 * @return the uniqueIdx
	 */
	@Accessor(qualifier = "uniqueIdx", type = Accessor.Type.GETTER)
	public String getUniqueIdx()
	{
		return getPersistenceContext().getPropertyValue(UNIQUEIDX);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AbstractAsSearchConfiguration.catalogVersion</code> attribute defined at extension <code>adaptivesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the catalogVersion
	 */
	@Accessor(qualifier = "catalogVersion", type = Accessor.Type.SETTER)
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		getPersistenceContext().setPropertyValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AbstractAsSearchConfiguration.uid</code> attribute defined at extension <code>adaptivesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the uid
	 */
	@Accessor(qualifier = "uid", type = Accessor.Type.SETTER)
	public void setUid(final String value)
	{
		getPersistenceContext().setPropertyValue(UID, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AbstractAsSearchConfiguration.uniqueIdx</code> attribute defined at extension <code>adaptivesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the uniqueIdx
	 */
	@Accessor(qualifier = "uniqueIdx", type = Accessor.Type.SETTER)
	public void setUniqueIdx(final String value)
	{
		getPersistenceContext().setPropertyValue(UNIQUEIDX, value);
	}
	
}
