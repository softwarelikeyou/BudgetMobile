/**
 * Credentials_Verizon_Discrete_DeviceInquiry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_Verizon_Discrete_DeviceInquiry  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private java.lang.String deviceID;

    private java.lang.String order_Id;

    public Credentials_Verizon_Discrete_DeviceInquiry() {
    }

    public Credentials_Verizon_Discrete_DeviceInquiry(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           java.lang.String deviceID,
           java.lang.String order_Id) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.deviceID = deviceID;
        this.order_Id = order_Id;
    }


    /**
     * Gets the deviceID value for this Credentials_Verizon_Discrete_DeviceInquiry.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this Credentials_Verizon_Discrete_DeviceInquiry.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the order_Id value for this Credentials_Verizon_Discrete_DeviceInquiry.
     * 
     * @return order_Id
     */
    public java.lang.String getOrder_Id() {
        return order_Id;
    }


    /**
     * Sets the order_Id value for this Credentials_Verizon_Discrete_DeviceInquiry.
     * 
     * @param order_Id
     */
    public void setOrder_Id(java.lang.String order_Id) {
        this.order_Id = order_Id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_Verizon_Discrete_DeviceInquiry)) return false;
        Credentials_Verizon_Discrete_DeviceInquiry other = (Credentials_Verizon_Discrete_DeviceInquiry) obj;
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
            ((this.order_Id==null && other.getOrder_Id()==null) || 
             (this.order_Id!=null &&
              this.order_Id.equals(other.getOrder_Id())));
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
        if (getOrder_Id() != null) {
            _hashCode += getOrder_Id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_Verizon_Discrete_DeviceInquiry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Verizon_Discrete_DeviceInquiry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_Id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Order_Id"));
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
