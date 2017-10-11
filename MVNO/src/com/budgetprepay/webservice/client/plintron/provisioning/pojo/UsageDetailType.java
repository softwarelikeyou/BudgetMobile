package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

public class UsageDetailType {

    private String soc;
    private String type;
    private String limit;
    private String used;
    private String status;
    private String expiryDateTime;
	public String getSoc() {
		return soc;
	}
	public void setSoc(String soc) {
		this.soc = soc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getUsed() {
		return used;
	}
	public void setUsed(String used) {
		this.used = used;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getExpiryDateTime() {
		return expiryDateTime;
	}
	public void setExpiryDateTime(String expiryDateTime) {
		this.expiryDateTime = expiryDateTime;
	}
}
