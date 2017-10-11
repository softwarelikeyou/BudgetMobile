package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="response")
public abstract class ResponseType {
	@XmlAttribute
    protected String timestamp;
	
	@XmlAttribute
    protected String type;
	    
	@XmlAttribute
	protected String status;
	
	protected Errors errors;
	
	public void setType(final String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setTimestampe(final String timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	
	public void setStatus(final String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setErrors(final Errors errors) {
		this.errors = errors;
	}
	
	public Errors getErrors() {
		return errors;
	}
}
