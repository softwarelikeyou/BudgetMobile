/**
 * ProfileUpdateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class ProfileUpdateRequest  implements java.io.Serializable {
    private java.lang.String endppoint;

    private java.lang.String bin;

    private java.lang.String merchantID;

    private java.lang.String orbitalConnectionPassword;

    private java.lang.String orbitalConnectionUsername;

    private java.lang.String customerRefNum;

    private java.lang.String accountUpdaterEligibility;

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

    private java.lang.String customerProfileOrderOverideInd;

    private java.lang.String customerState;

    private java.lang.String customerZIP;

    private java.lang.String debitBillerReferenceNumber;

    private java.lang.String ecpBankAcctType;

    private java.lang.String ecpCheckDDA;

    private java.lang.String ecpCheckRT;

    private java.lang.String ecpDelvMethod;

    private java.lang.String encryptedPan;

    private java.lang.String encryptedPanHash;

    private java.lang.String encryptedPanKey;

    private java.lang.String encryptedPanMethod;

    private java.lang.String encryptedPanPublicKeyFingerPrint;

    private java.lang.String euddBankSortCode;

    private java.lang.String euddCountryCode;

    private java.lang.String euddRibCode;

    private java.lang.String mbCancelDate;

    private java.lang.String mbDeferredBillDate;

    private java.lang.String mbMicroPaymentMaxBillingDays;

    private java.lang.String mbMicroPaymentMaxDollarValue;

    private java.lang.String mbMicroPaymentMaxTransactions;

    private java.lang.String mbOrderIdGenerationMethod;

    private java.lang.String mbRecurringEndDate;

    private java.lang.String mbRecurringFrequency;

    private java.lang.String mbRecurringMaxBillings;

    private java.lang.String mbRecurringNoEndDateFlag;

    private java.lang.String mbRecurringStartDate;

    private java.lang.String mbRemoveFlag;

    private java.lang.String mbRestoreDate;

    private java.lang.String mbType;

    private java.lang.String mcSecureCodeAAV;

    private java.lang.String orderDefaultAmount;

    private java.lang.String orderDefaultDescription;

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

    public ProfileUpdateRequest() {
    }

    public ProfileUpdateRequest(
           java.lang.String endppoint,
           java.lang.String bin,
           java.lang.String merchantID,
           java.lang.String orbitalConnectionPassword,
           java.lang.String orbitalConnectionUsername,
           java.lang.String customerRefNum,
           java.lang.String accountUpdaterEligibility,
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
           java.lang.String customerProfileOrderOverideInd,
           java.lang.String customerState,
           java.lang.String customerZIP,
           java.lang.String debitBillerReferenceNumber,
           java.lang.String ecpBankAcctType,
           java.lang.String ecpCheckDDA,
           java.lang.String ecpCheckRT,
           java.lang.String ecpDelvMethod,
           java.lang.String encryptedPan,
           java.lang.String encryptedPanHash,
           java.lang.String encryptedPanKey,
           java.lang.String encryptedPanMethod,
           java.lang.String encryptedPanPublicKeyFingerPrint,
           java.lang.String euddBankSortCode,
           java.lang.String euddCountryCode,
           java.lang.String euddRibCode,
           java.lang.String mbCancelDate,
           java.lang.String mbDeferredBillDate,
           java.lang.String mbMicroPaymentMaxBillingDays,
           java.lang.String mbMicroPaymentMaxDollarValue,
           java.lang.String mbMicroPaymentMaxTransactions,
           java.lang.String mbOrderIdGenerationMethod,
           java.lang.String mbRecurringEndDate,
           java.lang.String mbRecurringFrequency,
           java.lang.String mbRecurringMaxBillings,
           java.lang.String mbRecurringNoEndDateFlag,
           java.lang.String mbRecurringStartDate,
           java.lang.String mbRemoveFlag,
           java.lang.String mbRestoreDate,
           java.lang.String mbType,
           java.lang.String mcSecureCodeAAV,
           java.lang.String orderDefaultAmount,
           java.lang.String orderDefaultDescription,
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
           this.endppoint = endppoint;
           this.bin = bin;
           this.merchantID = merchantID;
           this.orbitalConnectionPassword = orbitalConnectionPassword;
           this.orbitalConnectionUsername = orbitalConnectionUsername;
           this.customerRefNum = customerRefNum;
           this.accountUpdaterEligibility = accountUpdaterEligibility;
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
           this.customerProfileOrderOverideInd = customerProfileOrderOverideInd;
           this.customerState = customerState;
           this.customerZIP = customerZIP;
           this.debitBillerReferenceNumber = debitBillerReferenceNumber;
           this.ecpBankAcctType = ecpBankAcctType;
           this.ecpCheckDDA = ecpCheckDDA;
           this.ecpCheckRT = ecpCheckRT;
           this.ecpDelvMethod = ecpDelvMethod;
           this.encryptedPan = encryptedPan;
           this.encryptedPanHash = encryptedPanHash;
           this.encryptedPanKey = encryptedPanKey;
           this.encryptedPanMethod = encryptedPanMethod;
           this.encryptedPanPublicKeyFingerPrint = encryptedPanPublicKeyFingerPrint;
           this.euddBankSortCode = euddBankSortCode;
           this.euddCountryCode = euddCountryCode;
           this.euddRibCode = euddRibCode;
           this.mbCancelDate = mbCancelDate;
           this.mbDeferredBillDate = mbDeferredBillDate;
           this.mbMicroPaymentMaxBillingDays = mbMicroPaymentMaxBillingDays;
           this.mbMicroPaymentMaxDollarValue = mbMicroPaymentMaxDollarValue;
           this.mbMicroPaymentMaxTransactions = mbMicroPaymentMaxTransactions;
           this.mbOrderIdGenerationMethod = mbOrderIdGenerationMethod;
           this.mbRecurringEndDate = mbRecurringEndDate;
           this.mbRecurringFrequency = mbRecurringFrequency;
           this.mbRecurringMaxBillings = mbRecurringMaxBillings;
           this.mbRecurringNoEndDateFlag = mbRecurringNoEndDateFlag;
           this.mbRecurringStartDate = mbRecurringStartDate;
           this.mbRemoveFlag = mbRemoveFlag;
           this.mbRestoreDate = mbRestoreDate;
           this.mbType = mbType;
           this.mcSecureCodeAAV = mcSecureCodeAAV;
           this.orderDefaultAmount = orderDefaultAmount;
           this.orderDefaultDescription = orderDefaultDescription;
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
     * Gets the endppoint value for this ProfileUpdateRequest.
     * 
     * @return endppoint
     */
    public java.lang.String getEndppoint() {
        return endppoint;
    }


    /**
     * Sets the endppoint value for this ProfileUpdateRequest.
     * 
     * @param endppoint
     */
    public void setEndppoint(java.lang.String endppoint) {
        this.endppoint = endppoint;
    }


    /**
     * Gets the bin value for this ProfileUpdateRequest.
     * 
     * @return bin
     */
    public java.lang.String getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this ProfileUpdateRequest.
     * 
     * @param bin
     */
    public void setBin(java.lang.String bin) {
        this.bin = bin;
    }


    /**
     * Gets the merchantID value for this ProfileUpdateRequest.
     * 
     * @return merchantID
     */
    public java.lang.String getMerchantID() {
        return merchantID;
    }


    /**
     * Sets the merchantID value for this ProfileUpdateRequest.
     * 
     * @param merchantID
     */
    public void setMerchantID(java.lang.String merchantID) {
        this.merchantID = merchantID;
    }


    /**
     * Gets the orbitalConnectionPassword value for this ProfileUpdateRequest.
     * 
     * @return orbitalConnectionPassword
     */
    public java.lang.String getOrbitalConnectionPassword() {
        return orbitalConnectionPassword;
    }


    /**
     * Sets the orbitalConnectionPassword value for this ProfileUpdateRequest.
     * 
     * @param orbitalConnectionPassword
     */
    public void setOrbitalConnectionPassword(java.lang.String orbitalConnectionPassword) {
        this.orbitalConnectionPassword = orbitalConnectionPassword;
    }


    /**
     * Gets the orbitalConnectionUsername value for this ProfileUpdateRequest.
     * 
     * @return orbitalConnectionUsername
     */
    public java.lang.String getOrbitalConnectionUsername() {
        return orbitalConnectionUsername;
    }


    /**
     * Sets the orbitalConnectionUsername value for this ProfileUpdateRequest.
     * 
     * @param orbitalConnectionUsername
     */
    public void setOrbitalConnectionUsername(java.lang.String orbitalConnectionUsername) {
        this.orbitalConnectionUsername = orbitalConnectionUsername;
    }


    /**
     * Gets the customerRefNum value for this ProfileUpdateRequest.
     * 
     * @return customerRefNum
     */
    public java.lang.String getCustomerRefNum() {
        return customerRefNum;
    }


    /**
     * Sets the customerRefNum value for this ProfileUpdateRequest.
     * 
     * @param customerRefNum
     */
    public void setCustomerRefNum(java.lang.String customerRefNum) {
        this.customerRefNum = customerRefNum;
    }


    /**
     * Gets the accountUpdaterEligibility value for this ProfileUpdateRequest.
     * 
     * @return accountUpdaterEligibility
     */
    public java.lang.String getAccountUpdaterEligibility() {
        return accountUpdaterEligibility;
    }


    /**
     * Sets the accountUpdaterEligibility value for this ProfileUpdateRequest.
     * 
     * @param accountUpdaterEligibility
     */
    public void setAccountUpdaterEligibility(java.lang.String accountUpdaterEligibility) {
        this.accountUpdaterEligibility = accountUpdaterEligibility;
    }


    /**
     * Gets the ccAccountNum value for this ProfileUpdateRequest.
     * 
     * @return ccAccountNum
     */
    public java.lang.String getCcAccountNum() {
        return ccAccountNum;
    }


    /**
     * Sets the ccAccountNum value for this ProfileUpdateRequest.
     * 
     * @param ccAccountNum
     */
    public void setCcAccountNum(java.lang.String ccAccountNum) {
        this.ccAccountNum = ccAccountNum;
    }


    /**
     * Gets the ccExp value for this ProfileUpdateRequest.
     * 
     * @return ccExp
     */
    public java.lang.String getCcExp() {
        return ccExp;
    }


    /**
     * Sets the ccExp value for this ProfileUpdateRequest.
     * 
     * @param ccExp
     */
    public void setCcExp(java.lang.String ccExp) {
        this.ccExp = ccExp;
    }


    /**
     * Gets the customerAccountType value for this ProfileUpdateRequest.
     * 
     * @return customerAccountType
     */
    public java.lang.String getCustomerAccountType() {
        return customerAccountType;
    }


    /**
     * Sets the customerAccountType value for this ProfileUpdateRequest.
     * 
     * @param customerAccountType
     */
    public void setCustomerAccountType(java.lang.String customerAccountType) {
        this.customerAccountType = customerAccountType;
    }


    /**
     * Gets the customerAddress1 value for this ProfileUpdateRequest.
     * 
     * @return customerAddress1
     */
    public java.lang.String getCustomerAddress1() {
        return customerAddress1;
    }


    /**
     * Sets the customerAddress1 value for this ProfileUpdateRequest.
     * 
     * @param customerAddress1
     */
    public void setCustomerAddress1(java.lang.String customerAddress1) {
        this.customerAddress1 = customerAddress1;
    }


    /**
     * Gets the customerAddress2 value for this ProfileUpdateRequest.
     * 
     * @return customerAddress2
     */
    public java.lang.String getCustomerAddress2() {
        return customerAddress2;
    }


    /**
     * Sets the customerAddress2 value for this ProfileUpdateRequest.
     * 
     * @param customerAddress2
     */
    public void setCustomerAddress2(java.lang.String customerAddress2) {
        this.customerAddress2 = customerAddress2;
    }


    /**
     * Gets the customerCity value for this ProfileUpdateRequest.
     * 
     * @return customerCity
     */
    public java.lang.String getCustomerCity() {
        return customerCity;
    }


    /**
     * Sets the customerCity value for this ProfileUpdateRequest.
     * 
     * @param customerCity
     */
    public void setCustomerCity(java.lang.String customerCity) {
        this.customerCity = customerCity;
    }


    /**
     * Gets the customerCountryCode value for this ProfileUpdateRequest.
     * 
     * @return customerCountryCode
     */
    public java.lang.String getCustomerCountryCode() {
        return customerCountryCode;
    }


    /**
     * Sets the customerCountryCode value for this ProfileUpdateRequest.
     * 
     * @param customerCountryCode
     */
    public void setCustomerCountryCode(java.lang.String customerCountryCode) {
        this.customerCountryCode = customerCountryCode;
    }


    /**
     * Gets the customerEmail value for this ProfileUpdateRequest.
     * 
     * @return customerEmail
     */
    public java.lang.String getCustomerEmail() {
        return customerEmail;
    }


    /**
     * Sets the customerEmail value for this ProfileUpdateRequest.
     * 
     * @param customerEmail
     */
    public void setCustomerEmail(java.lang.String customerEmail) {
        this.customerEmail = customerEmail;
    }


    /**
     * Gets the customerName value for this ProfileUpdateRequest.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this ProfileUpdateRequest.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the customerPhone value for this ProfileUpdateRequest.
     * 
     * @return customerPhone
     */
    public java.lang.String getCustomerPhone() {
        return customerPhone;
    }


    /**
     * Sets the customerPhone value for this ProfileUpdateRequest.
     * 
     * @param customerPhone
     */
    public void setCustomerPhone(java.lang.String customerPhone) {
        this.customerPhone = customerPhone;
    }


    /**
     * Gets the customerProfileOrderOverideInd value for this ProfileUpdateRequest.
     * 
     * @return customerProfileOrderOverideInd
     */
    public java.lang.String getCustomerProfileOrderOverideInd() {
        return customerProfileOrderOverideInd;
    }


    /**
     * Sets the customerProfileOrderOverideInd value for this ProfileUpdateRequest.
     * 
     * @param customerProfileOrderOverideInd
     */
    public void setCustomerProfileOrderOverideInd(java.lang.String customerProfileOrderOverideInd) {
        this.customerProfileOrderOverideInd = customerProfileOrderOverideInd;
    }


    /**
     * Gets the customerState value for this ProfileUpdateRequest.
     * 
     * @return customerState
     */
    public java.lang.String getCustomerState() {
        return customerState;
    }


    /**
     * Sets the customerState value for this ProfileUpdateRequest.
     * 
     * @param customerState
     */
    public void setCustomerState(java.lang.String customerState) {
        this.customerState = customerState;
    }


    /**
     * Gets the customerZIP value for this ProfileUpdateRequest.
     * 
     * @return customerZIP
     */
    public java.lang.String getCustomerZIP() {
        return customerZIP;
    }


    /**
     * Sets the customerZIP value for this ProfileUpdateRequest.
     * 
     * @param customerZIP
     */
    public void setCustomerZIP(java.lang.String customerZIP) {
        this.customerZIP = customerZIP;
    }


    /**
     * Gets the debitBillerReferenceNumber value for this ProfileUpdateRequest.
     * 
     * @return debitBillerReferenceNumber
     */
    public java.lang.String getDebitBillerReferenceNumber() {
        return debitBillerReferenceNumber;
    }


    /**
     * Sets the debitBillerReferenceNumber value for this ProfileUpdateRequest.
     * 
     * @param debitBillerReferenceNumber
     */
    public void setDebitBillerReferenceNumber(java.lang.String debitBillerReferenceNumber) {
        this.debitBillerReferenceNumber = debitBillerReferenceNumber;
    }


    /**
     * Gets the ecpBankAcctType value for this ProfileUpdateRequest.
     * 
     * @return ecpBankAcctType
     */
    public java.lang.String getEcpBankAcctType() {
        return ecpBankAcctType;
    }


    /**
     * Sets the ecpBankAcctType value for this ProfileUpdateRequest.
     * 
     * @param ecpBankAcctType
     */
    public void setEcpBankAcctType(java.lang.String ecpBankAcctType) {
        this.ecpBankAcctType = ecpBankAcctType;
    }


    /**
     * Gets the ecpCheckDDA value for this ProfileUpdateRequest.
     * 
     * @return ecpCheckDDA
     */
    public java.lang.String getEcpCheckDDA() {
        return ecpCheckDDA;
    }


    /**
     * Sets the ecpCheckDDA value for this ProfileUpdateRequest.
     * 
     * @param ecpCheckDDA
     */
    public void setEcpCheckDDA(java.lang.String ecpCheckDDA) {
        this.ecpCheckDDA = ecpCheckDDA;
    }


    /**
     * Gets the ecpCheckRT value for this ProfileUpdateRequest.
     * 
     * @return ecpCheckRT
     */
    public java.lang.String getEcpCheckRT() {
        return ecpCheckRT;
    }


    /**
     * Sets the ecpCheckRT value for this ProfileUpdateRequest.
     * 
     * @param ecpCheckRT
     */
    public void setEcpCheckRT(java.lang.String ecpCheckRT) {
        this.ecpCheckRT = ecpCheckRT;
    }


    /**
     * Gets the ecpDelvMethod value for this ProfileUpdateRequest.
     * 
     * @return ecpDelvMethod
     */
    public java.lang.String getEcpDelvMethod() {
        return ecpDelvMethod;
    }


    /**
     * Sets the ecpDelvMethod value for this ProfileUpdateRequest.
     * 
     * @param ecpDelvMethod
     */
    public void setEcpDelvMethod(java.lang.String ecpDelvMethod) {
        this.ecpDelvMethod = ecpDelvMethod;
    }


    /**
     * Gets the encryptedPan value for this ProfileUpdateRequest.
     * 
     * @return encryptedPan
     */
    public java.lang.String getEncryptedPan() {
        return encryptedPan;
    }


    /**
     * Sets the encryptedPan value for this ProfileUpdateRequest.
     * 
     * @param encryptedPan
     */
    public void setEncryptedPan(java.lang.String encryptedPan) {
        this.encryptedPan = encryptedPan;
    }


    /**
     * Gets the encryptedPanHash value for this ProfileUpdateRequest.
     * 
     * @return encryptedPanHash
     */
    public java.lang.String getEncryptedPanHash() {
        return encryptedPanHash;
    }


    /**
     * Sets the encryptedPanHash value for this ProfileUpdateRequest.
     * 
     * @param encryptedPanHash
     */
    public void setEncryptedPanHash(java.lang.String encryptedPanHash) {
        this.encryptedPanHash = encryptedPanHash;
    }


    /**
     * Gets the encryptedPanKey value for this ProfileUpdateRequest.
     * 
     * @return encryptedPanKey
     */
    public java.lang.String getEncryptedPanKey() {
        return encryptedPanKey;
    }


    /**
     * Sets the encryptedPanKey value for this ProfileUpdateRequest.
     * 
     * @param encryptedPanKey
     */
    public void setEncryptedPanKey(java.lang.String encryptedPanKey) {
        this.encryptedPanKey = encryptedPanKey;
    }


    /**
     * Gets the encryptedPanMethod value for this ProfileUpdateRequest.
     * 
     * @return encryptedPanMethod
     */
    public java.lang.String getEncryptedPanMethod() {
        return encryptedPanMethod;
    }


    /**
     * Sets the encryptedPanMethod value for this ProfileUpdateRequest.
     * 
     * @param encryptedPanMethod
     */
    public void setEncryptedPanMethod(java.lang.String encryptedPanMethod) {
        this.encryptedPanMethod = encryptedPanMethod;
    }


    /**
     * Gets the encryptedPanPublicKeyFingerPrint value for this ProfileUpdateRequest.
     * 
     * @return encryptedPanPublicKeyFingerPrint
     */
    public java.lang.String getEncryptedPanPublicKeyFingerPrint() {
        return encryptedPanPublicKeyFingerPrint;
    }


    /**
     * Sets the encryptedPanPublicKeyFingerPrint value for this ProfileUpdateRequest.
     * 
     * @param encryptedPanPublicKeyFingerPrint
     */
    public void setEncryptedPanPublicKeyFingerPrint(java.lang.String encryptedPanPublicKeyFingerPrint) {
        this.encryptedPanPublicKeyFingerPrint = encryptedPanPublicKeyFingerPrint;
    }


    /**
     * Gets the euddBankSortCode value for this ProfileUpdateRequest.
     * 
     * @return euddBankSortCode
     */
    public java.lang.String getEuddBankSortCode() {
        return euddBankSortCode;
    }


    /**
     * Sets the euddBankSortCode value for this ProfileUpdateRequest.
     * 
     * @param euddBankSortCode
     */
    public void setEuddBankSortCode(java.lang.String euddBankSortCode) {
        this.euddBankSortCode = euddBankSortCode;
    }


    /**
     * Gets the euddCountryCode value for this ProfileUpdateRequest.
     * 
     * @return euddCountryCode
     */
    public java.lang.String getEuddCountryCode() {
        return euddCountryCode;
    }


    /**
     * Sets the euddCountryCode value for this ProfileUpdateRequest.
     * 
     * @param euddCountryCode
     */
    public void setEuddCountryCode(java.lang.String euddCountryCode) {
        this.euddCountryCode = euddCountryCode;
    }


    /**
     * Gets the euddRibCode value for this ProfileUpdateRequest.
     * 
     * @return euddRibCode
     */
    public java.lang.String getEuddRibCode() {
        return euddRibCode;
    }


    /**
     * Sets the euddRibCode value for this ProfileUpdateRequest.
     * 
     * @param euddRibCode
     */
    public void setEuddRibCode(java.lang.String euddRibCode) {
        this.euddRibCode = euddRibCode;
    }


    /**
     * Gets the mbCancelDate value for this ProfileUpdateRequest.
     * 
     * @return mbCancelDate
     */
    public java.lang.String getMbCancelDate() {
        return mbCancelDate;
    }


    /**
     * Sets the mbCancelDate value for this ProfileUpdateRequest.
     * 
     * @param mbCancelDate
     */
    public void setMbCancelDate(java.lang.String mbCancelDate) {
        this.mbCancelDate = mbCancelDate;
    }


    /**
     * Gets the mbDeferredBillDate value for this ProfileUpdateRequest.
     * 
     * @return mbDeferredBillDate
     */
    public java.lang.String getMbDeferredBillDate() {
        return mbDeferredBillDate;
    }


    /**
     * Sets the mbDeferredBillDate value for this ProfileUpdateRequest.
     * 
     * @param mbDeferredBillDate
     */
    public void setMbDeferredBillDate(java.lang.String mbDeferredBillDate) {
        this.mbDeferredBillDate = mbDeferredBillDate;
    }


    /**
     * Gets the mbMicroPaymentMaxBillingDays value for this ProfileUpdateRequest.
     * 
     * @return mbMicroPaymentMaxBillingDays
     */
    public java.lang.String getMbMicroPaymentMaxBillingDays() {
        return mbMicroPaymentMaxBillingDays;
    }


    /**
     * Sets the mbMicroPaymentMaxBillingDays value for this ProfileUpdateRequest.
     * 
     * @param mbMicroPaymentMaxBillingDays
     */
    public void setMbMicroPaymentMaxBillingDays(java.lang.String mbMicroPaymentMaxBillingDays) {
        this.mbMicroPaymentMaxBillingDays = mbMicroPaymentMaxBillingDays;
    }


    /**
     * Gets the mbMicroPaymentMaxDollarValue value for this ProfileUpdateRequest.
     * 
     * @return mbMicroPaymentMaxDollarValue
     */
    public java.lang.String getMbMicroPaymentMaxDollarValue() {
        return mbMicroPaymentMaxDollarValue;
    }


    /**
     * Sets the mbMicroPaymentMaxDollarValue value for this ProfileUpdateRequest.
     * 
     * @param mbMicroPaymentMaxDollarValue
     */
    public void setMbMicroPaymentMaxDollarValue(java.lang.String mbMicroPaymentMaxDollarValue) {
        this.mbMicroPaymentMaxDollarValue = mbMicroPaymentMaxDollarValue;
    }


    /**
     * Gets the mbMicroPaymentMaxTransactions value for this ProfileUpdateRequest.
     * 
     * @return mbMicroPaymentMaxTransactions
     */
    public java.lang.String getMbMicroPaymentMaxTransactions() {
        return mbMicroPaymentMaxTransactions;
    }


    /**
     * Sets the mbMicroPaymentMaxTransactions value for this ProfileUpdateRequest.
     * 
     * @param mbMicroPaymentMaxTransactions
     */
    public void setMbMicroPaymentMaxTransactions(java.lang.String mbMicroPaymentMaxTransactions) {
        this.mbMicroPaymentMaxTransactions = mbMicroPaymentMaxTransactions;
    }


    /**
     * Gets the mbOrderIdGenerationMethod value for this ProfileUpdateRequest.
     * 
     * @return mbOrderIdGenerationMethod
     */
    public java.lang.String getMbOrderIdGenerationMethod() {
        return mbOrderIdGenerationMethod;
    }


    /**
     * Sets the mbOrderIdGenerationMethod value for this ProfileUpdateRequest.
     * 
     * @param mbOrderIdGenerationMethod
     */
    public void setMbOrderIdGenerationMethod(java.lang.String mbOrderIdGenerationMethod) {
        this.mbOrderIdGenerationMethod = mbOrderIdGenerationMethod;
    }


    /**
     * Gets the mbRecurringEndDate value for this ProfileUpdateRequest.
     * 
     * @return mbRecurringEndDate
     */
    public java.lang.String getMbRecurringEndDate() {
        return mbRecurringEndDate;
    }


    /**
     * Sets the mbRecurringEndDate value for this ProfileUpdateRequest.
     * 
     * @param mbRecurringEndDate
     */
    public void setMbRecurringEndDate(java.lang.String mbRecurringEndDate) {
        this.mbRecurringEndDate = mbRecurringEndDate;
    }


    /**
     * Gets the mbRecurringFrequency value for this ProfileUpdateRequest.
     * 
     * @return mbRecurringFrequency
     */
    public java.lang.String getMbRecurringFrequency() {
        return mbRecurringFrequency;
    }


    /**
     * Sets the mbRecurringFrequency value for this ProfileUpdateRequest.
     * 
     * @param mbRecurringFrequency
     */
    public void setMbRecurringFrequency(java.lang.String mbRecurringFrequency) {
        this.mbRecurringFrequency = mbRecurringFrequency;
    }


    /**
     * Gets the mbRecurringMaxBillings value for this ProfileUpdateRequest.
     * 
     * @return mbRecurringMaxBillings
     */
    public java.lang.String getMbRecurringMaxBillings() {
        return mbRecurringMaxBillings;
    }


    /**
     * Sets the mbRecurringMaxBillings value for this ProfileUpdateRequest.
     * 
     * @param mbRecurringMaxBillings
     */
    public void setMbRecurringMaxBillings(java.lang.String mbRecurringMaxBillings) {
        this.mbRecurringMaxBillings = mbRecurringMaxBillings;
    }


    /**
     * Gets the mbRecurringNoEndDateFlag value for this ProfileUpdateRequest.
     * 
     * @return mbRecurringNoEndDateFlag
     */
    public java.lang.String getMbRecurringNoEndDateFlag() {
        return mbRecurringNoEndDateFlag;
    }


    /**
     * Sets the mbRecurringNoEndDateFlag value for this ProfileUpdateRequest.
     * 
     * @param mbRecurringNoEndDateFlag
     */
    public void setMbRecurringNoEndDateFlag(java.lang.String mbRecurringNoEndDateFlag) {
        this.mbRecurringNoEndDateFlag = mbRecurringNoEndDateFlag;
    }


    /**
     * Gets the mbRecurringStartDate value for this ProfileUpdateRequest.
     * 
     * @return mbRecurringStartDate
     */
    public java.lang.String getMbRecurringStartDate() {
        return mbRecurringStartDate;
    }


    /**
     * Sets the mbRecurringStartDate value for this ProfileUpdateRequest.
     * 
     * @param mbRecurringStartDate
     */
    public void setMbRecurringStartDate(java.lang.String mbRecurringStartDate) {
        this.mbRecurringStartDate = mbRecurringStartDate;
    }


    /**
     * Gets the mbRemoveFlag value for this ProfileUpdateRequest.
     * 
     * @return mbRemoveFlag
     */
    public java.lang.String getMbRemoveFlag() {
        return mbRemoveFlag;
    }


    /**
     * Sets the mbRemoveFlag value for this ProfileUpdateRequest.
     * 
     * @param mbRemoveFlag
     */
    public void setMbRemoveFlag(java.lang.String mbRemoveFlag) {
        this.mbRemoveFlag = mbRemoveFlag;
    }


    /**
     * Gets the mbRestoreDate value for this ProfileUpdateRequest.
     * 
     * @return mbRestoreDate
     */
    public java.lang.String getMbRestoreDate() {
        return mbRestoreDate;
    }


    /**
     * Sets the mbRestoreDate value for this ProfileUpdateRequest.
     * 
     * @param mbRestoreDate
     */
    public void setMbRestoreDate(java.lang.String mbRestoreDate) {
        this.mbRestoreDate = mbRestoreDate;
    }


    /**
     * Gets the mbType value for this ProfileUpdateRequest.
     * 
     * @return mbType
     */
    public java.lang.String getMbType() {
        return mbType;
    }


    /**
     * Sets the mbType value for this ProfileUpdateRequest.
     * 
     * @param mbType
     */
    public void setMbType(java.lang.String mbType) {
        this.mbType = mbType;
    }


    /**
     * Gets the mcSecureCodeAAV value for this ProfileUpdateRequest.
     * 
     * @return mcSecureCodeAAV
     */
    public java.lang.String getMcSecureCodeAAV() {
        return mcSecureCodeAAV;
    }


    /**
     * Sets the mcSecureCodeAAV value for this ProfileUpdateRequest.
     * 
     * @param mcSecureCodeAAV
     */
    public void setMcSecureCodeAAV(java.lang.String mcSecureCodeAAV) {
        this.mcSecureCodeAAV = mcSecureCodeAAV;
    }


    /**
     * Gets the orderDefaultAmount value for this ProfileUpdateRequest.
     * 
     * @return orderDefaultAmount
     */
    public java.lang.String getOrderDefaultAmount() {
        return orderDefaultAmount;
    }


    /**
     * Sets the orderDefaultAmount value for this ProfileUpdateRequest.
     * 
     * @param orderDefaultAmount
     */
    public void setOrderDefaultAmount(java.lang.String orderDefaultAmount) {
        this.orderDefaultAmount = orderDefaultAmount;
    }


    /**
     * Gets the orderDefaultDescription value for this ProfileUpdateRequest.
     * 
     * @return orderDefaultDescription
     */
    public java.lang.String getOrderDefaultDescription() {
        return orderDefaultDescription;
    }


    /**
     * Sets the orderDefaultDescription value for this ProfileUpdateRequest.
     * 
     * @param orderDefaultDescription
     */
    public void setOrderDefaultDescription(java.lang.String orderDefaultDescription) {
        this.orderDefaultDescription = orderDefaultDescription;
    }


    /**
     * Gets the softDescMercCity value for this ProfileUpdateRequest.
     * 
     * @return softDescMercCity
     */
    public java.lang.String getSoftDescMercCity() {
        return softDescMercCity;
    }


    /**
     * Sets the softDescMercCity value for this ProfileUpdateRequest.
     * 
     * @param softDescMercCity
     */
    public void setSoftDescMercCity(java.lang.String softDescMercCity) {
        this.softDescMercCity = softDescMercCity;
    }


    /**
     * Gets the softDescMercEmail value for this ProfileUpdateRequest.
     * 
     * @return softDescMercEmail
     */
    public java.lang.String getSoftDescMercEmail() {
        return softDescMercEmail;
    }


    /**
     * Sets the softDescMercEmail value for this ProfileUpdateRequest.
     * 
     * @param softDescMercEmail
     */
    public void setSoftDescMercEmail(java.lang.String softDescMercEmail) {
        this.softDescMercEmail = softDescMercEmail;
    }


    /**
     * Gets the softDescMercName value for this ProfileUpdateRequest.
     * 
     * @return softDescMercName
     */
    public java.lang.String getSoftDescMercName() {
        return softDescMercName;
    }


    /**
     * Sets the softDescMercName value for this ProfileUpdateRequest.
     * 
     * @param softDescMercName
     */
    public void setSoftDescMercName(java.lang.String softDescMercName) {
        this.softDescMercName = softDescMercName;
    }


    /**
     * Gets the softDescMercPhone value for this ProfileUpdateRequest.
     * 
     * @return softDescMercPhone
     */
    public java.lang.String getSoftDescMercPhone() {
        return softDescMercPhone;
    }


    /**
     * Sets the softDescMercPhone value for this ProfileUpdateRequest.
     * 
     * @param softDescMercPhone
     */
    public void setSoftDescMercPhone(java.lang.String softDescMercPhone) {
        this.softDescMercPhone = softDescMercPhone;
    }


    /**
     * Gets the softDescMercURL value for this ProfileUpdateRequest.
     * 
     * @return softDescMercURL
     */
    public java.lang.String getSoftDescMercURL() {
        return softDescMercURL;
    }


    /**
     * Sets the softDescMercURL value for this ProfileUpdateRequest.
     * 
     * @param softDescMercURL
     */
    public void setSoftDescMercURL(java.lang.String softDescMercURL) {
        this.softDescMercURL = softDescMercURL;
    }


    /**
     * Gets the softDescProdDesc value for this ProfileUpdateRequest.
     * 
     * @return softDescProdDesc
     */
    public java.lang.String getSoftDescProdDesc() {
        return softDescProdDesc;
    }


    /**
     * Sets the softDescProdDesc value for this ProfileUpdateRequest.
     * 
     * @param softDescProdDesc
     */
    public void setSoftDescProdDesc(java.lang.String softDescProdDesc) {
        this.softDescProdDesc = softDescProdDesc;
    }


    /**
     * Gets the status value for this ProfileUpdateRequest.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProfileUpdateRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the switchSoloCardStartDate value for this ProfileUpdateRequest.
     * 
     * @return switchSoloCardStartDate
     */
    public java.lang.String getSwitchSoloCardStartDate() {
        return switchSoloCardStartDate;
    }


    /**
     * Sets the switchSoloCardStartDate value for this ProfileUpdateRequest.
     * 
     * @param switchSoloCardStartDate
     */
    public void setSwitchSoloCardStartDate(java.lang.String switchSoloCardStartDate) {
        this.switchSoloCardStartDate = switchSoloCardStartDate;
    }


    /**
     * Gets the switchSoloIssueNum value for this ProfileUpdateRequest.
     * 
     * @return switchSoloIssueNum
     */
    public java.lang.String getSwitchSoloIssueNum() {
        return switchSoloIssueNum;
    }


    /**
     * Sets the switchSoloIssueNum value for this ProfileUpdateRequest.
     * 
     * @param switchSoloIssueNum
     */
    public void setSwitchSoloIssueNum(java.lang.String switchSoloIssueNum) {
        this.switchSoloIssueNum = switchSoloIssueNum;
    }


    /**
     * Gets the version value for this ProfileUpdateRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ProfileUpdateRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileUpdateRequest)) return false;
        ProfileUpdateRequest other = (ProfileUpdateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endppoint==null && other.getEndppoint()==null) || 
             (this.endppoint!=null &&
              this.endppoint.equals(other.getEndppoint()))) &&
            ((this.bin==null && other.getBin()==null) || 
             (this.bin!=null &&
              this.bin.equals(other.getBin()))) &&
            ((this.merchantID==null && other.getMerchantID()==null) || 
             (this.merchantID!=null &&
              this.merchantID.equals(other.getMerchantID()))) &&
            ((this.orbitalConnectionPassword==null && other.getOrbitalConnectionPassword()==null) || 
             (this.orbitalConnectionPassword!=null &&
              this.orbitalConnectionPassword.equals(other.getOrbitalConnectionPassword()))) &&
            ((this.orbitalConnectionUsername==null && other.getOrbitalConnectionUsername()==null) || 
             (this.orbitalConnectionUsername!=null &&
              this.orbitalConnectionUsername.equals(other.getOrbitalConnectionUsername()))) &&
            ((this.customerRefNum==null && other.getCustomerRefNum()==null) || 
             (this.customerRefNum!=null &&
              this.customerRefNum.equals(other.getCustomerRefNum()))) &&
            ((this.accountUpdaterEligibility==null && other.getAccountUpdaterEligibility()==null) || 
             (this.accountUpdaterEligibility!=null &&
              this.accountUpdaterEligibility.equals(other.getAccountUpdaterEligibility()))) &&
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
            ((this.customerProfileOrderOverideInd==null && other.getCustomerProfileOrderOverideInd()==null) || 
             (this.customerProfileOrderOverideInd!=null &&
              this.customerProfileOrderOverideInd.equals(other.getCustomerProfileOrderOverideInd()))) &&
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
            ((this.encryptedPan==null && other.getEncryptedPan()==null) || 
             (this.encryptedPan!=null &&
              this.encryptedPan.equals(other.getEncryptedPan()))) &&
            ((this.encryptedPanHash==null && other.getEncryptedPanHash()==null) || 
             (this.encryptedPanHash!=null &&
              this.encryptedPanHash.equals(other.getEncryptedPanHash()))) &&
            ((this.encryptedPanKey==null && other.getEncryptedPanKey()==null) || 
             (this.encryptedPanKey!=null &&
              this.encryptedPanKey.equals(other.getEncryptedPanKey()))) &&
            ((this.encryptedPanMethod==null && other.getEncryptedPanMethod()==null) || 
             (this.encryptedPanMethod!=null &&
              this.encryptedPanMethod.equals(other.getEncryptedPanMethod()))) &&
            ((this.encryptedPanPublicKeyFingerPrint==null && other.getEncryptedPanPublicKeyFingerPrint()==null) || 
             (this.encryptedPanPublicKeyFingerPrint!=null &&
              this.encryptedPanPublicKeyFingerPrint.equals(other.getEncryptedPanPublicKeyFingerPrint()))) &&
            ((this.euddBankSortCode==null && other.getEuddBankSortCode()==null) || 
             (this.euddBankSortCode!=null &&
              this.euddBankSortCode.equals(other.getEuddBankSortCode()))) &&
            ((this.euddCountryCode==null && other.getEuddCountryCode()==null) || 
             (this.euddCountryCode!=null &&
              this.euddCountryCode.equals(other.getEuddCountryCode()))) &&
            ((this.euddRibCode==null && other.getEuddRibCode()==null) || 
             (this.euddRibCode!=null &&
              this.euddRibCode.equals(other.getEuddRibCode()))) &&
            ((this.mbCancelDate==null && other.getMbCancelDate()==null) || 
             (this.mbCancelDate!=null &&
              this.mbCancelDate.equals(other.getMbCancelDate()))) &&
            ((this.mbDeferredBillDate==null && other.getMbDeferredBillDate()==null) || 
             (this.mbDeferredBillDate!=null &&
              this.mbDeferredBillDate.equals(other.getMbDeferredBillDate()))) &&
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
            ((this.mbRemoveFlag==null && other.getMbRemoveFlag()==null) || 
             (this.mbRemoveFlag!=null &&
              this.mbRemoveFlag.equals(other.getMbRemoveFlag()))) &&
            ((this.mbRestoreDate==null && other.getMbRestoreDate()==null) || 
             (this.mbRestoreDate!=null &&
              this.mbRestoreDate.equals(other.getMbRestoreDate()))) &&
            ((this.mbType==null && other.getMbType()==null) || 
             (this.mbType!=null &&
              this.mbType.equals(other.getMbType()))) &&
            ((this.mcSecureCodeAAV==null && other.getMcSecureCodeAAV()==null) || 
             (this.mcSecureCodeAAV!=null &&
              this.mcSecureCodeAAV.equals(other.getMcSecureCodeAAV()))) &&
            ((this.orderDefaultAmount==null && other.getOrderDefaultAmount()==null) || 
             (this.orderDefaultAmount!=null &&
              this.orderDefaultAmount.equals(other.getOrderDefaultAmount()))) &&
            ((this.orderDefaultDescription==null && other.getOrderDefaultDescription()==null) || 
             (this.orderDefaultDescription!=null &&
              this.orderDefaultDescription.equals(other.getOrderDefaultDescription()))) &&
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
        if (getEndppoint() != null) {
            _hashCode += getEndppoint().hashCode();
        }
        if (getBin() != null) {
            _hashCode += getBin().hashCode();
        }
        if (getMerchantID() != null) {
            _hashCode += getMerchantID().hashCode();
        }
        if (getOrbitalConnectionPassword() != null) {
            _hashCode += getOrbitalConnectionPassword().hashCode();
        }
        if (getOrbitalConnectionUsername() != null) {
            _hashCode += getOrbitalConnectionUsername().hashCode();
        }
        if (getCustomerRefNum() != null) {
            _hashCode += getCustomerRefNum().hashCode();
        }
        if (getAccountUpdaterEligibility() != null) {
            _hashCode += getAccountUpdaterEligibility().hashCode();
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
        if (getCustomerProfileOrderOverideInd() != null) {
            _hashCode += getCustomerProfileOrderOverideInd().hashCode();
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
        if (getEncryptedPan() != null) {
            _hashCode += getEncryptedPan().hashCode();
        }
        if (getEncryptedPanHash() != null) {
            _hashCode += getEncryptedPanHash().hashCode();
        }
        if (getEncryptedPanKey() != null) {
            _hashCode += getEncryptedPanKey().hashCode();
        }
        if (getEncryptedPanMethod() != null) {
            _hashCode += getEncryptedPanMethod().hashCode();
        }
        if (getEncryptedPanPublicKeyFingerPrint() != null) {
            _hashCode += getEncryptedPanPublicKeyFingerPrint().hashCode();
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
        if (getMbCancelDate() != null) {
            _hashCode += getMbCancelDate().hashCode();
        }
        if (getMbDeferredBillDate() != null) {
            _hashCode += getMbDeferredBillDate().hashCode();
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
        if (getMbRemoveFlag() != null) {
            _hashCode += getMbRemoveFlag().hashCode();
        }
        if (getMbRestoreDate() != null) {
            _hashCode += getMbRestoreDate().hashCode();
        }
        if (getMbType() != null) {
            _hashCode += getMbType().hashCode();
        }
        if (getMcSecureCodeAAV() != null) {
            _hashCode += getMcSecureCodeAAV().hashCode();
        }
        if (getOrderDefaultAmount() != null) {
            _hashCode += getOrderDefaultAmount().hashCode();
        }
        if (getOrderDefaultDescription() != null) {
            _hashCode += getOrderDefaultDescription().hashCode();
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
        new org.apache.axis.description.TypeDesc(ProfileUpdateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileUpdateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endppoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "endppoint"));
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
        elemField.setFieldName("merchantID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "merchantID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orbitalConnectionPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "orbitalConnectionPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orbitalConnectionUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "orbitalConnectionUsername"));
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
        elemField.setFieldName("accountUpdaterEligibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "accountUpdaterEligibility"));
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
        elemField.setFieldName("customerProfileOrderOverideInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerProfileOrderOverideInd"));
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
        elemField.setFieldName("encryptedPan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "encryptedPan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedPanHash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "encryptedPanHash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedPanKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "encryptedPanKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedPanMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "encryptedPanMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedPanPublicKeyFingerPrint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "encryptedPanPublicKeyFingerPrint"));
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
        elemField.setFieldName("mbCancelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbCancelDate"));
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
        elemField.setFieldName("mbRemoveFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbRemoveFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mbRestoreDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mbRestoreDate"));
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
