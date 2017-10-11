package com.budgetprepay.webservice.client.bequick.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="errors")
public class Errors {
	
	@XmlElement(name="error")
	private List<Error> errors = new ArrayList<Error>();
	public void setErrors(final List<Error> errors) {
		this.errors = errors;
	}
	
	public List<Error> getErrors() {
		return errors;
	}
	
	public void addError(final Error error) {
		errors.add(error);
	}
}
