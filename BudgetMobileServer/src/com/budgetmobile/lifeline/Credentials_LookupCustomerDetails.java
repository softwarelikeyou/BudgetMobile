/**
 * Credentials_LookupCustomerDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_LookupCustomerDetails  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private long budgetMobileID;

    public Credentials_LookupCustomerDetails() {
    }

    public Credentials_LookupCustomerDetails(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           long budgetMobileID) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.budgetMobileID = budgetMobileID;
    }


    /**
     * Gets the budgetMobileID value for this Credentials_LookupCustomerDetails.
     * 
     * @return budgetMobileID
     */
    public long getBudgetMobileID() {
        return budgetMobileID;
    }


    /**
     * Sets the budgetMobileID value for this Credentials_LookupCustomerDetails.
     * 
     * @param budgetMobileID
     */
    public void setBudgetMobileID(long budgetMobileID) {
        this.budgetMobileID = budgetMobileID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_LookupCustomerDetails)) return false;
        Credentials_LookupCustomerDetails other = (Credentials_LookupCustomerDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.budgetMobileID == other.getBudgetMobileID();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_LookupCustomerDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_LookupCustomerDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetMobileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BudgetMobileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
