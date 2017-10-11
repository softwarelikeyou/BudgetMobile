/**
 * Credentials_TopUp_Enter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_TopUp_Enter  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private java.lang.String order_ID;

    private int budgetMobileID;

    private int topUpProductID;

    private boolean purchaseWithAccountCredits;

    private java.lang.String sales_Channel;

    private boolean advance;

    private double couponAmount;

    public Credentials_TopUp_Enter() {
    }

    public Credentials_TopUp_Enter(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           java.lang.String order_ID,
           int budgetMobileID,
           int topUpProductID,
           boolean purchaseWithAccountCredits,
           java.lang.String sales_Channel,
           boolean advance,
           double couponAmount) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.order_ID = order_ID;
        this.budgetMobileID = budgetMobileID;
        this.topUpProductID = topUpProductID;
        this.purchaseWithAccountCredits = purchaseWithAccountCredits;
        this.sales_Channel = sales_Channel;
        this.advance = advance;
        this.couponAmount = couponAmount;
    }


    /**
     * Gets the order_ID value for this Credentials_TopUp_Enter.
     * 
     * @return order_ID
     */
    public java.lang.String getOrder_ID() {
        return order_ID;
    }


    /**
     * Sets the order_ID value for this Credentials_TopUp_Enter.
     * 
     * @param order_ID
     */
    public void setOrder_ID(java.lang.String order_ID) {
        this.order_ID = order_ID;
    }


    /**
     * Gets the budgetMobileID value for this Credentials_TopUp_Enter.
     * 
     * @return budgetMobileID
     */
    public int getBudgetMobileID() {
        return budgetMobileID;
    }


    /**
     * Sets the budgetMobileID value for this Credentials_TopUp_Enter.
     * 
     * @param budgetMobileID
     */
    public void setBudgetMobileID(int budgetMobileID) {
        this.budgetMobileID = budgetMobileID;
    }


    /**
     * Gets the topUpProductID value for this Credentials_TopUp_Enter.
     * 
     * @return topUpProductID
     */
    public int getTopUpProductID() {
        return topUpProductID;
    }


    /**
     * Sets the topUpProductID value for this Credentials_TopUp_Enter.
     * 
     * @param topUpProductID
     */
    public void setTopUpProductID(int topUpProductID) {
        this.topUpProductID = topUpProductID;
    }


    /**
     * Gets the purchaseWithAccountCredits value for this Credentials_TopUp_Enter.
     * 
     * @return purchaseWithAccountCredits
     */
    public boolean isPurchaseWithAccountCredits() {
        return purchaseWithAccountCredits;
    }


    /**
     * Sets the purchaseWithAccountCredits value for this Credentials_TopUp_Enter.
     * 
     * @param purchaseWithAccountCredits
     */
    public void setPurchaseWithAccountCredits(boolean purchaseWithAccountCredits) {
        this.purchaseWithAccountCredits = purchaseWithAccountCredits;
    }


    /**
     * Gets the sales_Channel value for this Credentials_TopUp_Enter.
     * 
     * @return sales_Channel
     */
    public java.lang.String getSales_Channel() {
        return sales_Channel;
    }


    /**
     * Sets the sales_Channel value for this Credentials_TopUp_Enter.
     * 
     * @param sales_Channel
     */
    public void setSales_Channel(java.lang.String sales_Channel) {
        this.sales_Channel = sales_Channel;
    }


    /**
     * Gets the advance value for this Credentials_TopUp_Enter.
     * 
     * @return advance
     */
    public boolean isAdvance() {
        return advance;
    }


    /**
     * Sets the advance value for this Credentials_TopUp_Enter.
     * 
     * @param advance
     */
    public void setAdvance(boolean advance) {
        this.advance = advance;
    }


    /**
     * Gets the couponAmount value for this Credentials_TopUp_Enter.
     * 
     * @return couponAmount
     */
    public double getCouponAmount() {
        return couponAmount;
    }


    /**
     * Sets the couponAmount value for this Credentials_TopUp_Enter.
     * 
     * @param couponAmount
     */
    public void setCouponAmount(double couponAmount) {
        this.couponAmount = couponAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_TopUp_Enter)) return false;
        Credentials_TopUp_Enter other = (Credentials_TopUp_Enter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.order_ID==null && other.getOrder_ID()==null) || 
             (this.order_ID!=null &&
              this.order_ID.equals(other.getOrder_ID()))) &&
            this.budgetMobileID == other.getBudgetMobileID() &&
            this.topUpProductID == other.getTopUpProductID() &&
            this.purchaseWithAccountCredits == other.isPurchaseWithAccountCredits() &&
            ((this.sales_Channel==null && other.getSales_Channel()==null) || 
             (this.sales_Channel!=null &&
              this.sales_Channel.equals(other.getSales_Channel()))) &&
            this.advance == other.isAdvance() &&
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
        if (getOrder_ID() != null) {
            _hashCode += getOrder_ID().hashCode();
        }
        _hashCode += getBudgetMobileID();
        _hashCode += getTopUpProductID();
        _hashCode += (isPurchaseWithAccountCredits() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSales_Channel() != null) {
            _hashCode += getSales_Channel().hashCode();
        }
        _hashCode += (isAdvance() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getCouponAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_TopUp_Enter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_TopUp_Enter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Order_ID"));
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
        elemField.setFieldName("topUpProductID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUpProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseWithAccountCredits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PurchaseWithAccountCredits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sales_Channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Sales_Channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Advance"));
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
