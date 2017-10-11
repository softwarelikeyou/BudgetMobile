package com.budgetprepay.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.budgetprepay.model.upgrade.DatabaseConstants;

@Entity
@Table(name=DatabaseConstants.TBL_PLINTRON_ASYNC_RESPONSE)
public class PlintronAsyncResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String MDN_PARAM = "mdn";
	public static final String REFERENCE_PARAM = "referenceNumber";
	
	public PlintronAsyncResponse() { }
	
	public PlintronAsyncResponse(final String body) {
		this.body = body;
	}
	
	@Id 
	@Column(name=DatabaseConstants.COL_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(final Long id) {
		this.id = id;
	}
	
	@Column(name=DatabaseConstants.COL_CREATED, nullable=false)
	private Date created = new Date();
	public Date getCreated() {
		return created;
	}
	public void setCreate(final Date create) {
		this.created = create;
	}
	
	@Column(name=DatabaseConstants.COL_STATUS, nullable=false)
	private Integer status = 0;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(final Integer status) {
		this.status = status;
	}
	
	@Column(name=DatabaseConstants.COL_REFERENCE_NUMBER, length=255)
	private String referenceNumber;
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(final String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	
	@Column(name=DatabaseConstants.COL_MDN, nullable=true)
	private String mdn = null;
	public String getMdn() {
		return mdn;
	}
	public void setMdn(final String mdn) {
		this.mdn = mdn;
	}
	
	@Column(name=DatabaseConstants.COL_TYPE, nullable=true)
	private String type = null;
	public String getType() {
		return type;
	}
	public void setType(final String type) {
		this.type = type;
	}
	
	@Column(name=DatabaseConstants.COL_DESCRIPTION, nullable=true)
	private String description = null;
	public String getDescription() {
		return description;
	}
	public void setDescription(final String description) {
		this.description = description;
	}
	
	@Column(name=DatabaseConstants.COL_BODY, columnDefinition="varchar(max)")
	private String body;
	public String getBody() {
		return body;
	}
	public void setBody(final String body) {
		this.body = body;
	}
	
	@Column(name=DatabaseConstants.COL_RESPONSE, columnDefinition="varchar(max)")
	private String response;
	public String getResponse() {
		return response;
	}
	public void setResponse(final String response) {
		this.response = response;
	}
}
