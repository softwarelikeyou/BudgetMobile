/**
 * Credentials_Recertify_BudgetMobile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_Recertify_BudgetMobile  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private java.lang.String agent_ID;

    private int budgetMobileID;

    private boolean updateAccountDetails;

    private java.lang.String first_Name;

    private java.lang.String last_Name;

    private java.lang.String SSN;

    private java.lang.String DOB;

    private java.lang.String contact;

    private java.lang.String email;

    private int lifelineProgram;

    private int validatedAddressID;

    private java.lang.String billingAddress;

    private java.lang.String billingAddress2;

    private java.lang.String billingCity;

    private java.lang.String billingState;

    private java.lang.String billingZip;

    private java.lang.String sales_Channel;

    private boolean temporaryAddress;

    private boolean bypassIdentity;

    private java.lang.String bypassIdentityNotes;

    private java.lang.String alternateIDDesc;

    private java.lang.String alternateIDValue;

    private java.lang.String beneficiary;

    private java.lang.String stateRegCode;

    private boolean editedWithoutAddress;

    public Credentials_Recertify_BudgetMobile() {
    }

    public Credentials_Recertify_BudgetMobile(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           java.lang.String agent_ID,
           int budgetMobileID,
           boolean updateAccountDetails,
           java.lang.String first_Name,
           java.lang.String last_Name,
           java.lang.String SSN,
           java.lang.String DOB,
           java.lang.String contact,
           java.lang.String email,
           int lifelineProgram,
           int validatedAddressID,
           java.lang.String billingAddress,
           java.lang.String billingAddress2,
           java.lang.String billingCity,
           java.lang.String billingState,
           java.lang.String billingZip,
           java.lang.String sales_Channel,
           boolean temporaryAddress,
           boolean bypassIdentity,
           java.lang.String bypassIdentityNotes,
           java.lang.String alternateIDDesc,
           java.lang.String alternateIDValue,
           java.lang.String beneficiary,
           java.lang.String stateRegCode,
           boolean editedWithoutAddress) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.agent_ID = agent_ID;
        this.budgetMobileID = budgetMobileID;
        this.updateAccountDetails = updateAccountDetails;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.SSN = SSN;
        this.DOB = DOB;
        this.contact = contact;
        this.email = email;
        this.lifelineProgram = lifelineProgram;
        this.validatedAddressID = validatedAddressID;
        this.billingAddress = billingAddress;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.sales_Channel = sales_Channel;
        this.temporaryAddress = temporaryAddress;
        this.bypassIdentity = bypassIdentity;
        this.bypassIdentityNotes = bypassIdentityNotes;
        this.alternateIDDesc = alternateIDDesc;
        this.alternateIDValue = alternateIDValue;
        this.beneficiary = beneficiary;
        this.stateRegCode = stateRegCode;
        this.editedWithoutAddress = editedWithoutAddress;
    }


    /**
     * Gets the agent_ID value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return agent_ID
     */
    public java.lang.String getAgent_ID() {
        return agent_ID;
    }


    /**
     * Sets the agent_ID value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param agent_ID
     */
    public void setAgent_ID(java.lang.String agent_ID) {
        this.agent_ID = agent_ID;
    }


    /**
     * Gets the budgetMobileID value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return budgetMobileID
     */
    public int getBudgetMobileID() {
        return budgetMobileID;
    }


    /**
     * Sets the budgetMobileID value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param budgetMobileID
     */
    public void setBudgetMobileID(int budgetMobileID) {
        this.budgetMobileID = budgetMobileID;
    }


    /**
     * Gets the updateAccountDetails value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return updateAccountDetails
     */
    public boolean isUpdateAccountDetails() {
        return updateAccountDetails;
    }


    /**
     * Sets the updateAccountDetails value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param updateAccountDetails
     */
    public void setUpdateAccountDetails(boolean updateAccountDetails) {
        this.updateAccountDetails = updateAccountDetails;
    }


    /**
     * Gets the first_Name value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return first_Name
     */
    public java.lang.String getFirst_Name() {
        return first_Name;
    }


    /**
     * Sets the first_Name value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param first_Name
     */
    public void setFirst_Name(java.lang.String first_Name) {
        this.first_Name = first_Name;
    }


    /**
     * Gets the last_Name value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return last_Name
     */
    public java.lang.String getLast_Name() {
        return last_Name;
    }


    /**
     * Sets the last_Name value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param last_Name
     */
    public void setLast_Name(java.lang.String last_Name) {
        this.last_Name = last_Name;
    }


    /**
     * Gets the SSN value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return SSN
     */
    public java.lang.String getSSN() {
        return SSN;
    }


    /**
     * Sets the SSN value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param SSN
     */
    public void setSSN(java.lang.String SSN) {
        this.SSN = SSN;
    }


    /**
     * Gets the DOB value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return DOB
     */
    public java.lang.String getDOB() {
        return DOB;
    }


    /**
     * Sets the DOB value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param DOB
     */
    public void setDOB(java.lang.String DOB) {
        this.DOB = DOB;
    }


    /**
     * Gets the contact value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return contact
     */
    public java.lang.String getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param contact
     */
    public void setContact(java.lang.String contact) {
        this.contact = contact;
    }


    /**
     * Gets the email value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the lifelineProgram value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return lifelineProgram
     */
    public int getLifelineProgram() {
        return lifelineProgram;
    }


    /**
     * Sets the lifelineProgram value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param lifelineProgram
     */
    public void setLifelineProgram(int lifelineProgram) {
        this.lifelineProgram = lifelineProgram;
    }


    /**
     * Gets the validatedAddressID value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return validatedAddressID
     */
    public int getValidatedAddressID() {
        return validatedAddressID;
    }


    /**
     * Sets the validatedAddressID value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param validatedAddressID
     */
    public void setValidatedAddressID(int validatedAddressID) {
        this.validatedAddressID = validatedAddressID;
    }


    /**
     * Gets the billingAddress value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return billingAddress
     */
    public java.lang.String getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(java.lang.String billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the billingAddress2 value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return billingAddress2
     */
    public java.lang.String getBillingAddress2() {
        return billingAddress2;
    }


    /**
     * Sets the billingAddress2 value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param billingAddress2
     */
    public void setBillingAddress2(java.lang.String billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }


    /**
     * Gets the billingCity value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return billingCity
     */
    public java.lang.String getBillingCity() {
        return billingCity;
    }


    /**
     * Sets the billingCity value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param billingCity
     */
    public void setBillingCity(java.lang.String billingCity) {
        this.billingCity = billingCity;
    }


    /**
     * Gets the billingState value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return billingState
     */
    public java.lang.String getBillingState() {
        return billingState;
    }


    /**
     * Sets the billingState value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param billingState
     */
    public void setBillingState(java.lang.String billingState) {
        this.billingState = billingState;
    }


    /**
     * Gets the billingZip value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return billingZip
     */
    public java.lang.String getBillingZip() {
        return billingZip;
    }


    /**
     * Sets the billingZip value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param billingZip
     */
    public void setBillingZip(java.lang.String billingZip) {
        this.billingZip = billingZip;
    }


    /**
     * Gets the sales_Channel value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return sales_Channel
     */
    public java.lang.String getSales_Channel() {
        return sales_Channel;
    }


    /**
     * Sets the sales_Channel value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param sales_Channel
     */
    public void setSales_Channel(java.lang.String sales_Channel) {
        this.sales_Channel = sales_Channel;
    }


    /**
     * Gets the temporaryAddress value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return temporaryAddress
     */
    public boolean isTemporaryAddress() {
        return temporaryAddress;
    }


    /**
     * Sets the temporaryAddress value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param temporaryAddress
     */
    public void setTemporaryAddress(boolean temporaryAddress) {
        this.temporaryAddress = temporaryAddress;
    }


    /**
     * Gets the bypassIdentity value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return bypassIdentity
     */
    public boolean isBypassIdentity() {
        return bypassIdentity;
    }


    /**
     * Sets the bypassIdentity value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param bypassIdentity
     */
    public void setBypassIdentity(boolean bypassIdentity) {
        this.bypassIdentity = bypassIdentity;
    }


    /**
     * Gets the bypassIdentityNotes value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return bypassIdentityNotes
     */
    public java.lang.String getBypassIdentityNotes() {
        return bypassIdentityNotes;
    }


    /**
     * Sets the bypassIdentityNotes value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param bypassIdentityNotes
     */
    public void setBypassIdentityNotes(java.lang.String bypassIdentityNotes) {
        this.bypassIdentityNotes = bypassIdentityNotes;
    }


    /**
     * Gets the alternateIDDesc value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return alternateIDDesc
     */
    public java.lang.String getAlternateIDDesc() {
        return alternateIDDesc;
    }


    /**
     * Sets the alternateIDDesc value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param alternateIDDesc
     */
    public void setAlternateIDDesc(java.lang.String alternateIDDesc) {
        this.alternateIDDesc = alternateIDDesc;
    }


    /**
     * Gets the alternateIDValue value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return alternateIDValue
     */
    public java.lang.String getAlternateIDValue() {
        return alternateIDValue;
    }


    /**
     * Sets the alternateIDValue value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param alternateIDValue
     */
    public void setAlternateIDValue(java.lang.String alternateIDValue) {
        this.alternateIDValue = alternateIDValue;
    }


    /**
     * Gets the beneficiary value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return beneficiary
     */
    public java.lang.String getBeneficiary() {
        return beneficiary;
    }


    /**
     * Sets the beneficiary value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param beneficiary
     */
    public void setBeneficiary(java.lang.String beneficiary) {
        this.beneficiary = beneficiary;
    }


    /**
     * Gets the stateRegCode value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return stateRegCode
     */
    public java.lang.String getStateRegCode() {
        return stateRegCode;
    }


    /**
     * Sets the stateRegCode value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param stateRegCode
     */
    public void setStateRegCode(java.lang.String stateRegCode) {
        this.stateRegCode = stateRegCode;
    }


    /**
     * Gets the editedWithoutAddress value for this Credentials_Recertify_BudgetMobile.
     * 
     * @return editedWithoutAddress
     */
    public boolean isEditedWithoutAddress() {
        return editedWithoutAddress;
    }


    /**
     * Sets the editedWithoutAddress value for this Credentials_Recertify_BudgetMobile.
     * 
     * @param editedWithoutAddress
     */
    public void setEditedWithoutAddress(boolean editedWithoutAddress) {
        this.editedWithoutAddress = editedWithoutAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_Recertify_BudgetMobile)) return false;
        Credentials_Recertify_BudgetMobile other = (Credentials_Recertify_BudgetMobile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.agent_ID==null && other.getAgent_ID()==null) || 
             (this.agent_ID!=null &&
              this.agent_ID.equals(other.getAgent_ID()))) &&
            this.budgetMobileID == other.getBudgetMobileID() &&
            this.updateAccountDetails == other.isUpdateAccountDetails() &&
            ((this.first_Name==null && other.getFirst_Name()==null) || 
             (this.first_Name!=null &&
              this.first_Name.equals(other.getFirst_Name()))) &&
            ((this.last_Name==null && other.getLast_Name()==null) || 
             (this.last_Name!=null &&
              this.last_Name.equals(other.getLast_Name()))) &&
            ((this.SSN==null && other.getSSN()==null) || 
             (this.SSN!=null &&
              this.SSN.equals(other.getSSN()))) &&
            ((this.DOB==null && other.getDOB()==null) || 
             (this.DOB!=null &&
              this.DOB.equals(other.getDOB()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.lifelineProgram == other.getLifelineProgram() &&
            this.validatedAddressID == other.getValidatedAddressID() &&
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
            this.temporaryAddress == other.isTemporaryAddress() &&
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
            ((this.stateRegCode==null && other.getStateRegCode()==null) || 
             (this.stateRegCode!=null &&
              this.stateRegCode.equals(other.getStateRegCode()))) &&
            this.editedWithoutAddress == other.isEditedWithoutAddress();
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
        if (getAgent_ID() != null) {
            _hashCode += getAgent_ID().hashCode();
        }
        _hashCode += getBudgetMobileID();
        _hashCode += (isUpdateAccountDetails() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFirst_Name() != null) {
            _hashCode += getFirst_Name().hashCode();
        }
        if (getLast_Name() != null) {
            _hashCode += getLast_Name().hashCode();
        }
        if (getSSN() != null) {
            _hashCode += getSSN().hashCode();
        }
        if (getDOB() != null) {
            _hashCode += getDOB().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += getLifelineProgram();
        _hashCode += getValidatedAddressID();
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
        _hashCode += (isTemporaryAddress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getStateRegCode() != null) {
            _hashCode += getStateRegCode().hashCode();
        }
        _hashCode += (isEditedWithoutAddress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_Recertify_BudgetMobile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Recertify_BudgetMobile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agent_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Agent_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetMobileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BudgetMobileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateAccountDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateAccountDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("SSN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SSN"));
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
        elemField.setFieldName("lifelineProgram");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LifelineProgram"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validatedAddressID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValidatedAddressID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("temporaryAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TemporaryAddress"));
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
        elemField.setFieldName("stateRegCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StateRegCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editedWithoutAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EditedWithoutAddress"));
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
