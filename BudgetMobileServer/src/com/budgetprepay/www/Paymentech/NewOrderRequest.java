/**
 * NewOrderRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class NewOrderRequest  implements java.io.Serializable {
    private java.lang.String endppoint;

    private java.lang.String bin;

    private java.lang.String industryType;

    private java.lang.String orderID;

    private java.lang.String merchantID;

    private java.lang.String orbitalConnectionPassword;

    private java.lang.String orbitalConnectionUsername;

    private java.lang.String terminalID;

    private java.lang.String transType;

    private java.lang.String amount;

    private java.lang.String ccAccountNum;

    private java.lang.String ccExp;

    private java.lang.String comments;

    private java.lang.String PCard3AltTaxAmt;

    private java.lang.String PCard3AltTaxInd;

    private java.lang.String PCard3DestCountryCd;

    private java.lang.String PCard3DiscAmt;

    private java.lang.String PCard3DutyAmt;

    private java.lang.String PCard3FreightAmt;

    private java.lang.String PCard3LineItemCount;

    private com.budgetprepay.www.Paymentech.PCard3LineItems[] PCard3LineItems;

    private java.lang.String PCard3ShipFromZip;

    private java.lang.String PCard3VATtaxAmt;

    private java.lang.String PCard3VATtaxRate;

    private java.lang.String PCardDestAddress;

    private java.lang.String PCardDestAddress2;

    private java.lang.String PCardDestCity;

    private java.lang.String PCardDestName;

    private java.lang.String PCardDestStateCd;

    private java.lang.String PCardDestZip;

    private java.lang.String PCardOrderID;

    private java.lang.String accountUpdaterEligibility;

    private java.lang.String addProfileFromOrder;

    private java.lang.String amexTranAdvAddn1;

    private java.lang.String amexTranAdvAddn2;

    private java.lang.String amexTranAdvAddn3;

    private java.lang.String amexTranAdvAddn4;

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

    private java.lang.String cardIndicators;

    private java.lang.String cardPresentInd;

    private java.lang.String ccCardVerifyNum;

    private java.lang.String ccCardVerifyPresenceInd;

    private java.lang.String customerAni;

    private java.lang.String customerBrowserName;

    private java.lang.String customerEmail;

    private java.lang.String customerIpAddress;

    private java.lang.String customerName;

    private java.lang.String customerPhone;

    private java.lang.String customerRefNum;

    private java.lang.String debitBillerReferenceNumber;

    private java.lang.String debitPinCashBack;

    private java.lang.String debitPinNumber;

    private java.lang.String debitPinSecurityControl;

    private java.lang.String deviceID;

    private java.lang.String ecpActionCode;

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

    private java.lang.String encryptedMagStripeTrack2;

    private java.lang.String encryptedPan;

    private java.lang.String encryptedPanHash;

    private java.lang.String encryptedPanKey;

    private java.lang.String encryptedPanMethod;

    private java.lang.String encryptedPanPublicKeyFingerPrint;

    private java.lang.String encryptionInd;

    private java.lang.String euddBankSortCode;

    private java.lang.String euddCountryCode;

    private java.lang.String euddRibCode;

    private com.budgetprepay.www.Paymentech.FraudAnalysis fraudAnalysis;

    private java.lang.String keySerialNumber;

    private java.lang.String latitudeLongitude;

    private java.lang.String localDateTime;

    private java.lang.String magStripeTrack1;

    private java.lang.String magStripeTrack2;

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

    private java.lang.String mbType;

    private java.lang.String mcSecureCodeAAV;

    private java.lang.String mobileDeviceType;

    private java.lang.String partialAuthInd;

    private java.lang.String politicalTimeZone;

    private java.lang.String priorAuthCd;

    private java.lang.String profileOrderOverideInd;

    private java.lang.String readerSerialNumber;

    private java.lang.String recurringInd;

    private java.lang.String retailTransInfo;

    private java.lang.String retryTrace;

    private java.lang.String shippingMethod;

    private java.lang.String shippingRef;

    private java.lang.String softDescMercCity;

    private java.lang.String softDescMercEmail;

    private java.lang.String softDescMercName;

    private java.lang.String softDescMercPhone;

    private java.lang.String softDescMercURL;

    private java.lang.String softDescProdDesc;

    private com.budgetprepay.www.Paymentech.SoftMerchantDescriptors softMerchantDescriptors;

    private java.lang.String softwareID;

    private java.lang.String switchSoloCardStartDate;

    private java.lang.String switchSoloIssueNum;

    private java.lang.String taxAmount;

    private java.lang.String taxInd;

    private java.lang.String txRefNum;

    private java.lang.String useCustomerRefNum;

    private java.lang.String useStoredAAVInd;

    private java.lang.String vendorID;

    private java.lang.String verifyByVisaCAVV;

    private java.lang.String verifyByVisaXID;

    private java.lang.String version;

    public NewOrderRequest() {
    }

    public NewOrderRequest(
           java.lang.String endppoint,
           java.lang.String bin,
           java.lang.String industryType,
           java.lang.String orderID,
           java.lang.String merchantID,
           java.lang.String orbitalConnectionPassword,
           java.lang.String orbitalConnectionUsername,
           java.lang.String terminalID,
           java.lang.String transType,
           java.lang.String amount,
           java.lang.String ccAccountNum,
           java.lang.String ccExp,
           java.lang.String comments,
           java.lang.String PCard3AltTaxAmt,
           java.lang.String PCard3AltTaxInd,
           java.lang.String PCard3DestCountryCd,
           java.lang.String PCard3DiscAmt,
           java.lang.String PCard3DutyAmt,
           java.lang.String PCard3FreightAmt,
           java.lang.String PCard3LineItemCount,
           com.budgetprepay.www.Paymentech.PCard3LineItems[] PCard3LineItems,
           java.lang.String PCard3ShipFromZip,
           java.lang.String PCard3VATtaxAmt,
           java.lang.String PCard3VATtaxRate,
           java.lang.String PCardDestAddress,
           java.lang.String PCardDestAddress2,
           java.lang.String PCardDestCity,
           java.lang.String PCardDestName,
           java.lang.String PCardDestStateCd,
           java.lang.String PCardDestZip,
           java.lang.String PCardOrderID,
           java.lang.String accountUpdaterEligibility,
           java.lang.String addProfileFromOrder,
           java.lang.String amexTranAdvAddn1,
           java.lang.String amexTranAdvAddn2,
           java.lang.String amexTranAdvAddn3,
           java.lang.String amexTranAdvAddn4,
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
           java.lang.String cardIndicators,
           java.lang.String cardPresentInd,
           java.lang.String ccCardVerifyNum,
           java.lang.String ccCardVerifyPresenceInd,
           java.lang.String customerAni,
           java.lang.String customerBrowserName,
           java.lang.String customerEmail,
           java.lang.String customerIpAddress,
           java.lang.String customerName,
           java.lang.String customerPhone,
           java.lang.String customerRefNum,
           java.lang.String debitBillerReferenceNumber,
           java.lang.String debitPinCashBack,
           java.lang.String debitPinNumber,
           java.lang.String debitPinSecurityControl,
           java.lang.String deviceID,
           java.lang.String ecpActionCode,
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
           java.lang.String encryptedMagStripeTrack2,
           java.lang.String encryptedPan,
           java.lang.String encryptedPanHash,
           java.lang.String encryptedPanKey,
           java.lang.String encryptedPanMethod,
           java.lang.String encryptedPanPublicKeyFingerPrint,
           java.lang.String encryptionInd,
           java.lang.String euddBankSortCode,
           java.lang.String euddCountryCode,
           java.lang.String euddRibCode,
           com.budgetprepay.www.Paymentech.FraudAnalysis fraudAnalysis,
           java.lang.String keySerialNumber,
           java.lang.String latitudeLongitude,
           java.lang.String localDateTime,
           java.lang.String magStripeTrack1,
           java.lang.String magStripeTrack2,
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
           java.lang.String mbType,
           java.lang.String mcSecureCodeAAV,
           java.lang.String mobileDeviceType,
           java.lang.String partialAuthInd,
           java.lang.String politicalTimeZone,
           java.lang.String priorAuthCd,
           java.lang.String profileOrderOverideInd,
           java.lang.String readerSerialNumber,
           java.lang.String recurringInd,
           java.lang.String retailTransInfo,
           java.lang.String retryTrace,
           java.lang.String shippingMethod,
           java.lang.String shippingRef,
           java.lang.String softDescMercCity,
           java.lang.String softDescMercEmail,
           java.lang.String softDescMercName,
           java.lang.String softDescMercPhone,
           java.lang.String softDescMercURL,
           java.lang.String softDescProdDesc,
           com.budgetprepay.www.Paymentech.SoftMerchantDescriptors softMerchantDescriptors,
           java.lang.String softwareID,
           java.lang.String switchSoloCardStartDate,
           java.lang.String switchSoloIssueNum,
           java.lang.String taxAmount,
           java.lang.String taxInd,
           java.lang.String txRefNum,
           java.lang.String useCustomerRefNum,
           java.lang.String useStoredAAVInd,
           java.lang.String vendorID,
           java.lang.String verifyByVisaCAVV,
           java.lang.String verifyByVisaXID,
           java.lang.String version) {
           this.endppoint = endppoint;
           this.bin = bin;
           this.industryType = industryType;
           this.orderID = orderID;
           this.merchantID = merchantID;
           this.orbitalConnectionPassword = orbitalConnectionPassword;
           this.orbitalConnectionUsername = orbitalConnectionUsername;
           this.terminalID = terminalID;
           this.transType = transType;
           this.amount = amount;
           this.ccAccountNum = ccAccountNum;
           this.ccExp = ccExp;
           this.comments = comments;
           this.PCard3AltTaxAmt = PCard3AltTaxAmt;
           this.PCard3AltTaxInd = PCard3AltTaxInd;
           this.PCard3DestCountryCd = PCard3DestCountryCd;
           this.PCard3DiscAmt = PCard3DiscAmt;
           this.PCard3DutyAmt = PCard3DutyAmt;
           this.PCard3FreightAmt = PCard3FreightAmt;
           this.PCard3LineItemCount = PCard3LineItemCount;
           this.PCard3LineItems = PCard3LineItems;
           this.PCard3ShipFromZip = PCard3ShipFromZip;
           this.PCard3VATtaxAmt = PCard3VATtaxAmt;
           this.PCard3VATtaxRate = PCard3VATtaxRate;
           this.PCardDestAddress = PCardDestAddress;
           this.PCardDestAddress2 = PCardDestAddress2;
           this.PCardDestCity = PCardDestCity;
           this.PCardDestName = PCardDestName;
           this.PCardDestStateCd = PCardDestStateCd;
           this.PCardDestZip = PCardDestZip;
           this.PCardOrderID = PCardOrderID;
           this.accountUpdaterEligibility = accountUpdaterEligibility;
           this.addProfileFromOrder = addProfileFromOrder;
           this.amexTranAdvAddn1 = amexTranAdvAddn1;
           this.amexTranAdvAddn2 = amexTranAdvAddn2;
           this.amexTranAdvAddn3 = amexTranAdvAddn3;
           this.amexTranAdvAddn4 = amexTranAdvAddn4;
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
           this.cardIndicators = cardIndicators;
           this.cardPresentInd = cardPresentInd;
           this.ccCardVerifyNum = ccCardVerifyNum;
           this.ccCardVerifyPresenceInd = ccCardVerifyPresenceInd;
           this.customerAni = customerAni;
           this.customerBrowserName = customerBrowserName;
           this.customerEmail = customerEmail;
           this.customerIpAddress = customerIpAddress;
           this.customerName = customerName;
           this.customerPhone = customerPhone;
           this.customerRefNum = customerRefNum;
           this.debitBillerReferenceNumber = debitBillerReferenceNumber;
           this.debitPinCashBack = debitPinCashBack;
           this.debitPinNumber = debitPinNumber;
           this.debitPinSecurityControl = debitPinSecurityControl;
           this.deviceID = deviceID;
           this.ecpActionCode = ecpActionCode;
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
           this.encryptedMagStripeTrack2 = encryptedMagStripeTrack2;
           this.encryptedPan = encryptedPan;
           this.encryptedPanHash = encryptedPanHash;
           this.encryptedPanKey = encryptedPanKey;
           this.encryptedPanMethod = encryptedPanMethod;
           this.encryptedPanPublicKeyFingerPrint = encryptedPanPublicKeyFingerPrint;
           this.encryptionInd = encryptionInd;
           this.euddBankSortCode = euddBankSortCode;
           this.euddCountryCode = euddCountryCode;
           this.euddRibCode = euddRibCode;
           this.fraudAnalysis = fraudAnalysis;
           this.keySerialNumber = keySerialNumber;
           this.latitudeLongitude = latitudeLongitude;
           this.localDateTime = localDateTime;
           this.magStripeTrack1 = magStripeTrack1;
           this.magStripeTrack2 = magStripeTrack2;
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
           this.mbType = mbType;
           this.mcSecureCodeAAV = mcSecureCodeAAV;
           this.mobileDeviceType = mobileDeviceType;
           this.partialAuthInd = partialAuthInd;
           this.politicalTimeZone = politicalTimeZone;
           this.priorAuthCd = priorAuthCd;
           this.profileOrderOverideInd = profileOrderOverideInd;
           this.readerSerialNumber = readerSerialNumber;
           this.recurringInd = recurringInd;
           this.retailTransInfo = retailTransInfo;
           this.retryTrace = retryTrace;
           this.shippingMethod = shippingMethod;
           this.shippingRef = shippingRef;
           this.softDescMercCity = softDescMercCity;
           this.softDescMercEmail = softDescMercEmail;
           this.softDescMercName = softDescMercName;
           this.softDescMercPhone = softDescMercPhone;
           this.softDescMercURL = softDescMercURL;
           this.softDescProdDesc = softDescProdDesc;
           this.softMerchantDescriptors = softMerchantDescriptors;
           this.softwareID = softwareID;
           this.switchSoloCardStartDate = switchSoloCardStartDate;
           this.switchSoloIssueNum = switchSoloIssueNum;
           this.taxAmount = taxAmount;
           this.taxInd = taxInd;
           this.txRefNum = txRefNum;
           this.useCustomerRefNum = useCustomerRefNum;
           this.useStoredAAVInd = useStoredAAVInd;
           this.vendorID = vendorID;
           this.verifyByVisaCAVV = verifyByVisaCAVV;
           this.verifyByVisaXID = verifyByVisaXID;
           this.version = version;
    }


    /**
     * Gets the endppoint value for this NewOrderRequest.
     * 
     * @return endppoint
     */
    public java.lang.String getEndppoint() {
        return endppoint;
    }


    /**
     * Sets the endppoint value for this NewOrderRequest.
     * 
     * @param endppoint
     */
    public void setEndppoint(java.lang.String endppoint) {
        this.endppoint = endppoint;
    }


    /**
     * Gets the bin value for this NewOrderRequest.
     * 
     * @return bin
     */
    public java.lang.String getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this NewOrderRequest.
     * 
     * @param bin
     */
    public void setBin(java.lang.String bin) {
        this.bin = bin;
    }


    /**
     * Gets the industryType value for this NewOrderRequest.
     * 
     * @return industryType
     */
    public java.lang.String getIndustryType() {
        return industryType;
    }


    /**
     * Sets the industryType value for this NewOrderRequest.
     * 
     * @param industryType
     */
    public void setIndustryType(java.lang.String industryType) {
        this.industryType = industryType;
    }


    /**
     * Gets the orderID value for this NewOrderRequest.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this NewOrderRequest.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the merchantID value for this NewOrderRequest.
     * 
     * @return merchantID
     */
    public java.lang.String getMerchantID() {
        return merchantID;
    }


    /**
     * Sets the merchantID value for this NewOrderRequest.
     * 
     * @param merchantID
     */
    public void setMerchantID(java.lang.String merchantID) {
        this.merchantID = merchantID;
    }


    /**
     * Gets the orbitalConnectionPassword value for this NewOrderRequest.
     * 
     * @return orbitalConnectionPassword
     */
    public java.lang.String getOrbitalConnectionPassword() {
        return orbitalConnectionPassword;
    }


    /**
     * Sets the orbitalConnectionPassword value for this NewOrderRequest.
     * 
     * @param orbitalConnectionPassword
     */
    public void setOrbitalConnectionPassword(java.lang.String orbitalConnectionPassword) {
        this.orbitalConnectionPassword = orbitalConnectionPassword;
    }


    /**
     * Gets the orbitalConnectionUsername value for this NewOrderRequest.
     * 
     * @return orbitalConnectionUsername
     */
    public java.lang.String getOrbitalConnectionUsername() {
        return orbitalConnectionUsername;
    }


    /**
     * Sets the orbitalConnectionUsername value for this NewOrderRequest.
     * 
     * @param orbitalConnectionUsername
     */
    public void setOrbitalConnectionUsername(java.lang.String orbitalConnectionUsername) {
        this.orbitalConnectionUsername = orbitalConnectionUsername;
    }


    /**
     * Gets the terminalID value for this NewOrderRequest.
     * 
     * @return terminalID
     */
    public java.lang.String getTerminalID() {
        return terminalID;
    }


    /**
     * Sets the terminalID value for this NewOrderRequest.
     * 
     * @param terminalID
     */
    public void setTerminalID(java.lang.String terminalID) {
        this.terminalID = terminalID;
    }


    /**
     * Gets the transType value for this NewOrderRequest.
     * 
     * @return transType
     */
    public java.lang.String getTransType() {
        return transType;
    }


    /**
     * Sets the transType value for this NewOrderRequest.
     * 
     * @param transType
     */
    public void setTransType(java.lang.String transType) {
        this.transType = transType;
    }


    /**
     * Gets the amount value for this NewOrderRequest.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this NewOrderRequest.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the ccAccountNum value for this NewOrderRequest.
     * 
     * @return ccAccountNum
     */
    public java.lang.String getCcAccountNum() {
        return ccAccountNum;
    }


    /**
     * Sets the ccAccountNum value for this NewOrderRequest.
     * 
     * @param ccAccountNum
     */
    public void setCcAccountNum(java.lang.String ccAccountNum) {
        this.ccAccountNum = ccAccountNum;
    }


    /**
     * Gets the ccExp value for this NewOrderRequest.
     * 
     * @return ccExp
     */
    public java.lang.String getCcExp() {
        return ccExp;
    }


    /**
     * Sets the ccExp value for this NewOrderRequest.
     * 
     * @param ccExp
     */
    public void setCcExp(java.lang.String ccExp) {
        this.ccExp = ccExp;
    }


    /**
     * Gets the comments value for this NewOrderRequest.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this NewOrderRequest.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the PCard3AltTaxAmt value for this NewOrderRequest.
     * 
     * @return PCard3AltTaxAmt
     */
    public java.lang.String getPCard3AltTaxAmt() {
        return PCard3AltTaxAmt;
    }


    /**
     * Sets the PCard3AltTaxAmt value for this NewOrderRequest.
     * 
     * @param PCard3AltTaxAmt
     */
    public void setPCard3AltTaxAmt(java.lang.String PCard3AltTaxAmt) {
        this.PCard3AltTaxAmt = PCard3AltTaxAmt;
    }


    /**
     * Gets the PCard3AltTaxInd value for this NewOrderRequest.
     * 
     * @return PCard3AltTaxInd
     */
    public java.lang.String getPCard3AltTaxInd() {
        return PCard3AltTaxInd;
    }


    /**
     * Sets the PCard3AltTaxInd value for this NewOrderRequest.
     * 
     * @param PCard3AltTaxInd
     */
    public void setPCard3AltTaxInd(java.lang.String PCard3AltTaxInd) {
        this.PCard3AltTaxInd = PCard3AltTaxInd;
    }


    /**
     * Gets the PCard3DestCountryCd value for this NewOrderRequest.
     * 
     * @return PCard3DestCountryCd
     */
    public java.lang.String getPCard3DestCountryCd() {
        return PCard3DestCountryCd;
    }


    /**
     * Sets the PCard3DestCountryCd value for this NewOrderRequest.
     * 
     * @param PCard3DestCountryCd
     */
    public void setPCard3DestCountryCd(java.lang.String PCard3DestCountryCd) {
        this.PCard3DestCountryCd = PCard3DestCountryCd;
    }


    /**
     * Gets the PCard3DiscAmt value for this NewOrderRequest.
     * 
     * @return PCard3DiscAmt
     */
    public java.lang.String getPCard3DiscAmt() {
        return PCard3DiscAmt;
    }


    /**
     * Sets the PCard3DiscAmt value for this NewOrderRequest.
     * 
     * @param PCard3DiscAmt
     */
    public void setPCard3DiscAmt(java.lang.String PCard3DiscAmt) {
        this.PCard3DiscAmt = PCard3DiscAmt;
    }


    /**
     * Gets the PCard3DutyAmt value for this NewOrderRequest.
     * 
     * @return PCard3DutyAmt
     */
    public java.lang.String getPCard3DutyAmt() {
        return PCard3DutyAmt;
    }


    /**
     * Sets the PCard3DutyAmt value for this NewOrderRequest.
     * 
     * @param PCard3DutyAmt
     */
    public void setPCard3DutyAmt(java.lang.String PCard3DutyAmt) {
        this.PCard3DutyAmt = PCard3DutyAmt;
    }


    /**
     * Gets the PCard3FreightAmt value for this NewOrderRequest.
     * 
     * @return PCard3FreightAmt
     */
    public java.lang.String getPCard3FreightAmt() {
        return PCard3FreightAmt;
    }


    /**
     * Sets the PCard3FreightAmt value for this NewOrderRequest.
     * 
     * @param PCard3FreightAmt
     */
    public void setPCard3FreightAmt(java.lang.String PCard3FreightAmt) {
        this.PCard3FreightAmt = PCard3FreightAmt;
    }


    /**
     * Gets the PCard3LineItemCount value for this NewOrderRequest.
     * 
     * @return PCard3LineItemCount
     */
    public java.lang.String getPCard3LineItemCount() {
        return PCard3LineItemCount;
    }


    /**
     * Sets the PCard3LineItemCount value for this NewOrderRequest.
     * 
     * @param PCard3LineItemCount
     */
    public void setPCard3LineItemCount(java.lang.String PCard3LineItemCount) {
        this.PCard3LineItemCount = PCard3LineItemCount;
    }


    /**
     * Gets the PCard3LineItems value for this NewOrderRequest.
     * 
     * @return PCard3LineItems
     */
    public com.budgetprepay.www.Paymentech.PCard3LineItems[] getPCard3LineItems() {
        return PCard3LineItems;
    }


    /**
     * Sets the PCard3LineItems value for this NewOrderRequest.
     * 
     * @param PCard3LineItems
     */
    public void setPCard3LineItems(com.budgetprepay.www.Paymentech.PCard3LineItems[] PCard3LineItems) {
        this.PCard3LineItems = PCard3LineItems;
    }

    public com.budgetprepay.www.Paymentech.PCard3LineItems getPCard3LineItems(int i) {
        return this.PCard3LineItems[i];
    }

    public void setPCard3LineItems(int i, com.budgetprepay.www.Paymentech.PCard3LineItems _value) {
        this.PCard3LineItems[i] = _value;
    }


    /**
     * Gets the PCard3ShipFromZip value for this NewOrderRequest.
     * 
     * @return PCard3ShipFromZip
     */
    public java.lang.String getPCard3ShipFromZip() {
        return PCard3ShipFromZip;
    }


    /**
     * Sets the PCard3ShipFromZip value for this NewOrderRequest.
     * 
     * @param PCard3ShipFromZip
     */
    public void setPCard3ShipFromZip(java.lang.String PCard3ShipFromZip) {
        this.PCard3ShipFromZip = PCard3ShipFromZip;
    }


    /**
     * Gets the PCard3VATtaxAmt value for this NewOrderRequest.
     * 
     * @return PCard3VATtaxAmt
     */
    public java.lang.String getPCard3VATtaxAmt() {
        return PCard3VATtaxAmt;
    }


    /**
     * Sets the PCard3VATtaxAmt value for this NewOrderRequest.
     * 
     * @param PCard3VATtaxAmt
     */
    public void setPCard3VATtaxAmt(java.lang.String PCard3VATtaxAmt) {
        this.PCard3VATtaxAmt = PCard3VATtaxAmt;
    }


    /**
     * Gets the PCard3VATtaxRate value for this NewOrderRequest.
     * 
     * @return PCard3VATtaxRate
     */
    public java.lang.String getPCard3VATtaxRate() {
        return PCard3VATtaxRate;
    }


    /**
     * Sets the PCard3VATtaxRate value for this NewOrderRequest.
     * 
     * @param PCard3VATtaxRate
     */
    public void setPCard3VATtaxRate(java.lang.String PCard3VATtaxRate) {
        this.PCard3VATtaxRate = PCard3VATtaxRate;
    }


    /**
     * Gets the PCardDestAddress value for this NewOrderRequest.
     * 
     * @return PCardDestAddress
     */
    public java.lang.String getPCardDestAddress() {
        return PCardDestAddress;
    }


    /**
     * Sets the PCardDestAddress value for this NewOrderRequest.
     * 
     * @param PCardDestAddress
     */
    public void setPCardDestAddress(java.lang.String PCardDestAddress) {
        this.PCardDestAddress = PCardDestAddress;
    }


    /**
     * Gets the PCardDestAddress2 value for this NewOrderRequest.
     * 
     * @return PCardDestAddress2
     */
    public java.lang.String getPCardDestAddress2() {
        return PCardDestAddress2;
    }


    /**
     * Sets the PCardDestAddress2 value for this NewOrderRequest.
     * 
     * @param PCardDestAddress2
     */
    public void setPCardDestAddress2(java.lang.String PCardDestAddress2) {
        this.PCardDestAddress2 = PCardDestAddress2;
    }


    /**
     * Gets the PCardDestCity value for this NewOrderRequest.
     * 
     * @return PCardDestCity
     */
    public java.lang.String getPCardDestCity() {
        return PCardDestCity;
    }


    /**
     * Sets the PCardDestCity value for this NewOrderRequest.
     * 
     * @param PCardDestCity
     */
    public void setPCardDestCity(java.lang.String PCardDestCity) {
        this.PCardDestCity = PCardDestCity;
    }


    /**
     * Gets the PCardDestName value for this NewOrderRequest.
     * 
     * @return PCardDestName
     */
    public java.lang.String getPCardDestName() {
        return PCardDestName;
    }


    /**
     * Sets the PCardDestName value for this NewOrderRequest.
     * 
     * @param PCardDestName
     */
    public void setPCardDestName(java.lang.String PCardDestName) {
        this.PCardDestName = PCardDestName;
    }


    /**
     * Gets the PCardDestStateCd value for this NewOrderRequest.
     * 
     * @return PCardDestStateCd
     */
    public java.lang.String getPCardDestStateCd() {
        return PCardDestStateCd;
    }


    /**
     * Sets the PCardDestStateCd value for this NewOrderRequest.
     * 
     * @param PCardDestStateCd
     */
    public void setPCardDestStateCd(java.lang.String PCardDestStateCd) {
        this.PCardDestStateCd = PCardDestStateCd;
    }


    /**
     * Gets the PCardDestZip value for this NewOrderRequest.
     * 
     * @return PCardDestZip
     */
    public java.lang.String getPCardDestZip() {
        return PCardDestZip;
    }


    /**
     * Sets the PCardDestZip value for this NewOrderRequest.
     * 
     * @param PCardDestZip
     */
    public void setPCardDestZip(java.lang.String PCardDestZip) {
        this.PCardDestZip = PCardDestZip;
    }


    /**
     * Gets the PCardOrderID value for this NewOrderRequest.
     * 
     * @return PCardOrderID
     */
    public java.lang.String getPCardOrderID() {
        return PCardOrderID;
    }


    /**
     * Sets the PCardOrderID value for this NewOrderRequest.
     * 
     * @param PCardOrderID
     */
    public void setPCardOrderID(java.lang.String PCardOrderID) {
        this.PCardOrderID = PCardOrderID;
    }


    /**
     * Gets the accountUpdaterEligibility value for this NewOrderRequest.
     * 
     * @return accountUpdaterEligibility
     */
    public java.lang.String getAccountUpdaterEligibility() {
        return accountUpdaterEligibility;
    }


    /**
     * Sets the accountUpdaterEligibility value for this NewOrderRequest.
     * 
     * @param accountUpdaterEligibility
     */
    public void setAccountUpdaterEligibility(java.lang.String accountUpdaterEligibility) {
        this.accountUpdaterEligibility = accountUpdaterEligibility;
    }


    /**
     * Gets the addProfileFromOrder value for this NewOrderRequest.
     * 
     * @return addProfileFromOrder
     */
    public java.lang.String getAddProfileFromOrder() {
        return addProfileFromOrder;
    }


    /**
     * Sets the addProfileFromOrder value for this NewOrderRequest.
     * 
     * @param addProfileFromOrder
     */
    public void setAddProfileFromOrder(java.lang.String addProfileFromOrder) {
        this.addProfileFromOrder = addProfileFromOrder;
    }


    /**
     * Gets the amexTranAdvAddn1 value for this NewOrderRequest.
     * 
     * @return amexTranAdvAddn1
     */
    public java.lang.String getAmexTranAdvAddn1() {
        return amexTranAdvAddn1;
    }


    /**
     * Sets the amexTranAdvAddn1 value for this NewOrderRequest.
     * 
     * @param amexTranAdvAddn1
     */
    public void setAmexTranAdvAddn1(java.lang.String amexTranAdvAddn1) {
        this.amexTranAdvAddn1 = amexTranAdvAddn1;
    }


    /**
     * Gets the amexTranAdvAddn2 value for this NewOrderRequest.
     * 
     * @return amexTranAdvAddn2
     */
    public java.lang.String getAmexTranAdvAddn2() {
        return amexTranAdvAddn2;
    }


    /**
     * Sets the amexTranAdvAddn2 value for this NewOrderRequest.
     * 
     * @param amexTranAdvAddn2
     */
    public void setAmexTranAdvAddn2(java.lang.String amexTranAdvAddn2) {
        this.amexTranAdvAddn2 = amexTranAdvAddn2;
    }


    /**
     * Gets the amexTranAdvAddn3 value for this NewOrderRequest.
     * 
     * @return amexTranAdvAddn3
     */
    public java.lang.String getAmexTranAdvAddn3() {
        return amexTranAdvAddn3;
    }


    /**
     * Sets the amexTranAdvAddn3 value for this NewOrderRequest.
     * 
     * @param amexTranAdvAddn3
     */
    public void setAmexTranAdvAddn3(java.lang.String amexTranAdvAddn3) {
        this.amexTranAdvAddn3 = amexTranAdvAddn3;
    }


    /**
     * Gets the amexTranAdvAddn4 value for this NewOrderRequest.
     * 
     * @return amexTranAdvAddn4
     */
    public java.lang.String getAmexTranAdvAddn4() {
        return amexTranAdvAddn4;
    }


    /**
     * Sets the amexTranAdvAddn4 value for this NewOrderRequest.
     * 
     * @param amexTranAdvAddn4
     */
    public void setAmexTranAdvAddn4(java.lang.String amexTranAdvAddn4) {
        this.amexTranAdvAddn4 = amexTranAdvAddn4;
    }


    /**
     * Gets the authenticationECIInd value for this NewOrderRequest.
     * 
     * @return authenticationECIInd
     */
    public java.lang.String getAuthenticationECIInd() {
        return authenticationECIInd;
    }


    /**
     * Sets the authenticationECIInd value for this NewOrderRequest.
     * 
     * @param authenticationECIInd
     */
    public void setAuthenticationECIInd(java.lang.String authenticationECIInd) {
        this.authenticationECIInd = authenticationECIInd;
    }


    /**
     * Gets the avsAddress1 value for this NewOrderRequest.
     * 
     * @return avsAddress1
     */
    public java.lang.String getAvsAddress1() {
        return avsAddress1;
    }


    /**
     * Sets the avsAddress1 value for this NewOrderRequest.
     * 
     * @param avsAddress1
     */
    public void setAvsAddress1(java.lang.String avsAddress1) {
        this.avsAddress1 = avsAddress1;
    }


    /**
     * Gets the avsAddress2 value for this NewOrderRequest.
     * 
     * @return avsAddress2
     */
    public java.lang.String getAvsAddress2() {
        return avsAddress2;
    }


    /**
     * Sets the avsAddress2 value for this NewOrderRequest.
     * 
     * @param avsAddress2
     */
    public void setAvsAddress2(java.lang.String avsAddress2) {
        this.avsAddress2 = avsAddress2;
    }


    /**
     * Gets the avsCity value for this NewOrderRequest.
     * 
     * @return avsCity
     */
    public java.lang.String getAvsCity() {
        return avsCity;
    }


    /**
     * Sets the avsCity value for this NewOrderRequest.
     * 
     * @param avsCity
     */
    public void setAvsCity(java.lang.String avsCity) {
        this.avsCity = avsCity;
    }


    /**
     * Gets the avsCountryCode value for this NewOrderRequest.
     * 
     * @return avsCountryCode
     */
    public java.lang.String getAvsCountryCode() {
        return avsCountryCode;
    }


    /**
     * Sets the avsCountryCode value for this NewOrderRequest.
     * 
     * @param avsCountryCode
     */
    public void setAvsCountryCode(java.lang.String avsCountryCode) {
        this.avsCountryCode = avsCountryCode;
    }


    /**
     * Gets the avsDestAddress1 value for this NewOrderRequest.
     * 
     * @return avsDestAddress1
     */
    public java.lang.String getAvsDestAddress1() {
        return avsDestAddress1;
    }


    /**
     * Sets the avsDestAddress1 value for this NewOrderRequest.
     * 
     * @param avsDestAddress1
     */
    public void setAvsDestAddress1(java.lang.String avsDestAddress1) {
        this.avsDestAddress1 = avsDestAddress1;
    }


    /**
     * Gets the avsDestAddress2 value for this NewOrderRequest.
     * 
     * @return avsDestAddress2
     */
    public java.lang.String getAvsDestAddress2() {
        return avsDestAddress2;
    }


    /**
     * Sets the avsDestAddress2 value for this NewOrderRequest.
     * 
     * @param avsDestAddress2
     */
    public void setAvsDestAddress2(java.lang.String avsDestAddress2) {
        this.avsDestAddress2 = avsDestAddress2;
    }


    /**
     * Gets the avsDestCity value for this NewOrderRequest.
     * 
     * @return avsDestCity
     */
    public java.lang.String getAvsDestCity() {
        return avsDestCity;
    }


    /**
     * Sets the avsDestCity value for this NewOrderRequest.
     * 
     * @param avsDestCity
     */
    public void setAvsDestCity(java.lang.String avsDestCity) {
        this.avsDestCity = avsDestCity;
    }


    /**
     * Gets the avsDestCountryCode value for this NewOrderRequest.
     * 
     * @return avsDestCountryCode
     */
    public java.lang.String getAvsDestCountryCode() {
        return avsDestCountryCode;
    }


    /**
     * Sets the avsDestCountryCode value for this NewOrderRequest.
     * 
     * @param avsDestCountryCode
     */
    public void setAvsDestCountryCode(java.lang.String avsDestCountryCode) {
        this.avsDestCountryCode = avsDestCountryCode;
    }


    /**
     * Gets the avsDestName value for this NewOrderRequest.
     * 
     * @return avsDestName
     */
    public java.lang.String getAvsDestName() {
        return avsDestName;
    }


    /**
     * Sets the avsDestName value for this NewOrderRequest.
     * 
     * @param avsDestName
     */
    public void setAvsDestName(java.lang.String avsDestName) {
        this.avsDestName = avsDestName;
    }


    /**
     * Gets the avsDestPhoneNum value for this NewOrderRequest.
     * 
     * @return avsDestPhoneNum
     */
    public java.lang.String getAvsDestPhoneNum() {
        return avsDestPhoneNum;
    }


    /**
     * Sets the avsDestPhoneNum value for this NewOrderRequest.
     * 
     * @param avsDestPhoneNum
     */
    public void setAvsDestPhoneNum(java.lang.String avsDestPhoneNum) {
        this.avsDestPhoneNum = avsDestPhoneNum;
    }


    /**
     * Gets the avsDestPhoneType value for this NewOrderRequest.
     * 
     * @return avsDestPhoneType
     */
    public java.lang.String getAvsDestPhoneType() {
        return avsDestPhoneType;
    }


    /**
     * Sets the avsDestPhoneType value for this NewOrderRequest.
     * 
     * @param avsDestPhoneType
     */
    public void setAvsDestPhoneType(java.lang.String avsDestPhoneType) {
        this.avsDestPhoneType = avsDestPhoneType;
    }


    /**
     * Gets the avsDestState value for this NewOrderRequest.
     * 
     * @return avsDestState
     */
    public java.lang.String getAvsDestState() {
        return avsDestState;
    }


    /**
     * Sets the avsDestState value for this NewOrderRequest.
     * 
     * @param avsDestState
     */
    public void setAvsDestState(java.lang.String avsDestState) {
        this.avsDestState = avsDestState;
    }


    /**
     * Gets the avsDestZip value for this NewOrderRequest.
     * 
     * @return avsDestZip
     */
    public java.lang.String getAvsDestZip() {
        return avsDestZip;
    }


    /**
     * Sets the avsDestZip value for this NewOrderRequest.
     * 
     * @param avsDestZip
     */
    public void setAvsDestZip(java.lang.String avsDestZip) {
        this.avsDestZip = avsDestZip;
    }


    /**
     * Gets the avsName value for this NewOrderRequest.
     * 
     * @return avsName
     */
    public java.lang.String getAvsName() {
        return avsName;
    }


    /**
     * Sets the avsName value for this NewOrderRequest.
     * 
     * @param avsName
     */
    public void setAvsName(java.lang.String avsName) {
        this.avsName = avsName;
    }


    /**
     * Gets the avsPhone value for this NewOrderRequest.
     * 
     * @return avsPhone
     */
    public java.lang.String getAvsPhone() {
        return avsPhone;
    }


    /**
     * Sets the avsPhone value for this NewOrderRequest.
     * 
     * @param avsPhone
     */
    public void setAvsPhone(java.lang.String avsPhone) {
        this.avsPhone = avsPhone;
    }


    /**
     * Gets the avsPhoneType value for this NewOrderRequest.
     * 
     * @return avsPhoneType
     */
    public java.lang.String getAvsPhoneType() {
        return avsPhoneType;
    }


    /**
     * Sets the avsPhoneType value for this NewOrderRequest.
     * 
     * @param avsPhoneType
     */
    public void setAvsPhoneType(java.lang.String avsPhoneType) {
        this.avsPhoneType = avsPhoneType;
    }


    /**
     * Gets the avsState value for this NewOrderRequest.
     * 
     * @return avsState
     */
    public java.lang.String getAvsState() {
        return avsState;
    }


    /**
     * Sets the avsState value for this NewOrderRequest.
     * 
     * @param avsState
     */
    public void setAvsState(java.lang.String avsState) {
        this.avsState = avsState;
    }


    /**
     * Gets the avsZip value for this NewOrderRequest.
     * 
     * @return avsZip
     */
    public java.lang.String getAvsZip() {
        return avsZip;
    }


    /**
     * Sets the avsZip value for this NewOrderRequest.
     * 
     * @param avsZip
     */
    public void setAvsZip(java.lang.String avsZip) {
        this.avsZip = avsZip;
    }


    /**
     * Gets the bmlCustomerAnnualIncome value for this NewOrderRequest.
     * 
     * @return bmlCustomerAnnualIncome
     */
    public java.lang.String getBmlCustomerAnnualIncome() {
        return bmlCustomerAnnualIncome;
    }


    /**
     * Sets the bmlCustomerAnnualIncome value for this NewOrderRequest.
     * 
     * @param bmlCustomerAnnualIncome
     */
    public void setBmlCustomerAnnualIncome(java.lang.String bmlCustomerAnnualIncome) {
        this.bmlCustomerAnnualIncome = bmlCustomerAnnualIncome;
    }


    /**
     * Gets the bmlCustomerBirthDate value for this NewOrderRequest.
     * 
     * @return bmlCustomerBirthDate
     */
    public java.lang.String getBmlCustomerBirthDate() {
        return bmlCustomerBirthDate;
    }


    /**
     * Sets the bmlCustomerBirthDate value for this NewOrderRequest.
     * 
     * @param bmlCustomerBirthDate
     */
    public void setBmlCustomerBirthDate(java.lang.String bmlCustomerBirthDate) {
        this.bmlCustomerBirthDate = bmlCustomerBirthDate;
    }


    /**
     * Gets the bmlCustomerCheckingAccount value for this NewOrderRequest.
     * 
     * @return bmlCustomerCheckingAccount
     */
    public java.lang.String getBmlCustomerCheckingAccount() {
        return bmlCustomerCheckingAccount;
    }


    /**
     * Sets the bmlCustomerCheckingAccount value for this NewOrderRequest.
     * 
     * @param bmlCustomerCheckingAccount
     */
    public void setBmlCustomerCheckingAccount(java.lang.String bmlCustomerCheckingAccount) {
        this.bmlCustomerCheckingAccount = bmlCustomerCheckingAccount;
    }


    /**
     * Gets the bmlCustomerEmail value for this NewOrderRequest.
     * 
     * @return bmlCustomerEmail
     */
    public java.lang.String getBmlCustomerEmail() {
        return bmlCustomerEmail;
    }


    /**
     * Sets the bmlCustomerEmail value for this NewOrderRequest.
     * 
     * @param bmlCustomerEmail
     */
    public void setBmlCustomerEmail(java.lang.String bmlCustomerEmail) {
        this.bmlCustomerEmail = bmlCustomerEmail;
    }


    /**
     * Gets the bmlCustomerIP value for this NewOrderRequest.
     * 
     * @return bmlCustomerIP
     */
    public java.lang.String getBmlCustomerIP() {
        return bmlCustomerIP;
    }


    /**
     * Sets the bmlCustomerIP value for this NewOrderRequest.
     * 
     * @param bmlCustomerIP
     */
    public void setBmlCustomerIP(java.lang.String bmlCustomerIP) {
        this.bmlCustomerIP = bmlCustomerIP;
    }


    /**
     * Gets the bmlCustomerRegistrationDate value for this NewOrderRequest.
     * 
     * @return bmlCustomerRegistrationDate
     */
    public java.lang.String getBmlCustomerRegistrationDate() {
        return bmlCustomerRegistrationDate;
    }


    /**
     * Sets the bmlCustomerRegistrationDate value for this NewOrderRequest.
     * 
     * @param bmlCustomerRegistrationDate
     */
    public void setBmlCustomerRegistrationDate(java.lang.String bmlCustomerRegistrationDate) {
        this.bmlCustomerRegistrationDate = bmlCustomerRegistrationDate;
    }


    /**
     * Gets the bmlCustomerResidenceStatus value for this NewOrderRequest.
     * 
     * @return bmlCustomerResidenceStatus
     */
    public java.lang.String getBmlCustomerResidenceStatus() {
        return bmlCustomerResidenceStatus;
    }


    /**
     * Sets the bmlCustomerResidenceStatus value for this NewOrderRequest.
     * 
     * @param bmlCustomerResidenceStatus
     */
    public void setBmlCustomerResidenceStatus(java.lang.String bmlCustomerResidenceStatus) {
        this.bmlCustomerResidenceStatus = bmlCustomerResidenceStatus;
    }


    /**
     * Gets the bmlCustomerSSN value for this NewOrderRequest.
     * 
     * @return bmlCustomerSSN
     */
    public java.lang.String getBmlCustomerSSN() {
        return bmlCustomerSSN;
    }


    /**
     * Sets the bmlCustomerSSN value for this NewOrderRequest.
     * 
     * @param bmlCustomerSSN
     */
    public void setBmlCustomerSSN(java.lang.String bmlCustomerSSN) {
        this.bmlCustomerSSN = bmlCustomerSSN;
    }


    /**
     * Gets the bmlCustomerSavingsAccount value for this NewOrderRequest.
     * 
     * @return bmlCustomerSavingsAccount
     */
    public java.lang.String getBmlCustomerSavingsAccount() {
        return bmlCustomerSavingsAccount;
    }


    /**
     * Sets the bmlCustomerSavingsAccount value for this NewOrderRequest.
     * 
     * @param bmlCustomerSavingsAccount
     */
    public void setBmlCustomerSavingsAccount(java.lang.String bmlCustomerSavingsAccount) {
        this.bmlCustomerSavingsAccount = bmlCustomerSavingsAccount;
    }


    /**
     * Gets the bmlCustomerTypeFlag value for this NewOrderRequest.
     * 
     * @return bmlCustomerTypeFlag
     */
    public java.lang.String getBmlCustomerTypeFlag() {
        return bmlCustomerTypeFlag;
    }


    /**
     * Sets the bmlCustomerTypeFlag value for this NewOrderRequest.
     * 
     * @param bmlCustomerTypeFlag
     */
    public void setBmlCustomerTypeFlag(java.lang.String bmlCustomerTypeFlag) {
        this.bmlCustomerTypeFlag = bmlCustomerTypeFlag;
    }


    /**
     * Gets the bmlItemCategory value for this NewOrderRequest.
     * 
     * @return bmlItemCategory
     */
    public java.lang.String getBmlItemCategory() {
        return bmlItemCategory;
    }


    /**
     * Sets the bmlItemCategory value for this NewOrderRequest.
     * 
     * @param bmlItemCategory
     */
    public void setBmlItemCategory(java.lang.String bmlItemCategory) {
        this.bmlItemCategory = bmlItemCategory;
    }


    /**
     * Gets the bmlMerchantPromotionalCode value for this NewOrderRequest.
     * 
     * @return bmlMerchantPromotionalCode
     */
    public java.lang.String getBmlMerchantPromotionalCode() {
        return bmlMerchantPromotionalCode;
    }


    /**
     * Sets the bmlMerchantPromotionalCode value for this NewOrderRequest.
     * 
     * @param bmlMerchantPromotionalCode
     */
    public void setBmlMerchantPromotionalCode(java.lang.String bmlMerchantPromotionalCode) {
        this.bmlMerchantPromotionalCode = bmlMerchantPromotionalCode;
    }


    /**
     * Gets the bmlPreapprovalInvitationNum value for this NewOrderRequest.
     * 
     * @return bmlPreapprovalInvitationNum
     */
    public java.lang.String getBmlPreapprovalInvitationNum() {
        return bmlPreapprovalInvitationNum;
    }


    /**
     * Sets the bmlPreapprovalInvitationNum value for this NewOrderRequest.
     * 
     * @param bmlPreapprovalInvitationNum
     */
    public void setBmlPreapprovalInvitationNum(java.lang.String bmlPreapprovalInvitationNum) {
        this.bmlPreapprovalInvitationNum = bmlPreapprovalInvitationNum;
    }


    /**
     * Gets the bmlProductDeliveryType value for this NewOrderRequest.
     * 
     * @return bmlProductDeliveryType
     */
    public java.lang.String getBmlProductDeliveryType() {
        return bmlProductDeliveryType;
    }


    /**
     * Sets the bmlProductDeliveryType value for this NewOrderRequest.
     * 
     * @param bmlProductDeliveryType
     */
    public void setBmlProductDeliveryType(java.lang.String bmlProductDeliveryType) {
        this.bmlProductDeliveryType = bmlProductDeliveryType;
    }


    /**
     * Gets the bmlShippingCost value for this NewOrderRequest.
     * 
     * @return bmlShippingCost
     */
    public java.lang.String getBmlShippingCost() {
        return bmlShippingCost;
    }


    /**
     * Sets the bmlShippingCost value for this NewOrderRequest.
     * 
     * @param bmlShippingCost
     */
    public void setBmlShippingCost(java.lang.String bmlShippingCost) {
        this.bmlShippingCost = bmlShippingCost;
    }


    /**
     * Gets the bmlTNCVersion value for this NewOrderRequest.
     * 
     * @return bmlTNCVersion
     */
    public java.lang.String getBmlTNCVersion() {
        return bmlTNCVersion;
    }


    /**
     * Sets the bmlTNCVersion value for this NewOrderRequest.
     * 
     * @param bmlTNCVersion
     */
    public void setBmlTNCVersion(java.lang.String bmlTNCVersion) {
        this.bmlTNCVersion = bmlTNCVersion;
    }


    /**
     * Gets the cardBrand value for this NewOrderRequest.
     * 
     * @return cardBrand
     */
    public java.lang.String getCardBrand() {
        return cardBrand;
    }


    /**
     * Sets the cardBrand value for this NewOrderRequest.
     * 
     * @param cardBrand
     */
    public void setCardBrand(java.lang.String cardBrand) {
        this.cardBrand = cardBrand;
    }


    /**
     * Gets the cardIndicators value for this NewOrderRequest.
     * 
     * @return cardIndicators
     */
    public java.lang.String getCardIndicators() {
        return cardIndicators;
    }


    /**
     * Sets the cardIndicators value for this NewOrderRequest.
     * 
     * @param cardIndicators
     */
    public void setCardIndicators(java.lang.String cardIndicators) {
        this.cardIndicators = cardIndicators;
    }


    /**
     * Gets the cardPresentInd value for this NewOrderRequest.
     * 
     * @return cardPresentInd
     */
    public java.lang.String getCardPresentInd() {
        return cardPresentInd;
    }


    /**
     * Sets the cardPresentInd value for this NewOrderRequest.
     * 
     * @param cardPresentInd
     */
    public void setCardPresentInd(java.lang.String cardPresentInd) {
        this.cardPresentInd = cardPresentInd;
    }


    /**
     * Gets the ccCardVerifyNum value for this NewOrderRequest.
     * 
     * @return ccCardVerifyNum
     */
    public java.lang.String getCcCardVerifyNum() {
        return ccCardVerifyNum;
    }


    /**
     * Sets the ccCardVerifyNum value for this NewOrderRequest.
     * 
     * @param ccCardVerifyNum
     */
    public void setCcCardVerifyNum(java.lang.String ccCardVerifyNum) {
        this.ccCardVerifyNum = ccCardVerifyNum;
    }


    /**
     * Gets the ccCardVerifyPresenceInd value for this NewOrderRequest.
     * 
     * @return ccCardVerifyPresenceInd
     */
    public java.lang.String getCcCardVerifyPresenceInd() {
        return ccCardVerifyPresenceInd;
    }


    /**
     * Sets the ccCardVerifyPresenceInd value for this NewOrderRequest.
     * 
     * @param ccCardVerifyPresenceInd
     */
    public void setCcCardVerifyPresenceInd(java.lang.String ccCardVerifyPresenceInd) {
        this.ccCardVerifyPresenceInd = ccCardVerifyPresenceInd;
    }


    /**
     * Gets the customerAni value for this NewOrderRequest.
     * 
     * @return customerAni
     */
    public java.lang.String getCustomerAni() {
        return customerAni;
    }


    /**
     * Sets the customerAni value for this NewOrderRequest.
     * 
     * @param customerAni
     */
    public void setCustomerAni(java.lang.String customerAni) {
        this.customerAni = customerAni;
    }


    /**
     * Gets the customerBrowserName value for this NewOrderRequest.
     * 
     * @return customerBrowserName
     */
    public java.lang.String getCustomerBrowserName() {
        return customerBrowserName;
    }


    /**
     * Sets the customerBrowserName value for this NewOrderRequest.
     * 
     * @param customerBrowserName
     */
    public void setCustomerBrowserName(java.lang.String customerBrowserName) {
        this.customerBrowserName = customerBrowserName;
    }


    /**
     * Gets the customerEmail value for this NewOrderRequest.
     * 
     * @return customerEmail
     */
    public java.lang.String getCustomerEmail() {
        return customerEmail;
    }


    /**
     * Sets the customerEmail value for this NewOrderRequest.
     * 
     * @param customerEmail
     */
    public void setCustomerEmail(java.lang.String customerEmail) {
        this.customerEmail = customerEmail;
    }


    /**
     * Gets the customerIpAddress value for this NewOrderRequest.
     * 
     * @return customerIpAddress
     */
    public java.lang.String getCustomerIpAddress() {
        return customerIpAddress;
    }


    /**
     * Sets the customerIpAddress value for this NewOrderRequest.
     * 
     * @param customerIpAddress
     */
    public void setCustomerIpAddress(java.lang.String customerIpAddress) {
        this.customerIpAddress = customerIpAddress;
    }


    /**
     * Gets the customerName value for this NewOrderRequest.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this NewOrderRequest.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the customerPhone value for this NewOrderRequest.
     * 
     * @return customerPhone
     */
    public java.lang.String getCustomerPhone() {
        return customerPhone;
    }


    /**
     * Sets the customerPhone value for this NewOrderRequest.
     * 
     * @param customerPhone
     */
    public void setCustomerPhone(java.lang.String customerPhone) {
        this.customerPhone = customerPhone;
    }


    /**
     * Gets the customerRefNum value for this NewOrderRequest.
     * 
     * @return customerRefNum
     */
    public java.lang.String getCustomerRefNum() {
        return customerRefNum;
    }


    /**
     * Sets the customerRefNum value for this NewOrderRequest.
     * 
     * @param customerRefNum
     */
    public void setCustomerRefNum(java.lang.String customerRefNum) {
        this.customerRefNum = customerRefNum;
    }


    /**
     * Gets the debitBillerReferenceNumber value for this NewOrderRequest.
     * 
     * @return debitBillerReferenceNumber
     */
    public java.lang.String getDebitBillerReferenceNumber() {
        return debitBillerReferenceNumber;
    }


    /**
     * Sets the debitBillerReferenceNumber value for this NewOrderRequest.
     * 
     * @param debitBillerReferenceNumber
     */
    public void setDebitBillerReferenceNumber(java.lang.String debitBillerReferenceNumber) {
        this.debitBillerReferenceNumber = debitBillerReferenceNumber;
    }


    /**
     * Gets the debitPinCashBack value for this NewOrderRequest.
     * 
     * @return debitPinCashBack
     */
    public java.lang.String getDebitPinCashBack() {
        return debitPinCashBack;
    }


    /**
     * Sets the debitPinCashBack value for this NewOrderRequest.
     * 
     * @param debitPinCashBack
     */
    public void setDebitPinCashBack(java.lang.String debitPinCashBack) {
        this.debitPinCashBack = debitPinCashBack;
    }


    /**
     * Gets the debitPinNumber value for this NewOrderRequest.
     * 
     * @return debitPinNumber
     */
    public java.lang.String getDebitPinNumber() {
        return debitPinNumber;
    }


    /**
     * Sets the debitPinNumber value for this NewOrderRequest.
     * 
     * @param debitPinNumber
     */
    public void setDebitPinNumber(java.lang.String debitPinNumber) {
        this.debitPinNumber = debitPinNumber;
    }


    /**
     * Gets the debitPinSecurityControl value for this NewOrderRequest.
     * 
     * @return debitPinSecurityControl
     */
    public java.lang.String getDebitPinSecurityControl() {
        return debitPinSecurityControl;
    }


    /**
     * Sets the debitPinSecurityControl value for this NewOrderRequest.
     * 
     * @param debitPinSecurityControl
     */
    public void setDebitPinSecurityControl(java.lang.String debitPinSecurityControl) {
        this.debitPinSecurityControl = debitPinSecurityControl;
    }


    /**
     * Gets the deviceID value for this NewOrderRequest.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this NewOrderRequest.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the ecpActionCode value for this NewOrderRequest.
     * 
     * @return ecpActionCode
     */
    public java.lang.String getEcpActionCode() {
        return ecpActionCode;
    }


    /**
     * Sets the ecpActionCode value for this NewOrderRequest.
     * 
     * @param ecpActionCode
     */
    public void setEcpActionCode(java.lang.String ecpActionCode) {
        this.ecpActionCode = ecpActionCode;
    }


    /**
     * Gets the ecpAuthMethod value for this NewOrderRequest.
     * 
     * @return ecpAuthMethod
     */
    public java.lang.String getEcpAuthMethod() {
        return ecpAuthMethod;
    }


    /**
     * Sets the ecpAuthMethod value for this NewOrderRequest.
     * 
     * @param ecpAuthMethod
     */
    public void setEcpAuthMethod(java.lang.String ecpAuthMethod) {
        this.ecpAuthMethod = ecpAuthMethod;
    }


    /**
     * Gets the ecpBankAcctType value for this NewOrderRequest.
     * 
     * @return ecpBankAcctType
     */
    public java.lang.String getEcpBankAcctType() {
        return ecpBankAcctType;
    }


    /**
     * Sets the ecpBankAcctType value for this NewOrderRequest.
     * 
     * @param ecpBankAcctType
     */
    public void setEcpBankAcctType(java.lang.String ecpBankAcctType) {
        this.ecpBankAcctType = ecpBankAcctType;
    }


    /**
     * Gets the ecpCheckDDA value for this NewOrderRequest.
     * 
     * @return ecpCheckDDA
     */
    public java.lang.String getEcpCheckDDA() {
        return ecpCheckDDA;
    }


    /**
     * Sets the ecpCheckDDA value for this NewOrderRequest.
     * 
     * @param ecpCheckDDA
     */
    public void setEcpCheckDDA(java.lang.String ecpCheckDDA) {
        this.ecpCheckDDA = ecpCheckDDA;
    }


    /**
     * Gets the ecpCheckRT value for this NewOrderRequest.
     * 
     * @return ecpCheckRT
     */
    public java.lang.String getEcpCheckRT() {
        return ecpCheckRT;
    }


    /**
     * Sets the ecpCheckRT value for this NewOrderRequest.
     * 
     * @param ecpCheckRT
     */
    public void setEcpCheckRT(java.lang.String ecpCheckRT) {
        this.ecpCheckRT = ecpCheckRT;
    }


    /**
     * Gets the ecpCheckSerialNumber value for this NewOrderRequest.
     * 
     * @return ecpCheckSerialNumber
     */
    public java.lang.String getEcpCheckSerialNumber() {
        return ecpCheckSerialNumber;
    }


    /**
     * Sets the ecpCheckSerialNumber value for this NewOrderRequest.
     * 
     * @param ecpCheckSerialNumber
     */
    public void setEcpCheckSerialNumber(java.lang.String ecpCheckSerialNumber) {
        this.ecpCheckSerialNumber = ecpCheckSerialNumber;
    }


    /**
     * Gets the ecpDelvMethod value for this NewOrderRequest.
     * 
     * @return ecpDelvMethod
     */
    public java.lang.String getEcpDelvMethod() {
        return ecpDelvMethod;
    }


    /**
     * Sets the ecpDelvMethod value for this NewOrderRequest.
     * 
     * @param ecpDelvMethod
     */
    public void setEcpDelvMethod(java.lang.String ecpDelvMethod) {
        this.ecpDelvMethod = ecpDelvMethod;
    }


    /**
     * Gets the ecpImageReferenceNumber value for this NewOrderRequest.
     * 
     * @return ecpImageReferenceNumber
     */
    public java.lang.String getEcpImageReferenceNumber() {
        return ecpImageReferenceNumber;
    }


    /**
     * Sets the ecpImageReferenceNumber value for this NewOrderRequest.
     * 
     * @param ecpImageReferenceNumber
     */
    public void setEcpImageReferenceNumber(java.lang.String ecpImageReferenceNumber) {
        this.ecpImageReferenceNumber = ecpImageReferenceNumber;
    }


    /**
     * Gets the ecpTerminalCity value for this NewOrderRequest.
     * 
     * @return ecpTerminalCity
     */
    public java.lang.String getEcpTerminalCity() {
        return ecpTerminalCity;
    }


    /**
     * Sets the ecpTerminalCity value for this NewOrderRequest.
     * 
     * @param ecpTerminalCity
     */
    public void setEcpTerminalCity(java.lang.String ecpTerminalCity) {
        this.ecpTerminalCity = ecpTerminalCity;
    }


    /**
     * Gets the ecpTerminalState value for this NewOrderRequest.
     * 
     * @return ecpTerminalState
     */
    public java.lang.String getEcpTerminalState() {
        return ecpTerminalState;
    }


    /**
     * Sets the ecpTerminalState value for this NewOrderRequest.
     * 
     * @param ecpTerminalState
     */
    public void setEcpTerminalState(java.lang.String ecpTerminalState) {
        this.ecpTerminalState = ecpTerminalState;
    }


    /**
     * Gets the emailAddressSubtype value for this NewOrderRequest.
     * 
     * @return emailAddressSubtype
     */
    public java.lang.String getEmailAddressSubtype() {
        return emailAddressSubtype;
    }


    /**
     * Sets the emailAddressSubtype value for this NewOrderRequest.
     * 
     * @param emailAddressSubtype
     */
    public void setEmailAddressSubtype(java.lang.String emailAddressSubtype) {
        this.emailAddressSubtype = emailAddressSubtype;
    }


    /**
     * Gets the encryptedMagStripeTrack2 value for this NewOrderRequest.
     * 
     * @return encryptedMagStripeTrack2
     */
    public java.lang.String getEncryptedMagStripeTrack2() {
        return encryptedMagStripeTrack2;
    }


    /**
     * Sets the encryptedMagStripeTrack2 value for this NewOrderRequest.
     * 
     * @param encryptedMagStripeTrack2
     */
    public void setEncryptedMagStripeTrack2(java.lang.String encryptedMagStripeTrack2) {
        this.encryptedMagStripeTrack2 = encryptedMagStripeTrack2;
    }


    /**
     * Gets the encryptedPan value for this NewOrderRequest.
     * 
     * @return encryptedPan
     */
    public java.lang.String getEncryptedPan() {
        return encryptedPan;
    }


    /**
     * Sets the encryptedPan value for this NewOrderRequest.
     * 
     * @param encryptedPan
     */
    public void setEncryptedPan(java.lang.String encryptedPan) {
        this.encryptedPan = encryptedPan;
    }


    /**
     * Gets the encryptedPanHash value for this NewOrderRequest.
     * 
     * @return encryptedPanHash
     */
    public java.lang.String getEncryptedPanHash() {
        return encryptedPanHash;
    }


    /**
     * Sets the encryptedPanHash value for this NewOrderRequest.
     * 
     * @param encryptedPanHash
     */
    public void setEncryptedPanHash(java.lang.String encryptedPanHash) {
        this.encryptedPanHash = encryptedPanHash;
    }


    /**
     * Gets the encryptedPanKey value for this NewOrderRequest.
     * 
     * @return encryptedPanKey
     */
    public java.lang.String getEncryptedPanKey() {
        return encryptedPanKey;
    }


    /**
     * Sets the encryptedPanKey value for this NewOrderRequest.
     * 
     * @param encryptedPanKey
     */
    public void setEncryptedPanKey(java.lang.String encryptedPanKey) {
        this.encryptedPanKey = encryptedPanKey;
    }


    /**
     * Gets the encryptedPanMethod value for this NewOrderRequest.
     * 
     * @return encryptedPanMethod
     */
    public java.lang.String getEncryptedPanMethod() {
        return encryptedPanMethod;
    }


    /**
     * Sets the encryptedPanMethod value for this NewOrderRequest.
     * 
     * @param encryptedPanMethod
     */
    public void setEncryptedPanMethod(java.lang.String encryptedPanMethod) {
        this.encryptedPanMethod = encryptedPanMethod;
    }


    /**
     * Gets the encryptedPanPublicKeyFingerPrint value for this NewOrderRequest.
     * 
     * @return encryptedPanPublicKeyFingerPrint
     */
    public java.lang.String getEncryptedPanPublicKeyFingerPrint() {
        return encryptedPanPublicKeyFingerPrint;
    }


    /**
     * Sets the encryptedPanPublicKeyFingerPrint value for this NewOrderRequest.
     * 
     * @param encryptedPanPublicKeyFingerPrint
     */
    public void setEncryptedPanPublicKeyFingerPrint(java.lang.String encryptedPanPublicKeyFingerPrint) {
        this.encryptedPanPublicKeyFingerPrint = encryptedPanPublicKeyFingerPrint;
    }


    /**
     * Gets the encryptionInd value for this NewOrderRequest.
     * 
     * @return encryptionInd
     */
    public java.lang.String getEncryptionInd() {
        return encryptionInd;
    }


    /**
     * Sets the encryptionInd value for this NewOrderRequest.
     * 
     * @param encryptionInd
     */
    public void setEncryptionInd(java.lang.String encryptionInd) {
        this.encryptionInd = encryptionInd;
    }


    /**
     * Gets the euddBankSortCode value for this NewOrderRequest.
     * 
     * @return euddBankSortCode
     */
    public java.lang.String getEuddBankSortCode() {
        return euddBankSortCode;
    }


    /**
     * Sets the euddBankSortCode value for this NewOrderRequest.
     * 
     * @param euddBankSortCode
     */
    public void setEuddBankSortCode(java.lang.String euddBankSortCode) {
        this.euddBankSortCode = euddBankSortCode;
    }


    /**
     * Gets the euddCountryCode value for this NewOrderRequest.
     * 
     * @return euddCountryCode
     */
    public java.lang.String getEuddCountryCode() {
        return euddCountryCode;
    }


    /**
     * Sets the euddCountryCode value for this NewOrderRequest.
     * 
     * @param euddCountryCode
     */
    public void setEuddCountryCode(java.lang.String euddCountryCode) {
        this.euddCountryCode = euddCountryCode;
    }


    /**
     * Gets the euddRibCode value for this NewOrderRequest.
     * 
     * @return euddRibCode
     */
    public java.lang.String getEuddRibCode() {
        return euddRibCode;
    }


    /**
     * Sets the euddRibCode value for this NewOrderRequest.
     * 
     * @param euddRibCode
     */
    public void setEuddRibCode(java.lang.String euddRibCode) {
        this.euddRibCode = euddRibCode;
    }


    /**
     * Gets the fraudAnalysis value for this NewOrderRequest.
     * 
     * @return fraudAnalysis
     */
    public com.budgetprepay.www.Paymentech.FraudAnalysis getFraudAnalysis() {
        return fraudAnalysis;
    }


    /**
     * Sets the fraudAnalysis value for this NewOrderRequest.
     * 
     * @param fraudAnalysis
     */
    public void setFraudAnalysis(com.budgetprepay.www.Paymentech.FraudAnalysis fraudAnalysis) {
        this.fraudAnalysis = fraudAnalysis;
    }


    /**
     * Gets the keySerialNumber value for this NewOrderRequest.
     * 
     * @return keySerialNumber
     */
    public java.lang.String getKeySerialNumber() {
        return keySerialNumber;
    }


    /**
     * Sets the keySerialNumber value for this NewOrderRequest.
     * 
     * @param keySerialNumber
     */
    public void setKeySerialNumber(java.lang.String keySerialNumber) {
        this.keySerialNumber = keySerialNumber;
    }


    /**
     * Gets the latitudeLongitude value for this NewOrderRequest.
     * 
     * @return latitudeLongitude
     */
    public java.lang.String getLatitudeLongitude() {
        return latitudeLongitude;
    }


    /**
     * Sets the latitudeLongitude value for this NewOrderRequest.
     * 
     * @param latitudeLongitude
     */
    public void setLatitudeLongitude(java.lang.String latitudeLongitude) {
        this.latitudeLongitude = latitudeLongitude;
    }


    /**
     * Gets the localDateTime value for this NewOrderRequest.
     * 
     * @return localDateTime
     */
    public java.lang.String getLocalDateTime() {
        return localDateTime;
    }


    /**
     * Sets the localDateTime value for this NewOrderRequest.
     * 
     * @param localDateTime
     */
    public void setLocalDateTime(java.lang.String localDateTime) {
        this.localDateTime = localDateTime;
    }


    /**
     * Gets the magStripeTrack1 value for this NewOrderRequest.
     * 
     * @return magStripeTrack1
     */
    public java.lang.String getMagStripeTrack1() {
        return magStripeTrack1;
    }


    /**
     * Sets the magStripeTrack1 value for this NewOrderRequest.
     * 
     * @param magStripeTrack1
     */
    public void setMagStripeTrack1(java.lang.String magStripeTrack1) {
        this.magStripeTrack1 = magStripeTrack1;
    }


    /**
     * Gets the magStripeTrack2 value for this NewOrderRequest.
     * 
     * @return magStripeTrack2
     */
    public java.lang.String getMagStripeTrack2() {
        return magStripeTrack2;
    }


    /**
     * Sets the magStripeTrack2 value for this NewOrderRequest.
     * 
     * @param magStripeTrack2
     */
    public void setMagStripeTrack2(java.lang.String magStripeTrack2) {
        this.magStripeTrack2 = magStripeTrack2;
    }


    /**
     * Gets the mbDeferredBillDate value for this NewOrderRequest.
     * 
     * @return mbDeferredBillDate
     */
    public java.lang.String getMbDeferredBillDate() {
        return mbDeferredBillDate;
    }


    /**
     * Sets the mbDeferredBillDate value for this NewOrderRequest.
     * 
     * @param mbDeferredBillDate
     */
    public void setMbDeferredBillDate(java.lang.String mbDeferredBillDate) {
        this.mbDeferredBillDate = mbDeferredBillDate;
    }


    /**
     * Gets the mbMicroPaymentMaxBillingDays value for this NewOrderRequest.
     * 
     * @return mbMicroPaymentMaxBillingDays
     */
    public java.lang.String getMbMicroPaymentMaxBillingDays() {
        return mbMicroPaymentMaxBillingDays;
    }


    /**
     * Sets the mbMicroPaymentMaxBillingDays value for this NewOrderRequest.
     * 
     * @param mbMicroPaymentMaxBillingDays
     */
    public void setMbMicroPaymentMaxBillingDays(java.lang.String mbMicroPaymentMaxBillingDays) {
        this.mbMicroPaymentMaxBillingDays = mbMicroPaymentMaxBillingDays;
    }


    /**
     * Gets the mbMicroPaymentMaxDollarValue value for this NewOrderRequest.
     * 
     * @return mbMicroPaymentMaxDollarValue
     */
    public java.lang.String getMbMicroPaymentMaxDollarValue() {
        return mbMicroPaymentMaxDollarValue;
    }


    /**
     * Sets the mbMicroPaymentMaxDollarValue value for this NewOrderRequest.
     * 
     * @param mbMicroPaymentMaxDollarValue
     */
    public void setMbMicroPaymentMaxDollarValue(java.lang.String mbMicroPaymentMaxDollarValue) {
        this.mbMicroPaymentMaxDollarValue = mbMicroPaymentMaxDollarValue;
    }


    /**
     * Gets the mbMicroPaymentMaxTransactions value for this NewOrderRequest.
     * 
     * @return mbMicroPaymentMaxTransactions
     */
    public java.lang.String getMbMicroPaymentMaxTransactions() {
        return mbMicroPaymentMaxTransactions;
    }


    /**
     * Sets the mbMicroPaymentMaxTransactions value for this NewOrderRequest.
     * 
     * @param mbMicroPaymentMaxTransactions
     */
    public void setMbMicroPaymentMaxTransactions(java.lang.String mbMicroPaymentMaxTransactions) {
        this.mbMicroPaymentMaxTransactions = mbMicroPaymentMaxTransactions;
    }


    /**
     * Gets the mbOrderIdGenerationMethod value for this NewOrderRequest.
     * 
     * @return mbOrderIdGenerationMethod
     */
    public java.lang.String getMbOrderIdGenerationMethod() {
        return mbOrderIdGenerationMethod;
    }


    /**
     * Sets the mbOrderIdGenerationMethod value for this NewOrderRequest.
     * 
     * @param mbOrderIdGenerationMethod
     */
    public void setMbOrderIdGenerationMethod(java.lang.String mbOrderIdGenerationMethod) {
        this.mbOrderIdGenerationMethod = mbOrderIdGenerationMethod;
    }


    /**
     * Gets the mbRecurringEndDate value for this NewOrderRequest.
     * 
     * @return mbRecurringEndDate
     */
    public java.lang.String getMbRecurringEndDate() {
        return mbRecurringEndDate;
    }


    /**
     * Sets the mbRecurringEndDate value for this NewOrderRequest.
     * 
     * @param mbRecurringEndDate
     */
    public void setMbRecurringEndDate(java.lang.String mbRecurringEndDate) {
        this.mbRecurringEndDate = mbRecurringEndDate;
    }


    /**
     * Gets the mbRecurringFrequency value for this NewOrderRequest.
     * 
     * @return mbRecurringFrequency
     */
    public java.lang.String getMbRecurringFrequency() {
        return mbRecurringFrequency;
    }


    /**
     * Sets the mbRecurringFrequency value for this NewOrderRequest.
     * 
     * @param mbRecurringFrequency
     */
    public void setMbRecurringFrequency(java.lang.String mbRecurringFrequency) {
        this.mbRecurringFrequency = mbRecurringFrequency;
    }


    /**
     * Gets the mbRecurringMaxBillings value for this NewOrderRequest.
     * 
     * @return mbRecurringMaxBillings
     */
    public java.lang.String getMbRecurringMaxBillings() {
        return mbRecurringMaxBillings;
    }


    /**
     * Sets the mbRecurringMaxBillings value for this NewOrderRequest.
     * 
     * @param mbRecurringMaxBillings
     */
    public void setMbRecurringMaxBillings(java.lang.String mbRecurringMaxBillings) {
        this.mbRecurringMaxBillings = mbRecurringMaxBillings;
    }


    /**
     * Gets the mbRecurringNoEndDateFlag value for this NewOrderRequest.
     * 
     * @return mbRecurringNoEndDateFlag
     */
    public java.lang.String getMbRecurringNoEndDateFlag() {
        return mbRecurringNoEndDateFlag;
    }


    /**
     * Sets the mbRecurringNoEndDateFlag value for this NewOrderRequest.
     * 
     * @param mbRecurringNoEndDateFlag
     */
    public void setMbRecurringNoEndDateFlag(java.lang.String mbRecurringNoEndDateFlag) {
        this.mbRecurringNoEndDateFlag = mbRecurringNoEndDateFlag;
    }


    /**
     * Gets the mbRecurringStartDate value for this NewOrderRequest.
     * 
     * @return mbRecurringStartDate
     */
    public java.lang.String getMbRecurringStartDate() {
        return mbRecurringStartDate;
    }


    /**
     * Sets the mbRecurringStartDate value for this NewOrderRequest.
     * 
     * @param mbRecurringStartDate
     */
    public void setMbRecurringStartDate(java.lang.String mbRecurringStartDate) {
        this.mbRecurringStartDate = mbRecurringStartDate;
    }


    /**
     * Gets the mbType value for this NewOrderRequest.
     * 
     * @return mbType
     */
    public java.lang.String getMbType() {
        return mbType;
    }


    /**
     * Sets the mbType value for this NewOrderRequest.
     * 
     * @param mbType
     */
    public void setMbType(java.lang.String mbType) {
        this.mbType = mbType;
    }


    /**
     * Gets the mcSecureCodeAAV value for this NewOrderRequest.
     * 
     * @return mcSecureCodeAAV
     */
    public java.lang.String getMcSecureCodeAAV() {
        return mcSecureCodeAAV;
    }


    /**
     * Sets the mcSecureCodeAAV value for this NewOrderRequest.
     * 
     * @param mcSecureCodeAAV
     */
    public void setMcSecureCodeAAV(java.lang.String mcSecureCodeAAV) {
        this.mcSecureCodeAAV = mcSecureCodeAAV;
    }


    /**
     * Gets the mobileDeviceType value for this NewOrderRequest.
     * 
     * @return mobileDeviceType
     */
    public java.lang.String getMobileDeviceType() {
        return mobileDeviceType;
    }


    /**
     * Sets the mobileDeviceType value for this NewOrderRequest.
     * 
     * @param mobileDeviceType
     */
    public void setMobileDeviceType(java.lang.String mobileDeviceType) {
        this.mobileDeviceType = mobileDeviceType;
    }


    /**
     * Gets the partialAuthInd value for this NewOrderRequest.
     * 
     * @return partialAuthInd
     */
    public java.lang.String getPartialAuthInd() {
        return partialAuthInd;
    }


    /**
     * Sets the partialAuthInd value for this NewOrderRequest.
     * 
     * @param partialAuthInd
     */
    public void setPartialAuthInd(java.lang.String partialAuthInd) {
        this.partialAuthInd = partialAuthInd;
    }


    /**
     * Gets the politicalTimeZone value for this NewOrderRequest.
     * 
     * @return politicalTimeZone
     */
    public java.lang.String getPoliticalTimeZone() {
        return politicalTimeZone;
    }


    /**
     * Sets the politicalTimeZone value for this NewOrderRequest.
     * 
     * @param politicalTimeZone
     */
    public void setPoliticalTimeZone(java.lang.String politicalTimeZone) {
        this.politicalTimeZone = politicalTimeZone;
    }


    /**
     * Gets the priorAuthCd value for this NewOrderRequest.
     * 
     * @return priorAuthCd
     */
    public java.lang.String getPriorAuthCd() {
        return priorAuthCd;
    }


    /**
     * Sets the priorAuthCd value for this NewOrderRequest.
     * 
     * @param priorAuthCd
     */
    public void setPriorAuthCd(java.lang.String priorAuthCd) {
        this.priorAuthCd = priorAuthCd;
    }


    /**
     * Gets the profileOrderOverideInd value for this NewOrderRequest.
     * 
     * @return profileOrderOverideInd
     */
    public java.lang.String getProfileOrderOverideInd() {
        return profileOrderOverideInd;
    }


    /**
     * Sets the profileOrderOverideInd value for this NewOrderRequest.
     * 
     * @param profileOrderOverideInd
     */
    public void setProfileOrderOverideInd(java.lang.String profileOrderOverideInd) {
        this.profileOrderOverideInd = profileOrderOverideInd;
    }


    /**
     * Gets the readerSerialNumber value for this NewOrderRequest.
     * 
     * @return readerSerialNumber
     */
    public java.lang.String getReaderSerialNumber() {
        return readerSerialNumber;
    }


    /**
     * Sets the readerSerialNumber value for this NewOrderRequest.
     * 
     * @param readerSerialNumber
     */
    public void setReaderSerialNumber(java.lang.String readerSerialNumber) {
        this.readerSerialNumber = readerSerialNumber;
    }


    /**
     * Gets the recurringInd value for this NewOrderRequest.
     * 
     * @return recurringInd
     */
    public java.lang.String getRecurringInd() {
        return recurringInd;
    }


    /**
     * Sets the recurringInd value for this NewOrderRequest.
     * 
     * @param recurringInd
     */
    public void setRecurringInd(java.lang.String recurringInd) {
        this.recurringInd = recurringInd;
    }


    /**
     * Gets the retailTransInfo value for this NewOrderRequest.
     * 
     * @return retailTransInfo
     */
    public java.lang.String getRetailTransInfo() {
        return retailTransInfo;
    }


    /**
     * Sets the retailTransInfo value for this NewOrderRequest.
     * 
     * @param retailTransInfo
     */
    public void setRetailTransInfo(java.lang.String retailTransInfo) {
        this.retailTransInfo = retailTransInfo;
    }


    /**
     * Gets the retryTrace value for this NewOrderRequest.
     * 
     * @return retryTrace
     */
    public java.lang.String getRetryTrace() {
        return retryTrace;
    }


    /**
     * Sets the retryTrace value for this NewOrderRequest.
     * 
     * @param retryTrace
     */
    public void setRetryTrace(java.lang.String retryTrace) {
        this.retryTrace = retryTrace;
    }


    /**
     * Gets the shippingMethod value for this NewOrderRequest.
     * 
     * @return shippingMethod
     */
    public java.lang.String getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this NewOrderRequest.
     * 
     * @param shippingMethod
     */
    public void setShippingMethod(java.lang.String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the shippingRef value for this NewOrderRequest.
     * 
     * @return shippingRef
     */
    public java.lang.String getShippingRef() {
        return shippingRef;
    }


    /**
     * Sets the shippingRef value for this NewOrderRequest.
     * 
     * @param shippingRef
     */
    public void setShippingRef(java.lang.String shippingRef) {
        this.shippingRef = shippingRef;
    }


    /**
     * Gets the softDescMercCity value for this NewOrderRequest.
     * 
     * @return softDescMercCity
     */
    public java.lang.String getSoftDescMercCity() {
        return softDescMercCity;
    }


    /**
     * Sets the softDescMercCity value for this NewOrderRequest.
     * 
     * @param softDescMercCity
     */
    public void setSoftDescMercCity(java.lang.String softDescMercCity) {
        this.softDescMercCity = softDescMercCity;
    }


    /**
     * Gets the softDescMercEmail value for this NewOrderRequest.
     * 
     * @return softDescMercEmail
     */
    public java.lang.String getSoftDescMercEmail() {
        return softDescMercEmail;
    }


    /**
     * Sets the softDescMercEmail value for this NewOrderRequest.
     * 
     * @param softDescMercEmail
     */
    public void setSoftDescMercEmail(java.lang.String softDescMercEmail) {
        this.softDescMercEmail = softDescMercEmail;
    }


    /**
     * Gets the softDescMercName value for this NewOrderRequest.
     * 
     * @return softDescMercName
     */
    public java.lang.String getSoftDescMercName() {
        return softDescMercName;
    }


    /**
     * Sets the softDescMercName value for this NewOrderRequest.
     * 
     * @param softDescMercName
     */
    public void setSoftDescMercName(java.lang.String softDescMercName) {
        this.softDescMercName = softDescMercName;
    }


    /**
     * Gets the softDescMercPhone value for this NewOrderRequest.
     * 
     * @return softDescMercPhone
     */
    public java.lang.String getSoftDescMercPhone() {
        return softDescMercPhone;
    }


    /**
     * Sets the softDescMercPhone value for this NewOrderRequest.
     * 
     * @param softDescMercPhone
     */
    public void setSoftDescMercPhone(java.lang.String softDescMercPhone) {
        this.softDescMercPhone = softDescMercPhone;
    }


    /**
     * Gets the softDescMercURL value for this NewOrderRequest.
     * 
     * @return softDescMercURL
     */
    public java.lang.String getSoftDescMercURL() {
        return softDescMercURL;
    }


    /**
     * Sets the softDescMercURL value for this NewOrderRequest.
     * 
     * @param softDescMercURL
     */
    public void setSoftDescMercURL(java.lang.String softDescMercURL) {
        this.softDescMercURL = softDescMercURL;
    }


    /**
     * Gets the softDescProdDesc value for this NewOrderRequest.
     * 
     * @return softDescProdDesc
     */
    public java.lang.String getSoftDescProdDesc() {
        return softDescProdDesc;
    }


    /**
     * Sets the softDescProdDesc value for this NewOrderRequest.
     * 
     * @param softDescProdDesc
     */
    public void setSoftDescProdDesc(java.lang.String softDescProdDesc) {
        this.softDescProdDesc = softDescProdDesc;
    }


    /**
     * Gets the softMerchantDescriptors value for this NewOrderRequest.
     * 
     * @return softMerchantDescriptors
     */
    public com.budgetprepay.www.Paymentech.SoftMerchantDescriptors getSoftMerchantDescriptors() {
        return softMerchantDescriptors;
    }


    /**
     * Sets the softMerchantDescriptors value for this NewOrderRequest.
     * 
     * @param softMerchantDescriptors
     */
    public void setSoftMerchantDescriptors(com.budgetprepay.www.Paymentech.SoftMerchantDescriptors softMerchantDescriptors) {
        this.softMerchantDescriptors = softMerchantDescriptors;
    }


    /**
     * Gets the softwareID value for this NewOrderRequest.
     * 
     * @return softwareID
     */
    public java.lang.String getSoftwareID() {
        return softwareID;
    }


    /**
     * Sets the softwareID value for this NewOrderRequest.
     * 
     * @param softwareID
     */
    public void setSoftwareID(java.lang.String softwareID) {
        this.softwareID = softwareID;
    }


    /**
     * Gets the switchSoloCardStartDate value for this NewOrderRequest.
     * 
     * @return switchSoloCardStartDate
     */
    public java.lang.String getSwitchSoloCardStartDate() {
        return switchSoloCardStartDate;
    }


    /**
     * Sets the switchSoloCardStartDate value for this NewOrderRequest.
     * 
     * @param switchSoloCardStartDate
     */
    public void setSwitchSoloCardStartDate(java.lang.String switchSoloCardStartDate) {
        this.switchSoloCardStartDate = switchSoloCardStartDate;
    }


    /**
     * Gets the switchSoloIssueNum value for this NewOrderRequest.
     * 
     * @return switchSoloIssueNum
     */
    public java.lang.String getSwitchSoloIssueNum() {
        return switchSoloIssueNum;
    }


    /**
     * Sets the switchSoloIssueNum value for this NewOrderRequest.
     * 
     * @param switchSoloIssueNum
     */
    public void setSwitchSoloIssueNum(java.lang.String switchSoloIssueNum) {
        this.switchSoloIssueNum = switchSoloIssueNum;
    }


    /**
     * Gets the taxAmount value for this NewOrderRequest.
     * 
     * @return taxAmount
     */
    public java.lang.String getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this NewOrderRequest.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.String taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxInd value for this NewOrderRequest.
     * 
     * @return taxInd
     */
    public java.lang.String getTaxInd() {
        return taxInd;
    }


    /**
     * Sets the taxInd value for this NewOrderRequest.
     * 
     * @param taxInd
     */
    public void setTaxInd(java.lang.String taxInd) {
        this.taxInd = taxInd;
    }


    /**
     * Gets the txRefNum value for this NewOrderRequest.
     * 
     * @return txRefNum
     */
    public java.lang.String getTxRefNum() {
        return txRefNum;
    }


    /**
     * Sets the txRefNum value for this NewOrderRequest.
     * 
     * @param txRefNum
     */
    public void setTxRefNum(java.lang.String txRefNum) {
        this.txRefNum = txRefNum;
    }


    /**
     * Gets the useCustomerRefNum value for this NewOrderRequest.
     * 
     * @return useCustomerRefNum
     */
    public java.lang.String getUseCustomerRefNum() {
        return useCustomerRefNum;
    }


    /**
     * Sets the useCustomerRefNum value for this NewOrderRequest.
     * 
     * @param useCustomerRefNum
     */
    public void setUseCustomerRefNum(java.lang.String useCustomerRefNum) {
        this.useCustomerRefNum = useCustomerRefNum;
    }


    /**
     * Gets the useStoredAAVInd value for this NewOrderRequest.
     * 
     * @return useStoredAAVInd
     */
    public java.lang.String getUseStoredAAVInd() {
        return useStoredAAVInd;
    }


    /**
     * Sets the useStoredAAVInd value for this NewOrderRequest.
     * 
     * @param useStoredAAVInd
     */
    public void setUseStoredAAVInd(java.lang.String useStoredAAVInd) {
        this.useStoredAAVInd = useStoredAAVInd;
    }


    /**
     * Gets the vendorID value for this NewOrderRequest.
     * 
     * @return vendorID
     */
    public java.lang.String getVendorID() {
        return vendorID;
    }


    /**
     * Sets the vendorID value for this NewOrderRequest.
     * 
     * @param vendorID
     */
    public void setVendorID(java.lang.String vendorID) {
        this.vendorID = vendorID;
    }


    /**
     * Gets the verifyByVisaCAVV value for this NewOrderRequest.
     * 
     * @return verifyByVisaCAVV
     */
    public java.lang.String getVerifyByVisaCAVV() {
        return verifyByVisaCAVV;
    }


    /**
     * Sets the verifyByVisaCAVV value for this NewOrderRequest.
     * 
     * @param verifyByVisaCAVV
     */
    public void setVerifyByVisaCAVV(java.lang.String verifyByVisaCAVV) {
        this.verifyByVisaCAVV = verifyByVisaCAVV;
    }


    /**
     * Gets the verifyByVisaXID value for this NewOrderRequest.
     * 
     * @return verifyByVisaXID
     */
    public java.lang.String getVerifyByVisaXID() {
        return verifyByVisaXID;
    }


    /**
     * Sets the verifyByVisaXID value for this NewOrderRequest.
     * 
     * @param verifyByVisaXID
     */
    public void setVerifyByVisaXID(java.lang.String verifyByVisaXID) {
        this.verifyByVisaXID = verifyByVisaXID;
    }


    /**
     * Gets the version value for this NewOrderRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this NewOrderRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewOrderRequest)) return false;
        NewOrderRequest other = (NewOrderRequest) obj;
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
            ((this.transType==null && other.getTransType()==null) || 
             (this.transType!=null &&
              this.transType.equals(other.getTransType()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.ccAccountNum==null && other.getCcAccountNum()==null) || 
             (this.ccAccountNum!=null &&
              this.ccAccountNum.equals(other.getCcAccountNum()))) &&
            ((this.ccExp==null && other.getCcExp()==null) || 
             (this.ccExp!=null &&
              this.ccExp.equals(other.getCcExp()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.PCard3AltTaxAmt==null && other.getPCard3AltTaxAmt()==null) || 
             (this.PCard3AltTaxAmt!=null &&
              this.PCard3AltTaxAmt.equals(other.getPCard3AltTaxAmt()))) &&
            ((this.PCard3AltTaxInd==null && other.getPCard3AltTaxInd()==null) || 
             (this.PCard3AltTaxInd!=null &&
              this.PCard3AltTaxInd.equals(other.getPCard3AltTaxInd()))) &&
            ((this.PCard3DestCountryCd==null && other.getPCard3DestCountryCd()==null) || 
             (this.PCard3DestCountryCd!=null &&
              this.PCard3DestCountryCd.equals(other.getPCard3DestCountryCd()))) &&
            ((this.PCard3DiscAmt==null && other.getPCard3DiscAmt()==null) || 
             (this.PCard3DiscAmt!=null &&
              this.PCard3DiscAmt.equals(other.getPCard3DiscAmt()))) &&
            ((this.PCard3DutyAmt==null && other.getPCard3DutyAmt()==null) || 
             (this.PCard3DutyAmt!=null &&
              this.PCard3DutyAmt.equals(other.getPCard3DutyAmt()))) &&
            ((this.PCard3FreightAmt==null && other.getPCard3FreightAmt()==null) || 
             (this.PCard3FreightAmt!=null &&
              this.PCard3FreightAmt.equals(other.getPCard3FreightAmt()))) &&
            ((this.PCard3LineItemCount==null && other.getPCard3LineItemCount()==null) || 
             (this.PCard3LineItemCount!=null &&
              this.PCard3LineItemCount.equals(other.getPCard3LineItemCount()))) &&
            ((this.PCard3LineItems==null && other.getPCard3LineItems()==null) || 
             (this.PCard3LineItems!=null &&
              java.util.Arrays.equals(this.PCard3LineItems, other.getPCard3LineItems()))) &&
            ((this.PCard3ShipFromZip==null && other.getPCard3ShipFromZip()==null) || 
             (this.PCard3ShipFromZip!=null &&
              this.PCard3ShipFromZip.equals(other.getPCard3ShipFromZip()))) &&
            ((this.PCard3VATtaxAmt==null && other.getPCard3VATtaxAmt()==null) || 
             (this.PCard3VATtaxAmt!=null &&
              this.PCard3VATtaxAmt.equals(other.getPCard3VATtaxAmt()))) &&
            ((this.PCard3VATtaxRate==null && other.getPCard3VATtaxRate()==null) || 
             (this.PCard3VATtaxRate!=null &&
              this.PCard3VATtaxRate.equals(other.getPCard3VATtaxRate()))) &&
            ((this.PCardDestAddress==null && other.getPCardDestAddress()==null) || 
             (this.PCardDestAddress!=null &&
              this.PCardDestAddress.equals(other.getPCardDestAddress()))) &&
            ((this.PCardDestAddress2==null && other.getPCardDestAddress2()==null) || 
             (this.PCardDestAddress2!=null &&
              this.PCardDestAddress2.equals(other.getPCardDestAddress2()))) &&
            ((this.PCardDestCity==null && other.getPCardDestCity()==null) || 
             (this.PCardDestCity!=null &&
              this.PCardDestCity.equals(other.getPCardDestCity()))) &&
            ((this.PCardDestName==null && other.getPCardDestName()==null) || 
             (this.PCardDestName!=null &&
              this.PCardDestName.equals(other.getPCardDestName()))) &&
            ((this.PCardDestStateCd==null && other.getPCardDestStateCd()==null) || 
             (this.PCardDestStateCd!=null &&
              this.PCardDestStateCd.equals(other.getPCardDestStateCd()))) &&
            ((this.PCardDestZip==null && other.getPCardDestZip()==null) || 
             (this.PCardDestZip!=null &&
              this.PCardDestZip.equals(other.getPCardDestZip()))) &&
            ((this.PCardOrderID==null && other.getPCardOrderID()==null) || 
             (this.PCardOrderID!=null &&
              this.PCardOrderID.equals(other.getPCardOrderID()))) &&
            ((this.accountUpdaterEligibility==null && other.getAccountUpdaterEligibility()==null) || 
             (this.accountUpdaterEligibility!=null &&
              this.accountUpdaterEligibility.equals(other.getAccountUpdaterEligibility()))) &&
            ((this.addProfileFromOrder==null && other.getAddProfileFromOrder()==null) || 
             (this.addProfileFromOrder!=null &&
              this.addProfileFromOrder.equals(other.getAddProfileFromOrder()))) &&
            ((this.amexTranAdvAddn1==null && other.getAmexTranAdvAddn1()==null) || 
             (this.amexTranAdvAddn1!=null &&
              this.amexTranAdvAddn1.equals(other.getAmexTranAdvAddn1()))) &&
            ((this.amexTranAdvAddn2==null && other.getAmexTranAdvAddn2()==null) || 
             (this.amexTranAdvAddn2!=null &&
              this.amexTranAdvAddn2.equals(other.getAmexTranAdvAddn2()))) &&
            ((this.amexTranAdvAddn3==null && other.getAmexTranAdvAddn3()==null) || 
             (this.amexTranAdvAddn3!=null &&
              this.amexTranAdvAddn3.equals(other.getAmexTranAdvAddn3()))) &&
            ((this.amexTranAdvAddn4==null && other.getAmexTranAdvAddn4()==null) || 
             (this.amexTranAdvAddn4!=null &&
              this.amexTranAdvAddn4.equals(other.getAmexTranAdvAddn4()))) &&
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
            ((this.cardIndicators==null && other.getCardIndicators()==null) || 
             (this.cardIndicators!=null &&
              this.cardIndicators.equals(other.getCardIndicators()))) &&
            ((this.cardPresentInd==null && other.getCardPresentInd()==null) || 
             (this.cardPresentInd!=null &&
              this.cardPresentInd.equals(other.getCardPresentInd()))) &&
            ((this.ccCardVerifyNum==null && other.getCcCardVerifyNum()==null) || 
             (this.ccCardVerifyNum!=null &&
              this.ccCardVerifyNum.equals(other.getCcCardVerifyNum()))) &&
            ((this.ccCardVerifyPresenceInd==null && other.getCcCardVerifyPresenceInd()==null) || 
             (this.ccCardVerifyPresenceInd!=null &&
              this.ccCardVerifyPresenceInd.equals(other.getCcCardVerifyPresenceInd()))) &&
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
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.customerPhone==null && other.getCustomerPhone()==null) || 
             (this.customerPhone!=null &&
              this.customerPhone.equals(other.getCustomerPhone()))) &&
            ((this.customerRefNum==null && other.getCustomerRefNum()==null) || 
             (this.customerRefNum!=null &&
              this.customerRefNum.equals(other.getCustomerRefNum()))) &&
            ((this.debitBillerReferenceNumber==null && other.getDebitBillerReferenceNumber()==null) || 
             (this.debitBillerReferenceNumber!=null &&
              this.debitBillerReferenceNumber.equals(other.getDebitBillerReferenceNumber()))) &&
            ((this.debitPinCashBack==null && other.getDebitPinCashBack()==null) || 
             (this.debitPinCashBack!=null &&
              this.debitPinCashBack.equals(other.getDebitPinCashBack()))) &&
            ((this.debitPinNumber==null && other.getDebitPinNumber()==null) || 
             (this.debitPinNumber!=null &&
              this.debitPinNumber.equals(other.getDebitPinNumber()))) &&
            ((this.debitPinSecurityControl==null && other.getDebitPinSecurityControl()==null) || 
             (this.debitPinSecurityControl!=null &&
              this.debitPinSecurityControl.equals(other.getDebitPinSecurityControl()))) &&
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.ecpActionCode==null && other.getEcpActionCode()==null) || 
             (this.ecpActionCode!=null &&
              this.ecpActionCode.equals(other.getEcpActionCode()))) &&
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
            ((this.encryptedMagStripeTrack2==null && other.getEncryptedMagStripeTrack2()==null) || 
             (this.encryptedMagStripeTrack2!=null &&
              this.encryptedMagStripeTrack2.equals(other.getEncryptedMagStripeTrack2()))) &&
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
            ((this.encryptionInd==null && other.getEncryptionInd()==null) || 
             (this.encryptionInd!=null &&
              this.encryptionInd.equals(other.getEncryptionInd()))) &&
            ((this.euddBankSortCode==null && other.getEuddBankSortCode()==null) || 
             (this.euddBankSortCode!=null &&
              this.euddBankSortCode.equals(other.getEuddBankSortCode()))) &&
            ((this.euddCountryCode==null && other.getEuddCountryCode()==null) || 
             (this.euddCountryCode!=null &&
              this.euddCountryCode.equals(other.getEuddCountryCode()))) &&
            ((this.euddRibCode==null && other.getEuddRibCode()==null) || 
             (this.euddRibCode!=null &&
              this.euddRibCode.equals(other.getEuddRibCode()))) &&
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
            ((this.mbType==null && other.getMbType()==null) || 
             (this.mbType!=null &&
              this.mbType.equals(other.getMbType()))) &&
            ((this.mcSecureCodeAAV==null && other.getMcSecureCodeAAV()==null) || 
             (this.mcSecureCodeAAV!=null &&
              this.mcSecureCodeAAV.equals(other.getMcSecureCodeAAV()))) &&
            ((this.mobileDeviceType==null && other.getMobileDeviceType()==null) || 
             (this.mobileDeviceType!=null &&
              this.mobileDeviceType.equals(other.getMobileDeviceType()))) &&
            ((this.partialAuthInd==null && other.getPartialAuthInd()==null) || 
             (this.partialAuthInd!=null &&
              this.partialAuthInd.equals(other.getPartialAuthInd()))) &&
            ((this.politicalTimeZone==null && other.getPoliticalTimeZone()==null) || 
             (this.politicalTimeZone!=null &&
              this.politicalTimeZone.equals(other.getPoliticalTimeZone()))) &&
            ((this.priorAuthCd==null && other.getPriorAuthCd()==null) || 
             (this.priorAuthCd!=null &&
              this.priorAuthCd.equals(other.getPriorAuthCd()))) &&
            ((this.profileOrderOverideInd==null && other.getProfileOrderOverideInd()==null) || 
             (this.profileOrderOverideInd!=null &&
              this.profileOrderOverideInd.equals(other.getProfileOrderOverideInd()))) &&
            ((this.readerSerialNumber==null && other.getReaderSerialNumber()==null) || 
             (this.readerSerialNumber!=null &&
              this.readerSerialNumber.equals(other.getReaderSerialNumber()))) &&
            ((this.recurringInd==null && other.getRecurringInd()==null) || 
             (this.recurringInd!=null &&
              this.recurringInd.equals(other.getRecurringInd()))) &&
            ((this.retailTransInfo==null && other.getRetailTransInfo()==null) || 
             (this.retailTransInfo!=null &&
              this.retailTransInfo.equals(other.getRetailTransInfo()))) &&
            ((this.retryTrace==null && other.getRetryTrace()==null) || 
             (this.retryTrace!=null &&
              this.retryTrace.equals(other.getRetryTrace()))) &&
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod()))) &&
            ((this.shippingRef==null && other.getShippingRef()==null) || 
             (this.shippingRef!=null &&
              this.shippingRef.equals(other.getShippingRef()))) &&
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
            ((this.softMerchantDescriptors==null && other.getSoftMerchantDescriptors()==null) || 
             (this.softMerchantDescriptors!=null &&
              this.softMerchantDescriptors.equals(other.getSoftMerchantDescriptors()))) &&
            ((this.softwareID==null && other.getSoftwareID()==null) || 
             (this.softwareID!=null &&
              this.softwareID.equals(other.getSoftwareID()))) &&
            ((this.switchSoloCardStartDate==null && other.getSwitchSoloCardStartDate()==null) || 
             (this.switchSoloCardStartDate!=null &&
              this.switchSoloCardStartDate.equals(other.getSwitchSoloCardStartDate()))) &&
            ((this.switchSoloIssueNum==null && other.getSwitchSoloIssueNum()==null) || 
             (this.switchSoloIssueNum!=null &&
              this.switchSoloIssueNum.equals(other.getSwitchSoloIssueNum()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.taxInd==null && other.getTaxInd()==null) || 
             (this.taxInd!=null &&
              this.taxInd.equals(other.getTaxInd()))) &&
            ((this.txRefNum==null && other.getTxRefNum()==null) || 
             (this.txRefNum!=null &&
              this.txRefNum.equals(other.getTxRefNum()))) &&
            ((this.useCustomerRefNum==null && other.getUseCustomerRefNum()==null) || 
             (this.useCustomerRefNum!=null &&
              this.useCustomerRefNum.equals(other.getUseCustomerRefNum()))) &&
            ((this.useStoredAAVInd==null && other.getUseStoredAAVInd()==null) || 
             (this.useStoredAAVInd!=null &&
              this.useStoredAAVInd.equals(other.getUseStoredAAVInd()))) &&
            ((this.vendorID==null && other.getVendorID()==null) || 
             (this.vendorID!=null &&
              this.vendorID.equals(other.getVendorID()))) &&
            ((this.verifyByVisaCAVV==null && other.getVerifyByVisaCAVV()==null) || 
             (this.verifyByVisaCAVV!=null &&
              this.verifyByVisaCAVV.equals(other.getVerifyByVisaCAVV()))) &&
            ((this.verifyByVisaXID==null && other.getVerifyByVisaXID()==null) || 
             (this.verifyByVisaXID!=null &&
              this.verifyByVisaXID.equals(other.getVerifyByVisaXID()))) &&
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
        if (getTransType() != null) {
            _hashCode += getTransType().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCcAccountNum() != null) {
            _hashCode += getCcAccountNum().hashCode();
        }
        if (getCcExp() != null) {
            _hashCode += getCcExp().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getPCard3AltTaxAmt() != null) {
            _hashCode += getPCard3AltTaxAmt().hashCode();
        }
        if (getPCard3AltTaxInd() != null) {
            _hashCode += getPCard3AltTaxInd().hashCode();
        }
        if (getPCard3DestCountryCd() != null) {
            _hashCode += getPCard3DestCountryCd().hashCode();
        }
        if (getPCard3DiscAmt() != null) {
            _hashCode += getPCard3DiscAmt().hashCode();
        }
        if (getPCard3DutyAmt() != null) {
            _hashCode += getPCard3DutyAmt().hashCode();
        }
        if (getPCard3FreightAmt() != null) {
            _hashCode += getPCard3FreightAmt().hashCode();
        }
        if (getPCard3LineItemCount() != null) {
            _hashCode += getPCard3LineItemCount().hashCode();
        }
        if (getPCard3LineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCard3LineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCard3LineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPCard3ShipFromZip() != null) {
            _hashCode += getPCard3ShipFromZip().hashCode();
        }
        if (getPCard3VATtaxAmt() != null) {
            _hashCode += getPCard3VATtaxAmt().hashCode();
        }
        if (getPCard3VATtaxRate() != null) {
            _hashCode += getPCard3VATtaxRate().hashCode();
        }
        if (getPCardDestAddress() != null) {
            _hashCode += getPCardDestAddress().hashCode();
        }
        if (getPCardDestAddress2() != null) {
            _hashCode += getPCardDestAddress2().hashCode();
        }
        if (getPCardDestCity() != null) {
            _hashCode += getPCardDestCity().hashCode();
        }
        if (getPCardDestName() != null) {
            _hashCode += getPCardDestName().hashCode();
        }
        if (getPCardDestStateCd() != null) {
            _hashCode += getPCardDestStateCd().hashCode();
        }
        if (getPCardDestZip() != null) {
            _hashCode += getPCardDestZip().hashCode();
        }
        if (getPCardOrderID() != null) {
            _hashCode += getPCardOrderID().hashCode();
        }
        if (getAccountUpdaterEligibility() != null) {
            _hashCode += getAccountUpdaterEligibility().hashCode();
        }
        if (getAddProfileFromOrder() != null) {
            _hashCode += getAddProfileFromOrder().hashCode();
        }
        if (getAmexTranAdvAddn1() != null) {
            _hashCode += getAmexTranAdvAddn1().hashCode();
        }
        if (getAmexTranAdvAddn2() != null) {
            _hashCode += getAmexTranAdvAddn2().hashCode();
        }
        if (getAmexTranAdvAddn3() != null) {
            _hashCode += getAmexTranAdvAddn3().hashCode();
        }
        if (getAmexTranAdvAddn4() != null) {
            _hashCode += getAmexTranAdvAddn4().hashCode();
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
        if (getCardIndicators() != null) {
            _hashCode += getCardIndicators().hashCode();
        }
        if (getCardPresentInd() != null) {
            _hashCode += getCardPresentInd().hashCode();
        }
        if (getCcCardVerifyNum() != null) {
            _hashCode += getCcCardVerifyNum().hashCode();
        }
        if (getCcCardVerifyPresenceInd() != null) {
            _hashCode += getCcCardVerifyPresenceInd().hashCode();
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
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getCustomerPhone() != null) {
            _hashCode += getCustomerPhone().hashCode();
        }
        if (getCustomerRefNum() != null) {
            _hashCode += getCustomerRefNum().hashCode();
        }
        if (getDebitBillerReferenceNumber() != null) {
            _hashCode += getDebitBillerReferenceNumber().hashCode();
        }
        if (getDebitPinCashBack() != null) {
            _hashCode += getDebitPinCashBack().hashCode();
        }
        if (getDebitPinNumber() != null) {
            _hashCode += getDebitPinNumber().hashCode();
        }
        if (getDebitPinSecurityControl() != null) {
            _hashCode += getDebitPinSecurityControl().hashCode();
        }
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getEcpActionCode() != null) {
            _hashCode += getEcpActionCode().hashCode();
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
        if (getEncryptedMagStripeTrack2() != null) {
            _hashCode += getEncryptedMagStripeTrack2().hashCode();
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
        if (getEncryptionInd() != null) {
            _hashCode += getEncryptionInd().hashCode();
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
        if (getMbType() != null) {
            _hashCode += getMbType().hashCode();
        }
        if (getMcSecureCodeAAV() != null) {
            _hashCode += getMcSecureCodeAAV().hashCode();
        }
        if (getMobileDeviceType() != null) {
            _hashCode += getMobileDeviceType().hashCode();
        }
        if (getPartialAuthInd() != null) {
            _hashCode += getPartialAuthInd().hashCode();
        }
        if (getPoliticalTimeZone() != null) {
            _hashCode += getPoliticalTimeZone().hashCode();
        }
        if (getPriorAuthCd() != null) {
            _hashCode += getPriorAuthCd().hashCode();
        }
        if (getProfileOrderOverideInd() != null) {
            _hashCode += getProfileOrderOverideInd().hashCode();
        }
        if (getReaderSerialNumber() != null) {
            _hashCode += getReaderSerialNumber().hashCode();
        }
        if (getRecurringInd() != null) {
            _hashCode += getRecurringInd().hashCode();
        }
        if (getRetailTransInfo() != null) {
            _hashCode += getRetailTransInfo().hashCode();
        }
        if (getRetryTrace() != null) {
            _hashCode += getRetryTrace().hashCode();
        }
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        if (getShippingRef() != null) {
            _hashCode += getShippingRef().hashCode();
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
        if (getSoftMerchantDescriptors() != null) {
            _hashCode += getSoftMerchantDescriptors().hashCode();
        }
        if (getSoftwareID() != null) {
            _hashCode += getSoftwareID().hashCode();
        }
        if (getSwitchSoloCardStartDate() != null) {
            _hashCode += getSwitchSoloCardStartDate().hashCode();
        }
        if (getSwitchSoloIssueNum() != null) {
            _hashCode += getSwitchSoloIssueNum().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getTaxInd() != null) {
            _hashCode += getTaxInd().hashCode();
        }
        if (getTxRefNum() != null) {
            _hashCode += getTxRefNum().hashCode();
        }
        if (getUseCustomerRefNum() != null) {
            _hashCode += getUseCustomerRefNum().hashCode();
        }
        if (getUseStoredAAVInd() != null) {
            _hashCode += getUseStoredAAVInd().hashCode();
        }
        if (getVendorID() != null) {
            _hashCode += getVendorID().hashCode();
        }
        if (getVerifyByVisaCAVV() != null) {
            _hashCode += getVerifyByVisaCAVV().hashCode();
        }
        if (getVerifyByVisaXID() != null) {
            _hashCode += getVerifyByVisaXID().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewOrderRequest.class, true);

    /*
    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "NewOrderRequest"));
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
        elemField.setFieldName("transType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "transType"));
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
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3AltTaxAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3AltTaxAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3AltTaxInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3AltTaxInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3DestCountryCd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3DestCountryCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3DiscAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3DiscAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3DutyAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3DutyAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3FreightAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3FreightAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3LineItemCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3LineItemCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3LineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3LineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3LineItems"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3ShipFromZip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3ShipFromZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3VATtaxAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3VATtaxAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCard3VATtaxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCard3VATtaxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCardDestAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCardDestAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCardDestAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCardDestAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCardDestCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCardDestCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCardDestName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCardDestName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCardDestStateCd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCardDestStateCd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCardDestZip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCardDestZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCardOrderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "PCardOrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountUpdaterEligibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "accountUpdaterEligibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addProfileFromOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "addProfileFromOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amexTranAdvAddn1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "amexTranAdvAddn1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amexTranAdvAddn2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "amexTranAdvAddn2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amexTranAdvAddn3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "amexTranAdvAddn3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amexTranAdvAddn4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "amexTranAdvAddn4"));
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
        elemField.setFieldName("cardIndicators");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "cardIndicators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardPresentInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "cardPresentInd"));
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
        elemField.setFieldName("debitBillerReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "debitBillerReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitPinCashBack");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "debitPinCashBack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitPinNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "debitPinNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitPinSecurityControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "debitPinSecurityControl"));
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
        elemField.setFieldName("ecpActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ecpActionCode"));
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
        elemField.setFieldName("encryptedMagStripeTrack2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "encryptedMagStripeTrack2"));
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
        elemField.setFieldName("encryptionInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "encryptionInd"));
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
        elemField.setFieldName("mobileDeviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "mobileDeviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialAuthInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "partialAuthInd"));
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
        elemField.setFieldName("profileOrderOverideInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "profileOrderOverideInd"));
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
        elemField.setFieldName("recurringInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "recurringInd"));
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
        elemField.setFieldName("softMerchantDescriptors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "softMerchantDescriptors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "softMerchantDescriptors"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softwareID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "softwareID"));
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
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "taxInd"));
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
        elemField.setFieldName("vendorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "vendorID"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }
	*/
    
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
