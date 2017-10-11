package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="clec")
public class ClecType {
	
	public ClecType() { }
	
	public ClecType(final String id, final String username, final String token) {
		this.id = id;
		setAgentUser(new AgentUserType(username, token));
	}
	
	@XmlElement(name = "id")
	private String id;
	
	private AgentUserType agentUser;
	
	private UserType user;
	
	public void setId(final String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setAgentUser(final AgentUserType agentUser) {
		this.agentUser = agentUser;
	}
	
	public AgentUserType getAgentUser() {
		return agentUser;
	}
	
	public void setUser(final UserType user) {
		this.user = user;
	}
	
	public UserType getUser() {
		return user;
	}
}
