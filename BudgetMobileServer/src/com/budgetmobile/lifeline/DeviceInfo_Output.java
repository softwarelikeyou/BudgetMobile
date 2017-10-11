/**
 * DeviceInfo_Output.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class DeviceInfo_Output  implements java.io.Serializable {
    private java.lang.String serialNumber;

    private java.lang.String masterSubsidyLock;

    public DeviceInfo_Output() {
    }

    public DeviceInfo_Output(
           java.lang.String serialNumber,
           java.lang.String masterSubsidyLock) {
           this.serialNumber = serialNumber;
           this.masterSubsidyLock = masterSubsidyLock;
    }


    /**
     * Gets the serialNumber value for this DeviceInfo_Output.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this DeviceInfo_Output.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the masterSubsidyLock value for this DeviceInfo_Output.
     * 
     * @return masterSubsidyLock
     */
    public java.lang.String getMasterSubsidyLock() {
        return masterSubsidyLock;
    }


    /**
     * Sets the masterSubsidyLock value for this DeviceInfo_Output.
     * 
     * @param masterSubsidyLock
     */
    public void setMasterSubsidyLock(java.lang.String masterSubsidyLock) {
        this.masterSubsidyLock = masterSubsidyLock;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceInfo_Output)) return false;
        DeviceInfo_Output other = (DeviceInfo_Output) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.masterSubsidyLock==null && other.getMasterSubsidyLock()==null) || 
             (this.masterSubsidyLock!=null &&
              this.masterSubsidyLock.equals(other.getMasterSubsidyLock())));
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
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getMasterSubsidyLock() != null) {
            _hashCode += getMasterSubsidyLock().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceInfo_Output.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DeviceInfo_Output"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterSubsidyLock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MasterSubsidyLock"));
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
