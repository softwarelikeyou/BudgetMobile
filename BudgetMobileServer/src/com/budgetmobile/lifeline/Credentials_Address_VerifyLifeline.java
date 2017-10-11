/**
 * Credentials_Address_VerifyLifeline.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Credentials_Address_VerifyLifeline  extends com.budgetmobile.lifeline.ClientInput  implements java.io.Serializable {
    private java.lang.String address;

    private java.lang.String address2;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zip;

    private boolean HOHC;

    private boolean lifeline;

    private int budgetMobileID;

    private boolean byPassDuplicate;

    public Credentials_Address_VerifyLifeline() {
    }

    public Credentials_Address_VerifyLifeline(
           java.lang.String applicationID,
           java.lang.String applicationPassword,
           int locationID,
           java.lang.String employeeName,
           java.lang.String address,
           java.lang.String address2,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zip,
           boolean HOHC,
           boolean lifeline,
           int budgetMobileID,
           boolean byPassDuplicate) {
        super(
            applicationID,
            applicationPassword,
            locationID,
            employeeName);
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.HOHC = HOHC;
        this.lifeline = lifeline;
        this.budgetMobileID = budgetMobileID;
        this.byPassDuplicate = byPassDuplicate;
    }


    /**
     * Gets the address value for this Credentials_Address_VerifyLifeline.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Credentials_Address_VerifyLifeline.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the address2 value for this Credentials_Address_VerifyLifeline.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this Credentials_Address_VerifyLifeline.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this Credentials_Address_VerifyLifeline.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Credentials_Address_VerifyLifeline.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this Credentials_Address_VerifyLifeline.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Credentials_Address_VerifyLifeline.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this Credentials_Address_VerifyLifeline.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this Credentials_Address_VerifyLifeline.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the HOHC value for this Credentials_Address_VerifyLifeline.
     * 
     * @return HOHC
     */
    public boolean isHOHC() {
        return HOHC;
    }


    /**
     * Sets the HOHC value for this Credentials_Address_VerifyLifeline.
     * 
     * @param HOHC
     */
    public void setHOHC(boolean HOHC) {
        this.HOHC = HOHC;
    }


    /**
     * Gets the lifeline value for this Credentials_Address_VerifyLifeline.
     * 
     * @return lifeline
     */
    public boolean isLifeline() {
        return lifeline;
    }


    /**
     * Sets the lifeline value for this Credentials_Address_VerifyLifeline.
     * 
     * @param lifeline
     */
    public void setLifeline(boolean lifeline) {
        this.lifeline = lifeline;
    }


    /**
     * Gets the budgetMobileID value for this Credentials_Address_VerifyLifeline.
     * 
     * @return budgetMobileID
     */
    public int getBudgetMobileID() {
        return budgetMobileID;
    }


    /**
     * Sets the budgetMobileID value for this Credentials_Address_VerifyLifeline.
     * 
     * @param budgetMobileID
     */
    public void setBudgetMobileID(int budgetMobileID) {
        this.budgetMobileID = budgetMobileID;
    }


    /**
     * Gets the byPassDuplicate value for this Credentials_Address_VerifyLifeline.
     * 
     * @return byPassDuplicate
     */
    public boolean isByPassDuplicate() {
        return byPassDuplicate;
    }


    /**
     * Sets the byPassDuplicate value for this Credentials_Address_VerifyLifeline.
     * 
     * @param byPassDuplicate
     */
    public void setByPassDuplicate(boolean byPassDuplicate) {
        this.byPassDuplicate = byPassDuplicate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Credentials_Address_VerifyLifeline)) return false;
        Credentials_Address_VerifyLifeline other = (Credentials_Address_VerifyLifeline) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            this.HOHC == other.isHOHC() &&
            this.lifeline == other.isLifeline() &&
            this.budgetMobileID == other.getBudgetMobileID() &&
            this.byPassDuplicate == other.isByPassDuplicate();
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        _hashCode += (isHOHC() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLifeline() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getBudgetMobileID();
        _hashCode += (isByPassDuplicate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credentials_Address_VerifyLifeline.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Credentials_Address_VerifyLifeline"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HOHC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HOHC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Lifeline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetMobileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BudgetMobileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byPassDuplicate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ByPassDuplicate"));
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
