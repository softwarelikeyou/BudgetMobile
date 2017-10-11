/**
 * Credentials_Order_Enter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_Order_Enter  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private java.lang.String order_ID;

    private boolean lifeline;

    private boolean tribalLifeline;

    private int lifeline_Program;

    private int cellular_Plan;

    private java.lang.String model;

    private java.lang.String first_Name;

    private java.lang.String last_Name;

    private int validated_AddressId;

    private java.lang.String SSN;

    private java.lang.String contact;

    private java.lang.String email;

    private java.lang.String userName;

    private java.lang.String userPassword;

    private java.lang.String referringMobileNumber;

    private java.lang.String prequalifiedCode;

    private java.lang.String DOB;

    private java.lang.String authorizationCode;

    private java.lang.String employeeAcount;

    private java.lang.String deviceID;

    private java.lang.String tradeInDeviceID;

    private boolean temporaryAddress;

    private java.lang.String externalAgentID;

    private java.lang.String billingAddress;

    private java.lang.String billingAddress2;

    private java.lang.String billingCity;

    private java.lang.String billingState;

    private java.lang.String billingZip;

    private java.lang.String sales_Channel;

    private java.lang.String stateRegCode;

    private boolean noDeviceOnOrder;

    private boolean bypassIdentity;

    private java.lang.String bypassIdentityNotes;

    private java.lang.String alternateIDDesc;

    private java.lang.String alternateIDValue;

    private java.lang.String beneficiary;

    private int accountCreditAwarded;

    private java.lang.String documentVerification;

    private java.lang.String beneficiaryFirstName;

    private java.lang.String beneficiaryLastName;

    private java.lang.String beneficiarySSN;

    private java.lang.String beneficiaryDOB;

    private boolean voiceOnly;

    private java.lang.String lifeline_ProgramValue;

    private java.lang.String stateRegCode2;

    private java.lang.String address;

    private java.lang.String address2;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zip;

    private boolean ruralAddress;

    private boolean byPassDuplicate;

    private boolean HOHC;

    private java.lang.String IMSI;

    private java.lang.String lexID;

    private java.lang.String gender;

    private java.lang.String race;

    private java.lang.String maritalStatus;

    private java.lang.String militaryStatus;

    public Credentials_Order_Enter() {
    }

    public Credentials_Order_Enter(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           java.lang.String order_ID,
           boolean lifeline,
           boolean tribalLifeline,
           int lifeline_Program,
           int cellular_Plan,
           java.lang.String model,
           java.lang.String first_Name,
           java.lang.String last_Name,
           int validated_AddressId,
           java.lang.String SSN,
           java.lang.String contact,
           java.lang.String email,
           java.lang.String userName,
           java.lang.String userPassword,
           java.lang.String referringMobileNumber,
           java.lang.String prequalifiedCode,
           java.lang.String DOB,
           java.lang.String authorizationCode,
           java.lang.String employeeAcount,
           java.lang.String deviceID,
           java.lang.String tradeInDeviceID,
           boolean temporaryAddress,
           java.lang.String externalAgentID,
           java.lang.String billingAddress,
           java.lang.String billingAddress2,
           java.lang.String billingCity,
           java.lang.String billingState,
           java.lang.String billingZip,
           java.lang.String sales_Channel,
           java.lang.String stateRegCode,
           boolean noDeviceOnOrder,
           boolean bypassIdentity,
           java.lang.String bypassIdentityNotes,
           java.lang.String alternateIDDesc,
           java.lang.String alternateIDValue,
           java.lang.String beneficiary,
           int accountCreditAwarded,
           java.lang.String documentVerification,
           java.lang.String beneficiaryFirstName,
           java.lang.String beneficiaryLastName,
           java.lang.String beneficiarySSN,
           java.lang.String beneficiaryDOB,
           boolean voiceOnly,
           java.lang.String lifeline_ProgramValue,
           java.lang.String stateRegCode2,
           java.lang.String address,
           java.lang.String address2,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zip,
           boolean ruralAddress,
           boolean byPassDuplicate,
           boolean HOHC,
           java.lang.String IMSI,
           java.lang.String lexID,
           java.lang.String gender,
           java.lang.String race,
           java.lang.String maritalStatus,
           java.lang.String militaryStatus) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.order_ID = order_ID;
        this.lifeline = lifeline;
        this.tribalLifeline = tribalLifeline;
        this.lifeline_Program = lifeline_Program;
        this.cellular_Plan = cellular_Plan;
        this.model = model;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.validated_AddressId = validated_AddressId;
        this.SSN = SSN;
        this.contact = contact;
        this.email = email;
        this.userName = userName;
        this.userPassword = userPassword;
        this.referringMobileNumber = referringMobileNumber;
        this.prequalifiedCode = prequalifiedCode;
        this.DOB = DOB;
        this.authorizationCode = authorizationCode;
        this.employeeAcount = employeeAcount;
        this.deviceID = deviceID;
        this.tradeInDeviceID = tradeInDeviceID;
        this.temporaryAddress = temporaryAddress;
        this.externalAgentID = externalAgentID;
        this.billingAddress = billingAddress;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.sales_Channel = sales_Channel;
        this.stateRegCode = stateRegCode;
        this.noDeviceOnOrder = noDeviceOnOrder;
        this.bypassIdentity = bypassIdentity;
        this.bypassIdentityNotes = bypassIdentityNotes;
        this.alternateIDDesc = alternateIDDesc;
        this.alternateIDValue = alternateIDValue;
        this.beneficiary = beneficiary;
        this.accountCreditAwarded = accountCreditAwarded;
        this.documentVerification = documentVerification;
        this.beneficiaryFirstName = beneficiaryFirstName;
        this.beneficiaryLastName = beneficiaryLastName;
        this.beneficiarySSN = beneficiarySSN;
        this.beneficiaryDOB = beneficiaryDOB;
        this.voiceOnly = voiceOnly;
        this.lifeline_ProgramValue = lifeline_ProgramValue;
        this.stateRegCode2 = stateRegCode2;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.ruralAddress = ruralAddress;
        this.byPassDuplicate = byPassDuplicate;
        this.HOHC = HOHC;
        this.IMSI = IMSI;
        this.lexID = lexID;
        this.gender = gender;
        this.race = race;
        this.maritalStatus = maritalStatus;
        this.militaryStatus = militaryStatus;
    }


    /**
     * Gets the order_ID value for this Credentials_Order_Enter.
     * 
     * @return order_ID
     */
    public java.lang.String getOrder_ID() {
        return order_ID;
    }


    /**
     * Sets the order_ID value for this Credentials_Order_Enter.
     * 
     * @param order_ID
     */
    public void setOrder_ID(java.lang.String order_ID) {
        this.order_ID = order_ID;
    }


    /**
     * Gets the lifeline value for this Credentials_Order_Enter.
     * 
     * @return lifeline
     */
    public boolean isLifeline() {
        return lifeline;
    }


    /**
     * Sets the lifeline value for this Credentials_Order_Enter.
     * 
     * @param lifeline
     */
    public void setLifeline(boolean lifeline) {
        this.lifeline = lifeline;
    }


    /**
     * Gets the tribalLifeline value for this Credentials_Order_Enter.
     * 
     * @return tribalLifeline
     */
    public boolean isTribalLifeline() {
        return tribalLifeline;
    }


    /**
     * Sets the tribalLifeline value for this Credentials_Order_Enter.
     * 
     * @param tribalLifeline
     */
    public void setTribalLifeline(boolean tribalLifeline) {
        this.tribalLifeline = tribalLifeline;
    }


    /**
     * Gets the lifeline_Program value for this Credentials_Order_Enter.
     * 
     * @return lifeline_Program
     */
    public int getLifeline_Program() {
        return lifeline_Program;
    }


    /**
     * Sets the lifeline_Program value for this Credentials_Order_Enter.
     * 
     * @param lifeline_Program
     */
    public void setLifeline_Program(int lifeline_Program) {
        this.lifeline_Program = lifeline_Program;
    }


    /**
     * Gets the cellular_Plan value for this Credentials_Order_Enter.
     * 
     * @return cellular_Plan
     */
    public int getCellular_Plan() {
        return cellular_Plan;
    }


    /**
     * Sets the cellular_Plan value for this Credentials_Order_Enter.
     * 
     * @param cellular_Plan
     */
    public void setCellular_Plan(int cellular_Plan) {
        this.cellular_Plan = cellular_Plan;
    }


    /**
     * Gets the model value for this Credentials_Order_Enter.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this Credentials_Order_Enter.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the first_Name value for this Credentials_Order_Enter.
     * 
     * @return first_Name
     */
    public java.lang.String getFirst_Name() {
        return first_Name;
    }


    /**
     * Sets the first_Name value for this Credentials_Order_Enter.
     * 
     * @param first_Name
     */
    public void setFirst_Name(java.lang.String first_Name) {
        this.first_Name = first_Name;
    }


    /**
     * Gets the last_Name value for this Credentials_Order_Enter.
     * 
     * @return last_Name
     */
    public java.lang.String getLast_Name() {
        return last_Name;
    }


    /**
     * Sets the last_Name value for this Credentials_Order_Enter.
     * 
     * @param last_Name
     */
    public void setLast_Name(java.lang.String last_Name) {
        this.last_Name = last_Name;
    }


    /**
     * Gets the validated_AddressId value for this Credentials_Order_Enter.
     * 
     * @return validated_AddressId
     */
    public int getValidated_AddressId() {
        return validated_AddressId;
    }


    /**
     * Sets the validated_AddressId value for this Credentials_Order_Enter.
     * 
     * @param validated_AddressId
     */
    public void setValidated_AddressId(int validated_AddressId) {
        this.validated_AddressId = validated_AddressId;
    }


    /**
     * Gets the SSN value for this Credentials_Order_Enter.
     * 
     * @return SSN
     */
    public java.lang.String getSSN() {
        return SSN;
    }


    /**
     * Sets the SSN value for this Credentials_Order_Enter.
     * 
     * @param SSN
     */
    public void setSSN(java.lang.String SSN) {
        this.SSN = SSN;
    }


    /**
     * Gets the contact value for this Credentials_Order_Enter.
     * 
     * @return contact
     */
    public java.lang.String getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this Credentials_Order_Enter.
     * 
     * @param contact
     */
    public void setContact(java.lang.String contact) {
        this.contact = contact;
    }


    /**
     * Gets the email value for this Credentials_Order_Enter.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Credentials_Order_Enter.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the userName value for this Credentials_Order_Enter.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this Credentials_Order_Enter.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userPassword value for this Credentials_Order_Enter.
     * 
     * @return userPassword
     */
    public java.lang.String getUserPassword() {
        return userPassword;
    }


    /**
     * Sets the userPassword value for this Credentials_Order_Enter.
     * 
     * @param userPassword
     */
    public void setUserPassword(java.lang.String userPassword) {
        this.userPassword = userPassword;
    }


    /**
     * Gets the referringMobileNumber value for this Credentials_Order_Enter.
     * 
     * @return referringMobileNumber
     */
    public java.lang.String getReferringMobileNumber() {
        return referringMobileNumber;
    }


    /**
     * Sets the referringMobileNumber value for this Credentials_Order_Enter.
     * 
     * @param referringMobileNumber
     */
    public void setReferringMobileNumber(java.lang.String referringMobileNumber) {
        this.referringMobileNumber = referringMobileNumber;
    }


    /**
     * Gets the prequalifiedCode value for this Credentials_Order_Enter.
     * 
     * @return prequalifiedCode
     */
    public java.lang.String getPrequalifiedCode() {
        return prequalifiedCode;
    }


    /**
     * Sets the prequalifiedCode value for this Credentials_Order_Enter.
     * 
     * @param prequalifiedCode
     */
    public void setPrequalifiedCode(java.lang.String prequalifiedCode) {
        this.prequalifiedCode = prequalifiedCode;
    }


    /**
     * Gets the DOB value for this Credentials_Order_Enter.
     * 
     * @return DOB
     */
    public java.lang.String getDOB() {
        return DOB;
    }


    /**
     * Sets the DOB value for this Credentials_Order_Enter.
     * 
     * @param DOB
     */
    public void setDOB(java.lang.String DOB) {
        this.DOB = DOB;
    }


    /**
     * Gets the authorizationCode value for this Credentials_Order_Enter.
     * 
     * @return authorizationCode
     */
    public java.lang.String getAuthorizationCode() {
        return authorizationCode;
    }


    /**
     * Sets the authorizationCode value for this Credentials_Order_Enter.
     * 
     * @param authorizationCode
     */
    public void setAuthorizationCode(java.lang.String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }


    /**
     * Gets the employeeAcount value for this Credentials_Order_Enter.
     * 
     * @return employeeAcount
     */
    public java.lang.String getEmployeeAcount() {
        return employeeAcount;
    }


    /**
     * Sets the employeeAcount value for this Credentials_Order_Enter.
     * 
     * @param employeeAcount
     */
    public void setEmployeeAcount(java.lang.String employeeAcount) {
        this.employeeAcount = employeeAcount;
    }


    /**
     * Gets the deviceID value for this Credentials_Order_Enter.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this Credentials_Order_Enter.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the tradeInDeviceID value for this Credentials_Order_Enter.
     * 
     * @return tradeInDeviceID
     */
    public java.lang.String getTradeInDeviceID() {
        return tradeInDeviceID;
    }


    /**
     * Sets the tradeInDeviceID value for this Credentials_Order_Enter.
     * 
     * @param tradeInDeviceID
     */
    public void setTradeInDeviceID(java.lang.String tradeInDeviceID) {
        this.tradeInDeviceID = tradeInDeviceID;
    }


    /**
     * Gets the temporaryAddress value for this Credentials_Order_Enter.
     * 
     * @return temporaryAddress
     */
    public boolean isTemporaryAddress() {
        return temporaryAddress;
    }


    /**
     * Sets the temporaryAddress value for this Credentials_Order_Enter.
     * 
     * @param temporaryAddress
     */
    public void setTemporaryAddress(boolean temporaryAddress) {
        this.temporaryAddress = temporaryAddress;
    }


    /**
     * Gets the externalAgentID value for this Credentials_Order_Enter.
     * 
     * @return externalAgentID
     */
    public java.lang.String getExternalAgentID() {
        return externalAgentID;
    }


    /**
     * Sets the externalAgentID value for this Credentials_Order_Enter.
     * 
     * @param externalAgentID
     */
    public void setExternalAgentID(java.lang.String externalAgentID) {
        this.externalAgentID = externalAgentID;
    }


    /**
     * Gets the billingAddress value for this Credentials_Order_Enter.
     * 
     * @return billingAddress
     */
    public java.lang.String getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this Credentials_Order_Enter.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(java.lang.String billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the billingAddress2 value for this Credentials_Order_Enter.
     * 
     * @return billingAddress2
     */
    public java.lang.String getBillingAddress2() {
        return billingAddress2;
    }


    /**
     * Sets the billingAddress2 value for this Credentials_Order_Enter.
     * 
     * @param billingAddress2
     */
    public void setBillingAddress2(java.lang.String billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }


    /**
     * Gets the billingCity value for this Credentials_Order_Enter.
     * 
     * @return billingCity
     */
    public java.lang.String getBillingCity() {
        return billingCity;
    }


    /**
     * Sets the billingCity value for this Credentials_Order_Enter.
     * 
     * @param billingCity
     */
    public void setBillingCity(java.lang.String billingCity) {
        this.billingCity = billingCity;
    }


    /**
     * Gets the billingState value for this Credentials_Order_Enter.
     * 
     * @return billingState
     */
    public java.lang.String getBillingState() {
        return billingState;
    }


    /**
     * Sets the billingState value for this Credentials_Order_Enter.
     * 
     * @param billingState
     */
    public void setBillingState(java.lang.String billingState) {
        this.billingState = billingState;
    }


    /**
     * Gets the billingZip value for this Credentials_Order_Enter.
     * 
     * @return billingZip
     */
    public java.lang.String getBillingZip() {
        return billingZip;
    }


    /**
     * Sets the billingZip value for this Credentials_Order_Enter.
     * 
     * @param billingZip
     */
    public void setBillingZip(java.lang.String billingZip) {
        this.billingZip = billingZip;
    }


    /**
     * Gets the sales_Channel value for this Credentials_Order_Enter.
     * 
     * @return sales_Channel
     */
    public java.lang.String getSales_Channel() {
        return sales_Channel;
    }


    /**
     * Sets the sales_Channel value for this Credentials_Order_Enter.
     * 
     * @param sales_Channel
     */
    public void setSales_Channel(java.lang.String sales_Channel) {
        this.sales_Channel = sales_Channel;
    }


    /**
     * Gets the stateRegCode value for this Credentials_Order_Enter.
     * 
     * @return stateRegCode
     */
    public java.lang.String getStateRegCode() {
        return stateRegCode;
    }


    /**
     * Sets the stateRegCode value for this Credentials_Order_Enter.
     * 
     * @param stateRegCode
     */
    public void setStateRegCode(java.lang.String stateRegCode) {
        this.stateRegCode = stateRegCode;
    }


    /**
     * Gets the noDeviceOnOrder value for this Credentials_Order_Enter.
     * 
     * @return noDeviceOnOrder
     */
    public boolean isNoDeviceOnOrder() {
        return noDeviceOnOrder;
    }


    /**
     * Sets the noDeviceOnOrder value for this Credentials_Order_Enter.
     * 
     * @param noDeviceOnOrder
     */
    public void setNoDeviceOnOrder(boolean noDeviceOnOrder) {
        this.noDeviceOnOrder = noDeviceOnOrder;
    }


    /**
     * Gets the bypassIdentity value for this Credentials_Order_Enter.
     * 
     * @return bypassIdentity
     */
    public boolean isBypassIdentity() {
        return bypassIdentity;
    }


    /**
     * Sets the bypassIdentity value for this Credentials_Order_Enter.
     * 
     * @param bypassIdentity
     */
    public void setBypassIdentity(boolean bypassIdentity) {
        this.bypassIdentity = bypassIdentity;
    }


    /**
     * Gets the bypassIdentityNotes value for this Credentials_Order_Enter.
     * 
     * @return bypassIdentityNotes
     */
    public java.lang.String getBypassIdentityNotes() {
        return bypassIdentityNotes;
    }


    /**
     * Sets the bypassIdentityNotes value for this Credentials_Order_Enter.
     * 
     * @param bypassIdentityNotes
     */
    public void setBypassIdentityNotes(java.lang.String bypassIdentityNotes) {
        this.bypassIdentityNotes = bypassIdentityNotes;
    }


    /**
     * Gets the alternateIDDesc value for this Credentials_Order_Enter.
     * 
     * @return alternateIDDesc
     */
    public java.lang.String getAlternateIDDesc() {
        return alternateIDDesc;
    }


    /**
     * Sets the alternateIDDesc value for this Credentials_Order_Enter.
     * 
     * @param alternateIDDesc
     */
    public void setAlternateIDDesc(java.lang.String alternateIDDesc) {
        this.alternateIDDesc = alternateIDDesc;
    }


    /**
     * Gets the alternateIDValue value for this Credentials_Order_Enter.
     * 
     * @return alternateIDValue
     */
    public java.lang.String getAlternateIDValue() {
        return alternateIDValue;
    }


    /**
     * Sets the alternateIDValue value for this Credentials_Order_Enter.
     * 
     * @param alternateIDValue
     */
    public void setAlternateIDValue(java.lang.String alternateIDValue) {
        this.alternateIDValue = alternateIDValue;
    }


    /**
     * Gets the beneficiary value for this Credentials_Order_Enter.
     * 
     * @return beneficiary
     */
    public java.lang.String getBeneficiary() {
        return beneficiary;
    }


    /**
     * Sets the beneficiary value for this Credentials_Order_Enter.
     * 
     * @param beneficiary
     */
    public void setBeneficiary(java.lang.String beneficiary) {
        this.beneficiary = beneficiary;
    }


    /**
     * Gets the accountCreditAwarded value for this Credentials_Order_Enter.
     * 
     * @return accountCreditAwarded
     */
    public int getAccountCreditAwarded() {
        return accountCreditAwarded;
    }


    /**
     * Sets the accountCreditAwarded value for this Credentials_Order_Enter.
     * 
     * @param accountCreditAwarded
     */
    public void setAccountCreditAwarded(int accountCreditAwarded) {
        this.accountCreditAwarded = accountCreditAwarded;
    }


    /**
     * Gets the documentVerification value for this Credentials_Order_Enter.
     * 
     * @return documentVerification
     */
    public java.lang.String getDocumentVerification() {
        return documentVerification;
    }


    /**
     * Sets the documentVerification value for this Credentials_Order_Enter.
     * 
     * @param documentVerification
     */
    public void setDocumentVerification(java.lang.String documentVerification) {
        this.documentVerification = documentVerification;
    }


    /**
     * Gets the beneficiaryFirstName value for this Credentials_Order_Enter.
     * 
     * @return beneficiaryFirstName
     */
    public java.lang.String getBeneficiaryFirstName() {
        return beneficiaryFirstName;
    }


    /**
     * Sets the beneficiaryFirstName value for this Credentials_Order_Enter.
     * 
     * @param beneficiaryFirstName
     */
    public void setBeneficiaryFirstName(java.lang.String beneficiaryFirstName) {
        this.beneficiaryFirstName = beneficiaryFirstName;
    }


    /**
     * Gets the beneficiaryLastName value for this Credentials_Order_Enter.
     * 
     * @return beneficiaryLastName
     */
    public java.lang.String getBeneficiaryLastName() {
        return beneficiaryLastName;
    }


    /**
     * Sets the beneficiaryLastName value for this Credentials_Order_Enter.
     * 
     * @param beneficiaryLastName
     */
    public void setBeneficiaryLastName(java.lang.String beneficiaryLastName) {
        this.beneficiaryLastName = beneficiaryLastName;
    }


    /**
     * Gets the beneficiarySSN value for this Credentials_Order_Enter.
     * 
     * @return beneficiarySSN
     */
    public java.lang.String getBeneficiarySSN() {
        return beneficiarySSN;
    }


    /**
     * Sets the beneficiarySSN value for this Credentials_Order_Enter.
     * 
     * @param beneficiarySSN
     */
    public void setBeneficiarySSN(java.lang.String beneficiarySSN) {
        this.beneficiarySSN = beneficiarySSN;
    }


    /**
     * Gets the beneficiaryDOB value for this Credentials_Order_Enter.
     * 
     * @return beneficiaryDOB
     */
    public java.lang.String getBeneficiaryDOB() {
        return beneficiaryDOB;
    }


    /**
     * Sets the beneficiaryDOB value for this Credentials_Order_Enter.
     * 
     * @param beneficiaryDOB
     */
    public void setBeneficiaryDOB(java.lang.String beneficiaryDOB) {
        this.beneficiaryDOB = beneficiaryDOB;
    }


    /**
     * Gets the voiceOnly value for this Credentials_Order_Enter.
     * 
     * @return voiceOnly
     */
    public boolean isVoiceOnly() {
        return voiceOnly;
    }


    /**
     * Sets the voiceOnly value for this Credentials_Order_Enter.
     * 
     * @param voiceOnly
     */
    public void setVoiceOnly(boolean voiceOnly) {
        this.voiceOnly = voiceOnly;
    }


    /**
     * Gets the lifeline_ProgramValue value for this Credentials_Order_Enter.
     * 
     * @return lifeline_ProgramValue
     */
    public java.lang.String getLifeline_ProgramValue() {
        return lifeline_ProgramValue;
    }


    /**
     * Sets the lifeline_ProgramValue value for this Credentials_Order_Enter.
     * 
     * @param lifeline_ProgramValue
     */
    public void setLifeline_ProgramValue(java.lang.String lifeline_ProgramValue) {
        this.lifeline_ProgramValue = lifeline_ProgramValue;
    }


    /**
     * Gets the stateRegCode2 value for this Credentials_Order_Enter.
     * 
     * @return stateRegCode2
     */
    public java.lang.String getStateRegCode2() {
        return stateRegCode2;
    }


    /**
     * Sets the stateRegCode2 value for this Credentials_Order_Enter.
     * 
     * @param stateRegCode2
     */
    public void setStateRegCode2(java.lang.String stateRegCode2) {
        this.stateRegCode2 = stateRegCode2;
    }


    /**
     * Gets the address value for this Credentials_Order_Enter.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Credentials_Order_Enter.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the address2 value for this Credentials_Order_Enter.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this Credentials_Order_Enter.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this Credentials_Order_Enter.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Credentials_Order_Enter.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this Credentials_Order_Enter.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Credentials_Order_Enter.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this Credentials_Order_Enter.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this Credentials_Order_Enter.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the ruralAddress value for this Credentials_Order_Enter.
     * 
     * @return ruralAddress
     */
    public boolean isRuralAddress() {
        return ruralAddress;
    }


    /**
     * Sets the ruralAddress value for this Credentials_Order_Enter.
     * 
     * @param ruralAddress
     */
    public void setRuralAddress(boolean ruralAddress) {
        this.ruralAddress = ruralAddress;
    }


    /**
     * Gets the byPassDuplicate value for this Credentials_Order_Enter.
     * 
     * @return byPassDuplicate
     */
    public boolean isByPassDuplicate() {
        return byPassDuplicate;
    }


    /**
     * Sets the byPassDuplicate value for this Credentials_Order_Enter.
     * 
     * @param byPassDuplicate
     */
    public void setByPassDuplicate(boolean byPassDuplicate) {
        this.byPassDuplicate = byPassDuplicate;
    }


    /**
     * Gets the HOHC value for this Credentials_Order_Enter.
     * 
     * @return HOHC
     */
    public boolean isHOHC() {
        return HOHC;
    }


    /**
     * Sets the HOHC value for this Credentials_Order_Enter.
     * 
     * @param HOHC
     */
    public void setHOHC(boolean HOHC) {
        this.HOHC = HOHC;
    }


    /**
     * Gets the IMSI value for this Credentials_Order_Enter.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this Credentials_Order_Enter.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the lexID value for this Credentials_Order_Enter.
     * 
     * @return lexID
     */
    public java.lang.String getLexID() {
        return lexID;
    }


    /**
     * Sets the lexID value for this Credentials_Order_Enter.
     * 
     * @param lexID
     */
    public void setLexID(java.lang.String lexID) {
        this.lexID = lexID;
    }


    /**
     * Gets the gender value for this Credentials_Order_Enter.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this Credentials_Order_Enter.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the race value for this Credentials_Order_Enter.
     * 
     * @return race
     */
    public java.lang.String getRace() {
        return race;
    }


    /**
     * Sets the race value for this Credentials_Order_Enter.
     * 
     * @param race
     */
    public void setRace(java.lang.String race) {
        this.race = race;
    }


    /**
     * Gets the maritalStatus value for this Credentials_Order_Enter.
     * 
     * @return maritalStatus
     */
    public java.lang.String getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this Credentials_Order_Enter.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(java.lang.String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the militaryStatus value for this Credentials_Order_Enter.
     * 
     * @return militaryStatus
     */
    public java.lang.String getMilitaryStatus() {
        return militaryStatus;
    }


    /**
     * Sets the militaryStatus value for this Credentials_Order_Enter.
     * 
     * @param militaryStatus
     */
    public void setMilitaryStatus(java.lang.String militaryStatus) {
        this.militaryStatus = militaryStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_Order_Enter)) return false;
        Credentials_Order_Enter other = (Credentials_Order_Enter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.order_ID==null && other.getOrder_ID()==null) || 
             (this.order_ID!=null &&
              this.order_ID.equals(other.getOrder_ID()))) &&
            this.lifeline == other.isLifeline() &&
            this.tribalLifeline == other.isTribalLifeline() &&
            this.lifeline_Program == other.getLifeline_Program() &&
            this.cellular_Plan == other.getCellular_Plan() &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.first_Name==null && other.getFirst_Name()==null) || 
             (this.first_Name!=null &&
              this.first_Name.equals(other.getFirst_Name()))) &&
            ((this.last_Name==null && other.getLast_Name()==null) || 
             (this.last_Name!=null &&
              this.last_Name.equals(other.getLast_Name()))) &&
            this.validated_AddressId == other.getValidated_AddressId() &&
            ((this.SSN==null && other.getSSN()==null) || 
             (this.SSN!=null &&
              this.SSN.equals(other.getSSN()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.userPassword==null && other.getUserPassword()==null) || 
             (this.userPassword!=null &&
              this.userPassword.equals(other.getUserPassword()))) &&
            ((this.referringMobileNumber==null && other.getReferringMobileNumber()==null) || 
             (this.referringMobileNumber!=null &&
              this.referringMobileNumber.equals(other.getReferringMobileNumber()))) &&
            ((this.prequalifiedCode==null && other.getPrequalifiedCode()==null) || 
             (this.prequalifiedCode!=null &&
              this.prequalifiedCode.equals(other.getPrequalifiedCode()))) &&
            ((this.DOB==null && other.getDOB()==null) || 
             (this.DOB!=null &&
              this.DOB.equals(other.getDOB()))) &&
            ((this.authorizationCode==null && other.getAuthorizationCode()==null) || 
             (this.authorizationCode!=null &&
              this.authorizationCode.equals(other.getAuthorizationCode()))) &&
            ((this.employeeAcount==null && other.getEmployeeAcount()==null) || 
             (this.employeeAcount!=null &&
              this.employeeAcount.equals(other.getEmployeeAcount()))) &&
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.tradeInDeviceID==null && other.getTradeInDeviceID()==null) || 
             (this.tradeInDeviceID!=null &&
              this.tradeInDeviceID.equals(other.getTradeInDeviceID()))) &&
            this.temporaryAddress == other.isTemporaryAddress() &&
            ((this.externalAgentID==null && other.getExternalAgentID()==null) || 
             (this.externalAgentID!=null &&
              this.externalAgentID.equals(other.getExternalAgentID()))) &&
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
            ((this.sales_Channel==null && other.getSales_Channel()==null) || 
             (this.sales_Channel!=null &&
              this.sales_Channel.equals(other.getSales_Channel()))) &&
            ((this.stateRegCode==null && other.getStateRegCode()==null) || 
             (this.stateRegCode!=null &&
              this.stateRegCode.equals(other.getStateRegCode()))) &&
            this.noDeviceOnOrder == other.isNoDeviceOnOrder() &&
            this.bypassIdentity == other.isBypassIdentity() &&
            ((this.bypassIdentityNotes==null && other.getBypassIdentityNotes()==null) || 
             (this.bypassIdentityNotes!=null &&
              this.bypassIdentityNotes.equals(other.getBypassIdentityNotes()))) &&
            ((this.alternateIDDesc==null && other.getAlternateIDDesc()==null) || 
             (this.alternateIDDesc!=null &&
              this.alternateIDDesc.equals(other.getAlternateIDDesc()))) &&
            ((this.alternateIDValue==null && other.getAlternateIDValue()==null) || 
             (this.alternateIDValue!=null &&
              this.alternateIDValue.equals(other.getAlternateIDValue()))) &&
            ((this.beneficiary==null && other.getBeneficiary()==null) || 
             (this.beneficiary!=null &&
              this.beneficiary.equals(other.getBeneficiary()))) &&
            this.accountCreditAwarded == other.getAccountCreditAwarded() &&
            ((this.documentVerification==null && other.getDocumentVerification()==null) || 
             (this.documentVerification!=null &&
              this.documentVerification.equals(other.getDocumentVerification()))) &&
            ((this.beneficiaryFirstName==null && other.getBeneficiaryFirstName()==null) || 
             (this.beneficiaryFirstName!=null &&
              this.beneficiaryFirstName.equals(other.getBeneficiaryFirstName()))) &&
            ((this.beneficiaryLastName==null && other.getBeneficiaryLastName()==null) || 
             (this.beneficiaryLastName!=null &&
              this.beneficiaryLastName.equals(other.getBeneficiaryLastName()))) &&
            ((this.beneficiarySSN==null && other.getBeneficiarySSN()==null) || 
             (this.beneficiarySSN!=null &&
              this.beneficiarySSN.equals(other.getBeneficiarySSN()))) &&
            ((this.beneficiaryDOB==null && other.getBeneficiaryDOB()==null) || 
             (this.beneficiaryDOB!=null &&
              this.beneficiaryDOB.equals(other.getBeneficiaryDOB()))) &&
            this.voiceOnly == other.isVoiceOnly() &&
            ((this.lifeline_ProgramValue==null && other.getLifeline_ProgramValue()==null) || 
             (this.lifeline_ProgramValue!=null &&
              this.lifeline_ProgramValue.equals(other.getLifeline_ProgramValue()))) &&
            ((this.stateRegCode2==null && other.getStateRegCode2()==null) || 
             (this.stateRegCode2!=null &&
              this.stateRegCode2.equals(other.getStateRegCode2()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
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
            this.ruralAddress == other.isRuralAddress() &&
            this.byPassDuplicate == other.isByPassDuplicate() &&
            this.HOHC == other.isHOHC() &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.lexID==null && other.getLexID()==null) || 
             (this.lexID!=null &&
              this.lexID.equals(other.getLexID()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.race==null && other.getRace()==null) || 
             (this.race!=null &&
              this.race.equals(other.getRace()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              this.maritalStatus.equals(other.getMaritalStatus()))) &&
            ((this.militaryStatus==null && other.getMilitaryStatus()==null) || 
             (this.militaryStatus!=null &&
              this.militaryStatus.equals(other.getMilitaryStatus())));
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
        if (getOrder_ID() != null) {
            _hashCode += getOrder_ID().hashCode();
        }
        _hashCode += (isLifeline() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTribalLifeline() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getLifeline_Program();
        _hashCode += getCellular_Plan();
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getFirst_Name() != null) {
            _hashCode += getFirst_Name().hashCode();
        }
        if (getLast_Name() != null) {
            _hashCode += getLast_Name().hashCode();
        }
        _hashCode += getValidated_AddressId();
        if (getSSN() != null) {
            _hashCode += getSSN().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUserPassword() != null) {
            _hashCode += getUserPassword().hashCode();
        }
        if (getReferringMobileNumber() != null) {
            _hashCode += getReferringMobileNumber().hashCode();
        }
        if (getPrequalifiedCode() != null) {
            _hashCode += getPrequalifiedCode().hashCode();
        }
        if (getDOB() != null) {
            _hashCode += getDOB().hashCode();
        }
        if (getAuthorizationCode() != null) {
            _hashCode += getAuthorizationCode().hashCode();
        }
        if (getEmployeeAcount() != null) {
            _hashCode += getEmployeeAcount().hashCode();
        }
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getTradeInDeviceID() != null) {
            _hashCode += getTradeInDeviceID().hashCode();
        }
        _hashCode += (isTemporaryAddress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExternalAgentID() != null) {
            _hashCode += getExternalAgentID().hashCode();
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
        if (getSales_Channel() != null) {
            _hashCode += getSales_Channel().hashCode();
        }
        if (getStateRegCode() != null) {
            _hashCode += getStateRegCode().hashCode();
        }
        _hashCode += (isNoDeviceOnOrder() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBypassIdentity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBypassIdentityNotes() != null) {
            _hashCode += getBypassIdentityNotes().hashCode();
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
        _hashCode += getAccountCreditAwarded();
        if (getDocumentVerification() != null) {
            _hashCode += getDocumentVerification().hashCode();
        }
        if (getBeneficiaryFirstName() != null) {
            _hashCode += getBeneficiaryFirstName().hashCode();
        }
        if (getBeneficiaryLastName() != null) {
            _hashCode += getBeneficiaryLastName().hashCode();
        }
        if (getBeneficiarySSN() != null) {
            _hashCode += getBeneficiarySSN().hashCode();
        }
        if (getBeneficiaryDOB() != null) {
            _hashCode += getBeneficiaryDOB().hashCode();
        }
        _hashCode += (isVoiceOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLifeline_ProgramValue() != null) {
            _hashCode += getLifeline_ProgramValue().hashCode();
        }
        if (getStateRegCode2() != null) {
            _hashCode += getStateRegCode2().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
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
        _hashCode += (isRuralAddress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isByPassDuplicate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHOHC() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getLexID() != null) {
            _hashCode += getLexID().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getRace() != null) {
            _hashCode += getRace().hashCode();
        }
        if (getMaritalStatus() != null) {
            _hashCode += getMaritalStatus().hashCode();
        }
        if (getMilitaryStatus() != null) {
            _hashCode += getMilitaryStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_Order_Enter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Order_Enter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Order_ID"));
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
        elemField.setFieldName("tribalLifeline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TribalLifeline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeline_Program");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Lifeline_Program"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellular_Plan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Cellular_Plan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first_Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "First_Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Last_Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validated_AddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Validated_AddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UserPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referringMobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReferringMobileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prequalifiedCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PrequalifiedCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AuthorizationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeAcount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EmployeeAcount"));
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
        elemField.setFieldName("tradeInDeviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TradeInDeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TemporaryAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalAgentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ExternalAgentID"));
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
        elemField.setFieldName("sales_Channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Sales_Channel"));
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
        elemField.setFieldName("noDeviceOnOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NoDeviceOnOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bypassIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BypassIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bypassIdentityNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BypassIdentityNotes"));
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
        elemField.setFieldName("accountCreditAwarded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AccountCreditAwarded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("beneficiarySSN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BeneficiarySSN"));
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
        elemField.setFieldName("voiceOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VoiceOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeline_ProgramValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Lifeline_ProgramValue"));
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
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Address"));
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
        elemField.setFieldName("ruralAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RuralAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byPassDuplicate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ByPassDuplicate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HOHC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HOHC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("lexID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LexID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("race");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Race"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MaritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("militaryStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MilitaryStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
