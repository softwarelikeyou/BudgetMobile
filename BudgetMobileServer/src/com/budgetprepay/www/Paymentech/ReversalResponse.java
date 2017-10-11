/**
 * ReversalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class ReversalResponse  implements java.io.Serializable {
    private com.budgetprepay.www.Paymentech.ErrorMessage errorMessage;

    private java.lang.String approvalStatus;

    private java.lang.String bin;

    private java.lang.String hostRespCode;

    private java.lang.String lastRetryDate;

    private java.lang.String merchantID;

    private java.lang.String orderID;

    private java.lang.String outstandingAmt;

    private java.lang.String procStatus;

    private java.lang.String procStatusMessage;

    private java.lang.String respCode;

    private java.lang.String respDateTime;

    private java.lang.String retryAttempCount;

    private java.lang.String retryTrace;

    private java.lang.String terminalID;

    private java.lang.String txRefIdx;

    private java.lang.String txRefNum;

    private java.lang.String version;

    public ReversalResponse() {
    }

    public ReversalResponse(
           com.budgetprepay.www.Paymentech.ErrorMessage errorMessage,
           java.lang.String approvalStatus,
           java.lang.String bin,
           java.lang.String hostRespCode,
           java.lang.String lastRetryDate,
           java.lang.String merchantID,
           java.lang.String orderID,
           java.lang.String outstandingAmt,
           java.lang.String procStatus,
           java.lang.String procStatusMessage,
           java.lang.String respCode,
           java.lang.String respDateTime,
           java.lang.String retryAttempCount,
           java.lang.String retryTrace,
           java.lang.String terminalID,
           java.lang.String txRefIdx,
           java.lang.String txRefNum,
           java.lang.String version) {
           this.errorMessage = errorMessage;
           this.approvalStatus = approvalStatus;
           this.bin = bin;
           this.hostRespCode = hostRespCode;
           this.lastRetryDate = lastRetryDate;
           this.merchantID = merchantID;
           this.orderID = orderID;
           this.outstandingAmt = outstandingAmt;
           this.procStatus = procStatus;
           this.procStatusMessage = procStatusMessage;
           this.respCode = respCode;
           this.respDateTime = respDateTime;
           this.retryAttempCount = retryAttempCount;
           this.retryTrace = retryTrace;
           this.terminalID = terminalID;
           this.txRefIdx = txRefIdx;
           this.txRefNum = txRefNum;
           this.version = version;
    }


    /**
     * Gets the errorMessage value for this ReversalResponse.
     * 
     * @return errorMessage
     */
    public com.budgetprepay.www.Paymentech.ErrorMessage getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ReversalResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(com.budgetprepay.www.Paymentech.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the approvalStatus value for this ReversalResponse.
     * 
     * @return approvalStatus
     */
    public java.lang.String getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this ReversalResponse.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(java.lang.String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the bin value for this ReversalResponse.
     * 
     * @return bin
     */
    public java.lang.String getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this ReversalResponse.
     * 
     * @param bin
     */
    public void setBin(java.lang.String bin) {
        this.bin = bin;
    }


    /**
     * Gets the hostRespCode value for this ReversalResponse.
     * 
     * @return hostRespCode
     */
    public java.lang.String getHostRespCode() {
        return hostRespCode;
    }


    /**
     * Sets the hostRespCode value for this ReversalResponse.
     * 
     * @param hostRespCode
     */
    public void setHostRespCode(java.lang.String hostRespCode) {
        this.hostRespCode = hostRespCode;
    }


    /**
     * Gets the lastRetryDate value for this ReversalResponse.
     * 
     * @return lastRetryDate
     */
    public java.lang.String getLastRetryDate() {
        return lastRetryDate;
    }


    /**
     * Sets the lastRetryDate value for this ReversalResponse.
     * 
     * @param lastRetryDate
     */
    public void setLastRetryDate(java.lang.String lastRetryDate) {
        this.lastRetryDate = lastRetryDate;
    }


    /**
     * Gets the merchantID value for this ReversalResponse.
     * 
     * @return merchantID
     */
    public java.lang.String getMerchantID() {
        return merchantID;
    }


    /**
     * Sets the merchantID value for this ReversalResponse.
     * 
     * @param merchantID
     */
    public void setMerchantID(java.lang.String merchantID) {
        this.merchantID = merchantID;
    }


    /**
     * Gets the orderID value for this ReversalResponse.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this ReversalResponse.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the outstandingAmt value for this ReversalResponse.
     * 
     * @return outstandingAmt
     */
    public java.lang.String getOutstandingAmt() {
        return outstandingAmt;
    }


    /**
     * Sets the outstandingAmt value for this ReversalResponse.
     * 
     * @param outstandingAmt
     */
    public void setOutstandingAmt(java.lang.String outstandingAmt) {
        this.outstandingAmt = outstandingAmt;
    }


    /**
     * Gets the procStatus value for this ReversalResponse.
     * 
     * @return procStatus
     */
    public java.lang.String getProcStatus() {
        return procStatus;
    }


    /**
     * Sets the procStatus value for this ReversalResponse.
     * 
     * @param procStatus
     */
    public void setProcStatus(java.lang.String procStatus) {
        this.procStatus = procStatus;
    }


    /**
     * Gets the procStatusMessage value for this ReversalResponse.
     * 
     * @return procStatusMessage
     */
    public java.lang.String getProcStatusMessage() {
        return procStatusMessage;
    }


    /**
     * Sets the procStatusMessage value for this ReversalResponse.
     * 
     * @param procStatusMessage
     */
    public void setProcStatusMessage(java.lang.String procStatusMessage) {
        this.procStatusMessage = procStatusMessage;
    }


    /**
     * Gets the respCode value for this ReversalResponse.
     * 
     * @return respCode
     */
    public java.lang.String getRespCode() {
        return respCode;
    }


    /**
     * Sets the respCode value for this ReversalResponse.
     * 
     * @param respCode
     */
    public void setRespCode(java.lang.String respCode) {
        this.respCode = respCode;
    }


    /**
     * Gets the respDateTime value for this ReversalResponse.
     * 
     * @return respDateTime
     */
    public java.lang.String getRespDateTime() {
        return respDateTime;
    }


    /**
     * Sets the respDateTime value for this ReversalResponse.
     * 
     * @param respDateTime
     */
    public void setRespDateTime(java.lang.String respDateTime) {
        this.respDateTime = respDateTime;
    }


    /**
     * Gets the retryAttempCount value for this ReversalResponse.
     * 
     * @return retryAttempCount
     */
    public java.lang.String getRetryAttempCount() {
        return retryAttempCount;
    }


    /**
     * Sets the retryAttempCount value for this ReversalResponse.
     * 
     * @param retryAttempCount
     */
    public void setRetryAttempCount(java.lang.String retryAttempCount) {
        this.retryAttempCount = retryAttempCount;
    }


    /**
     * Gets the retryTrace value for this ReversalResponse.
     * 
     * @return retryTrace
     */
    public java.lang.String getRetryTrace() {
        return retryTrace;
    }


    /**
     * Sets the retryTrace value for this ReversalResponse.
     * 
     * @param retryTrace
     */
    public void setRetryTrace(java.lang.String retryTrace) {
        this.retryTrace = retryTrace;
    }


    /**
     * Gets the terminalID value for this ReversalResponse.
     * 
     * @return terminalID
     */
    public java.lang.String getTerminalID() {
        return terminalID;
    }


    /**
     * Sets the terminalID value for this ReversalResponse.
     * 
     * @param terminalID
     */
    public void setTerminalID(java.lang.String terminalID) {
        this.terminalID = terminalID;
    }


    /**
     * Gets the txRefIdx value for this ReversalResponse.
     * 
     * @return txRefIdx
     */
    public java.lang.String getTxRefIdx() {
        return txRefIdx;
    }


    /**
     * Sets the txRefIdx value for this ReversalResponse.
     * 
     * @param txRefIdx
     */
    public void setTxRefIdx(java.lang.String txRefIdx) {
        this.txRefIdx = txRefIdx;
    }


    /**
     * Gets the txRefNum value for this ReversalResponse.
     * 
     * @return txRefNum
     */
    public java.lang.String getTxRefNum() {
        return txRefNum;
    }


    /**
     * Sets the txRefNum value for this ReversalResponse.
     * 
     * @param txRefNum
     */
    public void setTxRefNum(java.lang.String txRefNum) {
        this.txRefNum = txRefNum;
    }


    /**
     * Gets the version value for this ReversalResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ReversalResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReversalResponse)) return false;
        ReversalResponse other = (ReversalResponse) obj;
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
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.bin==null && other.getBin()==null) || 
             (this.bin!=null &&
              this.bin.equals(other.getBin()))) &&
            ((this.hostRespCode==null && other.getHostRespCode()==null) || 
             (this.hostRespCode!=null &&
              this.hostRespCode.equals(other.getHostRespCode()))) &&
            ((this.lastRetryDate==null && other.getLastRetryDate()==null) || 
             (this.lastRetryDate!=null &&
              this.lastRetryDate.equals(other.getLastRetryDate()))) &&
            ((this.merchantID==null && other.getMerchantID()==null) || 
             (this.merchantID!=null &&
              this.merchantID.equals(other.getMerchantID()))) &&
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.outstandingAmt==null && other.getOutstandingAmt()==null) || 
             (this.outstandingAmt!=null &&
              this.outstandingAmt.equals(other.getOutstandingAmt()))) &&
            ((this.procStatus==null && other.getProcStatus()==null) || 
             (this.procStatus!=null &&
              this.procStatus.equals(other.getProcStatus()))) &&
            ((this.procStatusMessage==null && other.getProcStatusMessage()==null) || 
             (this.procStatusMessage!=null &&
              this.procStatusMessage.equals(other.getProcStatusMessage()))) &&
            ((this.respCode==null && other.getRespCode()==null) || 
             (this.respCode!=null &&
              this.respCode.equals(other.getRespCode()))) &&
            ((this.respDateTime==null && other.getRespDateTime()==null) || 
             (this.respDateTime!=null &&
              this.respDateTime.equals(other.getRespDateTime()))) &&
            ((this.retryAttempCount==null && other.getRetryAttempCount()==null) || 
             (this.retryAttempCount!=null &&
              this.retryAttempCount.equals(other.getRetryAttempCount()))) &&
            ((this.retryTrace==null && other.getRetryTrace()==null) || 
             (this.retryTrace!=null &&
              this.retryTrace.equals(other.getRetryTrace()))) &&
            ((this.terminalID==null && other.getTerminalID()==null) || 
             (this.terminalID!=null &&
              this.terminalID.equals(other.getTerminalID()))) &&
            ((this.txRefIdx==null && other.getTxRefIdx()==null) || 
             (this.txRefIdx!=null &&
              this.txRefIdx.equals(other.getTxRefIdx()))) &&
            ((this.txRefNum==null && other.getTxRefNum()==null) || 
             (this.txRefNum!=null &&
              this.txRefNum.equals(other.getTxRefNum()))) &&
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
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getBin() != null) {
            _hashCode += getBin().hashCode();
        }
        if (getHostRespCode() != null) {
            _hashCode += getHostRespCode().hashCode();
        }
        if (getLastRetryDate() != null) {
            _hashCode += getLastRetryDate().hashCode();
        }
        if (getMerchantID() != null) {
            _hashCode += getMerchantID().hashCode();
        }
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getOutstandingAmt() != null) {
            _hashCode += getOutstandingAmt().hashCode();
        }
        if (getProcStatus() != null) {
            _hashCode += getProcStatus().hashCode();
        }
        if (getProcStatusMessage() != null) {
            _hashCode += getProcStatusMessage().hashCode();
        }
        if (getRespCode() != null) {
            _hashCode += getRespCode().hashCode();
        }
        if (getRespDateTime() != null) {
            _hashCode += getRespDateTime().hashCode();
        }
        if (getRetryAttempCount() != null) {
            _hashCode += getRetryAttempCount().hashCode();
        }
        if (getRetryTrace() != null) {
            _hashCode += getRetryTrace().hashCode();
        }
        if (getTerminalID() != null) {
            _hashCode += getTerminalID().hashCode();
        }
        if (getTxRefIdx() != null) {
            _hashCode += getTxRefIdx().hashCode();
        }
        if (getTxRefNum() != null) {
            _hashCode += getTxRefNum().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReversalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ReversalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "errorMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "approvalStatus"));
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
        elemField.setFieldName("hostRespCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "hostRespCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRetryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "lastRetryDate"));
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
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "orderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outstandingAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "outstandingAmt"));
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
        elemField.setFieldName("respCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "respCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "respDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryAttempCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "retryAttempCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryTrace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "retryTrace"));
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
        elemField.setFieldName("txRefIdx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "txRefIdx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "txRefNum"));
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
