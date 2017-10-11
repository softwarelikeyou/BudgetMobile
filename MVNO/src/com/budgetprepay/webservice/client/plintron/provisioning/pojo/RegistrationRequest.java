package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

public class RegistrationRequest  {

	public RegistrationRequest(final String entityName) {
		this.entityName = entityName;
	}
	
	private String entityName;
	
	public String getEntityName() {
		return entityName;
	}
	
	public void setEntityName(final String entityName) {
		this.entityName = entityName;
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<REGISTRATION_REQUEST>");
		buffer.append("<HEADER>");
		buffer.append("<ENTITY_NAME>" + entityName + "</ENTITY_NAME>");
		buffer.append("<CONNECTION_TYPE>0</CONNECTION_TYPE>");
		buffer.append("</HEADER>");
	    buffer.append("</REGISTRATION_REQUEST>");
		return buffer.toString();
	}
}
