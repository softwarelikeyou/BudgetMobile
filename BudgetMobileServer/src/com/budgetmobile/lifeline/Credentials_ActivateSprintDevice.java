/**
 * Credentials_ActivateSprintDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_ActivateSprintDevice  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private java.lang.String order_ID;

    private java.lang.String deviceID;

    private java.lang.String zip;

    private int specialProvisioningCode;

    public Credentials_ActivateSprintDevice() {
    }

    public Credentials_ActivateSprintDevice(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           java.lang.String order_ID,
           java.lang.String deviceID,
           java.lang.String zip,
           int specialProvisioningCode) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.order_ID = order_ID;
        this.deviceID = deviceID;
        this.zip = zip;
        this.specialProvisioningCode = specialProvisioningCode;
    }


    /**
     * Gets the order_ID value for this Credentials_ActivateSprintDevice.
     * 
     * @return order_ID
     */
    public java.lang.String getOrder_ID() {
        return order_ID;
    }


    /**
     * Sets the order_ID value for this Credentials_ActivateSprintDevice.
     * 
     * @param order_ID
     */
    public void setOrder_ID(java.lang.String order_ID) {
        this.order_ID = order_ID;
    }


    /**
     * Gets the deviceID value for this Credentials_ActivateSprintDevice.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this Credentials_ActivateSprintDevice.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the zip value for this Credentials_ActivateSprintDevice.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this Credentials_ActivateSprintDevice.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the specialProvisioningCode value for this Credentials_ActivateSprintDevice.
     * 
     * @return specialProvisioningCode
     */
    public int getSpecialProvisioningCode() {
        return specialProvisioningCode;
    }


    /**
     * Sets the specialProvisioningCode value for this Credentials_ActivateSprintDevice.
     * 
     * @param specialProvisioningCode
     */
    public void setSpecialProvisioningCode(int specialProvisioningCode) {
        this.specialProvisioningCode = specialProvisioningCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_ActivateSprintDevice)) return false;
        Credentials_ActivateSprintDevice other = (Credentials_ActivateSprintDevice) obj;
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
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            this.specialProvisioningCode == other.getSpecialProvisioningCode();
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
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        _hashCode += getSpecialProvisioningCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_ActivateSprintDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_ActivateSprintDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Order_ID"));
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
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialProvisioningCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SpecialProvisioningCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
