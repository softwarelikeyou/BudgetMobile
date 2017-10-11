/**
 * TopUp_Enter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class TopUp_Enter  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private com.budgetmobile.lifeline.TaxItem[] taxItems;

    private int referenceID;

    private double orderTotal;

    private java.lang.String topUpDescription;

    private double topUpCost;

    private boolean taxesApply;

    private double couponAmount;

    public TopUp_Enter() {
    }

    public TopUp_Enter(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           com.budgetmobile.lifeline.TaxItem[] taxItems,
           int referenceID,
           double orderTotal,
           java.lang.String topUpDescription,
           double topUpCost,
           boolean taxesApply,
           double couponAmount) {
        super(
            errors,
            isError);
        this.taxItems = taxItems;
        this.referenceID = referenceID;
        this.orderTotal = orderTotal;
        this.topUpDescription = topUpDescription;
        this.topUpCost = topUpCost;
        this.taxesApply = taxesApply;
        this.couponAmount = couponAmount;
    }


    /**
     * Gets the taxItems value for this TopUp_Enter.
     * 
     * @return taxItems
     */
    public com.budgetmobile.lifeline.TaxItem[] getTaxItems() {
        return taxItems;
    }


    /**
     * Sets the taxItems value for this TopUp_Enter.
     * 
     * @param taxItems
     */
    public void setTaxItems(com.budgetmobile.lifeline.TaxItem[] taxItems) {
        this.taxItems = taxItems;
    }


    /**
     * Gets the referenceID value for this TopUp_Enter.
     * 
     * @return referenceID
     */
    public int getReferenceID() {
        return referenceID;
    }


    /**
     * Sets the referenceID value for this TopUp_Enter.
     * 
     * @param referenceID
     */
    public void setReferenceID(int referenceID) {
        this.referenceID = referenceID;
    }


    /**
     * Gets the orderTotal value for this TopUp_Enter.
     * 
     * @return orderTotal
     */
    public double getOrderTotal() {
        return orderTotal;
    }


    /**
     * Sets the orderTotal value for this TopUp_Enter.
     * 
     * @param orderTotal
     */
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }


    /**
     * Gets the topUpDescription value for this TopUp_Enter.
     * 
     * @return topUpDescription
     */
    public java.lang.String getTopUpDescription() {
        return topUpDescription;
    }


    /**
     * Sets the topUpDescription value for this TopUp_Enter.
     * 
     * @param topUpDescription
     */
    public void setTopUpDescription(java.lang.String topUpDescription) {
        this.topUpDescription = topUpDescription;
    }


    /**
     * Gets the topUpCost value for this TopUp_Enter.
     * 
     * @return topUpCost
     */
    public double getTopUpCost() {
        return topUpCost;
    }


    /**
     * Sets the topUpCost value for this TopUp_Enter.
     * 
     * @param topUpCost
     */
    public void setTopUpCost(double topUpCost) {
        this.topUpCost = topUpCost;
    }


    /**
     * Gets the taxesApply value for this TopUp_Enter.
     * 
     * @return taxesApply
     */
    public boolean isTaxesApply() {
        return taxesApply;
    }


    /**
     * Sets the taxesApply value for this TopUp_Enter.
     * 
     * @param taxesApply
     */
    public void setTaxesApply(boolean taxesApply) {
        this.taxesApply = taxesApply;
    }


    /**
     * Gets the couponAmount value for this TopUp_Enter.
     * 
     * @return couponAmount
     */
    public double getCouponAmount() {
        return couponAmount;
    }


    /**
     * Sets the couponAmount value for this TopUp_Enter.
     * 
     * @param couponAmount
     */
    public void setCouponAmount(double couponAmount) {
        this.couponAmount = couponAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopUp_Enter)) return false;
        TopUp_Enter other = (TopUp_Enter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.taxItems==null && other.getTaxItems()==null) || 
             (this.taxItems!=null &&
              java.util.Arrays.equals(this.taxItems, other.getTaxItems()))) &&
            this.referenceID == other.getReferenceID() &&
            this.orderTotal == other.getOrderTotal() &&
            ((this.topUpDescription==null && other.getTopUpDescription()==null) || 
             (this.topUpDescription!=null &&
              this.topUpDescription.equals(other.getTopUpDescription()))) &&
            this.topUpCost == other.getTopUpCost() &&
            this.taxesApply == other.isTaxesApply() &&
            this.couponAmount == other.getCouponAmount();
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
        if (getTaxItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getReferenceID();
        _hashCode += new Double(getOrderTotal()).hashCode();
        if (getTopUpDescription() != null) {
            _hashCode += getTopUpDescription().hashCode();
        }
        _hashCode += new Double(getTopUpCost()).hashCode();
        _hashCode += (isTaxesApply() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getCouponAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TopUp_Enter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "TopUp_Enter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TaxItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "TaxItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "TaxItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReferenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OrderTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUpDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUpCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxesApply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TaxesApply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CouponAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
