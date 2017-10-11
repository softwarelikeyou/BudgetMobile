package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="agentUser")
public class AgentUserType {

	public AgentUserType() { }

	public AgentUserType(final String username, final String token) {
		setUsername(username);
		setToken(token);
	}
	
	@XmlElement(name = "username")
	private String username;
	
	@XmlElement(name = "token")
	private String token;
	
	public void setUsername(final String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setToken(final String token) {
		this.token = token;
	};
	
	public String getToken() {
		return token;
	}
}
