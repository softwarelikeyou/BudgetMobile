/**
 * Credentials_UpdateProviderDeviceID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_UpdateProviderDeviceID  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private long budgetMobileID;

    private int providerID;

    private java.lang.String deviceID;

    private java.lang.String IMSI;

    public Credentials_UpdateProviderDeviceID() {
    }

    public Credentials_UpdateProviderDeviceID(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           long budgetMobileID,
           int providerID,
           java.lang.String deviceID,
           java.lang.String IMSI) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.budgetMobileID = budgetMobileID;
        this.providerID = providerID;
        this.deviceID = deviceID;
        this.IMSI = IMSI;
    }


    /**
     * Gets the budgetMobileID value for this Credentials_UpdateProviderDeviceID.
     * 
     * @return budgetMobileID
     */
    public long getBudgetMobileID() {
        return budgetMobileID;
    }


    /**
     * Sets the budgetMobileID value for this Credentials_UpdateProviderDeviceID.
     * 
     * @param budgetMobileID
     */
    public void setBudgetMobileID(long budgetMobileID) {
        this.budgetMobileID = budgetMobileID;
    }


    /**
     * Gets the providerID value for this Credentials_UpdateProviderDeviceID.
     * 
     * @return providerID
     */
    public int getProviderID() {
        return providerID;
    }


    /**
     * Sets the providerID value for this Credentials_UpdateProviderDeviceID.
     * 
     * @param providerID
     */
    public void setProviderID(int providerID) {
        this.providerID = providerID;
    }


    /**
     * Gets the deviceID value for this Credentials_UpdateProviderDeviceID.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this Credentials_UpdateProviderDeviceID.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the IMSI value for this Credentials_UpdateProviderDeviceID.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this Credentials_UpdateProviderDeviceID.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_UpdateProviderDeviceID)) return false;
        Credentials_UpdateProviderDeviceID other = (Credentials_UpdateProviderDeviceID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.budgetMobileID == other.getBudgetMobileID() &&
            this.providerID == other.getProviderID() &&
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI())));
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
        _hashCode += new Long(getBudgetMobileID()).hashCode();
        _hashCode += getProviderID();
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_UpdateProviderDeviceID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_UpdateProviderDeviceID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetMobileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BudgetMobileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProviderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IMSI"));
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
