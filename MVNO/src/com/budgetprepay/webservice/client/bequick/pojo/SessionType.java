package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "session")
public class SessionType {

	public SessionType() { }
	
	public SessionType(final String clec, final String username, final String token) {
		setClec(new ClecType(clec, username, token));
	}
	
	private IlecType ilec;
	
	private ClecType clec;

	@XmlElement(name="timestamp")
	private String timestamp;
	
	@XmlElement(name="id")
	private String id;
	
	public void setIlec(final IlecType ilec) {
		this.ilec = ilec;
	}
	
	public IlecType getIlec() {
		return ilec;
	}
	
	public void setClec(final ClecType clec) {
		this.clec = clec;
	}
	
	public ClecType getClec() {
		return clec;
	}
	
	public void setTimestamp(final String timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	
	public void setId(final String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
}
