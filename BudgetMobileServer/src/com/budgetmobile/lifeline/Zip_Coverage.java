/**
 * Zip_Coverage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Zip_Coverage  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private boolean validForVerizon;

    private boolean validForSprint;

    private boolean validForTmobile;

    public Zip_Coverage() {
    }

    public Zip_Coverage(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           boolean validForVerizon,
           boolean validForSprint,
           boolean validForTmobile) {
        super(
            errors,
            isError);
        this.validForVerizon = validForVerizon;
        this.validForSprint = validForSprint;
        this.validForTmobile = validForTmobile;
    }


    /**
     * Gets the validForVerizon value for this Zip_Coverage.
     * 
     * @return validForVerizon
     */
    public boolean isValidForVerizon() {
        return validForVerizon;
    }


    /**
     * Sets the validForVerizon value for this Zip_Coverage.
     * 
     * @param validForVerizon
     */
    public void setValidForVerizon(boolean validForVerizon) {
        this.validForVerizon = validForVerizon;
    }


    /**
     * Gets the validForSprint value for this Zip_Coverage.
     * 
     * @return validForSprint
     */
    public boolean isValidForSprint() {
        return validForSprint;
    }


    /**
     * Sets the validForSprint value for this Zip_Coverage.
     * 
     * @param validForSprint
     */
    public void setValidForSprint(boolean validForSprint) {
        this.validForSprint = validForSprint;
    }


    /**
     * Gets the validForTmobile value for this Zip_Coverage.
     * 
     * @return validForTmobile
     */
    public boolean isValidForTmobile() {
        return validForTmobile;
    }


    /**
     * Sets the validForTmobile value for this Zip_Coverage.
     * 
     * @param validForTmobile
     */
    public void setValidForTmobile(boolean validForTmobile) {
        this.validForTmobile = validForTmobile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Zip_Coverage)) return false;
        Zip_Coverage other = (Zip_Coverage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.validForVerizon == other.isValidForVerizon() &&
            this.validForSprint == other.isValidForSprint() &&
            this.validForTmobile == other.isValidForTmobile();
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
        _hashCode += (isValidForVerizon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isValidForSprint() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isValidForTmobile() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Zip_Coverage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Zip_Coverage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validForVerizon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValidForVerizon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validForSprint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValidForSprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validForTmobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValidForTmobile"));
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
