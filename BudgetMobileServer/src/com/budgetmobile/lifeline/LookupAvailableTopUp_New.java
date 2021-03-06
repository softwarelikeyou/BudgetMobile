/**
 * LookupAvailableTopUp_New.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class LookupAvailableTopUp_New  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private com.budgetmobile.lifeline.TopUpProduct[] topUpProducts;

    private boolean topUpProductsAvailable;

    public LookupAvailableTopUp_New() {
    }

    public LookupAvailableTopUp_New(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           com.budgetmobile.lifeline.TopUpProduct[] topUpProducts,
           boolean topUpProductsAvailable) {
        super(
            errors,
            isError);
        this.topUpProducts = topUpProducts;
        this.topUpProductsAvailable = topUpProductsAvailable;
    }


    /**
     * Gets the topUpProducts value for this LookupAvailableTopUp_New.
     * 
     * @return topUpProducts
     */
    public com.budgetmobile.lifeline.TopUpProduct[] getTopUpProducts() {
        return topUpProducts;
    }


    /**
     * Sets the topUpProducts value for this LookupAvailableTopUp_New.
     * 
     * @param topUpProducts
     */
    public void setTopUpProducts(com.budgetmobile.lifeline.TopUpProduct[] topUpProducts) {
        this.topUpProducts = topUpProducts;
    }


    /**
     * Gets the topUpProductsAvailable value for this LookupAvailableTopUp_New.
     * 
     * @return topUpProductsAvailable
     */
    public boolean isTopUpProductsAvailable() {
        return topUpProductsAvailable;
    }


    /**
     * Sets the topUpProductsAvailable value for this LookupAvailableTopUp_New.
     * 
     * @param topUpProductsAvailable
     */
    public void setTopUpProductsAvailable(boolean topUpProductsAvailable) {
        this.topUpProductsAvailable = topUpProductsAvailable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookupAvailableTopUp_New)) return false;
        LookupAvailableTopUp_New other = (LookupAvailableTopUp_New) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.topUpProducts==null && other.getTopUpProducts()==null) || 
             (this.topUpProducts!=null &&
              java.util.Arrays.equals(this.topUpProducts, other.getTopUpProducts()))) &&
            this.topUpProductsAvailable == other.isTopUpProductsAvailable();
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
        if (getTopUpProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTopUpProducts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTopUpProducts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isTopUpProductsAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LookupAvailableTopUp_New.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "LookupAvailableTopUp_New"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUpProducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "TopUpProduct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUpProduct"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpProductsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUpProductsAvailable"));
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
