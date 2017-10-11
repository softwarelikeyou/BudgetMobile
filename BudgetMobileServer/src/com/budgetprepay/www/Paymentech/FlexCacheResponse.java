/**
 * FlexCacheResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class FlexCacheResponse  implements java.io.Serializable {
    private com.budgetprepay.www.Paymentech.ErrorMessage errorMessage;

    private java.lang.String approvalStatus;

    private java.lang.String authorizationCode;

    private java.lang.String autoAuthApprovalStatus;

    private java.lang.String autoAuthFlexAction;

    private java.lang.String autoAuthFlexHostTrace;

    private java.lang.String autoAuthFlexRedeemedAmt;

    private java.lang.String autoAuthProcStatus;

    private java.lang.String autoAuthRespTime;

    private java.lang.String autoAuthResponseCodes;

    private java.lang.String autoAuthStatusMsg;

    private java.lang.String autoAuthTxRefIdx;

    private java.lang.String autoAuthTxRefNum;

    private java.lang.String batchFailedAcctNum;

    private java.lang.String cardType;

    private java.lang.String ccAccountNum;

    private java.lang.String cvvRespCode;

    private java.lang.String flexAcctBalance;

    private java.lang.String flexAcctExpireDate;

    private java.lang.String flexAcctPriorBalance;

    private java.lang.String flexAction;

    private java.lang.String flexHostTrace;

    private java.lang.String flexRedeemedAmt;

    private java.lang.String flexRequestedAmount;

    private com.budgetprepay.www.Paymentech.FraudAnalysisResponse fraudAnalysisResponse;

    private java.lang.String fraudScoreProcMsg;

    private java.lang.String fraudScoreProcStatus;

    private java.lang.String lastRetryDate;

    private java.lang.String merchantID;

    private java.lang.String orderID;

    private java.lang.String procStatus;

    private java.lang.String procStatusMessage;

    private java.lang.String respCode;

    private java.lang.String respDateTime;

    private java.lang.String retryAttempCount;

    private java.lang.String retryTrace;

    private java.lang.String startAccountNum;

    private java.lang.String superBlockID;

    private java.lang.String terminalID;

    private java.lang.String txRefIdx;

    private java.lang.String txRefNum;

    private java.lang.String version;

    public FlexCacheResponse() {
    }

    public FlexCacheResponse(
           com.budgetprepay.www.Paymentech.ErrorMessage errorMessage,
           java.lang.String approvalStatus,
           java.lang.String authorizationCode,
           java.lang.String autoAuthApprovalStatus,
           java.lang.String autoAuthFlexAction,
           java.lang.String autoAuthFlexHostTrace,
           java.lang.String autoAuthFlexRedeemedAmt,
           java.lang.String autoAuthProcStatus,
           java.lang.String autoAuthRespTime,
           java.lang.String autoAuthResponseCodes,
           java.lang.String autoAuthStatusMsg,
           java.lang.String autoAuthTxRefIdx,
           java.lang.String autoAuthTxRefNum,
           java.lang.String batchFailedAcctNum,
           java.lang.String cardType,
           java.lang.String ccAccountNum,
           java.lang.String cvvRespCode,
           java.lang.String flexAcctBalance,
           java.lang.String flexAcctExpireDate,
           java.lang.String flexAcctPriorBalance,
           java.lang.String flexAction,
           java.lang.String flexHostTrace,
           java.lang.String flexRedeemedAmt,
           java.lang.String flexRequestedAmount,
           com.budgetprepay.www.Paymentech.FraudAnalysisResponse fraudAnalysisResponse,
           java.lang.String fraudScoreProcMsg,
           java.lang.String fraudScoreProcStatus,
           java.lang.String lastRetryDate,
           java.lang.String merchantID,
           java.lang.String orderID,
           java.lang.String procStatus,
           java.lang.String procStatusMessage,
           java.lang.String respCode,
           java.lang.String respDateTime,
           java.lang.String retryAttempCount,
           java.lang.String retryTrace,
           java.lang.String startAccountNum,
           java.lang.String superBlockID,
           java.lang.String terminalID,
           java.lang.String txRefIdx,
           java.lang.String txRefNum,
           java.lang.String version) {
           this.errorMessage = errorMessage;
           this.approvalStatus = approvalStatus;
           this.authorizationCode = authorizationCode;
           this.autoAuthApprovalStatus = autoAuthApprovalStatus;
           this.autoAuthFlexAction = autoAuthFlexAction;
           this.autoAuthFlexHostTrace = autoAuthFlexHostTrace;
           this.autoAuthFlexRedeemedAmt = autoAuthFlexRedeemedAmt;
           this.autoAuthProcStatus = autoAuthProcStatus;
           this.autoAuthRespTime = autoAuthRespTime;
           this.autoAuthResponseCodes = autoAuthResponseCodes;
           this.autoAuthStatusMsg = autoAuthStatusMsg;
           this.autoAuthTxRefIdx = autoAuthTxRefIdx;
           this.autoAuthTxRefNum = autoAuthTxRefNum;
           this.batchFailedAcctNum = batchFailedAcctNum;
           this.cardType = cardType;
           this.ccAccountNum = ccAccountNum;
           this.cvvRespCode = cvvRespCode;
           this.flexAcctBalance = flexAcctBalance;
           this.flexAcctExpireDate = flexAcctExpireDate;
           this.flexAcctPriorBalance = flexAcctPriorBalance;
           this.flexAction = flexAction;
           this.flexHostTrace = flexHostTrace;
           this.flexRedeemedAmt = flexRedeemedAmt;
           this.flexRequestedAmount = flexRequestedAmount;
           this.fraudAnalysisResponse = fraudAnalysisResponse;
           this.fraudScoreProcMsg = fraudScoreProcMsg;
           this.fraudScoreProcStatus = fraudScoreProcStatus;
           this.lastRetryDate = lastRetryDate;
           this.merchantID = merchantID;
           this.orderID = orderID;
           this.procStatus = procStatus;
           this.procStatusMessage = procStatusMessage;
           this.respCode = respCode;
           this.respDateTime = respDateTime;
           this.retryAttempCount = retryAttempCount;
           this.retryTrace = retryTrace;
           this.startAccountNum = startAccountNum;
           this.superBlockID = superBlockID;
           this.terminalID = terminalID;
           this.txRefIdx = txRefIdx;
           this.txRefNum = txRefNum;
           this.version = version;
    }


    /**
     * Gets the errorMessage value for this FlexCacheResponse.
     * 
     * @return errorMessage
     */
    public com.budgetprepay.www.Paymentech.ErrorMessage getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this FlexCacheResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(com.budgetprepay.www.Paymentech.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the approvalStatus value for this FlexCacheResponse.
     * 
     * @return approvalStatus
     */
    public java.lang.String getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this FlexCacheResponse.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(java.lang.String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the authorizationCode value for this FlexCacheResponse.
     * 
     * @return authorizationCode
     */
    public java.lang.String getAuthorizationCode() {
        return authorizationCode;
    }


    /**
     * Sets the authorizationCode value for this FlexCacheResponse.
     * 
     * @param authorizationCode
     */
    public void setAuthorizationCode(java.lang.String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }


    /**
     * Gets the autoAuthApprovalStatus value for this FlexCacheResponse.
     * 
     * @return autoAuthApprovalStatus
     */
    public java.lang.String getAutoAuthApprovalStatus() {
        return autoAuthApprovalStatus;
    }


    /**
     * Sets the autoAuthApprovalStatus value for this FlexCacheResponse.
     * 
     * @param autoAuthApprovalStatus
     */
    public void setAutoAuthApprovalStatus(java.lang.String autoAuthApprovalStatus) {
        this.autoAuthApprovalStatus = autoAuthApprovalStatus;
    }


    /**
     * Gets the autoAuthFlexAction value for this FlexCacheResponse.
     * 
     * @return autoAuthFlexAction
     */
    public java.lang.String getAutoAuthFlexAction() {
        return autoAuthFlexAction;
    }


    /**
     * Sets the autoAuthFlexAction value for this FlexCacheResponse.
     * 
     * @param autoAuthFlexAction
     */
    public void setAutoAuthFlexAction(java.lang.String autoAuthFlexAction) {
        this.autoAuthFlexAction = autoAuthFlexAction;
    }


    /**
     * Gets the autoAuthFlexHostTrace value for this FlexCacheResponse.
     * 
     * @return autoAuthFlexHostTrace
     */
    public java.lang.String getAutoAuthFlexHostTrace() {
        return autoAuthFlexHostTrace;
    }


    /**
     * Sets the autoAuthFlexHostTrace value for this FlexCacheResponse.
     * 
     * @param autoAuthFlexHostTrace
     */
    public void setAutoAuthFlexHostTrace(java.lang.String autoAuthFlexHostTrace) {
        this.autoAuthFlexHostTrace = autoAuthFlexHostTrace;
    }


    /**
     * Gets the autoAuthFlexRedeemedAmt value for this FlexCacheResponse.
     * 
     * @return autoAuthFlexRedeemedAmt
     */
    public java.lang.String getAutoAuthFlexRedeemedAmt() {
        return autoAuthFlexRedeemedAmt;
    }


    /**
     * Sets the autoAuthFlexRedeemedAmt value for this FlexCacheResponse.
     * 
     * @param autoAuthFlexRedeemedAmt
     */
    public void setAutoAuthFlexRedeemedAmt(java.lang.String autoAuthFlexRedeemedAmt) {
        this.autoAuthFlexRedeemedAmt = autoAuthFlexRedeemedAmt;
    }


    /**
     * Gets the autoAuthProcStatus value for this FlexCacheResponse.
     * 
     * @return autoAuthProcStatus
     */
    public java.lang.String getAutoAuthProcStatus() {
        return autoAuthProcStatus;
    }


    /**
     * Sets the autoAuthProcStatus value for this FlexCacheResponse.
     * 
     * @param autoAuthProcStatus
     */
    public void setAutoAuthProcStatus(java.lang.String autoAuthProcStatus) {
        this.autoAuthProcStatus = autoAuthProcStatus;
    }


    /**
     * Gets the autoAuthRespTime value for this FlexCacheResponse.
     * 
     * @return autoAuthRespTime
     */
    public java.lang.String getAutoAuthRespTime() {
        return autoAuthRespTime;
    }


    /**
     * Sets the autoAuthRespTime value for this FlexCacheResponse.
     * 
     * @param autoAuthRespTime
     */
    public void setAutoAuthRespTime(java.lang.String autoAuthRespTime) {
        this.autoAuthRespTime = autoAuthRespTime;
    }


    /**
     * Gets the autoAuthResponseCodes value for this FlexCacheResponse.
     * 
     * @return autoAuthResponseCodes
     */
    public java.lang.String getAutoAuthResponseCodes() {
        return autoAuthResponseCodes;
    }


    /**
     * Sets the autoAuthResponseCodes value for this FlexCacheResponse.
     * 
     * @param autoAuthResponseCodes
     */
    public void setAutoAuthResponseCodes(java.lang.String autoAuthResponseCodes) {
        this.autoAuthResponseCodes = autoAuthResponseCodes;
    }


    /**
     * Gets the autoAuthStatusMsg value for this FlexCacheResponse.
     * 
     * @return autoAuthStatusMsg
     */
    public java.lang.String getAutoAuthStatusMsg() {
        return autoAuthStatusMsg;
    }


    /**
     * Sets the autoAuthStatusMsg value for this FlexCacheResponse.
     * 
     * @param autoAuthStatusMsg
     */
    public void setAutoAuthStatusMsg(java.lang.String autoAuthStatusMsg) {
        this.autoAuthStatusMsg = autoAuthStatusMsg;
    }


    /**
     * Gets the autoAuthTxRefIdx value for this FlexCacheResponse.
     * 
     * @return autoAuthTxRefIdx
     */
    public java.lang.String getAutoAuthTxRefIdx() {
        return autoAuthTxRefIdx;
    }


    /**
     * Sets the autoAuthTxRefIdx value for this FlexCacheResponse.
     * 
     * @param autoAuthTxRefIdx
     */
    public void setAutoAuthTxRefIdx(java.lang.String autoAuthTxRefIdx) {
        this.autoAuthTxRefIdx = autoAuthTxRefIdx;
    }


    /**
     * Gets the autoAuthTxRefNum value for this FlexCacheResponse.
     * 
     * @return autoAuthTxRefNum
     */
    public java.lang.String getAutoAuthTxRefNum() {
        return autoAuthTxRefNum;
    }


    /**
     * Sets the autoAuthTxRefNum value for this FlexCacheResponse.
     * 
     * @param autoAuthTxRefNum
     */
    public void setAutoAuthTxRefNum(java.lang.String autoAuthTxRefNum) {
        this.autoAuthTxRefNum = autoAuthTxRefNum;
    }


    /**
     * Gets the batchFailedAcctNum value for this FlexCacheResponse.
     * 
     * @return batchFailedAcctNum
     */
    public java.lang.String getBatchFailedAcctNum() {
        return batchFailedAcctNum;
    }


    /**
     * Sets the batchFailedAcctNum value for this FlexCacheResponse.
     * 
     * @param batchFailedAcctNum
     */
    public void setBatchFailedAcctNum(java.lang.String batchFailedAcctNum) {
        this.batchFailedAcctNum = batchFailedAcctNum;
    }


    /**
     * Gets the cardType value for this FlexCacheResponse.
     * 
     * @return cardType
     */
    public java.lang.String getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this FlexCacheResponse.
     * 
     * @param cardType
     */
    public void setCardType(java.lang.String cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the ccAccountNum value for this FlexCacheResponse.
     * 
     * @return ccAccountNum
     */
    public java.lang.String getCcAccountNum() {
        return ccAccountNum;
    }


    /**
     * Sets the ccAccountNum value for this FlexCacheResponse.
     * 
     * @param ccAccountNum
     */
    public void setCcAccountNum(java.lang.String ccAccountNum) {
        this.ccAccountNum = ccAccountNum;
    }


    /**
     * Gets the cvvRespCode value for this FlexCacheResponse.
     * 
     * @return cvvRespCode
     */
    public java.lang.String getCvvRespCode() {
        return cvvRespCode;
    }


    /**
     * Sets the cvvRespCode value for this FlexCacheResponse.
     * 
     * @param cvvRespCode
     */
    public void setCvvRespCode(java.lang.String cvvRespCode) {
        this.cvvRespCode = cvvRespCode;
    }


    /**
     * Gets the flexAcctBalance value for this FlexCacheResponse.
     * 
     * @return flexAcctBalance
     */
    public java.lang.String getFlexAcctBalance() {
        return flexAcctBalance;
    }


    /**
     * Sets the flexAcctBalance value for this FlexCacheResponse.
     * 
     * @param flexAcctBalance
     */
    public void setFlexAcctBalance(java.lang.String flexAcctBalance) {
        this.flexAcctBalance = flexAcctBalance;
    }


    /**
     * Gets the flexAcctExpireDate value for this FlexCacheResponse.
     * 
     * @return flexAcctExpireDate
     */
    public java.lang.String getFlexAcctExpireDate() {
        return flexAcctExpireDate;
    }


    /**
     * Sets the flexAcctExpireDate value for this FlexCacheResponse.
     * 
     * @param flexAcctExpireDate
     */
    public void setFlexAcctExpireDate(java.lang.String flexAcctExpireDate) {
        this.flexAcctExpireDate = flexAcctExpireDate;
    }


    /**
     * Gets the flexAcctPriorBalance value for this FlexCacheResponse.
     * 
     * @return flexAcctPriorBalance
     */
    public java.lang.String getFlexAcctPriorBalance() {
        return flexAcctPriorBalance;
    }


    /**
     * Sets the flexAcctPriorBalance value for this FlexCacheResponse.
     * 
     * @param flexAcctPriorBalance
     */
    public void setFlexAcctPriorBalance(java.lang.String flexAcctPriorBalance) {
        this.flexAcctPriorBalance = flexAcctPriorBalance;
    }


    /**
     * Gets the flexAction value for this FlexCacheResponse.
     * 
     * @return flexAction
     */
    public java.lang.String getFlexAction() {
        return flexAction;
    }


    /**
     * Sets the flexAction value for this FlexCacheResponse.
     * 
     * @param flexAction
     */
    public void setFlexAction(java.lang.String flexAction) {
        this.flexAction = flexAction;
    }


    /**
     * Gets the flexHostTrace value for this FlexCacheResponse.
     * 
     * @return flexHostTrace
     */
    public java.lang.String getFlexHostTrace() {
        return flexHostTrace;
    }


    /**
     * Sets the flexHostTrace value for this FlexCacheResponse.
     * 
     * @param flexHostTrace
     */
    public void setFlexHostTrace(java.lang.String flexHostTrace) {
        this.flexHostTrace = flexHostTrace;
    }


    /**
     * Gets the flexRedeemedAmt value for this FlexCacheResponse.
     * 
     * @return flexRedeemedAmt
     */
    public java.lang.String getFlexRedeemedAmt() {
        return flexRedeemedAmt;
    }


    /**
     * Sets the flexRedeemedAmt value for this FlexCacheResponse.
     * 
     * @param flexRedeemedAmt
     */
    public void setFlexRedeemedAmt(java.lang.String flexRedeemedAmt) {
        this.flexRedeemedAmt = flexRedeemedAmt;
    }


    /**
     * Gets the flexRequestedAmount value for this FlexCacheResponse.
     * 
     * @return flexRequestedAmount
     */
    public java.lang.String getFlexRequestedAmount() {
        return flexRequestedAmount;
    }


    /**
     * Sets the flexRequestedAmount value for this FlexCacheResponse.
     * 
     * @param flexRequestedAmount
     */
    public void setFlexRequestedAmount(java.lang.String flexRequestedAmount) {
        this.flexRequestedAmount = flexRequestedAmount;
    }


    /**
     * Gets the fraudAnalysisResponse value for this FlexCacheResponse.
     * 
     * @return fraudAnalysisResponse
     */
    public com.budgetprepay.www.Paymentech.FraudAnalysisResponse getFraudAnalysisResponse() {
        return fraudAnalysisResponse;
    }


    /**
     * Sets the fraudAnalysisResponse value for this FlexCacheResponse.
     * 
     * @param fraudAnalysisResponse
     */
    public void setFraudAnalysisResponse(com.budgetprepay.www.Paymentech.FraudAnalysisResponse fraudAnalysisResponse) {
        this.fraudAnalysisResponse = fraudAnalysisResponse;
    }


    /**
     * Gets the fraudScoreProcMsg value for this FlexCacheResponse.
     * 
     * @return fraudScoreProcMsg
     */
    public java.lang.String getFraudScoreProcMsg() {
        return fraudScoreProcMsg;
    }


    /**
     * Sets the fraudScoreProcMsg value for this FlexCacheResponse.
     * 
     * @param fraudScoreProcMsg
     */
    public void setFraudScoreProcMsg(java.lang.String fraudScoreProcMsg) {
        this.fraudScoreProcMsg = fraudScoreProcMsg;
    }


    /**
     * Gets the fraudScoreProcStatus value for this FlexCacheResponse.
     * 
     * @return fraudScoreProcStatus
     */
    public java.lang.String getFraudScoreProcStatus() {
        return fraudScoreProcStatus;
    }


    /**
     * Sets the fraudScoreProcStatus value for this FlexCacheResponse.
     * 
     * @param fraudScoreProcStatus
     */
    public void setFraudScoreProcStatus(java.lang.String fraudScoreProcStatus) {
        this.fraudScoreProcStatus = fraudScoreProcStatus;
    }


    /**
     * Gets the lastRetryDate value for this FlexCacheResponse.
     * 
     * @return lastRetryDate
     */
    public java.lang.String getLastRetryDate() {
        return lastRetryDate;
    }


    /**
     * Sets the lastRetryDate value for this FlexCacheResponse.
     * 
     * @param lastRetryDate
     */
    public void setLastRetryDate(java.lang.String lastRetryDate) {
        this.lastRetryDate = lastRetryDate;
    }


    /**
     * Gets the merchantID value for this FlexCacheResponse.
     * 
     * @return merchantID
     */
    public java.lang.String getMerchantID() {
        return merchantID;
    }


    /**
     * Sets the merchantID value for this FlexCacheResponse.
     * 
     * @param merchantID
     */
    public void setMerchantID(java.lang.String merchantID) {
        this.merchantID = merchantID;
    }


    /**
     * Gets the orderID value for this FlexCacheResponse.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this FlexCacheResponse.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the procStatus value for this FlexCacheResponse.
     * 
     * @return procStatus
     */
    public java.lang.String getProcStatus() {
        return procStatus;
    }


    /**
     * Sets the procStatus value for this FlexCacheResponse.
     * 
     * @param procStatus
     */
    public void setProcStatus(java.lang.String procStatus) {
        this.procStatus = procStatus;
    }


    /**
     * Gets the procStatusMessage value for this FlexCacheResponse.
     * 
     * @return procStatusMessage
     */
    public java.lang.String getProcStatusMessage() {
        return procStatusMessage;
    }


    /**
     * Sets the procStatusMessage value for this FlexCacheResponse.
     * 
     * @param procStatusMessage
     */
    public void setProcStatusMessage(java.lang.String procStatusMessage) {
        this.procStatusMessage = procStatusMessage;
    }


    /**
     * Gets the respCode value for this FlexCacheResponse.
     * 
     * @return respCode
     */
    public java.lang.String getRespCode() {
        return respCode;
    }


    /**
     * Sets the respCode value for this FlexCacheResponse.
     * 
     * @param respCode
     */
    public void setRespCode(java.lang.String respCode) {
        this.respCode = respCode;
    }


    /**
     * Gets the respDateTime value for this FlexCacheResponse.
     * 
     * @return respDateTime
     */
    public java.lang.String getRespDateTime() {
        return respDateTime;
    }


    /**
     * Sets the respDateTime value for this FlexCacheResponse.
     * 
     * @param respDateTime
     */
    public void setRespDateTime(java.lang.String respDateTime) {
        this.respDateTime = respDateTime;
    }


    /**
     * Gets the retryAttempCount value for this FlexCacheResponse.
     * 
     * @return retryAttempCount
     */
    public java.lang.String getRetryAttempCount() {
        return retryAttempCount;
    }


    /**
     * Sets the retryAttempCount value for this FlexCacheResponse.
     * 
     * @param retryAttempCount
     */
    public void setRetryAttempCount(java.lang.String retryAttempCount) {
        this.retryAttempCount = retryAttempCount;
    }


    /**
     * Gets the retryTrace value for this FlexCacheResponse.
     * 
     * @return retryTrace
     */
    public java.lang.String getRetryTrace() {
        return retryTrace;
    }


    /**
     * Sets the retryTrace value for this FlexCacheResponse.
     * 
     * @param retryTrace
     */
    public void setRetryTrace(java.lang.String retryTrace) {
        this.retryTrace = retryTrace;
    }


    /**
     * Gets the startAccountNum value for this FlexCacheResponse.
     * 
     * @return startAccountNum
     */
    public java.lang.String getStartAccountNum() {
        return startAccountNum;
    }


    /**
     * Sets the startAccountNum value for this FlexCacheResponse.
     * 
     * @param startAccountNum
     */
    public void setStartAccountNum(java.lang.String startAccountNum) {
        this.startAccountNum = startAccountNum;
    }


    /**
     * Gets the superBlockID value for this FlexCacheResponse.
     * 
     * @return superBlockID
     */
    public java.lang.String getSuperBlockID() {
        return superBlockID;
    }


    /**
     * Sets the superBlockID value for this FlexCacheResponse.
     * 
     * @param superBlockID
     */
    public void setSuperBlockID(java.lang.String superBlockID) {
        this.superBlockID = superBlockID;
    }


    /**
     * Gets the terminalID value for this FlexCacheResponse.
     * 
     * @return terminalID
     */
    public java.lang.String getTerminalID() {
        return terminalID;
    }


    /**
     * Sets the terminalID value for this FlexCacheResponse.
     * 
     * @param terminalID
     */
    public void setTerminalID(java.lang.String terminalID) {
        this.terminalID = terminalID;
    }


    /**
     * Gets the txRefIdx value for this FlexCacheResponse.
     * 
     * @return txRefIdx
     */
    public java.lang.String getTxRefIdx() {
        return txRefIdx;
    }


    /**
     * Sets the txRefIdx value for this FlexCacheResponse.
     * 
     * @param txRefIdx
     */
    public void setTxRefIdx(java.lang.String txRefIdx) {
        this.txRefIdx = txRefIdx;
    }


    /**
     * Gets the txRefNum value for this FlexCacheResponse.
     * 
     * @return txRefNum
     */
    public java.lang.String getTxRefNum() {
        return txRefNum;
    }


    /**
     * Sets the txRefNum value for this FlexCacheResponse.
     * 
     * @param txRefNum
     */
    public void setTxRefNum(java.lang.String txRefNum) {
        this.txRefNum = txRefNum;
    }


    /**
     * Gets the version value for this FlexCacheResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this FlexCacheResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlexCacheResponse)) return false;
        FlexCacheResponse other = (FlexCacheResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.authorizationCode==null && other.getAuthorizationCode()==null) || 
             (this.authorizationCode!=null &&
              this.authorizationCode.equals(other.getAuthorizationCode()))) &&
            ((this.autoAuthApprovalStatus==null && other.getAutoAuthApprovalStatus()==null) || 
             (this.autoAuthApprovalStatus!=null &&
              this.autoAuthApprovalStatus.equals(other.getAutoAuthApprovalStatus()))) &&
            ((this.autoAuthFlexAction==null && other.getAutoAuthFlexAction()==null) || 
             (this.autoAuthFlexAction!=null &&
              this.autoAuthFlexAction.equals(other.getAutoAuthFlexAction()))) &&
            ((this.autoAuthFlexHostTrace==null && other.getAutoAuthFlexHostTrace()==null) || 
             (this.autoAuthFlexHostTrace!=null &&
              this.autoAuthFlexHostTrace.equals(other.getAutoAuthFlexHostTrace()))) &&
            ((this.autoAuthFlexRedeemedAmt==null && other.getAutoAuthFlexRedeemedAmt()==null) || 
             (this.autoAuthFlexRedeemedAmt!=null &&
              this.autoAuthFlexRedeemedAmt.equals(other.getAutoAuthFlexRedeemedAmt()))) &&
            ((this.autoAuthProcStatus==null && other.getAutoAuthProcStatus()==null) || 
             (this.autoAuthProcStatus!=null &&
              this.autoAuthProcStatus.equals(other.getAutoAuthProcStatus()))) &&
            ((this.autoAuthRespTime==null && other.getAutoAuthRespTime()==null) || 
             (this.autoAuthRespTime!=null &&
              this.autoAuthRespTime.equals(other.getAutoAuthRespTime()))) &&
            ((this.autoAuthResponseCodes==null && other.getAutoAuthResponseCodes()==null) || 
             (this.autoAuthResponseCodes!=null &&
              this.autoAuthResponseCodes.equals(other.getAutoAuthResponseCodes()))) &&
            ((this.autoAuthStatusMsg==null && other.getAutoAuthStatusMsg()==null) || 
             (this.autoAuthStatusMsg!=null &&
              this.autoAuthStatusMsg.equals(other.getAutoAuthStatusMsg()))) &&
            ((this.autoAuthTxRefIdx==null && other.getAutoAuthTxRefIdx()==null) || 
             (this.autoAuthTxRefIdx!=null &&
              this.autoAuthTxRefIdx.equals(other.getAutoAuthTxRefIdx()))) &&
            ((this.autoAuthTxRefNum==null && other.getAutoAuthTxRefNum()==null) || 
             (this.autoAuthTxRefNum!=null &&
              this.autoAuthTxRefNum.equals(other.getAutoAuthTxRefNum()))) &&
            ((this.batchFailedAcctNum==null && other.getBatchFailedAcctNum()==null) || 
             (this.batchFailedAcctNum!=null &&
              this.batchFailedAcctNum.equals(other.getBatchFailedAcctNum()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.ccAccountNum==null && other.getCcAccountNum()==null) || 
             (this.ccAccountNum!=null &&
              this.ccAccountNum.equals(other.getCcAccountNum()))) &&
            ((this.cvvRespCode==null && other.getCvvRespCode()==null) || 
             (this.cvvRespCode!=null &&
              this.cvvRespCode.equals(other.getCvvRespCode()))) &&
            ((this.flexAcctBalance==null && other.getFlexAcctBalance()==null) || 
             (this.flexAcctBalance!=null &&
              this.flexAcctBalance.equals(other.getFlexAcctBalance()))) &&
            ((this.flexAcctExpireDate==null && other.getFlexAcctExpireDate()==null) || 
             (this.flexAcctExpireDate!=null &&
              this.flexAcctExpireDate.equals(other.getFlexAcctExpireDate()))) &&
            ((this.flexAcctPriorBalance==null && other.getFlexAcctPriorBalance()==null) || 
             (this.flexAcctPriorBalance!=null &&
              this.flexAcctPriorBalance.equals(other.getFlexAcctPriorBalance()))) &&
            ((this.flexAction==null && other.getFlexAction()==null) || 
             (this.flexAction!=null &&
              this.flexAction.equals(other.getFlexAction()))) &&
            ((this.flexHostTrace==null && other.getFlexHostTrace()==null) || 
             (this.flexHostTrace!=null &&
              this.flexHostTrace.equals(other.getFlexHostTrace()))) &&
            ((this.flexRedeemedAmt==null && other.getFlexRedeemedAmt()==null) || 
             (this.flexRedeemedAmt!=null &&
              this.flexRedeemedAmt.equals(other.getFlexRedeemedAmt()))) &&
            ((this.flexRequestedAmount==null && other.getFlexRequestedAmount()==null) || 
             (this.flexRequestedAmount!=null &&
              this.flexRequestedAmount.equals(other.getFlexRequestedAmount()))) &&
            ((this.fraudAnalysisResponse==null && other.getFraudAnalysisResponse()==null) || 
             (this.fraudAnalysisResponse!=null &&
              this.fraudAnalysisResponse.equals(other.getFraudAnalysisResponse()))) &&
            ((this.fraudScoreProcMsg==null && other.getFraudScoreProcMsg()==null) || 
             (this.fraudScoreProcMsg!=null &&
              this.fraudScoreProcMsg.equals(other.getFraudScoreProcMsg()))) &&
            ((this.fraudScoreProcStatus==null && other.getFraudScoreProcStatus()==null) || 
             (this.fraudScoreProcStatus!=null &&
              this.fraudScoreProcStatus.equals(other.getFraudScoreProcStatus()))) &&
            ((this.lastRetryDate==null && other.getLastRetryDate()==null) || 
             (this.lastRetryDate!=null &&
              this.lastRetryDate.equals(other.getLastRetryDate()))) &&
            ((this.merchantID==null && other.getMerchantID()==null) || 
             (this.merchantID!=null &&
              this.merchantID.equals(other.getMerchantID()))) &&
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.procStatus==null && other.getProcStatus()==null) || 
             (this.procStatus!=null &&
              this.procStatus.equals(other.getProcStatus()))) &&
            ((this.procStatusMessage==null && other.getProcStatusMessage()==null) || 
             (this.procStatusMessage!=null &&
              this.procStatusMessage.equals(other.getProcStatusMessage()))) &&
            ((this.respCode==null && other.getRespCode()==null) || 
             (this.respCode!=null &&
              this.respCode.equals(other.getRespCode()))) &&
            ((this.respDateTime==null && other.getRespDateTime()==null) || 
             (this.respDateTime!=null &&
              this.respDateTime.equals(other.getRespDateTime()))) &&
            ((this.retryAttempCount==null && other.getRetryAttempCount()==null) || 
             (this.retryAttempCount!=null &&
              this.retryAttempCount.equals(other.getRetryAttempCount()))) &&
            ((this.retryTrace==null && other.getRetryTrace()==null) || 
             (this.retryTrace!=null &&
              this.retryTrace.equals(other.getRetryTrace()))) &&
            ((this.startAccountNum==null && other.getStartAccountNum()==null) || 
             (this.startAccountNum!=null &&
              this.startAccountNum.equals(other.getStartAccountNum()))) &&
            ((this.superBlockID==null && other.getSuperBlockID()==null) || 
             (this.superBlockID!=null &&
              this.superBlockID.equals(other.getSuperBlockID()))) &&
            ((this.terminalID==null && other.getTerminalID()==null) || 
             (this.terminalID!=null &&
              this.terminalID.equals(other.getTerminalID()))) &&
            ((this.txRefIdx==null && other.getTxRefIdx()==null) || 
             (this.txRefIdx!=null &&
              this.txRefIdx.equals(other.getTxRefIdx()))) &&
            ((this.txRefNum==null && other.getTxRefNum()==null) || 
             (this.txRefNum!=null &&
              this.txRefNum.equals(other.getTxRefNum()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getAuthorizationCode() != null) {
            _hashCode += getAuthorizationCode().hashCode();
        }
        if (getAutoAuthApprovalStatus() != null) {
            _hashCode += getAutoAuthApprovalStatus().hashCode();
        }
        if (getAutoAuthFlexAction() != null) {
            _hashCode += getAutoAuthFlexAction().hashCode();
        }
        if (getAutoAuthFlexHostTrace() != null) {
            _hashCode += getAutoAuthFlexHostTrace().hashCode();
        }
        if (getAutoAuthFlexRedeemedAmt() != null) {
            _hashCode += getAutoAuthFlexRedeemedAmt().hashCode();
        }
        if (getAutoAuthProcStatus() != null) {
            _hashCode += getAutoAuthProcStatus().hashCode();
        }
        if (getAutoAuthRespTime() != null) {
            _hashCode += getAutoAuthRespTime().hashCode();
        }
        if (getAutoAuthResponseCodes() != null) {
            _hashCode += getAutoAuthResponseCodes().hashCode();
        }
        if (getAutoAuthStatusMsg() != null) {
            _hashCode += getAutoAuthStatusMsg().hashCode();
        }
        if (getAutoAuthTxRefIdx() != null) {
            _hashCode += getAutoAuthTxRefIdx().hashCode();
        }
        if (getAutoAuthTxRefNum() != null) {
            _hashCode += getAutoAuthTxRefNum().hashCode();
        }
        if (getBatchFailedAcctNum() != null) {
            _hashCode += getBatchFailedAcctNum().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getCcAccountNum() != null) {
            _hashCode += getCcAccountNum().hashCode();
        }
        if (getCvvRespCode() != null) {
            _hashCode += getCvvRespCode().hashCode();
        }
        if (getFlexAcctBalance() != null) {
            _hashCode += getFlexAcctBalance().hashCode();
        }
        if (getFlexAcctExpireDate() != null) {
            _hashCode += getFlexAcctExpireDate().hashCode();
        }
        if (getFlexAcctPriorBalance() != null) {
            _hashCode += getFlexAcctPriorBalance().hashCode();
        }
        if (getFlexAction() != null) {
            _hashCode += getFlexAction().hashCode();
        }
        if (getFlexHostTrace() != null) {
            _hashCode += getFlexHostTrace().hashCode();
        }
        if (getFlexRedeemedAmt() != null) {
            _hashCode += getFlexRedeemedAmt().hashCode();
        }
        if (getFlexRequestedAmount() != null) {
            _hashCode += getFlexRequestedAmount().hashCode();
        }
        if (getFraudAnalysisResponse() != null) {
            _hashCode += getFraudAnalysisResponse().hashCode();
        }
        if (getFraudScoreProcMsg() != null) {
            _hashCode += getFraudScoreProcMsg().hashCode();
        }
        if (getFraudScoreProcStatus() != null) {
            _hashCode += getFraudScoreProcStatus().hashCode();
        }
        if (getLastRetryDate() != null) {
            _hashCode += getLastRetryDate().hashCode();
        }
        if (getMerchantID() != null) {
            _hashCode += getMerchantID().hashCode();
        }
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getProcStatus() != null) {
            _hashCode += getProcStatus().hashCode();
        }
        if (getProcStatusMessage() != null) {
            _hashCode += getProcStatusMessage().hashCode();
        }
        if (getRespCode() != null) {
            _hashCode += getRespCode().hashCode();
        }
        if (getRespDateTime() != null) {
            _hashCode += getRespDateTime().hashCode();
        }
        if (getRetryAttempCount() != null) {
            _hashCode += getRetryAttempCount().hashCode();
        }
        if (getRetryTrace() != null) {
            _hashCode += getRetryTrace().hashCode();
        }
        if (getStartAccountNum() != null) {
            _hashCode += getStartAccountNum().hashCode();
        }
        if (getSuperBlockID() != null) {
            _hashCode += getSuperBlockID().hashCode();
        }
        if (getTerminalID() != null) {
            _hashCode += getTerminalID().hashCode();
        }
        if (getTxRefIdx() != null) {
            _hashCode += getTxRefIdx().hashCode();
        }
        if (getTxRefNum() != null) {
            _hashCode += getTxRefNum().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlexCacheResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "FlexCacheResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "errorMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "authorizationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAuthApprovalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "autoAuthApprovalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAuthFlexAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "autoAuthFlexAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAuthFlexHostTrace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "autoAuthFlexHostTrace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAuthFlexRedeemedAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "autoAuthFlexRedeemedAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAuthProcStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "autoAuthProcStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAuthRespTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "autoAuthRespTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAuthResponseCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "autoAuthResponseCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAuthStatusMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "autoAuthStatusMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAuthTxRefIdx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "autoAuthTxRefIdx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAuthTxRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "autoAuthTxRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchFailedAcctNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "batchFailedAcctNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccAccountNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ccAccountNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvvRespCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "cvvRespCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexAcctBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "flexAcctBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexAcctExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "flexAcctExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexAcctPriorBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "flexAcctPriorBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "flexAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexHostTrace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "flexHostTrace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexRedeemedAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "flexRedeemedAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexRequestedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "flexRequestedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudAnalysisResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "fraudAnalysisResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "fraudAnalysisResponse"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudScoreProcMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "fraudScoreProcMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudScoreProcStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "fraudScoreProcStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRetryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "lastRetryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "merchantID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "orderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "procStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procStatusMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "procStatusMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "respCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "respDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryAttempCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "retryAttempCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryTrace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "retryTrace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startAccountNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "startAccountNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superBlockID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "superBlockID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "terminalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txRefIdx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "txRefIdx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "txRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
