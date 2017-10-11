/**
 * SafetechFraudAnalysisRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class SafetechFraudAnalysisRequest  implements java.io.Serializable {
    private java.lang.String endppoint;

    private java.lang.String bin;

    private java.lang.String merchantID;

    private java.lang.String orbitalConnectionPassword;

    private java.lang.String orbitalConnectionUsername;

    private java.lang.String terminalID;

    private com.budgetprepay.www.Paymentech.BaseElements baseElements;

    private com.budgetprepay.www.Paymentech.FraudAnalysis fraudAnalysis;

    private java.lang.String version;

    public SafetechFraudAnalysisRequest() {
    }

    public SafetechFraudAnalysisRequest(
           java.lang.String endppoint,
           java.lang.String bin,
           java.lang.String merchantID,
           java.lang.String orbitalConnectionPassword,
           java.lang.String orbitalConnectionUsername,
           java.lang.String terminalID,
           com.budgetprepay.www.Paymentech.BaseElements baseElements,
           com.budgetprepay.www.Paymentech.FraudAnalysis fraudAnalysis,
           java.lang.String version) {
           this.endppoint = endppoint;
           this.bin = bin;
           this.merchantID = merchantID;
           this.orbitalConnectionPassword = orbitalConnectionPassword;
           this.orbitalConnectionUsername = orbitalConnectionUsername;
           this.terminalID = terminalID;
           this.baseElements = baseElements;
           this.fraudAnalysis = fraudAnalysis;
           this.version = version;
    }


    /**
     * Gets the endppoint value for this SafetechFraudAnalysisRequest.
     * 
     * @return endppoint
     */
    public java.lang.String getEndppoint() {
        return endppoint;
    }


    /**
     * Sets the endppoint value for this SafetechFraudAnalysisRequest.
     * 
     * @param endppoint
     */
    public void setEndppoint(java.lang.String endppoint) {
        this.endppoint = endppoint;
    }


    /**
     * Gets the bin value for this SafetechFraudAnalysisRequest.
     * 
     * @return bin
     */
    public java.lang.String getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this SafetechFraudAnalysisRequest.
     * 
     * @param bin
     */
    public void setBin(java.lang.String bin) {
        this.bin = bin;
    }


    /**
     * Gets the merchantID value for this SafetechFraudAnalysisRequest.
     * 
     * @return merchantID
     */
    public java.lang.String getMerchantID() {
        return merchantID;
    }


    /**
     * Sets the merchantID value for this SafetechFraudAnalysisRequest.
     * 
     * @param merchantID
     */
    public void setMerchantID(java.lang.String merchantID) {
        this.merchantID = merchantID;
    }


    /**
     * Gets the orbitalConnectionPassword value for this SafetechFraudAnalysisRequest.
     * 
     * @return orbitalConnectionPassword
     */
    public java.lang.String getOrbitalConnectionPassword() {
        return orbitalConnectionPassword;
    }


    /**
     * Sets the orbitalConnectionPassword value for this SafetechFraudAnalysisRequest.
     * 
     * @param orbitalConnectionPassword
     */
    public void setOrbitalConnectionPassword(java.lang.String orbitalConnectionPassword) {
        this.orbitalConnectionPassword = orbitalConnectionPassword;
    }


    /**
     * Gets the orbitalConnectionUsername value for this SafetechFraudAnalysisRequest.
     * 
     * @return orbitalConnectionUsername
     */
    public java.lang.String getOrbitalConnectionUsername() {
        return orbitalConnectionUsername;
    }


    /**
     * Sets the orbitalConnectionUsername value for this SafetechFraudAnalysisRequest.
     * 
     * @param orbitalConnectionUsername
     */
    public void setOrbitalConnectionUsername(java.lang.String orbitalConnectionUsername) {
        this.orbitalConnectionUsername = orbitalConnectionUsername;
    }


    /**
     * Gets the terminalID value for this SafetechFraudAnalysisRequest.
     * 
     * @return terminalID
     */
    public java.lang.String getTerminalID() {
        return terminalID;
    }


    /**
     * Sets the terminalID value for this SafetechFraudAnalysisRequest.
     * 
     * @param terminalID
     */
    public void setTerminalID(java.lang.String terminalID) {
        this.terminalID = terminalID;
    }


    /**
     * Gets the baseElements value for this SafetechFraudAnalysisRequest.
     * 
     * @return baseElements
     */
    public com.budgetprepay.www.Paymentech.BaseElements getBaseElements() {
        return baseElements;
    }


    /**
     * Sets the baseElements value for this SafetechFraudAnalysisRequest.
     * 
     * @param baseElements
     */
    public void setBaseElements(com.budgetprepay.www.Paymentech.BaseElements baseElements) {
        this.baseElements = baseElements;
    }


    /**
     * Gets the fraudAnalysis value for this SafetechFraudAnalysisRequest.
     * 
     * @return fraudAnalysis
     */
    public com.budgetprepay.www.Paymentech.FraudAnalysis getFraudAnalysis() {
        return fraudAnalysis;
    }


    /**
     * Sets the fraudAnalysis value for this SafetechFraudAnalysisRequest.
     * 
     * @param fraudAnalysis
     */
    public void setFraudAnalysis(com.budgetprepay.www.Paymentech.FraudAnalysis fraudAnalysis) {
        this.fraudAnalysis = fraudAnalysis;
    }


    /**
     * Gets the version value for this SafetechFraudAnalysisRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SafetechFraudAnalysisRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SafetechFraudAnalysisRequest)) return false;
        SafetechFraudAnalysisRequest other = (SafetechFraudAnalysisRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endppoint==null && other.getEndppoint()==null) || 
             (this.endppoint!=null &&
              this.endppoint.equals(other.getEndppoint()))) &&
            ((this.bin==null && other.getBin()==null) || 
             (this.bin!=null &&
              this.bin.equals(other.getBin()))) &&
            ((this.merchantID==null && other.getMerchantID()==null) || 
             (this.merchantID!=null &&
              this.merchantID.equals(other.getMerchantID()))) &&
            ((this.orbitalConnectionPassword==null && other.getOrbitalConnectionPassword()==null) || 
             (this.orbitalConnectionPassword!=null &&
              this.orbitalConnectionPassword.equals(other.getOrbitalConnectionPassword()))) &&
            ((this.orbitalConnectionUsername==null && other.getOrbitalConnectionUsername()==null) || 
             (this.orbitalConnectionUsername!=null &&
              this.orbitalConnectionUsername.equals(other.getOrbitalConnectionUsername()))) &&
            ((this.terminalID==null && other.getTerminalID()==null) || 
             (this.terminalID!=null &&
              this.terminalID.equals(other.getTerminalID()))) &&
            ((this.baseElements==null && other.getBaseElements()==null) || 
             (this.baseElements!=null &&
              this.baseElements.equals(other.getBaseElements()))) &&
            ((this.fraudAnalysis==null && other.getFraudAnalysis()==null) || 
             (this.fraudAnalysis!=null &&
              this.fraudAnalysis.equals(other.getFraudAnalysis()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getEndppoint() != null) {
            _hashCode += getEndppoint().hashCode();
        }
        if (getBin() != null) {
            _hashCode += getBin().hashCode();
        }
        if (getMerchantID() != null) {
            _hashCode += getMerchantID().hashCode();
        }
        if (getOrbitalConnectionPassword() != null) {
            _hashCode += getOrbitalConnectionPassword().hashCode();
        }
        if (getOrbitalConnectionUsername() != null) {
            _hashCode += getOrbitalConnectionUsername().hashCode();
        }
        if (getTerminalID() != null) {
            _hashCode += getTerminalID().hashCode();
        }
        if (getBaseElements() != null) {
            _hashCode += getBaseElements().hashCode();
        }
        if (getFraudAnalysis() != null) {
            _hashCode += getFraudAnalysis().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SafetechFraudAnalysisRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "SafetechFraudAnalysisRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endppoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "endppoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "merchantID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orbitalConnectionPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "orbitalConnectionPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orbitalConnectionUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "orbitalConnectionUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "terminalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseElements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "baseElements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "baseElements"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudAnalysis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "fraudAnalysis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "fraudAnalysis"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
