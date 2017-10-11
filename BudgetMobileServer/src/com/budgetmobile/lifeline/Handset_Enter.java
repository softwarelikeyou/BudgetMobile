/**
 * Handset_Enter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Handset_Enter  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private com.budgetmobile.lifeline.Handset[] handsets;

    private com.budgetmobile.lifeline.TaxItem[] taxItems;

    private int referenceID;

    private double orderTotal;

    private boolean taxesApply;

    public Handset_Enter() {
    }

    public Handset_Enter(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           com.budgetmobile.lifeline.Handset[] handsets,
           com.budgetmobile.lifeline.TaxItem[] taxItems,
           int referenceID,
           double orderTotal,
           boolean taxesApply) {
        super(
            errors,
            isError);
        this.handsets = handsets;
        this.taxItems = taxItems;
        this.referenceID = referenceID;
        this.orderTotal = orderTotal;
        this.taxesApply = taxesApply;
    }


    /**
     * Gets the handsets value for this Handset_Enter.
     * 
     * @return handsets
     */
    public com.budgetmobile.lifeline.Handset[] getHandsets() {
        return handsets;
    }


    /**
     * Sets the handsets value for this Handset_Enter.
     * 
     * @param handsets
     */
    public void setHandsets(com.budgetmobile.lifeline.Handset[] handsets) {
        this.handsets = handsets;
    }


    /**
     * Gets the taxItems value for this Handset_Enter.
     * 
     * @return taxItems
     */
    public com.budgetmobile.lifeline.TaxItem[] getTaxItems() {
        return taxItems;
    }


    /**
     * Sets the taxItems value for this Handset_Enter.
     * 
     * @param taxItems
     */
    public void setTaxItems(com.budgetmobile.lifeline.TaxItem[] taxItems) {
        this.taxItems = taxItems;
    }


    /**
     * Gets the referenceID value for this Handset_Enter.
     * 
     * @return referenceID
     */
    public int getReferenceID() {
        return referenceID;
    }


    /**
     * Sets the referenceID value for this Handset_Enter.
     * 
     * @param referenceID
     */
    public void setReferenceID(int referenceID) {
        this.referenceID = referenceID;
    }


    /**
     * Gets the orderTotal value for this Handset_Enter.
     * 
     * @return orderTotal
     */
    public double getOrderTotal() {
        return orderTotal;
    }


    /**
     * Sets the orderTotal value for this Handset_Enter.
     * 
     * @param orderTotal
     */
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }


    /**
     * Gets the taxesApply value for this Handset_Enter.
     * 
     * @return taxesApply
     */
    public boolean isTaxesApply() {
        return taxesApply;
    }


    /**
     * Sets the taxesApply value for this Handset_Enter.
     * 
     * @param taxesApply
     */
    public void setTaxesApply(boolean taxesApply) {
        this.taxesApply = taxesApply;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Handset_Enter)) return false;
        Handset_Enter other = (Handset_Enter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.handsets==null && other.getHandsets()==null) || 
             (this.handsets!=null &&
              java.util.Arrays.equals(this.handsets, other.getHandsets()))) &&
            ((this.taxItems==null && other.getTaxItems()==null) || 
             (this.taxItems!=null &&
              java.util.Arrays.equals(this.taxItems, other.getTaxItems()))) &&
            this.referenceID == other.getReferenceID() &&
            this.orderTotal == other.getOrderTotal() &&
            this.taxesApply == other.isTaxesApply();
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
        if (getHandsets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHandsets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHandsets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        _hashCode += (isTaxesApply() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Handset_Enter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Handset_Enter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handsets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Handsets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Handset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Handset"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("taxesApply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TaxesApply"));
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
