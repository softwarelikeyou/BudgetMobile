/**
 * RetrVoiceandTextBalance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class RetrVoiceandTextBalance  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private java.lang.String wirelessNumber;

    private int planBalance_Voice;

    private int planBalance_Text;

    private int topUpBalance_Voice;

    private int topUpBalance_Text;

    private java.lang.String serviceEndDate;

    private boolean topUpExpirationSet;

    private java.lang.String topUpExpiration;

    private int planBalance_Combo_VS;

    private int topUpBalance_Combo_VS;

    private java.lang.String planBalance_Data;

    private java.lang.String topUpBalance_Data;

    public RetrVoiceandTextBalance() {
    }

    public RetrVoiceandTextBalance(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           java.lang.String wirelessNumber,
           int planBalance_Voice,
           int planBalance_Text,
           int topUpBalance_Voice,
           int topUpBalance_Text,
           java.lang.String serviceEndDate,
           boolean topUpExpirationSet,
           java.lang.String topUpExpiration,
           int planBalance_Combo_VS,
           int topUpBalance_Combo_VS,
           java.lang.String planBalance_Data,
           java.lang.String topUpBalance_Data) {
        super(
            errors,
            isError);
        this.wirelessNumber = wirelessNumber;
        this.planBalance_Voice = planBalance_Voice;
        this.planBalance_Text = planBalance_Text;
        this.topUpBalance_Voice = topUpBalance_Voice;
        this.topUpBalance_Text = topUpBalance_Text;
        this.serviceEndDate = serviceEndDate;
        this.topUpExpirationSet = topUpExpirationSet;
        this.topUpExpiration = topUpExpiration;
        this.planBalance_Combo_VS = planBalance_Combo_VS;
        this.topUpBalance_Combo_VS = topUpBalance_Combo_VS;
        this.planBalance_Data = planBalance_Data;
        this.topUpBalance_Data = topUpBalance_Data;
    }


    /**
     * Gets the wirelessNumber value for this RetrVoiceandTextBalance.
     * 
     * @return wirelessNumber
     */
    public java.lang.String getWirelessNumber() {
        return wirelessNumber;
    }


    /**
     * Sets the wirelessNumber value for this RetrVoiceandTextBalance.
     * 
     * @param wirelessNumber
     */
    public void setWirelessNumber(java.lang.String wirelessNumber) {
        this.wirelessNumber = wirelessNumber;
    }


    /**
     * Gets the planBalance_Voice value for this RetrVoiceandTextBalance.
     * 
     * @return planBalance_Voice
     */
    public int getPlanBalance_Voice() {
        return planBalance_Voice;
    }


    /**
     * Sets the planBalance_Voice value for this RetrVoiceandTextBalance.
     * 
     * @param planBalance_Voice
     */
    public void setPlanBalance_Voice(int planBalance_Voice) {
        this.planBalance_Voice = planBalance_Voice;
    }


    /**
     * Gets the planBalance_Text value for this RetrVoiceandTextBalance.
     * 
     * @return planBalance_Text
     */
    public int getPlanBalance_Text() {
        return planBalance_Text;
    }


    /**
     * Sets the planBalance_Text value for this RetrVoiceandTextBalance.
     * 
     * @param planBalance_Text
     */
    public void setPlanBalance_Text(int planBalance_Text) {
        this.planBalance_Text = planBalance_Text;
    }


    /**
     * Gets the topUpBalance_Voice value for this RetrVoiceandTextBalance.
     * 
     * @return topUpBalance_Voice
     */
    public int getTopUpBalance_Voice() {
        return topUpBalance_Voice;
    }


    /**
     * Sets the topUpBalance_Voice value for this RetrVoiceandTextBalance.
     * 
     * @param topUpBalance_Voice
     */
    public void setTopUpBalance_Voice(int topUpBalance_Voice) {
        this.topUpBalance_Voice = topUpBalance_Voice;
    }


    /**
     * Gets the topUpBalance_Text value for this RetrVoiceandTextBalance.
     * 
     * @return topUpBalance_Text
     */
    public int getTopUpBalance_Text() {
        return topUpBalance_Text;
    }


    /**
     * Sets the topUpBalance_Text value for this RetrVoiceandTextBalance.
     * 
     * @param topUpBalance_Text
     */
    public void setTopUpBalance_Text(int topUpBalance_Text) {
        this.topUpBalance_Text = topUpBalance_Text;
    }


    /**
     * Gets the serviceEndDate value for this RetrVoiceandTextBalance.
     * 
     * @return serviceEndDate
     */
    public java.lang.String getServiceEndDate() {
        return serviceEndDate;
    }


    /**
     * Sets the serviceEndDate value for this RetrVoiceandTextBalance.
     * 
     * @param serviceEndDate
     */
    public void setServiceEndDate(java.lang.String serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }


    /**
     * Gets the topUpExpirationSet value for this RetrVoiceandTextBalance.
     * 
     * @return topUpExpirationSet
     */
    public boolean isTopUpExpirationSet() {
        return topUpExpirationSet;
    }


    /**
     * Sets the topUpExpirationSet value for this RetrVoiceandTextBalance.
     * 
     * @param topUpExpirationSet
     */
    public void setTopUpExpirationSet(boolean topUpExpirationSet) {
        this.topUpExpirationSet = topUpExpirationSet;
    }


    /**
     * Gets the topUpExpiration value for this RetrVoiceandTextBalance.
     * 
     * @return topUpExpiration
     */
    public java.lang.String getTopUpExpiration() {
        return topUpExpiration;
    }


    /**
     * Sets the topUpExpiration value for this RetrVoiceandTextBalance.
     * 
     * @param topUpExpiration
     */
    public void setTopUpExpiration(java.lang.String topUpExpiration) {
        this.topUpExpiration = topUpExpiration;
    }


    /**
     * Gets the planBalance_Combo_VS value for this RetrVoiceandTextBalance.
     * 
     * @return planBalance_Combo_VS
     */
    public int getPlanBalance_Combo_VS() {
        return planBalance_Combo_VS;
    }


    /**
     * Sets the planBalance_Combo_VS value for this RetrVoiceandTextBalance.
     * 
     * @param planBalance_Combo_VS
     */
    public void setPlanBalance_Combo_VS(int planBalance_Combo_VS) {
        this.planBalance_Combo_VS = planBalance_Combo_VS;
    }


    /**
     * Gets the topUpBalance_Combo_VS value for this RetrVoiceandTextBalance.
     * 
     * @return topUpBalance_Combo_VS
     */
    public int getTopUpBalance_Combo_VS() {
        return topUpBalance_Combo_VS;
    }


    /**
     * Sets the topUpBalance_Combo_VS value for this RetrVoiceandTextBalance.
     * 
     * @param topUpBalance_Combo_VS
     */
    public void setTopUpBalance_Combo_VS(int topUpBalance_Combo_VS) {
        this.topUpBalance_Combo_VS = topUpBalance_Combo_VS;
    }


    /**
     * Gets the planBalance_Data value for this RetrVoiceandTextBalance.
     * 
     * @return planBalance_Data
     */
    public java.lang.String getPlanBalance_Data() {
        return planBalance_Data;
    }


    /**
     * Sets the planBalance_Data value for this RetrVoiceandTextBalance.
     * 
     * @param planBalance_Data
     */
    public void setPlanBalance_Data(java.lang.String planBalance_Data) {
        this.planBalance_Data = planBalance_Data;
    }


    /**
     * Gets the topUpBalance_Data value for this RetrVoiceandTextBalance.
     * 
     * @return topUpBalance_Data
     */
    public java.lang.String getTopUpBalance_Data() {
        return topUpBalance_Data;
    }


    /**
     * Sets the topUpBalance_Data value for this RetrVoiceandTextBalance.
     * 
     * @param topUpBalance_Data
     */
    public void setTopUpBalance_Data(java.lang.String topUpBalance_Data) {
        this.topUpBalance_Data = topUpBalance_Data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrVoiceandTextBalance)) return false;
        RetrVoiceandTextBalance other = (RetrVoiceandTextBalance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.wirelessNumber==null && other.getWirelessNumber()==null) || 
             (this.wirelessNumber!=null &&
              this.wirelessNumber.equals(other.getWirelessNumber()))) &&
            this.planBalance_Voice == other.getPlanBalance_Voice() &&
            this.planBalance_Text == other.getPlanBalance_Text() &&
            this.topUpBalance_Voice == other.getTopUpBalance_Voice() &&
            this.topUpBalance_Text == other.getTopUpBalance_Text() &&
            ((this.serviceEndDate==null && other.getServiceEndDate()==null) || 
             (this.serviceEndDate!=null &&
              this.serviceEndDate.equals(other.getServiceEndDate()))) &&
            this.topUpExpirationSet == other.isTopUpExpirationSet() &&
            ((this.topUpExpiration==null && other.getTopUpExpiration()==null) || 
             (this.topUpExpiration!=null &&
              this.topUpExpiration.equals(other.getTopUpExpiration()))) &&
            this.planBalance_Combo_VS == other.getPlanBalance_Combo_VS() &&
            this.topUpBalance_Combo_VS == other.getTopUpBalance_Combo_VS() &&
            ((this.planBalance_Data==null && other.getPlanBalance_Data()==null) || 
             (this.planBalance_Data!=null &&
              this.planBalance_Data.equals(other.getPlanBalance_Data()))) &&
            ((this.topUpBalance_Data==null && other.getTopUpBalance_Data()==null) || 
             (this.topUpBalance_Data!=null &&
              this.topUpBalance_Data.equals(other.getTopUpBalance_Data())));
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
        if (getWirelessNumber() != null) {
            _hashCode += getWirelessNumber().hashCode();
        }
        _hashCode += getPlanBalance_Voice();
        _hashCode += getPlanBalance_Text();
        _hashCode += getTopUpBalance_Voice();
        _hashCode += getTopUpBalance_Text();
        if (getServiceEndDate() != null) {
            _hashCode += getServiceEndDate().hashCode();
        }
        _hashCode += (isTopUpExpirationSet() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTopUpExpiration() != null) {
            _hashCode += getTopUpExpiration().hashCode();
        }
        _hashCode += getPlanBalance_Combo_VS();
        _hashCode += getTopUpBalance_Combo_VS();
        if (getPlanBalance_Data() != null) {
            _hashCode += getPlanBalance_Data().hashCode();
        }
        if (getTopUpBalance_Data() != null) {
            _hashCode += getTopUpBalance_Data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrVoiceandTextBalance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "RetrVoiceandTextBalance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wirelessNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "WirelessNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planBalance_Voice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "planBalance_Voice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planBalance_Text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "planBalance_Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpBalance_Voice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "topUpBalance_Voice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpBalance_Text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "topUpBalance_Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ServiceEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpExpirationSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUpExpirationSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUpExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planBalance_Combo_VS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "planBalance_Combo_VS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpBalance_Combo_VS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TopUpBalance_Combo_VS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planBalance_Data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "planBalance_Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpBalance_Data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "topUpBalance_Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
