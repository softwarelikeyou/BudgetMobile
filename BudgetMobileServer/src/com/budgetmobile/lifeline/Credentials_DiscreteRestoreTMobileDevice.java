/**
 * Credentials_DiscreteRestoreTMobileDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_DiscreteRestoreTMobileDevice  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private long budgetMobileID;

    private java.lang.String IMSI;

    private java.lang.String MDN;

    private java.lang.String order_ID;

    public Credentials_DiscreteRestoreTMobileDevice() {
    }

    public Credentials_DiscreteRestoreTMobileDevice(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           long budgetMobileID,
           java.lang.String IMSI,
           java.lang.String MDN,
           java.lang.String order_ID) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.budgetMobileID = budgetMobileID;
        this.IMSI = IMSI;
        this.MDN = MDN;
        this.order_ID = order_ID;
    }


    /**
     * Gets the budgetMobileID value for this Credentials_DiscreteRestoreTMobileDevice.
     * 
     * @return budgetMobileID
     */
    public long getBudgetMobileID() {
        return budgetMobileID;
    }


    /**
     * Sets the budgetMobileID value for this Credentials_DiscreteRestoreTMobileDevice.
     * 
     * @param budgetMobileID
     */
    public void setBudgetMobileID(long budgetMobileID) {
        this.budgetMobileID = budgetMobileID;
    }


    /**
     * Gets the IMSI value for this Credentials_DiscreteRestoreTMobileDevice.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this Credentials_DiscreteRestoreTMobileDevice.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the MDN value for this Credentials_DiscreteRestoreTMobileDevice.
     * 
     * @return MDN
     */
    public java.lang.String getMDN() {
        return MDN;
    }


    /**
     * Sets the MDN value for this Credentials_DiscreteRestoreTMobileDevice.
     * 
     * @param MDN
     */
    public void setMDN(java.lang.String MDN) {
        this.MDN = MDN;
    }


    /**
     * Gets the order_ID value for this Credentials_DiscreteRestoreTMobileDevice.
     * 
     * @return order_ID
     */
    public java.lang.String getOrder_ID() {
        return order_ID;
    }


    /**
     * Sets the order_ID value for this Credentials_DiscreteRestoreTMobileDevice.
     * 
     * @param order_ID
     */
    public void setOrder_ID(java.lang.String order_ID) {
        this.order_ID = order_ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_DiscreteRestoreTMobileDevice)) return false;
        Credentials_DiscreteRestoreTMobileDevice other = (Credentials_DiscreteRestoreTMobileDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.budgetMobileID == other.getBudgetMobileID() &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.MDN==null && other.getMDN()==null) || 
             (this.MDN!=null &&
              this.MDN.equals(other.getMDN()))) &&
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
        _hashCode += new Long(getBudgetMobileID()).hashCode();
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getMDN() != null) {
            _hashCode += getMDN().hashCode();
        }
        if (getOrder_ID() != null) {
            _hashCode += getOrder_ID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_DiscreteRestoreTMobileDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_DiscreteRestoreTMobileDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetMobileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BudgetMobileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("MDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MDN"));
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
