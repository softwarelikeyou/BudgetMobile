//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 06:47:32 PM CST 
//


package com.budgetprepay.verizon.rss.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resellerRemoveHotlineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resellerRemoveHotlineType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verizonwireless.com/oas}resellerSubOrderBaseType">
 *       &lt;sequence>
 *         &lt;element name="min" type="{http://www.verizonwireless.com/oas}minType" minOccurs="0"/>
 *         &lt;element name="mdn" type="{http://www.verizonwireless.com/oas}mdnType"/>
 *         &lt;element name="esn" type="{http://www.verizonwireless.com/oas}esnType" minOccurs="0"/>
 *         &lt;element name="meid" type="{http://www.verizonwireless.com/oas}meidType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resellerRemoveHotlineType", propOrder = {
    "min",
    "mdn",
    "esn",
    "meid"
})
public class ResellerRemoveHotlineType
    extends ResellerSubOrderBaseType
{

    protected String min;
    @XmlElement(required = true)
    protected MdnType mdn;
    protected String esn;
    protected String meid;

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMin(String value) {
        this.min = value;
    }

    /**
     * Gets the value of the mdn property.
     * 
     * @return
     *     possible object is
     *     {@link MdnType }
     *     
     */
    public MdnType getMdn() {
        return mdn;
    }

    /**
     * Sets the value of the mdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MdnType }
     *     
     */
    public void setMdn(MdnType value) {
        this.mdn = value;
    }

    /**
     * Gets the value of the esn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsn() {
        return esn;
    }

    /**
     * Sets the value of the esn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsn(String value) {
        this.esn = value;
    }

    /**
     * Gets the value of the meid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeid() {
        return meid;
    }

    /**
     * Sets the value of the meid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeid(String value) {
        this.meid = value;
    }

}
