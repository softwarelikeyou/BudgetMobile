/**
 * LookUpVerizonDiscreteDeviceInquiryStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class LookUpVerizonDiscreteDeviceInquiryStatus  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private java.lang.String detailCode;

    private java.lang.String detailCodeMessage;

    private short activationEligibility;

    public LookUpVerizonDiscreteDeviceInquiryStatus() {
    }

    public LookUpVerizonDiscreteDeviceInquiryStatus(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           java.lang.String detailCode,
           java.lang.String detailCodeMessage,
           short activationEligibility) {
        super(
            errors,
            isError);
        this.detailCode = detailCode;
        this.detailCodeMessage = detailCodeMessage;
        this.activationEligibility = activationEligibility;
    }


    /**
     * Gets the detailCode value for this LookUpVerizonDiscreteDeviceInquiryStatus.
     * 
     * @return detailCode
     */
    public java.lang.String getDetailCode() {
        return detailCode;
    }


    /**
     * Sets the detailCode value for this LookUpVerizonDiscreteDeviceInquiryStatus.
     * 
     * @param detailCode
     */
    public void setDetailCode(java.lang.String detailCode) {
        this.detailCode = detailCode;
    }


    /**
     * Gets the detailCodeMessage value for this LookUpVerizonDiscreteDeviceInquiryStatus.
     * 
     * @return detailCodeMessage
     */
    public java.lang.String getDetailCodeMessage() {
        return detailCodeMessage;
    }


    /**
     * Sets the detailCodeMessage value for this LookUpVerizonDiscreteDeviceInquiryStatus.
     * 
     * @param detailCodeMessage
     */
    public void setDetailCodeMessage(java.lang.String detailCodeMessage) {
        this.detailCodeMessage = detailCodeMessage;
    }


    /**
     * Gets the activationEligibility value for this LookUpVerizonDiscreteDeviceInquiryStatus.
     * 
     * @return activationEligibility
     */
    public short getActivationEligibility() {
        return activationEligibility;
    }


    /**
     * Sets the activationEligibility value for this LookUpVerizonDiscreteDeviceInquiryStatus.
     * 
     * @param activationEligibility
     */
    public void setActivationEligibility(short activationEligibility) {
        this.activationEligibility = activationEligibility;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookUpVerizonDiscreteDeviceInquiryStatus)) return false;
        LookUpVerizonDiscreteDeviceInquiryStatus other = (LookUpVerizonDiscreteDeviceInquiryStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.detailCode==null && other.getDetailCode()==null) || 
             (this.detailCode!=null &&
              this.detailCode.equals(other.getDetailCode()))) &&
            ((this.detailCodeMessage==null && other.getDetailCodeMessage()==null) || 
             (this.detailCodeMessage!=null &&
              this.detailCodeMessage.equals(other.getDetailCodeMessage()))) &&
            this.activationEligibility == other.getActivationEligibility();
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
        if (getDetailCode() != null) {
            _hashCode += getDetailCode().hashCode();
        }
        if (getDetailCodeMessage() != null) {
            _hashCode += getDetailCodeMessage().hashCode();
        }
        _hashCode += getActivationEligibility();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LookUpVerizonDiscreteDeviceInquiryStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "LookUpVerizonDiscreteDeviceInquiryStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DetailCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailCodeMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DetailCodeMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationEligibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "activationEligibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
