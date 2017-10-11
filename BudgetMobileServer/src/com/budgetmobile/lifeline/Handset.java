/**
 * Handset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Handset  implements java.io.Serializable {
    private java.lang.Integer handsetID;

    private java.lang.String model;

    private double SRP;

    private int category;

    private java.lang.Integer quantity;

    private java.lang.Double handsetTotal;

    public Handset() {
    }

    public Handset(
           java.lang.Integer handsetID,
           java.lang.String model,
           double SRP,
           int category,
           java.lang.Integer quantity,
           java.lang.Double handsetTotal) {
           this.handsetID = handsetID;
           this.model = model;
           this.SRP = SRP;
           this.category = category;
           this.quantity = quantity;
           this.handsetTotal = handsetTotal;
    }


    /**
     * Gets the handsetID value for this Handset.
     * 
     * @return handsetID
     */
    public java.lang.Integer getHandsetID() {
        return handsetID;
    }


    /**
     * Sets the handsetID value for this Handset.
     * 
     * @param handsetID
     */
    public void setHandsetID(java.lang.Integer handsetID) {
        this.handsetID = handsetID;
    }


    /**
     * Gets the model value for this Handset.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this Handset.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the SRP value for this Handset.
     * 
     * @return SRP
     */
    public double getSRP() {
        return SRP;
    }


    /**
     * Sets the SRP value for this Handset.
     * 
     * @param SRP
     */
    public void setSRP(double SRP) {
        this.SRP = SRP;
    }


    /**
     * Gets the category value for this Handset.
     * 
     * @return category
     */
    public int getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Handset.
     * 
     * @param category
     */
    public void setCategory(int category) {
        this.category = category;
    }


    /**
     * Gets the quantity value for this Handset.
     * 
     * @return quantity
     */
    public java.lang.Integer getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Handset.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the handsetTotal value for this Handset.
     * 
     * @return handsetTotal
     */
    public java.lang.Double getHandsetTotal() {
        return handsetTotal;
    }


    /**
     * Sets the handsetTotal value for this Handset.
     * 
     * @param handsetTotal
     */
    public void setHandsetTotal(java.lang.Double handsetTotal) {
        this.handsetTotal = handsetTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Handset)) return false;
        Handset other = (Handset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.handsetID==null && other.getHandsetID()==null) || 
             (this.handsetID!=null &&
              this.handsetID.equals(other.getHandsetID()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            this.SRP == other.getSRP() &&
            this.category == other.getCategory() &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.handsetTotal==null && other.getHandsetTotal()==null) || 
             (this.handsetTotal!=null &&
              this.handsetTotal.equals(other.getHandsetTotal())));
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
        if (getHandsetID() != null) {
            _hashCode += getHandsetID().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        _hashCode += new Double(getSRP()).hashCode();
        _hashCode += getCategory();
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getHandsetTotal() != null) {
            _hashCode += getHandsetTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Handset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Handset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handsetID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HandsetID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SRP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SRP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handsetTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HandsetTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
