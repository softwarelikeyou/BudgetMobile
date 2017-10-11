package com.budgetprepay.webservice.util;

public class ReturnMessage {
	private Integer code = -1;
	private String text;
	
	public ReturnMessage() {}
	
	public ReturnMessage(final Integer code, final String text) {
		this.code = code;
		this.text = text;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public void setCode(final Integer code) {
		this.code = code;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(final String text) {
		this.text = text; 
	}
}
