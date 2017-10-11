/**
 * TMobile_RetrPreactivatedHandsetByDeviceID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class TMobile_RetrPreactivatedHandsetByDeviceID  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private boolean active;

    private java.lang.String MDN;

    private short providerID;

    public TMobile_RetrPreactivatedHandsetByDeviceID() {
    }

    public TMobile_RetrPreactivatedHandsetByDeviceID(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           boolean active,
           java.lang.String MDN,
           short providerID) {
        super(
            errors,
            isError);
        this.active = active;
        this.MDN = MDN;
        this.providerID = providerID;
    }


    /**
     * Gets the active value for this TMobile_RetrPreactivatedHandsetByDeviceID.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this TMobile_RetrPreactivatedHandsetByDeviceID.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the MDN value for this TMobile_RetrPreactivatedHandsetByDeviceID.
     * 
     * @return MDN
     */
    public java.lang.String getMDN() {
        return MDN;
    }


    /**
     * Sets the MDN value for this TMobile_RetrPreactivatedHandsetByDeviceID.
     * 
     * @param MDN
     */
    public void setMDN(java.lang.String MDN) {
        this.MDN = MDN;
    }


    /**
     * Gets the providerID value for this TMobile_RetrPreactivatedHandsetByDeviceID.
     * 
     * @return providerID
     */
    public short getProviderID() {
        return providerID;
    }


    /**
     * Sets the providerID value for this TMobile_RetrPreactivatedHandsetByDeviceID.
     * 
     * @param providerID
     */
    public void setProviderID(short providerID) {
        this.providerID = providerID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TMobile_RetrPreactivatedHandsetByDeviceID)) return false;
        TMobile_RetrPreactivatedHandsetByDeviceID other = (TMobile_RetrPreactivatedHandsetByDeviceID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.active == other.isActive() &&
            ((this.MDN==null && other.getMDN()==null) || 
             (this.MDN!=null &&
              this.MDN.equals(other.getMDN()))) &&
            this.providerID == other.getProviderID();
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMDN() != null) {
            _hashCode += getMDN().hashCode();
        }
        _hashCode += getProviderID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TMobile_RetrPreactivatedHandsetByDeviceID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "TMobile_RetrPreactivatedHandsetByDeviceID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProviderID"));
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
