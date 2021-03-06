//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:13:08 PM CDT 
//


package com.budgetprepay.webservice.client.verizon.rss.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resellerSubOrderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resellerSubOrderBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subReferenceNumber" type="{http://www.verizonwireless.com/oas}subReferenceNumberType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="systemData" type="{http://www.verizonwireless.com/oas}systemDataType" minOccurs="0"/>
 *           &lt;element name="serviceZipCode" type="{http://www.verizonwireless.com/oas}zipCodeType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resellerSubOrderBaseType", propOrder = {
    "subReferenceNumber",
    "systemData",
    "serviceZipCode"
})
@XmlSeeAlso({
    ResellerFUSFExemptUpdateType.class,
    ResellerAddSubscriberByESNType.class,
    ResellerChangeESNType.class,
    ResellerPortInInquiryType.class,
    ResellerSuspendSubscriberType.class,
    ResellerLineInquiryType.class,
    UpdatePortInType.class,
    ResellerHBQualificationInfoType.class,
    ResellerHotlineSubscriberType.class,
    ResellerRestoreSubscriberType.class,
    ResellerPRLInquiryType.class,
    ValidateDeviceType.class,
    ResellerChangeSIMType.class,
    ResellerReserveMDNType.class,
    ResellerResetFeatureType.class,
    ResellerChangeNumberType.class,
    ResellerAddHotlineSubscriberType.class,
    ResellerSubscribeFeatureType.class,
    ResellerAddHotlineSubscriberByESNType.class,
    ResellerAddSubscriberPortInType.class,
    ResellerValidateMDNPortabilityType.class,
    ResellerAddSubscriberType.class,
    ResellerRemoveHotlineType.class,
    ResellerChangeRatePlanType.class,
    ResellerDeleteSubscriberType.class,
    ValidateSIMType.class,
    ResellerDeviceInquiryType.class
})
public class ResellerSubOrderBaseType {

    protected SubReferenceNumberType subReferenceNumber;
    protected SystemDataType systemData;
    protected ZipCodeType serviceZipCode;

    /**
     * Gets the value of the subReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SubReferenceNumberType }
     *     
     */
    public SubReferenceNumberType getSubReferenceNumber() {
        return subReferenceNumber;
    }

    /**
     * Sets the value of the subReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubReferenceNumberType }
     *     
     */
    public void setSubReferenceNumber(SubReferenceNumberType value) {
        this.subReferenceNumber = value;
    }

    /**
     * Gets the value of the systemData property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDataType }
     *     
     */
    public SystemDataType getSystemData() {
        return systemData;
    }

    /**
     * Sets the value of the systemData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDataType }
     *     
     */
    public void setSystemData(SystemDataType value) {
        this.systemData = value;
    }

    /**
     * Gets the value of the serviceZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link ZipCodeType }
     *     
     */
    public ZipCodeType getServiceZipCode() {
        return serviceZipCode;
    }

    /**
     * Sets the value of the serviceZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipCodeType }
     *     
     */
    public void setServiceZipCode(ZipCodeType value) {
        this.serviceZipCode = value;
    }

}
