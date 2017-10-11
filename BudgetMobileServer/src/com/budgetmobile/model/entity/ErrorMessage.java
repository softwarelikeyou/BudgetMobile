package com.budgetmobile.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorMessage {
	@JsonProperty("ERRORCODE")
	private String errorCode;
	
	@JsonProperty("ISERROR")
	private Boolean isError;
	
	@JsonProperty("ERRORMESSAGE")
	private String errorMessage;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getIsError() {
		return isError;
	}

	public void setIsError(Boolean isError) {
		this.isError = isError;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
