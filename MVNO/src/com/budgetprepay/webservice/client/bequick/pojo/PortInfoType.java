package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="portInfo")
public class PortInfoType {

	@XmlElement(name="mdn")
	private String mdn = new String();
	
	@XmlElement(name="authorizedBy")
	private String authorizedBy = new String();
	
	private BillingType billing = new BillingType();
	
	private OldProviderType oldProvider = new OldProviderType();

	public String getMdn() {
		return mdn;
	}

	public void setMdn(final String mdn) {
		this.mdn = mdn;
	}

	public String getAuthorizedBy() {
		return authorizedBy;
	}

	public void setAuthorizedBy(final String authorizedBy) {
		this.authorizedBy = authorizedBy;
	}

	public BillingType getBilling() {
		return billing;
	}

	public void setBilling(final BillingType billing) {
		this.billing = billing;
	}

	public OldProviderType getOldProvider() {
		return oldProvider;
	}

	public void setOldProvider(final OldProviderType oldProvider) {
		this.oldProvider = oldProvider;
	}
}
