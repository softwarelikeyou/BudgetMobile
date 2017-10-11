/**
 * Credentials_RetrPreactivatedHandsetByDeviceID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_RetrPreactivatedHandsetByDeviceID  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private java.lang.String deviceID;

    private java.lang.String verizonValidateDay;

    public Credentials_RetrPreactivatedHandsetByDeviceID() {
    }

    public Credentials_RetrPreactivatedHandsetByDeviceID(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           java.lang.String deviceID,
           java.lang.String verizonValidateDay) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.deviceID = deviceID;
        this.verizonValidateDay = verizonValidateDay;
    }


    /**
     * Gets the deviceID value for this Credentials_RetrPreactivatedHandsetByDeviceID.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this Credentials_RetrPreactivatedHandsetByDeviceID.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the verizonValidateDay value for this Credentials_RetrPreactivatedHandsetByDeviceID.
     * 
     * @return verizonValidateDay
     */
    public java.lang.String getVerizonValidateDay() {
        return verizonValidateDay;
    }


    /**
     * Sets the verizonValidateDay value for this Credentials_RetrPreactivatedHandsetByDeviceID.
     * 
     * @param verizonValidateDay
     */
    public void setVerizonValidateDay(java.lang.String verizonValidateDay) {
        this.verizonValidateDay = verizonValidateDay;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_RetrPreactivatedHandsetByDeviceID)) return false;
        Credentials_RetrPreactivatedHandsetByDeviceID other = (Credentials_RetrPreactivatedHandsetByDeviceID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.verizonValidateDay==null && other.getVerizonValidateDay()==null) || 
             (this.verizonValidateDay!=null &&
              this.verizonValidateDay.equals(other.getVerizonValidateDay())));
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
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getVerizonValidateDay() != null) {
            _hashCode += getVerizonValidateDay().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_RetrPreactivatedHandsetByDeviceID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_RetrPreactivatedHandsetByDeviceID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verizonValidateDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VerizonValidateDay"));
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
