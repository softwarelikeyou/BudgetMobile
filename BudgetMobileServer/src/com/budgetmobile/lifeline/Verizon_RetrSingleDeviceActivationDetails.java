/**
 * Verizon_RetrSingleDeviceActivationDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Verizon_RetrSingleDeviceActivationDetails  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private java.lang.String MDN;

    private java.lang.String MIN;

    public Verizon_RetrSingleDeviceActivationDetails() {
    }

    public Verizon_RetrSingleDeviceActivationDetails(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           java.lang.String MDN,
           java.lang.String MIN) {
        super(
            errors,
            isError);
        this.MDN = MDN;
        this.MIN = MIN;
    }


    /**
     * Gets the MDN value for this Verizon_RetrSingleDeviceActivationDetails.
     * 
     * @return MDN
     */
    public java.lang.String getMDN() {
        return MDN;
    }


    /**
     * Sets the MDN value for this Verizon_RetrSingleDeviceActivationDetails.
     * 
     * @param MDN
     */
    public void setMDN(java.lang.String MDN) {
        this.MDN = MDN;
    }


    /**
     * Gets the MIN value for this Verizon_RetrSingleDeviceActivationDetails.
     * 
     * @return MIN
     */
    public java.lang.String getMIN() {
        return MIN;
    }


    /**
     * Sets the MIN value for this Verizon_RetrSingleDeviceActivationDetails.
     * 
     * @param MIN
     */
    public void setMIN(java.lang.String MIN) {
        this.MIN = MIN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Verizon_RetrSingleDeviceActivationDetails)) return false;
        Verizon_RetrSingleDeviceActivationDetails other = (Verizon_RetrSingleDeviceActivationDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.MDN==null && other.getMDN()==null) || 
             (this.MDN!=null &&
              this.MDN.equals(other.getMDN()))) &&
            ((this.MIN==null && other.getMIN()==null) || 
             (this.MIN!=null &&
              this.MIN.equals(other.getMIN())));
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
        if (getMDN() != null) {
            _hashCode += getMDN().hashCode();
        }
        if (getMIN() != null) {
            _hashCode += getMIN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Verizon_RetrSingleDeviceActivationDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Verizon_RetrSingleDeviceActivationDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MIN"));
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
