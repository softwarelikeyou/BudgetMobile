/**
 * RetrPreactivatedHandsetByDeviceID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class RetrPreactivatedHandsetByDeviceID  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private java.lang.String MDN;

    private boolean upgradeHandset;

    private java.lang.String verizonActivationDate;

    private int providerID;

    private java.lang.String handsetPrice;

    private boolean comboPlanProvisioned;

    public RetrPreactivatedHandsetByDeviceID() {
    }

    public RetrPreactivatedHandsetByDeviceID(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           java.lang.String MDN,
           boolean upgradeHandset,
           java.lang.String verizonActivationDate,
           int providerID,
           java.lang.String handsetPrice,
           boolean comboPlanProvisioned) {
        super(
            errors,
            isError);
        this.MDN = MDN;
        this.upgradeHandset = upgradeHandset;
        this.verizonActivationDate = verizonActivationDate;
        this.providerID = providerID;
        this.handsetPrice = handsetPrice;
        this.comboPlanProvisioned = comboPlanProvisioned;
    }


    /**
     * Gets the MDN value for this RetrPreactivatedHandsetByDeviceID.
     * 
     * @return MDN
     */
    public java.lang.String getMDN() {
        return MDN;
    }


    /**
     * Sets the MDN value for this RetrPreactivatedHandsetByDeviceID.
     * 
     * @param MDN
     */
    public void setMDN(java.lang.String MDN) {
        this.MDN = MDN;
    }


    /**
     * Gets the upgradeHandset value for this RetrPreactivatedHandsetByDeviceID.
     * 
     * @return upgradeHandset
     */
    public boolean isUpgradeHandset() {
        return upgradeHandset;
    }


    /**
     * Sets the upgradeHandset value for this RetrPreactivatedHandsetByDeviceID.
     * 
     * @param upgradeHandset
     */
    public void setUpgradeHandset(boolean upgradeHandset) {
        this.upgradeHandset = upgradeHandset;
    }


    /**
     * Gets the verizonActivationDate value for this RetrPreactivatedHandsetByDeviceID.
     * 
     * @return verizonActivationDate
     */
    public java.lang.String getVerizonActivationDate() {
        return verizonActivationDate;
    }


    /**
     * Sets the verizonActivationDate value for this RetrPreactivatedHandsetByDeviceID.
     * 
     * @param verizonActivationDate
     */
    public void setVerizonActivationDate(java.lang.String verizonActivationDate) {
        this.verizonActivationDate = verizonActivationDate;
    }


    /**
     * Gets the providerID value for this RetrPreactivatedHandsetByDeviceID.
     * 
     * @return providerID
     */
    public int getProviderID() {
        return providerID;
    }


    /**
     * Sets the providerID value for this RetrPreactivatedHandsetByDeviceID.
     * 
     * @param providerID
     */
    public void setProviderID(int providerID) {
        this.providerID = providerID;
    }


    /**
     * Gets the handsetPrice value for this RetrPreactivatedHandsetByDeviceID.
     * 
     * @return handsetPrice
     */
    public java.lang.String getHandsetPrice() {
        return handsetPrice;
    }


    /**
     * Sets the handsetPrice value for this RetrPreactivatedHandsetByDeviceID.
     * 
     * @param handsetPrice
     */
    public void setHandsetPrice(java.lang.String handsetPrice) {
        this.handsetPrice = handsetPrice;
    }


    /**
     * Gets the comboPlanProvisioned value for this RetrPreactivatedHandsetByDeviceID.
     * 
     * @return comboPlanProvisioned
     */
    public boolean isComboPlanProvisioned() {
        return comboPlanProvisioned;
    }


    /**
     * Sets the comboPlanProvisioned value for this RetrPreactivatedHandsetByDeviceID.
     * 
     * @param comboPlanProvisioned
     */
    public void setComboPlanProvisioned(boolean comboPlanProvisioned) {
        this.comboPlanProvisioned = comboPlanProvisioned;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrPreactivatedHandsetByDeviceID)) return false;
        RetrPreactivatedHandsetByDeviceID other = (RetrPreactivatedHandsetByDeviceID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.MDN==null && other.getMDN()==null) || 
             (this.MDN!=null &&
              this.MDN.equals(other.getMDN()))) &&
            this.upgradeHandset == other.isUpgradeHandset() &&
            ((this.verizonActivationDate==null && other.getVerizonActivationDate()==null) || 
             (this.verizonActivationDate!=null &&
              this.verizonActivationDate.equals(other.getVerizonActivationDate()))) &&
            this.providerID == other.getProviderID() &&
            ((this.handsetPrice==null && other.getHandsetPrice()==null) || 
             (this.handsetPrice!=null &&
              this.handsetPrice.equals(other.getHandsetPrice()))) &&
            this.comboPlanProvisioned == other.isComboPlanProvisioned();
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
        if (getMDN() != null) {
            _hashCode += getMDN().hashCode();
        }
        _hashCode += (isUpgradeHandset() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVerizonActivationDate() != null) {
            _hashCode += getVerizonActivationDate().hashCode();
        }
        _hashCode += getProviderID();
        if (getHandsetPrice() != null) {
            _hashCode += getHandsetPrice().hashCode();
        }
        _hashCode += (isComboPlanProvisioned() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrPreactivatedHandsetByDeviceID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "RetrPreactivatedHandsetByDeviceID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upgradeHandset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpgradeHandset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verizonActivationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VerizonActivationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProviderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handsetPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HandsetPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comboPlanProvisioned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ComboPlanProvisioned"));
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
