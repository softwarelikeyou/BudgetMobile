package com.budgetmobile.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PurchaseResult {

	@JsonProperty("APPROVAL_STATUS")
	private String approvalStatus;
	
	@JsonProperty("AUTHORIZATION_CODE")
	private String authorizationCode;
	
	@JsonProperty("AVS_RESP_CODE")
	private String avsRespCode;
	
	@JsonProperty("CARD_BRAND")
	private String cardBrand;
	
	@JsonProperty("CC_ACCOUNT_NUM")
	private String ccAccountNum;
	
	@JsonProperty("CUSTOMER_REF_NUM")
	private String customerRefNum;
	
	@JsonProperty("CVV_RESP_CODE")
	private String cvvRespCode;
	
	@JsonProperty("ERROR_CODE")
	private String errorCode;
	
	@JsonProperty("ERROR_TEXT")
	private String errorText;
	
	@JsonProperty("ORDER_ID")
	private String orderID;
	
	@JsonProperty("PROC_STATUS")
	private String procStatus;
	
	@JsonProperty("PROC_STATUS_MESSAGE")
	private String procStatusMessage;
	
	@JsonProperty("REQUEST_AMOUNT")
	private String requestAmount;
	
	@JsonProperty("RESP_CODE")
	private String respCode;
	
	@JsonProperty("RESP_CODE_MESSAGE")
	private String respCodeMessage;
	
	@JsonProperty("RESP_DATE_TIME")
	private String respDateTime;
	
	@JsonProperty("TX_REF_NUM")
	private String txRefNum;
	
	@JsonProperty("TOPUP_ID")
	private String topUpId;
	
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public String getAuthorizationCode() {
		return authorizationCode;
	}
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}
	public String getAvsRespCode() {
		return avsRespCode;
	}
	public void setAvsRespCode(String avsRespCode) {
		this.avsRespCode = avsRespCode;
	}
	public String getCardBrand() {
		return cardBrand;
	}
	public void setCardBrand(String cardBrand) {
		this.cardBrand = cardBrand;
	}
	public String getCcAccountNum() {
		return ccAccountNum;
	}
	public void setCcAccountNum(String ccAccountNum) {
		this.ccAccountNum = ccAccountNum;
	}
	public String getCustomerRefNum() {
		return customerRefNum;
	}
	public void setCustomerRefNum(String customerRefNum) {
		this.customerRefNum = customerRefNum;
	}
	public String getCvvRespCode() {
		return cvvRespCode;
	}
	public void setCvvRespCode(String cvvRespCode) {
		this.cvvRespCode = cvvRespCode;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorText() {
		return errorText;
	}
	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getProcStatus() {
		return procStatus;
	}
	public void setProcStatus(String procStatus) {
		this.procStatus = procStatus;
	}
	public String getProcStatusMessage() {
		return procStatusMessage;
	}
	public void setProcStatusMessage(String procStatusMessage) {
		this.procStatusMessage = procStatusMessage;
	}
	public String getRequestAmount() {
		return requestAmount;
	}
	public void setRequestAmount(String requestAmount) {
		this.requestAmount = requestAmount;
	}
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespCodeMessage() {
		return respCodeMessage;
	}
	public void setRespCodeMessage(String respCodeMessage) {
		this.respCodeMessage = respCodeMessage;
	}
	public String getRespDateTime() {
		return respDateTime;
	}
	public void setRespDateTime(String respDateTime) {
		this.respDateTime = respDateTime;
	}
	public String getTxRefNum() {
		return txRefNum;
	}
	public void setTxRefNum(String txRefNum) {
		this.txRefNum = txRefNum;
	}
	public String getTopUpId() {
		return topUpId;
	}
	public void setTopUpId(String topUpId) {
		this.topUpId = topUpId;
	}
}
