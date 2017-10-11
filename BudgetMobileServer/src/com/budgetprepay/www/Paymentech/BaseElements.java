/**
 * BaseElements.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class BaseElements  implements java.io.Serializable {
    private java.lang.String amount;

    private java.lang.String authenticationECIInd;

    private java.lang.String avsAddress1;

    private java.lang.String avsAddress2;

    private java.lang.String avsCity;

    private java.lang.String avsCountryCode;

    private java.lang.String avsDestAddress1;

    private java.lang.String avsDestAddress2;

    private java.lang.String avsDestCity;

    private java.lang.String avsDestCountryCode;

    private java.lang.String avsDestName;

    private java.lang.String avsDestPhoneNum;

    private java.lang.String avsDestPhoneType;

    private java.lang.String avsDestState;

    private java.lang.String avsDestZip;

    private java.lang.String avsName;

    private java.lang.String avsPhone;

    private java.lang.String avsPhoneType;

    private java.lang.String avsState;

    private java.lang.String avsZip;

    private java.lang.String bmlCustomerAnnualIncome;

    private java.lang.String bmlCustomerBirthDate;

    private java.lang.String bmlCustomerCheckingAccount;

    private java.lang.String bmlCustomerEmail;

    private java.lang.String bmlCustomerIP;

    private java.lang.String bmlCustomerRegistrationDate;

    private java.lang.String bmlCustomerResidenceStatus;

    private java.lang.String bmlCustomerSSN;

    private java.lang.String bmlCustomerSavingsAccount;

    private java.lang.String bmlCustomerTypeFlag;

    private java.lang.String bmlItemCategory;

    private java.lang.String bmlMerchantPromotionalCode;

    private java.lang.String bmlPreapprovalInvitationNum;

    private java.lang.String bmlProductDeliveryType;

    private java.lang.String bmlShippingCost;

    private java.lang.String bmlTNCVersion;

    private java.lang.String cardBrand;

    private java.lang.String ccAccountNum;

    private java.lang.String ccCardVerifyNum;

    private java.lang.String ccCardVerifyPresenceInd;

    private java.lang.String ccExp;

    private java.lang.String comments;

    private java.lang.String customerAni;

    private java.lang.String customerBrowserName;

    private java.lang.String customerEmail;

    private java.lang.String customerIpAddress;

    private java.lang.String debitBillerReferenceNumber;

    private java.lang.String ecpAuthMethod;

    private java.lang.String ecpBankAcctType;

    private java.lang.String ecpCheckDDA;

    private java.lang.String ecpCheckRT;

    private java.lang.String ecpCheckSerialNumber;

    private java.lang.String ecpDelvMethod;

    private java.lang.String ecpImageReferenceNumber;

    private java.lang.String ecpTerminalCity;

    private java.lang.String ecpTerminalState;

    private java.lang.String emailAddressSubtype;

    private java.lang.String encryptedPan;

    private java.lang.String encryptedPanHash;

    private java.lang.String encryptedPanKey;

    private java.lang.String encryptedPanMethod;

    private java.lang.String encryptedPanPublicKeyFingerPrint;

    private java.lang.String euddBankSortCode;

    private java.lang.String euddCountryCode;

    private java.lang.String euddRibCode;

    private java.lang.String industryType;

    private java.lang.String mcSecureCodeAAV;

    private java.lang.String orderID;

    private java.lang.String retryTrace;

    private java.lang.String shippingMethod;

    private java.lang.String useCustomerRefNum;

    private java.lang.String useStoredAAVInd;

    private java.lang.String verifyByVisaCAVV;

    private java.lang.String verifyByVisaXID;

    public BaseElements() {
    }

    public BaseElements(
           java.lang.String amount,
           java.lang.String authenticationECIInd,
           java.lang.String avsAddress1,
           java.lang.String avsAddress2,
           java.lang.String avsCity,
           java.lang.String avsCountryCode,
           java.lang.String avsDestAddress1,
           java.lang.String avsDestAddress2,
           java.lang.String avsDestCity,
           java.lang.String avsDestCountryCode,
           java.lang.String avsDestName,
           java.lang.String avsDestPhoneNum,
           java.lang.String avsDestPhoneType,
           java.lang.String avsDestState,
           java.lang.String avsDestZip,
           java.lang.String avsName,
           java.lang.String avsPhone,
           java.lang.String avsPhoneType,
           java.lang.String avsState,
           java.lang.String avsZip,
           java.lang.String bmlCustomerAnnualIncome,
           java.lang.String bmlCustomerBirthDate,
           java.lang.String bmlCustomerCheckingAccount,
           java.lang.String bmlCustomerEmail,
           java.lang.String bmlCustomerIP,
           java.lang.String bmlCustomerRegistrationDate,
           java.lang.String bmlCustomerResidenceStatus,
           java.lang.String bmlCustomerSSN,
           java.lang.String bmlCustomerSavingsAccount,
           java.lang.String bmlCustomerTypeFlag,
           java.lang.String bmlItemCategory,
           java.lang.String bmlMerchantPromotionalCode,
           java.lang.String bmlPreapprovalInvitationNum,
           java.lang.String bmlProductDeliveryType,
           java.lang.String bmlShippingCost,
           java.lang.String bmlTNCVersion,
           java.lang.String cardBrand,
           java.lang.String ccAccountNum,
           java.lang.String ccCardVerifyNum,
           java.lang.String ccCardVerifyPresenceInd,
           java.lang.String ccExp,
           java.lang.String comments,
           java.lang.String customerAni,
           java.lang.String customerBrowserName,
           java.lang.String customerEmail,
           java.lang.String customerIpAddress,
           java.lang.String debitBillerReferenceNumber,
           java.lang.String ecpAuthMethod,
           java.lang.String ecpBankAcctType,
           java.lang.String ecpCheckDDA,
           java.lang.String ecpCheckRT,
           java.lang.String ecpCheckSerialNumber,
           java.lang.String ecpDelvMethod,
           java.lang.String ecpImageReferenceNumber,
           java.lang.String ecpTerminalCity,
           java.lang.String ecpTerminalState,
           java.lang.String emailAddressSubtype,
           java.lang.String encryptedPan,
           java.lang.String encryptedPanHash,
           java.lang.String encryptedPanKey,
           java.lang.String encryptedPanMethod,
           java.lang.String encryptedPanPublicKeyFingerPrint,
           java.lang.String euddBankSortCode,
           java.lang.String euddCountryCode,
           java.lang.String euddRibCode,
           java.lang.String industryType,
           java.lang.String mcSecureCodeAAV,
           java.lang.String orderID,
           java.lang.String retryTrace,
           java.lang.String shippingMethod,
           java.lang.String useCustomerRefNum,
           java.lang.String useStoredAAVInd,
           java.lang.String verifyByVisaCAVV,
           java.lang.String verifyByVisaXID) {
           this.amount = amount;
           this.authenticationECIInd = authenticationECIInd;
           this.avsAddress1 = avsAddress1;
           this.avsAddress2 = avsAddress2;
           this.avsCity = avsCity;
           this.avsCountryCode = avsCountryCode;
           this.avsDestAddress1 = avsDestAddress1;
           this.avsDestAddress2 = avsDestAddress2;
           this.avsDestCity = avsDestCity;
           this.avsDestCountryCode = avsDestCountryCode;
           this.avsDestName = avsDestName;
           this.avsDestPhoneNum = avsDestPhoneNum;
           this.avsDestPhoneType = avsDestPhoneType;
           this.avsDestState = avsDestState;
           this.avsDestZip = avsDestZip;
           this.avsName = avsName;
           this.avsPhone = avsPhone;
           this.avsPhoneType = avsPhoneType;
           this.avsState = avsState;
           this.avsZip = avsZip;
           this.bmlCustomerAnnualIncome = bmlCustomerAnnualIncome;
           this.bmlCustomerBirthDate = bmlCustomerBirthDate;
           this.bmlCustomerCheckingAccount = bmlCustomerCheckingAccount;
           this.bmlCustomerEmail = bmlCustomerEmail;
           this.bmlCustomerIP = bmlCustomerIP;
           this.bmlCustomerRegistrationDate = bmlCustomerRegistrationDate;
           this.bmlCustomerResidenceStatus = bmlCustomerResidenceStatus;
           this.bmlCustomerSSN = bmlCustomerSSN;
           this.bmlCustomerSavingsAccount = bmlCustomerSavingsAccount;
           this.bmlCustomerTypeFlag = bmlCustomerTypeFlag;
           this.bmlItemCategory = bmlItemCategory;
           this.bmlMerchantPromotionalCode = bmlMerchantPromotionalCode;
           this.bmlPreapprovalInvitationNum = bmlPreapprovalInvitationNum;
           this.bmlProductDeliveryType = bmlProductDeliveryType;
           this.bmlShippingCost = bmlShippingCost;
           this.bmlTNCVersion = bmlTNCVersion;
           this.cardBrand = cardBrand;
           this.ccAccountNum = ccAccountNum;
           this.ccCardVerifyNum = ccCardVerifyNum;
           this.ccCardVerifyPresenceInd = ccCardVerifyPresenceInd;
           this.ccExp = ccExp;
           this.comments = comments;
           this.customerAni = customerAni;
           this.customerBrowserName = customerBrowserName;
           this.customerEmail = customerEmail;
           this.customerIpAddress = customerIpAddress;
           this.debitBillerReferenceNumber = debitBillerReferenceNumber;
           this.ecpAuthMethod = ecpAuthMethod;
           this.ecpBankAcctType = ecpBankAcctType;
           this.ecpCheckDDA = ecpCheckDDA;
           this.ecpCheckRT = ecpCheckRT;
           this.ecpCheckSerialNumber = ecpCheckSerialNumber;
           this.ecpDelvMethod = ecpDelvMethod;
           this.ecpImageReferenceNumber = ecpImageReferenceNumber;
           this.ecpTerminalCity = ecpTerminalCity;
           this.ecpTerminalState = ecpTerminalState;
           this.emailAddressSubtype = emailAddressSubtype;
           this.encryptedPan = encryptedPan;
           this.encryptedPanHash = encryptedPanHash;
           this.encryptedPanKey = encryptedPanKey;
           this.encryptedPanMethod = encryptedPanMethod;
           this.encryptedPanPublicKeyFingerPrint = encryptedPanPublicKeyFingerPrint;
           this.euddBankSortCode = euddBankSortCode;
           this.euddCountryCode = euddCountryCode;
           this.euddRibCode = euddRibCode;
           this.industryType = industryType;
           this.mcSecureCodeAAV = mcSecureCodeAAV;
           this.orderID = orderID;
           this.retryTrace = retryTrace;
           this.shippingMethod = shippingMethod;
           this.useCustomerRefNum = useCustomerRefNum;
           this.useStoredAAVInd = useStoredAAVInd;
           this.verifyByVisaCAVV = verifyByVisaCAVV;
           this.verifyByVisaXID = verifyByVisaXID;
    }


    /**
     * Gets the amount value for this BaseElements.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BaseElements.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the authenticationECIInd value for this BaseElements.
     * 
     * @return authenticationECIInd
     */
    public java.lang.String getAuthenticationECIInd() {
        return authenticationECIInd;
    }


    /**
     * Sets the authenticationECIInd value for this BaseElements.
     * 
     * @param authenticationECIInd
     */
    public void setAuthenticationECIInd(java.lang.String authenticationECIInd) {
        this.authenticationECIInd = authenticationECIInd;
    }


    /**
     * Gets the avsAddress1 value for this BaseElements.
     * 
     * @return avsAddress1
     */
    public java.lang.String getAvsAddress1() {
        return avsAddress1;
    }


    /**
     * Sets the avsAddress1 value for this BaseElements.
     * 
     * @param avsAddress1
     */
    public void setAvsAddress1(java.lang.String avsAddress1) {
        this.avsAddress1 = avsAddress1;
    }


    /**
     * Gets the avsAddress2 value for this BaseElements.
     * 
     * @return avsAddress2
     */
    public java.lang.String getAvsAddress2() {
        return avsAddress2;
    }


    /**
     * Sets the avsAddress2 value for this BaseElements.
     * 
     * @param avsAddress2
     */
    public void setAvsAddress2(java.lang.String avsAddress2) {
        this.avsAddress2 = avsAddress2;
    }


    /**
     * Gets the avsCity value for this BaseElements.
     * 
     * @return avsCity
     */
    public java.lang.String getAvsCity() {
        return avsCity;
    }


    /**
     * Sets the avsCity value for this BaseElements.
     * 
     * @param avsCity
     */
    public void setAvsCity(java.lang.String avsCity) {
        this.avsCity = avsCity;
    }


    /**
     * Gets the avsCountryCode value for this BaseElements.
     * 
     * @return avsCountryCode
     */
    public java.lang.String getAvsCountryCode() {
        return avsCountryCode;
    }


    /**
     * Sets the avsCountryCode value for this BaseElements.
     * 
     * @param avsCountryCode
     */
    public void setAvsCountryCode(java.lang.String avsCountryCode) {
        this.avsCountryCode = avsCountryCode;
    }


    /**
     * Gets the avsDestAddress1 value for this BaseElements.
     * 
     * @return avsDestAddress1
     */
    public java.lang.String getAvsDestAddress1() {
        return avsDestAddress1;
    }


    /**
     * Sets the avsDestAddress1 value for this BaseElements.
     * 
     * @param avsDestAddress1
     */
    public void setAvsDestAddress1(java.lang.String avsDestAddress1) {
        this.avsDestAddress1 = avsDestAddress1;
    }


    /**
     * Gets the avsDestAddress2 value for this BaseElements.
     * 
     * @return avsDestAddress2
     */
    public java.lang.String getAvsDestAddress2() {
        return avsDestAddress2;
    }


    /**
     * Sets the avsDestAddress2 value for this BaseElements.
     * 
     * @param avsDestAddress2
     */
    public void setAvsDestAddress2(java.lang.String avsDestAddress2) {
        this.avsDestAddress2 = avsDestAddress2;
    }


    /**
     * Gets the avsDestCity value for this BaseElements.
     * 
     * @return avsDestCity
     */
    public java.lang.String getAvsDestCity() {
        return avsDestCity;
    }


    /**
     * Sets the avsDestCity value for this BaseElements.
     * 
     * @param avsDestCity
     */
    public void setAvsDestCity(java.lang.String avsDestCity) {
        this.avsDestCity = avsDestCity;
    }


    /**
     * Gets the avsDestCountryCode value for this BaseElements.
     * 
     * @return avsDestCountryCode
     */
    public java.lang.String getAvsDestCountryCode() {
        return avsDestCountryCode;
    }


    /**
     * Sets the avsDestCountryCode value for this BaseElements.
     * 
     * @param avsDestCountryCode
     */
    public void setAvsDestCountryCode(java.lang.String avsDestCountryCode) {
        this.avsDestCountryCode = avsDestCountryCode;
    }


    /**
     * Gets the avsDestName value for this BaseElements.
     * 
     * @return avsDestName
     */
    public java.lang.String getAvsDestName() {
        return avsDestName;
    }


    /**
     * Sets the avsDestName value for this BaseElements.
     * 
     * @param avsDestName
     */
    public void setAvsDestName(java.lang.String avsDestName) {
        this.avsDestName = avsDestName;
    }


    /**
     * Gets the avsDestPhoneNum value for this BaseElements.
     * 
     * @return avsDestPhoneNum
     */
    public java.lang.String getAvsDestPhoneNum() {
        return avsDestPhoneNum;
    }


    /**
     * Sets the avsDestPhoneNum value for this BaseElements.
     * 
     * @param avsDestPhoneNum
     */
    public void setAvsDestPhoneNum(java.lang.String avsDestPhoneNum) {
        this.avsDestPhoneNum = avsDestPhoneNum;
    }


    /**
     * Gets the avsDestPhoneType value for this BaseElements.
     * 
     * @return avsDestPhoneType
     */
    public java.lang.String getAvsDestPhoneType() {
        return avsDestPhoneType;
    }


    /**
     * Sets the avsDestPhoneType value for this BaseElements.
     * 
     * @param avsDestPhoneType
     */
    public void setAvsDestPhoneType(java.lang.String avsDestPhoneType) {
        this.avsDestPhoneType = avsDestPhoneType;
    }


    /**
     * Gets the avsDestState value for this BaseElements.
     * 
     * @return avsDestState
     */
    public java.lang.String getAvsDestState() {
        return avsDestState;
    }


    /**
     * Sets the avsDestState value for this BaseElements.
     * 
     * @param avsDestState
     */
    public void setAvsDestState(java.lang.String avsDestState) {
        this.avsDestState = avsDestState;
    }


    /**
     * Gets the avsDestZip value for this BaseElements.
     * 
     * @return avsDestZip
     */
    public java.lang.String getAvsDestZip() {
        return avsDestZip;
    }


    /**
     * Sets the avsDestZip value for this BaseElements.
     * 
     * @param avsDestZip
     */
    public void setAvsDestZip(java.lang.String avsDestZip) {
        this.avsDestZip = avsDestZip;
    }


    /**
     * Gets the avsName value for this BaseElements.
     * 
     * @return avsName
     */
    public java.lang.String getAvsName() {
        return avsName;
    }


    /**
     * Sets the avsName value for this BaseElements.
     * 
     * @param avsName
     */
    public void setAvsName(java.lang.String avsName) {
        this.avsName = avsName;
    }


    /**
     * Gets the avsPhone value for this BaseElements.
     * 
     * @return avsPhone
     */
    public java.lang.String getAvsPhone() {
        return avsPhone;
    }


    /**
     * Sets the avsPhone value for this BaseElements.
     * 
     * @param avsPhone
     */
    public void setAvsPhone(java.lang.String avsPhone) {
        this.avsPhone = avsPhone;
    }


    /**
     * Gets the avsPhoneType value for this BaseElements.
     * 
     * @return avsPhoneType
     */
    public java.lang.String getAvsPhoneType() {
        return avsPhoneType;
    }


    /**
     * Sets the avsPhoneType value for this BaseElements.
     * 
     * @param avsPhoneType
     */
    public void setAvsPhoneType(java.lang.String avsPhoneType) {
        this.avsPhoneType = avsPhoneType;
    }


    /**
     * Gets the avsState value for this BaseElements.
     * 
     * @return avsState
     */
    public java.lang.String getAvsState() {
        return avsState;
    }


    /**
     * Sets the avsState value for this BaseElements.
     * 
     * @param avsState
     */
    public void setAvsState(java.lang.String avsState) {
        this.avsState = avsState;
    }


    /**
     * Gets the avsZip value for this BaseElements.
     * 
     * @return avsZip
     */
    public java.lang.String getAvsZip() {
        return avsZip;
    }


    /**
     * Sets the avsZip value for this BaseElements.
     * 
     * @param avsZip
     */
    public void setAvsZip(java.lang.String avsZip) {
        this.avsZip = avsZip;
    }


    /**
     * Gets the bmlCustomerAnnualIncome value for this BaseElements.
     * 
     * @return bmlCustomerAnnualIncome
     */
    public java.lang.String getBmlCustomerAnnualIncome() {
        return bmlCustomerAnnualIncome;
    }


    /**
     * Sets the bmlCustomerAnnualIncome value for this BaseElements.
     * 
     * @param bmlCustomerAnnualIncome
     */
    public void setBmlCustomerAnnualIncome(java.lang.String bmlCustomerAnnualIncome) {
        this.bmlCustomerAnnualIncome = bmlCustomerAnnualIncome;
    }


    /**
     * Gets the bmlCustomerBirthDate value for this BaseElements.
     * 
     * @return bmlCustomerBirthDate
     */
    public java.lang.String getBmlCustomerBirthDate() {
        return bmlCustomerBirthDate;
    }


    /**
     * Sets the bmlCustomerBirthDate value for this BaseElements.
     * 
     * @param bmlCustomerBirthDate
     */
    public void setBmlCustomerBirthDate(java.lang.String bmlCustomerBirthDate) {
        this.bmlCustomerBirthDate = bmlCustomerBirthDate;
    }


    /**
     * Gets the bmlCustomerCheckingAccount value for this BaseElements.
     * 
     * @return bmlCustomerCheckingAccount
     */
    public java.lang.String getBmlCustomerCheckingAccount() {
        return bmlCustomerCheckingAccount;
    }


    /**
     * Sets the bmlCustomerCheckingAccount value for this BaseElements.
     * 
     * @param bmlCustomerCheckingAccount
     */
    public void setBmlCustomerCheckingAccount(java.lang.String bmlCustomerCheckingAccount) {
        this.bmlCustomerCheckingAccount = bmlCustomerCheckingAccount;
    }


    /**
     * Gets the bmlCustomerEmail value for this BaseElements.
     * 
     * @return bmlCustomerEmail
     */
    public java.lang.String getBmlCustomerEmail() {
        return bmlCustomerEmail;
    }


    /**
     * Sets the bmlCustomerEmail value for this BaseElements.
     * 
     * @param bmlCustomerEmail
     */
    public void setBmlCustomerEmail(java.lang.String bmlCustomerEmail) {
        this.bmlCustomerEmail = bmlCustomerEmail;
    }


    /**
     * Gets the bmlCustomerIP value for this BaseElements.
     * 
     * @return bmlCustomerIP
     */
    public java.lang.String getBmlCustomerIP() {
        return bmlCustomerIP;
    }


    /**
     * Sets the bmlCustomerIP value for this BaseElements.
     * 
     * @param bmlCustomerIP
     */
    public void setBmlCustomerIP(java.lang.String bmlCustomerIP) {
        this.bmlCustomerIP = bmlCustomerIP;
    }


    /**
     * Gets the bmlCustomerRegistrationDate value for this BaseElements.
     * 
     * @return bmlCustomerRegistrationDate
     */
    public java.lang.String getBmlCustomerRegistrationDate() {
        return bmlCustomerRegistrationDate;
    }


    /**
     * Sets the bmlCustomerRegistrationDate value for this BaseElements.
     * 
     * @param bmlCustomerRegistrationDate
     */
    public void setBmlCustomerRegistrationDate(java.lang.String bmlCustomerRegistrationDate) {
        this.bmlCustomerRegistrationDate = bmlCustomerRegistrationDate;
    }


    /**
     * Gets the bmlCustomerResidenceStatus value for this BaseElements.
     * 
     * @return bmlCustomerResidenceStatus
     */
    public java.lang.String getBmlCustomerResidenceStatus() {
        return bmlCustomerResidenceStatus;
    }


    /**
     * Sets the bmlCustomerResidenceStatus value for this BaseElements.
     * 
     * @param bmlCustomerResidenceStatus
     */
    public void setBmlCustomerResidenceStatus(java.lang.String bmlCustomerResidenceStatus) {
        this.bmlCustomerResidenceStatus = bmlCustomerResidenceStatus;
    }


    /**
     * Gets the bmlCustomerSSN value for this BaseElements.
     * 
     * @return bmlCustomerSSN
     */
    public java.lang.String getBmlCustomerSSN() {
        return bmlCustomerSSN;
    }


    /**
     * Sets the bmlCustomerSSN value for this BaseElements.
     * 
     * @param bmlCustomerSSN
     */
    public void setBmlCustomerSSN(java.lang.String bmlCustomerSSN) {
        this.bmlCustomerSSN = bmlCustomerSSN;
    }


    /**
     * Gets the bmlCustomerSavingsAccount value for this BaseElements.
     * 
     * @return bmlCustomerSavingsAccount
     */
    public java.lang.String getBmlCustomerSavingsAccount() {
        return bmlCustomerSavingsAccount;
    }


    /**
     * Sets the bmlCustomerSavingsAccount value for this BaseElements.
     * 
     * @param bmlCustomerSavingsAccount
     */
    public void setBmlCustomerSavingsAccount(java.lang.String bmlCustomerSavingsAccount) {
        this.bmlCustomerSavingsAccount = bmlCustomerSavingsAccount;
    }


    /**
     * Gets the bmlCustomerTypeFlag value for this BaseElements.
     * 
     * @return bmlCustomerTypeFlag
     */
    public java.lang.String getBmlCustomerTypeFlag() {
        return bmlCustomerTypeFlag;
    }


    /**
     * Sets the bmlCustomerTypeFlag value for this BaseElements.
     * 
     * @param bmlCustomerTypeFlag
     */
    public void setBmlCustomerTypeFlag(java.lang.String bmlCustomerTypeFlag) {
        this.bmlCustomerTypeFlag = bmlCustomerTypeFlag;
    }


    /**
     * Gets the bmlItemCategory value for this BaseElements.
     * 
     * @return bmlItemCategory
     */
    public java.lang.String getBmlItemCategory() {
        return bmlItemCategory;
    }


    /**
     * Sets the bmlItemCategory value for this BaseElements.
     * 
     * @param bmlItemCategory
     */
    public void setBmlItemCategory(java.lang.String bmlItemCategory) {
        this.bmlItemCategory = bmlItemCategory;
    }


    /**
     * Gets the bmlMerchantPromotionalCode value for this BaseElements.
     * 
     * @return bmlMerchantPromotionalCode
     */
    public java.lang.String getBmlMerchantPromotionalCode() {
        return bmlMerchantPromotionalCode;
    }


    /**
     * Sets the bmlMerchantPromotionalCode value for this BaseElements.
     * 
     * @param bmlMerchantPromotionalCode
     */
    public void setBmlMerchantPromotionalCode(java.lang.String bmlMerchantPromotionalCode) {
        this.bmlMerchantPromotionalCode = bmlMerchantPromotionalCode;
    }


    /**
     * Gets the bmlPreapprovalInvitationNum value for this BaseElements.
     * 
     * @return bmlPreapprovalInvitationNum
     */
    public java.lang.String getBmlPreapprovalInvitationNum() {
        return bmlPreapprovalInvitationNum;
    }


    /**
     * Sets the bmlPreapprovalInvitationNum value for this BaseElements.
     * 
     * @param bmlPreapprovalInvitationNum
     */
    public void setBmlPreapprovalInvitationNum(java.lang.String bmlPreapprovalInvitationNum) {
        this.bmlPreapprovalInvitationNum = bmlPreapprovalInvitationNum;
    }


    /**
     * Gets the bmlProductDeliveryType value for this BaseElements.
     * 
     * @return bmlProductDeliveryType
     */
    public java.lang.String getBmlProductDeliveryType() {
        return bmlProductDeliveryType;
    }


    /**
     * Sets the bmlProductDeliveryType value for this BaseElements.
     * 
     * @param bmlProductDeliveryType
     */
    public void setBmlProductDeliveryType(java.lang.String bmlProductDeliveryType) {
        this.bmlProductDeliveryType = bmlProductDeliveryType;
    }


    /**
     * Gets the bmlShippingCost value for this BaseElements.
     * 
     * @return bmlShippingCost
     */
    public java.lang.String getBmlShippingCost() {
        return bmlShippingCost;
    }


    /**
     * Sets the bmlShippingCost value for this BaseElements.
     * 
     * @param bmlShippingCost
     */
    public void setBmlShippingCost(java.lang.String bmlShippingCost) {
        this.bmlShippingCost = bmlShippingCost;
    }


    /**
     * Gets the bmlTNCVersion value for this BaseElements.
     * 
     * @return bmlTNCVersion
     */
    public java.lang.String getBmlTNCVersion() {
        return bmlTNCVersion;
    }


    /**
     * Sets the bmlTNCVersion value for this BaseElements.
     * 
     * @param bmlTNCVersion
     */
    public void setBmlTNCVersion(java.lang.String bmlTNCVersion) {
        this.bmlTNCVersion = bmlTNCVersion;
    }


    /**
     * Gets the cardBrand value for this BaseElements.
     * 
     * @return cardBrand
     */
    public java.lang.String getCardBrand() {
        return cardBrand;
    }


    /**
     * Sets the cardBrand value for this BaseElements.
     * 
     * @param cardBrand
     */
    public void setCardBrand(java.lang.String cardBrand) {
        this.cardBrand = cardBrand;
    }


    /**
     * Gets the ccAccountNum value for this BaseElements.
     * 
     * @return ccAccountNum
     */
    public java.lang.String getCcAccountNum() {
        return ccAccountNum;
    }


    /**
     * Sets the ccAccountNum value for this BaseElements.
     * 
     * @param ccAccountNum
     */
    public void setCcAccountNum(java.lang.String ccAccountNum) {
        this.ccAccountNum = ccAccountNum;
    }


    /**
     * Gets the ccCardVerifyNum value for this BaseElements.
     * 
     * @return ccCardVerifyNum
     */
    public java.lang.String getCcCardVerifyNum() {
        return ccCardVerifyNum;
    }


    /**
     * Sets the ccCardVerifyNum value for this BaseElements.
     * 
     * @param ccCardVerifyNum
     */
    public void setCcCardVerifyNum(java.lang.String ccCardVerifyNum) {
        this.ccCardVerifyNum = ccCardVerifyNum;
    }


    /**
     * Gets the ccCardVerifyPresenceInd value for this BaseElements.
     * 
     * @return ccCardVerifyPresenceInd
     */
    public java.lang.String getCcCardVerifyPresenceInd() {
        return ccCardVerifyPresenceInd;
    }


    /**
     * Sets the ccCardVerifyPresenceInd value for this BaseElements.
     * 
     * @param ccCardVerifyPresenceInd
     */
    public void setCcCardVerifyPresenceInd(java.lang.String ccCardVerifyPresenceInd) {
        this.ccCardVerifyPresenceInd = ccCardVerifyPresenceInd;
    }


    /**
     * Gets the ccExp value for this BaseElements.
     * 
     * @return ccExp
     */
    public java.lang.String getCcExp() {
        return ccExp;
    }


    /**
     * Sets the ccExp value for this BaseElements.
     * 
     * @param ccExp
     */
    public void setCcExp(java.lang.String ccExp) {
        this.ccExp = ccExp;
    }


    /**
     * Gets the comments value for this BaseElements.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this BaseElements.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the customerAni value for this BaseElements.
     * 
     * @return customerAni
     */
    public java.lang.String getCustomerAni() {
        return customerAni;
    }


    /**
     * Sets the customerAni value for this BaseElements.
     * 
     * @param customerAni
     */
    public void setCustomerAni(java.lang.String customerAni) {
        this.customerAni = customerAni;
    }


    /**
     * Gets the customerBrowserName value for this BaseElements.
     * 
     * @return customerBrowserName
     */
    public java.lang.String getCustomerBrowserName() {
        return customerBrowserName;
    }


    /**
     * Sets the customerBrowserName value for this BaseElements.
     * 
     * @param customerBrowserName
     */
    public void setCustomerBrowserName(java.lang.String customerBrowserName) {
        this.customerBrowserName = customerBrowserName;
    }


    /**
     * Gets the customerEmail value for this BaseElements.
     * 
     * @return customerEmail
     */
    public java.lang.String getCustomerEmail() {
        return customerEmail;
    }


    /**
     * Sets the customerEmail value for this BaseElements.
     * 
     * @param customerEmail
     */
    public void setCustomerEmail(java.lang.String customerEmail) {
        this.customerEmail = customerEmail;
    }


    /**
     * Gets the customerIpAddress value for this BaseElements.
     * 
     * @return customerIpAddress
     */
    public java.lang.String getCustomerIpAddress() {
        return customerIpAddress;
    }


    /**
     * Sets the customerIpAddress value for this BaseElements.
     * 
     * @param customerIpAddress
     */
    public void setCustomerIpAddress(java.lang.String customerIpAddress) {
        this.customerIpAddress = customerIpAddress;
    }


    /**
     * Gets the debitBillerReferenceNumber value for this BaseElements.
     * 
     * @return debitBillerReferenceNumber
     */
    public java.lang.String getDebitBillerReferenceNumber() {
        return debitBillerReferenceNumber;
    }


    /**
     * Sets the debitBillerReferenceNumber value for this BaseElements.
     * 
     * @param debitBillerReferenceNumber
     */
    public void setDebitBillerReferenceNumber(java.lang.String debitBillerReferenceNumber) {
        this.debitBillerReferenceNumber = debitBillerReferenceNumber;
    }


    /**
     * Gets the ecpAuthMethod value for this BaseElements.
     * 
     * @return ecpAuthMethod
     */
    public java.lang.String getEcpAuthMethod() {
        return ecpAuthMethod;
    }


    /**
     * Sets the ecpAuthMethod value for this BaseElements.
     * 
     * @param ecpAuthMethod
     */
    public void setEcpAuthMethod(java.lang.String ecpAuthMethod) {
        this.ecpAuthMethod = ecpAuthMethod;
    }


    /**
     * Gets the ecpBankAcctType value for this BaseElements.
     * 
     * @return ecpBankAcctType
     */
    public java.lang.String getEcpBankAcctType() {
        return ecpBankAcctType;
    }


    /**
     * Sets the ecpBankAcctType value for this BaseElements.
     * 
     * @param ecpBankAcctType
     */
    public void setEcpBankAcctType(java.lang.String ecpBankAcctType) {
        this.ecpBankAcctType = ecpBankAcctType;
    }


    /**
     * Gets the ecpCheckDDA value for this BaseElements.
     * 
     * @return ecpCheckDDA
     */
    public java.lang.String getEcpCheckDDA() {
        return ecpCheckDDA;
    }


    /**
     * Sets the ecpCheckDDA value for this BaseElements.
     * 
     * @param ecpCheckDDA
     */
    public void setEcpCheckDDA(java.lang.String ecpCheckDDA) {
        this.ecpCheckDDA = ecpCheckDDA;
    }


    /**
     * Gets the ecpCheckRT value for this BaseElements.
     * 
     * @return ecpCheckRT
     */
    public java.lang.String getEcpCheckRT() {
        return ecpCheckRT;
    }


    /**
     * Sets the ecpCheckRT value for this BaseElements.
     * 
     * @param ecpCheckRT
     */
    public void setEcpCheckRT(java.lang.String ecpCheckRT) {
        this.ecpCheckRT = ecpCheckRT;
    }


    /**
     * Gets the ecpCheckSerialNumber value for this BaseElements.
     * 
     * @return ecpCheckSerialNumber
     */
    public java.lang.String getEcpCheckSerialNumber() {
        return ecpCheckSerialNumber;
    }


    /**
     * Sets the ecpCheckSerialNumber value for this BaseElements.
     * 
     * @param ecpCheckSerialNumber
     */
    public void setEcpCheckSerialNumber(java.lang.String ecpCheckSerialNumber) {
        this.ecpCheckSerialNumber = ecpCheckSerialNumber;
    }


    /**
     * Gets the ecpDelvMethod value for this BaseElements.
     * 
     * @return ecpDelvMethod
     */
    public java.lang.String getEcpDelvMethod() {
        return ecpDelvMethod;
    }


    /**
     * Sets the ecpDelvMethod value for this BaseElements.
     * 
     * @param ecpDelvMethod
     */
    public void setEcpDelvMethod(java.lang.String ecpDelvMethod) {
        this.ecpDelvMethod = ecpDelvMethod;
    }


    /**
     * Gets the ecpImageReferenceNumber value for this BaseElements.
     * 
     * @return ecpImageReferenceNumber
     */
    public java.lang.String getEcpImageReferenceNumber() {
        return ecpImageReferenceNumber;
    }


    /**
     * Sets the ecpImageReferenceNumber value for this BaseElements.
     * 
     * @param ecpImageReferenceNumber
     */
    public void setEcpImageReferenceNumber(java.lang.String ecpImageReferenceNumber) {
        this.ecpImageReferenceNumber = ecpImageReferenceNumber;
    }


    /**
     * Gets the ecpTerminalCity value for this BaseElements.
     * 
     * @return ecpTerminalCity
     */
    public java.lang.String getEcpTerminalCity() {
        return ecpTerminalCity;
    }


    /**
     * Sets the ecpTerminalCity value for this BaseElements.
     * 
     * @param ecpTerminalCity
     */
    public void setEcpTerminalCity(java.lang.String ecpTerminalCity) {
        this.ecpTerminalCity = ecpTerminalCity;
    }


    /**
     * Gets the ecpTerminalState value for this BaseElements.
     * 
     * @return ecpTerminalState
     */
    public java.lang.String getEcpTerminalState() {
        return ecpTerminalState;
    }


    /**
     * Sets the ecpTerminalState value for this BaseElements.
     * 
     * @param ecpTerminalState
     */
    public void setEcpTerminalState(java.lang.String ecpTerminalState) {
        this.ecpTerminalState = ecpTerminalState;
    }


    /**
     * Gets the emailAddressSubtype value for this BaseElements.
     * 
     * @return emailAddressSubtype
     */
    public java.lang.String getEmailAddressSubtype() {
        return emailAddressSubtype;
    }


    /**
     * Sets the emailAddressSubtype value for this BaseElements.
     * 
     * @param emailAddressSubtype
     */
    public void setEmailAddressSubtype(java.lang.String emailAddressSubtype) {
        this.emailAddressSubtype = emailAddressSubtype;
    }


    /**
     * Gets the encryptedPan value for this BaseElements.
     * 
     * @return encryptedPan
     */
    public java.lang.String getEncryptedPan() {
        return encryptedPan;
    }


    /**
     * Sets the encryptedPan value for this BaseElements.
     * 
     * @param encryptedPan
     */
    public void setEncryptedPan(java.lang.String encryptedPan) {
        this.encryptedPan = encryptedPan;
    }


    /**
     * Gets the encryptedPanHash value for this BaseElements.
     * 
     * @return encryptedPanHash
     */
    public java.lang.String getEncryptedPanHash() {
        return encryptedPanHash;
    }


    /**
     * Sets the encryptedPanHash value for this BaseElements.
     * 
     * @param encryptedPanHash
     */
    public void setEncryptedPanHash(java.lang.String encryptedPanHash) {
        this.encryptedPanHash = encryptedPanHash;
    }


    /**
     * Gets the encryptedPanKey value for this BaseElements.
     * 
     * @return encryptedPanKey
     */
    public java.lang.String getEncryptedPanKey() {
        return encryptedPanKey;
    }


    /**
     * Sets the encryptedPanKey value for this BaseElements.
     * 
     * @param encryptedPanKey
     */
    public void setEncryptedPanKey(java.lang.String encryptedPanKey) {
        this.encryptedPanKey = encryptedPanKey;
    }


    /**
     * Gets the encryptedPanMethod value for this BaseElements.
     * 
     * @return encryptedPanMethod
     */
    public java.lang.String getEncryptedPanMethod() {
        return encryptedPanMethod;
    }


    /**
     * Sets the encryptedPanMethod value for this BaseElements.
     * 
     * @param encryptedPanMethod
     */
    public void setEncryptedPanMethod(java.lang.String encryptedPanMethod) {
        this.encryptedPanMethod = encryptedPanMethod;
    }


    /**
     * Gets the encryptedPanPublicKeyFingerPrint value for this BaseElements.
     * 
     * @return encryptedPanPublicKeyFingerPrint
     */
    public java.lang.String getEncryptedPanPublicKeyFingerPrint() {
        return encryptedPanPublicKeyFingerPrint;
    }


    /**
     * Sets the encryptedPanPublicKeyFingerPrint value for this BaseElements.
     * 
     * @param encryptedPanPublicKeyFingerPrint
     */
    public void setEncryptedPanPublicKeyFingerPrint(java.lang.String encryptedPanPublicKeyFingerPrint) {
        this.encryptedPanPublicKeyFingerPrint = encryptedPanPublicKeyFingerPrint;
    }


    /**
     * Gets the euddBankSortCode value for this BaseElements.
     * 
     * @return euddBankSortCode
     */
    public java.lang.String getEuddBankSortCode() {
        return euddBankSortCode;
    }


    /**
     * Sets the euddBankSortCode value for this BaseElements.
     * 
     * @param euddBankSortCode
     */
    public void setEuddBankSortCode(java.lang.String euddBankSortCode) {
        this.euddBankSortCode = euddBankSortCode;
    }


    /**
     * Gets the euddCountryCode value for this BaseElements.
     * 
     * @return euddCountryCode
     */
    public java.lang.String getEuddCountryCode() {
        return euddCountryCode;
    }


    /**
     * Sets the euddCountryCode value for this BaseElements.
     * 
     * @param euddCountryCode
     */
    public void setEuddCountryCode(java.lang.String euddCountryCode) {
        this.euddCountryCode = euddCountryCode;
    }


    /**
     * Gets the euddRibCode value for this BaseElements.
     * 
     * @return euddRibCode
     */
    public java.lang.String getEuddRibCode() {
        return euddRibCode;
    }


    /**
     * Sets the euddRibCode value for this BaseElements.
     * 
     * @param euddRibCode
     */
    public void setEuddRibCode(java.lang.String euddRibCode) {
        this.euddRibCode = euddRibCode;
    }


    /**
     * Gets the industryType value for this BaseElements.
     * 
     * @return industryType
     */
    public java.lang.String getIndustryType() {
        return industryType;
    }


    /**
     * Sets the industryType value for this BaseElements.
     * 
     * @param industryType
     */
    public void setIndustryType(java.lang.String industryType) {
        this.industryType = industryType;
    }


    /**
     * Gets the mcSecureCodeAAV value for this BaseElements.
     * 
     * @return mcSecureCodeAAV
     */
    public java.lang.String getMcSecureCodeAAV() {
        return mcSecureCodeAAV;
    }


    /**
     * Sets the mcSecureCodeAAV value for this BaseElements.
     * 
     * @param mcSecureCodeAAV
     */
    public void setMcSecureCodeAAV(java.lang.String mcSecureCodeAAV) {
        this.mcSecureCodeAAV = mcSecureCodeAAV;
    }


    /**
     * Gets the orderID value for this BaseElements.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this BaseElements.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the retryTrace value for this BaseElements.
     * 
     * @return retryTrace
     */
    public java.lang.String getRetryTrace() {
        return retryTrace;
    }


    /**
     * Sets the retryTrace value for this BaseElements.
     * 
     * @param retryTrace
     */
    public void setRetryTrace(java.lang.String retryTrace) {
        this.retryTrace = retryTrace;
    }


    /**
     * Gets the shippingMethod value for this BaseElements.
     * 
     * @return shippingMethod
     */
    public java.lang.String getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this BaseElements.
     * 
     * @param shippingMethod
     */
    public void setShippingMethod(java.lang.String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the useCustomerRefNum value for this BaseElements.
     * 
     * @return useCustomerRefNum
     */
    public java.lang.String getUseCustomerRefNum() {
        return useCustomerRefNum;
    }


    /**
     * Sets the useCustomerRefNum value for this BaseElements.
     * 
     * @param useCustomerRefNum
     */
    public void setUseCustomerRefNum(java.lang.String useCustomerRefNum) {
        this.useCustomerRefNum = useCustomerRefNum;
    }


    /**
     * Gets the useStoredAAVInd value for this BaseElements.
     * 
     * @return useStoredAAVInd
     */
    public java.lang.String getUseStoredAAVInd() {
        return useStoredAAVInd;
    }


    /**
     * Sets the useStoredAAVInd value for this BaseElements.
     * 
     * @param useStoredAAVInd
     */
    public void setUseStoredAAVInd(java.lang.String useStoredAAVInd) {
        this.useStoredAAVInd = useStoredAAVInd;
    }


    /**
     * Gets the verifyByVisaCAVV value for this BaseElements.
     * 
     * @return verifyByVisaCAVV
     */
    public java.lang.String getVerifyByVisaCAVV() {
        return verifyByVisaCAVV;
    }


    /**
     * Sets the verifyByVisaCAVV value for this BaseElements.
     * 
     * @param verifyByVisaCAVV
     */
    public void setVerifyByVisaCAVV(java.lang.String verifyByVisaCAVV) {
        this.verifyByVisaCAVV = verifyByVisaCAVV;
    }


    /**
     * Gets the verifyByVisaXID value for this BaseElements.
     * 
     * @return verifyByVisaXID
     */
    public java.lang.String getVerifyByVisaXID() {
        return verifyByVisaXID;
    }


    /**
     * Sets the verifyByVisaXID value for this BaseElements.
     * 
     * @param verifyByVisaXID
     */
    public void setVerifyByVisaXID(java.lang.String verifyByVisaXID) {
        this.verifyByVisaXID = verifyByVisaXID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseElements)) return false;
        BaseElements other = (BaseElements) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.authenticationECIInd==null && other.getAuthenticationECIInd()==null) || 
             (this.authenticationECIInd!=null &&
              this.authenticationECIInd.equals(other.getAuthenticationECIInd()))) &&
            ((this.avsAddress1==null && other.getAvsAddress1()==null) || 
             (this.avsAddress1!=null &&
              this.avsAddress1.equals(other.getAvsAddress1()))) &&
            ((this.avsAddress2==null && other.getAvsAddress2()==null) || 
             (this.avsAddress2!=null &&
              this.avsAddress2.equals(other.getAvsAddress2()))) &&
            ((this.avsCity==null && other.getAvsCity()==null) || 
             (this.avsCity!=null &&
              this.avsCity.equals(other.getAvsCity()))) &&
            ((this.avsCountryCode==null && other.getAvsCountryCode()==null) || 
             (this.avsCountryCode!=null &&
              this.avsCountryCode.equals(other.getAvsCountryCode()))) &&
            ((this.avsDestAddress1==null && other.getAvsDestAddress1()==null) || 
             (this.avsDestAddress1!=null &&
              this.avsDestAddress1.equals(other.getAvsDestAddress1()))) &&
            ((this.avsDestAddress2==null && other.getAvsDestAddress2()==null) || 
             (this.avsDestAddress2!=null &&
              this.avsDestAddress2.equals(other.getAvsDestAddress2()))) &&
            ((this.avsDestCity==null && other.getAvsDestCity()==null) || 
             (this.avsDestCity!=null &&
              this.avsDestCity.equals(other.getAvsDestCity()))) &&
            ((this.avsDestCountryCode==null && other.getAvsDestCountryCode()==null) || 
             (this.avsDestCountryCode!=null &&
              this.avsDestCountryCode.equals(other.getAvsDestCountryCode()))) &&
            ((this.avsDestName==null && other.getAvsDestName()==null) || 
             (this.avsDestName!=null &&
              this.avsDestName.equals(other.getAvsDestName()))) &&
            ((this.avsDestPhoneNum==null && other.getAvsDestPhoneNum()==null) || 
             (this.avsDestPhoneNum!=null &&
              this.avsDestPhoneNum.equals(other.getAvsDestPhoneNum()))) &&
            ((this.avsDestPhoneType==null && other.getAvsDestPhoneType()==null) || 
             (this.avsDestPhoneType!=null &&
              this.avsDestPhoneType.equals(other.getAvsDestPhoneType()))) &&
            ((this.avsDestState==null && other.getAvsDestState()==null) || 
             (this.avsDestState!=null &&
              this.avsDestState.equals(other.getAvsDestState()))) &&
            ((this.avsDestZip==null && other.getAvsDestZip()==null) || 
             (this.avsDestZip!=null &&
              this.avsDestZip.equals(other.getAvsDestZip()))) &&
            ((this.avsName==null && other.getAvsName()==null) || 
             (this.avsName!=null &&
              this.avsName.equals(other.getAvsName()))) &&
            ((this.avsPhone==null && other.getAvsPhone()==null) || 
             (this.avsPhone!=null &&
              this.avsPhone.equals(other.getAvsPhone()))) &&
            ((this.avsPhoneType==null && other.getAvsPhoneType()==null) || 
             (this.avsPhoneType!=null &&
              this.avsPhoneType.equals(other.getAvsPhoneType()))) &&
            ((this.avsState==null && other.getAvsState()==null) || 
             (this.avsState!=null &&
              this.avsState.equals(other.getAvsState()))) &&
            ((this.avsZip==null && other.getAvsZip()==null) || 
             (this.avsZip!=null &&
              this.avsZip.equals(other.getAvsZip()))) &&
            ((this.bmlCustomerAnnualIncome==null && other.getBmlCustomerAnnualIncome()==null) || 
             (this.bmlCustomerAnnualIncome!=null &&
              this.bmlCustomerAnnualIncome.equals(other.getBmlCustomerAnnualIncome()))) &&
            ((this.bmlCustomerBirthDate==null && other.getBmlCustomerBirthDate()==null) || 
             (this.bmlCustomerBirthDate!=null &&
              this.bmlCustomerBirthDate.equals(other.getBmlCustomerBirthDate()))) &&
            ((this.bmlCustomerCheckingAccount==null && other.getBmlCustomerCheckingAccount()==null) || 
             (this.bmlCustomerCheckingAccount!=null &&
              this.bmlCustomerCheckingAccount.equals(other.getBmlCustomerCheckingAccount()))) &&
            ((this.bmlCustomerEmail==null && other.getBmlCustomerEmail()==null) || 
             (this.bmlCustomerEmail!=null &&
              this.bmlCustomerEmail.equals(other.getBmlCustomerEmail()))) &&
            ((this.bmlCustomerIP==null && other.getBmlCustomerIP()==null) || 
             (this.bmlCustomerIP!=null &&
              this.bmlCustomerIP.equals(other.getBmlCustomerIP()))) &&
            ((this.bmlCustomerRegistrationDate==null && other.getBmlCustomerRegistrationDate()==null) || 
             (this.bmlCustomerRegistrationDate!=null &&
              this.bmlCustomerRegistrationDate.equals(other.getBmlCustomerRegistrationDate()))) &&
            ((this.bmlCustomerResidenceStatus==null && other.getBmlCustomerResidenceStatus()==null) || 
             (this.bmlCustomerResidenceStatus!=null &&
              this.bmlCustomerResidenceStatus.equals(other.getBmlCustomerResidenceStatus()))) &&
            ((this.bmlCustomerSSN==null && other.getBmlCustomerSSN()==null) || 
             (this.bmlCustomerSSN!=null &&
              this.bmlCustomerSSN.equals(other.getBmlCustomerSSN()))) &&
            ((this.bmlCustomerSavingsAccount==null && other.getBmlCustomerSavingsAccount()==null) || 
             (this.bmlCustomerSavingsAccount!=null &&
              this.bmlCustomerSavingsAccount.equals(other.getBmlCustomerSavingsAccount()))) &&
            ((this.bmlCustomerTypeFlag==null && other.getBmlCustomerTypeFlag()==null) || 
             (this.bmlCustomerTypeFlag!=null &&
              this.bmlCustomerTypeFlag.equals(other.getBmlCustomerTypeFlag()))) &&
            ((this.bmlItemCategory==null && other.getBmlItemCategory()==null) || 
             (this.bmlItemCategory!=null &&
              this.bmlItemCategory.equals(other.getBmlItemCategory()))) &&
            ((this.bmlMerchantPromotionalCode==null && other.getBmlMerchantPromotionalCode()==null) || 
             (this.bmlMerchantPromotionalCode!=null &&
              this.bmlMerchantPromotionalCode.equals(other.getBmlMerchantPromotionalCode()))) &&
            ((this.bmlPreapprovalInvitationNum==null && other.getBmlPreapprovalInvitationNum()==null) || 
             (this.bmlPreapprovalInvitationNum!=null &&
              this.bmlPreapprovalInvitationNum.equals(other.getBmlPreapprovalInvitationNum()))) &&
            ((this.bmlProductDeliveryType==null && other.getBmlProductDeliveryType()==null) || 
             (this.bmlProductDeliveryType!=null &&
              this.bmlProductDeliveryType.equals(other.getBmlProductDeliveryType()))) &&
            ((this.bmlShippingCost==null && other.getBmlShippingCost()==null) || 
             (this.bmlShippingCost!=null &&
              this.bmlShippingCost.equals(other.getBmlShippingCost()))) &&
            ((this.bmlTNCVersion==null && other.getBmlTNCVersion()==null) || 
             (this.bmlTNCVersion!=null &&
              this.bmlTNCVersion.equals(other.getBmlTNCVersion()))) &&
            ((this.cardBrand==null && other.getCardBrand()==null) || 
             (this.cardBrand!=null &&
              this.cardBrand.equals(other.getCardBrand()))) &&
            ((this.ccAccountNum==null && other.getCcAccountNum()==null) || 
             (this.ccAccountNum!=null &&
              this.ccAccountNum.equals(other.getCcAccountNum()))) &&
            ((this.ccCardVerifyNum==null && other.getCcCardVerifyNum()==null) || 
             (this.ccCardVerifyNum!=null &&
              this.ccCardVerifyNum.equals(other.getCcCardVerifyNum()))) &&
            ((this.ccCardVerifyPresenceInd==null && other.getCcCardVerifyPresenceInd()==null) || 
             (this.ccCardVerifyPresenceInd!=null &&
              this.ccCardVerifyPresenceInd.equals(other.getCcCardVerifyPresenceInd()))) &&
            ((this.ccExp==null && other.getCcExp()==null) || 
             (this.ccExp!=null &&
              this.ccExp.equals(other.getCcExp()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.customerAni==null && other.getCustomerAni()==null) || 
             (this.customerAni!=null &&
              this.customerAni.equals(other.getCustomerAni()))) &&
            ((this.customerBrowserName==null && other.getCustomerBrowserName()==null) || 
             (this.customerBrowserName!=null &&
              this.customerBrowserName.equals(other.getCustomerBrowserName()))) &&
            ((this.customerEmail==null && other.getCustomerEmail()==null) || 
             (this.customerEmail!=null &&
              this.customerEmail.equals(other.getCustomerEmail()))) &&
            ((this.customerIpAddress==null && other.getCustomerIpAddress()==null) || 
             (this.customerIpAddress!=null &&
              this.customerIpAddress.equals(other.getCustomerIpAddress()))) &&
            ((this.debitBillerReferenceNumber==null && other.getDebitBillerReferenceNumber()==null) || 
             (this.debitBillerReferenceNumber!=null &&
              this.debitBillerReferenceNumber.equals(other.getDebitBillerReferenceNumber()))) &&
            ((this.ecpAuthMethod==null && other.getEcpAuthMethod()==null) || 
             (this.ecpAuthMethod!=null &&
              this.ecpAuthMethod.equals(other.getEcpAuthMethod()))) &&
            ((this.ecpBankAcctType==null && other.getEcpBankAcctType()==null) || 
             (this.ecpBankAcctType!=null &&
              this.ecpBankAcctType.equals(other.getEcpBankAcctType()))) &&
            ((this.ecpCheckDDA==null && other.getEcpCheckDDA()==null) || 
             (this.ecpCheckDDA!=null &&
              this.ecpCheckDDA.equals(other.getEcpCheckDDA()))) &&
            ((this.ecpCheckRT==null && other.getEcpCheckRT()==null) || 
             (this.ecpCheckRT!=null &&
              this.ecpCheckRT.equals(other.getEcpCheckRT()))) &&
            ((this.ecpCheckSerialNumber==null && other.getEcpCheckSerialNumber()==null) || 
             (this.ecpCheckSerialNumber!=null &&
              this.ecpCheckSerialNumber.equals(other.getEcpCheckSerialNumber()))) &&
            ((this.ecpDelvMethod==null && other.getEcpDelvMethod()==null) || 
             (this.ecpDelvMethod!=null &&
              this.ecpDelvMethod.equals(other.getEcpDelvMethod()))) &&
            ((this.ecpImageReferenceNumber==null && other.getEcpImageReferenceNumber()==null) || 
             (this.ecpImageReferenceNumber!=null &&
              this.ecpImageReferenceNumber.equals(other.getEcpImageReferenceNumber()))) &&
            ((this.ecpTerminalCity==null && other.getEcpTerminalCity()==null) || 
             (this.ecpTerminalCity!=null &&
              this.ecpTerminalCity.equals(other.getEcpTerminalCity()))) &&
            ((this.ecpTerminalState==null && other.getEcpTerminalState()==null) || 
             (this.ecpTerminalState!=null &&
              this.ecpTerminalState.equals(other.getEcpTerminalState()))) &&
            ((this.emailAddressSubtype==null && other.getEmailAddressSubtype()==null) || 
             (this.emailAddressSubtype!=null &&
              this.emailAddressSubtype.equals(other.getEmailAddressSubtype()))) &&
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
            ((this.industryType==null && other.getIndustryType()==null) || 
             (this.industryType!=null &&
              this.industryType.equals(other.getIndustryType()))) &&
            ((this.mcSecureCodeAAV==null && other.getMcSecureCodeAAV()==null) || 
             (this.mcSecureCodeAAV!=null &&
              this.mcSecureCodeAAV.equals(other.getMcSecureCodeAAV()))) &&
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.retryTrace==null && other.getRetryTrace()==null) || 
             (this.retryTrace!=null &&
              this.retryTrace.equals(other.getRetryTrace()))) &&
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod()))) &&
            ((this.useCustomerRefNum==null && other.getUseCustomerRefNum()==null) || 
             (this.useCustomerRefNum!=null &&
              this.useCustomerRefNum.equals(other.getUseCustomerRefNum()))) &&
            ((this.useStoredAAVInd==null && other.getUseStoredAAVInd()==null) || 
             (this.useStoredAAVInd!=null &&
              this.useStoredAAVInd.equals(other.getUseStoredAAVInd()))) &&
            ((this.verifyByVisaCAVV==null && other.getVerifyByVisaCAVV()==null) || 
             (this.verifyByVisaCAVV!=null &&
              this.verifyByVisaCAVV.equals(other.getVerifyByVisaCAVV()))) &&
            ((this.verifyByVisaXID==null && other.getVerifyByVisaXID()==null) || 
             (this.verifyByVisaXID!=null &&
              this.verifyByVisaXID.equals(other.getVerifyByVisaXID())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAuthenticationECIInd() != null) {
            _hashCode += getAuthenticationECIInd().hashCode();
        }
        if (getAvsAddress1() != null) {
            _hashCode += getAvsAddress1().hashCode();
        }
        if (getAvsAddress2() != null) {
            _hashCode += getAvsAddress2().hashCode();
        }
        if (getAvsCity() != null) {
            _hashCode += getAvsCity().hashCode();
        }
        if (getAvsCountryCode() != null) {
            _hashCode += getAvsCountryCode().hashCode();
        }
        if (getAvsDestAddress1() != null) {
            _hashCode += getAvsDestAddress1().hashCode();
        }
        if (getAvsDestAddress2() != null) {
            _hashCode += getAvsDestAddress2().hashCode();
        }
        if (getAvsDestCity() != null) {
            _hashCode += getAvsDestCity().hashCode();
        }
        if (getAvsDestCountryCode() != null) {
            _hashCode += getAvsDestCountryCode().hashCode();
        }
        if (getAvsDestName() != null) {
            _hashCode += getAvsDestName().hashCode();
        }
        if (getAvsDestPhoneNum() != null) {
            _hashCode += getAvsDestPhoneNum().hashCode();
        }
        if (getAvsDestPhoneType() != null) {
            _hashCode += getAvsDestPhoneType().hashCode();
        }
        if (getAvsDestState() != null) {
            _hashCode += getAvsDestState().hashCode();
        }
        if (getAvsDestZip() != null) {
            _hashCode += getAvsDestZip().hashCode();
        }
        if (getAvsName() != null) {
            _hashCode += getAvsName().hashCode();
        }
        if (getAvsPhone() != null) {
            _hashCode += getAvsPhone().hashCode();
        }
        if (getAvsPhoneType() != null) {
            _hashCode += getAvsPhoneType().hashCode();
        }
        if (getAvsState() != null) {
            _hashCode += getAvsState().hashCode();
        }
        if (getAvsZip() != null) {
            _hashCode += getAvsZip().hashCode();
        }
        if (getBmlCustomerAnnualIncome() != null) {
            _hashCode += getBmlCustomerAnnualIncome().hashCode();
        }
        if (getBmlCustomerBirthDate() != null) {
            _hashCode += getBmlCustomerBirthDate().hashCode();
        }
        if (getBmlCustomerCheckingAccount() != null) {
            _hashCode += getBmlCustomerCheckingAccount().hashCode();
        }
        if (getBmlCustomerEmail() != null) {
            _hashCode += getBmlCustomerEmail().hashCode();
        }
        if (getBmlCustomerIP() != null) {
            _hashCode += getBmlCustomerIP().hashCode();
        }
        if (getBmlCustomerRegistrationDate() != null) {
            _hashCode += getBmlCustomerRegistrationDate().hashCode();
        }
        if (getBmlCustomerResidenceStatus() != null) {
            _hashCode += getBmlCustomerResidenceStatus().hashCode();
        }
        if (getBmlCustomerSSN() != null) {
            _hashCode += getBmlCustomerSSN().hashCode();
        }
        if (getBmlCustomerSavingsAccount() != null) {
            _hashCode += getBmlCustomerSavingsAccount().hashCode();
        }
        if (getBmlCustomerTypeFlag() != null) {
            _hashCode += getBmlCustomerTypeFlag().hashCode();
        }
        if (getBmlItemCategory() != null) {
            _hashCode += getBmlItemCategory().hashCode();
        }
        if (getBmlMerchantPromotionalCode() != null) {
            _hashCode += getBmlMerchantPromotionalCode().hashCode();
        }
        if (getBmlPreapprovalInvitationNum() != null) {
            _hashCode += getBmlPreapprovalInvitationNum().hashCode();
        }
        if (getBmlProductDeliveryType() != null) {
            _hashCode += getBmlProductDeliveryType().hashCode();
        }
        if (getBmlShippingCost() != null) {
            _hashCode += getBmlShippingCost().hashCode();
        }
        if (getBmlTNCVersion() != null) {
            _hashCode += getBmlTNCVersion().hashCode();
        }
        if (getCardBrand() != null) {
            _hashCode += getCardBrand().hashCode();
        }
        if (getCcAccountNum() != null) {
            _hashCode += getCcAccountNum().hashCode();
        }
        if (getCcCardVerifyNum() != null) {
            _hashCode += getCcCardVerifyNum().hashCode();
        }
        if (getCcCardVerifyPresenceInd() != null) {
            _hashCode += getCcCardVerifyPresenceInd().hashCode();
        }
        if (getCcExp() != null) {
            _hashCode += getCcExp().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCustomerAni() != null) {
            _hashCode += getCustomerAni().hashCode();
        }
        if (getCustomerBrowserName() != null) {
            _hashCode += getCustomerBrowserName().hashCode();
        }
        if (getCustomerEmail() != null) {
            _hashCode += getCustomerEmail().hashCode();
        }
        if (getCustomerIpAddress() != null) {
            _hashCode += getCustomerIpAddress().hashCode();
        }
        if (getDebitBillerReferenceNumber() != null) {
            _hashCode += getDebitBillerReferenceNumber().hashCode();
        }
        if (getEcpAuthMethod() != null) {
            _hashCode += getEcpAuthMethod().hashCode();
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
        if (getEcpCheckSerialNumber() != null) {
            _hashCode += getEcpCheckSerialNumber().hashCode();
        }
        if (getEcpDelvMethod() != null) {
            _hashCode += getEcpDelvMethod().hashCode();
        }
        if (getEcpImageReferenceNumber() != null) {
            _hashCode += getEcpImageReferenceNumber().hashCode();
        }
        if (getEcpTerminalCity() != null) {
            _hashCode += getEcpTerminalCity().hashCode();
        }
        if (getEcpTerminalState() != null) {
            _hashCode += getEcpTerminalState().hashCode();
        }
        if (getEmailAddressSubtype() != null) {
            _hashCode += getEmailAddressSubtype().hashCode();
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
        if (getIndustryType() != null) {
            _hashCode += getIndustryType().hashCode();
        }
        if (getMcSecureCodeAAV() != null) {
            _hashCode += getMcSecureCodeAAV().hashCode();
        }
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getRetryTrace() != null) {
            _hashCode += getRetryTrace().hashCode();
        }
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        if (getUseCustomerRefNum() != null) {
            _hashCode += getUseCustomerRefNum().hashCode();
        }
        if (getUseStoredAAVInd() != null) {
            _hashCode += getUseStoredAAVInd().hashCode();
        }
        if (getVerifyByVisaCAVV() != null) {
            _hashCode += getVerifyByVisaCAVV().hashCode();
        }
        if (getVerifyByVisaXID() != null) {
            _hashCode += getVerifyByVisaXID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseElements.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "baseElements"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationECIInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "authenticationECIInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsDestAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsDestAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsDestAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsDestAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsDestCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsDestCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsDestCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsDestCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsDestName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsDestName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsDestPhoneNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsDestPhoneNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsDestPhoneType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsDestPhoneType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsDestState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsDestState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsDestZip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsDestZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsPhoneType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsPhoneType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsZip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "avsZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlCustomerAnnualIncome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlCustomerAnnualIncome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlCustomerBirthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlCustomerBirthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlCustomerCheckingAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlCustomerCheckingAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlCustomerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlCustomerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlCustomerIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlCustomerIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlCustomerRegistrationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlCustomerRegistrationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlCustomerResidenceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlCustomerResidenceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlCustomerSSN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlCustomerSSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlCustomerSavingsAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlCustomerSavingsAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlCustomerTypeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlCustomerTypeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlItemCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlItemCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlMerchantPromotionalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlMerchantPromotionalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlPreapprovalInvitationNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlPreapprovalInvitationNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlProductDeliveryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlProductDeliveryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlShippingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlShippingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmlTNCVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bmlTNCVersion"));
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
        elemField.setFieldName("ccCardVerifyNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ccCardVerifyNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccCardVerifyPresenceInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ccCardVerifyPresenceInd"));
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
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAni");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerAni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerBrowserName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerBrowserName"));
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
        elemField.setFieldName("customerIpAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerIpAddress"));
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
        elemField.setFieldName("ecpAuthMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ecpAuthMethod"));
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
        elemField.setFieldName("ecpCheckSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ecpCheckSerialNumber"));
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
        elemField.setFieldName("ecpImageReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ecpImageReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecpTerminalCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ecpTerminalCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecpTerminalState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ecpTerminalState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddressSubtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "emailAddressSubtype"));
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
        elemField.setFieldName("industryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "industryType"));
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
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "orderID"));
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
        elemField.setFieldName("shippingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "shippingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useCustomerRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "useCustomerRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useStoredAAVInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "useStoredAAVInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifyByVisaCAVV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "verifyByVisaCAVV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifyByVisaXID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "verifyByVisaXID"));
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
