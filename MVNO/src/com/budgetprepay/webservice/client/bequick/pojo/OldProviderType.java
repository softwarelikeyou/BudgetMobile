package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="oldProvider")
public class OldProviderType {

	@XmlElement(name="account")
	private String account;
	
	@XmlElement(name="password")
	private String password;
	
	@XmlElement(name="esn")
	private String esn;

	public String getAccount() {
		return account;
	}

	public void setAccount(final String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getEsn() {
		return esn;
	}

	public void setEsn(final String esn) {
		this.esn = esn;
	}
}
