/**
 * Credentials_BudgetMobile_CompleteFulfillment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_BudgetMobile_CompleteFulfillment  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private int budgetMobileID;

    private java.lang.String deviceID;

    private java.lang.String intraUser;

    private java.lang.String MSID;

    private java.lang.String originalCSA;

    private int providerID;

    private java.lang.String IMSI;

    public Credentials_BudgetMobile_CompleteFulfillment() {
    }

    public Credentials_BudgetMobile_CompleteFulfillment(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           int budgetMobileID,
           java.lang.String deviceID,
           java.lang.String intraUser,
           java.lang.String MSID,
           java.lang.String originalCSA,
           int providerID,
           java.lang.String IMSI) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.budgetMobileID = budgetMobileID;
        this.deviceID = deviceID;
        this.intraUser = intraUser;
        this.MSID = MSID;
        this.originalCSA = originalCSA;
        this.providerID = providerID;
        this.IMSI = IMSI;
    }


    /**
     * Gets the budgetMobileID value for this Credentials_BudgetMobile_CompleteFulfillment.
     * 
     * @return budgetMobileID
     */
    public int getBudgetMobileID() {
        return budgetMobileID;
    }


    /**
     * Sets the budgetMobileID value for this Credentials_BudgetMobile_CompleteFulfillment.
     * 
     * @param budgetMobileID
     */
    public void setBudgetMobileID(int budgetMobileID) {
        this.budgetMobileID = budgetMobileID;
    }


    /**
     * Gets the deviceID value for this Credentials_BudgetMobile_CompleteFulfillment.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this Credentials_BudgetMobile_CompleteFulfillment.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the intraUser value for this Credentials_BudgetMobile_CompleteFulfillment.
     * 
     * @return intraUser
     */
    public java.lang.String getIntraUser() {
        return intraUser;
    }


    /**
     * Sets the intraUser value for this Credentials_BudgetMobile_CompleteFulfillment.
     * 
     * @param intraUser
     */
    public void setIntraUser(java.lang.String intraUser) {
        this.intraUser = intraUser;
    }


    /**
     * Gets the MSID value for this Credentials_BudgetMobile_CompleteFulfillment.
     * 
     * @return MSID
     */
    public java.lang.String getMSID() {
        return MSID;
    }


    /**
     * Sets the MSID value for this Credentials_BudgetMobile_CompleteFulfillment.
     * 
     * @param MSID
     */
    public void setMSID(java.lang.String MSID) {
        this.MSID = MSID;
    }


    /**
     * Gets the originalCSA value for this Credentials_BudgetMobile_CompleteFulfillment.
     * 
     * @return originalCSA
     */
    public java.lang.String getOriginalCSA() {
        return originalCSA;
    }


    /**
     * Sets the originalCSA value for this Credentials_BudgetMobile_CompleteFulfillment.
     * 
     * @param originalCSA
     */
    public void setOriginalCSA(java.lang.String originalCSA) {
        this.originalCSA = originalCSA;
    }


    /**
     * Gets the providerID value for this Credentials_BudgetMobile_CompleteFulfillment.
     * 
     * @return providerID
     */
    public int getProviderID() {
        return providerID;
    }


    /**
     * Sets the providerID value for this Credentials_BudgetMobile_CompleteFulfillment.
     * 
     * @param providerID
     */
    public void setProviderID(int providerID) {
        this.providerID = providerID;
    }


    /**
     * Gets the IMSI value for this Credentials_BudgetMobile_CompleteFulfillment.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this Credentials_BudgetMobile_CompleteFulfillment.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_BudgetMobile_CompleteFulfillment)) return false;
        Credentials_BudgetMobile_CompleteFulfillment other = (Credentials_BudgetMobile_CompleteFulfillment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.budgetMobileID == other.getBudgetMobileID() &&
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.intraUser==null && other.getIntraUser()==null) || 
             (this.intraUser!=null &&
              this.intraUser.equals(other.getIntraUser()))) &&
            ((this.MSID==null && other.getMSID()==null) || 
             (this.MSID!=null &&
              this.MSID.equals(other.getMSID()))) &&
            ((this.originalCSA==null && other.getOriginalCSA()==null) || 
             (this.originalCSA!=null &&
              this.originalCSA.equals(other.getOriginalCSA()))) &&
            this.providerID == other.getProviderID() &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI())));
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
        _hashCode += getBudgetMobileID();
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getIntraUser() != null) {
            _hashCode += getIntraUser().hashCode();
        }
        if (getMSID() != null) {
            _hashCode += getMSID().hashCode();
        }
        if (getOriginalCSA() != null) {
            _hashCode += getOriginalCSA().hashCode();
        }
        _hashCode += getProviderID();
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_BudgetMobile_CompleteFulfillment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_BudgetMobile_CompleteFulfillment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetMobileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BudgetMobileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intraUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IntraUser"));
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
        elemField.setFieldName("originalCSA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OriginalCSA"));
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
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IMSI"));
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
