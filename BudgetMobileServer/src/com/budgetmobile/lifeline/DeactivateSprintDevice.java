/**
 * DeactivateSprintDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class DeactivateSprintDevice  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private java.lang.String confirmMsg;

    public DeactivateSprintDevice() {
    }

    public DeactivateSprintDevice(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           java.lang.String confirmMsg) {
        super(
            errors,
            isError);
        this.confirmMsg = confirmMsg;
    }


    /**
     * Gets the confirmMsg value for this DeactivateSprintDevice.
     * 
     * @return confirmMsg
     */
    public java.lang.String getConfirmMsg() {
        return confirmMsg;
    }


    /**
     * Sets the confirmMsg value for this DeactivateSprintDevice.
     * 
     * @param confirmMsg
     */
    public void setConfirmMsg(java.lang.String confirmMsg) {
        this.confirmMsg = confirmMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeactivateSprintDevice)) return false;
        DeactivateSprintDevice other = (DeactivateSprintDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.confirmMsg==null && other.getConfirmMsg()==null) || 
             (this.confirmMsg!=null &&
              this.confirmMsg.equals(other.getConfirmMsg())));
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
        if (getConfirmMsg() != null) {
            _hashCode += getConfirmMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeactivateSprintDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DeactivateSprintDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ConfirmMsg"));
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
