/**
 * Order_Commit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Order_Commit  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private int budgetMobileID;

    private java.lang.String MDN;

    private java.lang.String serviceStartDate;

    private java.lang.String serviceEndDate;

    public Order_Commit() {
    }

    public Order_Commit(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           int budgetMobileID,
           java.lang.String MDN,
           java.lang.String serviceStartDate,
           java.lang.String serviceEndDate) {
        super(
            errors,
            isError);
        this.budgetMobileID = budgetMobileID;
        this.MDN = MDN;
        this.serviceStartDate = serviceStartDate;
        this.serviceEndDate = serviceEndDate;
    }


    /**
     * Gets the budgetMobileID value for this Order_Commit.
     * 
     * @return budgetMobileID
     */
    public int getBudgetMobileID() {
        return budgetMobileID;
    }


    /**
     * Sets the budgetMobileID value for this Order_Commit.
     * 
     * @param budgetMobileID
     */
    public void setBudgetMobileID(int budgetMobileID) {
        this.budgetMobileID = budgetMobileID;
    }


    /**
     * Gets the MDN value for this Order_Commit.
     * 
     * @return MDN
     */
    public java.lang.String getMDN() {
        return MDN;
    }


    /**
     * Sets the MDN value for this Order_Commit.
     * 
     * @param MDN
     */
    public void setMDN(java.lang.String MDN) {
        this.MDN = MDN;
    }


    /**
     * Gets the serviceStartDate value for this Order_Commit.
     * 
     * @return serviceStartDate
     */
    public java.lang.String getServiceStartDate() {
        return serviceStartDate;
    }


    /**
     * Sets the serviceStartDate value for this Order_Commit.
     * 
     * @param serviceStartDate
     */
    public void setServiceStartDate(java.lang.String serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }


    /**
     * Gets the serviceEndDate value for this Order_Commit.
     * 
     * @return serviceEndDate
     */
    public java.lang.String getServiceEndDate() {
        return serviceEndDate;
    }


    /**
     * Sets the serviceEndDate value for this Order_Commit.
     * 
     * @param serviceEndDate
     */
    public void setServiceEndDate(java.lang.String serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Order_Commit)) return false;
        Order_Commit other = (Order_Commit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.budgetMobileID == other.getBudgetMobileID() &&
            ((this.MDN==null && other.getMDN()==null) || 
             (this.MDN!=null &&
              this.MDN.equals(other.getMDN()))) &&
            ((this.serviceStartDate==null && other.getServiceStartDate()==null) || 
             (this.serviceStartDate!=null &&
              this.serviceStartDate.equals(other.getServiceStartDate()))) &&
            ((this.serviceEndDate==null && other.getServiceEndDate()==null) || 
             (this.serviceEndDate!=null &&
              this.serviceEndDate.equals(other.getServiceEndDate())));
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
        _hashCode += getBudgetMobileID();
        if (getMDN() != null) {
            _hashCode += getMDN().hashCode();
        }
        if (getServiceStartDate() != null) {
            _hashCode += getServiceStartDate().hashCode();
        }
        if (getServiceEndDate() != null) {
            _hashCode += getServiceEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Order_Commit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Order_Commit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetMobileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BudgetMobileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("serviceStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ServiceStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ServiceEndDate"));
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
