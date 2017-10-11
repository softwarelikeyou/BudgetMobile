/**
 * TopUpProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class TopUpProduct  implements java.io.Serializable {
    private int topUpProductID;

    private int type;

    private java.lang.String description;

    private double faceValue;

    private int accountCreditsRequired;

    private java.lang.String commisionCategory;

    private boolean accountCreditEligible;

    private boolean offeringType;

    public TopUpProduct() {
    }

    public TopUpProduct(
           int topUpProductID,
           int type,
           java.lang.String description,
           double faceValue,
           int accountCreditsRequired,
           java.lang.String commisionCategory,
           boolean accountCreditEligible,
           boolean offeringType) {
           this.topUpProductID = topUpProductID;
           this.type = type;
           this.description = description;
           this.faceValue = faceValue;
           this.accountCreditsRequired = accountCreditsRequired;
           this.commisionCategory = commisionCategory;
           this.accountCreditEligible = accountCreditEligible;
           this.offeringType = offeringType;
    }


    /**
     * Gets the topUpProductID value for this TopUpProduct.
     * 
     * @return topUpProductID
     */
    public int getTopUpProductID() {
        return topUpProductID;
    }


    /**
     * Sets the topUpProductID value for this TopUpProduct.
     * 
     * @param topUpProductID
     */
    public void setTopUpProductID(int topUpProductID) {
        this.topUpProductID = topUpProductID;
    }


    /**
     * Gets the type value for this TopUpProduct.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this TopUpProduct.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the description value for this TopUpProduct.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TopUpProduct.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the faceValue value for this TopUpProduct.
     * 
     * @return faceValue
     */
    public double getFaceValue() {
        return faceValue;
    }


    /**
     * Sets the faceValue value for this TopUpProduct.
     * 
     * @param faceValue
     */
    public void setFaceValue(double faceValue) {
        this.faceValue = faceValue;
    }


    /**
     * Gets the accountCreditsRequired value for this TopUpProduct.
     * 
     * @return accountCreditsRequired
     */
    public int getAccountCreditsRequired() {
        return accountCreditsRequired;
    }


    /**
     * Sets the accountCreditsRequired value for this TopUpProduct.
     * 
     * @param accountCreditsRequired
     */
    public void setAccountCreditsRequired(int accountCreditsRequired) {
        this.accountCreditsRequired = accountCreditsRequired;
    }


    /**
     * Gets the commisionCategory value for this TopUpProduct.
     * 
     * @return commisionCategory
     */
    public java.lang.String getCommisionCategory() {
        return commisionCategory;
    }


    /**
     * Sets the commisionCategory value for this TopUpProduct.
     * 
     * @param commisionCategory
     */
    public void setCommisionCategory(java.lang.String commisionCategory) {
        this.commisionCategory = commisionCategory;
    }


    /**
     * Gets the accountCreditEligible value for this TopUpProduct.
     * 
     * @return accountCreditEligible
     */
    public boolean isAccountCreditEligible() {
        return accountCreditEligible;
    }


    /**
     * Sets the accountCreditEligible value for this TopUpProduct.
     * 
     * @param accountCreditEligible
     */
    public void setAccountCreditEligible(boolean accountCreditEligible) {
        this.accountCreditEligible = accountCreditEligible;
    }


    /**
     * Gets the offeringType value for this TopUpProduct.
     * 
     * @return offeringType
     */
    public boolean isOfferingType() {
        return offeringType;
    }


    /**
     * Sets the offeringType value for this TopUpProduct.
     * 
     * @param offeringType
     */
    public void setOfferingType(boolean offeringType) {
        this.offeringType = offeringType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopUpProduct)) return false;
        TopUpProduct other = (TopUpProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.topUpProductID == other.getTopUpProductID() &&
            this.type == other.getType() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.faceValue == other.getFaceValue() &&
            this.accountCreditsRequired == other.getAccountCreditsRequired() &&
            ((this.commisionCategory==null && other.getCommisionCategory()==null) || 
             (this.commisionCategory!=null &&
              this.commisionCategory.equals(other.getCommisionCategory()))) &&
            this.accountCreditEligible == other.isAccountCreditEligible() &&
            this.offeringType == other.isOfferingType();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getTopUpProductID();
        _hashCode += getType();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += new Double(getFaceValue()).hashCode();
        _hashCode += getAccountCreditsRequired();
        if (getCommisionCategory() != null) {
            _hashCode += getCommisionCategory().hashCode();
        }
        _hashCode += (isAccountCreditEligible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOfferingType() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TopUpProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "TopUpProduct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpProductID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUpProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FaceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCreditsRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AccountCreditsRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commisionCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CommisionCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCreditEligible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AccountCreditEligible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OfferingType"));
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
