package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="BeQuick")
public class BeQuickType {
	
	@XmlAttribute
    protected String product = "OSS";
	
	public void setProduct(final String product) {
		this.product = product;
	}
	
	public String getProduct() {
		return product;
	}
}
