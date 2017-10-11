/**
 * NewOrderResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class NewOrderResponse  implements java.io.Serializable {
    private com.budgetprepay.www.Paymentech.ErrorMessage errorMessage;

    private java.lang.String approvalStatus;

    private java.lang.String authorizationCode;

    private java.lang.String avsRespCode;

    private java.lang.String bin;

    private java.lang.String cardBrand;

    private java.lang.String ccAccountNum;

    private java.lang.String countryFraudFilterStatus;

    private java.lang.String ctiAffluentCard;

    private java.lang.String ctiCommercialCard;

    private java.lang.String ctiDurbinExemption;

    private java.lang.String ctiHealthcareCard;

    private java.lang.String ctiIssuingCountry;

    private java.lang.String ctiLevel3Eligible;

    private java.lang.String ctiPINlessDebitCard;

    private java.lang.String ctiPayrollCard;

    private java.lang.String ctiPrepaidCard;

    private java.lang.String ctiSignatureDebitCard;

    private java.lang.String customerName;

    private java.lang.String customerRefNum;

    private java.lang.String cvvRespCode;

    private java.lang.String debitBillerReferenceNumber;

    private java.lang.String debitPinNetworkID;

    private java.lang.String debitPinSurchargeAmount;

    private java.lang.String debitPinTraceNumber;

    private com.budgetprepay.www.Paymentech.FraudAnalysisResponse fraudAnalysisResponse;

    private java.lang.String fraudScoreProcMsg;

    private java.lang.String fraudScoreProcStatus;

    private java.lang.String giftCardInd;

    private java.lang.String hostAVSRespCode;

    private java.lang.String hostCVVRespCode;

    private java.lang.String hostRespCode;

    private java.lang.String industryType;

    private java.lang.String isoCountryCode;

    private java.lang.String lastRetryDate;

    private java.lang.String mbMicroPaymentDaysLeft;

    private java.lang.String mbMicroPaymentDollarsLeft;

    private java.lang.String mbStatus;

    private java.lang.String mcRecurringAdvCode;

    private java.lang.String merchantID;

    private java.lang.String orderID;

    private java.lang.String partialAuthOccurred;

    private java.lang.String procStatus;

    private java.lang.String procStatusMessage;

    private java.lang.String profileProcStatus;

    private java.lang.String profileProcStatusMsg;

    private java.lang.String redeemedAmount;

    private java.lang.String remainingBalance;

    private java.lang.String requestAmount;

    private java.lang.String respCode;

    private java.lang.String respCodeMessage;

    private java.lang.String respDateTime;

    private java.lang.String retryAttempCount;

    private java.lang.String retryTrace;

    private java.lang.String terminalID;

    private java.lang.String transType;

    private java.lang.String txRefIdx;

    private java.lang.String txRefNum;

    private java.lang.String version;

    private java.lang.String visaVbVRespCode;

    public NewOrderResponse() {
    }

    public NewOrderResponse(
           com.budgetprepay.www.Paymentech.ErrorMessage errorMessage,
           java.lang.String approvalStatus,
           java.lang.String authorizationCode,
           java.lang.String avsRespCode,
           java.lang.String bin,
           java.lang.String cardBrand,
           java.lang.String ccAccountNum,
           java.lang.String countryFraudFilterStatus,
           java.lang.String ctiAffluentCard,
           java.lang.String ctiCommercialCard,
           java.lang.String ctiDurbinExemption,
           java.lang.String ctiHealthcareCard,
           java.lang.String ctiIssuingCountry,
           java.lang.String ctiLevel3Eligible,
           java.lang.String ctiPINlessDebitCard,
           java.lang.String ctiPayrollCard,
           java.lang.String ctiPrepaidCard,
           java.lang.String ctiSignatureDebitCard,
           java.lang.String customerName,
           java.lang.String customerRefNum,
           java.lang.String cvvRespCode,
           java.lang.String debitBillerReferenceNumber,
           java.lang.String debitPinNetworkID,
           java.lang.String debitPinSurchargeAmount,
           java.lang.String debitPinTraceNumber,
           com.budgetprepay.www.Paymentech.FraudAnalysisResponse fraudAnalysisResponse,
           java.lang.String fraudScoreProcMsg,
           java.lang.String fraudScoreProcStatus,
           java.lang.String giftCardInd,
           java.lang.String hostAVSRespCode,
           java.lang.String hostCVVRespCode,
           java.lang.String hostRespCode,
           java.lang.String industryType,
           java.lang.String isoCountryCode,
           java.lang.String lastRetryDate,
           java.lang.String mbMicroPaymentDaysLeft,
           java.lang.String mbMicroPaymentDollarsLeft,
           java.lang.String mbStatus,
           java.lang.String mcRecurringAdvCode,
           java.lang.String merchantID,
           java.lang.String orderID,
           java.lang.String partialAuthOccurred,
           java.lang.String procStatus,
           java.lang.String procStatusMessage,
           java.lang.String profileProcStatus,
           java.lang.String profileProcStatusMsg,
           java.lang.String redeemedAmount,
           java.lang.String remainingBalance,
           java.lang.String requestAmount,
           java.lang.String respCode,
           java.lang.String respCodeMessage,
           java.lang.String respDateTime,
           java.lang.String retryAttempCount,
           java.lang.String retryTrace,
           java.lang.String terminalID,
           java.lang.String transType,
           java.lang.String txRefIdx,
           java.lang.String txRefNum,
           java.lang.String version,
           java.lang.String visaVbVRespCode) {
           this.errorMessage = errorMessage;
           this.approvalStatus = approvalStatus;
           this.authorizationCode = authorizationCode;
           this.avsRespCode = avsRespCode;
           this.bin = bin;
           this.cardBrand = cardBrand;
           this.ccAccountNum = ccAccountNum;
           this.countryFraudFilterStatus = countryFraudFilterStatus;
           this.ctiAffluentCard = ctiAffluentCard;
           this.ctiCommercialCard = ctiCommercialCard;
           this.ctiDurbinExemption = ctiDurbinExemption;
           this.ctiHealthcareCard = ctiHealthcareCard;
           this.ctiIssuingCountry = ctiIssuingCountry;
           this.ctiLevel3Eligible = ctiLevel3Eligible;
           this.ctiPINlessDebitCard = ctiPINlessDebitCard;
           this.ctiPayrollCard = ctiPayrollCard;
           this.ctiPrepaidCard = ctiPrepaidCard;
           this.ctiSignatureDebitCard = ctiSignatureDebitCard;
           this.customerName = customerName;
           this.customerRefNum = customerRefNum;
           this.cvvRespCode = cvvRespCode;
           this.debitBillerReferenceNumber = debitBillerReferenceNumber;
           this.debitPinNetworkID = debitPinNetworkID;
           this.debitPinSurchargeAmount = debitPinSurchargeAmount;
           this.debitPinTraceNumber = debitPinTraceNumber;
           this.fraudAnalysisResponse = fraudAnalysisResponse;
           this.fraudScoreProcMsg = fraudScoreProcMsg;
           this.fraudScoreProcStatus = fraudScoreProcStatus;
           this.giftCardInd = giftCardInd;
           this.hostAVSRespCode = hostAVSRespCode;
           this.hostCVVRespCode = hostCVVRespCode;
           this.hostRespCode = hostRespCode;
           this.industryType = industryType;
           this.isoCountryCode = isoCountryCode;
           this.lastRetryDate = lastRetryDate;
           this.mbMicroPaymentDaysLeft = mbMicroPaymentDaysLeft;
           this.mbMicroPaymentDollarsLeft = mbMicroPaymentDollarsLeft;
           this.mbStatus = mbStatus;
           this.mcRecurringAdvCode = mcRecurringAdvCode;
           this.merchantID = merchantID;
           this.orderID = orderID;
           this.partialAuthOccurred = partialAuthOccurred;
           this.procStatus = procStatus;
           this.procStatusMessage = procStatusMessage;
           this.profileProcStatus = profileProcStatus;
           this.profileProcStatusMsg = profileProcStatusMsg;
           this.redeemedAmount = redeemedAmount;
           this.remainingBalance = remainingBalance;
           this.requestAmount = requestAmount;
           this.respCode = respCode;
           this.respCodeMessage = respCodeMessage;
           this.respDateTime = respDateTime;
           this.retryAttempCount = retryAttempCount;
           this.retryTrace = retryTrace;
           this.terminalID = terminalID;
           this.transType = transType;
           this.txRefIdx = txRefIdx;
           this.txRefNum = txRefNum;
           this.version = version;
           this.visaVbVRespCode = visaVbVRespCode;
    }


    /**
     * Gets the errorMessage value for this NewOrderResponse.
     * 
     * @return errorMessage
     */
    public com.budgetprepay.www.Paymentech.ErrorMessage getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this NewOrderResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(com.budgetprepay.www.Paymentech.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the approvalStatus value for this NewOrderResponse.
     * 
     * @return approvalStatus
     */
    public java.lang.String getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this NewOrderResponse.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(java.lang.String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the authorizationCode value for this NewOrderResponse.
     * 
     * @return authorizationCode
     */
    public java.lang.String getAuthorizationCode() {
        return authorizationCode;
    }


    /**
     * Sets the authorizationCode value for this NewOrderResponse.
     * 
     * @param authorizationCode
     */
    public void setAuthorizationCode(java.lang.String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }


    /**
     * Gets the avsRespCode value for this NewOrderResponse.
     * 
     * @return avsRespCode
     */
    public java.lang.String getAvsRespCode() {
        return avsRespCode;
    }


    /**
     * Sets the avsRespCode value for this NewOrderResponse.
     * 
     * @param avsRespCode
     */
    public void setAvsRespCode(java.lang.String avsRespCode) {
        this.avsRespCode = avsRespCode;
    }


    /**
     * Gets the bin value for this NewOrderResponse.
     * 
     * @return bin
     */
    public java.lang.String getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this NewOrderResponse.
     * 
     * @param bin
     */
    public void setBin(java.lang.String bin) {
        this.bin = bin;
    }


    /**
     * Gets the cardBrand value for this NewOrderResponse.
     * 
     * @return cardBrand
     */
    public java.lang.String getCardBrand() {
        return cardBrand;
    }


    /**
     * Sets the cardBrand value for this NewOrderResponse.
     * 
     * @param cardBrand
     */
    public void setCardBrand(java.lang.String cardBrand) {
        this.cardBrand = cardBrand;
    }


    /**
     * Gets the ccAccountNum value for this NewOrderResponse.
     * 
     * @return ccAccountNum
     */
    public java.lang.String getCcAccountNum() {
        return ccAccountNum;
    }


    /**
     * Sets the ccAccountNum value for this NewOrderResponse.
     * 
     * @param ccAccountNum
     */
    public void setCcAccountNum(java.lang.String ccAccountNum) {
        this.ccAccountNum = ccAccountNum;
    }


    /**
     * Gets the countryFraudFilterStatus value for this NewOrderResponse.
     * 
     * @return countryFraudFilterStatus
     */
    public java.lang.String getCountryFraudFilterStatus() {
        return countryFraudFilterStatus;
    }


    /**
     * Sets the countryFraudFilterStatus value for this NewOrderResponse.
     * 
     * @param countryFraudFilterStatus
     */
    public void setCountryFraudFilterStatus(java.lang.String countryFraudFilterStatus) {
        this.countryFraudFilterStatus = countryFraudFilterStatus;
    }


    /**
     * Gets the ctiAffluentCard value for this NewOrderResponse.
     * 
     * @return ctiAffluentCard
     */
    public java.lang.String getCtiAffluentCard() {
        return ctiAffluentCard;
    }


    /**
     * Sets the ctiAffluentCard value for this NewOrderResponse.
     * 
     * @param ctiAffluentCard
     */
    public void setCtiAffluentCard(java.lang.String ctiAffluentCard) {
        this.ctiAffluentCard = ctiAffluentCard;
    }


    /**
     * Gets the ctiCommercialCard value for this NewOrderResponse.
     * 
     * @return ctiCommercialCard
     */
    public java.lang.String getCtiCommercialCard() {
        return ctiCommercialCard;
    }


    /**
     * Sets the ctiCommercialCard value for this NewOrderResponse.
     * 
     * @param ctiCommercialCard
     */
    public void setCtiCommercialCard(java.lang.String ctiCommercialCard) {
        this.ctiCommercialCard = ctiCommercialCard;
    }


    /**
     * Gets the ctiDurbinExemption value for this NewOrderResponse.
     * 
     * @return ctiDurbinExemption
     */
    public java.lang.String getCtiDurbinExemption() {
        return ctiDurbinExemption;
    }


    /**
     * Sets the ctiDurbinExemption value for this NewOrderResponse.
     * 
     * @param ctiDurbinExemption
     */
    public void setCtiDurbinExemption(java.lang.String ctiDurbinExemption) {
        this.ctiDurbinExemption = ctiDurbinExemption;
    }


    /**
     * Gets the ctiHealthcareCard value for this NewOrderResponse.
     * 
     * @return ctiHealthcareCard
     */
    public java.lang.String getCtiHealthcareCard() {
        return ctiHealthcareCard;
    }


    /**
     * Sets the ctiHealthcareCard value for this NewOrderResponse.
     * 
     * @param ctiHealthcareCard
     */
    public void setCtiHealthcareCard(java.lang.String ctiHealthcareCard) {
        this.ctiHealthcareCard = ctiHealthcareCard;
    }


    /**
     * Gets the ctiIssuingCountry value for this NewOrderResponse.
     * 
     * @return ctiIssuingCountry
     */
    public java.lang.String getCtiIssuingCountry() {
        return ctiIssuingCountry;
    }


    /**
     * Sets the ctiIssuingCountry value for this NewOrderResponse.
     * 
     * @param ctiIssuingCountry
     */
    public void setCtiIssuingCountry(java.lang.String ctiIssuingCountry) {
        this.ctiIssuingCountry = ctiIssuingCountry;
    }


    /**
     * Gets the ctiLevel3Eligible value for this NewOrderResponse.
     * 
     * @return ctiLevel3Eligible
     */
    public java.lang.String getCtiLevel3Eligible() {
        return ctiLevel3Eligible;
    }


    /**
     * Sets the ctiLevel3Eligible value for this NewOrderResponse.
     * 
     * @param ctiLevel3Eligible
     */
    public void setCtiLevel3Eligible(java.lang.String ctiLevel3Eligible) {
        this.ctiLevel3Eligible = ctiLevel3Eligible;
    }


    /**
     * Gets the ctiPINlessDebitCard value for this NewOrderResponse.
     * 
     * @return ctiPINlessDebitCard
     */
    public java.lang.String getCtiPINlessDebitCard() {
        return ctiPINlessDebitCard;
    }


    /**
     * Sets the ctiPINlessDebitCard value for this NewOrderResponse.
     * 
     * @param ctiPINlessDebitCard
     */
    public void setCtiPINlessDebitCard(java.lang.String ctiPINlessDebitCard) {
        this.ctiPINlessDebitCard = ctiPINlessDebitCard;
    }


    /**
     * Gets the ctiPayrollCard value for this NewOrderResponse.
     * 
     * @return ctiPayrollCard
     */
    public java.lang.String getCtiPayrollCard() {
        return ctiPayrollCard;
    }


    /**
     * Sets the ctiPayrollCard value for this NewOrderResponse.
     * 
     * @param ctiPayrollCard
     */
    public void setCtiPayrollCard(java.lang.String ctiPayrollCard) {
        this.ctiPayrollCard = ctiPayrollCard;
    }


    /**
     * Gets the ctiPrepaidCard value for this NewOrderResponse.
     * 
     * @return ctiPrepaidCard
     */
    public java.lang.String getCtiPrepaidCard() {
        return ctiPrepaidCard;
    }


    /**
     * Sets the ctiPrepaidCard value for this NewOrderResponse.
     * 
     * @param ctiPrepaidCard
     */
    public void setCtiPrepaidCard(java.lang.String ctiPrepaidCard) {
        this.ctiPrepaidCard = ctiPrepaidCard;
    }


    /**
     * Gets the ctiSignatureDebitCard value for this NewOrderResponse.
     * 
     * @return ctiSignatureDebitCard
     */
    public java.lang.String getCtiSignatureDebitCard() {
        return ctiSignatureDebitCard;
    }


    /**
     * Sets the ctiSignatureDebitCard value for this NewOrderResponse.
     * 
     * @param ctiSignatureDebitCard
     */
    public void setCtiSignatureDebitCard(java.lang.String ctiSignatureDebitCard) {
        this.ctiSignatureDebitCard = ctiSignatureDebitCard;
    }


    /**
     * Gets the customerName value for this NewOrderResponse.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this NewOrderResponse.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the customerRefNum value for this NewOrderResponse.
     * 
     * @return customerRefNum
     */
    public java.lang.String getCustomerRefNum() {
        return customerRefNum;
    }


    /**
     * Sets the customerRefNum value for this NewOrderResponse.
     * 
     * @param customerRefNum
     */
    public void setCustomerRefNum(java.lang.String customerRefNum) {
        this.customerRefNum = customerRefNum;
    }


    /**
     * Gets the cvvRespCode value for this NewOrderResponse.
     * 
     * @return cvvRespCode
     */
    public java.lang.String getCvvRespCode() {
        return cvvRespCode;
    }


    /**
     * Sets the cvvRespCode value for this NewOrderResponse.
     * 
     * @param cvvRespCode
     */
    public void setCvvRespCode(java.lang.String cvvRespCode) {
        this.cvvRespCode = cvvRespCode;
    }


    /**
     * Gets the debitBillerReferenceNumber value for this NewOrderResponse.
     * 
     * @return debitBillerReferenceNumber
     */
    public java.lang.String getDebitBillerReferenceNumber() {
        return debitBillerReferenceNumber;
    }


    /**
     * Sets the debitBillerReferenceNumber value for this NewOrderResponse.
     * 
     * @param debitBillerReferenceNumber
     */
    public void setDebitBillerReferenceNumber(java.lang.String debitBillerReferenceNumber) {
        this.debitBillerReferenceNumber = debitBillerReferenceNumber;
    }


    /**
     * Gets the debitPinNetworkID value for this NewOrderResponse.
     * 
     * @return debitPinNetworkID
     */
    public java.lang.String getDebitPinNetworkID() {
        return debitPinNetworkID;
    }


    /**
     * Sets the debitPinNetworkID value for this NewOrderResponse.
     * 
     * @param debitPinNetworkID
     */
    public void setDebitPinNetworkID(java.lang.String debitPinNetworkID) {
        this.debitPinNetworkID = debitPinNetworkID;
    }


    /**
     * Gets the debitPinSurchargeAmount value for this NewOrderResponse.
     * 
     * @return debitPinSurchargeAmount
     */
    public java.lang.String getDebitPinSurchargeAmount() {
        return debitPinSurchargeAmount;
    }


    /**
     * Sets the debitPinSurchargeAmount value for this NewOrderResponse.
     * 
     * @param debitPinSurchargeAmount
     */
    public void setDebitPinSurchargeAmount(java.lang.String debitPinSurchargeAmount) {
        this.debitPinSurchargeAmount = debitPinSurchargeAmount;
    }


    /**
     * Gets the debitPinTraceNumber value for this NewOrderResponse.
     * 
     * @return debitPinTraceNumber
     */
    public java.lang.String getDebitPinTraceNumber() {
        return debitPinTraceNumber;
    }


    /**
     * Sets the debitPinTraceNumber value for this NewOrderResponse.
     * 
     * @param debitPinTraceNumber
     */
    public void setDebitPinTraceNumber(java.lang.String debitPinTraceNumber) {
        this.debitPinTraceNumber = debitPinTraceNumber;
    }


    /**
     * Gets the fraudAnalysisResponse value for this NewOrderResponse.
     * 
     * @return fraudAnalysisResponse
     */
    public com.budgetprepay.www.Paymentech.FraudAnalysisResponse getFraudAnalysisResponse() {
        return fraudAnalysisResponse;
    }


    /**
     * Sets the fraudAnalysisResponse value for this NewOrderResponse.
     * 
     * @param fraudAnalysisResponse
     */
    public void setFraudAnalysisResponse(com.budgetprepay.www.Paymentech.FraudAnalysisResponse fraudAnalysisResponse) {
        this.fraudAnalysisResponse = fraudAnalysisResponse;
    }


    /**
     * Gets the fraudScoreProcMsg value for this NewOrderResponse.
     * 
     * @return fraudScoreProcMsg
     */
    public java.lang.String getFraudScoreProcMsg() {
        return fraudScoreProcMsg;
    }


    /**
     * Sets the fraudScoreProcMsg value for this NewOrderResponse.
     * 
     * @param fraudScoreProcMsg
     */
    public void setFraudScoreProcMsg(java.lang.String fraudScoreProcMsg) {
        this.fraudScoreProcMsg = fraudScoreProcMsg;
    }


    /**
     * Gets the fraudScoreProcStatus value for this NewOrderResponse.
     * 
     * @return fraudScoreProcStatus
     */
    public java.lang.String getFraudScoreProcStatus() {
        return fraudScoreProcStatus;
    }


    /**
     * Sets the fraudScoreProcStatus value for this NewOrderResponse.
     * 
     * @param fraudScoreProcStatus
     */
    public void setFraudScoreProcStatus(java.lang.String fraudScoreProcStatus) {
        this.fraudScoreProcStatus = fraudScoreProcStatus;
    }


    /**
     * Gets the giftCardInd value for this NewOrderResponse.
     * 
     * @return giftCardInd
     */
    public java.lang.String getGiftCardInd() {
        return giftCardInd;
    }


    /**
     * Sets the giftCardInd value for this NewOrderResponse.
     * 
     * @param giftCardInd
     */
    public void setGiftCardInd(java.lang.String giftCardInd) {
        this.giftCardInd = giftCardInd;
    }


    /**
     * Gets the hostAVSRespCode value for this NewOrderResponse.
     * 
     * @return hostAVSRespCode
     */
    public java.lang.String getHostAVSRespCode() {
        return hostAVSRespCode;
    }


    /**
     * Sets the hostAVSRespCode value for this NewOrderResponse.
     * 
     * @param hostAVSRespCode
     */
    public void setHostAVSRespCode(java.lang.String hostAVSRespCode) {
        this.hostAVSRespCode = hostAVSRespCode;
    }


    /**
     * Gets the hostCVVRespCode value for this NewOrderResponse.
     * 
     * @return hostCVVRespCode
     */
    public java.lang.String getHostCVVRespCode() {
        return hostCVVRespCode;
    }


    /**
     * Sets the hostCVVRespCode value for this NewOrderResponse.
     * 
     * @param hostCVVRespCode
     */
    public void setHostCVVRespCode(java.lang.String hostCVVRespCode) {
        this.hostCVVRespCode = hostCVVRespCode;
    }


    /**
     * Gets the hostRespCode value for this NewOrderResponse.
     * 
     * @return hostRespCode
     */
    public java.lang.String getHostRespCode() {
        return hostRespCode;
    }


    /**
     * Sets the hostRespCode value for this NewOrderResponse.
     * 
     * @param hostRespCode
     */
    public void setHostRespCode(java.lang.String hostRespCode) {
        this.hostRespCode = hostRespCode;
    }


    /**
     * Gets the industryType value for this NewOrderResponse.
     * 
     * @return industryType
     */
    public java.lang.String getIndustryType() {
        return industryType;
    }


    /**
     * Sets the industryType value for this NewOrderResponse.
     * 
     * @param industryType
     */
    public void setIndustryType(java.lang.String industryType) {
        this.industryType = industryType;
    }


    /**
     * Gets the isoCountryCode value for this NewOrderResponse.
     * 
     * @return isoCountryCode
     */
    public java.lang.String getIsoCountryCode() {
        return isoCountryCode;
    }


    /**
     * Sets the isoCountryCode value for this NewOrderResponse.
     * 
     * @param isoCountryCode
     */
    public void setIsoCountryCode(java.lang.String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }


    /**
     * Gets the lastRetryDate value for this NewOrderResponse.
     * 
     * @return lastRetryDate
     */
    public java.lang.String getLastRetryDate() {
        return lastRetryDate;
    }


    /**
     * Sets the lastRetryDate value for this NewOrderResponse.
     * 
     * @param lastRetryDate
     */
    public void setLastRetryDate(java.lang.String lastRetryDate) {
        this.lastRetryDate = lastRetryDate;
    }


    /**
     * Gets the mbMicroPaymentDaysLeft value for this NewOrderResponse.
     * 
     * @return mbMicroPaymentDaysLeft
     */
    public java.lang.String getMbMicroPaymentDaysLeft() {
        return mbMicroPaymentDaysLeft;
    }


    /**
     * Sets the mbMicroPaymentDaysLeft value for this NewOrderResponse.
     * 
     * @param mbMicroPaymentDaysLeft
     */
    public void setMbMicroPaymentDaysLeft(java.lang.String mbMicroPaymentDaysLeft) {
        this.mbMicroPaymentDaysLeft = mbMicroPaymentDaysLeft;
    }


    /**
     * Gets the mbMicroPaymentDollarsLeft value for this NewOrderResponse.
     * 
     * @return mbMicroPaymentDollarsLeft
     */
    public java.lang.String getMbMicroPaymentDollarsLeft() {
        return mbMicroPaymentDollarsLeft;
    }


    /**
     * Sets the mbMicroPaymentDollarsLeft value for this NewOrderResponse.
     * 
     * @param mbMicroPaymentDollarsLeft
     */
    public void setMbMicroPaymentDollarsLeft(java.lang.String mbMicroPaymentDollarsLeft) {
        this.mbMicroPaymentDollarsLeft = mbMicroPaymentDollarsLeft;
    }


    /**
     * Gets the mbStatus value for this NewOrderResponse.
     * 
     * @return mbStatus
     */
    public java.lang.String getMbStatus() {
        return mbStatus;
    }


    /**
     * Sets the mbStatus value for this NewOrderResponse.
     * 
     * @param mbStatus
     */
    public void setMbStatus(java.lang.String mbStatus) {
        this.mbStatus = mbStatus;
    }


    /**
     * Gets the mcRecurringAdvCode value for this NewOrderResponse.
     * 
     * @return mcRecurringAdvCode
     */
    public java.lang.String getMcRecurringAdvCode() {
        return mcRecurringAdvCode;
    }


    /**
     * Sets the mcRecurringAdvCode value for this NewOrderResponse.
     * 
     * @param mcRecurringAdvCode
     */
    public void setMcRecurringAdvCode(java.lang.String mcRecurringAdvCode) {
        this.mcRecurringAdvCode = mcRecurringAdvCode;
    }


    /**
     * Gets the merchantID value for this NewOrderResponse.
     * 
     * @return merchantID
     */
    public java.lang.String getMerchantID() {
        return merchantID;
    }


    /**
     * Sets the merchantID value for this NewOrderResponse.
     * 
     * @param merchantID
     */
    public void setMerchantID(java.lang.String merchantID) {
        this.merchantID = merchantID;
    }


    /**
     * Gets the orderID value for this NewOrderResponse.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this NewOrderResponse.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the partialAuthOccurred value for this NewOrderResponse.
     * 
     * @return partialAuthOccurred
     */
    public java.lang.String getPartialAuthOccurred() {
        return partialAuthOccurred;
    }


    /**
     * Sets the partialAuthOccurred value for this NewOrderResponse.
     * 
     * @param partialAuthOccurred
     */
    public void setPartialAuthOccurred(java.lang.String partialAuthOccurred) {
        this.partialAuthOccurred = partialAuthOccurred;
    }


    /**
     * Gets the procStatus value for this NewOrderResponse.
     * 
     * @return procStatus
     */
    public java.lang.String getProcStatus() {
        return procStatus;
    }


    /**
     * Sets the procStatus value for this NewOrderResponse.
     * 
     * @param procStatus
     */
    public void setProcStatus(java.lang.String procStatus) {
        this.procStatus = procStatus;
    }


    /**
     * Gets the procStatusMessage value for this NewOrderResponse.
     * 
     * @return procStatusMessage
     */
    public java.lang.String getProcStatusMessage() {
        return procStatusMessage;
    }


    /**
     * Sets the procStatusMessage value for this NewOrderResponse.
     * 
     * @param procStatusMessage
     */
    public void setProcStatusMessage(java.lang.String procStatusMessage) {
        this.procStatusMessage = procStatusMessage;
    }


    /**
     * Gets the profileProcStatus value for this NewOrderResponse.
     * 
     * @return profileProcStatus
     */
    public java.lang.String getProfileProcStatus() {
        return profileProcStatus;
    }


    /**
     * Sets the profileProcStatus value for this NewOrderResponse.
     * 
     * @param profileProcStatus
     */
    public void setProfileProcStatus(java.lang.String profileProcStatus) {
        this.profileProcStatus = profileProcStatus;
    }


    /**
     * Gets the profileProcStatusMsg value for this NewOrderResponse.
     * 
     * @return profileProcStatusMsg
     */
    public java.lang.String getProfileProcStatusMsg() {
        return profileProcStatusMsg;
    }


    /**
     * Sets the profileProcStatusMsg value for this NewOrderResponse.
     * 
     * @param profileProcStatusMsg
     */
    public void setProfileProcStatusMsg(java.lang.String profileProcStatusMsg) {
        this.profileProcStatusMsg = profileProcStatusMsg;
    }


    /**
     * Gets the redeemedAmount value for this NewOrderResponse.
     * 
     * @return redeemedAmount
     */
    public java.lang.String getRedeemedAmount() {
        return redeemedAmount;
    }


    /**
     * Sets the redeemedAmount value for this NewOrderResponse.
     * 
     * @param redeemedAmount
     */
    public void setRedeemedAmount(java.lang.String redeemedAmount) {
        this.redeemedAmount = redeemedAmount;
    }


    /**
     * Gets the remainingBalance value for this NewOrderResponse.
     * 
     * @return remainingBalance
     */
    public java.lang.String getRemainingBalance() {
        return remainingBalance;
    }


    /**
     * Sets the remainingBalance value for this NewOrderResponse.
     * 
     * @param remainingBalance
     */
    public void setRemainingBalance(java.lang.String remainingBalance) {
        this.remainingBalance = remainingBalance;
    }


    /**
     * Gets the requestAmount value for this NewOrderResponse.
     * 
     * @return requestAmount
     */
    public java.lang.String getRequestAmount() {
        return requestAmount;
    }


    /**
     * Sets the requestAmount value for this NewOrderResponse.
     * 
     * @param requestAmount
     */
    public void setRequestAmount(java.lang.String requestAmount) {
        this.requestAmount = requestAmount;
    }


    /**
     * Gets the respCode value for this NewOrderResponse.
     * 
     * @return respCode
     */
    public java.lang.String getRespCode() {
        return respCode;
    }


    /**
     * Sets the respCode value for this NewOrderResponse.
     * 
     * @param respCode
     */
    public void setRespCode(java.lang.String respCode) {
        this.respCode = respCode;
    }


    /**
     * Gets the respCodeMessage value for this NewOrderResponse.
     * 
     * @return respCodeMessage
     */
    public java.lang.String getRespCodeMessage() {
        return respCodeMessage;
    }


    /**
     * Sets the respCodeMessage value for this NewOrderResponse.
     * 
     * @param respCodeMessage
     */
    public void setRespCodeMessage(java.lang.String respCodeMessage) {
        this.respCodeMessage = respCodeMessage;
    }


    /**
     * Gets the respDateTime value for this NewOrderResponse.
     * 
     * @return respDateTime
     */
    public java.lang.String getRespDateTime() {
        return respDateTime;
    }


    /**
     * Sets the respDateTime value for this NewOrderResponse.
     * 
     * @param respDateTime
     */
    public void setRespDateTime(java.lang.String respDateTime) {
        this.respDateTime = respDateTime;
    }


    /**
     * Gets the retryAttempCount value for this NewOrderResponse.
     * 
     * @return retryAttempCount
     */
    public java.lang.String getRetryAttempCount() {
        return retryAttempCount;
    }


    /**
     * Sets the retryAttempCount value for this NewOrderResponse.
     * 
     * @param retryAttempCount
     */
    public void setRetryAttempCount(java.lang.String retryAttempCount) {
        this.retryAttempCount = retryAttempCount;
    }


    /**
     * Gets the retryTrace value for this NewOrderResponse.
     * 
     * @return retryTrace
     */
    public java.lang.String getRetryTrace() {
        return retryTrace;
    }


    /**
     * Sets the retryTrace value for this NewOrderResponse.
     * 
     * @param retryTrace
     */
    public void setRetryTrace(java.lang.String retryTrace) {
        this.retryTrace = retryTrace;
    }


    /**
     * Gets the terminalID value for this NewOrderResponse.
     * 
     * @return terminalID
     */
    public java.lang.String getTerminalID() {
        return terminalID;
    }


    /**
     * Sets the terminalID value for this NewOrderResponse.
     * 
     * @param terminalID
     */
    public void setTerminalID(java.lang.String terminalID) {
        this.terminalID = terminalID;
    }


    /**
     * Gets the transType value for this NewOrderResponse.
     * 
     * @return transType
     */
    public java.lang.String getTransType() {
        return transType;
    }


    /**
     * Sets the transType value for this NewOrderResponse.
     * 
     * @param transType
     */
    public void setTransType(java.lang.String transType) {
        this.transType = transType;
    }


    /**
     * Gets the txRefIdx value for this NewOrderResponse.
     * 
     * @return txRefIdx
     */
    public java.lang.String getTxRefIdx() {
        return txRefIdx;
    }


    /**
     * Sets the txRefIdx value for this NewOrderResponse.
     * 
     * @param txRefIdx
     */
    public void setTxRefIdx(java.lang.String txRefIdx) {
        this.txRefIdx = txRefIdx;
    }


    /**
     * Gets the txRefNum value for this NewOrderResponse.
     * 
     * @return txRefNum
     */
    public java.lang.String getTxRefNum() {
        return txRefNum;
    }


    /**
     * Sets the txRefNum value for this NewOrderResponse.
     * 
     * @param txRefNum
     */
    public void setTxRefNum(java.lang.String txRefNum) {
        this.txRefNum = txRefNum;
    }


    /**
     * Gets the version value for this NewOrderResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this NewOrderResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the visaVbVRespCode value for this NewOrderResponse.
     * 
     * @return visaVbVRespCode
     */
    public java.lang.String getVisaVbVRespCode() {
        return visaVbVRespCode;
    }


    /**
     * Sets the visaVbVRespCode value for this NewOrderResponse.
     * 
     * @param visaVbVRespCode
     */
    public void setVisaVbVRespCode(java.lang.String visaVbVRespCode) {
        this.visaVbVRespCode = visaVbVRespCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewOrderResponse)) return false;
        NewOrderResponse other = (NewOrderResponse) obj;
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
            ((this.avsRespCode==null && other.getAvsRespCode()==null) || 
             (this.avsRespCode!=null &&
              this.avsRespCode.equals(other.getAvsRespCode()))) &&
            ((this.bin==null && other.getBin()==null) || 
             (this.bin!=null &&
              this.bin.equals(other.getBin()))) &&
            ((this.cardBrand==null && other.getCardBrand()==null) || 
             (this.cardBrand!=null &&
              this.cardBrand.equals(other.getCardBrand()))) &&
            ((this.ccAccountNum==null && other.getCcAccountNum()==null) || 
             (this.ccAccountNum!=null &&
              this.ccAccountNum.equals(other.getCcAccountNum()))) &&
            ((this.countryFraudFilterStatus==null && other.getCountryFraudFilterStatus()==null) || 
             (this.countryFraudFilterStatus!=null &&
              this.countryFraudFilterStatus.equals(other.getCountryFraudFilterStatus()))) &&
            ((this.ctiAffluentCard==null && other.getCtiAffluentCard()==null) || 
             (this.ctiAffluentCard!=null &&
              this.ctiAffluentCard.equals(other.getCtiAffluentCard()))) &&
            ((this.ctiCommercialCard==null && other.getCtiCommercialCard()==null) || 
             (this.ctiCommercialCard!=null &&
              this.ctiCommercialCard.equals(other.getCtiCommercialCard()))) &&
            ((this.ctiDurbinExemption==null && other.getCtiDurbinExemption()==null) || 
             (this.ctiDurbinExemption!=null &&
              this.ctiDurbinExemption.equals(other.getCtiDurbinExemption()))) &&
            ((this.ctiHealthcareCard==null && other.getCtiHealthcareCard()==null) || 
             (this.ctiHealthcareCard!=null &&
              this.ctiHealthcareCard.equals(other.getCtiHealthcareCard()))) &&
            ((this.ctiIssuingCountry==null && other.getCtiIssuingCountry()==null) || 
             (this.ctiIssuingCountry!=null &&
              this.ctiIssuingCountry.equals(other.getCtiIssuingCountry()))) &&
            ((this.ctiLevel3Eligible==null && other.getCtiLevel3Eligible()==null) || 
             (this.ctiLevel3Eligible!=null &&
              this.ctiLevel3Eligible.equals(other.getCtiLevel3Eligible()))) &&
            ((this.ctiPINlessDebitCard==null && other.getCtiPINlessDebitCard()==null) || 
             (this.ctiPINlessDebitCard!=null &&
              this.ctiPINlessDebitCard.equals(other.getCtiPINlessDebitCard()))) &&
            ((this.ctiPayrollCard==null && other.getCtiPayrollCard()==null) || 
             (this.ctiPayrollCard!=null &&
              this.ctiPayrollCard.equals(other.getCtiPayrollCard()))) &&
            ((this.ctiPrepaidCard==null && other.getCtiPrepaidCard()==null) || 
             (this.ctiPrepaidCard!=null &&
              this.ctiPrepaidCard.equals(other.getCtiPrepaidCard()))) &&
            ((this.ctiSignatureDebitCard==null && other.getCtiSignatureDebitCard()==null) || 
             (this.ctiSignatureDebitCard!=null &&
              this.ctiSignatureDebitCard.equals(other.getCtiSignatureDebitCard()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.customerRefNum==null && other.getCustomerRefNum()==null) || 
             (this.customerRefNum!=null &&
              this.customerRefNum.equals(other.getCustomerRefNum()))) &&
            ((this.cvvRespCode==null && other.getCvvRespCode()==null) || 
             (this.cvvRespCode!=null &&
              this.cvvRespCode.equals(other.getCvvRespCode()))) &&
            ((this.debitBillerReferenceNumber==null && other.getDebitBillerReferenceNumber()==null) || 
             (this.debitBillerReferenceNumber!=null &&
              this.debitBillerReferenceNumber.equals(other.getDebitBillerReferenceNumber()))) &&
            ((this.debitPinNetworkID==null && other.getDebitPinNetworkID()==null) || 
             (this.debitPinNetworkID!=null &&
              this.debitPinNetworkID.equals(other.getDebitPinNetworkID()))) &&
            ((this.debitPinSurchargeAmount==null && other.getDebitPinSurchargeAmount()==null) || 
             (this.debitPinSurchargeAmount!=null &&
              this.debitPinSurchargeAmount.equals(other.getDebitPinSurchargeAmount()))) &&
            ((this.debitPinTraceNumber==null && other.getDebitPinTraceNumber()==null) || 
             (this.debitPinTraceNumber!=null &&
              this.debitPinTraceNumber.equals(other.getDebitPinTraceNumber()))) &&
            ((this.fraudAnalysisResponse==null && other.getFraudAnalysisResponse()==null) || 
             (this.fraudAnalysisResponse!=null &&
              this.fraudAnalysisResponse.equals(other.getFraudAnalysisResponse()))) &&
            ((this.fraudScoreProcMsg==null && other.getFraudScoreProcMsg()==null) || 
             (this.fraudScoreProcMsg!=null &&
              this.fraudScoreProcMsg.equals(other.getFraudScoreProcMsg()))) &&
            ((this.fraudScoreProcStatus==null && other.getFraudScoreProcStatus()==null) || 
             (this.fraudScoreProcStatus!=null &&
              this.fraudScoreProcStatus.equals(other.getFraudScoreProcStatus()))) &&
            ((this.giftCardInd==null && other.getGiftCardInd()==null) || 
             (this.giftCardInd!=null &&
              this.giftCardInd.equals(other.getGiftCardInd()))) &&
            ((this.hostAVSRespCode==null && other.getHostAVSRespCode()==null) || 
             (this.hostAVSRespCode!=null &&
              this.hostAVSRespCode.equals(other.getHostAVSRespCode()))) &&
            ((this.hostCVVRespCode==null && other.getHostCVVRespCode()==null) || 
             (this.hostCVVRespCode!=null &&
              this.hostCVVRespCode.equals(other.getHostCVVRespCode()))) &&
            ((this.hostRespCode==null && other.getHostRespCode()==null) || 
             (this.hostRespCode!=null &&
              this.hostRespCode.equals(other.getHostRespCode()))) &&
            ((this.industryType==null && other.getIndustryType()==null) || 
             (this.industryType!=null &&
              this.industryType.equals(other.getIndustryType()))) &&
            ((this.isoCountryCode==null && other.getIsoCountryCode()==null) || 
             (this.isoCountryCode!=null &&
              this.isoCountryCode.equals(other.getIsoCountryCode()))) &&
            ((this.lastRetryDate==null && other.getLastRetryDate()==null) || 
             (this.lastRetryDate!=null &&
              this.lastRetryDate.equals(other.getLastRetryDate()))) &&
            ((this.mbMicroPaymentDaysLeft==null && other.getMbMicroPaymentDaysLeft()==null) || 
             (this.mbMicroPaymentDaysLeft!=null &&
              this.mbMicroPaymentDaysLeft.equals(other.getMbMicroPaymentDaysLeft()))) &&
            ((this.mbMicroPaymentDollarsLeft==null && other.getMbMicroPaymentDollarsLeft()==null) || 
             (this.mbMicroPaymentDollarsLeft!=null &&
              this.mbMicroPaymentDollarsLeft.equals(other.getMbMicroPaymentDollarsLeft()))) &&
            ((this.mbStatus==null && other.getMbStatus()==null) || 
             (this.mbStatus!=null &&
              this.mbStatus.equals(other.getMbStatus()))) &&
            ((this.mcRecurringAdvCode==null && other.getMcRecurringAdvCode()==null) || 
             (this.mcRecurringAdvCode!=null &&
              this.mcRecurringAdvCode.equals(other.getMcRecurringAdvCode()))) &&
            ((this.merchantID==null && other.getMerchantID()==null) || 
             (this.merchantID!=null &&
              this.merchantID.equals(other.getMerchantID()))) &&
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.partialAuthOccurred==null && other.getPartialAuthOccurred()==null) || 
             (this.partialAuthOccurred!=null &&
              this.partialAuthOccurred.equals(other.getPartialAuthOccurred()))) &&
            ((this.procStatus==null && other.getProcStatus()==null) || 
             (this.procStatus!=null &&
              this.procStatus.equals(other.getProcStatus()))) &&
            ((this.procStatusMessage==null && other.getProcStatusMessage()==null) || 
             (this.procStatusMessage!=null &&
              this.procStatusMessage.equals(other.getProcStatusMessage()))) &&
            ((this.profileProcStatus==null && other.getProfileProcStatus()==null) || 
             (this.profileProcStatus!=null &&
              this.profileProcStatus.equals(other.getProfileProcStatus()))) &&
            ((this.profileProcStatusMsg==null && other.getProfileProcStatusMsg()==null) || 
             (this.profileProcStatusMsg!=null &&
              this.profileProcStatusMsg.equals(other.getProfileProcStatusMsg()))) &&
            ((this.redeemedAmount==null && other.getRedeemedAmount()==null) || 
             (this.redeemedAmount!=null &&
              this.redeemedAmount.equals(other.getRedeemedAmount()))) &&
            ((this.remainingBalance==null && other.getRemainingBalance()==null) || 
             (this.remainingBalance!=null &&
              this.remainingBalance.equals(other.getRemainingBalance()))) &&
            ((this.requestAmount==null && other.getRequestAmount()==null) || 
             (this.requestAmount!=null &&
              this.requestAmount.equals(other.getRequestAmount()))) &&
            ((this.respCode==null && other.getRespCode()==null) || 
             (this.respCode!=null &&
              this.respCode.equals(other.getRespCode()))) &&
            ((this.respCodeMessage==null && other.getRespCodeMessage()==null) || 
             (this.respCodeMessage!=null &&
              this.respCodeMessage.equals(other.getRespCodeMessage()))) &&
            ((this.respDateTime==null && other.getRespDateTime()==null) || 
             (this.respDateTime!=null &&
              this.respDateTime.equals(other.getRespDateTime()))) &&
            ((this.retryAttempCount==null && other.getRetryAttempCount()==null) || 
             (this.retryAttempCount!=null &&
              this.retryAttempCount.equals(other.getRetryAttempCount()))) &&
            ((this.retryTrace==null && other.getRetryTrace()==null) || 
             (this.retryTrace!=null &&
              this.retryTrace.equals(other.getRetryTrace()))) &&
            ((this.terminalID==null && other.getTerminalID()==null) || 
             (this.terminalID!=null &&
              this.terminalID.equals(other.getTerminalID()))) &&
            ((this.transType==null && other.getTransType()==null) || 
             (this.transType!=null &&
              this.transType.equals(other.getTransType()))) &&
            ((this.txRefIdx==null && other.getTxRefIdx()==null) || 
             (this.txRefIdx!=null &&
              this.txRefIdx.equals(other.getTxRefIdx()))) &&
            ((this.txRefNum==null && other.getTxRefNum()==null) || 
             (this.txRefNum!=null &&
              this.txRefNum.equals(other.getTxRefNum()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.visaVbVRespCode==null && other.getVisaVbVRespCode()==null) || 
             (this.visaVbVRespCode!=null &&
              this.visaVbVRespCode.equals(other.getVisaVbVRespCode())));
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
        if (getAvsRespCode() != null) {
            _hashCode += getAvsRespCode().hashCode();
        }
        if (getBin() != null) {
            _hashCode += getBin().hashCode();
        }
        if (getCardBrand() != null) {
            _hashCode += getCardBrand().hashCode();
        }
        if (getCcAccountNum() != null) {
            _hashCode += getCcAccountNum().hashCode();
        }
        if (getCountryFraudFilterStatus() != null) {
            _hashCode += getCountryFraudFilterStatus().hashCode();
        }
        if (getCtiAffluentCard() != null) {
            _hashCode += getCtiAffluentCard().hashCode();
        }
        if (getCtiCommercialCard() != null) {
            _hashCode += getCtiCommercialCard().hashCode();
        }
        if (getCtiDurbinExemption() != null) {
            _hashCode += getCtiDurbinExemption().hashCode();
        }
        if (getCtiHealthcareCard() != null) {
            _hashCode += getCtiHealthcareCard().hashCode();
        }
        if (getCtiIssuingCountry() != null) {
            _hashCode += getCtiIssuingCountry().hashCode();
        }
        if (getCtiLevel3Eligible() != null) {
            _hashCode += getCtiLevel3Eligible().hashCode();
        }
        if (getCtiPINlessDebitCard() != null) {
            _hashCode += getCtiPINlessDebitCard().hashCode();
        }
        if (getCtiPayrollCard() != null) {
            _hashCode += getCtiPayrollCard().hashCode();
        }
        if (getCtiPrepaidCard() != null) {
            _hashCode += getCtiPrepaidCard().hashCode();
        }
        if (getCtiSignatureDebitCard() != null) {
            _hashCode += getCtiSignatureDebitCard().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getCustomerRefNum() != null) {
            _hashCode += getCustomerRefNum().hashCode();
        }
        if (getCvvRespCode() != null) {
            _hashCode += getCvvRespCode().hashCode();
        }
        if (getDebitBillerReferenceNumber() != null) {
            _hashCode += getDebitBillerReferenceNumber().hashCode();
        }
        if (getDebitPinNetworkID() != null) {
            _hashCode += getDebitPinNetworkID().hashCode();
        }
        if (getDebitPinSurchargeAmount() != null) {
            _hashCode += getDebitPinSurchargeAmount().hashCode();
        }
        if (getDebitPinTraceNumber() != null) {
            _hashCode += getDebitPinTraceNumber().hashCode();
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
        if (getGiftCardInd() != null) {
            _hashCode += getGiftCardInd().hashCode();
        }
        if (getHostAVSRespCode() != null) {
            _hashCode += getHostAVSRespCode().hashCode();
        }
        if (getHostCVVRespCode() != null) {
            _hashCode += getHostCVVRespCode().hashCode();
        }
        if (getHostRespCode() != null) {
            _hashCode += getHostRespCode().hashCode();
        }
        if (getIndustryType() != null) {
            _hashCode += getIndustryType().hashCode();
        }
        if (getIsoCountryCode() != null) {
            _hashCode += getIsoCountryCode().hashCode();
        }
        if (getLastRetryDate() != null) {
            _hashCode += getLastRetryDate().hashCode();
        }
        if (getMbMicroPaymentDaysLeft() != null) {
            _hashCode += getMbMicroPaymentDaysLeft().hashCode();
        }
        if (getMbMicroPaymentDollarsLeft() != null) {
            _hashCode += getMbMicroPaymentDollarsLeft().hashCode();
        }
        if (getMbStatus() != null) {
            _hashCode += getMbStatus().hashCode();
        }
        if (getMcRecurringAdvCode() != null) {
            _hashCode += getMcRecurringAdvCode().hashCode();
        }
        if (getMerchantID() != null) {
            _hashCode += getMerchantID().hashCode();
        }
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getPartialAuthOccurred() != null) {
            _hashCode += getPartialAuthOccurred().hashCode();
        }
        if (getProcStatus() != null) {
            _hashCode += getProcStatus().hashCode();
        }
        if (getProcStatusMessage() != null) {
            _hashCode += getProcStatusMessage().hashCode();
        }
        if (getProfileProcStatus() != null) {
            _hashCode += getProfileProcStatus().hashCode();
        }
        if (getProfileProcStatusMsg() != null) {
            _hashCode += getProfileProcStatusMsg().hashCode();
        }
        if (getRedeemedAmount() != null) {
            _hashCode += getRedeemedAmount().hashCode();
        }
        if (getRemainingBalance() != null) {
            _hashCode += getRemainingBalance().hashCode();
        }
        if (getRequestAmount() != null) {
            _hashCode += getRequestAmount().hashCode();
        }
        if (getRespCode() != null) {
            _hashCode += getRespCode().hashCode();
        }
        if (getRespCodeMessage() != null) {
            _hashCode += getRespCodeMessage().hashCode();
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
        if (getTerminalID() != null) {
            _hashCode += getTerminalID().hashCode();
        }
        if (getTransType() != null) {
            _hashCode += getTransType().hashCode();
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
        if (getVisaVbVRespCode() != null) {
            _hashCode += getVisaVbVRespCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewOrderResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "NewOrderResponse"));
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
        elemField.setFieldName("avsRespCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsRespCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardBrand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "cardBrand"));
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
        elemField.setFieldName("countryFraudFilterStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "countryFraudFilterStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctiAffluentCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ctiAffluentCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctiCommercialCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ctiCommercialCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctiDurbinExemption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ctiDurbinExemption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctiHealthcareCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ctiHealthcareCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctiIssuingCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ctiIssuingCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctiLevel3Eligible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ctiLevel3Eligible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctiPINlessDebitCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ctiPINlessDebitCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctiPayrollCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ctiPayrollCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctiPrepaidCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ctiPrepaidCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctiSignatureDebitCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ctiSignatureDebitCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerRefNum"));
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
        elemField.setFieldName("debitBillerReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "debitBillerReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitPinNetworkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "debitPinNetworkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitPinSurchargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "debitPinSurchargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitPinTraceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "debitPinTraceNumber"));
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
        elemField.setFieldName("giftCardInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "giftCardInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostAVSRespCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "hostAVSRespCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostCVVRespCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "hostCVVRespCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostRespCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "hostRespCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "industryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isoCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "isoCountryCode"));
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
        elemField.setFieldName("mbMicroPaymentDaysLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbMicroPaymentDaysLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbMicroPaymentDollarsLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbMicroPaymentDollarsLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mcRecurringAdvCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mcRecurringAdvCode"));
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
        elemField.setFieldName("partialAuthOccurred");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "partialAuthOccurred"));
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
        elemField.setFieldName("profileProcStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "profileProcStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileProcStatusMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "profileProcStatusMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redeemedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "redeemedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "remainingBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "requestAmount"));
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
        elemField.setFieldName("respCodeMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "respCodeMessage"));
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
        elemField.setFieldName("terminalID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "terminalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "transType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaVbVRespCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "visaVbVRespCode"));
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
