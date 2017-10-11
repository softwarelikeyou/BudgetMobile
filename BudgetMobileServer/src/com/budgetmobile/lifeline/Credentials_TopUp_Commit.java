/**
 * Credentials_TopUp_Commit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_TopUp_Commit  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private java.lang.String sales_Channel;

    private int referenceID;

    private boolean CCPayment;

    public Credentials_TopUp_Commit() {
    }

    public Credentials_TopUp_Commit(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           java.lang.String sales_Channel,
           int referenceID,
           boolean CCPayment) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.sales_Channel = sales_Channel;
        this.referenceID = referenceID;
        this.CCPayment = CCPayment;
    }


    /**
     * Gets the sales_Channel value for this Credentials_TopUp_Commit.
     * 
     * @return sales_Channel
     */
    public java.lang.String getSales_Channel() {
        return sales_Channel;
    }


    /**
     * Sets the sales_Channel value for this Credentials_TopUp_Commit.
     * 
     * @param sales_Channel
     */
    public void setSales_Channel(java.lang.String sales_Channel) {
        this.sales_Channel = sales_Channel;
    }


    /**
     * Gets the referenceID value for this Credentials_TopUp_Commit.
     * 
     * @return referenceID
     */
    public int getReferenceID() {
        return referenceID;
    }


    /**
     * Sets the referenceID value for this Credentials_TopUp_Commit.
     * 
     * @param referenceID
     */
    public void setReferenceID(int referenceID) {
        this.referenceID = referenceID;
    }


    /**
     * Gets the CCPayment value for this Credentials_TopUp_Commit.
     * 
     * @return CCPayment
     */
    public boolean isCCPayment() {
        return CCPayment;
    }


    /**
     * Sets the CCPayment value for this Credentials_TopUp_Commit.
     * 
     * @param CCPayment
     */
    public void setCCPayment(boolean CCPayment) {
        this.CCPayment = CCPayment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_TopUp_Commit)) return false;
        Credentials_TopUp_Commit other = (Credentials_TopUp_Commit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sales_Channel==null && other.getSales_Channel()==null) || 
             (this.sales_Channel!=null &&
              this.sales_Channel.equals(other.getSales_Channel()))) &&
            this.referenceID == other.getReferenceID() &&
            this.CCPayment == other.isCCPayment();
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
        if (getSales_Channel() != null) {
            _hashCode += getSales_Channel().hashCode();
        }
        _hashCode += getReferenceID();
        _hashCode += (isCCPayment() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_TopUp_Commit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_TopUp_Commit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Sales_Channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
