/**
 * ClientInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class ClientInput  implements java.io.Serializable {
    private java.lang.String applicationID;

    private java.lang.String applicationPassword;

    private int locationID;

    private java.lang.String employeeName;

    public ClientInput() {
    }

    public ClientInput(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName) {
           this.applicationID = applicationID;
           this.applicationPassword = applicationPassword;
           this.locationID = locationID;
           this.employeeName = employeeName;
    }


    /**
     * Gets the applicationID value for this ClientInput.
     * 
     * @return applicationID
     */
    public java.lang.String getApplicationID() {
        return applicationID;
    }


    /**
     * Sets the applicationID value for this ClientInput.
     * 
     * @param applicationID
     */
    public void setApplicationID(java.lang.String applicationID) {
        this.applicationID = applicationID;
    }


    /**
     * Gets the applicationPassword value for this ClientInput.
     * 
     * @return applicationPassword
     */
    public java.lang.String getApplicationPassword() {
        return applicationPassword;
    }


    /**
     * Sets the applicationPassword value for this ClientInput.
     * 
     * @param applicationPassword
     */
    public void setApplicationPassword(java.lang.String applicationPassword) {
        this.applicationPassword = applicationPassword;
    }


    /**
     * Gets the locationID value for this ClientInput.
     * 
     * @return locationID
     */
    public int getLocationID() {
        return locationID;
    }


    /**
     * Sets the locationID value for this ClientInput.
     * 
     * @param locationID
     */
    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }


    /**
     * Gets the employeeName value for this ClientInput.
     * 
     * @return employeeName
     */
    public java.lang.String getEmployeeName() {
        return employeeName;
    }


    /**
     * Sets the employeeName value for this ClientInput.
     * 
     * @param employeeName
     */
    public void setEmployeeName(java.lang.String employeeName) {
        this.employeeName = employeeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientInput)) return false;
        ClientInput other = (ClientInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationID==null && other.getApplicationID()==null) || 
             (this.applicationID!=null &&
              this.applicationID.equals(other.getApplicationID()))) &&
            ((this.applicationPassword==null && other.getApplicationPassword()==null) || 
             (this.applicationPassword!=null &&
              this.applicationPassword.equals(other.getApplicationPassword()))) &&
            this.locationID == other.getLocationID() &&
            ((this.employeeName==null && other.getEmployeeName()==null) || 
             (this.employeeName!=null &&
              this.employeeName.equals(other.getEmployeeName())));
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
        if (getApplicationID() != null) {
            _hashCode += getApplicationID().hashCode();
        }
        if (getApplicationPassword() != null) {
            _hashCode += getApplicationPassword().hashCode();
        }
        _hashCode += getLocationID();
        if (getEmployeeName() != null) {
            _hashCode += getEmployeeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClientInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ClientInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ApplicationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ApplicationPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EmployeeName"));
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
