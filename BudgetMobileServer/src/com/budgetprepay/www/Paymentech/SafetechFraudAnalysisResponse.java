/**
 * SafetechFraudAnalysisResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class SafetechFraudAnalysisResponse  implements java.io.Serializable {
    private com.budgetprepay.www.Paymentech.ErrorMessage errorMessage;

    private java.lang.String approvalStatus;

    private java.lang.String bin;

    private java.lang.String cardBrand;

    private java.lang.String ccAccountNum;

    private java.lang.String customerName;

    private java.lang.String customerRefNum;

    private com.budgetprepay.www.Paymentech.FraudAnalysisResponse fraudAnalysisResponse;

    private java.lang.String hostRespCode;

    private java.lang.String industryType;

    private java.lang.String lastRetryDate;

    private java.lang.String merchantID;

    private java.lang.String orderID;

    private java.lang.String procStatus;

    private java.lang.String procStatusMessage;

    private java.lang.String profileProcStatus;

    private java.lang.String profileProcStatusMsg;

    private java.lang.String respCode;

    private java.lang.String respCodeMessage;

    private java.lang.String respDateTime;

    private java.lang.String retryAttempCount;

    private java.lang.String retryTrace;

    private java.lang.String terminalID;

    private java.lang.String txRefNum;

    private java.lang.String version;

    public SafetechFraudAnalysisResponse() {
    }

    public SafetechFraudAnalysisResponse(
           com.budgetprepay.www.Paymentech.ErrorMessage errorMessage,
           java.lang.String approvalStatus,
           java.lang.String bin,
           java.lang.String cardBrand,
           java.lang.String ccAccountNum,
           java.lang.String customerName,
           java.lang.String customerRefNum,
           com.budgetprepay.www.Paymentech.FraudAnalysisResponse fraudAnalysisResponse,
           java.lang.String hostRespCode,
           java.lang.String industryType,
           java.lang.String lastRetryDate,
           java.lang.String merchantID,
           java.lang.String orderID,
           java.lang.String procStatus,
           java.lang.String procStatusMessage,
           java.lang.String profileProcStatus,
           java.lang.String profileProcStatusMsg,
           java.lang.String respCode,
           java.lang.String respCodeMessage,
           java.lang.String respDateTime,
           java.lang.String retryAttempCount,
           java.lang.String retryTrace,
           java.lang.String terminalID,
           java.lang.String txRefNum,
           java.lang.String version) {
           this.errorMessage = errorMessage;
           this.approvalStatus = approvalStatus;
           this.bin = bin;
           this.cardBrand = cardBrand;
           this.ccAccountNum = ccAccountNum;
           this.customerName = customerName;
           this.customerRefNum = customerRefNum;
           this.fraudAnalysisResponse = fraudAnalysisResponse;
           this.hostRespCode = hostRespCode;
           this.industryType = industryType;
           this.lastRetryDate = lastRetryDate;
           this.merchantID = merchantID;
           this.orderID = orderID;
           this.procStatus = procStatus;
           this.procStatusMessage = procStatusMessage;
           this.profileProcStatus = profileProcStatus;
           this.profileProcStatusMsg = profileProcStatusMsg;
           this.respCode = respCode;
           this.respCodeMessage = respCodeMessage;
           this.respDateTime = respDateTime;
           this.retryAttempCount = retryAttempCount;
           this.retryTrace = retryTrace;
           this.terminalID = terminalID;
           this.txRefNum = txRefNum;
           this.version = version;
    }


    /**
     * Gets the errorMessage value for this SafetechFraudAnalysisResponse.
     * 
     * @return errorMessage
     */
    public com.budgetprepay.www.Paymentech.ErrorMessage getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this SafetechFraudAnalysisResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(com.budgetprepay.www.Paymentech.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the approvalStatus value for this SafetechFraudAnalysisResponse.
     * 
     * @return approvalStatus
     */
    public java.lang.String getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this SafetechFraudAnalysisResponse.
     * 
     * @param approvalStatus
     */
    public void setApprovalStatus(java.lang.String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the bin value for this SafetechFraudAnalysisResponse.
     * 
     * @return bin
     */
    public java.lang.String getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this SafetechFraudAnalysisResponse.
     * 
     * @param bin
     */
    public void setBin(java.lang.String bin) {
        this.bin = bin;
    }


    /**
     * Gets the cardBrand value for this SafetechFraudAnalysisResponse.
     * 
     * @return cardBrand
     */
    public java.lang.String getCardBrand() {
        return cardBrand;
    }


    /**
     * Sets the cardBrand value for this SafetechFraudAnalysisResponse.
     * 
     * @param cardBrand
     */
    public void setCardBrand(java.lang.String cardBrand) {
        this.cardBrand = cardBrand;
    }


    /**
     * Gets the ccAccountNum value for this SafetechFraudAnalysisResponse.
     * 
     * @return ccAccountNum
     */
    public java.lang.String getCcAccountNum() {
        return ccAccountNum;
    }


    /**
     * Sets the ccAccountNum value for this SafetechFraudAnalysisResponse.
     * 
     * @param ccAccountNum
     */
    public void setCcAccountNum(java.lang.String ccAccountNum) {
        this.ccAccountNum = ccAccountNum;
    }


    /**
     * Gets the customerName value for this SafetechFraudAnalysisResponse.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this SafetechFraudAnalysisResponse.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the customerRefNum value for this SafetechFraudAnalysisResponse.
     * 
     * @return customerRefNum
     */
    public java.lang.String getCustomerRefNum() {
        return customerRefNum;
    }


    /**
     * Sets the customerRefNum value for this SafetechFraudAnalysisResponse.
     * 
     * @param customerRefNum
     */
    public void setCustomerRefNum(java.lang.String customerRefNum) {
        this.customerRefNum = customerRefNum;
    }


    /**
     * Gets the fraudAnalysisResponse value for this SafetechFraudAnalysisResponse.
     * 
     * @return fraudAnalysisResponse
     */
    public com.budgetprepay.www.Paymentech.FraudAnalysisResponse getFraudAnalysisResponse() {
        return fraudAnalysisResponse;
    }


    /**
     * Sets the fraudAnalysisResponse value for this SafetechFraudAnalysisResponse.
     * 
     * @param fraudAnalysisResponse
     */
    public void setFraudAnalysisResponse(com.budgetprepay.www.Paymentech.FraudAnalysisResponse fraudAnalysisResponse) {
        this.fraudAnalysisResponse = fraudAnalysisResponse;
    }


    /**
     * Gets the hostRespCode value for this SafetechFraudAnalysisResponse.
     * 
     * @return hostRespCode
     */
    public java.lang.String getHostRespCode() {
        return hostRespCode;
    }


    /**
     * Sets the hostRespCode value for this SafetechFraudAnalysisResponse.
     * 
     * @param hostRespCode
     */
    public void setHostRespCode(java.lang.String hostRespCode) {
        this.hostRespCode = hostRespCode;
    }


    /**
     * Gets the industryType value for this SafetechFraudAnalysisResponse.
     * 
     * @return industryType
     */
    public java.lang.String getIndustryType() {
        return industryType;
    }


    /**
     * Sets the industryType value for this SafetechFraudAnalysisResponse.
     * 
     * @param industryType
     */
    public void setIndustryType(java.lang.String industryType) {
        this.industryType = industryType;
    }


    /**
     * Gets the lastRetryDate value for this SafetechFraudAnalysisResponse.
     * 
     * @return lastRetryDate
     */
    public java.lang.String getLastRetryDate() {
        return lastRetryDate;
    }


    /**
     * Sets the lastRetryDate value for this SafetechFraudAnalysisResponse.
     * 
     * @param lastRetryDate
     */
    public void setLastRetryDate(java.lang.String lastRetryDate) {
        this.lastRetryDate = lastRetryDate;
    }


    /**
     * Gets the merchantID value for this SafetechFraudAnalysisResponse.
     * 
     * @return merchantID
     */
    public java.lang.String getMerchantID() {
        return merchantID;
    }


    /**
     * Sets the merchantID value for this SafetechFraudAnalysisResponse.
     * 
     * @param merchantID
     */
    public void setMerchantID(java.lang.String merchantID) {
        this.merchantID = merchantID;
    }


    /**
     * Gets the orderID value for this SafetechFraudAnalysisResponse.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this SafetechFraudAnalysisResponse.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the procStatus value for this SafetechFraudAnalysisResponse.
     * 
     * @return procStatus
     */
    public java.lang.String getProcStatus() {
        return procStatus;
    }


    /**
     * Sets the procStatus value for this SafetechFraudAnalysisResponse.
     * 
     * @param procStatus
     */
    public void setProcStatus(java.lang.String procStatus) {
        this.procStatus = procStatus;
    }


    /**
     * Gets the procStatusMessage value for this SafetechFraudAnalysisResponse.
     * 
     * @return procStatusMessage
     */
    public java.lang.String getProcStatusMessage() {
        return procStatusMessage;
    }


    /**
     * Sets the procStatusMessage value for this SafetechFraudAnalysisResponse.
     * 
     * @param procStatusMessage
     */
    public void setProcStatusMessage(java.lang.String procStatusMessage) {
        this.procStatusMessage = procStatusMessage;
    }


    /**
     * Gets the profileProcStatus value for this SafetechFraudAnalysisResponse.
     * 
     * @return profileProcStatus
     */
    public java.lang.String getProfileProcStatus() {
        return profileProcStatus;
    }


    /**
     * Sets the profileProcStatus value for this SafetechFraudAnalysisResponse.
     * 
     * @param profileProcStatus
     */
    public void setProfileProcStatus(java.lang.String profileProcStatus) {
        this.profileProcStatus = profileProcStatus;
    }


    /**
     * Gets the profileProcStatusMsg value for this SafetechFraudAnalysisResponse.
     * 
     * @return profileProcStatusMsg
     */
    public java.lang.String getProfileProcStatusMsg() {
        return profileProcStatusMsg;
    }


    /**
     * Sets the profileProcStatusMsg value for this SafetechFraudAnalysisResponse.
     * 
     * @param profileProcStatusMsg
     */
    public void setProfileProcStatusMsg(java.lang.String profileProcStatusMsg) {
        this.profileProcStatusMsg = profileProcStatusMsg;
    }


    /**
     * Gets the respCode value for this SafetechFraudAnalysisResponse.
     * 
     * @return respCode
     */
    public java.lang.String getRespCode() {
        return respCode;
    }


    /**
     * Sets the respCode value for this SafetechFraudAnalysisResponse.
     * 
     * @param respCode
     */
    public void setRespCode(java.lang.String respCode) {
        this.respCode = respCode;
    }


    /**
     * Gets the respCodeMessage value for this SafetechFraudAnalysisResponse.
     * 
     * @return respCodeMessage
     */
    public java.lang.String getRespCodeMessage() {
        return respCodeMessage;
    }


    /**
     * Sets the respCodeMessage value for this SafetechFraudAnalysisResponse.
     * 
     * @param respCodeMessage
     */
    public void setRespCodeMessage(java.lang.String respCodeMessage) {
        this.respCodeMessage = respCodeMessage;
    }


    /**
     * Gets the respDateTime value for this SafetechFraudAnalysisResponse.
     * 
     * @return respDateTime
     */
    public java.lang.String getRespDateTime() {
        return respDateTime;
    }


    /**
     * Sets the respDateTime value for this SafetechFraudAnalysisResponse.
     * 
     * @param respDateTime
     */
    public void setRespDateTime(java.lang.String respDateTime) {
        this.respDateTime = respDateTime;
    }


    /**
     * Gets the retryAttempCount value for this SafetechFraudAnalysisResponse.
     * 
     * @return retryAttempCount
     */
    public java.lang.String getRetryAttempCount() {
        return retryAttempCount;
    }


    /**
     * Sets the retryAttempCount value for this SafetechFraudAnalysisResponse.
     * 
     * @param retryAttempCount
     */
    public void setRetryAttempCount(java.lang.String retryAttempCount) {
        this.retryAttempCount = retryAttempCount;
    }


    /**
     * Gets the retryTrace value for this SafetechFraudAnalysisResponse.
     * 
     * @return retryTrace
     */
    public java.lang.String getRetryTrace() {
        return retryTrace;
    }


    /**
     * Sets the retryTrace value for this SafetechFraudAnalysisResponse.
     * 
     * @param retryTrace
     */
    public void setRetryTrace(java.lang.String retryTrace) {
        this.retryTrace = retryTrace;
    }


    /**
     * Gets the terminalID value for this SafetechFraudAnalysisResponse.
     * 
     * @return terminalID
     */
    public java.lang.String getTerminalID() {
        return terminalID;
    }


    /**
     * Sets the terminalID value for this SafetechFraudAnalysisResponse.
     * 
     * @param terminalID
     */
    public void setTerminalID(java.lang.String terminalID) {
        this.terminalID = terminalID;
    }


    /**
     * Gets the txRefNum value for this SafetechFraudAnalysisResponse.
     * 
     * @return txRefNum
     */
    public java.lang.String getTxRefNum() {
        return txRefNum;
    }


    /**
     * Sets the txRefNum value for this SafetechFraudAnalysisResponse.
     * 
     * @param txRefNum
     */
    public void setTxRefNum(java.lang.String txRefNum) {
        this.txRefNum = txRefNum;
    }


    /**
     * Gets the version value for this SafetechFraudAnalysisResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SafetechFraudAnalysisResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SafetechFraudAnalysisResponse)) return false;
        SafetechFraudAnalysisResponse other = (SafetechFraudAnalysisResponse) obj;
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
            ((this.cardBrand==null && other.getCardBrand()==null) || 
             (this.cardBrand!=null &&
              this.cardBrand.equals(other.getCardBrand()))) &&
            ((this.ccAccountNum==null && other.getCcAccountNum()==null) || 
             (this.ccAccountNum!=null &&
              this.ccAccountNum.equals(other.getCcAccountNum()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.customerRefNum==null && other.getCustomerRefNum()==null) || 
             (this.customerRefNum!=null &&
              this.customerRefNum.equals(other.getCustomerRefNum()))) &&
            ((this.fraudAnalysisResponse==null && other.getFraudAnalysisResponse()==null) || 
             (this.fraudAnalysisResponse!=null &&
              this.fraudAnalysisResponse.equals(other.getFraudAnalysisResponse()))) &&
            ((this.hostRespCode==null && other.getHostRespCode()==null) || 
             (this.hostRespCode!=null &&
              this.hostRespCode.equals(other.getHostRespCode()))) &&
            ((this.industryType==null && other.getIndustryType()==null) || 
             (this.industryType!=null &&
              this.industryType.equals(other.getIndustryType()))) &&
            ((this.lastRetryDate==null && other.getLastRetryDate()==null) || 
             (this.lastRetryDate!=null &&
              this.lastRetryDate.equals(other.getLastRetryDate()))) &&
            ((this.merchantID==null && other.getMerchantID()==null) || 
             (this.merchantID!=null &&
              this.merchantID.equals(other.getMerchantID()))) &&
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.procStatus==null && other.getProcStatus()==null) || 
             (this.procStatus!=null &&
              this.procStatus.equals(other.getProcStatus()))) &&
            ((this.procStatusMessage==null && other.getProcStatusMessage()==null) || 
             (this.procStatusMessage!=null &&
              this.procStatusMessage.equals(other.getProcStatusMessage()))) &&
            ((this.profileProcStatus==null && other.getProfileProcStatus()==null) || 
             (this.profileProcStatus!=null &&
              this.profileProcStatus.equals(other.getProfileProcStatus()))) &&
            ((this.profileProcStatusMsg==null && other.getProfileProcStatusMsg()==null) || 
             (this.profileProcStatusMsg!=null &&
              this.profileProcStatusMsg.equals(other.getProfileProcStatusMsg()))) &&
            ((this.respCode==null && other.getRespCode()==null) || 
             (this.respCode!=null &&
              this.respCode.equals(other.getRespCode()))) &&
            ((this.respCodeMessage==null && other.getRespCodeMessage()==null) || 
             (this.respCodeMessage!=null &&
              this.respCodeMessage.equals(other.getRespCodeMessage()))) &&
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
        if (getCardBrand() != null) {
            _hashCode += getCardBrand().hashCode();
        }
        if (getCcAccountNum() != null) {
            _hashCode += getCcAccountNum().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getCustomerRefNum() != null) {
            _hashCode += getCustomerRefNum().hashCode();
        }
        if (getFraudAnalysisResponse() != null) {
            _hashCode += getFraudAnalysisResponse().hashCode();
        }
        if (getHostRespCode() != null) {
            _hashCode += getHostRespCode().hashCode();
        }
        if (getIndustryType() != null) {
            _hashCode += getIndustryType().hashCode();
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
        if (getProcStatus() != null) {
            _hashCode += getProcStatus().hashCode();
        }
        if (getProcStatusMessage() != null) {
            _hashCode += getProcStatusMessage().hashCode();
        }
        if (getProfileProcStatus() != null) {
            _hashCode += getProfileProcStatus().hashCode();
        }
        if (getProfileProcStatusMsg() != null) {
            _hashCode += getProfileProcStatusMsg().hashCode();
        }
        if (getRespCode() != null) {
            _hashCode += getRespCode().hashCode();
        }
        if (getRespCodeMessage() != null) {
            _hashCode += getRespCodeMessage().hashCode();
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
        new org.apache.axis.description.TypeDesc(SafetechFraudAnalysisResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "SafetechFraudAnalysisResponse"));
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
        elemField.setFieldName("cardBrand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "cardBrand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccAccountNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ccAccountNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudAnalysisResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "fraudAnalysisResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "fraudAnalysisResponse"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostRespCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "hostRespCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "industryType"));
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
        elemField.setFieldName("profileProcStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "profileProcStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileProcStatusMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "profileProcStatusMsg"));
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
        elemField.setFieldName("respCodeMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "respCodeMessage"));
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
