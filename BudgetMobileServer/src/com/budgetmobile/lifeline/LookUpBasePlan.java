/**
 * LookUpBasePlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class LookUpBasePlan  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private boolean basePlanDetailsAvailable;

    private java.lang.String planDescription;

    private java.lang.String voice;

    private java.lang.String text;

    private java.lang.String data;

    public LookUpBasePlan() {
    }

    public LookUpBasePlan(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           boolean basePlanDetailsAvailable,
           java.lang.String planDescription,
           java.lang.String voice,
           java.lang.String text,
           java.lang.String data) {
        super(
            errors,
            isError);
        this.basePlanDetailsAvailable = basePlanDetailsAvailable;
        this.planDescription = planDescription;
        this.voice = voice;
        this.text = text;
        this.data = data;
    }


    /**
     * Gets the basePlanDetailsAvailable value for this LookUpBasePlan.
     * 
     * @return basePlanDetailsAvailable
     */
    public boolean isBasePlanDetailsAvailable() {
        return basePlanDetailsAvailable;
    }


    /**
     * Sets the basePlanDetailsAvailable value for this LookUpBasePlan.
     * 
     * @param basePlanDetailsAvailable
     */
    public void setBasePlanDetailsAvailable(boolean basePlanDetailsAvailable) {
        this.basePlanDetailsAvailable = basePlanDetailsAvailable;
    }


    /**
     * Gets the planDescription value for this LookUpBasePlan.
     * 
     * @return planDescription
     */
    public java.lang.String getPlanDescription() {
        return planDescription;
    }


    /**
     * Sets the planDescription value for this LookUpBasePlan.
     * 
     * @param planDescription
     */
    public void setPlanDescription(java.lang.String planDescription) {
        this.planDescription = planDescription;
    }


    /**
     * Gets the voice value for this LookUpBasePlan.
     * 
     * @return voice
     */
    public java.lang.String getVoice() {
        return voice;
    }


    /**
     * Sets the voice value for this LookUpBasePlan.
     * 
     * @param voice
     */
    public void setVoice(java.lang.String voice) {
        this.voice = voice;
    }


    /**
     * Gets the text value for this LookUpBasePlan.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this LookUpBasePlan.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the data value for this LookUpBasePlan.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this LookUpBasePlan.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookUpBasePlan)) return false;
        LookUpBasePlan other = (LookUpBasePlan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.basePlanDetailsAvailable == other.isBasePlanDetailsAvailable() &&
            ((this.planDescription==null && other.getPlanDescription()==null) || 
             (this.planDescription!=null &&
              this.planDescription.equals(other.getPlanDescription()))) &&
            ((this.voice==null && other.getVoice()==null) || 
             (this.voice!=null &&
              this.voice.equals(other.getVoice()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        _hashCode += (isBasePlanDetailsAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPlanDescription() != null) {
            _hashCode += getPlanDescription().hashCode();
        }
        if (getVoice() != null) {
            _hashCode += getVoice().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LookUpBasePlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "LookUpBasePlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basePlanDetailsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BasePlanDetailsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PlanDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Voice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Data"));
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
