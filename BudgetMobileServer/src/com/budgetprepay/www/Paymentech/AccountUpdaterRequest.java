/**
 * AccountUpdaterRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class AccountUpdaterRequest  implements java.io.Serializable {
    private java.lang.String endppoint;

    private java.lang.String bin;

    private java.lang.String merchantID;

    private java.lang.String orbitalConnectionPassword;

    private java.lang.String orbitalConnectionUsername;

    private java.lang.String customerProfileAction;

    private java.lang.String customerRefNum;

    private java.lang.String scheduledDate;

    private java.lang.String version;

    public AccountUpdaterRequest() {
    }

    public AccountUpdaterRequest(
           java.lang.String endppoint,
           java.lang.String bin,
           java.lang.String merchantID,
           java.lang.String orbitalConnectionPassword,
           java.lang.String orbitalConnectionUsername,
           java.lang.String customerProfileAction,
           java.lang.String customerRefNum,
           java.lang.String scheduledDate,
           java.lang.String version) {
           this.endppoint = endppoint;
           this.bin = bin;
           this.merchantID = merchantID;
           this.orbitalConnectionPassword = orbitalConnectionPassword;
           this.orbitalConnectionUsername = orbitalConnectionUsername;
           this.customerProfileAction = customerProfileAction;
           this.customerRefNum = customerRefNum;
           this.scheduledDate = scheduledDate;
           this.version = version;
    }


    /**
     * Gets the endppoint value for this AccountUpdaterRequest.
     * 
     * @return endppoint
     */
    public java.lang.String getEndppoint() {
        return endppoint;
    }


    /**
     * Sets the endppoint value for this AccountUpdaterRequest.
     * 
     * @param endppoint
     */
    public void setEndppoint(java.lang.String endppoint) {
        this.endppoint = endppoint;
    }


    /**
     * Gets the bin value for this AccountUpdaterRequest.
     * 
     * @return bin
     */
    public java.lang.String getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this AccountUpdaterRequest.
     * 
     * @param bin
     */
    public void setBin(java.lang.String bin) {
        this.bin = bin;
    }


    /**
     * Gets the merchantID value for this AccountUpdaterRequest.
     * 
     * @return merchantID
     */
    public java.lang.String getMerchantID() {
        return merchantID;
    }


    /**
     * Sets the merchantID value for this AccountUpdaterRequest.
     * 
     * @param merchantID
     */
    public void setMerchantID(java.lang.String merchantID) {
        this.merchantID = merchantID;
    }


    /**
     * Gets the orbitalConnectionPassword value for this AccountUpdaterRequest.
     * 
     * @return orbitalConnectionPassword
     */
    public java.lang.String getOrbitalConnectionPassword() {
        return orbitalConnectionPassword;
    }


    /**
     * Sets the orbitalConnectionPassword value for this AccountUpdaterRequest.
     * 
     * @param orbitalConnectionPassword
     */
    public void setOrbitalConnectionPassword(java.lang.String orbitalConnectionPassword) {
        this.orbitalConnectionPassword = orbitalConnectionPassword;
    }


    /**
     * Gets the orbitalConnectionUsername value for this AccountUpdaterRequest.
     * 
     * @return orbitalConnectionUsername
     */
    public java.lang.String getOrbitalConnectionUsername() {
        return orbitalConnectionUsername;
    }


    /**
     * Sets the orbitalConnectionUsername value for this AccountUpdaterRequest.
     * 
     * @param orbitalConnectionUsername
     */
    public void setOrbitalConnectionUsername(java.lang.String orbitalConnectionUsername) {
        this.orbitalConnectionUsername = orbitalConnectionUsername;
    }


    /**
     * Gets the customerProfileAction value for this AccountUpdaterRequest.
     * 
     * @return customerProfileAction
     */
    public java.lang.String getCustomerProfileAction() {
        return customerProfileAction;
    }


    /**
     * Sets the customerProfileAction value for this AccountUpdaterRequest.
     * 
     * @param customerProfileAction
     */
    public void setCustomerProfileAction(java.lang.String customerProfileAction) {
        this.customerProfileAction = customerProfileAction;
    }


    /**
     * Gets the customerRefNum value for this AccountUpdaterRequest.
     * 
     * @return customerRefNum
     */
    public java.lang.String getCustomerRefNum() {
        return customerRefNum;
    }


    /**
     * Sets the customerRefNum value for this AccountUpdaterRequest.
     * 
     * @param customerRefNum
     */
    public void setCustomerRefNum(java.lang.String customerRefNum) {
        this.customerRefNum = customerRefNum;
    }


    /**
     * Gets the scheduledDate value for this AccountUpdaterRequest.
     * 
     * @return scheduledDate
     */
    public java.lang.String getScheduledDate() {
        return scheduledDate;
    }


    /**
     * Sets the scheduledDate value for this AccountUpdaterRequest.
     * 
     * @param scheduledDate
     */
    public void setScheduledDate(java.lang.String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }


    /**
     * Gets the version value for this AccountUpdaterRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AccountUpdaterRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountUpdaterRequest)) return false;
        AccountUpdaterRequest other = (AccountUpdaterRequest) obj;
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
            ((this.customerProfileAction==null && other.getCustomerProfileAction()==null) || 
             (this.customerProfileAction!=null &&
              this.customerProfileAction.equals(other.getCustomerProfileAction()))) &&
            ((this.customerRefNum==null && other.getCustomerRefNum()==null) || 
             (this.customerRefNum!=null &&
              this.customerRefNum.equals(other.getCustomerRefNum()))) &&
            ((this.scheduledDate==null && other.getScheduledDate()==null) || 
             (this.scheduledDate!=null &&
              this.scheduledDate.equals(other.getScheduledDate()))) &&
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
        if (getCustomerProfileAction() != null) {
            _hashCode += getCustomerProfileAction().hashCode();
        }
        if (getCustomerRefNum() != null) {
            _hashCode += getCustomerRefNum().hashCode();
        }
        if (getScheduledDate() != null) {
            _hashCode += getScheduledDate().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountUpdaterRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "AccountUpdaterRequest"));
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
        elemField.setFieldName("customerProfileAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerProfileAction"));
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
        elemField.setFieldName("scheduledDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "scheduledDate"));
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
