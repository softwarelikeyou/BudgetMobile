/**
 * Sprint_RetrSingleDeviceActivationDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Sprint_RetrSingleDeviceActivationDetails  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private java.lang.String MSID;

    private java.lang.String MSL;

    public Sprint_RetrSingleDeviceActivationDetails() {
    }

    public Sprint_RetrSingleDeviceActivationDetails(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           java.lang.String MSID,
           java.lang.String MSL) {
        super(
            errors,
            isError);
        this.MSID = MSID;
        this.MSL = MSL;
    }


    /**
     * Gets the MSID value for this Sprint_RetrSingleDeviceActivationDetails.
     * 
     * @return MSID
     */
    public java.lang.String getMSID() {
        return MSID;
    }


    /**
     * Sets the MSID value for this Sprint_RetrSingleDeviceActivationDetails.
     * 
     * @param MSID
     */
    public void setMSID(java.lang.String MSID) {
        this.MSID = MSID;
    }


    /**
     * Gets the MSL value for this Sprint_RetrSingleDeviceActivationDetails.
     * 
     * @return MSL
     */
    public java.lang.String getMSL() {
        return MSL;
    }


    /**
     * Sets the MSL value for this Sprint_RetrSingleDeviceActivationDetails.
     * 
     * @param MSL
     */
    public void setMSL(java.lang.String MSL) {
        this.MSL = MSL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sprint_RetrSingleDeviceActivationDetails)) return false;
        Sprint_RetrSingleDeviceActivationDetails other = (Sprint_RetrSingleDeviceActivationDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.MSID==null && other.getMSID()==null) || 
             (this.MSID!=null &&
              this.MSID.equals(other.getMSID()))) &&
            ((this.MSL==null && other.getMSL()==null) || 
             (this.MSL!=null &&
              this.MSL.equals(other.getMSL())));
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
        if (getMSID() != null) {
            _hashCode += getMSID().hashCode();
        }
        if (getMSL() != null) {
            _hashCode += getMSL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sprint_RetrSingleDeviceActivationDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Sprint_RetrSingleDeviceActivationDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MSL"));
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
