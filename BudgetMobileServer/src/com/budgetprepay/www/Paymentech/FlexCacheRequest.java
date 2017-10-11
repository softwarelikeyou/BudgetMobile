/**
 * FlexCacheRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class FlexCacheRequest  implements java.io.Serializable {
    private java.lang.String endppoint;

    private java.lang.String bin;

    private java.lang.String industryType;

    private java.lang.String orderID;

    private java.lang.String merchantID;

    private java.lang.String orbitalConnectionPassword;

    private java.lang.String orbitalConnectionUsername;

    private java.lang.String terminalID;

    private java.lang.String activationCount;

    private java.lang.String amount;

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

    private java.lang.String ccAccountNum;

    private java.lang.String ccCardVerifyNum;

    private java.lang.String comments;

    private java.lang.String customerAni;

    private java.lang.String customerBrowserName;

    private java.lang.String customerEmail;

    private java.lang.String customerIpAddress;

    private java.lang.String deviceID;

    private java.lang.String emailAddressSubtype;

    private java.lang.String employeeNumber;

    private java.lang.String encryptedMagStripeTrack2;

    private java.lang.String encryptionInd;

    private java.lang.String flexAction;

    private java.lang.String flexAutoAuthInd;

    private java.lang.String flexPartialRedemptionInd;

    private com.budgetprepay.www.Paymentech.FraudAnalysis fraudAnalysis;

    private java.lang.String keySerialNumber;

    private java.lang.String latitudeLongitude;

    private java.lang.String localDateTime;

    private java.lang.String magStripeTrack1;

    private java.lang.String magStripeTrack2;

    private java.lang.String mobileDeviceType;

    private java.lang.String politicalTimeZone;

    private java.lang.String priorAuthCd;

    private java.lang.String readerSerialNumber;

    private java.lang.String retailTransInfo;

    private java.lang.String retryTrace;

    private java.lang.String sequenceNumber;

    private java.lang.String shippingMethod;

    private java.lang.String shippingRef;

    private java.lang.String softwareID;

    private java.lang.String startAccountNum;

    private java.lang.String txRefNum;

    private java.lang.String vendorID;

    private java.lang.String version;

    public FlexCacheRequest() {
    }

    public FlexCacheRequest(
           java.lang.String endppoint,
           java.lang.String bin,
           java.lang.String industryType,
           java.lang.String orderID,
           java.lang.String merchantID,
           java.lang.String orbitalConnectionPassword,
           java.lang.String orbitalConnectionUsername,
           java.lang.String terminalID,
           java.lang.String activationCount,
           java.lang.String amount,
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
           java.lang.String ccAccountNum,
           java.lang.String ccCardVerifyNum,
           java.lang.String comments,
           java.lang.String customerAni,
           java.lang.String customerBrowserName,
           java.lang.String customerEmail,
           java.lang.String customerIpAddress,
           java.lang.String deviceID,
           java.lang.String emailAddressSubtype,
           java.lang.String employeeNumber,
           java.lang.String encryptedMagStripeTrack2,
           java.lang.String encryptionInd,
           java.lang.String flexAction,
           java.lang.String flexAutoAuthInd,
           java.lang.String flexPartialRedemptionInd,
           com.budgetprepay.www.Paymentech.FraudAnalysis fraudAnalysis,
           java.lang.String keySerialNumber,
           java.lang.String latitudeLongitude,
           java.lang.String localDateTime,
           java.lang.String magStripeTrack1,
           java.lang.String magStripeTrack2,
           java.lang.String mobileDeviceType,
           java.lang.String politicalTimeZone,
           java.lang.String priorAuthCd,
           java.lang.String readerSerialNumber,
           java.lang.String retailTransInfo,
           java.lang.String retryTrace,
           java.lang.String sequenceNumber,
           java.lang.String shippingMethod,
           java.lang.String shippingRef,
           java.lang.String softwareID,
           java.lang.String startAccountNum,
           java.lang.String txRefNum,
           java.lang.String vendorID,
           java.lang.String version) {
           this.endppoint = endppoint;
           this.bin = bin;
           this.industryType = industryType;
           this.orderID = orderID;
           this.merchantID = merchantID;
           this.orbitalConnectionPassword = orbitalConnectionPassword;
           this.orbitalConnectionUsername = orbitalConnectionUsername;
           this.terminalID = terminalID;
           this.activationCount = activationCount;
           this.amount = amount;
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
           this.ccAccountNum = ccAccountNum;
           this.ccCardVerifyNum = ccCardVerifyNum;
           this.comments = comments;
           this.customerAni = customerAni;
           this.customerBrowserName = customerBrowserName;
           this.customerEmail = customerEmail;
           this.customerIpAddress = customerIpAddress;
           this.deviceID = deviceID;
           this.emailAddressSubtype = emailAddressSubtype;
           this.employeeNumber = employeeNumber;
           this.encryptedMagStripeTrack2 = encryptedMagStripeTrack2;
           this.encryptionInd = encryptionInd;
           this.flexAction = flexAction;
           this.flexAutoAuthInd = flexAutoAuthInd;
           this.flexPartialRedemptionInd = flexPartialRedemptionInd;
           this.fraudAnalysis = fraudAnalysis;
           this.keySerialNumber = keySerialNumber;
           this.latitudeLongitude = latitudeLongitude;
           this.localDateTime = localDateTime;
           this.magStripeTrack1 = magStripeTrack1;
           this.magStripeTrack2 = magStripeTrack2;
           this.mobileDeviceType = mobileDeviceType;
           this.politicalTimeZone = politicalTimeZone;
           this.priorAuthCd = priorAuthCd;
           this.readerSerialNumber = readerSerialNumber;
           this.retailTransInfo = retailTransInfo;
           this.retryTrace = retryTrace;
           this.sequenceNumber = sequenceNumber;
           this.shippingMethod = shippingMethod;
           this.shippingRef = shippingRef;
           this.softwareID = softwareID;
           this.startAccountNum = startAccountNum;
           this.txRefNum = txRefNum;
           this.vendorID = vendorID;
           this.version = version;
    }


    /**
     * Gets the endppoint value for this FlexCacheRequest.
     * 
     * @return endppoint
     */
    public java.lang.String getEndppoint() {
        return endppoint;
    }


    /**
     * Sets the endppoint value for this FlexCacheRequest.
     * 
     * @param endppoint
     */
    public void setEndppoint(java.lang.String endppoint) {
        this.endppoint = endppoint;
    }


    /**
     * Gets the bin value for this FlexCacheRequest.
     * 
     * @return bin
     */
    public java.lang.String getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this FlexCacheRequest.
     * 
     * @param bin
     */
    public void setBin(java.lang.String bin) {
        this.bin = bin;
    }


    /**
     * Gets the industryType value for this FlexCacheRequest.
     * 
     * @return industryType
     */
    public java.lang.String getIndustryType() {
        return industryType;
    }


    /**
     * Sets the industryType value for this FlexCacheRequest.
     * 
     * @param industryType
     */
    public void setIndustryType(java.lang.String industryType) {
        this.industryType = industryType;
    }


    /**
     * Gets the orderID value for this FlexCacheRequest.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this FlexCacheRequest.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the merchantID value for this FlexCacheRequest.
     * 
     * @return merchantID
     */
    public java.lang.String getMerchantID() {
        return merchantID;
    }


    /**
     * Sets the merchantID value for this FlexCacheRequest.
     * 
     * @param merchantID
     */
    public void setMerchantID(java.lang.String merchantID) {
        this.merchantID = merchantID;
    }


    /**
     * Gets the orbitalConnectionPassword value for this FlexCacheRequest.
     * 
     * @return orbitalConnectionPassword
     */
    public java.lang.String getOrbitalConnectionPassword() {
        return orbitalConnectionPassword;
    }


    /**
     * Sets the orbitalConnectionPassword value for this FlexCacheRequest.
     * 
     * @param orbitalConnectionPassword
     */
    public void setOrbitalConnectionPassword(java.lang.String orbitalConnectionPassword) {
        this.orbitalConnectionPassword = orbitalConnectionPassword;
    }


    /**
     * Gets the orbitalConnectionUsername value for this FlexCacheRequest.
     * 
     * @return orbitalConnectionUsername
     */
    public java.lang.String getOrbitalConnectionUsername() {
        return orbitalConnectionUsername;
    }


    /**
     * Sets the orbitalConnectionUsername value for this FlexCacheRequest.
     * 
     * @param orbitalConnectionUsername
     */
    public void setOrbitalConnectionUsername(java.lang.String orbitalConnectionUsername) {
        this.orbitalConnectionUsername = orbitalConnectionUsername;
    }


    /**
     * Gets the terminalID value for this FlexCacheRequest.
     * 
     * @return terminalID
     */
    public java.lang.String getTerminalID() {
        return terminalID;
    }


    /**
     * Sets the terminalID value for this FlexCacheRequest.
     * 
     * @param terminalID
     */
    public void setTerminalID(java.lang.String terminalID) {
        this.terminalID = terminalID;
    }


    /**
     * Gets the activationCount value for this FlexCacheRequest.
     * 
     * @return activationCount
     */
    public java.lang.String getActivationCount() {
        return activationCount;
    }


    /**
     * Sets the activationCount value for this FlexCacheRequest.
     * 
     * @param activationCount
     */
    public void setActivationCount(java.lang.String activationCount) {
        this.activationCount = activationCount;
    }


    /**
     * Gets the amount value for this FlexCacheRequest.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this FlexCacheRequest.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the avsAddress1 value for this FlexCacheRequest.
     * 
     * @return avsAddress1
     */
    public java.lang.String getAvsAddress1() {
        return avsAddress1;
    }


    /**
     * Sets the avsAddress1 value for this FlexCacheRequest.
     * 
     * @param avsAddress1
     */
    public void setAvsAddress1(java.lang.String avsAddress1) {
        this.avsAddress1 = avsAddress1;
    }


    /**
     * Gets the avsAddress2 value for this FlexCacheRequest.
     * 
     * @return avsAddress2
     */
    public java.lang.String getAvsAddress2() {
        return avsAddress2;
    }


    /**
     * Sets the avsAddress2 value for this FlexCacheRequest.
     * 
     * @param avsAddress2
     */
    public void setAvsAddress2(java.lang.String avsAddress2) {
        this.avsAddress2 = avsAddress2;
    }


    /**
     * Gets the avsCity value for this FlexCacheRequest.
     * 
     * @return avsCity
     */
    public java.lang.String getAvsCity() {
        return avsCity;
    }


    /**
     * Sets the avsCity value for this FlexCacheRequest.
     * 
     * @param avsCity
     */
    public void setAvsCity(java.lang.String avsCity) {
        this.avsCity = avsCity;
    }


    /**
     * Gets the avsCountryCode value for this FlexCacheRequest.
     * 
     * @return avsCountryCode
     */
    public java.lang.String getAvsCountryCode() {
        return avsCountryCode;
    }


    /**
     * Sets the avsCountryCode value for this FlexCacheRequest.
     * 
     * @param avsCountryCode
     */
    public void setAvsCountryCode(java.lang.String avsCountryCode) {
        this.avsCountryCode = avsCountryCode;
    }


    /**
     * Gets the avsDestAddress1 value for this FlexCacheRequest.
     * 
     * @return avsDestAddress1
     */
    public java.lang.String getAvsDestAddress1() {
        return avsDestAddress1;
    }


    /**
     * Sets the avsDestAddress1 value for this FlexCacheRequest.
     * 
     * @param avsDestAddress1
     */
    public void setAvsDestAddress1(java.lang.String avsDestAddress1) {
        this.avsDestAddress1 = avsDestAddress1;
    }


    /**
     * Gets the avsDestAddress2 value for this FlexCacheRequest.
     * 
     * @return avsDestAddress2
     */
    public java.lang.String getAvsDestAddress2() {
        return avsDestAddress2;
    }


    /**
     * Sets the avsDestAddress2 value for this FlexCacheRequest.
     * 
     * @param avsDestAddress2
     */
    public void setAvsDestAddress2(java.lang.String avsDestAddress2) {
        this.avsDestAddress2 = avsDestAddress2;
    }


    /**
     * Gets the avsDestCity value for this FlexCacheRequest.
     * 
     * @return avsDestCity
     */
    public java.lang.String getAvsDestCity() {
        return avsDestCity;
    }


    /**
     * Sets the avsDestCity value for this FlexCacheRequest.
     * 
     * @param avsDestCity
     */
    public void setAvsDestCity(java.lang.String avsDestCity) {
        this.avsDestCity = avsDestCity;
    }


    /**
     * Gets the avsDestCountryCode value for this FlexCacheRequest.
     * 
     * @return avsDestCountryCode
     */
    public java.lang.String getAvsDestCountryCode() {
        return avsDestCountryCode;
    }


    /**
     * Sets the avsDestCountryCode value for this FlexCacheRequest.
     * 
     * @param avsDestCountryCode
     */
    public void setAvsDestCountryCode(java.lang.String avsDestCountryCode) {
        this.avsDestCountryCode = avsDestCountryCode;
    }


    /**
     * Gets the avsDestName value for this FlexCacheRequest.
     * 
     * @return avsDestName
     */
    public java.lang.String getAvsDestName() {
        return avsDestName;
    }


    /**
     * Sets the avsDestName value for this FlexCacheRequest.
     * 
     * @param avsDestName
     */
    public void setAvsDestName(java.lang.String avsDestName) {
        this.avsDestName = avsDestName;
    }


    /**
     * Gets the avsDestPhoneNum value for this FlexCacheRequest.
     * 
     * @return avsDestPhoneNum
     */
    public java.lang.String getAvsDestPhoneNum() {
        return avsDestPhoneNum;
    }


    /**
     * Sets the avsDestPhoneNum value for this FlexCacheRequest.
     * 
     * @param avsDestPhoneNum
     */
    public void setAvsDestPhoneNum(java.lang.String avsDestPhoneNum) {
        this.avsDestPhoneNum = avsDestPhoneNum;
    }


    /**
     * Gets the avsDestPhoneType value for this FlexCacheRequest.
     * 
     * @return avsDestPhoneType
     */
    public java.lang.String getAvsDestPhoneType() {
        return avsDestPhoneType;
    }


    /**
     * Sets the avsDestPhoneType value for this FlexCacheRequest.
     * 
     * @param avsDestPhoneType
     */
    public void setAvsDestPhoneType(java.lang.String avsDestPhoneType) {
        this.avsDestPhoneType = avsDestPhoneType;
    }


    /**
     * Gets the avsDestState value for this FlexCacheRequest.
     * 
     * @return avsDestState
     */
    public java.lang.String getAvsDestState() {
        return avsDestState;
    }


    /**
     * Sets the avsDestState value for this FlexCacheRequest.
     * 
     * @param avsDestState
     */
    public void setAvsDestState(java.lang.String avsDestState) {
        this.avsDestState = avsDestState;
    }


    /**
     * Gets the avsDestZip value for this FlexCacheRequest.
     * 
     * @return avsDestZip
     */
    public java.lang.String getAvsDestZip() {
        return avsDestZip;
    }


    /**
     * Sets the avsDestZip value for this FlexCacheRequest.
     * 
     * @param avsDestZip
     */
    public void setAvsDestZip(java.lang.String avsDestZip) {
        this.avsDestZip = avsDestZip;
    }


    /**
     * Gets the avsName value for this FlexCacheRequest.
     * 
     * @return avsName
     */
    public java.lang.String getAvsName() {
        return avsName;
    }


    /**
     * Sets the avsName value for this FlexCacheRequest.
     * 
     * @param avsName
     */
    public void setAvsName(java.lang.String avsName) {
        this.avsName = avsName;
    }


    /**
     * Gets the avsPhone value for this FlexCacheRequest.
     * 
     * @return avsPhone
     */
    public java.lang.String getAvsPhone() {
        return avsPhone;
    }


    /**
     * Sets the avsPhone value for this FlexCacheRequest.
     * 
     * @param avsPhone
     */
    public void setAvsPhone(java.lang.String avsPhone) {
        this.avsPhone = avsPhone;
    }


    /**
     * Gets the avsPhoneType value for this FlexCacheRequest.
     * 
     * @return avsPhoneType
     */
    public java.lang.String getAvsPhoneType() {
        return avsPhoneType;
    }


    /**
     * Sets the avsPhoneType value for this FlexCacheRequest.
     * 
     * @param avsPhoneType
     */
    public void setAvsPhoneType(java.lang.String avsPhoneType) {
        this.avsPhoneType = avsPhoneType;
    }


    /**
     * Gets the avsState value for this FlexCacheRequest.
     * 
     * @return avsState
     */
    public java.lang.String getAvsState() {
        return avsState;
    }


    /**
     * Sets the avsState value for this FlexCacheRequest.
     * 
     * @param avsState
     */
    public void setAvsState(java.lang.String avsState) {
        this.avsState = avsState;
    }


    /**
     * Gets the avsZip value for this FlexCacheRequest.
     * 
     * @return avsZip
     */
    public java.lang.String getAvsZip() {
        return avsZip;
    }


    /**
     * Sets the avsZip value for this FlexCacheRequest.
     * 
     * @param avsZip
     */
    public void setAvsZip(java.lang.String avsZip) {
        this.avsZip = avsZip;
    }


    /**
     * Gets the ccAccountNum value for this FlexCacheRequest.
     * 
     * @return ccAccountNum
     */
    public java.lang.String getCcAccountNum() {
        return ccAccountNum;
    }


    /**
     * Sets the ccAccountNum value for this FlexCacheRequest.
     * 
     * @param ccAccountNum
     */
    public void setCcAccountNum(java.lang.String ccAccountNum) {
        this.ccAccountNum = ccAccountNum;
    }


    /**
     * Gets the ccCardVerifyNum value for this FlexCacheRequest.
     * 
     * @return ccCardVerifyNum
     */
    public java.lang.String getCcCardVerifyNum() {
        return ccCardVerifyNum;
    }


    /**
     * Sets the ccCardVerifyNum value for this FlexCacheRequest.
     * 
     * @param ccCardVerifyNum
     */
    public void setCcCardVerifyNum(java.lang.String ccCardVerifyNum) {
        this.ccCardVerifyNum = ccCardVerifyNum;
    }


    /**
     * Gets the comments value for this FlexCacheRequest.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this FlexCacheRequest.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the customerAni value for this FlexCacheRequest.
     * 
     * @return customerAni
     */
    public java.lang.String getCustomerAni() {
        return customerAni;
    }


    /**
     * Sets the customerAni value for this FlexCacheRequest.
     * 
     * @param customerAni
     */
    public void setCustomerAni(java.lang.String customerAni) {
        this.customerAni = customerAni;
    }


    /**
     * Gets the customerBrowserName value for this FlexCacheRequest.
     * 
     * @return customerBrowserName
     */
    public java.lang.String getCustomerBrowserName() {
        return customerBrowserName;
    }


    /**
     * Sets the customerBrowserName value for this FlexCacheRequest.
     * 
     * @param customerBrowserName
     */
    public void setCustomerBrowserName(java.lang.String customerBrowserName) {
        this.customerBrowserName = customerBrowserName;
    }


    /**
     * Gets the customerEmail value for this FlexCacheRequest.
     * 
     * @return customerEmail
     */
    public java.lang.String getCustomerEmail() {
        return customerEmail;
    }


    /**
     * Sets the customerEmail value for this FlexCacheRequest.
     * 
     * @param customerEmail
     */
    public void setCustomerEmail(java.lang.String customerEmail) {
        this.customerEmail = customerEmail;
    }


    /**
     * Gets the customerIpAddress value for this FlexCacheRequest.
     * 
     * @return customerIpAddress
     */
    public java.lang.String getCustomerIpAddress() {
        return customerIpAddress;
    }


    /**
     * Sets the customerIpAddress value for this FlexCacheRequest.
     * 
     * @param customerIpAddress
     */
    public void setCustomerIpAddress(java.lang.String customerIpAddress) {
        this.customerIpAddress = customerIpAddress;
    }


    /**
     * Gets the deviceID value for this FlexCacheRequest.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this FlexCacheRequest.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the emailAddressSubtype value for this FlexCacheRequest.
     * 
     * @return emailAddressSubtype
     */
    public java.lang.String getEmailAddressSubtype() {
        return emailAddressSubtype;
    }


    /**
     * Sets the emailAddressSubtype value for this FlexCacheRequest.
     * 
     * @param emailAddressSubtype
     */
    public void setEmailAddressSubtype(java.lang.String emailAddressSubtype) {
        this.emailAddressSubtype = emailAddressSubtype;
    }


    /**
     * Gets the employeeNumber value for this FlexCacheRequest.
     * 
     * @return employeeNumber
     */
    public java.lang.String getEmployeeNumber() {
        return employeeNumber;
    }


    /**
     * Sets the employeeNumber value for this FlexCacheRequest.
     * 
     * @param employeeNumber
     */
    public void setEmployeeNumber(java.lang.String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }


    /**
     * Gets the encryptedMagStripeTrack2 value for this FlexCacheRequest.
     * 
     * @return encryptedMagStripeTrack2
     */
    public java.lang.String getEncryptedMagStripeTrack2() {
        return encryptedMagStripeTrack2;
    }


    /**
     * Sets the encryptedMagStripeTrack2 value for this FlexCacheRequest.
     * 
     * @param encryptedMagStripeTrack2
     */
    public void setEncryptedMagStripeTrack2(java.lang.String encryptedMagStripeTrack2) {
        this.encryptedMagStripeTrack2 = encryptedMagStripeTrack2;
    }


    /**
     * Gets the encryptionInd value for this FlexCacheRequest.
     * 
     * @return encryptionInd
     */
    public java.lang.String getEncryptionInd() {
        return encryptionInd;
    }


    /**
     * Sets the encryptionInd value for this FlexCacheRequest.
     * 
     * @param encryptionInd
     */
    public void setEncryptionInd(java.lang.String encryptionInd) {
        this.encryptionInd = encryptionInd;
    }


    /**
     * Gets the flexAction value for this FlexCacheRequest.
     * 
     * @return flexAction
     */
    public java.lang.String getFlexAction() {
        return flexAction;
    }


    /**
     * Sets the flexAction value for this FlexCacheRequest.
     * 
     * @param flexAction
     */
    public void setFlexAction(java.lang.String flexAction) {
        this.flexAction = flexAction;
    }


    /**
     * Gets the flexAutoAuthInd value for this FlexCacheRequest.
     * 
     * @return flexAutoAuthInd
     */
    public java.lang.String getFlexAutoAuthInd() {
        return flexAutoAuthInd;
    }


    /**
     * Sets the flexAutoAuthInd value for this FlexCacheRequest.
     * 
     * @param flexAutoAuthInd
     */
    public void setFlexAutoAuthInd(java.lang.String flexAutoAuthInd) {
        this.flexAutoAuthInd = flexAutoAuthInd;
    }


    /**
     * Gets the flexPartialRedemptionInd value for this FlexCacheRequest.
     * 
     * @return flexPartialRedemptionInd
     */
    public java.lang.String getFlexPartialRedemptionInd() {
        return flexPartialRedemptionInd;
    }


    /**
     * Sets the flexPartialRedemptionInd value for this FlexCacheRequest.
     * 
     * @param flexPartialRedemptionInd
     */
    public void setFlexPartialRedemptionInd(java.lang.String flexPartialRedemptionInd) {
        this.flexPartialRedemptionInd = flexPartialRedemptionInd;
    }


    /**
     * Gets the fraudAnalysis value for this FlexCacheRequest.
     * 
     * @return fraudAnalysis
     */
    public com.budgetprepay.www.Paymentech.FraudAnalysis getFraudAnalysis() {
        return fraudAnalysis;
    }


    /**
     * Sets the fraudAnalysis value for this FlexCacheRequest.
     * 
     * @param fraudAnalysis
     */
    public void setFraudAnalysis(com.budgetprepay.www.Paymentech.FraudAnalysis fraudAnalysis) {
        this.fraudAnalysis = fraudAnalysis;
    }


    /**
     * Gets the keySerialNumber value for this FlexCacheRequest.
     * 
     * @return keySerialNumber
     */
    public java.lang.String getKeySerialNumber() {
        return keySerialNumber;
    }


    /**
     * Sets the keySerialNumber value for this FlexCacheRequest.
     * 
     * @param keySerialNumber
     */
    public void setKeySerialNumber(java.lang.String keySerialNumber) {
        this.keySerialNumber = keySerialNumber;
    }


    /**
     * Gets the latitudeLongitude value for this FlexCacheRequest.
     * 
     * @return latitudeLongitude
     */
    public java.lang.String getLatitudeLongitude() {
        return latitudeLongitude;
    }


    /**
     * Sets the latitudeLongitude value for this FlexCacheRequest.
     * 
     * @param latitudeLongitude
     */
    public void setLatitudeLongitude(java.lang.String latitudeLongitude) {
        this.latitudeLongitude = latitudeLongitude;
    }


    /**
     * Gets the localDateTime value for this FlexCacheRequest.
     * 
     * @return localDateTime
     */
    public java.lang.String getLocalDateTime() {
        return localDateTime;
    }


    /**
     * Sets the localDateTime value for this FlexCacheRequest.
     * 
     * @param localDateTime
     */
    public void setLocalDateTime(java.lang.String localDateTime) {
        this.localDateTime = localDateTime;
    }


    /**
     * Gets the magStripeTrack1 value for this FlexCacheRequest.
     * 
     * @return magStripeTrack1
     */
    public java.lang.String getMagStripeTrack1() {
        return magStripeTrack1;
    }


    /**
     * Sets the magStripeTrack1 value for this FlexCacheRequest.
     * 
     * @param magStripeTrack1
     */
    public void setMagStripeTrack1(java.lang.String magStripeTrack1) {
        this.magStripeTrack1 = magStripeTrack1;
    }


    /**
     * Gets the magStripeTrack2 value for this FlexCacheRequest.
     * 
     * @return magStripeTrack2
     */
    public java.lang.String getMagStripeTrack2() {
        return magStripeTrack2;
    }


    /**
     * Sets the magStripeTrack2 value for this FlexCacheRequest.
     * 
     * @param magStripeTrack2
     */
    public void setMagStripeTrack2(java.lang.String magStripeTrack2) {
        this.magStripeTrack2 = magStripeTrack2;
    }


    /**
     * Gets the mobileDeviceType value for this FlexCacheRequest.
     * 
     * @return mobileDeviceType
     */
    public java.lang.String getMobileDeviceType() {
        return mobileDeviceType;
    }


    /**
     * Sets the mobileDeviceType value for this FlexCacheRequest.
     * 
     * @param mobileDeviceType
     */
    public void setMobileDeviceType(java.lang.String mobileDeviceType) {
        this.mobileDeviceType = mobileDeviceType;
    }


    /**
     * Gets the politicalTimeZone value for this FlexCacheRequest.
     * 
     * @return politicalTimeZone
     */
    public java.lang.String getPoliticalTimeZone() {
        return politicalTimeZone;
    }


    /**
     * Sets the politicalTimeZone value for this FlexCacheRequest.
     * 
     * @param politicalTimeZone
     */
    public void setPoliticalTimeZone(java.lang.String politicalTimeZone) {
        this.politicalTimeZone = politicalTimeZone;
    }


    /**
     * Gets the priorAuthCd value for this FlexCacheRequest.
     * 
     * @return priorAuthCd
     */
    public java.lang.String getPriorAuthCd() {
        return priorAuthCd;
    }


    /**
     * Sets the priorAuthCd value for this FlexCacheRequest.
     * 
     * @param priorAuthCd
     */
    public void setPriorAuthCd(java.lang.String priorAuthCd) {
        this.priorAuthCd = priorAuthCd;
    }


    /**
     * Gets the readerSerialNumber value for this FlexCacheRequest.
     * 
     * @return readerSerialNumber
     */
    public java.lang.String getReaderSerialNumber() {
        return readerSerialNumber;
    }


    /**
     * Sets the readerSerialNumber value for this FlexCacheRequest.
     * 
     * @param readerSerialNumber
     */
    public void setReaderSerialNumber(java.lang.String readerSerialNumber) {
        this.readerSerialNumber = readerSerialNumber;
    }


    /**
     * Gets the retailTransInfo value for this FlexCacheRequest.
     * 
     * @return retailTransInfo
     */
    public java.lang.String getRetailTransInfo() {
        return retailTransInfo;
    }


    /**
     * Sets the retailTransInfo value for this FlexCacheRequest.
     * 
     * @param retailTransInfo
     */
    public void setRetailTransInfo(java.lang.String retailTransInfo) {
        this.retailTransInfo = retailTransInfo;
    }


    /**
     * Gets the retryTrace value for this FlexCacheRequest.
     * 
     * @return retryTrace
     */
    public java.lang.String getRetryTrace() {
        return retryTrace;
    }


    /**
     * Sets the retryTrace value for this FlexCacheRequest.
     * 
     * @param retryTrace
     */
    public void setRetryTrace(java.lang.String retryTrace) {
        this.retryTrace = retryTrace;
    }


    /**
     * Gets the sequenceNumber value for this FlexCacheRequest.
     * 
     * @return sequenceNumber
     */
    public java.lang.String getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this FlexCacheRequest.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(java.lang.String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the shippingMethod value for this FlexCacheRequest.
     * 
     * @return shippingMethod
     */
    public java.lang.String getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this FlexCacheRequest.
     * 
     * @param shippingMethod
     */
    public void setShippingMethod(java.lang.String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the shippingRef value for this FlexCacheRequest.
     * 
     * @return shippingRef
     */
    public java.lang.String getShippingRef() {
        return shippingRef;
    }


    /**
     * Sets the shippingRef value for this FlexCacheRequest.
     * 
     * @param shippingRef
     */
    public void setShippingRef(java.lang.String shippingRef) {
        this.shippingRef = shippingRef;
    }


    /**
     * Gets the softwareID value for this FlexCacheRequest.
     * 
     * @return softwareID
     */
    public java.lang.String getSoftwareID() {
        return softwareID;
    }


    /**
     * Sets the softwareID value for this FlexCacheRequest.
     * 
     * @param softwareID
     */
    public void setSoftwareID(java.lang.String softwareID) {
        this.softwareID = softwareID;
    }


    /**
     * Gets the startAccountNum value for this FlexCacheRequest.
     * 
     * @return startAccountNum
     */
    public java.lang.String getStartAccountNum() {
        return startAccountNum;
    }


    /**
     * Sets the startAccountNum value for this FlexCacheRequest.
     * 
     * @param startAccountNum
     */
    public void setStartAccountNum(java.lang.String startAccountNum) {
        this.startAccountNum = startAccountNum;
    }


    /**
     * Gets the txRefNum value for this FlexCacheRequest.
     * 
     * @return txRefNum
     */
    public java.lang.String getTxRefNum() {
        return txRefNum;
    }


    /**
     * Sets the txRefNum value for this FlexCacheRequest.
     * 
     * @param txRefNum
     */
    public void setTxRefNum(java.lang.String txRefNum) {
        this.txRefNum = txRefNum;
    }


    /**
     * Gets the vendorID value for this FlexCacheRequest.
     * 
     * @return vendorID
     */
    public java.lang.String getVendorID() {
        return vendorID;
    }


    /**
     * Sets the vendorID value for this FlexCacheRequest.
     * 
     * @param vendorID
     */
    public void setVendorID(java.lang.String vendorID) {
        this.vendorID = vendorID;
    }


    /**
     * Gets the version value for this FlexCacheRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this FlexCacheRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlexCacheRequest)) return false;
        FlexCacheRequest other = (FlexCacheRequest) obj;
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
            ((this.industryType==null && other.getIndustryType()==null) || 
             (this.industryType!=null &&
              this.industryType.equals(other.getIndustryType()))) &&
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.merchantID==null && other.getMerchantID()==null) || 
             (this.merchantID!=null &&
              this.merchantID.equals(other.getMerchantID()))) &&
            ((this.orbitalConnectionPassword==null && other.getOrbitalConnectionPassword()==null) || 
             (this.orbitalConnectionPassword!=null &&
              this.orbitalConnectionPassword.equals(other.getOrbitalConnectionPassword()))) &&
            ((this.orbitalConnectionUsername==null && other.getOrbitalConnectionUsername()==null) || 
             (this.orbitalConnectionUsername!=null &&
              this.orbitalConnectionUsername.equals(other.getOrbitalConnectionUsername()))) &&
            ((this.terminalID==null && other.getTerminalID()==null) || 
             (this.terminalID!=null &&
              this.terminalID.equals(other.getTerminalID()))) &&
            ((this.activationCount==null && other.getActivationCount()==null) || 
             (this.activationCount!=null &&
              this.activationCount.equals(other.getActivationCount()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
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
            ((this.ccAccountNum==null && other.getCcAccountNum()==null) || 
             (this.ccAccountNum!=null &&
              this.ccAccountNum.equals(other.getCcAccountNum()))) &&
            ((this.ccCardVerifyNum==null && other.getCcCardVerifyNum()==null) || 
             (this.ccCardVerifyNum!=null &&
              this.ccCardVerifyNum.equals(other.getCcCardVerifyNum()))) &&
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
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.emailAddressSubtype==null && other.getEmailAddressSubtype()==null) || 
             (this.emailAddressSubtype!=null &&
              this.emailAddressSubtype.equals(other.getEmailAddressSubtype()))) &&
            ((this.employeeNumber==null && other.getEmployeeNumber()==null) || 
             (this.employeeNumber!=null &&
              this.employeeNumber.equals(other.getEmployeeNumber()))) &&
            ((this.encryptedMagStripeTrack2==null && other.getEncryptedMagStripeTrack2()==null) || 
             (this.encryptedMagStripeTrack2!=null &&
              this.encryptedMagStripeTrack2.equals(other.getEncryptedMagStripeTrack2()))) &&
            ((this.encryptionInd==null && other.getEncryptionInd()==null) || 
             (this.encryptionInd!=null &&
              this.encryptionInd.equals(other.getEncryptionInd()))) &&
            ((this.flexAction==null && other.getFlexAction()==null) || 
             (this.flexAction!=null &&
              this.flexAction.equals(other.getFlexAction()))) &&
            ((this.flexAutoAuthInd==null && other.getFlexAutoAuthInd()==null) || 
             (this.flexAutoAuthInd!=null &&
              this.flexAutoAuthInd.equals(other.getFlexAutoAuthInd()))) &&
            ((this.flexPartialRedemptionInd==null && other.getFlexPartialRedemptionInd()==null) || 
             (this.flexPartialRedemptionInd!=null &&
              this.flexPartialRedemptionInd.equals(other.getFlexPartialRedemptionInd()))) &&
            ((this.fraudAnalysis==null && other.getFraudAnalysis()==null) || 
             (this.fraudAnalysis!=null &&
              this.fraudAnalysis.equals(other.getFraudAnalysis()))) &&
            ((this.keySerialNumber==null && other.getKeySerialNumber()==null) || 
             (this.keySerialNumber!=null &&
              this.keySerialNumber.equals(other.getKeySerialNumber()))) &&
            ((this.latitudeLongitude==null && other.getLatitudeLongitude()==null) || 
             (this.latitudeLongitude!=null &&
              this.latitudeLongitude.equals(other.getLatitudeLongitude()))) &&
            ((this.localDateTime==null && other.getLocalDateTime()==null) || 
             (this.localDateTime!=null &&
              this.localDateTime.equals(other.getLocalDateTime()))) &&
            ((this.magStripeTrack1==null && other.getMagStripeTrack1()==null) || 
             (this.magStripeTrack1!=null &&
              this.magStripeTrack1.equals(other.getMagStripeTrack1()))) &&
            ((this.magStripeTrack2==null && other.getMagStripeTrack2()==null) || 
             (this.magStripeTrack2!=null &&
              this.magStripeTrack2.equals(other.getMagStripeTrack2()))) &&
            ((this.mobileDeviceType==null && other.getMobileDeviceType()==null) || 
             (this.mobileDeviceType!=null &&
              this.mobileDeviceType.equals(other.getMobileDeviceType()))) &&
            ((this.politicalTimeZone==null && other.getPoliticalTimeZone()==null) || 
             (this.politicalTimeZone!=null &&
              this.politicalTimeZone.equals(other.getPoliticalTimeZone()))) &&
            ((this.priorAuthCd==null && other.getPriorAuthCd()==null) || 
             (this.priorAuthCd!=null &&
              this.priorAuthCd.equals(other.getPriorAuthCd()))) &&
            ((this.readerSerialNumber==null && other.getReaderSerialNumber()==null) || 
             (this.readerSerialNumber!=null &&
              this.readerSerialNumber.equals(other.getReaderSerialNumber()))) &&
            ((this.retailTransInfo==null && other.getRetailTransInfo()==null) || 
             (this.retailTransInfo!=null &&
              this.retailTransInfo.equals(other.getRetailTransInfo()))) &&
            ((this.retryTrace==null && other.getRetryTrace()==null) || 
             (this.retryTrace!=null &&
              this.retryTrace.equals(other.getRetryTrace()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod()))) &&
            ((this.shippingRef==null && other.getShippingRef()==null) || 
             (this.shippingRef!=null &&
              this.shippingRef.equals(other.getShippingRef()))) &&
            ((this.softwareID==null && other.getSoftwareID()==null) || 
             (this.softwareID!=null &&
              this.softwareID.equals(other.getSoftwareID()))) &&
            ((this.startAccountNum==null && other.getStartAccountNum()==null) || 
             (this.startAccountNum!=null &&
              this.startAccountNum.equals(other.getStartAccountNum()))) &&
            ((this.txRefNum==null && other.getTxRefNum()==null) || 
             (this.txRefNum!=null &&
              this.txRefNum.equals(other.getTxRefNum()))) &&
            ((this.vendorID==null && other.getVendorID()==null) || 
             (this.vendorID!=null &&
              this.vendorID.equals(other.getVendorID()))) &&
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
        if (getIndustryType() != null) {
            _hashCode += getIndustryType().hashCode();
        }
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
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
        if (getTerminalID() != null) {
            _hashCode += getTerminalID().hashCode();
        }
        if (getActivationCount() != null) {
            _hashCode += getActivationCount().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
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
        if (getCcAccountNum() != null) {
            _hashCode += getCcAccountNum().hashCode();
        }
        if (getCcCardVerifyNum() != null) {
            _hashCode += getCcCardVerifyNum().hashCode();
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
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getEmailAddressSubtype() != null) {
            _hashCode += getEmailAddressSubtype().hashCode();
        }
        if (getEmployeeNumber() != null) {
            _hashCode += getEmployeeNumber().hashCode();
        }
        if (getEncryptedMagStripeTrack2() != null) {
            _hashCode += getEncryptedMagStripeTrack2().hashCode();
        }
        if (getEncryptionInd() != null) {
            _hashCode += getEncryptionInd().hashCode();
        }
        if (getFlexAction() != null) {
            _hashCode += getFlexAction().hashCode();
        }
        if (getFlexAutoAuthInd() != null) {
            _hashCode += getFlexAutoAuthInd().hashCode();
        }
        if (getFlexPartialRedemptionInd() != null) {
            _hashCode += getFlexPartialRedemptionInd().hashCode();
        }
        if (getFraudAnalysis() != null) {
            _hashCode += getFraudAnalysis().hashCode();
        }
        if (getKeySerialNumber() != null) {
            _hashCode += getKeySerialNumber().hashCode();
        }
        if (getLatitudeLongitude() != null) {
            _hashCode += getLatitudeLongitude().hashCode();
        }
        if (getLocalDateTime() != null) {
            _hashCode += getLocalDateTime().hashCode();
        }
        if (getMagStripeTrack1() != null) {
            _hashCode += getMagStripeTrack1().hashCode();
        }
        if (getMagStripeTrack2() != null) {
            _hashCode += getMagStripeTrack2().hashCode();
        }
        if (getMobileDeviceType() != null) {
            _hashCode += getMobileDeviceType().hashCode();
        }
        if (getPoliticalTimeZone() != null) {
            _hashCode += getPoliticalTimeZone().hashCode();
        }
        if (getPriorAuthCd() != null) {
            _hashCode += getPriorAuthCd().hashCode();
        }
        if (getReaderSerialNumber() != null) {
            _hashCode += getReaderSerialNumber().hashCode();
        }
        if (getRetailTransInfo() != null) {
            _hashCode += getRetailTransInfo().hashCode();
        }
        if (getRetryTrace() != null) {
            _hashCode += getRetryTrace().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        if (getShippingRef() != null) {
            _hashCode += getShippingRef().hashCode();
        }
        if (getSoftwareID() != null) {
            _hashCode += getSoftwareID().hashCode();
        }
        if (getStartAccountNum() != null) {
            _hashCode += getStartAccountNum().hashCode();
        }
        if (getTxRefNum() != null) {
            _hashCode += getTxRefNum().hashCode();
        }
        if (getVendorID() != null) {
            _hashCode += getVendorID().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlexCacheRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "FlexCacheRequest"));
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
        elemField.setFieldName("industryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "industryType"));
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
        elemField.setFieldName("terminalID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "terminalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "activationCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "amount"));
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
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "deviceID"));
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
        elemField.setFieldName("employeeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "employeeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedMagStripeTrack2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "encryptedMagStripeTrack2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "encryptionInd"));
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
        elemField.setFieldName("flexAutoAuthInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "flexAutoAuthInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexPartialRedemptionInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "flexPartialRedemptionInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudAnalysis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "fraudAnalysis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "fraudAnalysis"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keySerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "keySerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitudeLongitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "latitudeLongitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "localDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("magStripeTrack1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "magStripeTrack1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("magStripeTrack2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "magStripeTrack2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileDeviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mobileDeviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("politicalTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "politicalTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorAuthCd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "priorAuthCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readerSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "readerSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retailTransInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "retailTransInfo"));
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
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "sequenceNumber"));
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
        elemField.setFieldName("shippingRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "shippingRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softwareID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "softwareID"));
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
        elemField.setFieldName("txRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "txRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "vendorID"));
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
