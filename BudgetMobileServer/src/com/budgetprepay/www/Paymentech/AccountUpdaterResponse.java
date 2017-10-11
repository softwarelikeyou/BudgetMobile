/**
 * AccountUpdaterResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class AccountUpdaterResponse  implements java.io.Serializable {
    private com.budgetprepay.www.Paymentech.ErrorMessage errorMessage;

    private java.lang.String bin;

    private java.lang.String customerProfileAction;

    private java.lang.String customerRefNum;

    private java.lang.String merchantID;

    private java.lang.String procStatus;

    private java.lang.String procStatusMessage;

    private java.lang.String respDateTime;

    private java.lang.String scheduledDate;

    private java.lang.String status;

    private java.lang.String version;

    public AccountUpdaterResponse() {
    }

    public AccountUpdaterResponse(
           com.budgetprepay.www.Paymentech.ErrorMessage errorMessage,
           java.lang.String bin,
           java.lang.String customerProfileAction,
           java.lang.String customerRefNum,
           java.lang.String merchantID,
           java.lang.String procStatus,
           java.lang.String procStatusMessage,
           java.lang.String respDateTime,
           java.lang.String scheduledDate,
           java.lang.String status,
           java.lang.String version) {
           this.errorMessage = errorMessage;
           this.bin = bin;
           this.customerProfileAction = customerProfileAction;
           this.customerRefNum = customerRefNum;
           this.merchantID = merchantID;
           this.procStatus = procStatus;
           this.procStatusMessage = procStatusMessage;
           this.respDateTime = respDateTime;
           this.scheduledDate = scheduledDate;
           this.status = status;
           this.version = version;
    }


    /**
     * Gets the errorMessage value for this AccountUpdaterResponse.
     * 
     * @return errorMessage
     */
    public com.budgetprepay.www.Paymentech.ErrorMessage getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this AccountUpdaterResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(com.budgetprepay.www.Paymentech.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the bin value for this AccountUpdaterResponse.
     * 
     * @return bin
     */
    public java.lang.String getBin() {
        return bin;
    }


    /**
     * Sets the bin value for this AccountUpdaterResponse.
     * 
     * @param bin
     */
    public void setBin(java.lang.String bin) {
        this.bin = bin;
    }


    /**
     * Gets the customerProfileAction value for this AccountUpdaterResponse.
     * 
     * @return customerProfileAction
     */
    public java.lang.String getCustomerProfileAction() {
        return customerProfileAction;
    }


    /**
     * Sets the customerProfileAction value for this AccountUpdaterResponse.
     * 
     * @param customerProfileAction
     */
    public void setCustomerProfileAction(java.lang.String customerProfileAction) {
        this.customerProfileAction = customerProfileAction;
    }


    /**
     * Gets the customerRefNum value for this AccountUpdaterResponse.
     * 
     * @return customerRefNum
     */
    public java.lang.String getCustomerRefNum() {
        return customerRefNum;
    }


    /**
     * Sets the customerRefNum value for this AccountUpdaterResponse.
     * 
     * @param customerRefNum
     */
    public void setCustomerRefNum(java.lang.String customerRefNum) {
        this.customerRefNum = customerRefNum;
    }


    /**
     * Gets the merchantID value for this AccountUpdaterResponse.
     * 
     * @return merchantID
     */
    public java.lang.String getMerchantID() {
        return merchantID;
    }


    /**
     * Sets the merchantID value for this AccountUpdaterResponse.
     * 
     * @param merchantID
     */
    public void setMerchantID(java.lang.String merchantID) {
        this.merchantID = merchantID;
    }


    /**
     * Gets the procStatus value for this AccountUpdaterResponse.
     * 
     * @return procStatus
     */
    public java.lang.String getProcStatus() {
        return procStatus;
    }


    /**
     * Sets the procStatus value for this AccountUpdaterResponse.
     * 
     * @param procStatus
     */
    public void setProcStatus(java.lang.String procStatus) {
        this.procStatus = procStatus;
    }


    /**
     * Gets the procStatusMessage value for this AccountUpdaterResponse.
     * 
     * @return procStatusMessage
     */
    public java.lang.String getProcStatusMessage() {
        return procStatusMessage;
    }


    /**
     * Sets the procStatusMessage value for this AccountUpdaterResponse.
     * 
     * @param procStatusMessage
     */
    public void setProcStatusMessage(java.lang.String procStatusMessage) {
        this.procStatusMessage = procStatusMessage;
    }


    /**
     * Gets the respDateTime value for this AccountUpdaterResponse.
     * 
     * @return respDateTime
     */
    public java.lang.String getRespDateTime() {
        return respDateTime;
    }


    /**
     * Sets the respDateTime value for this AccountUpdaterResponse.
     * 
     * @param respDateTime
     */
    public void setRespDateTime(java.lang.String respDateTime) {
        this.respDateTime = respDateTime;
    }


    /**
     * Gets the scheduledDate value for this AccountUpdaterResponse.
     * 
     * @return scheduledDate
     */
    public java.lang.String getScheduledDate() {
        return scheduledDate;
    }


    /**
     * Sets the scheduledDate value for this AccountUpdaterResponse.
     * 
     * @param scheduledDate
     */
    public void setScheduledDate(java.lang.String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }


    /**
     * Gets the status value for this AccountUpdaterResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AccountUpdaterResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the version value for this AccountUpdaterResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AccountUpdaterResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountUpdaterResponse)) return false;
        AccountUpdaterResponse other = (AccountUpdaterResponse) obj;
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
            ((this.bin==null && other.getBin()==null) || 
             (this.bin!=null &&
              this.bin.equals(other.getBin()))) &&
            ((this.customerProfileAction==null && other.getCustomerProfileAction()==null) || 
             (this.customerProfileAction!=null &&
              this.customerProfileAction.equals(other.getCustomerProfileAction()))) &&
            ((this.customerRefNum==null && other.getCustomerRefNum()==null) || 
             (this.customerRefNum!=null &&
              this.customerRefNum.equals(other.getCustomerRefNum()))) &&
            ((this.merchantID==null && other.getMerchantID()==null) || 
             (this.merchantID!=null &&
              this.merchantID.equals(other.getMerchantID()))) &&
            ((this.procStatus==null && other.getProcStatus()==null) || 
             (this.procStatus!=null &&
              this.procStatus.equals(other.getProcStatus()))) &&
            ((this.procStatusMessage==null && other.getProcStatusMessage()==null) || 
             (this.procStatusMessage!=null &&
              this.procStatusMessage.equals(other.getProcStatusMessage()))) &&
            ((this.respDateTime==null && other.getRespDateTime()==null) || 
             (this.respDateTime!=null &&
              this.respDateTime.equals(other.getRespDateTime()))) &&
            ((this.scheduledDate==null && other.getScheduledDate()==null) || 
             (this.scheduledDate!=null &&
              this.scheduledDate.equals(other.getScheduledDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
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
        if (getBin() != null) {
            _hashCode += getBin().hashCode();
        }
        if (getCustomerProfileAction() != null) {
            _hashCode += getCustomerProfileAction().hashCode();
        }
        if (getCustomerRefNum() != null) {
            _hashCode += getCustomerRefNum().hashCode();
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
        if (getRespDateTime() != null) {
            _hashCode += getRespDateTime().hashCode();
        }
        if (getScheduledDate() != null) {
            _hashCode += getScheduledDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountUpdaterResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "AccountUpdaterResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "errorMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "bin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerProfileAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "customerProfileAction"));
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
        elemField.setFieldName("respDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "respDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "scheduledDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "status"));
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
