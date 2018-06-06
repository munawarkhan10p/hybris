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
package de.hybris.platform.ordermanagementfacades.fraud.data;

import java.io.Serializable;
import de.hybris.platform.ordermanagementfacades.fraud.data.FraudReportData;
import java.util.List;

public  class FraudReportDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>FraudReportDataList.reports</code> property defined at extension <code>ordermanagementfacades</code>. */
		
	private List<FraudReportData> reports;
	
	public FraudReportDataList()
	{
		// default constructor
	}
	
		
	
	public void setReports(final List<FraudReportData> reports)
	{
		this.reports = reports;
	}

		
	
	public List<FraudReportData> getReports() 
	{
		return reports;
	}
	


}
