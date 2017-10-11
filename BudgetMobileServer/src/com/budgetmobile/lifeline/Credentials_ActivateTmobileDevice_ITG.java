/**
 * Credentials_ActivateTmobileDevice_ITG.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_ActivateTmobileDevice_ITG  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private java.lang.String order_ID;

    private java.lang.String IMSI;

    private java.lang.String ZIP;

    private int specialProvisioningCode;

    public Credentials_ActivateTmobileDevice_ITG() {
    }

    public Credentials_ActivateTmobileDevice_ITG(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           java.lang.String order_ID,
           java.lang.String IMSI,
           java.lang.String ZIP,
           int specialProvisioningCode) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.order_ID = order_ID;
        this.IMSI = IMSI;
        this.ZIP = ZIP;
        this.specialProvisioningCode = specialProvisioningCode;
    }


    /**
     * Gets the order_ID value for this Credentials_ActivateTmobileDevice_ITG.
     * 
     * @return order_ID
     */
    public java.lang.String getOrder_ID() {
        return order_ID;
    }


    /**
     * Sets the order_ID value for this Credentials_ActivateTmobileDevice_ITG.
     * 
     * @param order_ID
     */
    public void setOrder_ID(java.lang.String order_ID) {
        this.order_ID = order_ID;
    }


    /**
     * Gets the IMSI value for this Credentials_ActivateTmobileDevice_ITG.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this Credentials_ActivateTmobileDevice_ITG.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the ZIP value for this Credentials_ActivateTmobileDevice_ITG.
     * 
     * @return ZIP
     */
    public java.lang.String getZIP() {
        return ZIP;
    }


    /**
     * Sets the ZIP value for this Credentials_ActivateTmobileDevice_ITG.
     * 
     * @param ZIP
     */
    public void setZIP(java.lang.String ZIP) {
        this.ZIP = ZIP;
    }


    /**
     * Gets the specialProvisioningCode value for this Credentials_ActivateTmobileDevice_ITG.
     * 
     * @return specialProvisioningCode
     */
    public int getSpecialProvisioningCode() {
        return specialProvisioningCode;
    }


    /**
     * Sets the specialProvisioningCode value for this Credentials_ActivateTmobileDevice_ITG.
     * 
     * @param specialProvisioningCode
     */
    public void setSpecialProvisioningCode(int specialProvisioningCode) {
        this.specialProvisioningCode = specialProvisioningCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_ActivateTmobileDevice_ITG)) return false;
        Credentials_ActivateTmobileDevice_ITG other = (Credentials_ActivateTmobileDevice_ITG) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.order_ID==null && other.getOrder_ID()==null) || 
             (this.order_ID!=null &&
              this.order_ID.equals(other.getOrder_ID()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.ZIP==null && other.getZIP()==null) || 
             (this.ZIP!=null &&
              this.ZIP.equals(other.getZIP()))) &&
            this.specialProvisioningCode == other.getSpecialProvisioningCode();
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
        if (getOrder_ID() != null) {
            _hashCode += getOrder_ID().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getZIP() != null) {
            _hashCode += getZIP().hashCode();
        }
        _hashCode += getSpecialProvisioningCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_ActivateTmobileDevice_ITG.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_ActivateTmobileDevice_ITG"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Order_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialProvisioningCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SpecialProvisioningCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
