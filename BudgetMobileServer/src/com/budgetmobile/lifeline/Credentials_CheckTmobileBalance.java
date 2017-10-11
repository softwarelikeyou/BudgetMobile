/**
 * Credentials_CheckTmobileBalance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_CheckTmobileBalance  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private java.lang.String mobileNumber;

    public Credentials_CheckTmobileBalance() {
    }

    public Credentials_CheckTmobileBalance(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           java.lang.String mobileNumber) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the mobileNumber value for this Credentials_CheckTmobileBalance.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this Credentials_CheckTmobileBalance.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_CheckTmobileBalance)) return false;
        Credentials_CheckTmobileBalance other = (Credentials_CheckTmobileBalance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber())));
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
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_CheckTmobileBalance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_CheckTmobileBalance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MobileNumber"));
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
