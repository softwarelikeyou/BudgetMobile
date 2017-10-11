package com.budgetmobile.android.budgetmobile.entity;

import java.io.Serializable;

public class PurchaseResult implements Serializable {

    private String approvalStatus;
    private String authorizationCode;
    private String avsRespCode;
    private String cardBrand;
    private String ccAccountNum;
    private String customerRefNum;
    private String cvvRespCode;
    private String errorCode;
    private String errorText;
    private String orderID;
    private String procStatus;
    private String procStatusMessage;
    private String requestAmount;
    private String respCode;
    private String respCodeMessage;
    private String respDateTime;
    private String txRefNum;
    private String topUpId;

    public static PurchaseResult MOCK() {
        PurchaseResult result = new PurchaseResult();
        result.setProcStatusMessage("Approved");
        result.setAuthorizationCode("1513456");
        result.setOrderID("ANR12348392");
        result.setTopUpId("1293993");
        //result.setErrorCode("Error 123456 Credit Card Number format invalid, CCV number invalid");
        return result;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getTxRefNum() {
        return txRefNum;
    }

    public void setTxRefNum(String txRefNum) {
        this.txRefNum = txRefNum;
    }

    public String getRespDateTime() {
        return respDateTime;
    }

    public void setRespDateTime(String respDateTime) {
        this.respDateTime = respDateTime;
    }

    public String getRespCodeMessage() {
        return respCodeMessage;
    }

    public void setRespCodeMessage(String respCodeMessage) {
        this.respCodeMessage = respCodeMessage;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(String requestAmount) {
        this.requestAmount = requestAmount;
    }

    public String getProcStatusMessage() {
        return procStatusMessage;
    }

    public void setProcStatusMessage(String procStatusMessage) {
        this.procStatusMessage = procStatusMessage;
    }

    public String getProcStatus() {
        return procStatus;
    }

    public void setProcStatus(String procStatus) {
        this.procStatus = procStatus;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getCvvRespCode() {
        return cvvRespCode;
    }

    public void setCvvRespCode(String cvvRespCode) {
        this.cvvRespCode = cvvRespCode;
    }

    public String getCustomerRefNum() {
        return customerRefNum;
    }

    public void setCustomerRefNum(String customerRefNum) {
        this.customerRefNum = customerRefNum;
    }

    public String getCcAccountNum() {
        return ccAccountNum;
    }

    public void setCcAccountNum(String ccAccountNum) {
        this.ccAccountNum = ccAccountNum;
    }

    public String getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    public String getAvsRespCode() {
        return avsRespCode;
    }

    public void setAvsRespCode(String avsRespCode) {
        this.avsRespCode = avsRespCode;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    public String getTopUpId() {
        return topUpId;
    }

    public void setTopUpId(String topUpId) {
        this.topUpId = topUpId;
    }
}
