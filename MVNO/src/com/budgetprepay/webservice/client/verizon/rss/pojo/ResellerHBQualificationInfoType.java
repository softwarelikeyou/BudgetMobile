//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:13:08 PM CDT 
//


package com.budgetprepay.webservice.client.verizon.rss.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resellerHBQualificationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resellerHBQualificationInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verizonwireless.com/oas}resellerSubOrderBaseType">
 *       &lt;sequence>
 *         &lt;element name="addressLine" type="{http://www.verizonwireless.com/oas}oasString120Type"/>
 *         &lt;element name="city" type="{http://www.verizonwireless.com/oas}oasString100Type"/>
 *         &lt;element name="state" type="{http://www.verizonwireless.com/oas}stateType"/>
 *         &lt;element name="zip" type="{http://www.verizonwireless.com/oas}zipCodeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resellerHBQualificationInfoType", propOrder = {
    "addressLine",
    "city",
    "state",
    "zip"
})
public class ResellerHBQualificationInfoType
    extends ResellerSubOrderBaseType
{

    @XmlElement(required = true)
    protected OasString120Type addressLine;
    @XmlElement(required = true)
    protected OasString100Type city;
    @XmlElement(required = true)
    protected StateType state;
    @XmlElement(required = true)
    protected ZipCodeType zip;

    /**
     * Gets the value of the addressLine property.
     * 
     * @return
     *     possible object is
     *     {@link OasString120Type }
     *     
     */
    public OasString120Type getAddressLine() {
        return addressLine;
    }

    /**
     * Sets the value of the addressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasString120Type }
     *     
     */
    public void setAddressLine(OasString120Type value) {
        this.addressLine = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link OasString100Type }
     *     
     */
    public OasString100Type getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasString100Type }
     *     
     */
    public void setCity(OasString100Type value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setState(StateType value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link ZipCodeType }
     *     
     */
    public ZipCodeType getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipCodeType }
     *     
     */
    public void setZip(ZipCodeType value) {
        this.zip = value;
    }

}
