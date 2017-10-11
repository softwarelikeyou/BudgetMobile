/**
 * LookupAccountByMDN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class LookupAccountByMDN  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private int budgetMobileId;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private int accountCredits;

    private int providerID;

    private java.lang.String mobileNumber;

    private java.lang.String SSN;

    private java.lang.String birthdate;

    private java.lang.String address1;

    private java.lang.String address2;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String ZIP;

    private java.lang.String emailAddress;

    private java.lang.String contactNumber;

    private java.lang.String lifeLineCodeName;

    private java.lang.String lifeline_Expiration;

    private java.lang.String billingAddress;

    private java.lang.String billingAddress2;

    private java.lang.String billingCity;

    private java.lang.String billingState;

    private java.lang.String billingZip;

    private int lifelineCode;

    private java.lang.String topUpExpiration;

    private java.lang.String lastCallDateTime;

    private java.lang.String fromOrToNumber;

    private java.lang.String alternateIDDesc;

    private java.lang.String alternateIDValue;

    private boolean lifeline;

    private java.lang.String beneficiary;

    private java.lang.String lastBasePlanPurchase;

    private double balance;

    private java.lang.String deviceID;

    private boolean restrictUTT;

    private boolean accountCompleted;

    private java.lang.String dateCompleted;

    private boolean voiceOnly;

    private boolean TT_PendingConversion;

    private boolean TT_ConversionProhibited;

    private boolean ratePlanPurchaseEligible_Immediate;

    private boolean ratePlanPurchaseEligible_Advance;

    private java.lang.String serviceEndDate;

    private java.lang.String ratePlanDisplay;

    private boolean validForPayment;

    private boolean recertificationMustUpdate;

    private boolean validForRecertification;

    private boolean commissionableRecertification;

    private boolean validForTopup;

    private int recertificationCreditEarned;

    private boolean validForAccountDetails;

    private boolean ruralAddress;

    private java.lang.String stateRegCode2;

    private java.lang.String IMSI;

    private boolean validForPlanChange;

    private boolean migrationInProgress;

    public LookupAccountByMDN() {
    }

    public LookupAccountByMDN(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           int budgetMobileId,
           java.lang.String firstName,
           java.lang.String lastName,
           int accountCredits,
           int providerID,
           java.lang.String mobileNumber,
           java.lang.String SSN,
           java.lang.String birthdate,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String city,
           java.lang.String state,
           java.lang.String ZIP,
           java.lang.String emailAddress,
           java.lang.String contactNumber,
           java.lang.String lifeLineCodeName,
           java.lang.String lifeline_Expiration,
           java.lang.String billingAddress,
           java.lang.String billingAddress2,
           java.lang.String billingCity,
           java.lang.String billingState,
           java.lang.String billingZip,
           int lifelineCode,
           java.lang.String topUpExpiration,
           java.lang.String lastCallDateTime,
           java.lang.String fromOrToNumber,
           java.lang.String alternateIDDesc,
           java.lang.String alternateIDValue,
           boolean lifeline,
           java.lang.String beneficiary,
           java.lang.String lastBasePlanPurchase,
           double balance,
           java.lang.String deviceID,
           boolean restrictUTT,
           boolean accountCompleted,
           java.lang.String dateCompleted,
           boolean voiceOnly,
           boolean TT_PendingConversion,
           boolean TT_ConversionProhibited,
           boolean ratePlanPurchaseEligible_Immediate,
           boolean ratePlanPurchaseEligible_Advance,
           java.lang.String serviceEndDate,
           java.lang.String ratePlanDisplay,
           boolean validForPayment,
           boolean recertificationMustUpdate,
           boolean validForRecertification,
           boolean commissionableRecertification,
           boolean validForTopup,
           int recertificationCreditEarned,
           boolean validForAccountDetails,
           boolean ruralAddress,
           java.lang.String stateRegCode2,
           java.lang.String IMSI,
           boolean validForPlanChange,
           boolean migrationInProgress) {
        super(
            errors,
            isError);
        this.budgetMobileId = budgetMobileId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountCredits = accountCredits;
        this.providerID = providerID;
        this.mobileNumber = mobileNumber;
        this.SSN = SSN;
        this.birthdate = birthdate;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.ZIP = ZIP;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
        this.lifeLineCodeName = lifeLineCodeName;
        this.lifeline_Expiration = lifeline_Expiration;
        this.billingAddress = billingAddress;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.lifelineCode = lifelineCode;
        this.topUpExpiration = topUpExpiration;
        this.lastCallDateTime = lastCallDateTime;
        this.fromOrToNumber = fromOrToNumber;
        this.alternateIDDesc = alternateIDDesc;
        this.alternateIDValue = alternateIDValue;
        this.lifeline = lifeline;
        this.beneficiary = beneficiary;
        this.lastBasePlanPurchase = lastBasePlanPurchase;
        this.balance = balance;
        this.deviceID = deviceID;
        this.restrictUTT = restrictUTT;
        this.accountCompleted = accountCompleted;
        this.dateCompleted = dateCompleted;
        this.voiceOnly = voiceOnly;
        this.TT_PendingConversion = TT_PendingConversion;
        this.TT_ConversionProhibited = TT_ConversionProhibited;
        this.ratePlanPurchaseEligible_Immediate = ratePlanPurchaseEligible_Immediate;
        this.ratePlanPurchaseEligible_Advance = ratePlanPurchaseEligible_Advance;
        this.serviceEndDate = serviceEndDate;
        this.ratePlanDisplay = ratePlanDisplay;
        this.validForPayment = validForPayment;
        this.recertificationMustUpdate = recertificationMustUpdate;
        this.validForRecertification = validForRecertification;
        this.commissionableRecertification = commissionableRecertification;
        this.validForTopup = validForTopup;
        this.recertificationCreditEarned = recertificationCreditEarned;
        this.validForAccountDetails = validForAccountDetails;
        this.ruralAddress = ruralAddress;
        this.stateRegCode2 = stateRegCode2;
        this.IMSI = IMSI;
        this.validForPlanChange = validForPlanChange;
        this.migrationInProgress = migrationInProgress;
    }


    /**
     * Gets the budgetMobileId value for this LookupAccountByMDN.
     * 
     * @return budgetMobileId
     */
    public int getBudgetMobileId() {
        return budgetMobileId;
    }


    /**
     * Sets the budgetMobileId value for this LookupAccountByMDN.
     * 
     * @param budgetMobileId
     */
    public void setBudgetMobileId(int budgetMobileId) {
        this.budgetMobileId = budgetMobileId;
    }


    /**
     * Gets the firstName value for this LookupAccountByMDN.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this LookupAccountByMDN.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this LookupAccountByMDN.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this LookupAccountByMDN.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the accountCredits value for this LookupAccountByMDN.
     * 
     * @return accountCredits
     */
    public int getAccountCredits() {
        return accountCredits;
    }


    /**
     * Sets the accountCredits value for this LookupAccountByMDN.
     * 
     * @param accountCredits
     */
    public void setAccountCredits(int accountCredits) {
        this.accountCredits = accountCredits;
    }


    /**
     * Gets the providerID value for this LookupAccountByMDN.
     * 
     * @return providerID
     */
    public int getProviderID() {
        return providerID;
    }


    /**
     * Sets the providerID value for this LookupAccountByMDN.
     * 
     * @param providerID
     */
    public void setProviderID(int providerID) {
        this.providerID = providerID;
    }


    /**
     * Gets the mobileNumber value for this LookupAccountByMDN.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this LookupAccountByMDN.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the SSN value for this LookupAccountByMDN.
     * 
     * @return SSN
     */
    public java.lang.String getSSN() {
        return SSN;
    }


    /**
     * Sets the SSN value for this LookupAccountByMDN.
     * 
     * @param SSN
     */
    public void setSSN(java.lang.String SSN) {
        this.SSN = SSN;
    }


    /**
     * Gets the birthdate value for this LookupAccountByMDN.
     * 
     * @return birthdate
     */
    public java.lang.String getBirthdate() {
        return birthdate;
    }


    /**
     * Sets the birthdate value for this LookupAccountByMDN.
     * 
     * @param birthdate
     */
    public void setBirthdate(java.lang.String birthdate) {
        this.birthdate = birthdate;
    }


    /**
     * Gets the address1 value for this LookupAccountByMDN.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this LookupAccountByMDN.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this LookupAccountByMDN.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this LookupAccountByMDN.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this LookupAccountByMDN.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this LookupAccountByMDN.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this LookupAccountByMDN.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this LookupAccountByMDN.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the ZIP value for this LookupAccountByMDN.
     * 
     * @return ZIP
     */
    public java.lang.String getZIP() {
        return ZIP;
    }


    /**
     * Sets the ZIP value for this LookupAccountByMDN.
     * 
     * @param ZIP
     */
    public void setZIP(java.lang.String ZIP) {
        this.ZIP = ZIP;
    }


    /**
     * Gets the emailAddress value for this LookupAccountByMDN.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this LookupAccountByMDN.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the contactNumber value for this LookupAccountByMDN.
     * 
     * @return contactNumber
     */
    public java.lang.String getContactNumber() {
        return contactNumber;
    }


    /**
     * Sets the contactNumber value for this LookupAccountByMDN.
     * 
     * @param contactNumber
     */
    public void setContactNumber(java.lang.String contactNumber) {
        this.contactNumber = contactNumber;
    }


    /**
     * Gets the lifeLineCodeName value for this LookupAccountByMDN.
     * 
     * @return lifeLineCodeName
     */
    public java.lang.String getLifeLineCodeName() {
        return lifeLineCodeName;
    }


    /**
     * Sets the lifeLineCodeName value for this LookupAccountByMDN.
     * 
     * @param lifeLineCodeName
     */
    public void setLifeLineCodeName(java.lang.String lifeLineCodeName) {
        this.lifeLineCodeName = lifeLineCodeName;
    }


    /**
     * Gets the lifeline_Expiration value for this LookupAccountByMDN.
     * 
     * @return lifeline_Expiration
     */
    public java.lang.String getLifeline_Expiration() {
        return lifeline_Expiration;
    }


    /**
     * Sets the lifeline_Expiration value for this LookupAccountByMDN.
     * 
     * @param lifeline_Expiration
     */
    public void setLifeline_Expiration(java.lang.String lifeline_Expiration) {
        this.lifeline_Expiration = lifeline_Expiration;
    }


    /**
     * Gets the billingAddress value for this LookupAccountByMDN.
     * 
     * @return billingAddress
     */
    public java.lang.String getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this LookupAccountByMDN.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(java.lang.String billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the billingAddress2 value for this LookupAccountByMDN.
     * 
     * @return billingAddress2
     */
    public java.lang.String getBillingAddress2() {
        return billingAddress2;
    }


    /**
     * Sets the billingAddress2 value for this LookupAccountByMDN.
     * 
     * @param billingAddress2
     */
    public void setBillingAddress2(java.lang.String billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }


    /**
     * Gets the billingCity value for this LookupAccountByMDN.
     * 
     * @return billingCity
     */
    public java.lang.String getBillingCity() {
        return billingCity;
    }


    /**
     * Sets the billingCity value for this LookupAccountByMDN.
     * 
     * @param billingCity
     */
    public void setBillingCity(java.lang.String billingCity) {
        this.billingCity = billingCity;
    }


    /**
     * Gets the billingState value for this LookupAccountByMDN.
     * 
     * @return billingState
     */
    public java.lang.String getBillingState() {
        return billingState;
    }


    /**
     * Sets the billingState value for this LookupAccountByMDN.
     * 
     * @param billingState
     */
    public void setBillingState(java.lang.String billingState) {
        this.billingState = billingState;
    }


    /**
     * Gets the billingZip value for this LookupAccountByMDN.
     * 
     * @return billingZip
     */
    public java.lang.String getBillingZip() {
        return billingZip;
    }


    /**
     * Sets the billingZip value for this LookupAccountByMDN.
     * 
     * @param billingZip
     */
    public void setBillingZip(java.lang.String billingZip) {
        this.billingZip = billingZip;
    }


    /**
     * Gets the lifelineCode value for this LookupAccountByMDN.
     * 
     * @return lifelineCode
     */
    public int getLifelineCode() {
        return lifelineCode;
    }


    /**
     * Sets the lifelineCode value for this LookupAccountByMDN.
     * 
     * @param lifelineCode
     */
    public void setLifelineCode(int lifelineCode) {
        this.lifelineCode = lifelineCode;
    }


    /**
     * Gets the topUpExpiration value for this LookupAccountByMDN.
     * 
     * @return topUpExpiration
     */
    public java.lang.String getTopUpExpiration() {
        return topUpExpiration;
    }


    /**
     * Sets the topUpExpiration value for this LookupAccountByMDN.
     * 
     * @param topUpExpiration
     */
    public void setTopUpExpiration(java.lang.String topUpExpiration) {
        this.topUpExpiration = topUpExpiration;
    }


    /**
     * Gets the lastCallDateTime value for this LookupAccountByMDN.
     * 
     * @return lastCallDateTime
     */
    public java.lang.String getLastCallDateTime() {
        return lastCallDateTime;
    }


    /**
     * Sets the lastCallDateTime value for this LookupAccountByMDN.
     * 
     * @param lastCallDateTime
     */
    public void setLastCallDateTime(java.lang.String lastCallDateTime) {
        this.lastCallDateTime = lastCallDateTime;
    }


    /**
     * Gets the fromOrToNumber value for this LookupAccountByMDN.
     * 
     * @return fromOrToNumber
     */
    public java.lang.String getFromOrToNumber() {
        return fromOrToNumber;
    }


    /**
     * Sets the fromOrToNumber value for this LookupAccountByMDN.
     * 
     * @param fromOrToNumber
     */
    public void setFromOrToNumber(java.lang.String fromOrToNumber) {
        this.fromOrToNumber = fromOrToNumber;
    }


    /**
     * Gets the alternateIDDesc value for this LookupAccountByMDN.
     * 
     * @return alternateIDDesc
     */
    public java.lang.String getAlternateIDDesc() {
        return alternateIDDesc;
    }


    /**
     * Sets the alternateIDDesc value for this LookupAccountByMDN.
     * 
     * @param alternateIDDesc
     */
    public void setAlternateIDDesc(java.lang.String alternateIDDesc) {
        this.alternateIDDesc = alternateIDDesc;
    }


    /**
     * Gets the alternateIDValue value for this LookupAccountByMDN.
     * 
     * @return alternateIDValue
     */
    public java.lang.String getAlternateIDValue() {
        return alternateIDValue;
    }


    /**
     * Sets the alternateIDValue value for this LookupAccountByMDN.
     * 
     * @param alternateIDValue
     */
    public void setAlternateIDValue(java.lang.String alternateIDValue) {
        this.alternateIDValue = alternateIDValue;
    }


    /**
     * Gets the lifeline value for this LookupAccountByMDN.
     * 
     * @return lifeline
     */
    public boolean isLifeline() {
        return lifeline;
    }


    /**
     * Sets the lifeline value for this LookupAccountByMDN.
     * 
     * @param lifeline
     */
    public void setLifeline(boolean lifeline) {
        this.lifeline = lifeline;
    }


    /**
     * Gets the beneficiary value for this LookupAccountByMDN.
     * 
     * @return beneficiary
     */
    public java.lang.String getBeneficiary() {
        return beneficiary;
    }


    /**
     * Sets the beneficiary value for this LookupAccountByMDN.
     * 
     * @param beneficiary
     */
    public void setBeneficiary(java.lang.String beneficiary) {
        this.beneficiary = beneficiary;
    }


    /**
     * Gets the lastBasePlanPurchase value for this LookupAccountByMDN.
     * 
     * @return lastBasePlanPurchase
     */
    public java.lang.String getLastBasePlanPurchase() {
        return lastBasePlanPurchase;
    }


    /**
     * Sets the lastBasePlanPurchase value for this LookupAccountByMDN.
     * 
     * @param lastBasePlanPurchase
     */
    public void setLastBasePlanPurchase(java.lang.String lastBasePlanPurchase) {
        this.lastBasePlanPurchase = lastBasePlanPurchase;
    }


    /**
     * Gets the balance value for this LookupAccountByMDN.
     * 
     * @return balance
     */
    public double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this LookupAccountByMDN.
     * 
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }


    /**
     * Gets the deviceID value for this LookupAccountByMDN.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this LookupAccountByMDN.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the restrictUTT value for this LookupAccountByMDN.
     * 
     * @return restrictUTT
     */
    public boolean isRestrictUTT() {
        return restrictUTT;
    }


    /**
     * Sets the restrictUTT value for this LookupAccountByMDN.
     * 
     * @param restrictUTT
     */
    public void setRestrictUTT(boolean restrictUTT) {
        this.restrictUTT = restrictUTT;
    }


    /**
     * Gets the accountCompleted value for this LookupAccountByMDN.
     * 
     * @return accountCompleted
     */
    public boolean isAccountCompleted() {
        return accountCompleted;
    }


    /**
     * Sets the accountCompleted value for this LookupAccountByMDN.
     * 
     * @param accountCompleted
     */
    public void setAccountCompleted(boolean accountCompleted) {
        this.accountCompleted = accountCompleted;
    }


    /**
     * Gets the dateCompleted value for this LookupAccountByMDN.
     * 
     * @return dateCompleted
     */
    public java.lang.String getDateCompleted() {
        return dateCompleted;
    }


    /**
     * Sets the dateCompleted value for this LookupAccountByMDN.
     * 
     * @param dateCompleted
     */
    public void setDateCompleted(java.lang.String dateCompleted) {
        this.dateCompleted = dateCompleted;
    }


    /**
     * Gets the voiceOnly value for this LookupAccountByMDN.
     * 
     * @return voiceOnly
     */
    public boolean isVoiceOnly() {
        return voiceOnly;
    }


    /**
     * Sets the voiceOnly value for this LookupAccountByMDN.
     * 
     * @param voiceOnly
     */
    public void setVoiceOnly(boolean voiceOnly) {
        this.voiceOnly = voiceOnly;
    }


    /**
     * Gets the TT_PendingConversion value for this LookupAccountByMDN.
     * 
     * @return TT_PendingConversion
     */
    public boolean isTT_PendingConversion() {
        return TT_PendingConversion;
    }


    /**
     * Sets the TT_PendingConversion value for this LookupAccountByMDN.
     * 
     * @param TT_PendingConversion
     */
    public void setTT_PendingConversion(boolean TT_PendingConversion) {
        this.TT_PendingConversion = TT_PendingConversion;
    }


    /**
     * Gets the TT_ConversionProhibited value for this LookupAccountByMDN.
     * 
     * @return TT_ConversionProhibited
     */
    public boolean isTT_ConversionProhibited() {
        return TT_ConversionProhibited;
    }


    /**
     * Sets the TT_ConversionProhibited value for this LookupAccountByMDN.
     * 
     * @param TT_ConversionProhibited
     */
    public void setTT_ConversionProhibited(boolean TT_ConversionProhibited) {
        this.TT_ConversionProhibited = TT_ConversionProhibited;
    }


    /**
     * Gets the ratePlanPurchaseEligible_Immediate value for this LookupAccountByMDN.
     * 
     * @return ratePlanPurchaseEligible_Immediate
     */
    public boolean isRatePlanPurchaseEligible_Immediate() {
        return ratePlanPurchaseEligible_Immediate;
    }


    /**
     * Sets the ratePlanPurchaseEligible_Immediate value for this LookupAccountByMDN.
     * 
     * @param ratePlanPurchaseEligible_Immediate
     */
    public void setRatePlanPurchaseEligible_Immediate(boolean ratePlanPurchaseEligible_Immediate) {
        this.ratePlanPurchaseEligible_Immediate = ratePlanPurchaseEligible_Immediate;
    }


    /**
     * Gets the ratePlanPurchaseEligible_Advance value for this LookupAccountByMDN.
     * 
     * @return ratePlanPurchaseEligible_Advance
     */
    public boolean isRatePlanPurchaseEligible_Advance() {
        return ratePlanPurchaseEligible_Advance;
    }


    /**
     * Sets the ratePlanPurchaseEligible_Advance value for this LookupAccountByMDN.
     * 
     * @param ratePlanPurchaseEligible_Advance
     */
    public void setRatePlanPurchaseEligible_Advance(boolean ratePlanPurchaseEligible_Advance) {
        this.ratePlanPurchaseEligible_Advance = ratePlanPurchaseEligible_Advance;
    }


    /**
     * Gets the serviceEndDate value for this LookupAccountByMDN.
     * 
     * @return serviceEndDate
     */
    public java.lang.String getServiceEndDate() {
        return serviceEndDate;
    }


    /**
     * Sets the serviceEndDate value for this LookupAccountByMDN.
     * 
     * @param serviceEndDate
     */
    public void setServiceEndDate(java.lang.String serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }


    /**
     * Gets the ratePlanDisplay value for this LookupAccountByMDN.
     * 
     * @return ratePlanDisplay
     */
    public java.lang.String getRatePlanDisplay() {
        return ratePlanDisplay;
    }


    /**
     * Sets the ratePlanDisplay value for this LookupAccountByMDN.
     * 
     * @param ratePlanDisplay
     */
    public void setRatePlanDisplay(java.lang.String ratePlanDisplay) {
        this.ratePlanDisplay = ratePlanDisplay;
    }


    /**
     * Gets the validForPayment value for this LookupAccountByMDN.
     * 
     * @return validForPayment
     */
    public boolean isValidForPayment() {
        return validForPayment;
    }


    /**
     * Sets the validForPayment value for this LookupAccountByMDN.
     * 
     * @param validForPayment
     */
    public void setValidForPayment(boolean validForPayment) {
        this.validForPayment = validForPayment;
    }


    /**
     * Gets the recertificationMustUpdate value for this LookupAccountByMDN.
     * 
     * @return recertificationMustUpdate
     */
    public boolean isRecertificationMustUpdate() {
        return recertificationMustUpdate;
    }


    /**
     * Sets the recertificationMustUpdate value for this LookupAccountByMDN.
     * 
     * @param recertificationMustUpdate
     */
    public void setRecertificationMustUpdate(boolean recertificationMustUpdate) {
        this.recertificationMustUpdate = recertificationMustUpdate;
    }


    /**
     * Gets the validForRecertification value for this LookupAccountByMDN.
     * 
     * @return validForRecertification
     */
    public boolean isValidForRecertification() {
        return validForRecertification;
    }


    /**
     * Sets the validForRecertification value for this LookupAccountByMDN.
     * 
     * @param validForRecertification
     */
    public void setValidForRecertification(boolean validForRecertification) {
        this.validForRecertification = validForRecertification;
    }


    /**
     * Gets the commissionableRecertification value for this LookupAccountByMDN.
     * 
     * @return commissionableRecertification
     */
    public boolean isCommissionableRecertification() {
        return commissionableRecertification;
    }


    /**
     * Sets the commissionableRecertification value for this LookupAccountByMDN.
     * 
     * @param commissionableRecertification
     */
    public void setCommissionableRecertification(boolean commissionableRecertification) {
        this.commissionableRecertification = commissionableRecertification;
    }


    /**
     * Gets the validForTopup value for this LookupAccountByMDN.
     * 
     * @return validForTopup
     */
    public boolean isValidForTopup() {
        return validForTopup;
    }


    /**
     * Sets the validForTopup value for this LookupAccountByMDN.
     * 
     * @param validForTopup
     */
    public void setValidForTopup(boolean validForTopup) {
        this.validForTopup = validForTopup;
    }


    /**
     * Gets the recertificationCreditEarned value for this LookupAccountByMDN.
     * 
     * @return recertificationCreditEarned
     */
    public int getRecertificationCreditEarned() {
        return recertificationCreditEarned;
    }


    /**
     * Sets the recertificationCreditEarned value for this LookupAccountByMDN.
     * 
     * @param recertificationCreditEarned
     */
    public void setRecertificationCreditEarned(int recertificationCreditEarned) {
        this.recertificationCreditEarned = recertificationCreditEarned;
    }


    /**
     * Gets the validForAccountDetails value for this LookupAccountByMDN.
     * 
     * @return validForAccountDetails
     */
    public boolean isValidForAccountDetails() {
        return validForAccountDetails;
    }


    /**
     * Sets the validForAccountDetails value for this LookupAccountByMDN.
     * 
     * @param validForAccountDetails
     */
    public void setValidForAccountDetails(boolean validForAccountDetails) {
        this.validForAccountDetails = validForAccountDetails;
    }


    /**
     * Gets the ruralAddress value for this LookupAccountByMDN.
     * 
     * @return ruralAddress
     */
    public boolean isRuralAddress() {
        return ruralAddress;
    }


    /**
     * Sets the ruralAddress value for this LookupAccountByMDN.
     * 
     * @param ruralAddress
     */
    public void setRuralAddress(boolean ruralAddress) {
        this.ruralAddress = ruralAddress;
    }


    /**
     * Gets the stateRegCode2 value for this LookupAccountByMDN.
     * 
     * @return stateRegCode2
     */
    public java.lang.String getStateRegCode2() {
        return stateRegCode2;
    }


    /**
     * Sets the stateRegCode2 value for this LookupAccountByMDN.
     * 
     * @param stateRegCode2
     */
    public void setStateRegCode2(java.lang.String stateRegCode2) {
        this.stateRegCode2 = stateRegCode2;
    }


    /**
     * Gets the IMSI value for this LookupAccountByMDN.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this LookupAccountByMDN.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the validForPlanChange value for this LookupAccountByMDN.
     * 
     * @return validForPlanChange
     */
    public boolean isValidForPlanChange() {
        return validForPlanChange;
    }


    /**
     * Sets the validForPlanChange value for this LookupAccountByMDN.
     * 
     * @param validForPlanChange
     */
    public void setValidForPlanChange(boolean validForPlanChange) {
        this.validForPlanChange = validForPlanChange;
    }


    /**
     * Gets the migrationInProgress value for this LookupAccountByMDN.
     * 
     * @return migrationInProgress
     */
    public boolean isMigrationInProgress() {
        return migrationInProgress;
    }


    /**
     * Sets the migrationInProgress value for this LookupAccountByMDN.
     * 
     * @param migrationInProgress
     */
    public void setMigrationInProgress(boolean migrationInProgress) {
        this.migrationInProgress = migrationInProgress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookupAccountByMDN)) return false;
        LookupAccountByMDN other = (LookupAccountByMDN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.budgetMobileId == other.getBudgetMobileId() &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            this.accountCredits == other.getAccountCredits() &&
            this.providerID == other.getProviderID() &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.SSN==null && other.getSSN()==null) || 
             (this.SSN!=null &&
              this.SSN.equals(other.getSSN()))) &&
            ((this.birthdate==null && other.getBirthdate()==null) || 
             (this.birthdate!=null &&
              this.birthdate.equals(other.getBirthdate()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.ZIP==null && other.getZIP()==null) || 
             (this.ZIP!=null &&
              this.ZIP.equals(other.getZIP()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.contactNumber==null && other.getContactNumber()==null) || 
             (this.contactNumber!=null &&
              this.contactNumber.equals(other.getContactNumber()))) &&
            ((this.lifeLineCodeName==null && other.getLifeLineCodeName()==null) || 
             (this.lifeLineCodeName!=null &&
              this.lifeLineCodeName.equals(other.getLifeLineCodeName()))) &&
            ((this.lifeline_Expiration==null && other.getLifeline_Expiration()==null) || 
             (this.lifeline_Expiration!=null &&
              this.lifeline_Expiration.equals(other.getLifeline_Expiration()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.billingAddress2==null && other.getBillingAddress2()==null) || 
             (this.billingAddress2!=null &&
              this.billingAddress2.equals(other.getBillingAddress2()))) &&
            ((this.billingCity==null && other.getBillingCity()==null) || 
             (this.billingCity!=null &&
              this.billingCity.equals(other.getBillingCity()))) &&
            ((this.billingState==null && other.getBillingState()==null) || 
             (this.billingState!=null &&
              this.billingState.equals(other.getBillingState()))) &&
            ((this.billingZip==null && other.getBillingZip()==null) || 
             (this.billingZip!=null &&
              this.billingZip.equals(other.getBillingZip()))) &&
            this.lifelineCode == other.getLifelineCode() &&
            ((this.topUpExpiration==null && other.getTopUpExpiration()==null) || 
             (this.topUpExpiration!=null &&
              this.topUpExpiration.equals(other.getTopUpExpiration()))) &&
            ((this.lastCallDateTime==null && other.getLastCallDateTime()==null) || 
             (this.lastCallDateTime!=null &&
              this.lastCallDateTime.equals(other.getLastCallDateTime()))) &&
            ((this.fromOrToNumber==null && other.getFromOrToNumber()==null) || 
             (this.fromOrToNumber!=null &&
              this.fromOrToNumber.equals(other.getFromOrToNumber()))) &&
            ((this.alternateIDDesc==null && other.getAlternateIDDesc()==null) || 
             (this.alternateIDDesc!=null &&
              this.alternateIDDesc.equals(other.getAlternateIDDesc()))) &&
            ((this.alternateIDValue==null && other.getAlternateIDValue()==null) || 
             (this.alternateIDValue!=null &&
              this.alternateIDValue.equals(other.getAlternateIDValue()))) &&
            this.lifeline == other.isLifeline() &&
            ((this.beneficiary==null && other.getBeneficiary()==null) || 
             (this.beneficiary!=null &&
              this.beneficiary.equals(other.getBeneficiary()))) &&
            ((this.lastBasePlanPurchase==null && other.getLastBasePlanPurchase()==null) || 
             (this.lastBasePlanPurchase!=null &&
              this.lastBasePlanPurchase.equals(other.getLastBasePlanPurchase()))) &&
            this.balance == other.getBalance() &&
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            this.restrictUTT == other.isRestrictUTT() &&
            this.accountCompleted == other.isAccountCompleted() &&
            ((this.dateCompleted==null && other.getDateCompleted()==null) || 
             (this.dateCompleted!=null &&
              this.dateCompleted.equals(other.getDateCompleted()))) &&
            this.voiceOnly == other.isVoiceOnly() &&
            this.TT_PendingConversion == other.isTT_PendingConversion() &&
            this.TT_ConversionProhibited == other.isTT_ConversionProhibited() &&
            this.ratePlanPurchaseEligible_Immediate == other.isRatePlanPurchaseEligible_Immediate() &&
            this.ratePlanPurchaseEligible_Advance == other.isRatePlanPurchaseEligible_Advance() &&
            ((this.serviceEndDate==null && other.getServiceEndDate()==null) || 
             (this.serviceEndDate!=null &&
              this.serviceEndDate.equals(other.getServiceEndDate()))) &&
            ((this.ratePlanDisplay==null && other.getRatePlanDisplay()==null) || 
             (this.ratePlanDisplay!=null &&
              this.ratePlanDisplay.equals(other.getRatePlanDisplay()))) &&
            this.validForPayment == other.isValidForPayment() &&
            this.recertificationMustUpdate == other.isRecertificationMustUpdate() &&
            this.validForRecertification == other.isValidForRecertification() &&
            this.commissionableRecertification == other.isCommissionableRecertification() &&
            this.validForTopup == other.isValidForTopup() &&
            this.recertificationCreditEarned == other.getRecertificationCreditEarned() &&
            this.validForAccountDetails == other.isValidForAccountDetails() &&
            this.ruralAddress == other.isRuralAddress() &&
            ((this.stateRegCode2==null && other.getStateRegCode2()==null) || 
             (this.stateRegCode2!=null &&
              this.stateRegCode2.equals(other.getStateRegCode2()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            this.validForPlanChange == other.isValidForPlanChange() &&
            this.migrationInProgress == other.isMigrationInProgress();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += getBudgetMobileId();
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        _hashCode += getAccountCredits();
        _hashCode += getProviderID();
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getSSN() != null) {
            _hashCode += getSSN().hashCode();
        }
        if (getBirthdate() != null) {
            _hashCode += getBirthdate().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZIP() != null) {
            _hashCode += getZIP().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getContactNumber() != null) {
            _hashCode += getContactNumber().hashCode();
        }
        if (getLifeLineCodeName() != null) {
            _hashCode += getLifeLineCodeName().hashCode();
        }
        if (getLifeline_Expiration() != null) {
            _hashCode += getLifeline_Expiration().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getBillingAddress2() != null) {
            _hashCode += getBillingAddress2().hashCode();
        }
        if (getBillingCity() != null) {
            _hashCode += getBillingCity().hashCode();
        }
        if (getBillingState() != null) {
            _hashCode += getBillingState().hashCode();
        }
        if (getBillingZip() != null) {
            _hashCode += getBillingZip().hashCode();
        }
        _hashCode += getLifelineCode();
        if (getTopUpExpiration() != null) {
            _hashCode += getTopUpExpiration().hashCode();
        }
        if (getLastCallDateTime() != null) {
            _hashCode += getLastCallDateTime().hashCode();
        }
        if (getFromOrToNumber() != null) {
            _hashCode += getFromOrToNumber().hashCode();
        }
        if (getAlternateIDDesc() != null) {
            _hashCode += getAlternateIDDesc().hashCode();
        }
        if (getAlternateIDValue() != null) {
            _hashCode += getAlternateIDValue().hashCode();
        }
        _hashCode += (isLifeline() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBeneficiary() != null) {
            _hashCode += getBeneficiary().hashCode();
        }
        if (getLastBasePlanPurchase() != null) {
            _hashCode += getLastBasePlanPurchase().hashCode();
        }
        _hashCode += new Double(getBalance()).hashCode();
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        _hashCode += (isRestrictUTT() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAccountCompleted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDateCompleted() != null) {
            _hashCode += getDateCompleted().hashCode();
        }
        _hashCode += (isVoiceOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTT_PendingConversion() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTT_ConversionProhibited() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRatePlanPurchaseEligible_Immediate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRatePlanPurchaseEligible_Advance() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getServiceEndDate() != null) {
            _hashCode += getServiceEndDate().hashCode();
        }
        if (getRatePlanDisplay() != null) {
            _hashCode += getRatePlanDisplay().hashCode();
        }
        _hashCode += (isValidForPayment() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRecertificationMustUpdate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isValidForRecertification() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCommissionableRecertification() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isValidForTopup() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getRecertificationCreditEarned();
        _hashCode += (isValidForAccountDetails() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRuralAddress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStateRegCode2() != null) {
            _hashCode += getStateRegCode2().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        _hashCode += (isValidForPlanChange() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMigrationInProgress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LookupAccountByMDN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "LookupAccountByMDN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetMobileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BudgetMobileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCredits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AccountCredits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProviderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MobileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Birthdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ContactNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeLineCodeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LifeLineCodeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeline_Expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Lifeline_Expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BillingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BillingAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BillingCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BillingState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingZip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BillingZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifelineCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LifelineCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUpExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCallDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LastCallDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromOrToNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FromOrToNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateIDDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AlternateIDDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateIDValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AlternateIDValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Lifeline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beneficiary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Beneficiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBasePlanPurchase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LastBasePlanPurchase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictUTT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RestrictUTT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AccountCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DateCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VoiceOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TT_PendingConversion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TT_PendingConversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TT_ConversionProhibited");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TT_ConversionProhibited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanPurchaseEligible_Immediate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RatePlanPurchaseEligible_Immediate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanPurchaseEligible_Advance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RatePlanPurchaseEligible_Advance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ServiceEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RatePlanDisplay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validForPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValidForPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recertificationMustUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RecertificationMustUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validForRecertification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValidForRecertification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionableRecertification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CommissionableRecertification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validForTopup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValidForTopup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recertificationCreditEarned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RecertificationCreditEarned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validForAccountDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValidForAccountDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruralAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RuralAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateRegCode2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StateRegCode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validForPlanChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValidForPlanChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("migrationInProgress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MigrationInProgress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
