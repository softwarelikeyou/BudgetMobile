package com.budgetprepay.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.budgetprepay.model.upgrade.DatabaseConstants;

@Entity
@Table(name=DatabaseConstants.TBL_PLINTRON_BULK_MESSAGE_REQUEST)
public class PlintronBulkMessageRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String MDN_PARAM = "mdn";
	public static final String REFERENCE_NUMBER_PARAM = "referenceNumber";
	
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
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name=DatabaseConstants.COL_USER_ID, nullable=false)
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(final User user) {
		this.user = user;
	}
	
	@Column(name=DatabaseConstants.COL_REFERENCE_NUMBER, unique=true, nullable=false, length=255)
	private String referenceNumber = "0";
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(final String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	
	@JoinColumn(name=DatabaseConstants.COL_MDN, nullable=true)
    private String mdn = null;
    public String getMdn() {
	    return mdn;
    }
    public void setMdn(final String mdn) {
	    this.mdn = mdn;
    }

	@Column(name=DatabaseConstants.COL_STARTED, nullable=false)
	private Date started = new Date();
	public Date getStarted() {
		return started;
	}
	public void setStarted(final Date started) {
		this.started = started;
	}
	
	@Column(name=DatabaseConstants.COL_ENDED)
	private Date ended = new Date();
	public Date getEnded() {
		return ended;
	}
	public void setEnded(final Date ended) {
		this.ended = ended;
	}
	
	@Column(name=DatabaseConstants.COL_REQUEST_XML, nullable=true, columnDefinition="varchar(max)")
	private String requestXML;
	public String getRequestXML() {
		return requestXML;
	}
	public void setRequestXML(final String requestXML) {
		this.requestXML = requestXML;
	}
	
	@Column(name=DatabaseConstants.COL_RESPONSE_XML, nullable=true, columnDefinition="varchar(max)")
	private String responseXML;
	public String getResponseXML() {
		return responseXML;
	}
	public void setResponseXML(final String responseXML) {
		this.responseXML = responseXML;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mdn == null) ? 0 : mdn.hashCode());
		result = prime * result
				+ ((referenceNumber == null) ? 0 : referenceNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlintronBulkMessageRequest other = (PlintronBulkMessageRequest) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mdn == null) {
			if (other.mdn != null)
				return false;
		} else if (!mdn.equals(other.mdn))
			return false;
		if (referenceNumber == null) {
			if (other.referenceNumber != null)
				return false;
		} else if (!referenceNumber.equals(other.referenceNumber))
			return false;
		return true;
	}	
}
