/**
 * ActivateSprintDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class ActivateSprintDevice  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private java.lang.String MDN;

    private java.lang.String MSID;

    private java.lang.String CSA;

    private java.lang.String effectiveDate;

    private com.budgetmobile.lifeline.DeviceInfo_Output deviceInfo;

    public ActivateSprintDevice() {
    }

    public ActivateSprintDevice(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           java.lang.String MDN,
           java.lang.String MSID,
           java.lang.String CSA,
           java.lang.String effectiveDate,
           com.budgetmobile.lifeline.DeviceInfo_Output deviceInfo) {
        super(
            errors,
            isError);
        this.MDN = MDN;
        this.MSID = MSID;
        this.CSA = CSA;
        this.effectiveDate = effectiveDate;
        this.deviceInfo = deviceInfo;
    }


    /**
     * Gets the MDN value for this ActivateSprintDevice.
     * 
     * @return MDN
     */
    public java.lang.String getMDN() {
        return MDN;
    }


    /**
     * Sets the MDN value for this ActivateSprintDevice.
     * 
     * @param MDN
     */
    public void setMDN(java.lang.String MDN) {
        this.MDN = MDN;
    }


    /**
     * Gets the MSID value for this ActivateSprintDevice.
     * 
     * @return MSID
     */
    public java.lang.String getMSID() {
        return MSID;
    }


    /**
     * Sets the MSID value for this ActivateSprintDevice.
     * 
     * @param MSID
     */
    public void setMSID(java.lang.String MSID) {
        this.MSID = MSID;
    }


    /**
     * Gets the CSA value for this ActivateSprintDevice.
     * 
     * @return CSA
     */
    public java.lang.String getCSA() {
        return CSA;
    }


    /**
     * Sets the CSA value for this ActivateSprintDevice.
     * 
     * @param CSA
     */
    public void setCSA(java.lang.String CSA) {
        this.CSA = CSA;
    }


    /**
     * Gets the effectiveDate value for this ActivateSprintDevice.
     * 
     * @return effectiveDate
     */
    public java.lang.String getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this ActivateSprintDevice.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.lang.String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the deviceInfo value for this ActivateSprintDevice.
     * 
     * @return deviceInfo
     */
    public com.budgetmobile.lifeline.DeviceInfo_Output getDeviceInfo() {
        return deviceInfo;
    }


    /**
     * Sets the deviceInfo value for this ActivateSprintDevice.
     * 
     * @param deviceInfo
     */
    public void setDeviceInfo(com.budgetmobile.lifeline.DeviceInfo_Output deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivateSprintDevice)) return false;
        ActivateSprintDevice other = (ActivateSprintDevice) obj;
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
            ((this.MSID==null && other.getMSID()==null) || 
             (this.MSID!=null &&
              this.MSID.equals(other.getMSID()))) &&
            ((this.CSA==null && other.getCSA()==null) || 
             (this.CSA!=null &&
              this.CSA.equals(other.getCSA()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.deviceInfo==null && other.getDeviceInfo()==null) || 
             (this.deviceInfo!=null &&
              this.deviceInfo.equals(other.getDeviceInfo())));
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
        if (getMSID() != null) {
            _hashCode += getMSID().hashCode();
        }
        if (getCSA() != null) {
            _hashCode += getCSA().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getDeviceInfo() != null) {
            _hashCode += getDeviceInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivateSprintDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ActivateSprintDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CSA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeviceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DeviceInfo_Output"));
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
