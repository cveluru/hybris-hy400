/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at May 8, 2018 2:42:47 PM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.cmsfacades.dto;

import java.io.Serializable;
import de.hybris.platform.cmsfacades.data.AbstractCMSComponentData;

/**
 * @deprecated Deprecated since 6.6
 */
@Deprecated
public  class UpdateComponentValidationDto  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>UpdateComponentValidationDto.originalUid</code> property defined at extension <code>cmsfacades</code>. */
		
	private String originalUid;

	/** <i>Generated property</i> for <code>UpdateComponentValidationDto.component</code> property defined at extension <code>cmsfacades</code>. */
		
	private AbstractCMSComponentData component;
	
	public UpdateComponentValidationDto()
	{
		// default constructor
	}
	
		
	
	public void setOriginalUid(final String originalUid)
	{
		this.originalUid = originalUid;
	}

		
	
	public String getOriginalUid() 
	{
		return originalUid;
	}
	
		
	
	public void setComponent(final AbstractCMSComponentData component)
	{
		this.component = component;
	}

		
	
	public AbstractCMSComponentData getComponent() 
	{
		return component;
	}
	


}
