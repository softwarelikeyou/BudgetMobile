//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:23:41 PM CDT 
//


package com.budgetprepay.webservice.pojos.verizon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Used by resellerAddSubscriberType. If an MDN is not supplied then the nextAvailableMDN must be supplied.
 *     If the npaNxx is not in the XML then the new MDN will be obtained using the oldMdn and the supplied zipCode.
 *     If the npaNxx and zipCode are not supplied then the new MDN will be obtained using the supplied state city and state.
 *     If the MDN is not supplied and none of these fields are supplied, then an exception will be returned to the reseller.
 *    
 * 
 * <p>Java class for nextAvailableMDNType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nextAvailableMDNType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="npaNXX" type="{http://www.budgetprepay.com/MVNO/Verizon}npaNxxType"/>
 *           &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="cityState" type="{http://www.budgetprepay.com/MVNO/Verizon}cityStateType"/>
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
@XmlType(name = "nextAvailableMDNType", propOrder = {
    "npaNXX",
    "zipCode",
    "cityState"
})
public class NextAvailableMDNType {

    protected String npaNXX;
    protected String zipCode;
    protected CityStateType cityState;

    /**
     * Gets the value of the npaNXX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpaNXX() {
        return npaNXX;
    }

    /**
     * Sets the value of the npaNXX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpaNXX(String value) {
        this.npaNXX = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the cityState property.
     * 
     * @return
     *     possible object is
     *     {@link CityStateType }
     *     
     */
    public CityStateType getCityState() {
        return cityState;
    }

    /**
     * Sets the value of the cityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityStateType }
     *     
     */
    public void setCityState(CityStateType value) {
        this.cityState = value;
    }

}
