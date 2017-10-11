/**
 * Recertify_BudgetMobile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Recertify_BudgetMobile  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private java.lang.String newLifeLineExpiration;

    private java.lang.String recertificationCredits;

    private boolean commissionableRecertification;

    public Recertify_BudgetMobile() {
    }

    public Recertify_BudgetMobile(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           java.lang.String newLifeLineExpiration,
           java.lang.String recertificationCredits,
           boolean commissionableRecertification) {
        super(
            errors,
            isError);
        this.newLifeLineExpiration = newLifeLineExpiration;
        this.recertificationCredits = recertificationCredits;
        this.commissionableRecertification = commissionableRecertification;
    }


    /**
     * Gets the newLifeLineExpiration value for this Recertify_BudgetMobile.
     * 
     * @return newLifeLineExpiration
     */
    public java.lang.String getNewLifeLineExpiration() {
        return newLifeLineExpiration;
    }


    /**
     * Sets the newLifeLineExpiration value for this Recertify_BudgetMobile.
     * 
     * @param newLifeLineExpiration
     */
    public void setNewLifeLineExpiration(java.lang.String newLifeLineExpiration) {
        this.newLifeLineExpiration = newLifeLineExpiration;
    }


    /**
     * Gets the recertificationCredits value for this Recertify_BudgetMobile.
     * 
     * @return recertificationCredits
     */
    public java.lang.String getRecertificationCredits() {
        return recertificationCredits;
    }


    /**
     * Sets the recertificationCredits value for this Recertify_BudgetMobile.
     * 
     * @param recertificationCredits
     */
    public void setRecertificationCredits(java.lang.String recertificationCredits) {
        this.recertificationCredits = recertificationCredits;
    }


    /**
     * Gets the commissionableRecertification value for this Recertify_BudgetMobile.
     * 
     * @return commissionableRecertification
     */
    public boolean isCommissionableRecertification() {
        return commissionableRecertification;
    }


    /**
     * Sets the commissionableRecertification value for this Recertify_BudgetMobile.
     * 
     * @param commissionableRecertification
     */
    public void setCommissionableRecertification(boolean commissionableRecertification) {
        this.commissionableRecertification = commissionableRecertification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Recertify_BudgetMobile)) return false;
        Recertify_BudgetMobile other = (Recertify_BudgetMobile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.newLifeLineExpiration==null && other.getNewLifeLineExpiration()==null) || 
             (this.newLifeLineExpiration!=null &&
              this.newLifeLineExpiration.equals(other.getNewLifeLineExpiration()))) &&
            ((this.recertificationCredits==null && other.getRecertificationCredits()==null) || 
             (this.recertificationCredits!=null &&
              this.recertificationCredits.equals(other.getRecertificationCredits()))) &&
            this.commissionableRecertification == other.isCommissionableRecertification();
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
        if (getNewLifeLineExpiration() != null) {
            _hashCode += getNewLifeLineExpiration().hashCode();
        }
        if (getRecertificationCredits() != null) {
            _hashCode += getRecertificationCredits().hashCode();
        }
        _hashCode += (isCommissionableRecertification() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Recertify_BudgetMobile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Recertify_BudgetMobile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newLifeLineExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NewLifeLineExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recertificationCredits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RecertificationCredits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionableRecertification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CommissionableRecertification"));
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
