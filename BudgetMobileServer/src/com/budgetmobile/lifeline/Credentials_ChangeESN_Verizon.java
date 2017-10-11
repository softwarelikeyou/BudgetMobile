/**
 * Credentials_ChangeESN_Verizon.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_ChangeESN_Verizon  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private java.lang.String budgetMobileID;

    private java.lang.String MDN;

    private java.lang.String deviceID;

    private java.lang.String order_ID;

    public Credentials_ChangeESN_Verizon() {
    }

    public Credentials_ChangeESN_Verizon(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           java.lang.String budgetMobileID,
           java.lang.String MDN,
           java.lang.String deviceID,
           java.lang.String order_ID) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.budgetMobileID = budgetMobileID;
        this.MDN = MDN;
        this.deviceID = deviceID;
        this.order_ID = order_ID;
    }


    /**
     * Gets the budgetMobileID value for this Credentials_ChangeESN_Verizon.
     * 
     * @return budgetMobileID
     */
    public java.lang.String getBudgetMobileID() {
        return budgetMobileID;
    }


    /**
     * Sets the budgetMobileID value for this Credentials_ChangeESN_Verizon.
     * 
     * @param budgetMobileID
     */
    public void setBudgetMobileID(java.lang.String budgetMobileID) {
        this.budgetMobileID = budgetMobileID;
    }


    /**
     * Gets the MDN value for this Credentials_ChangeESN_Verizon.
     * 
     * @return MDN
     */
    public java.lang.String getMDN() {
        return MDN;
    }


    /**
     * Sets the MDN value for this Credentials_ChangeESN_Verizon.
     * 
     * @param MDN
     */
    public void setMDN(java.lang.String MDN) {
        this.MDN = MDN;
    }


    /**
     * Gets the deviceID value for this Credentials_ChangeESN_Verizon.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this Credentials_ChangeESN_Verizon.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the order_ID value for this Credentials_ChangeESN_Verizon.
     * 
     * @return order_ID
     */
    public java.lang.String getOrder_ID() {
        return order_ID;
    }


    /**
     * Sets the order_ID value for this Credentials_ChangeESN_Verizon.
     * 
     * @param order_ID
     */
    public void setOrder_ID(java.lang.String order_ID) {
        this.order_ID = order_ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_ChangeESN_Verizon)) return false;
        Credentials_ChangeESN_Verizon other = (Credentials_ChangeESN_Verizon) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.budgetMobileID==null && other.getBudgetMobileID()==null) || 
             (this.budgetMobileID!=null &&
              this.budgetMobileID.equals(other.getBudgetMobileID()))) &&
            ((this.MDN==null && other.getMDN()==null) || 
             (this.MDN!=null &&
              this.MDN.equals(other.getMDN()))) &&
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.order_ID==null && other.getOrder_ID()==null) || 
             (this.order_ID!=null &&
              this.order_ID.equals(other.getOrder_ID())));
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
        if (getBudgetMobileID() != null) {
            _hashCode += getBudgetMobileID().hashCode();
        }
        if (getMDN() != null) {
            _hashCode += getMDN().hashCode();
        }
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getOrder_ID() != null) {
            _hashCode += getOrder_ID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_ChangeESN_Verizon.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_ChangeESN_Verizon"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetMobileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BudgetMobileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Order_ID"));
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
