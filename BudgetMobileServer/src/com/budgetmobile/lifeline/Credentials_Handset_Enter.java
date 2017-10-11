/**
 * Credentials_Handset_Enter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_Handset_Enter  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private com.budgetmobile.lifeline.HandsetOrderItem[] handsets;

    private java.lang.String order_ID;

    private java.lang.String employeeAccount;

    private java.lang.String sales_Channel;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zip;

    private boolean preOrder;

    private double handsetPrice;

    public Credentials_Handset_Enter() {
    }

    public Credentials_Handset_Enter(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           com.budgetmobile.lifeline.HandsetOrderItem[] handsets,
           java.lang.String order_ID,
           java.lang.String employeeAccount,
           java.lang.String sales_Channel,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zip,
           boolean preOrder,
           double handsetPrice) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.handsets = handsets;
        this.order_ID = order_ID;
        this.employeeAccount = employeeAccount;
        this.sales_Channel = sales_Channel;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.preOrder = preOrder;
        this.handsetPrice = handsetPrice;
    }


    /**
     * Gets the handsets value for this Credentials_Handset_Enter.
     * 
     * @return handsets
     */
    public com.budgetmobile.lifeline.HandsetOrderItem[] getHandsets() {
        return handsets;
    }


    /**
     * Sets the handsets value for this Credentials_Handset_Enter.
     * 
     * @param handsets
     */
    public void setHandsets(com.budgetmobile.lifeline.HandsetOrderItem[] handsets) {
        this.handsets = handsets;
    }


    /**
     * Gets the order_ID value for this Credentials_Handset_Enter.
     * 
     * @return order_ID
     */
    public java.lang.String getOrder_ID() {
        return order_ID;
    }


    /**
     * Sets the order_ID value for this Credentials_Handset_Enter.
     * 
     * @param order_ID
     */
    public void setOrder_ID(java.lang.String order_ID) {
        this.order_ID = order_ID;
    }


    /**
     * Gets the employeeAccount value for this Credentials_Handset_Enter.
     * 
     * @return employeeAccount
     */
    public java.lang.String getEmployeeAccount() {
        return employeeAccount;
    }


    /**
     * Sets the employeeAccount value for this Credentials_Handset_Enter.
     * 
     * @param employeeAccount
     */
    public void setEmployeeAccount(java.lang.String employeeAccount) {
        this.employeeAccount = employeeAccount;
    }


    /**
     * Gets the sales_Channel value for this Credentials_Handset_Enter.
     * 
     * @return sales_Channel
     */
    public java.lang.String getSales_Channel() {
        return sales_Channel;
    }


    /**
     * Sets the sales_Channel value for this Credentials_Handset_Enter.
     * 
     * @param sales_Channel
     */
    public void setSales_Channel(java.lang.String sales_Channel) {
        this.sales_Channel = sales_Channel;
    }


    /**
     * Gets the city value for this Credentials_Handset_Enter.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Credentials_Handset_Enter.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this Credentials_Handset_Enter.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Credentials_Handset_Enter.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this Credentials_Handset_Enter.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this Credentials_Handset_Enter.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the preOrder value for this Credentials_Handset_Enter.
     * 
     * @return preOrder
     */
    public boolean isPreOrder() {
        return preOrder;
    }


    /**
     * Sets the preOrder value for this Credentials_Handset_Enter.
     * 
     * @param preOrder
     */
    public void setPreOrder(boolean preOrder) {
        this.preOrder = preOrder;
    }


    /**
     * Gets the handsetPrice value for this Credentials_Handset_Enter.
     * 
     * @return handsetPrice
     */
    public double getHandsetPrice() {
        return handsetPrice;
    }


    /**
     * Sets the handsetPrice value for this Credentials_Handset_Enter.
     * 
     * @param handsetPrice
     */
    public void setHandsetPrice(double handsetPrice) {
        this.handsetPrice = handsetPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_Handset_Enter)) return false;
        Credentials_Handset_Enter other = (Credentials_Handset_Enter) obj;
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
            ((this.order_ID==null && other.getOrder_ID()==null) || 
             (this.order_ID!=null &&
              this.order_ID.equals(other.getOrder_ID()))) &&
            ((this.employeeAccount==null && other.getEmployeeAccount()==null) || 
             (this.employeeAccount!=null &&
              this.employeeAccount.equals(other.getEmployeeAccount()))) &&
            ((this.sales_Channel==null && other.getSales_Channel()==null) || 
             (this.sales_Channel!=null &&
              this.sales_Channel.equals(other.getSales_Channel()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            this.preOrder == other.isPreOrder() &&
            this.handsetPrice == other.getHandsetPrice();
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
        if (getOrder_ID() != null) {
            _hashCode += getOrder_ID().hashCode();
        }
        if (getEmployeeAccount() != null) {
            _hashCode += getEmployeeAccount().hashCode();
        }
        if (getSales_Channel() != null) {
            _hashCode += getSales_Channel().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        _hashCode += (isPreOrder() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getHandsetPrice()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_Handset_Enter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Handset_Enter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handsets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Handsets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "HandsetOrderItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "HandsetOrderItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Order_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EmployeeAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PreOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handsetPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HandsetPrice"));
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
