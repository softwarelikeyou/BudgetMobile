/**
 * ProfileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class ProfileResponse  implements java.io.Serializable {
    private com.budgetprepay.www.Paymentech.ErrorMessage errorMessage;

    private java.lang.String accountUpdaterEligibility;

    private java.lang.String bin;

    private java.lang.String ccAccountNum;

    private java.lang.String ccExp;

    private java.lang.String customerAccountType;

    private java.lang.String customerAddress1;

    private java.lang.String customerAddress2;

    private java.lang.String customerCity;

    private java.lang.String customerCountryCode;

    private java.lang.String customerEmail;

    private java.lang.String customerName;

    private java.lang.String customerPhone;

    private java.lang.String customerRefNum;

    private java.lang.String customerState;

    private java.lang.String customerZIP;

    private java.lang.String debitBillerReferenceNumber;

    private java.lang.String ecpBankAcctType;

    private java.lang.String ecpCheckDDA;

    private java.lang.String ecpCheckRT;

    private java.lang.String ecpDelvMethod;

    private java.lang.String euddBankSortCode;

    private java.lang.String euddCountryCode;

    private java.lang.String euddRibCode;

    private java.lang.String mbDeferredBillDate;

    private java.lang.String mbMicroPaymentDaysLeft;

    private java.lang.String mbMicroPaymentDollarsLeft;

    private java.lang.String mbMicroPaymentMaxBillingDays;

    private java.lang.String mbMicroPaymentMaxDollarValue;

    private java.lang.String mbMicroPaymentMaxTransactions;

    private java.lang.String mbOrderIdGenerationMethod;

    private java.lang.String mbRecurringEndDate;

    private java.lang.String mbRecurringFrequency;

    private java.lang.String mbRecurringMaxBillings;

    private java.lang.String mbRecurringNoEndDateFlag;

    private java.lang.String mbRecurringStartDate;

    private java.lang.String mbStatus;

    private java.lang.String mbType;

    private java.lang.String mcSecureCodeAAV;

    private java.lang.String merchantID;

    private java.lang.String orderDefaultAmount;

    private java.lang.String orderDefaultDescription;

    private java.lang.String procStatus;

    private java.lang.String procStatusMessage;

    private java.lang.String profileAction;

    private java.lang.String profileOrderOverideInd;

    private java.lang.String softDescMercCity;

    private java.lang.String softDescMercEmail;

    private java.lang.String softDescMercName;

    private java.lang.String softDescMercPhone;

    private java.lang.String softDescMercURL;

    private java.lang.String softDescProdDesc;

    private java.lang.String status;

    private java.lang.String switchSoloCardStartDate;

    private java.lang.String switchSoloIssueNum;

    private java.lang.String version;

    public ProfileResponse() {
    }

    public ProfileResponse(
           com.budgetprepay.www.Paymentech.ErrorMessage errorMessage,
           java.lang.String accountUpdaterEligibility,
           java.lang.String bin,
           java.lang.String ccAccountNum,
           java.lang.String ccExp,
           java.lang.String customerAccountType,
           java.lang.String customerAddress1,
           java.lang.String customerAddress2,
           java.lang.String customerCity,
           java.lang.String customerCountryCode,
           java.lang.String customerEmail,
           java.lang.String customerName,
           java.lang.String customerPhone,
           java.lang.String customerRefNum,
           java.lang.String customerState,
           java.lang.String customerZIP,
           java.lang.String debitBillerReferenceNumber,
           java.lang.String ecpBankAcctType,
           java.lang.String ecpCheckDDA,
           java.lang.String ecpCheckRT,
           java.lang.String ecpDelvMethod,
           java.lang.String euddBankSortCode,
           java.lang.String euddCountryCode,
           java.lang.String euddRibCode,
           java.lang.String mbDeferredBillDate,
           java.lang.String mbMicroPaymentDaysLeft,
           java.lang.String mbMicroPaymentDollarsLeft,
           java.lang.String mbMicroPaymentMaxBillingDays,
           java.lang.String mbMicroPaymentMaxDollarValue,
           java.lang.String mbMicroPaymentMaxTransactions,
           java.lang.String mbOrderIdGenerationMethod,
           java.lang.String mbRecurringEndDate,
           java.lang.String mbRecurringFrequency,
           java.lang.String mbRecurringMaxBillings,
           java.lang.String mbRecurringNoEndDateFlag,
           java.lang.String mbRecurringStartDate,
           java.lang.String mbStatus,
           java.lang.String mbType,
           java.lang.String mcSecureCodeAAV,
           java.lang.String merchantID,
           java.lang.String orderDefaultAmount,
           java.lang.String orderDefaultDescription,
           java.lang.String procStatus,
           java.lang.String procStatusMessage,
           java.lang.String profileAction,
           java.lang.String profileOrderOverideInd,
           java.lang.String softDescMercCity,
           java.lang.String softDescMercEmail,
           java.lang.String softDescMercName,
           java.lang.String softDescMercPhone,
           java.lang.String softDescMercURL,
           java.lang.String softDescProdDesc,
           java.lang.String status,
           java.lang.String switchSoloCardStartDate,
           java.lang.String switchSoloIssueNum,
           java.lang.String version) {
           this.errorMessage = errorMessage;
           this.accountUpdaterEligibility = accountUpdaterEligibility;
           this.bin = bin;
           this.ccAccountNum = ccAccountNum;
           this.ccExp = ccExp;
           this.customerAccountType = customerAccountType;
           this.customerAddress1 = customerAddress1;
           this.customerAddress2 = customerAddress2;
           this.customerCity = customerCity;
           this.customerCountryCode = customerCountryCode;
           this.customerEmail = customerEmail;
           this.customerName = customerName;
           this.customerPhone = customerPhone;
           this.customerRefNum = customerRefNum;
           this.customerState = customerState;
           this.customerZIP = customerZIP;
           this.debitBillerReferenceNumber = debitBillerReferenceNumber;
           this.ecpBankAcctType = ecpBankAcctType;
           this.ecpCheckDDA = ecpCheckDDA;
           this.ecpCheckRT = ecpCheckRT;
           this.ecpDelvMethod = ecpDelvMethod;
           this.euddBankSortCode = euddBankSortCode;
           this.euddCountryCode = euddCountryCode;
           this.euddRibCode = euddRibCode;
           this.mbDeferredBillDate = mbDeferredBillDate;
           this.mbMicroPaymentDaysLeft = mbMicroPaymentDaysLeft;
           this.mbMicroPaymentDollarsLeft = mbMicroPaymentDollarsLeft;
           this.mbMicroPaymentMaxBillingDays = mbMicroPaymentMaxBillingDays;
           this.mbMicroPaymentMaxDollarValue = mbMicroPaymentMaxDollarValue;
           this.mbMicroPaymentMaxTransactions = mbMicroPaymentMaxTransactions;
           this.mbOrderIdGenerationMethod = mbOrderIdGenerationMethod;
           this.mbRecurringEndDate = mbRecurringEndDate;
           this.mbRecurringFrequency = mbRecurringFrequency;
           this.mbRecurringMaxBillings = mbRecurringMaxBillings;
           this.mbRecurringNoEndDateFlag = mbRecurringNoEndDateFlag;
           this.mbRecurringStartDate = mbRecurringStartDate;
           this.mbStatus = mbStatus;
           this.mbType = mbType;
           this.mcSecureCodeAAV = mcSecureCodeAAV;
           this.merchantID = merchantID;
           this.orderDefaultAmount = orderDefaultAmount;
           this.orderDefaultDescription = orderDefaultDescription;
           this.procStatus = procStatus;
           this.procStatusMessage = procStatusMessage;
           this.profileAction = profileAction;
           this.profileOrderOverideInd = profileOrderOverideInd;
           this.softDescMercCity = softDescMercCity;
           this.softDescMercEmail = softDescMercEmail;
           this.softDescMercName = softDescMercName;
           this.softDescMercPhone = softDescMercPhone;
           this.softDescMercURL = softDescMercURL;
           this.softDescProdDesc = softDescProdDesc;
           this.status = status;
           this.switchSoloCardStartDate = switchSoloCardStartDate;
           this.switchSoloIssueNum = switchSoloIssueNum;
           this.version = version;
    }


    /**
     * Gets the errorMessage value for this ProfileResponse.
     * 
     * @return errorMessage
     */
    public com.budgetprepay.www.Paymentech.ErrorMessage getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ProfileResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(com.budgetprepay.www.Paymentech.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the accountUpdaterEligibility value for this ProfileResponse.
     * 
     * @return accountUpdaterEligibility
     */
    public java.lang.String getAccountUpdaterEligibility() {
        return accountUpdaterEligibility;
    }


    /**
     * Sets the accountUpdaterEligibility value for this ProfileResponse.
     * 
     * @param accountUpdaterEligibility
     */
    public void setAccountUpdaterEligibility(java.lang.String accountUpdaterEligibility) {
        this.accountUpdaterEligibility = accountUpdaterEligibility;
    }


    /**
     * Gets the bin value for this ProfileResponse.
     * 
     * @return bin
     */
    public java.lang.String getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this ProfileResponse.
     * 
     * @param bin
     */
    public void setBin(java.lang.String bin) {
        this.bin = bin;
    }


    /**
     * Gets the ccAccountNum value for this ProfileResponse.
     * 
     * @return ccAccountNum
     */
    public java.lang.String getCcAccountNum() {
        return ccAccountNum;
    }


    /**
     * Sets the ccAccountNum value for this ProfileResponse.
     * 
     * @param ccAccountNum
     */
    public void setCcAccountNum(java.lang.String ccAccountNum) {
        this.ccAccountNum = ccAccountNum;
    }


    /**
     * Gets the ccExp value for this ProfileResponse.
     * 
     * @return ccExp
     */
    public java.lang.String getCcExp() {
        return ccExp;
    }


    /**
     * Sets the ccExp value for this ProfileResponse.
     * 
     * @param ccExp
     */
    public void setCcExp(java.lang.String ccExp) {
        this.ccExp = ccExp;
    }


    /**
     * Gets the customerAccountType value for this ProfileResponse.
     * 
     * @return customerAccountType
     */
    public java.lang.String getCustomerAccountType() {
        return customerAccountType;
    }


    /**
     * Sets the customerAccountType value for this ProfileResponse.
     * 
     * @param customerAccountType
     */
    public void setCustomerAccountType(java.lang.String customerAccountType) {
        this.customerAccountType = customerAccountType;
    }


    /**
     * Gets the customerAddress1 value for this ProfileResponse.
     * 
     * @return customerAddress1
     */
    public java.lang.String getCustomerAddress1() {
        return customerAddress1;
    }


    /**
     * Sets the customerAddress1 value for this ProfileResponse.
     * 
     * @param customerAddress1
     */
    public void setCustomerAddress1(java.lang.String customerAddress1) {
        this.customerAddress1 = customerAddress1;
    }


    /**
     * Gets the customerAddress2 value for this ProfileResponse.
     * 
     * @return customerAddress2
     */
    public java.lang.String getCustomerAddress2() {
        return customerAddress2;
    }


    /**
     * Sets the customerAddress2 value for this ProfileResponse.
     * 
     * @param customerAddress2
     */
    public void setCustomerAddress2(java.lang.String customerAddress2) {
        this.customerAddress2 = customerAddress2;
    }


    /**
     * Gets the customerCity value for this ProfileResponse.
     * 
     * @return customerCity
     */
    public java.lang.String getCustomerCity() {
        return customerCity;
    }


    /**
     * Sets the customerCity value for this ProfileResponse.
     * 
     * @param customerCity
     */
    public void setCustomerCity(java.lang.String customerCity) {
        this.customerCity = customerCity;
    }


    /**
     * Gets the customerCountryCode value for this ProfileResponse.
     * 
     * @return customerCountryCode
     */
    public java.lang.String getCustomerCountryCode() {
        return customerCountryCode;
    }


    /**
     * Sets the customerCountryCode value for this ProfileResponse.
     * 
     * @param customerCountryCode
     */
    public void setCustomerCountryCode(java.lang.String customerCountryCode) {
        this.customerCountryCode = customerCountryCode;
    }


    /**
     * Gets the customerEmail value for this ProfileResponse.
     * 
     * @return customerEmail
     */
    public java.lang.String getCustomerEmail() {
        return customerEmail;
    }


    /**
     * Sets the customerEmail value for this ProfileResponse.
     * 
     * @param customerEmail
     */
    public void setCustomerEmail(java.lang.String customerEmail) {
        this.customerEmail = customerEmail;
    }


    /**
     * Gets the customerName value for this ProfileResponse.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this ProfileResponse.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the customerPhone value for this ProfileResponse.
     * 
     * @return customerPhone
     */
    public java.lang.String getCustomerPhone() {
        return customerPhone;
    }


    /**
     * Sets the customerPhone value for this ProfileResponse.
     * 
     * @param customerPhone
     */
    public void setCustomerPhone(java.lang.String customerPhone) {
        this.customerPhone = customerPhone;
    }


    /**
     * Gets the customerRefNum value for this ProfileResponse.
     * 
     * @return customerRefNum
     */
    public java.lang.String getCustomerRefNum() {
        return customerRefNum;
    }


    /**
     * Sets the customerRefNum value for this ProfileResponse.
     * 
     * @param customerRefNum
     */
    public void setCustomerRefNum(java.lang.String customerRefNum) {
        this.customerRefNum = customerRefNum;
    }


    /**
     * Gets the customerState value for this ProfileResponse.
     * 
     * @return customerState
     */
    public java.lang.String getCustomerState() {
        return customerState;
    }


    /**
     * Sets the customerState value for this ProfileResponse.
     * 
     * @param customerState
     */
    public void setCustomerState(java.lang.String customerState) {
        this.customerState = customerState;
    }


    /**
     * Gets the customerZIP value for this ProfileResponse.
     * 
     * @return customerZIP
     */
    public java.lang.String getCustomerZIP() {
        return customerZIP;
    }


    /**
     * Sets the customerZIP value for this ProfileResponse.
     * 
     * @param customerZIP
     */
    public void setCustomerZIP(java.lang.String customerZIP) {
        this.customerZIP = customerZIP;
    }


    /**
     * Gets the debitBillerReferenceNumber value for this ProfileResponse.
     * 
     * @return debitBillerReferenceNumber
     */
    public java.lang.String getDebitBillerReferenceNumber() {
        return debitBillerReferenceNumber;
    }


    /**
     * Sets the debitBillerReferenceNumber value for this ProfileResponse.
     * 
     * @param debitBillerReferenceNumber
     */
    public void setDebitBillerReferenceNumber(java.lang.String debitBillerReferenceNumber) {
        this.debitBillerReferenceNumber = debitBillerReferenceNumber;
    }


    /**
     * Gets the ecpBankAcctType value for this ProfileResponse.
     * 
     * @return ecpBankAcctType
     */
    public java.lang.String getEcpBankAcctType() {
        return ecpBankAcctType;
    }


    /**
     * Sets the ecpBankAcctType value for this ProfileResponse.
     * 
     * @param ecpBankAcctType
     */
    public void setEcpBankAcctType(java.lang.String ecpBankAcctType) {
        this.ecpBankAcctType = ecpBankAcctType;
    }


    /**
     * Gets the ecpCheckDDA value for this ProfileResponse.
     * 
     * @return ecpCheckDDA
     */
    public java.lang.String getEcpCheckDDA() {
        return ecpCheckDDA;
    }


    /**
     * Sets the ecpCheckDDA value for this ProfileResponse.
     * 
     * @param ecpCheckDDA
     */
    public void setEcpCheckDDA(java.lang.String ecpCheckDDA) {
        this.ecpCheckDDA = ecpCheckDDA;
    }


    /**
     * Gets the ecpCheckRT value for this ProfileResponse.
     * 
     * @return ecpCheckRT
     */
    public java.lang.String getEcpCheckRT() {
        return ecpCheckRT;
    }


    /**
     * Sets the ecpCheckRT value for this ProfileResponse.
     * 
     * @param ecpCheckRT
     */
    public void setEcpCheckRT(java.lang.String ecpCheckRT) {
        this.ecpCheckRT = ecpCheckRT;
    }


    /**
     * Gets the ecpDelvMethod value for this ProfileResponse.
     * 
     * @return ecpDelvMethod
     */
    public java.lang.String getEcpDelvMethod() {
        return ecpDelvMethod;
    }


    /**
     * Sets the ecpDelvMethod value for this ProfileResponse.
     * 
     * @param ecpDelvMethod
     */
    public void setEcpDelvMethod(java.lang.String ecpDelvMethod) {
        this.ecpDelvMethod = ecpDelvMethod;
    }


    /**
     * Gets the euddBankSortCode value for this ProfileResponse.
     * 
     * @return euddBankSortCode
     */
    public java.lang.String getEuddBankSortCode() {
        return euddBankSortCode;
    }


    /**
     * Sets the euddBankSortCode value for this ProfileResponse.
     * 
     * @param euddBankSortCode
     */
    public void setEuddBankSortCode(java.lang.String euddBankSortCode) {
        this.euddBankSortCode = euddBankSortCode;
    }


    /**
     * Gets the euddCountryCode value for this ProfileResponse.
     * 
     * @return euddCountryCode
     */
    public java.lang.String getEuddCountryCode() {
        return euddCountryCode;
    }


    /**
     * Sets the euddCountryCode value for this ProfileResponse.
     * 
     * @param euddCountryCode
     */
    public void setEuddCountryCode(java.lang.String euddCountryCode) {
        this.euddCountryCode = euddCountryCode;
    }


    /**
     * Gets the euddRibCode value for this ProfileResponse.
     * 
     * @return euddRibCode
     */
    public java.lang.String getEuddRibCode() {
        return euddRibCode;
    }


    /**
     * Sets the euddRibCode value for this ProfileResponse.
     * 
     * @param euddRibCode
     */
    public void setEuddRibCode(java.lang.String euddRibCode) {
        this.euddRibCode = euddRibCode;
    }


    /**
     * Gets the mbDeferredBillDate value for this ProfileResponse.
     * 
     * @return mbDeferredBillDate
     */
    public java.lang.String getMbDeferredBillDate() {
        return mbDeferredBillDate;
    }


    /**
     * Sets the mbDeferredBillDate value for this ProfileResponse.
     * 
     * @param mbDeferredBillDate
     */
    public void setMbDeferredBillDate(java.lang.String mbDeferredBillDate) {
        this.mbDeferredBillDate = mbDeferredBillDate;
    }


    /**
     * Gets the mbMicroPaymentDaysLeft value for this ProfileResponse.
     * 
     * @return mbMicroPaymentDaysLeft
     */
    public java.lang.String getMbMicroPaymentDaysLeft() {
        return mbMicroPaymentDaysLeft;
    }


    /**
     * Sets the mbMicroPaymentDaysLeft value for this ProfileResponse.
     * 
     * @param mbMicroPaymentDaysLeft
     */
    public void setMbMicroPaymentDaysLeft(java.lang.String mbMicroPaymentDaysLeft) {
        this.mbMicroPaymentDaysLeft = mbMicroPaymentDaysLeft;
    }


    /**
     * Gets the mbMicroPaymentDollarsLeft value for this ProfileResponse.
     * 
     * @return mbMicroPaymentDollarsLeft
     */
    public java.lang.String getMbMicroPaymentDollarsLeft() {
        return mbMicroPaymentDollarsLeft;
    }


    /**
     * Sets the mbMicroPaymentDollarsLeft value for this ProfileResponse.
     * 
     * @param mbMicroPaymentDollarsLeft
     */
    public void setMbMicroPaymentDollarsLeft(java.lang.String mbMicroPaymentDollarsLeft) {
        this.mbMicroPaymentDollarsLeft = mbMicroPaymentDollarsLeft;
    }


    /**
     * Gets the mbMicroPaymentMaxBillingDays value for this ProfileResponse.
     * 
     * @return mbMicroPaymentMaxBillingDays
     */
    public java.lang.String getMbMicroPaymentMaxBillingDays() {
        return mbMicroPaymentMaxBillingDays;
    }


    /**
     * Sets the mbMicroPaymentMaxBillingDays value for this ProfileResponse.
     * 
     * @param mbMicroPaymentMaxBillingDays
     */
    public void setMbMicroPaymentMaxBillingDays(java.lang.String mbMicroPaymentMaxBillingDays) {
        this.mbMicroPaymentMaxBillingDays = mbMicroPaymentMaxBillingDays;
    }


    /**
     * Gets the mbMicroPaymentMaxDollarValue value for this ProfileResponse.
     * 
     * @return mbMicroPaymentMaxDollarValue
     */
    public java.lang.String getMbMicroPaymentMaxDollarValue() {
        return mbMicroPaymentMaxDollarValue;
    }


    /**
     * Sets the mbMicroPaymentMaxDollarValue value for this ProfileResponse.
     * 
     * @param mbMicroPaymentMaxDollarValue
     */
    public void setMbMicroPaymentMaxDollarValue(java.lang.String mbMicroPaymentMaxDollarValue) {
        this.mbMicroPaymentMaxDollarValue = mbMicroPaymentMaxDollarValue;
    }


    /**
     * Gets the mbMicroPaymentMaxTransactions value for this ProfileResponse.
     * 
     * @return mbMicroPaymentMaxTransactions
     */
    public java.lang.String getMbMicroPaymentMaxTransactions() {
        return mbMicroPaymentMaxTransactions;
    }


    /**
     * Sets the mbMicroPaymentMaxTransactions value for this ProfileResponse.
     * 
     * @param mbMicroPaymentMaxTransactions
     */
    public void setMbMicroPaymentMaxTransactions(java.lang.String mbMicroPaymentMaxTransactions) {
        this.mbMicroPaymentMaxTransactions = mbMicroPaymentMaxTransactions;
    }


    /**
     * Gets the mbOrderIdGenerationMethod value for this ProfileResponse.
     * 
     * @return mbOrderIdGenerationMethod
     */
    public java.lang.String getMbOrderIdGenerationMethod() {
        return mbOrderIdGenerationMethod;
    }


    /**
     * Sets the mbOrderIdGenerationMethod value for this ProfileResponse.
     * 
     * @param mbOrderIdGenerationMethod
     */
    public void setMbOrderIdGenerationMethod(java.lang.String mbOrderIdGenerationMethod) {
        this.mbOrderIdGenerationMethod = mbOrderIdGenerationMethod;
    }


    /**
     * Gets the mbRecurringEndDate value for this ProfileResponse.
     * 
     * @return mbRecurringEndDate
     */
    public java.lang.String getMbRecurringEndDate() {
        return mbRecurringEndDate;
    }


    /**
     * Sets the mbRecurringEndDate value for this ProfileResponse.
     * 
     * @param mbRecurringEndDate
     */
    public void setMbRecurringEndDate(java.lang.String mbRecurringEndDate) {
        this.mbRecurringEndDate = mbRecurringEndDate;
    }


    /**
     * Gets the mbRecurringFrequency value for this ProfileResponse.
     * 
     * @return mbRecurringFrequency
     */
    public java.lang.String getMbRecurringFrequency() {
        return mbRecurringFrequency;
    }


    /**
     * Sets the mbRecurringFrequency value for this ProfileResponse.
     * 
     * @param mbRecurringFrequency
     */
    public void setMbRecurringFrequency(java.lang.String mbRecurringFrequency) {
        this.mbRecurringFrequency = mbRecurringFrequency;
    }


    /**
     * Gets the mbRecurringMaxBillings value for this ProfileResponse.
     * 
     * @return mbRecurringMaxBillings
     */
    public java.lang.String getMbRecurringMaxBillings() {
        return mbRecurringMaxBillings;
    }


    /**
     * Sets the mbRecurringMaxBillings value for this ProfileResponse.
     * 
     * @param mbRecurringMaxBillings
     */
    public void setMbRecurringMaxBillings(java.lang.String mbRecurringMaxBillings) {
        this.mbRecurringMaxBillings = mbRecurringMaxBillings;
    }


    /**
     * Gets the mbRecurringNoEndDateFlag value for this ProfileResponse.
     * 
     * @return mbRecurringNoEndDateFlag
     */
    public java.lang.String getMbRecurringNoEndDateFlag() {
        return mbRecurringNoEndDateFlag;
    }


    /**
     * Sets the mbRecurringNoEndDateFlag value for this ProfileResponse.
     * 
     * @param mbRecurringNoEndDateFlag
     */
    public void setMbRecurringNoEndDateFlag(java.lang.String mbRecurringNoEndDateFlag) {
        this.mbRecurringNoEndDateFlag = mbRecurringNoEndDateFlag;
    }


    /**
     * Gets the mbRecurringStartDate value for this ProfileResponse.
     * 
     * @return mbRecurringStartDate
     */
    public java.lang.String getMbRecurringStartDate() {
        return mbRecurringStartDate;
    }


    /**
     * Sets the mbRecurringStartDate value for this ProfileResponse.
     * 
     * @param mbRecurringStartDate
     */
    public void setMbRecurringStartDate(java.lang.String mbRecurringStartDate) {
        this.mbRecurringStartDate = mbRecurringStartDate;
    }


    /**
     * Gets the mbStatus value for this ProfileResponse.
     * 
     * @return mbStatus
     */
    public java.lang.String getMbStatus() {
        return mbStatus;
    }


    /**
     * Sets the mbStatus value for this ProfileResponse.
     * 
     * @param mbStatus
     */
    public void setMbStatus(java.lang.String mbStatus) {
        this.mbStatus = mbStatus;
    }


    /**
     * Gets the mbType value for this ProfileResponse.
     * 
     * @return mbType
     */
    public java.lang.String getMbType() {
        return mbType;
    }


    /**
     * Sets the mbType value for this ProfileResponse.
     * 
     * @param mbType
     */
    public void setMbType(java.lang.String mbType) {
        this.mbType = mbType;
    }


    /**
     * Gets the mcSecureCodeAAV value for this ProfileResponse.
     * 
     * @return mcSecureCodeAAV
     */
    public java.lang.String getMcSecureCodeAAV() {
        return mcSecureCodeAAV;
    }


    /**
     * Sets the mcSecureCodeAAV value for this ProfileResponse.
     * 
     * @param mcSecureCodeAAV
     */
    public void setMcSecureCodeAAV(java.lang.String mcSecureCodeAAV) {
        this.mcSecureCodeAAV = mcSecureCodeAAV;
    }


    /**
     * Gets the merchantID value for this ProfileResponse.
     * 
     * @return merchantID
     */
    public java.lang.String getMerchantID() {
        return merchantID;
    }


    /**
     * Sets the merchantID value for this ProfileResponse.
     * 
     * @param merchantID
     */
    public void setMerchantID(java.lang.String merchantID) {
        this.merchantID = merchantID;
    }


    /**
     * Gets the orderDefaultAmount value for this ProfileResponse.
     * 
     * @return orderDefaultAmount
     */
    public java.lang.String getOrderDefaultAmount() {
        return orderDefaultAmount;
    }


    /**
     * Sets the orderDefaultAmount value for this ProfileResponse.
     * 
     * @param orderDefaultAmount
     */
    public void setOrderDefaultAmount(java.lang.String orderDefaultAmount) {
        this.orderDefaultAmount = orderDefaultAmount;
    }


    /**
     * Gets the orderDefaultDescription value for this ProfileResponse.
     * 
     * @return orderDefaultDescription
     */
    public java.lang.String getOrderDefaultDescription() {
        return orderDefaultDescription;
    }


    /**
     * Sets the orderDefaultDescription value for this ProfileResponse.
     * 
     * @param orderDefaultDescription
     */
    public void setOrderDefaultDescription(java.lang.String orderDefaultDescription) {
        this.orderDefaultDescription = orderDefaultDescription;
    }


    /**
     * Gets the procStatus value for this ProfileResponse.
     * 
     * @return procStatus
     */
    public java.lang.String getProcStatus() {
        return procStatus;
    }


    /**
     * Sets the procStatus value for this ProfileResponse.
     * 
     * @param procStatus
     */
    public void setProcStatus(java.lang.String procStatus) {
        this.procStatus = procStatus;
    }


    /**
     * Gets the procStatusMessage value for this ProfileResponse.
     * 
     * @return procStatusMessage
     */
    public java.lang.String getProcStatusMessage() {
        return procStatusMessage;
    }


    /**
     * Sets the procStatusMessage value for this ProfileResponse.
     * 
     * @param procStatusMessage
     */
    public void setProcStatusMessage(java.lang.String procStatusMessage) {
        this.procStatusMessage = procStatusMessage;
    }


    /**
     * Gets the profileAction value for this ProfileResponse.
     * 
     * @return profileAction
     */
    public java.lang.String getProfileAction() {
        return profileAction;
    }


    /**
     * Sets the profileAction value for this ProfileResponse.
     * 
     * @param profileAction
     */
    public void setProfileAction(java.lang.String profileAction) {
        this.profileAction = profileAction;
    }


    /**
     * Gets the profileOrderOverideInd value for this ProfileResponse.
     * 
     * @return profileOrderOverideInd
     */
    public java.lang.String getProfileOrderOverideInd() {
        return profileOrderOverideInd;
    }


    /**
     * Sets the profileOrderOverideInd value for this ProfileResponse.
     * 
     * @param profileOrderOverideInd
     */
    public void setProfileOrderOverideInd(java.lang.String profileOrderOverideInd) {
        this.profileOrderOverideInd = profileOrderOverideInd;
    }


    /**
     * Gets the softDescMercCity value for this ProfileResponse.
     * 
     * @return softDescMercCity
     */
    public java.lang.String getSoftDescMercCity() {
        return softDescMercCity;
    }


    /**
     * Sets the softDescMercCity value for this ProfileResponse.
     * 
     * @param softDescMercCity
     */
    public void setSoftDescMercCity(java.lang.String softDescMercCity) {
        this.softDescMercCity = softDescMercCity;
    }


    /**
     * Gets the softDescMercEmail value for this ProfileResponse.
     * 
     * @return softDescMercEmail
     */
    public java.lang.String getSoftDescMercEmail() {
        return softDescMercEmail;
    }


    /**
     * Sets the softDescMercEmail value for this ProfileResponse.
     * 
     * @param softDescMercEmail
     */
    public void setSoftDescMercEmail(java.lang.String softDescMercEmail) {
        this.softDescMercEmail = softDescMercEmail;
    }


    /**
     * Gets the softDescMercName value for this ProfileResponse.
     * 
     * @return softDescMercName
     */
    public java.lang.String getSoftDescMercName() {
        return softDescMercName;
    }


    /**
     * Sets the softDescMercName value for this ProfileResponse.
     * 
     * @param softDescMercName
     */
    public void setSoftDescMercName(java.lang.String softDescMercName) {
        this.softDescMercName = softDescMercName;
    }


    /**
     * Gets the softDescMercPhone value for this ProfileResponse.
     * 
     * @return softDescMercPhone
     */
    public java.lang.String getSoftDescMercPhone() {
        return softDescMercPhone;
    }


    /**
     * Sets the softDescMercPhone value for this ProfileResponse.
     * 
     * @param softDescMercPhone
     */
    public void setSoftDescMercPhone(java.lang.String softDescMercPhone) {
        this.softDescMercPhone = softDescMercPhone;
    }


    /**
     * Gets the softDescMercURL value for this ProfileResponse.
     * 
     * @return softDescMercURL
     */
    public java.lang.String getSoftDescMercURL() {
        return softDescMercURL;
    }


    /**
     * Sets the softDescMercURL value for this ProfileResponse.
     * 
     * @param softDescMercURL
     */
    public void setSoftDescMercURL(java.lang.String softDescMercURL) {
        this.softDescMercURL = softDescMercURL;
    }


    /**
     * Gets the softDescProdDesc value for this ProfileResponse.
     * 
     * @return softDescProdDesc
     */
    public java.lang.String getSoftDescProdDesc() {
        return softDescProdDesc;
    }


    /**
     * Sets the softDescProdDesc value for this ProfileResponse.
     * 
     * @param softDescProdDesc
     */
    public void setSoftDescProdDesc(java.lang.String softDescProdDesc) {
        this.softDescProdDesc = softDescProdDesc;
    }


    /**
     * Gets the status value for this ProfileResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProfileResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the switchSoloCardStartDate value for this ProfileResponse.
     * 
     * @return switchSoloCardStartDate
     */
    public java.lang.String getSwitchSoloCardStartDate() {
        return switchSoloCardStartDate;
    }


    /**
     * Sets the switchSoloCardStartDate value for this ProfileResponse.
     * 
     * @param switchSoloCardStartDate
     */
    public void setSwitchSoloCardStartDate(java.lang.String switchSoloCardStartDate) {
        this.switchSoloCardStartDate = switchSoloCardStartDate;
    }


    /**
     * Gets the switchSoloIssueNum value for this ProfileResponse.
     * 
     * @return switchSoloIssueNum
     */
    public java.lang.String getSwitchSoloIssueNum() {
        return switchSoloIssueNum;
    }


    /**
     * Sets the switchSoloIssueNum value for this ProfileResponse.
     * 
     * @param switchSoloIssueNum
     */
    public void setSwitchSoloIssueNum(java.lang.String switchSoloIssueNum) {
        this.switchSoloIssueNum = switchSoloIssueNum;
    }


    /**
     * Gets the version value for this ProfileResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ProfileResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileResponse)) return false;
        ProfileResponse other = (ProfileResponse) obj;
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
            ((this.accountUpdaterEligibility==null && other.getAccountUpdaterEligibility()==null) || 
             (this.accountUpdaterEligibility!=null &&
              this.accountUpdaterEligibility.equals(other.getAccountUpdaterEligibility()))) &&
            ((this.bin==null && other.getBin()==null) || 
             (this.bin!=null &&
              this.bin.equals(other.getBin()))) &&
            ((this.ccAccountNum==null && other.getCcAccountNum()==null) || 
             (this.ccAccountNum!=null &&
              this.ccAccountNum.equals(other.getCcAccountNum()))) &&
            ((this.ccExp==null && other.getCcExp()==null) || 
             (this.ccExp!=null &&
              this.ccExp.equals(other.getCcExp()))) &&
            ((this.customerAccountType==null && other.getCustomerAccountType()==null) || 
             (this.customerAccountType!=null &&
              this.customerAccountType.equals(other.getCustomerAccountType()))) &&
            ((this.customerAddress1==null && other.getCustomerAddress1()==null) || 
             (this.customerAddress1!=null &&
              this.customerAddress1.equals(other.getCustomerAddress1()))) &&
            ((this.customerAddress2==null && other.getCustomerAddress2()==null) || 
             (this.customerAddress2!=null &&
              this.customerAddress2.equals(other.getCustomerAddress2()))) &&
            ((this.customerCity==null && other.getCustomerCity()==null) || 
             (this.customerCity!=null &&
              this.customerCity.equals(other.getCustomerCity()))) &&
            ((this.customerCountryCode==null && other.getCustomerCountryCode()==null) || 
             (this.customerCountryCode!=null &&
              this.customerCountryCode.equals(other.getCustomerCountryCode()))) &&
            ((this.customerEmail==null && other.getCustomerEmail()==null) || 
             (this.customerEmail!=null &&
              this.customerEmail.equals(other.getCustomerEmail()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.customerPhone==null && other.getCustomerPhone()==null) || 
             (this.customerPhone!=null &&
              this.customerPhone.equals(other.getCustomerPhone()))) &&
            ((this.customerRefNum==null && other.getCustomerRefNum()==null) || 
             (this.customerRefNum!=null &&
              this.customerRefNum.equals(other.getCustomerRefNum()))) &&
            ((this.customerState==null && other.getCustomerState()==null) || 
             (this.customerState!=null &&
              this.customerState.equals(other.getCustomerState()))) &&
            ((this.customerZIP==null && other.getCustomerZIP()==null) || 
             (this.customerZIP!=null &&
              this.customerZIP.equals(other.getCustomerZIP()))) &&
            ((this.debitBillerReferenceNumber==null && other.getDebitBillerReferenceNumber()==null) || 
             (this.debitBillerReferenceNumber!=null &&
              this.debitBillerReferenceNumber.equals(other.getDebitBillerReferenceNumber()))) &&
            ((this.ecpBankAcctType==null && other.getEcpBankAcctType()==null) || 
             (this.ecpBankAcctType!=null &&
              this.ecpBankAcctType.equals(other.getEcpBankAcctType()))) &&
            ((this.ecpCheckDDA==null && other.getEcpCheckDDA()==null) || 
             (this.ecpCheckDDA!=null &&
              this.ecpCheckDDA.equals(other.getEcpCheckDDA()))) &&
            ((this.ecpCheckRT==null && other.getEcpCheckRT()==null) || 
             (this.ecpCheckRT!=null &&
              this.ecpCheckRT.equals(other.getEcpCheckRT()))) &&
            ((this.ecpDelvMethod==null && other.getEcpDelvMethod()==null) || 
             (this.ecpDelvMethod!=null &&
              this.ecpDelvMethod.equals(other.getEcpDelvMethod()))) &&
            ((this.euddBankSortCode==null && other.getEuddBankSortCode()==null) || 
             (this.euddBankSortCode!=null &&
              this.euddBankSortCode.equals(other.getEuddBankSortCode()))) &&
            ((this.euddCountryCode==null && other.getEuddCountryCode()==null) || 
             (this.euddCountryCode!=null &&
              this.euddCountryCode.equals(other.getEuddCountryCode()))) &&
            ((this.euddRibCode==null && other.getEuddRibCode()==null) || 
             (this.euddRibCode!=null &&
              this.euddRibCode.equals(other.getEuddRibCode()))) &&
            ((this.mbDeferredBillDate==null && other.getMbDeferredBillDate()==null) || 
             (this.mbDeferredBillDate!=null &&
              this.mbDeferredBillDate.equals(other.getMbDeferredBillDate()))) &&
            ((this.mbMicroPaymentDaysLeft==null && other.getMbMicroPaymentDaysLeft()==null) || 
             (this.mbMicroPaymentDaysLeft!=null &&
              this.mbMicroPaymentDaysLeft.equals(other.getMbMicroPaymentDaysLeft()))) &&
            ((this.mbMicroPaymentDollarsLeft==null && other.getMbMicroPaymentDollarsLeft()==null) || 
             (this.mbMicroPaymentDollarsLeft!=null &&
              this.mbMicroPaymentDollarsLeft.equals(other.getMbMicroPaymentDollarsLeft()))) &&
            ((this.mbMicroPaymentMaxBillingDays==null && other.getMbMicroPaymentMaxBillingDays()==null) || 
             (this.mbMicroPaymentMaxBillingDays!=null &&
              this.mbMicroPaymentMaxBillingDays.equals(other.getMbMicroPaymentMaxBillingDays()))) &&
            ((this.mbMicroPaymentMaxDollarValue==null && other.getMbMicroPaymentMaxDollarValue()==null) || 
             (this.mbMicroPaymentMaxDollarValue!=null &&
              this.mbMicroPaymentMaxDollarValue.equals(other.getMbMicroPaymentMaxDollarValue()))) &&
            ((this.mbMicroPaymentMaxTransactions==null && other.getMbMicroPaymentMaxTransactions()==null) || 
             (this.mbMicroPaymentMaxTransactions!=null &&
              this.mbMicroPaymentMaxTransactions.equals(other.getMbMicroPaymentMaxTransactions()))) &&
            ((this.mbOrderIdGenerationMethod==null && other.getMbOrderIdGenerationMethod()==null) || 
             (this.mbOrderIdGenerationMethod!=null &&
              this.mbOrderIdGenerationMethod.equals(other.getMbOrderIdGenerationMethod()))) &&
            ((this.mbRecurringEndDate==null && other.getMbRecurringEndDate()==null) || 
             (this.mbRecurringEndDate!=null &&
              this.mbRecurringEndDate.equals(other.getMbRecurringEndDate()))) &&
            ((this.mbRecurringFrequency==null && other.getMbRecurringFrequency()==null) || 
             (this.mbRecurringFrequency!=null &&
              this.mbRecurringFrequency.equals(other.getMbRecurringFrequency()))) &&
            ((this.mbRecurringMaxBillings==null && other.getMbRecurringMaxBillings()==null) || 
             (this.mbRecurringMaxBillings!=null &&
              this.mbRecurringMaxBillings.equals(other.getMbRecurringMaxBillings()))) &&
            ((this.mbRecurringNoEndDateFlag==null && other.getMbRecurringNoEndDateFlag()==null) || 
             (this.mbRecurringNoEndDateFlag!=null &&
              this.mbRecurringNoEndDateFlag.equals(other.getMbRecurringNoEndDateFlag()))) &&
            ((this.mbRecurringStartDate==null && other.getMbRecurringStartDate()==null) || 
             (this.mbRecurringStartDate!=null &&
              this.mbRecurringStartDate.equals(other.getMbRecurringStartDate()))) &&
            ((this.mbStatus==null && other.getMbStatus()==null) || 
             (this.mbStatus!=null &&
              this.mbStatus.equals(other.getMbStatus()))) &&
            ((this.mbType==null && other.getMbType()==null) || 
             (this.mbType!=null &&
              this.mbType.equals(other.getMbType()))) &&
            ((this.mcSecureCodeAAV==null && other.getMcSecureCodeAAV()==null) || 
             (this.mcSecureCodeAAV!=null &&
              this.mcSecureCodeAAV.equals(other.getMcSecureCodeAAV()))) &&
            ((this.merchantID==null && other.getMerchantID()==null) || 
             (this.merchantID!=null &&
              this.merchantID.equals(other.getMerchantID()))) &&
            ((this.orderDefaultAmount==null && other.getOrderDefaultAmount()==null) || 
             (this.orderDefaultAmount!=null &&
              this.orderDefaultAmount.equals(other.getOrderDefaultAmount()))) &&
            ((this.orderDefaultDescription==null && other.getOrderDefaultDescription()==null) || 
             (this.orderDefaultDescription!=null &&
              this.orderDefaultDescription.equals(other.getOrderDefaultDescription()))) &&
            ((this.procStatus==null && other.getProcStatus()==null) || 
             (this.procStatus!=null &&
              this.procStatus.equals(other.getProcStatus()))) &&
            ((this.procStatusMessage==null && other.getProcStatusMessage()==null) || 
             (this.procStatusMessage!=null &&
              this.procStatusMessage.equals(other.getProcStatusMessage()))) &&
            ((this.profileAction==null && other.getProfileAction()==null) || 
             (this.profileAction!=null &&
              this.profileAction.equals(other.getProfileAction()))) &&
            ((this.profileOrderOverideInd==null && other.getProfileOrderOverideInd()==null) || 
             (this.profileOrderOverideInd!=null &&
              this.profileOrderOverideInd.equals(other.getProfileOrderOverideInd()))) &&
            ((this.softDescMercCity==null && other.getSoftDescMercCity()==null) || 
             (this.softDescMercCity!=null &&
              this.softDescMercCity.equals(other.getSoftDescMercCity()))) &&
            ((this.softDescMercEmail==null && other.getSoftDescMercEmail()==null) || 
             (this.softDescMercEmail!=null &&
              this.softDescMercEmail.equals(other.getSoftDescMercEmail()))) &&
            ((this.softDescMercName==null && other.getSoftDescMercName()==null) || 
             (this.softDescMercName!=null &&
              this.softDescMercName.equals(other.getSoftDescMercName()))) &&
            ((this.softDescMercPhone==null && other.getSoftDescMercPhone()==null) || 
             (this.softDescMercPhone!=null &&
              this.softDescMercPhone.equals(other.getSoftDescMercPhone()))) &&
            ((this.softDescMercURL==null && other.getSoftDescMercURL()==null) || 
             (this.softDescMercURL!=null &&
              this.softDescMercURL.equals(other.getSoftDescMercURL()))) &&
            ((this.softDescProdDesc==null && other.getSoftDescProdDesc()==null) || 
             (this.softDescProdDesc!=null &&
              this.softDescProdDesc.equals(other.getSoftDescProdDesc()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.switchSoloCardStartDate==null && other.getSwitchSoloCardStartDate()==null) || 
             (this.switchSoloCardStartDate!=null &&
              this.switchSoloCardStartDate.equals(other.getSwitchSoloCardStartDate()))) &&
            ((this.switchSoloIssueNum==null && other.getSwitchSoloIssueNum()==null) || 
             (this.switchSoloIssueNum!=null &&
              this.switchSoloIssueNum.equals(other.getSwitchSoloIssueNum()))) &&
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
        if (getAccountUpdaterEligibility() != null) {
            _hashCode += getAccountUpdaterEligibility().hashCode();
        }
        if (getBin() != null) {
            _hashCode += getBin().hashCode();
        }
        if (getCcAccountNum() != null) {
            _hashCode += getCcAccountNum().hashCode();
        }
        if (getCcExp() != null) {
            _hashCode += getCcExp().hashCode();
        }
        if (getCustomerAccountType() != null) {
            _hashCode += getCustomerAccountType().hashCode();
        }
        if (getCustomerAddress1() != null) {
            _hashCode += getCustomerAddress1().hashCode();
        }
        if (getCustomerAddress2() != null) {
            _hashCode += getCustomerAddress2().hashCode();
        }
        if (getCustomerCity() != null) {
            _hashCode += getCustomerCity().hashCode();
        }
        if (getCustomerCountryCode() != null) {
            _hashCode += getCustomerCountryCode().hashCode();
        }
        if (getCustomerEmail() != null) {
            _hashCode += getCustomerEmail().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getCustomerPhone() != null) {
            _hashCode += getCustomerPhone().hashCode();
        }
        if (getCustomerRefNum() != null) {
            _hashCode += getCustomerRefNum().hashCode();
        }
        if (getCustomerState() != null) {
            _hashCode += getCustomerState().hashCode();
        }
        if (getCustomerZIP() != null) {
            _hashCode += getCustomerZIP().hashCode();
        }
        if (getDebitBillerReferenceNumber() != null) {
            _hashCode += getDebitBillerReferenceNumber().hashCode();
        }
        if (getEcpBankAcctType() != null) {
            _hashCode += getEcpBankAcctType().hashCode();
        }
        if (getEcpCheckDDA() != null) {
            _hashCode += getEcpCheckDDA().hashCode();
        }
        if (getEcpCheckRT() != null) {
            _hashCode += getEcpCheckRT().hashCode();
        }
        if (getEcpDelvMethod() != null) {
            _hashCode += getEcpDelvMethod().hashCode();
        }
        if (getEuddBankSortCode() != null) {
            _hashCode += getEuddBankSortCode().hashCode();
        }
        if (getEuddCountryCode() != null) {
            _hashCode += getEuddCountryCode().hashCode();
        }
        if (getEuddRibCode() != null) {
            _hashCode += getEuddRibCode().hashCode();
        }
        if (getMbDeferredBillDate() != null) {
            _hashCode += getMbDeferredBillDate().hashCode();
        }
        if (getMbMicroPaymentDaysLeft() != null) {
            _hashCode += getMbMicroPaymentDaysLeft().hashCode();
        }
        if (getMbMicroPaymentDollarsLeft() != null) {
            _hashCode += getMbMicroPaymentDollarsLeft().hashCode();
        }
        if (getMbMicroPaymentMaxBillingDays() != null) {
            _hashCode += getMbMicroPaymentMaxBillingDays().hashCode();
        }
        if (getMbMicroPaymentMaxDollarValue() != null) {
            _hashCode += getMbMicroPaymentMaxDollarValue().hashCode();
        }
        if (getMbMicroPaymentMaxTransactions() != null) {
            _hashCode += getMbMicroPaymentMaxTransactions().hashCode();
        }
        if (getMbOrderIdGenerationMethod() != null) {
            _hashCode += getMbOrderIdGenerationMethod().hashCode();
        }
        if (getMbRecurringEndDate() != null) {
            _hashCode += getMbRecurringEndDate().hashCode();
        }
        if (getMbRecurringFrequency() != null) {
            _hashCode += getMbRecurringFrequency().hashCode();
        }
        if (getMbRecurringMaxBillings() != null) {
            _hashCode += getMbRecurringMaxBillings().hashCode();
        }
        if (getMbRecurringNoEndDateFlag() != null) {
            _hashCode += getMbRecurringNoEndDateFlag().hashCode();
        }
        if (getMbRecurringStartDate() != null) {
            _hashCode += getMbRecurringStartDate().hashCode();
        }
        if (getMbStatus() != null) {
            _hashCode += getMbStatus().hashCode();
        }
        if (getMbType() != null) {
            _hashCode += getMbType().hashCode();
        }
        if (getMcSecureCodeAAV() != null) {
            _hashCode += getMcSecureCodeAAV().hashCode();
        }
        if (getMerchantID() != null) {
            _hashCode += getMerchantID().hashCode();
        }
        if (getOrderDefaultAmount() != null) {
            _hashCode += getOrderDefaultAmount().hashCode();
        }
        if (getOrderDefaultDescription() != null) {
            _hashCode += getOrderDefaultDescription().hashCode();
        }
        if (getProcStatus() != null) {
            _hashCode += getProcStatus().hashCode();
        }
        if (getProcStatusMessage() != null) {
            _hashCode += getProcStatusMessage().hashCode();
        }
        if (getProfileAction() != null) {
            _hashCode += getProfileAction().hashCode();
        }
        if (getProfileOrderOverideInd() != null) {
            _hashCode += getProfileOrderOverideInd().hashCode();
        }
        if (getSoftDescMercCity() != null) {
            _hashCode += getSoftDescMercCity().hashCode();
        }
        if (getSoftDescMercEmail() != null) {
            _hashCode += getSoftDescMercEmail().hashCode();
        }
        if (getSoftDescMercName() != null) {
            _hashCode += getSoftDescMercName().hashCode();
        }
        if (getSoftDescMercPhone() != null) {
            _hashCode += getSoftDescMercPhone().hashCode();
        }
        if (getSoftDescMercURL() != null) {
            _hashCode += getSoftDescMercURL().hashCode();
        }
        if (getSoftDescProdDesc() != null) {
            _hashCode += getSoftDescProdDesc().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSwitchSoloCardStartDate() != null) {
            _hashCode += getSwitchSoloCardStartDate().hashCode();
        }
        if (getSwitchSoloIssueNum() != null) {
            _hashCode += getSwitchSoloIssueNum().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "errorMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountUpdaterEligibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "accountUpdaterEligibility"));
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
        elemField.setFieldName("ccAccountNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ccAccountNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccExp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ccExp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerEmail"));
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
        elemField.setFieldName("customerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerPhone"));
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
        elemField.setFieldName("customerState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerZIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerZIP"));
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
        elemField.setFieldName("ecpBankAcctType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ecpBankAcctType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecpCheckDDA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ecpCheckDDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecpCheckRT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ecpCheckRT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecpDelvMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ecpDelvMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("euddBankSortCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "euddBankSortCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("euddCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "euddCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("euddRibCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "euddRibCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbDeferredBillDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbDeferredBillDate"));
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
        elemField.setFieldName("mbMicroPaymentMaxBillingDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbMicroPaymentMaxBillingDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbMicroPaymentMaxDollarValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbMicroPaymentMaxDollarValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbMicroPaymentMaxTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbMicroPaymentMaxTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbOrderIdGenerationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbOrderIdGenerationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbRecurringEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbRecurringEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbRecurringFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbRecurringFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbRecurringMaxBillings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbRecurringMaxBillings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbRecurringNoEndDateFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbRecurringNoEndDateFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbRecurringStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbRecurringStartDate"));
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
        elemField.setFieldName("mbType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mcSecureCodeAAV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mcSecureCodeAAV"));
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
        elemField.setFieldName("orderDefaultAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "orderDefaultAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDefaultDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "orderDefaultDescription"));
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
        elemField.setFieldName("profileAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "profileAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileOrderOverideInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "profileOrderOverideInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescMercCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "softDescMercCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescMercEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "softDescMercEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescMercName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "softDescMercName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescMercPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "softDescMercPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescMercURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "softDescMercURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescProdDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "softDescProdDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchSoloCardStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "switchSoloCardStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchSoloIssueNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "switchSoloIssueNum"));
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
