/**
 * Address_Standardize.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetmobile.lifeline;

public class Address_Standardize  extends com.budgetmobile.lifeline.ResponseMsg  implements java.io.Serializable {
    private java.lang.String validated_Address1;

    private java.lang.String validated_Address2;

    private java.lang.String validated_City;

    private java.lang.String validated_State;

    private java.lang.String validated_Zip;

    private java.lang.String validated_AddressId;

    private java.lang.String DPV_Code;

    private java.lang.String DPV_Desc;

    private boolean isValidated;

    public Address_Standardize() {
    }

    public Address_Standardize(
           com.budgetmobile.lifeline.Errors errors,
           boolean isError,
           java.lang.String validated_Address1,
           java.lang.String validated_Address2,
           java.lang.String validated_City,
           java.lang.String validated_State,
           java.lang.String validated_Zip,
           java.lang.String validated_AddressId,
           java.lang.String DPV_Code,
           java.lang.String DPV_Desc,
           boolean isValidated) {
        super(
            errors,
            isError);
        this.validated_Address1 = validated_Address1;
        this.validated_Address2 = validated_Address2;
        this.validated_City = validated_City;
        this.validated_State = validated_State;
        this.validated_Zip = validated_Zip;
        this.validated_AddressId = validated_AddressId;
        this.DPV_Code = DPV_Code;
        this.DPV_Desc = DPV_Desc;
        this.isValidated = isValidated;
    }


    /**
     * Gets the validated_Address1 value for this Address_Standardize.
     * 
     * @return validated_Address1
     */
    public java.lang.String getValidated_Address1() {
        return validated_Address1;
    }


    /**
     * Sets the validated_Address1 value for this Address_Standardize.
     * 
     * @param validated_Address1
     */
    public void setValidated_Address1(java.lang.String validated_Address1) {
        this.validated_Address1 = validated_Address1;
    }


    /**
     * Gets the validated_Address2 value for this Address_Standardize.
     * 
     * @return validated_Address2
     */
    public java.lang.String getValidated_Address2() {
        return validated_Address2;
    }


    /**
     * Sets the validated_Address2 value for this Address_Standardize.
     * 
     * @param validated_Address2
     */
    public void setValidated_Address2(java.lang.String validated_Address2) {
        this.validated_Address2 = validated_Address2;
    }


    /**
     * Gets the validated_City value for this Address_Standardize.
     * 
     * @return validated_City
     */
    public java.lang.String getValidated_City() {
        return validated_City;
    }


    /**
     * Sets the validated_City value for this Address_Standardize.
     * 
     * @param validated_City
     */
    public void setValidated_City(java.lang.String validated_City) {
        this.validated_City = validated_City;
    }


    /**
     * Gets the validated_State value for this Address_Standardize.
     * 
     * @return validated_State
     */
    public java.lang.String getValidated_State() {
        return validated_State;
    }


    /**
     * Sets the validated_State value for this Address_Standardize.
     * 
     * @param validated_State
     */
    public void setValidated_State(java.lang.String validated_State) {
        this.validated_State = validated_State;
    }


    /**
     * Gets the validated_Zip value for this Address_Standardize.
     * 
     * @return validated_Zip
     */
    public java.lang.String getValidated_Zip() {
        return validated_Zip;
    }


    /**
     * Sets the validated_Zip value for this Address_Standardize.
     * 
     * @param validated_Zip
     */
    public void setValidated_Zip(java.lang.String validated_Zip) {
        this.validated_Zip = validated_Zip;
    }


    /**
     * Gets the validated_AddressId value for this Address_Standardize.
     * 
     * @return validated_AddressId
     */
    public java.lang.String getValidated_AddressId() {
        return validated_AddressId;
    }


    /**
     * Sets the validated_AddressId value for this Address_Standardize.
     * 
     * @param validated_AddressId
     */
    public void setValidated_AddressId(java.lang.String validated_AddressId) {
        this.validated_AddressId = validated_AddressId;
    }


    /**
     * Gets the DPV_Code value for this Address_Standardize.
     * 
     * @return DPV_Code
     */
    public java.lang.String getDPV_Code() {
        return DPV_Code;
    }


    /**
     * Sets the DPV_Code value for this Address_Standardize.
     * 
     * @param DPV_Code
     */
    public void setDPV_Code(java.lang.String DPV_Code) {
        this.DPV_Code = DPV_Code;
    }


    /**
     * Gets the DPV_Desc value for this Address_Standardize.
     * 
     * @return DPV_Desc
     */
    public java.lang.String getDPV_Desc() {
        return DPV_Desc;
    }


    /**
     * Sets the DPV_Desc value for this Address_Standardize.
     * 
     * @param DPV_Desc
     */
    public void setDPV_Desc(java.lang.String DPV_Desc) {
        this.DPV_Desc = DPV_Desc;
    }


    /**
     * Gets the isValidated value for this Address_Standardize.
     * 
     * @return isValidated
     */
    public boolean isIsValidated() {
        return isValidated;
    }


    /**
     * Sets the isValidated value for this Address_Standardize.
     * 
     * @param isValidated
     */
    public void setIsValidated(boolean isValidated) {
        this.isValidated = isValidated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Address_Standardize)) return false;
        Address_Standardize other = (Address_Standardize) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.validated_Address1==null && other.getValidated_Address1()==null) || 
             (this.validated_Address1!=null &&
              this.validated_Address1.equals(other.getValidated_Address1()))) &&
            ((this.validated_Address2==null && other.getValidated_Address2()==null) || 
             (this.validated_Address2!=null &&
              this.validated_Address2.equals(other.getValidated_Address2()))) &&
            ((this.validated_City==null && other.getValidated_City()==null) || 
             (this.validated_City!=null &&
              this.validated_City.equals(other.getValidated_City()))) &&
            ((this.validated_State==null && other.getValidated_State()==null) || 
             (this.validated_State!=null &&
              this.validated_State.equals(other.getValidated_State()))) &&
            ((this.validated_Zip==null && other.getValidated_Zip()==null) || 
             (this.validated_Zip!=null &&
              this.validated_Zip.equals(other.getValidated_Zip()))) &&
            ((this.validated_AddressId==null && other.getValidated_AddressId()==null) || 
             (this.validated_AddressId!=null &&
              this.validated_AddressId.equals(other.getValidated_AddressId()))) &&
            ((this.DPV_Code==null && other.getDPV_Code()==null) || 
             (this.DPV_Code!=null &&
              this.DPV_Code.equals(other.getDPV_Code()))) &&
            ((this.DPV_Desc==null && other.getDPV_Desc()==null) || 
             (this.DPV_Desc!=null &&
              this.DPV_Desc.equals(other.getDPV_Desc()))) &&
            this.isValidated == other.isIsValidated();
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
        if (getValidated_Address1() != null) {
            _hashCode += getValidated_Address1().hashCode();
        }
        if (getValidated_Address2() != null) {
            _hashCode += getValidated_Address2().hashCode();
        }
        if (getValidated_City() != null) {
            _hashCode += getValidated_City().hashCode();
        }
        if (getValidated_State() != null) {
            _hashCode += getValidated_State().hashCode();
        }
        if (getValidated_Zip() != null) {
            _hashCode += getValidated_Zip().hashCode();
        }
        if (getValidated_AddressId() != null) {
            _hashCode += getValidated_AddressId().hashCode();
        }
        if (getDPV_Code() != null) {
            _hashCode += getDPV_Code().hashCode();
        }
        if (getDPV_Desc() != null) {
            _hashCode += getDPV_Desc().hashCode();
        }
        _hashCode += (isIsValidated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Address_Standardize.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Address_Standardize"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validated_Address1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Validated_Address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validated_Address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Validated_Address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validated_City");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Validated_City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validated_State");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Validated_State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validated_Zip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Validated_Zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validated_AddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Validated_AddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPV_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DPV_Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPV_Desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DPV_Desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isValidated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IsValidated"));
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
