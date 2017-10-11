/**
 * EndOfDayResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class EndOfDayResponse  implements java.io.Serializable {
    private com.budgetprepay.www.Paymentech.ErrorMessage errorMessage;

    private java.lang.String batchSeqNum;

    private java.lang.String bin;

    private java.lang.String merchantID;

    private java.lang.String procStatus;

    private java.lang.String procStatusMessage;

    private java.lang.String terminalID;

    private java.lang.String version;

    public EndOfDayResponse() {
    }

    public EndOfDayResponse(
           com.budgetprepay.www.Paymentech.ErrorMessage errorMessage,
           java.lang.String batchSeqNum,
           java.lang.String bin,
           java.lang.String merchantID,
           java.lang.String procStatus,
           java.lang.String procStatusMessage,
           java.lang.String terminalID,
           java.lang.String version) {
           this.errorMessage = errorMessage;
           this.batchSeqNum = batchSeqNum;
           this.bin = bin;
           this.merchantID = merchantID;
           this.procStatus = procStatus;
           this.procStatusMessage = procStatusMessage;
           this.terminalID = terminalID;
           this.version = version;
    }


    /**
     * Gets the errorMessage value for this EndOfDayResponse.
     * 
     * @return errorMessage
     */
    public com.budgetprepay.www.Paymentech.ErrorMessage getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this EndOfDayResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(com.budgetprepay.www.Paymentech.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the batchSeqNum value for this EndOfDayResponse.
     * 
     * @return batchSeqNum
     */
    public java.lang.String getBatchSeqNum() {
        return batchSeqNum;
    }


    /**
     * Sets the batchSeqNum value for this EndOfDayResponse.
     * 
     * @param batchSeqNum
     */
    public void setBatchSeqNum(java.lang.String batchSeqNum) {
        this.batchSeqNum = batchSeqNum;
    }


    /**
     * Gets the bin value for this EndOfDayResponse.
     * 
     * @return bin
     */
    public java.lang.String getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this EndOfDayResponse.
     * 
     * @param bin
     */
    public void setBin(java.lang.String bin) {
        this.bin = bin;
    }


    /**
     * Gets the merchantID value for this EndOfDayResponse.
     * 
     * @return merchantID
     */
    public java.lang.String getMerchantID() {
        return merchantID;
    }


    /**
     * Sets the merchantID value for this EndOfDayResponse.
     * 
     * @param merchantID
     */
    public void setMerchantID(java.lang.String merchantID) {
        this.merchantID = merchantID;
    }


    /**
     * Gets the procStatus value for this EndOfDayResponse.
     * 
     * @return procStatus
     */
    public java.lang.String getProcStatus() {
        return procStatus;
    }


    /**
     * Sets the procStatus value for this EndOfDayResponse.
     * 
     * @param procStatus
     */
    public void setProcStatus(java.lang.String procStatus) {
        this.procStatus = procStatus;
    }


    /**
     * Gets the procStatusMessage value for this EndOfDayResponse.
     * 
     * @return procStatusMessage
     */
    public java.lang.String getProcStatusMessage() {
        return procStatusMessage;
    }


    /**
     * Sets the procStatusMessage value for this EndOfDayResponse.
     * 
     * @param procStatusMessage
     */
    public void setProcStatusMessage(java.lang.String procStatusMessage) {
        this.procStatusMessage = procStatusMessage;
    }


    /**
     * Gets the terminalID value for this EndOfDayResponse.
     * 
     * @return terminalID
     */
    public java.lang.String getTerminalID() {
        return terminalID;
    }


    /**
     * Sets the terminalID value for this EndOfDayResponse.
     * 
     * @param terminalID
     */
    public void setTerminalID(java.lang.String terminalID) {
        this.terminalID = terminalID;
    }


    /**
     * Gets the version value for this EndOfDayResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this EndOfDayResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EndOfDayResponse)) return false;
        EndOfDayResponse other = (EndOfDayResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.batchSeqNum==null && other.getBatchSeqNum()==null) || 
             (this.batchSeqNum!=null &&
              this.batchSeqNum.equals(other.getBatchSeqNum()))) &&
            ((this.bin==null && other.getBin()==null) || 
             (this.bin!=null &&
              this.bin.equals(other.getBin()))) &&
            ((this.merchantID==null && other.getMerchantID()==null) || 
             (this.merchantID!=null &&
              this.merchantID.equals(other.getMerchantID()))) &&
            ((this.procStatus==null && other.getProcStatus()==null) || 
             (this.procStatus!=null &&
              this.procStatus.equals(other.getProcStatus()))) &&
            ((this.procStatusMessage==null && other.getProcStatusMessage()==null) || 
             (this.procStatusMessage!=null &&
              this.procStatusMessage.equals(other.getProcStatusMessage()))) &&
            ((this.terminalID==null && other.getTerminalID()==null) || 
             (this.terminalID!=null &&
              this.terminalID.equals(other.getTerminalID()))) &&
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
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getBatchSeqNum() != null) {
            _hashCode += getBatchSeqNum().hashCode();
        }
        if (getBin() != null) {
            _hashCode += getBin().hashCode();
        }
        if (getMerchantID() != null) {
            _hashCode += getMerchantID().hashCode();
        }
        if (getProcStatus() != null) {
            _hashCode += getProcStatus().hashCode();
        }
        if (getProcStatusMessage() != null) {
            _hashCode += getProcStatusMessage().hashCode();
        }
        if (getTerminalID() != null) {
            _hashCode += getTerminalID().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EndOfDayResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "EndOfDayResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "errorMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchSeqNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "batchSeqNum"));
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
        elemField.setFieldName("procStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "procStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procStatusMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "procStatusMessage"));
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
