/**
 * Credentials_TMobile_SwapIMSI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_TMobile_SwapIMSI  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private java.lang.String orderID;

    private int budgetMobileID;

    private java.lang.String oldIMSI;

    private java.lang.String newIMSI;

    private java.lang.String MDN;

    public Credentials_TMobile_SwapIMSI() {
    }

    public Credentials_TMobile_SwapIMSI(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           java.lang.String orderID,
           int budgetMobileID,
           java.lang.String oldIMSI,
           java.lang.String newIMSI,
           java.lang.String MDN) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.orderID = orderID;
        this.budgetMobileID = budgetMobileID;
        this.oldIMSI = oldIMSI;
        this.newIMSI = newIMSI;
        this.MDN = MDN;
    }


    /**
     * Gets the orderID value for this Credentials_TMobile_SwapIMSI.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this Credentials_TMobile_SwapIMSI.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the budgetMobileID value for this Credentials_TMobile_SwapIMSI.
     * 
     * @return budgetMobileID
     */
    public int getBudgetMobileID() {
        return budgetMobileID;
    }


    /**
     * Sets the budgetMobileID value for this Credentials_TMobile_SwapIMSI.
     * 
     * @param budgetMobileID
     */
    public void setBudgetMobileID(int budgetMobileID) {
        this.budgetMobileID = budgetMobileID;
    }


    /**
     * Gets the oldIMSI value for this Credentials_TMobile_SwapIMSI.
     * 
     * @return oldIMSI
     */
    public java.lang.String getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this Credentials_TMobile_SwapIMSI.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.String oldIMSI) {
        this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the newIMSI value for this Credentials_TMobile_SwapIMSI.
     * 
     * @return newIMSI
     */
    public java.lang.String getNewIMSI() {
        return newIMSI;
    }


    /**
     * Sets the newIMSI value for this Credentials_TMobile_SwapIMSI.
     * 
     * @param newIMSI
     */
    public void setNewIMSI(java.lang.String newIMSI) {
        this.newIMSI = newIMSI;
    }


    /**
     * Gets the MDN value for this Credentials_TMobile_SwapIMSI.
     * 
     * @return MDN
     */
    public java.lang.String getMDN() {
        return MDN;
    }


    /**
     * Sets the MDN value for this Credentials_TMobile_SwapIMSI.
     * 
     * @param MDN
     */
    public void setMDN(java.lang.String MDN) {
        this.MDN = MDN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_TMobile_SwapIMSI)) return false;
        Credentials_TMobile_SwapIMSI other = (Credentials_TMobile_SwapIMSI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            this.budgetMobileID == other.getBudgetMobileID() &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI()))) &&
            ((this.newIMSI==null && other.getNewIMSI()==null) || 
             (this.newIMSI!=null &&
              this.newIMSI.equals(other.getNewIMSI()))) &&
            ((this.MDN==null && other.getMDN()==null) || 
             (this.MDN!=null &&
              this.MDN.equals(other.getMDN())));
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
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        _hashCode += getBudgetMobileID();
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        if (getNewIMSI() != null) {
            _hashCode += getNewIMSI().hashCode();
        }
        if (getMDN() != null) {
            _hashCode += getMDN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_TMobile_SwapIMSI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_TMobile_SwapIMSI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "orderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetMobileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BudgetMobileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "oldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NewIMSI"));
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
