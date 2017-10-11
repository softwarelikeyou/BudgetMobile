/**
 * AdditionalCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class AdditionalCharge  implements java.io.Serializable {
    private java.lang.String additionalChargeDescription;

    private double additionalChargeAmount;

    public AdditionalCharge() {
    }

    public AdditionalCharge(
           java.lang.String additionalChargeDescription,
           double additionalChargeAmount) {
           this.additionalChargeDescription = additionalChargeDescription;
           this.additionalChargeAmount = additionalChargeAmount;
    }


    /**
     * Gets the additionalChargeDescription value for this AdditionalCharge.
     * 
     * @return additionalChargeDescription
     */
    public java.lang.String getAdditionalChargeDescription() {
        return additionalChargeDescription;
    }


    /**
     * Sets the additionalChargeDescription value for this AdditionalCharge.
     * 
     * @param additionalChargeDescription
     */
    public void setAdditionalChargeDescription(java.lang.String additionalChargeDescription) {
        this.additionalChargeDescription = additionalChargeDescription;
    }


    /**
     * Gets the additionalChargeAmount value for this AdditionalCharge.
     * 
     * @return additionalChargeAmount
     */
    public double getAdditionalChargeAmount() {
        return additionalChargeAmount;
    }


    /**
     * Sets the additionalChargeAmount value for this AdditionalCharge.
     * 
     * @param additionalChargeAmount
     */
    public void setAdditionalChargeAmount(double additionalChargeAmount) {
        this.additionalChargeAmount = additionalChargeAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdditionalCharge)) return false;
        AdditionalCharge other = (AdditionalCharge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalChargeDescription==null && other.getAdditionalChargeDescription()==null) || 
             (this.additionalChargeDescription!=null &&
              this.additionalChargeDescription.equals(other.getAdditionalChargeDescription()))) &&
            this.additionalChargeAmount == other.getAdditionalChargeAmount();
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
        if (getAdditionalChargeDescription() != null) {
            _hashCode += getAdditionalChargeDescription().hashCode();
        }
        _hashCode += new Double(getAdditionalChargeAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdditionalCharge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "AdditionalCharge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalChargeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AdditionalChargeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalChargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AdditionalChargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
