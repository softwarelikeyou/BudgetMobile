package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ilec")
public class IlecType {

	@XmlElement(name = "name")
	private String name;
	
	@XmlElement(name = "code")
	private String code;
}
