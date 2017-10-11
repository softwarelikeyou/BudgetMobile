/**
 * Credentials_LookupAvailableTopUp_New.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_LookupAvailableTopUp_New  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private java.lang.String state;

    private int providerID;

    private boolean lifeline;

    public Credentials_LookupAvailableTopUp_New() {
    }

    public Credentials_LookupAvailableTopUp_New(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           java.lang.String state,
           int providerID,
           boolean lifeline) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.state = state;
        this.providerID = providerID;
        this.lifeline = lifeline;
    }


    /**
     * Gets the state value for this Credentials_LookupAvailableTopUp_New.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Credentials_LookupAvailableTopUp_New.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the providerID value for this Credentials_LookupAvailableTopUp_New.
     * 
     * @return providerID
     */
    public int getProviderID() {
        return providerID;
    }


    /**
     * Sets the providerID value for this Credentials_LookupAvailableTopUp_New.
     * 
     * @param providerID
     */
    public void setProviderID(int providerID) {
        this.providerID = providerID;
    }


    /**
     * Gets the lifeline value for this Credentials_LookupAvailableTopUp_New.
     * 
     * @return lifeline
     */
    public boolean isLifeline() {
        return lifeline;
    }


    /**
     * Sets the lifeline value for this Credentials_LookupAvailableTopUp_New.
     * 
     * @param lifeline
     */
    public void setLifeline(boolean lifeline) {
        this.lifeline = lifeline;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_LookupAvailableTopUp_New)) return false;
        Credentials_LookupAvailableTopUp_New other = (Credentials_LookupAvailableTopUp_New) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            this.providerID == other.getProviderID() &&
            this.lifeline == other.isLifeline();
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        _hashCode += getProviderID();
        _hashCode += (isLifeline() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_LookupAvailableTopUp_New.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupAvailableTopUp_New"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProviderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Lifeline"));
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
