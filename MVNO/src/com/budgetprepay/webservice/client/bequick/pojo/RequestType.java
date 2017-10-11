package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="request")
public class RequestType {
	
	@XmlAttribute
    protected String type;
	
	public void setType(final String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}