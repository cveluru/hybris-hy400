/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 8, 2018 2:42:44 PM                      ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.personalizationservices.model.config;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.personalizationservices.model.config.CxConfigModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Set;

/**
 * Generated model class for type CxUrlVoterConfig first defined at extension personalizationservices.
 */
@SuppressWarnings("all")
public class CxUrlVoterConfigModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "CxUrlVoterConfig";
	
	/**<i>Generated relation code constant for relation <code>CxConfigToCxUrlVoterConfig</code> defining source attribute <code>cxConfig</code> in extension <code>personalizationservices</code>.</i>*/
	public static final String _CXCONFIGTOCXURLVOTERCONFIG = "CxConfigToCxUrlVoterConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>CxUrlVoterConfig.code</code> attribute defined at extension <code>personalizationservices</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>CxUrlVoterConfig.urlRegexp</code> attribute defined at extension <code>personalizationservices</code>. */
	public static final String URLREGEXP = "urlRegexp";
	
	/** <i>Generated constant</i> - Attribute key of <code>CxUrlVoterConfig.actions</code> attribute defined at extension <code>personalizationservices</code>. */
	public static final String ACTIONS = "actions";
	
	/** <i>Generated constant</i> - Attribute key of <code>CxUrlVoterConfig.cxConfigPOS</code> attribute defined at extension <code>personalizationservices</code>. */
	public static final String CXCONFIGPOS = "cxConfigPOS";
	
	/** <i>Generated constant</i> - Attribute key of <code>CxUrlVoterConfig.cxConfig</code> attribute defined at extension <code>personalizationservices</code>. */
	public static final String CXCONFIG = "cxConfig";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CxUrlVoterConfigModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CxUrlVoterConfigModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _actions initial attribute declared by type <code>CxUrlVoterConfig</code> at extension <code>personalizationservices</code>
	 * @param _code initial attribute declared by type <code>CxUrlVoterConfig</code> at extension <code>personalizationservices</code>
	 * @param _cxConfig initial attribute declared by type <code>CxUrlVoterConfig</code> at extension <code>personalizationservices</code>
	 * @param _urlRegexp initial attribute declared by type <code>CxUrlVoterConfig</code> at extension <code>personalizationservices</code>
	 */
	@Deprecated
	public CxUrlVoterConfigModel(final Set<String> _actions, final String _code, final CxConfigModel _cxConfig, final String _urlRegexp)
	{
		super();
		setActions(_actions);
		setCode(_code);
		setCxConfig(_cxConfig);
		setUrlRegexp(_urlRegexp);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _actions initial attribute declared by type <code>CxUrlVoterConfig</code> at extension <code>personalizationservices</code>
	 * @param _code initial attribute declared by type <code>CxUrlVoterConfig</code> at extension <code>personalizationservices</code>
	 * @param _cxConfig initial attribute declared by type <code>CxUrlVoterConfig</code> at extension <code>personalizationservices</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _urlRegexp initial attribute declared by type <code>CxUrlVoterConfig</code> at extension <code>personalizationservices</code>
	 */
	@Deprecated
	public CxUrlVoterConfigModel(final Set<String> _actions, final String _code, final CxConfigModel _cxConfig, final ItemModel _owner, final String _urlRegexp)
	{
		super();
		setActions(_actions);
		setCode(_code);
		setCxConfig(_cxConfig);
		setOwner(_owner);
		setUrlRegexp(_urlRegexp);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CxUrlVoterConfig.actions</code> attribute defined at extension <code>personalizationservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the actions - Collection of recalculate actions string representations
	 */
	@Accessor(qualifier = "actions", type = Accessor.Type.GETTER)
	public Set<String> getActions()
	{
		return getPersistenceContext().getPropertyValue(ACTIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CxUrlVoterConfig.code</code> attribute defined at extension <code>personalizationservices</code>. 
	 * @return the code - Unique identifier
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		return getPersistenceContext().getPropertyValue(CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CxUrlVoterConfig.cxConfig</code> attribute defined at extension <code>personalizationservices</code>. 
	 * @return the cxConfig
	 */
	@Accessor(qualifier = "cxConfig", type = Accessor.Type.GETTER)
	public CxConfigModel getCxConfig()
	{
		return getPersistenceContext().getPropertyValue(CXCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CxUrlVoterConfig.urlRegexp</code> attribute defined at extension <code>personalizationservices</code>. 
	 * @return the urlRegexp - Url regexp
	 */
	@Accessor(qualifier = "urlRegexp", type = Accessor.Type.GETTER)
	public String getUrlRegexp()
	{
		return getPersistenceContext().getPropertyValue(URLREGEXP);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CxUrlVoterConfig.actions</code> attribute defined at extension <code>personalizationservices</code>. 
	 *  
	 * @param value the actions - Collection of recalculate actions string representations
	 */
	@Accessor(qualifier = "actions", type = Accessor.Type.SETTER)
	public void setActions(final Set<String> value)
	{
		getPersistenceContext().setPropertyValue(ACTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>CxUrlVoterConfig.code</code> attribute defined at extension <code>personalizationservices</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code - Unique identifier
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CxUrlVoterConfig.cxConfig</code> attribute defined at extension <code>personalizationservices</code>. 
	 *  
	 * @param value the cxConfig
	 */
	@Accessor(qualifier = "cxConfig", type = Accessor.Type.SETTER)
	public void setCxConfig(final CxConfigModel value)
	{
		getPersistenceContext().setPropertyValue(CXCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CxUrlVoterConfig.urlRegexp</code> attribute defined at extension <code>personalizationservices</code>. 
	 *  
	 * @param value the urlRegexp - Url regexp
	 */
	@Accessor(qualifier = "urlRegexp", type = Accessor.Type.SETTER)
	public void setUrlRegexp(final String value)
	{
		getPersistenceContext().setPropertyValue(URLREGEXP, value);
	}
	
}
