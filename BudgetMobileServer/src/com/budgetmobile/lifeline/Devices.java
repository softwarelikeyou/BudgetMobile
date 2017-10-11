/**
 * Devices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Devices  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private com.budgetmobile.lifeline.Handset[] handsets;

    private boolean handsetsAvailable;

    public Devices() {
    }

    public Devices(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           com.budgetmobile.lifeline.Handset[] handsets,
           boolean handsetsAvailable) {
        super(
            errors,
            isError);
        this.handsets = handsets;
        this.handsetsAvailable = handsetsAvailable;
    }


    /**
     * Gets the handsets value for this Devices.
     * 
     * @return handsets
     */
    public com.budgetmobile.lifeline.Handset[] getHandsets() {
        return handsets;
    }


    /**
     * Sets the handsets value for this Devices.
     * 
     * @param handsets
     */
    public void setHandsets(com.budgetmobile.lifeline.Handset[] handsets) {
        this.handsets = handsets;
    }


    /**
     * Gets the handsetsAvailable value for this Devices.
     * 
     * @return handsetsAvailable
     */
    public boolean isHandsetsAvailable() {
        return handsetsAvailable;
    }


    /**
     * Sets the handsetsAvailable value for this Devices.
     * 
     * @param handsetsAvailable
     */
    public void setHandsetsAvailable(boolean handsetsAvailable) {
        this.handsetsAvailable = handsetsAvailable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Devices)) return false;
        Devices other = (Devices) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.handsets==null && other.getHandsets()==null) || 
             (this.handsets!=null &&
              java.util.Arrays.equals(this.handsets, other.getHandsets()))) &&
            this.handsetsAvailable == other.isHandsetsAvailable();
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
        if (getHandsets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHandsets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHandsets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isHandsetsAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Devices.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Devices"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handsets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Handsets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Handset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Handset"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handsetsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HandsetsAvailable"));
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
