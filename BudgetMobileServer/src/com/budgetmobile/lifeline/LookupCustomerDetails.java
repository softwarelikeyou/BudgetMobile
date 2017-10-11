/**
 * LookupCustomerDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class LookupCustomerDetails  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private boolean customerDetailsAvailable;

    private long budgetmobileID;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String status;

    private java.lang.String providerID;

    private java.lang.String providerName;

    private java.lang.String accountCredits;

    private java.lang.String mobileNumber;

    private java.lang.String SSN;

    private java.lang.String birthDate;

    private java.lang.String address1;

    private java.lang.String address2;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zip;

    private java.lang.String emailAddress;

    private java.lang.String contactNumber;

    private java.lang.String lifeline;

    private java.lang.String lifeline_Expiration;

    private java.lang.String billingAddress;

    private java.lang.String billingAddress2;

    private java.lang.String billingCity;

    private java.lang.String billingState;

    private java.lang.String billingZip;

    private java.lang.String topUpExpiration;

    private java.lang.String alternateIDDesc;

    private java.lang.String alternateIDValue;

    private java.lang.String beneficiary;

    private java.lang.String balance;

    private java.lang.String deviceID;

    private java.lang.String accountCompleted;

    private java.lang.String dateCompleted;

    private java.lang.String voiceOnly;

    private java.lang.String ratePlanPurchaseEligible_Immediate;

    private java.lang.String ratePlanPurchaseEligible_Advance;

    private java.lang.String serviceEndDate;

    private java.lang.String ratePlanDisplay;

    private java.lang.String serviceStartDate;

    private java.lang.String IMEI;

    private java.lang.String SIM;

    private java.lang.String servicePlan;

    private java.lang.String employee;

    private java.lang.String prequalificationCode;

    private java.lang.String HOHC;

    private java.lang.String lastCallDateTime;

    private java.lang.String fromOrToNumber;

    private java.lang.String stateRegCode;

    private java.lang.String documentVerification;

    private java.lang.String beneficiaryFirstName;

    private java.lang.String beneficiaryLastName;

    private java.lang.String beneficiaryDOB;

    private java.lang.String beneficiarySSN;

    private java.lang.String lifelineCodeName;

    private java.lang.String lifelineCode;

    private java.lang.String gatewayUse;

    private java.lang.String statusID;

    private java.lang.String directNonLifeline;

    private java.lang.String productID;

    private java.lang.String ruralAddress;

    private java.lang.String stateRegCode2;

    private java.lang.String IMSI;

    private boolean validForPlanChange;

    private boolean migrationInProgress;

    public LookupCustomerDetails() {
    }

    public LookupCustomerDetails(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           boolean customerDetailsAvailable,
           long budgetmobileID,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String status,
           java.lang.String providerID,
           java.lang.String providerName,
           java.lang.String accountCredits,
           java.lang.String mobileNumber,
           java.lang.String SSN,
           java.lang.String birthDate,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zip,
           java.lang.String emailAddress,
           java.lang.String contactNumber,
           java.lang.String lifeline,
           java.lang.String lifeline_Expiration,
           java.lang.String billingAddress,
           java.lang.String billingAddress2,
           java.lang.String billingCity,
           java.lang.String billingState,
           java.lang.String billingZip,
           java.lang.String topUpExpiration,
           java.lang.String alternateIDDesc,
           java.lang.String alternateIDValue,
           java.lang.String beneficiary,
           java.lang.String balance,
           java.lang.String deviceID,
           java.lang.String accountCompleted,
           java.lang.String dateCompleted,
           java.lang.String voiceOnly,
           java.lang.String ratePlanPurchaseEligible_Immediate,
           java.lang.String ratePlanPurchaseEligible_Advance,
           java.lang.String serviceEndDate,
           java.lang.String ratePlanDisplay,
           java.lang.String serviceStartDate,
           java.lang.String IMEI,
           java.lang.String SIM,
           java.lang.String servicePlan,
           java.lang.String employee,
           java.lang.String prequalificationCode,
           java.lang.String HOHC,
           java.lang.String lastCallDateTime,
           java.lang.String fromOrToNumber,
           java.lang.String stateRegCode,
           java.lang.String documentVerification,
           java.lang.String beneficiaryFirstName,
           java.lang.String beneficiaryLastName,
           java.lang.String beneficiaryDOB,
           java.lang.String beneficiarySSN,
           java.lang.String lifelineCodeName,
           java.lang.String lifelineCode,
           java.lang.String gatewayUse,
           java.lang.String statusID,
           java.lang.String directNonLifeline,
           java.lang.String productID,
           java.lang.String ruralAddress,
           java.lang.String stateRegCode2,
           java.lang.String IMSI,
           boolean validForPlanChange,
           boolean migrationInProgress) {
        super(
            errors,
            isError);
        this.customerDetailsAvailable = customerDetailsAvailable;
        this.budgetmobileID = budgetmobileID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.providerID = providerID;
        this.providerName = providerName;
        this.accountCredits = accountCredits;
        this.mobileNumber = mobileNumber;
        this.SSN = SSN;
        this.birthDate = birthDate;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
        this.lifeline = lifeline;
        this.lifeline_Expiration = lifeline_Expiration;
        this.billingAddress = billingAddress;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.topUpExpiration = topUpExpiration;
        this.alternateIDDesc = alternateIDDesc;
        this.alternateIDValue = alternateIDValue;
        this.beneficiary = beneficiary;
        this.balance = balance;
        this.deviceID = deviceID;
        this.accountCompleted = accountCompleted;
        this.dateCompleted = dateCompleted;
        this.voiceOnly = voiceOnly;
        this.ratePlanPurchaseEligible_Immediate = ratePlanPurchaseEligible_Immediate;
        this.ratePlanPurchaseEligible_Advance = ratePlanPurchaseEligible_Advance;
        this.serviceEndDate = serviceEndDate;
        this.ratePlanDisplay = ratePlanDisplay;
        this.serviceStartDate = serviceStartDate;
        this.IMEI = IMEI;
        this.SIM = SIM;
        this.servicePlan = servicePlan;
        this.employee = employee;
        this.prequalificationCode = prequalificationCode;
        this.HOHC = HOHC;
        this.lastCallDateTime = lastCallDateTime;
        this.fromOrToNumber = fromOrToNumber;
        this.stateRegCode = stateRegCode;
        this.documentVerification = documentVerification;
        this.beneficiaryFirstName = beneficiaryFirstName;
        this.beneficiaryLastName = beneficiaryLastName;
        this.beneficiaryDOB = beneficiaryDOB;
        this.beneficiarySSN = beneficiarySSN;
        this.lifelineCodeName = lifelineCodeName;
        this.lifelineCode = lifelineCode;
        this.gatewayUse = gatewayUse;
        this.statusID = statusID;
        this.directNonLifeline = directNonLifeline;
        this.productID = productID;
        this.ruralAddress = ruralAddress;
        this.stateRegCode2 = stateRegCode2;
        this.IMSI = IMSI;
        this.validForPlanChange = validForPlanChange;
        this.migrationInProgress = migrationInProgress;
    }


    /**
     * Gets the customerDetailsAvailable value for this LookupCustomerDetails.
     * 
     * @return customerDetailsAvailable
     */
    public boolean isCustomerDetailsAvailable() {
        return customerDetailsAvailable;
    }


    /**
     * Sets the customerDetailsAvailable value for this LookupCustomerDetails.
     * 
     * @param customerDetailsAvailable
     */
    public void setCustomerDetailsAvailable(boolean customerDetailsAvailable) {
        this.customerDetailsAvailable = customerDetailsAvailable;
    }


    /**
     * Gets the budgetmobileID value for this LookupCustomerDetails.
     * 
     * @return budgetmobileID
     */
    public long getBudgetmobileID() {
        return budgetmobileID;
    }


    /**
     * Sets the budgetmobileID value for this LookupCustomerDetails.
     * 
     * @param budgetmobileID
     */
    public void setBudgetmobileID(long budgetmobileID) {
        this.budgetmobileID = budgetmobileID;
    }


    /**
     * Gets the firstName value for this LookupCustomerDetails.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this LookupCustomerDetails.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this LookupCustomerDetails.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this LookupCustomerDetails.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the status value for this LookupCustomerDetails.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LookupCustomerDetails.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the providerID value for this LookupCustomerDetails.
     * 
     * @return providerID
     */
    public java.lang.String getProviderID() {
        return providerID;
    }


    /**
     * Sets the providerID value for this LookupCustomerDetails.
     * 
     * @param providerID
     */
    public void setProviderID(java.lang.String providerID) {
        this.providerID = providerID;
    }


    /**
     * Gets the providerName value for this LookupCustomerDetails.
     * 
     * @return providerName
     */
    public java.lang.String getProviderName() {
        return providerName;
    }


    /**
     * Sets the providerName value for this LookupCustomerDetails.
     * 
     * @param providerName
     */
    public void setProviderName(java.lang.String providerName) {
        this.providerName = providerName;
    }


    /**
     * Gets the accountCredits value for this LookupCustomerDetails.
     * 
     * @return accountCredits
     */
    public java.lang.String getAccountCredits() {
        return accountCredits;
    }


    /**
     * Sets the accountCredits value for this LookupCustomerDetails.
     * 
     * @param accountCredits
     */
    public void setAccountCredits(java.lang.String accountCredits) {
        this.accountCredits = accountCredits;
    }


    /**
     * Gets the mobileNumber value for this LookupCustomerDetails.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this LookupCustomerDetails.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the SSN value for this LookupCustomerDetails.
     * 
     * @return SSN
     */
    public java.lang.String getSSN() {
        return SSN;
    }


    /**
     * Sets the SSN value for this LookupCustomerDetails.
     * 
     * @param SSN
     */
    public void setSSN(java.lang.String SSN) {
        this.SSN = SSN;
    }


    /**
     * Gets the birthDate value for this LookupCustomerDetails.
     * 
     * @return birthDate
     */
    public java.lang.String getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this LookupCustomerDetails.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.lang.String birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the address1 value for this LookupCustomerDetails.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this LookupCustomerDetails.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this LookupCustomerDetails.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this LookupCustomerDetails.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this LookupCustomerDetails.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this LookupCustomerDetails.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this LookupCustomerDetails.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this LookupCustomerDetails.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this LookupCustomerDetails.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this LookupCustomerDetails.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the emailAddress value for this LookupCustomerDetails.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this LookupCustomerDetails.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the contactNumber value for this LookupCustomerDetails.
     * 
     * @return contactNumber
     */
    public java.lang.String getContactNumber() {
        return contactNumber;
    }


    /**
     * Sets the contactNumber value for this LookupCustomerDetails.
     * 
     * @param contactNumber
     */
    public void setContactNumber(java.lang.String contactNumber) {
        this.contactNumber = contactNumber;
    }


    /**
     * Gets the lifeline value for this LookupCustomerDetails.
     * 
     * @return lifeline
     */
    public java.lang.String getLifeline() {
        return lifeline;
    }


    /**
     * Sets the lifeline value for this LookupCustomerDetails.
     * 
     * @param lifeline
     */
    public void setLifeline(java.lang.String lifeline) {
        this.lifeline = lifeline;
    }


    /**
     * Gets the lifeline_Expiration value for this LookupCustomerDetails.
     * 
     * @return lifeline_Expiration
     */
    public java.lang.String getLifeline_Expiration() {
        return lifeline_Expiration;
    }


    /**
     * Sets the lifeline_Expiration value for this LookupCustomerDetails.
     * 
     * @param lifeline_Expiration
     */
    public void setLifeline_Expiration(java.lang.String lifeline_Expiration) {
        this.lifeline_Expiration = lifeline_Expiration;
    }


    /**
     * Gets the billingAddress value for this LookupCustomerDetails.
     * 
     * @return billingAddress
     */
    public java.lang.String getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this LookupCustomerDetails.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(java.lang.String billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the billingAddress2 value for this LookupCustomerDetails.
     * 
     * @return billingAddress2
     */
    public java.lang.String getBillingAddress2() {
        return billingAddress2;
    }


    /**
     * Sets the billingAddress2 value for this LookupCustomerDetails.
     * 
     * @param billingAddress2
     */
    public void setBillingAddress2(java.lang.String billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }


    /**
     * Gets the billingCity value for this LookupCustomerDetails.
     * 
     * @return billingCity
     */
    public java.lang.String getBillingCity() {
        return billingCity;
    }


    /**
     * Sets the billingCity value for this LookupCustomerDetails.
     * 
     * @param billingCity
     */
    public void setBillingCity(java.lang.String billingCity) {
        this.billingCity = billingCity;
    }


    /**
     * Gets the billingState value for this LookupCustomerDetails.
     * 
     * @return billingState
     */
    public java.lang.String getBillingState() {
        return billingState;
    }


    /**
     * Sets the billingState value for this LookupCustomerDetails.
     * 
     * @param billingState
     */
    public void setBillingState(java.lang.String billingState) {
        this.billingState = billingState;
    }


    /**
     * Gets the billingZip value for this LookupCustomerDetails.
     * 
     * @return billingZip
     */
    public java.lang.String getBillingZip() {
        return billingZip;
    }


    /**
     * Sets the billingZip value for this LookupCustomerDetails.
     * 
     * @param billingZip
     */
    public void setBillingZip(java.lang.String billingZip) {
        this.billingZip = billingZip;
    }


    /**
     * Gets the topUpExpiration value for this LookupCustomerDetails.
     * 
     * @return topUpExpiration
     */
    public java.lang.String getTopUpExpiration() {
        return topUpExpiration;
    }


    /**
     * Sets the topUpExpiration value for this LookupCustomerDetails.
     * 
     * @param topUpExpiration
     */
    public void setTopUpExpiration(java.lang.String topUpExpiration) {
        this.topUpExpiration = topUpExpiration;
    }


    /**
     * Gets the alternateIDDesc value for this LookupCustomerDetails.
     * 
     * @return alternateIDDesc
     */
    public java.lang.String getAlternateIDDesc() {
        return alternateIDDesc;
    }


    /**
     * Sets the alternateIDDesc value for this LookupCustomerDetails.
     * 
     * @param alternateIDDesc
     */
    public void setAlternateIDDesc(java.lang.String alternateIDDesc) {
        this.alternateIDDesc = alternateIDDesc;
    }


    /**
     * Gets the alternateIDValue value for this LookupCustomerDetails.
     * 
     * @return alternateIDValue
     */
    public java.lang.String getAlternateIDValue() {
        return alternateIDValue;
    }


    /**
     * Sets the alternateIDValue value for this LookupCustomerDetails.
     * 
     * @param alternateIDValue
     */
    public void setAlternateIDValue(java.lang.String alternateIDValue) {
        this.alternateIDValue = alternateIDValue;
    }


    /**
     * Gets the beneficiary value for this LookupCustomerDetails.
     * 
     * @return beneficiary
     */
    public java.lang.String getBeneficiary() {
        return beneficiary;
    }


    /**
     * Sets the beneficiary value for this LookupCustomerDetails.
     * 
     * @param beneficiary
     */
    public void setBeneficiary(java.lang.String beneficiary) {
        this.beneficiary = beneficiary;
    }


    /**
     * Gets the balance value for this LookupCustomerDetails.
     * 
     * @return balance
     */
    public java.lang.String getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this LookupCustomerDetails.
     * 
     * @param balance
     */
    public void setBalance(java.lang.String balance) {
        this.balance = balance;
    }


    /**
     * Gets the deviceID value for this LookupCustomerDetails.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this LookupCustomerDetails.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the accountCompleted value for this LookupCustomerDetails.
     * 
     * @return accountCompleted
     */
    public java.lang.String getAccountCompleted() {
        return accountCompleted;
    }


    /**
     * Sets the accountCompleted value for this LookupCustomerDetails.
     * 
     * @param accountCompleted
     */
    public void setAccountCompleted(java.lang.String accountCompleted) {
        this.accountCompleted = accountCompleted;
    }


    /**
     * Gets the dateCompleted value for this LookupCustomerDetails.
     * 
     * @return dateCompleted
     */
    public java.lang.String getDateCompleted() {
        return dateCompleted;
    }


    /**
     * Sets the dateCompleted value for this LookupCustomerDetails.
     * 
     * @param dateCompleted
     */
    public void setDateCompleted(java.lang.String dateCompleted) {
        this.dateCompleted = dateCompleted;
    }


    /**
     * Gets the voiceOnly value for this LookupCustomerDetails.
     * 
     * @return voiceOnly
     */
    public java.lang.String getVoiceOnly() {
        return voiceOnly;
    }


    /**
     * Sets the voiceOnly value for this LookupCustomerDetails.
     * 
     * @param voiceOnly
     */
    public void setVoiceOnly(java.lang.String voiceOnly) {
        this.voiceOnly = voiceOnly;
    }


    /**
     * Gets the ratePlanPurchaseEligible_Immediate value for this LookupCustomerDetails.
     * 
     * @return ratePlanPurchaseEligible_Immediate
     */
    public java.lang.String getRatePlanPurchaseEligible_Immediate() {
        return ratePlanPurchaseEligible_Immediate;
    }


    /**
     * Sets the ratePlanPurchaseEligible_Immediate value for this LookupCustomerDetails.
     * 
     * @param ratePlanPurchaseEligible_Immediate
     */
    public void setRatePlanPurchaseEligible_Immediate(java.lang.String ratePlanPurchaseEligible_Immediate) {
        this.ratePlanPurchaseEligible_Immediate = ratePlanPurchaseEligible_Immediate;
    }


    /**
     * Gets the ratePlanPurchaseEligible_Advance value for this LookupCustomerDetails.
     * 
     * @return ratePlanPurchaseEligible_Advance
     */
    public java.lang.String getRatePlanPurchaseEligible_Advance() {
        return ratePlanPurchaseEligible_Advance;
    }


    /**
     * Sets the ratePlanPurchaseEligible_Advance value for this LookupCustomerDetails.
     * 
     * @param ratePlanPurchaseEligible_Advance
     */
    public void setRatePlanPurchaseEligible_Advance(java.lang.String ratePlanPurchaseEligible_Advance) {
        this.ratePlanPurchaseEligible_Advance = ratePlanPurchaseEligible_Advance;
    }


    /**
     * Gets the serviceEndDate value for this LookupCustomerDetails.
     * 
     * @return serviceEndDate
     */
    public java.lang.String getServiceEndDate() {
        return serviceEndDate;
    }


    /**
     * Sets the serviceEndDate value for this LookupCustomerDetails.
     * 
     * @param serviceEndDate
     */
    public void setServiceEndDate(java.lang.String serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }


    /**
     * Gets the ratePlanDisplay value for this LookupCustomerDetails.
     * 
     * @return ratePlanDisplay
     */
    public java.lang.String getRatePlanDisplay() {
        return ratePlanDisplay;
    }


    /**
     * Sets the ratePlanDisplay value for this LookupCustomerDetails.
     * 
     * @param ratePlanDisplay
     */
    public void setRatePlanDisplay(java.lang.String ratePlanDisplay) {
        this.ratePlanDisplay = ratePlanDisplay;
    }


    /**
     * Gets the serviceStartDate value for this LookupCustomerDetails.
     * 
     * @return serviceStartDate
     */
    public java.lang.String getServiceStartDate() {
        return serviceStartDate;
    }


    /**
     * Sets the serviceStartDate value for this LookupCustomerDetails.
     * 
     * @param serviceStartDate
     */
    public void setServiceStartDate(java.lang.String serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }


    /**
     * Gets the IMEI value for this LookupCustomerDetails.
     * 
     * @return IMEI
     */
    public java.lang.String getIMEI() {
        return IMEI;
    }


    /**
     * Sets the IMEI value for this LookupCustomerDetails.
     * 
     * @param IMEI
     */
    public void setIMEI(java.lang.String IMEI) {
        this.IMEI = IMEI;
    }


    /**
     * Gets the SIM value for this LookupCustomerDetails.
     * 
     * @return SIM
     */
    public java.lang.String getSIM() {
        return SIM;
    }


    /**
     * Sets the SIM value for this LookupCustomerDetails.
     * 
     * @param SIM
     */
    public void setSIM(java.lang.String SIM) {
        this.SIM = SIM;
    }


    /**
     * Gets the servicePlan value for this LookupCustomerDetails.
     * 
     * @return servicePlan
     */
    public java.lang.String getServicePlan() {
        return servicePlan;
    }


    /**
     * Sets the servicePlan value for this LookupCustomerDetails.
     * 
     * @param servicePlan
     */
    public void setServicePlan(java.lang.String servicePlan) {
        this.servicePlan = servicePlan;
    }


    /**
     * Gets the employee value for this LookupCustomerDetails.
     * 
     * @return employee
     */
    public java.lang.String getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this LookupCustomerDetails.
     * 
     * @param employee
     */
    public void setEmployee(java.lang.String employee) {
        this.employee = employee;
    }


    /**
     * Gets the prequalificationCode value for this LookupCustomerDetails.
     * 
     * @return prequalificationCode
     */
    public java.lang.String getPrequalificationCode() {
        return prequalificationCode;
    }


    /**
     * Sets the prequalificationCode value for this LookupCustomerDetails.
     * 
     * @param prequalificationCode
     */
    public void setPrequalificationCode(java.lang.String prequalificationCode) {
        this.prequalificationCode = prequalificationCode;
    }


    /**
     * Gets the HOHC value for this LookupCustomerDetails.
     * 
     * @return HOHC
     */
    public java.lang.String getHOHC() {
        return HOHC;
    }


    /**
     * Sets the HOHC value for this LookupCustomerDetails.
     * 
     * @param HOHC
     */
    public void setHOHC(java.lang.String HOHC) {
        this.HOHC = HOHC;
    }


    /**
     * Gets the lastCallDateTime value for this LookupCustomerDetails.
     * 
     * @return lastCallDateTime
     */
    public java.lang.String getLastCallDateTime() {
        return lastCallDateTime;
    }


    /**
     * Sets the lastCallDateTime value for this LookupCustomerDetails.
     * 
     * @param lastCallDateTime
     */
    public void setLastCallDateTime(java.lang.String lastCallDateTime) {
        this.lastCallDateTime = lastCallDateTime;
    }


    /**
     * Gets the fromOrToNumber value for this LookupCustomerDetails.
     * 
     * @return fromOrToNumber
     */
    public java.lang.String getFromOrToNumber() {
        return fromOrToNumber;
    }


    /**
     * Sets the fromOrToNumber value for this LookupCustomerDetails.
     * 
     * @param fromOrToNumber
     */
    public void setFromOrToNumber(java.lang.String fromOrToNumber) {
        this.fromOrToNumber = fromOrToNumber;
    }


    /**
     * Gets the stateRegCode value for this LookupCustomerDetails.
     * 
     * @return stateRegCode
     */
    public java.lang.String getStateRegCode() {
        return stateRegCode;
    }


    /**
     * Sets the stateRegCode value for this LookupCustomerDetails.
     * 
     * @param stateRegCode
     */
    public void setStateRegCode(java.lang.String stateRegCode) {
        this.stateRegCode = stateRegCode;
    }


    /**
     * Gets the documentVerification value for this LookupCustomerDetails.
     * 
     * @return documentVerification
     */
    public java.lang.String getDocumentVerification() {
        return documentVerification;
    }


    /**
     * Sets the documentVerification value for this LookupCustomerDetails.
     * 
     * @param documentVerification
     */
    public void setDocumentVerification(java.lang.String documentVerification) {
        this.documentVerification = documentVerification;
    }


    /**
     * Gets the beneficiaryFirstName value for this LookupCustomerDetails.
     * 
     * @return beneficiaryFirstName
     */
    public java.lang.String getBeneficiaryFirstName() {
        return beneficiaryFirstName;
    }


    /**
     * Sets the beneficiaryFirstName value for this LookupCustomerDetails.
     * 
     * @param beneficiaryFirstName
     */
    public void setBeneficiaryFirstName(java.lang.String beneficiaryFirstName) {
        this.beneficiaryFirstName = beneficiaryFirstName;
    }


    /**
     * Gets the beneficiaryLastName value for this LookupCustomerDetails.
     * 
     * @return beneficiaryLastName
     */
    public java.lang.String getBeneficiaryLastName() {
        return beneficiaryLastName;
    }


    /**
     * Sets the beneficiaryLastName value for this LookupCustomerDetails.
     * 
     * @param beneficiaryLastName
     */
    public void setBeneficiaryLastName(java.lang.String beneficiaryLastName) {
        this.beneficiaryLastName = beneficiaryLastName;
    }


    /**
     * Gets the beneficiaryDOB value for this LookupCustomerDetails.
     * 
     * @return beneficiaryDOB
     */
    public java.lang.String getBeneficiaryDOB() {
        return beneficiaryDOB;
    }


    /**
     * Sets the beneficiaryDOB value for this LookupCustomerDetails.
     * 
     * @param beneficiaryDOB
     */
    public void setBeneficiaryDOB(java.lang.String beneficiaryDOB) {
        this.beneficiaryDOB = beneficiaryDOB;
    }


    /**
     * Gets the beneficiarySSN value for this LookupCustomerDetails.
     * 
     * @return beneficiarySSN
     */
    public java.lang.String getBeneficiarySSN() {
        return beneficiarySSN;
    }


    /**
     * Sets the beneficiarySSN value for this LookupCustomerDetails.
     * 
     * @param beneficiarySSN
     */
    public void setBeneficiarySSN(java.lang.String beneficiarySSN) {
        this.beneficiarySSN = beneficiarySSN;
    }


    /**
     * Gets the lifelineCodeName value for this LookupCustomerDetails.
     * 
     * @return lifelineCodeName
     */
    public java.lang.String getLifelineCodeName() {
        return lifelineCodeName;
    }


    /**
     * Sets the lifelineCodeName value for this LookupCustomerDetails.
     * 
     * @param lifelineCodeName
     */
    public void setLifelineCodeName(java.lang.String lifelineCodeName) {
        this.lifelineCodeName = lifelineCodeName;
    }


    /**
     * Gets the lifelineCode value for this LookupCustomerDetails.
     * 
     * @return lifelineCode
     */
    public java.lang.String getLifelineCode() {
        return lifelineCode;
    }


    /**
     * Sets the lifelineCode value for this LookupCustomerDetails.
     * 
     * @param lifelineCode
     */
    public void setLifelineCode(java.lang.String lifelineCode) {
        this.lifelineCode = lifelineCode;
    }


    /**
     * Gets the gatewayUse value for this LookupCustomerDetails.
     * 
     * @return gatewayUse
     */
    public java.lang.String getGatewayUse() {
        return gatewayUse;
    }


    /**
     * Sets the gatewayUse value for this LookupCustomerDetails.
     * 
     * @param gatewayUse
     */
    public void setGatewayUse(java.lang.String gatewayUse) {
        this.gatewayUse = gatewayUse;
    }


    /**
     * Gets the statusID value for this LookupCustomerDetails.
     * 
     * @return statusID
     */
    public java.lang.String getStatusID() {
        return statusID;
    }


    /**
     * Sets the statusID value for this LookupCustomerDetails.
     * 
     * @param statusID
     */
    public void setStatusID(java.lang.String statusID) {
        this.statusID = statusID;
    }


    /**
     * Gets the directNonLifeline value for this LookupCustomerDetails.
     * 
     * @return directNonLifeline
     */
    public java.lang.String getDirectNonLifeline() {
        return directNonLifeline;
    }


    /**
     * Sets the directNonLifeline value for this LookupCustomerDetails.
     * 
     * @param directNonLifeline
     */
    public void setDirectNonLifeline(java.lang.String directNonLifeline) {
        this.directNonLifeline = directNonLifeline;
    }


    /**
     * Gets the productID value for this LookupCustomerDetails.
     * 
     * @return productID
     */
    public java.lang.String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this LookupCustomerDetails.
     * 
     * @param productID
     */
    public void setProductID(java.lang.String productID) {
        this.productID = productID;
    }


    /**
     * Gets the ruralAddress value for this LookupCustomerDetails.
     * 
     * @return ruralAddress
     */
    public java.lang.String getRuralAddress() {
        return ruralAddress;
    }


    /**
     * Sets the ruralAddress value for this LookupCustomerDetails.
     * 
     * @param ruralAddress
     */
    public void setRuralAddress(java.lang.String ruralAddress) {
        this.ruralAddress = ruralAddress;
    }


    /**
     * Gets the stateRegCode2 value for this LookupCustomerDetails.
     * 
     * @return stateRegCode2
     */
    public java.lang.String getStateRegCode2() {
        return stateRegCode2;
    }


    /**
     * Sets the stateRegCode2 value for this LookupCustomerDetails.
     * 
     * @param stateRegCode2
     */
    public void setStateRegCode2(java.lang.String stateRegCode2) {
        this.stateRegCode2 = stateRegCode2;
    }


    /**
     * Gets the IMSI value for this LookupCustomerDetails.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this LookupCustomerDetails.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the validForPlanChange value for this LookupCustomerDetails.
     * 
     * @return validForPlanChange
     */
    public boolean isValidForPlanChange() {
        return validForPlanChange;
    }


    /**
     * Sets the validForPlanChange value for this LookupCustomerDetails.
     * 
     * @param validForPlanChange
     */
    public void setValidForPlanChange(boolean validForPlanChange) {
        this.validForPlanChange = validForPlanChange;
    }


    /**
     * Gets the migrationInProgress value for this LookupCustomerDetails.
     * 
     * @return migrationInProgress
     */
    public boolean isMigrationInProgress() {
        return migrationInProgress;
    }


    /**
     * Sets the migrationInProgress value for this LookupCustomerDetails.
     * 
     * @param migrationInProgress
     */
    public void setMigrationInProgress(boolean migrationInProgress) {
        this.migrationInProgress = migrationInProgress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookupCustomerDetails)) return false;
        LookupCustomerDetails other = (LookupCustomerDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.customerDetailsAvailable == other.isCustomerDetailsAvailable() &&
            this.budgetmobileID == other.getBudgetmobileID() &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.providerID==null && other.getProviderID()==null) || 
             (this.providerID!=null &&
              this.providerID.equals(other.getProviderID()))) &&
            ((this.providerName==null && other.getProviderName()==null) || 
             (this.providerName!=null &&
              this.providerName.equals(other.getProviderName()))) &&
            ((this.accountCredits==null && other.getAccountCredits()==null) || 
             (this.accountCredits!=null &&
              this.accountCredits.equals(other.getAccountCredits()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.SSN==null && other.getSSN()==null) || 
             (this.SSN!=null &&
              this.SSN.equals(other.getSSN()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
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
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.contactNumber==null && other.getContactNumber()==null) || 
             (this.contactNumber!=null &&
              this.contactNumber.equals(other.getContactNumber()))) &&
            ((this.lifeline==null && other.getLifeline()==null) || 
             (this.lifeline!=null &&
              this.lifeline.equals(other.getLifeline()))) &&
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
            ((this.topUpExpiration==null && other.getTopUpExpiration()==null) || 
             (this.topUpExpiration!=null &&
              this.topUpExpiration.equals(other.getTopUpExpiration()))) &&
            ((this.alternateIDDesc==null && other.getAlternateIDDesc()==null) || 
             (this.alternateIDDesc!=null &&
              this.alternateIDDesc.equals(other.getAlternateIDDesc()))) &&
            ((this.alternateIDValue==null && other.getAlternateIDValue()==null) || 
             (this.alternateIDValue!=null &&
              this.alternateIDValue.equals(other.getAlternateIDValue()))) &&
            ((this.beneficiary==null && other.getBeneficiary()==null) || 
             (this.beneficiary!=null &&
              this.beneficiary.equals(other.getBeneficiary()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.accountCompleted==null && other.getAccountCompleted()==null) || 
             (this.accountCompleted!=null &&
              this.accountCompleted.equals(other.getAccountCompleted()))) &&
            ((this.dateCompleted==null && other.getDateCompleted()==null) || 
             (this.dateCompleted!=null &&
              this.dateCompleted.equals(other.getDateCompleted()))) &&
            ((this.voiceOnly==null && other.getVoiceOnly()==null) || 
             (this.voiceOnly!=null &&
              this.voiceOnly.equals(other.getVoiceOnly()))) &&
            ((this.ratePlanPurchaseEligible_Immediate==null && other.getRatePlanPurchaseEligible_Immediate()==null) || 
             (this.ratePlanPurchaseEligible_Immediate!=null &&
              this.ratePlanPurchaseEligible_Immediate.equals(other.getRatePlanPurchaseEligible_Immediate()))) &&
            ((this.ratePlanPurchaseEligible_Advance==null && other.getRatePlanPurchaseEligible_Advance()==null) || 
             (this.ratePlanPurchaseEligible_Advance!=null &&
              this.ratePlanPurchaseEligible_Advance.equals(other.getRatePlanPurchaseEligible_Advance()))) &&
            ((this.serviceEndDate==null && other.getServiceEndDate()==null) || 
             (this.serviceEndDate!=null &&
              this.serviceEndDate.equals(other.getServiceEndDate()))) &&
            ((this.ratePlanDisplay==null && other.getRatePlanDisplay()==null) || 
             (this.ratePlanDisplay!=null &&
              this.ratePlanDisplay.equals(other.getRatePlanDisplay()))) &&
            ((this.serviceStartDate==null && other.getServiceStartDate()==null) || 
             (this.serviceStartDate!=null &&
              this.serviceStartDate.equals(other.getServiceStartDate()))) &&
            ((this.IMEI==null && other.getIMEI()==null) || 
             (this.IMEI!=null &&
              this.IMEI.equals(other.getIMEI()))) &&
            ((this.SIM==null && other.getSIM()==null) || 
             (this.SIM!=null &&
              this.SIM.equals(other.getSIM()))) &&
            ((this.servicePlan==null && other.getServicePlan()==null) || 
             (this.servicePlan!=null &&
              this.servicePlan.equals(other.getServicePlan()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              this.employee.equals(other.getEmployee()))) &&
            ((this.prequalificationCode==null && other.getPrequalificationCode()==null) || 
             (this.prequalificationCode!=null &&
              this.prequalificationCode.equals(other.getPrequalificationCode()))) &&
            ((this.HOHC==null && other.getHOHC()==null) || 
             (this.HOHC!=null &&
              this.HOHC.equals(other.getHOHC()))) &&
            ((this.lastCallDateTime==null && other.getLastCallDateTime()==null) || 
             (this.lastCallDateTime!=null &&
              this.lastCallDateTime.equals(other.getLastCallDateTime()))) &&
            ((this.fromOrToNumber==null && other.getFromOrToNumber()==null) || 
             (this.fromOrToNumber!=null &&
              this.fromOrToNumber.equals(other.getFromOrToNumber()))) &&
            ((this.stateRegCode==null && other.getStateRegCode()==null) || 
             (this.stateRegCode!=null &&
              this.stateRegCode.equals(other.getStateRegCode()))) &&
            ((this.documentVerification==null && other.getDocumentVerification()==null) || 
             (this.documentVerification!=null &&
              this.documentVerification.equals(other.getDocumentVerification()))) &&
            ((this.beneficiaryFirstName==null && other.getBeneficiaryFirstName()==null) || 
             (this.beneficiaryFirstName!=null &&
              this.beneficiaryFirstName.equals(other.getBeneficiaryFirstName()))) &&
            ((this.beneficiaryLastName==null && other.getBeneficiaryLastName()==null) || 
             (this.beneficiaryLastName!=null &&
              this.beneficiaryLastName.equals(other.getBeneficiaryLastName()))) &&
            ((this.beneficiaryDOB==null && other.getBeneficiaryDOB()==null) || 
             (this.beneficiaryDOB!=null &&
              this.beneficiaryDOB.equals(other.getBeneficiaryDOB()))) &&
            ((this.beneficiarySSN==null && other.getBeneficiarySSN()==null) || 
             (this.beneficiarySSN!=null &&
              this.beneficiarySSN.equals(other.getBeneficiarySSN()))) &&
            ((this.lifelineCodeName==null && other.getLifelineCodeName()==null) || 
             (this.lifelineCodeName!=null &&
              this.lifelineCodeName.equals(other.getLifelineCodeName()))) &&
            ((this.lifelineCode==null && other.getLifelineCode()==null) || 
             (this.lifelineCode!=null &&
              this.lifelineCode.equals(other.getLifelineCode()))) &&
            ((this.gatewayUse==null && other.getGatewayUse()==null) || 
             (this.gatewayUse!=null &&
              this.gatewayUse.equals(other.getGatewayUse()))) &&
            ((this.statusID==null && other.getStatusID()==null) || 
             (this.statusID!=null &&
              this.statusID.equals(other.getStatusID()))) &&
            ((this.directNonLifeline==null && other.getDirectNonLifeline()==null) || 
             (this.directNonLifeline!=null &&
              this.directNonLifeline.equals(other.getDirectNonLifeline()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.ruralAddress==null && other.getRuralAddress()==null) || 
             (this.ruralAddress!=null &&
              this.ruralAddress.equals(other.getRuralAddress()))) &&
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
        _hashCode += (isCustomerDetailsAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getBudgetmobileID()).hashCode();
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getProviderID() != null) {
            _hashCode += getProviderID().hashCode();
        }
        if (getProviderName() != null) {
            _hashCode += getProviderName().hashCode();
        }
        if (getAccountCredits() != null) {
            _hashCode += getAccountCredits().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getSSN() != null) {
            _hashCode += getSSN().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
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
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getContactNumber() != null) {
            _hashCode += getContactNumber().hashCode();
        }
        if (getLifeline() != null) {
            _hashCode += getLifeline().hashCode();
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
        if (getTopUpExpiration() != null) {
            _hashCode += getTopUpExpiration().hashCode();
        }
        if (getAlternateIDDesc() != null) {
            _hashCode += getAlternateIDDesc().hashCode();
        }
        if (getAlternateIDValue() != null) {
            _hashCode += getAlternateIDValue().hashCode();
        }
        if (getBeneficiary() != null) {
            _hashCode += getBeneficiary().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getAccountCompleted() != null) {
            _hashCode += getAccountCompleted().hashCode();
        }
        if (getDateCompleted() != null) {
            _hashCode += getDateCompleted().hashCode();
        }
        if (getVoiceOnly() != null) {
            _hashCode += getVoiceOnly().hashCode();
        }
        if (getRatePlanPurchaseEligible_Immediate() != null) {
            _hashCode += getRatePlanPurchaseEligible_Immediate().hashCode();
        }
        if (getRatePlanPurchaseEligible_Advance() != null) {
            _hashCode += getRatePlanPurchaseEligible_Advance().hashCode();
        }
        if (getServiceEndDate() != null) {
            _hashCode += getServiceEndDate().hashCode();
        }
        if (getRatePlanDisplay() != null) {
            _hashCode += getRatePlanDisplay().hashCode();
        }
        if (getServiceStartDate() != null) {
            _hashCode += getServiceStartDate().hashCode();
        }
        if (getIMEI() != null) {
            _hashCode += getIMEI().hashCode();
        }
        if (getSIM() != null) {
            _hashCode += getSIM().hashCode();
        }
        if (getServicePlan() != null) {
            _hashCode += getServicePlan().hashCode();
        }
        if (getEmployee() != null) {
            _hashCode += getEmployee().hashCode();
        }
        if (getPrequalificationCode() != null) {
            _hashCode += getPrequalificationCode().hashCode();
        }
        if (getHOHC() != null) {
            _hashCode += getHOHC().hashCode();
        }
        if (getLastCallDateTime() != null) {
            _hashCode += getLastCallDateTime().hashCode();
        }
        if (getFromOrToNumber() != null) {
            _hashCode += getFromOrToNumber().hashCode();
        }
        if (getStateRegCode() != null) {
            _hashCode += getStateRegCode().hashCode();
        }
        if (getDocumentVerification() != null) {
            _hashCode += getDocumentVerification().hashCode();
        }
        if (getBeneficiaryFirstName() != null) {
            _hashCode += getBeneficiaryFirstName().hashCode();
        }
        if (getBeneficiaryLastName() != null) {
            _hashCode += getBeneficiaryLastName().hashCode();
        }
        if (getBeneficiaryDOB() != null) {
            _hashCode += getBeneficiaryDOB().hashCode();
        }
        if (getBeneficiarySSN() != null) {
            _hashCode += getBeneficiarySSN().hashCode();
        }
        if (getLifelineCodeName() != null) {
            _hashCode += getLifelineCodeName().hashCode();
        }
        if (getLifelineCode() != null) {
            _hashCode += getLifelineCode().hashCode();
        }
        if (getGatewayUse() != null) {
            _hashCode += getGatewayUse().hashCode();
        }
        if (getStatusID() != null) {
            _hashCode += getStatusID().hashCode();
        }
        if (getDirectNonLifeline() != null) {
            _hashCode += getDirectNonLifeline().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getRuralAddress() != null) {
            _hashCode += getRuralAddress().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(LookupCustomerDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "LookupCustomerDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerDetailsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CustomerDetailsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetmobileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BudgetmobileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProviderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProviderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCredits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AccountCredits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BirthDate"));
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
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Zip"));
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
        elemField.setFieldName("lifeline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Lifeline"));
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
        elemField.setFieldName("topUpExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUpExpiration"));
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
        elemField.setFieldName("beneficiary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Beneficiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("accountCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AccountCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanPurchaseEligible_Immediate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RatePlanPurchaseEligible_Immediate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanPurchaseEligible_Advance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RatePlanPurchaseEligible_Advance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("serviceStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ServiceStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMEI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IMEI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ServicePlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prequalificationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PrequalificationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HOHC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HOHC"));
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
        elemField.setFieldName("stateRegCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StateRegCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentVerification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DocumentVerification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beneficiaryFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BeneficiaryFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beneficiaryLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BeneficiaryLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beneficiaryDOB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BeneficiaryDOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beneficiarySSN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BeneficiarySSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifelineCodeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LifelineCodeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifelineCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LifelineCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayUse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GatewayUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StatusID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directNonLifeline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DirectNonLifeline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruralAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RuralAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
