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
package de.hybris.platform.ruleengineservices.rule.data;

import java.io.Serializable;
import de.hybris.platform.ruleengineservices.rule.data.RuleConditionData;
import de.hybris.platform.ruleengineservices.rule.data.RuleParameterData;
import java.util.List;
import java.util.Map;

public  class RuleConditionData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RuleConditionData.definitionId</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String definitionId;

	/** <i>Generated property</i> for <code>RuleConditionData.parameters</code> property defined at extension <code>ruleengineservices</code>. */
		
	private Map<String,RuleParameterData> parameters;

	/** <i>Generated property</i> for <code>RuleConditionData.children</code> property defined at extension <code>ruleengineservices</code>. */
		
	private List<RuleConditionData> children;
	
	public RuleConditionData()
	{
		// default constructor
	}
	
		
	
	public void setDefinitionId(final String definitionId)
	{
		this.definitionId = definitionId;
	}

		
	
	public String getDefinitionId() 
	{
		return definitionId;
	}
	
		
	
	public void setParameters(final Map<String,RuleParameterData> parameters)
	{
		this.parameters = parameters;
	}

		
	
	public Map<String,RuleParameterData> getParameters() 
	{
		return parameters;
	}
	
		
	
	public void setChildren(final List<RuleConditionData> children)
	{
		this.children = children;
	}

		
	
	public List<RuleConditionData> getChildren() 
	{
		return children;
	}
	


}
