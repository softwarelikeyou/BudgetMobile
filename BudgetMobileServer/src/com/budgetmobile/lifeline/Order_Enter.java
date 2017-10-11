/**
 * Order_Enter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Order_Enter  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private com.budgetmobile.lifeline.AdditionalCharge[] additionalCharges;

    private com.budgetmobile.lifeline.TaxItem[] taxItems;

    private int referenceID;

    private int accountCreditsAwarded;

    private double orderTotal;

    private java.lang.String servicePlanDescription;

    private double servicePlanCost;

    private boolean additionalChargesApply;

    private boolean taxesApply;

    public Order_Enter() {
    }

    public Order_Enter(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           com.budgetmobile.lifeline.AdditionalCharge[] additionalCharges,
           com.budgetmobile.lifeline.TaxItem[] taxItems,
           int referenceID,
           int accountCreditsAwarded,
           double orderTotal,
           java.lang.String servicePlanDescription,
           double servicePlanCost,
           boolean additionalChargesApply,
           boolean taxesApply) {
        super(
            errors,
            isError);
        this.additionalCharges = additionalCharges;
        this.taxItems = taxItems;
        this.referenceID = referenceID;
        this.accountCreditsAwarded = accountCreditsAwarded;
        this.orderTotal = orderTotal;
        this.servicePlanDescription = servicePlanDescription;
        this.servicePlanCost = servicePlanCost;
        this.additionalChargesApply = additionalChargesApply;
        this.taxesApply = taxesApply;
    }


    /**
     * Gets the additionalCharges value for this Order_Enter.
     * 
     * @return additionalCharges
     */
    public com.budgetmobile.lifeline.AdditionalCharge[] getAdditionalCharges() {
        return additionalCharges;
    }


    /**
     * Sets the additionalCharges value for this Order_Enter.
     * 
     * @param additionalCharges
     */
    public void setAdditionalCharges(com.budgetmobile.lifeline.AdditionalCharge[] additionalCharges) {
        this.additionalCharges = additionalCharges;
    }


    /**
     * Gets the taxItems value for this Order_Enter.
     * 
     * @return taxItems
     */
    public com.budgetmobile.lifeline.TaxItem[] getTaxItems() {
        return taxItems;
    }


    /**
     * Sets the taxItems value for this Order_Enter.
     * 
     * @param taxItems
     */
    public void setTaxItems(com.budgetmobile.lifeline.TaxItem[] taxItems) {
        this.taxItems = taxItems;
    }


    /**
     * Gets the referenceID value for this Order_Enter.
     * 
     * @return referenceID
     */
    public int getReferenceID() {
        return referenceID;
    }


    /**
     * Sets the referenceID value for this Order_Enter.
     * 
     * @param referenceID
     */
    public void setReferenceID(int referenceID) {
        this.referenceID = referenceID;
    }


    /**
     * Gets the accountCreditsAwarded value for this Order_Enter.
     * 
     * @return accountCreditsAwarded
     */
    public int getAccountCreditsAwarded() {
        return accountCreditsAwarded;
    }


    /**
     * Sets the accountCreditsAwarded value for this Order_Enter.
     * 
     * @param accountCreditsAwarded
     */
    public void setAccountCreditsAwarded(int accountCreditsAwarded) {
        this.accountCreditsAwarded = accountCreditsAwarded;
    }


    /**
     * Gets the orderTotal value for this Order_Enter.
     * 
     * @return orderTotal
     */
    public double getOrderTotal() {
        return orderTotal;
    }


    /**
     * Sets the orderTotal value for this Order_Enter.
     * 
     * @param orderTotal
     */
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }


    /**
     * Gets the servicePlanDescription value for this Order_Enter.
     * 
     * @return servicePlanDescription
     */
    public java.lang.String getServicePlanDescription() {
        return servicePlanDescription;
    }


    /**
     * Sets the servicePlanDescription value for this Order_Enter.
     * 
     * @param servicePlanDescription
     */
    public void setServicePlanDescription(java.lang.String servicePlanDescription) {
        this.servicePlanDescription = servicePlanDescription;
    }


    /**
     * Gets the servicePlanCost value for this Order_Enter.
     * 
     * @return servicePlanCost
     */
    public double getServicePlanCost() {
        return servicePlanCost;
    }


    /**
     * Sets the servicePlanCost value for this Order_Enter.
     * 
     * @param servicePlanCost
     */
    public void setServicePlanCost(double servicePlanCost) {
        this.servicePlanCost = servicePlanCost;
    }


    /**
     * Gets the additionalChargesApply value for this Order_Enter.
     * 
     * @return additionalChargesApply
     */
    public boolean isAdditionalChargesApply() {
        return additionalChargesApply;
    }


    /**
     * Sets the additionalChargesApply value for this Order_Enter.
     * 
     * @param additionalChargesApply
     */
    public void setAdditionalChargesApply(boolean additionalChargesApply) {
        this.additionalChargesApply = additionalChargesApply;
    }


    /**
     * Gets the taxesApply value for this Order_Enter.
     * 
     * @return taxesApply
     */
    public boolean isTaxesApply() {
        return taxesApply;
    }


    /**
     * Sets the taxesApply value for this Order_Enter.
     * 
     * @param taxesApply
     */
    public void setTaxesApply(boolean taxesApply) {
        this.taxesApply = taxesApply;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Order_Enter)) return false;
        Order_Enter other = (Order_Enter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.additionalCharges==null && other.getAdditionalCharges()==null) || 
             (this.additionalCharges!=null &&
              java.util.Arrays.equals(this.additionalCharges, other.getAdditionalCharges()))) &&
            ((this.taxItems==null && other.getTaxItems()==null) || 
             (this.taxItems!=null &&
              java.util.Arrays.equals(this.taxItems, other.getTaxItems()))) &&
            this.referenceID == other.getReferenceID() &&
            this.accountCreditsAwarded == other.getAccountCreditsAwarded() &&
            this.orderTotal == other.getOrderTotal() &&
            ((this.servicePlanDescription==null && other.getServicePlanDescription()==null) || 
             (this.servicePlanDescription!=null &&
              this.servicePlanDescription.equals(other.getServicePlanDescription()))) &&
            this.servicePlanCost == other.getServicePlanCost() &&
            this.additionalChargesApply == other.isAdditionalChargesApply() &&
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
        if (getAdditionalCharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalCharges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalCharges(), i);
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
        _hashCode += getAccountCreditsAwarded();
        _hashCode += new Double(getOrderTotal()).hashCode();
        if (getServicePlanDescription() != null) {
            _hashCode += getServicePlanDescription().hashCode();
        }
        _hashCode += new Double(getServicePlanCost()).hashCode();
        _hashCode += (isAdditionalChargesApply() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTaxesApply() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Order_Enter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Order_Enter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AdditionalCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "AdditionalCharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "AdditionalCharge"));
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
        elemField.setFieldName("accountCreditsAwarded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AccountCreditsAwarded"));
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
        elemField.setFieldName("servicePlanDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ServicePlanDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePlanCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ServicePlanCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalChargesApply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AdditionalChargesApply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
