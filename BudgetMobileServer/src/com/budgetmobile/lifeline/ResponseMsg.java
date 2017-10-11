/**
 * ResponseMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class ResponseMsg  implements java.io.Serializable {
    private com.budgetmobile.lifeline.Errors errors;

    private boolean isError;

    public ResponseMsg() {
    }

    public ResponseMsg(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError) {
           this.errors = errors;
           this.isError = isError;
    }


    /**
     * Gets the errors value for this ResponseMsg.
     * 
     * @return errors
     */
    public com.budgetmobile.lifeline.Errors getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this ResponseMsg.
     * 
     * @param errors
     */
    public void setErrors(com.budgetmobile.lifeline.Errors errors) {
        this.errors = errors;
    }


    /**
     * Gets the isError value for this ResponseMsg.
     * 
     * @return isError
     */
    public boolean isIsError() {
        return isError;
    }


    /**
     * Sets the isError value for this ResponseMsg.
     * 
     * @param isError
     */
    public void setIsError(boolean isError) {
        this.isError = isError;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseMsg)) return false;
        ResponseMsg other = (ResponseMsg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              this.errors.equals(other.getErrors()))) &&
            this.isError == other.isIsError();
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
        if (getErrors() != null) {
            _hashCode += getErrors().hashCode();
        }
        _hashCode += (isIsError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ResponseMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Errors"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IsError"));
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
