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
package de.hybris.platform.commercefacades.comment.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.user.data.PrincipalData;
import java.util.Date;

public  class CommentData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CommentData.code</code> property defined at extension <code>commercefacades</code>. */
		
	private String code;

	/** <i>Generated property</i> for <code>CommentData.text</code> property defined at extension <code>commercefacades</code>. */
		
	private String text;

	/** <i>Generated property</i> for <code>CommentData.creationDate</code> property defined at extension <code>commercefacades</code>. */
		
	private Date creationDate;

	/** <i>Generated property</i> for <code>CommentData.author</code> property defined at extension <code>commercefacades</code>. */
		
	private PrincipalData author;

	/** <i>Generated property</i> for <code>CommentData.fromCustomer</code> property defined at extension <code>commercefacades</code>. */
		
	private Boolean fromCustomer;
	
	public CommentData()
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
	
		
	
	public void setText(final String text)
	{
		this.text = text;
	}

		
	
	public String getText() 
	{
		return text;
	}
	
		
	
	public void setCreationDate(final Date creationDate)
	{
		this.creationDate = creationDate;
	}

		
	
	public Date getCreationDate() 
	{
		return creationDate;
	}
	
		
	
	public void setAuthor(final PrincipalData author)
	{
		this.author = author;
	}

		
	
	public PrincipalData getAuthor() 
	{
		return author;
	}
	
		
	
	public void setFromCustomer(final Boolean fromCustomer)
	{
		this.fromCustomer = fromCustomer;
	}

		
	
	public Boolean getFromCustomer() 
	{
		return fromCustomer;
	}
	


}
