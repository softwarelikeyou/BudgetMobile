/**
 * ProfileRetrievalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.budgetprepay.www.Paymentech;

public class ProfileRetrievalResponse  implements java.io.Serializable {
    private com.budgetprepay.www.Paymentech.ProfileResponse profileResponse;

    public ProfileRetrievalResponse() {
    }

    public ProfileRetrievalResponse(
           com.budgetprepay.www.Paymentech.ProfileResponse profileResponse) {
           this.profileResponse = profileResponse;
    }


    /**
     * Gets the profileResponse value for this ProfileRetrievalResponse.
     * 
     * @return profileResponse
     */
    public com.budgetprepay.www.Paymentech.ProfileResponse getProfileResponse() {
        return profileResponse;
    }


    /**
     * Sets the profileResponse value for this ProfileRetrievalResponse.
     * 
     * @param profileResponse
     */
    public void setProfileResponse(com.budgetprepay.www.Paymentech.ProfileResponse profileResponse) {
        this.profileResponse = profileResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileRetrievalResponse)) return false;
        ProfileRetrievalResponse other = (ProfileRetrievalResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profileResponse==null && other.getProfileResponse()==null) || 
             (this.profileResponse!=null &&
              this.profileResponse.equals(other.getProfileResponse())));
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
        if (getProfileResponse() != null) {
            _hashCode += getProfileResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfileRetrievalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileRetrievalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "profileResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.budgetprepay.com/Paymentech", "ProfileResponse"));
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
