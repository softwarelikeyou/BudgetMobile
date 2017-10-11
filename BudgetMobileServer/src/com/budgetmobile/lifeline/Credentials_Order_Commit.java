/**
 * Credentials_Order_Commit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_Order_Commit  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private double overPayment;

    private int referenceID;

    private boolean CCPayment;

    private boolean HOHC;

    public Credentials_Order_Commit() {
    }

    public Credentials_Order_Commit(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           double overPayment,
           int referenceID,
           boolean CCPayment,
           boolean HOHC) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.overPayment = overPayment;
        this.referenceID = referenceID;
        this.CCPayment = CCPayment;
        this.HOHC = HOHC;
    }


    /**
     * Gets the overPayment value for this Credentials_Order_Commit.
     * 
     * @return overPayment
     */
    public double getOverPayment() {
        return overPayment;
    }


    /**
     * Sets the overPayment value for this Credentials_Order_Commit.
     * 
     * @param overPayment
     */
    public void setOverPayment(double overPayment) {
        this.overPayment = overPayment;
    }


    /**
     * Gets the referenceID value for this Credentials_Order_Commit.
     * 
     * @return referenceID
     */
    public int getReferenceID() {
        return referenceID;
    }


    /**
     * Sets the referenceID value for this Credentials_Order_Commit.
     * 
     * @param referenceID
     */
    public void setReferenceID(int referenceID) {
        this.referenceID = referenceID;
    }


    /**
     * Gets the CCPayment value for this Credentials_Order_Commit.
     * 
     * @return CCPayment
     */
    public boolean isCCPayment() {
        return CCPayment;
    }


    /**
     * Sets the CCPayment value for this Credentials_Order_Commit.
     * 
     * @param CCPayment
     */
    public void setCCPayment(boolean CCPayment) {
        this.CCPayment = CCPayment;
    }


    /**
     * Gets the HOHC value for this Credentials_Order_Commit.
     * 
     * @return HOHC
     */
    public boolean isHOHC() {
        return HOHC;
    }


    /**
     * Sets the HOHC value for this Credentials_Order_Commit.
     * 
     * @param HOHC
     */
    public void setHOHC(boolean HOHC) {
        this.HOHC = HOHC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_Order_Commit)) return false;
        Credentials_Order_Commit other = (Credentials_Order_Commit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.overPayment == other.getOverPayment() &&
            this.referenceID == other.getReferenceID() &&
            this.CCPayment == other.isCCPayment() &&
            this.HOHC == other.isHOHC();
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
        _hashCode += new Double(getOverPayment()).hashCode();
        _hashCode += getReferenceID();
        _hashCode += (isCCPayment() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHOHC() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_Order_Commit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Order_Commit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OverPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReferenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CCPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HOHC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HOHC"));
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
