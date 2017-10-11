//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:13:08 PM CDT 
//


package com.budgetprepay.webservice.client.verizon.rss.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Note: If an MDN is not supplied then nextAvailableMDN must be supplied.
 * 				In this case we will obtain the MDN from the Enterprise Number
 * 				Inventory pool
 * 				using the supplied fields in the nextAvailableMDNType.
 * 				MPNPoolName added in release 2040:
 * 				If the MPNPoolName tag is given in the xml, the feature element
 * 				for MPN static IP or MPN dynamic IP (MPNSIP or MPNDIP) should
 * 				be included in the features section.
 * 			
 * 
 * <p>Java class for resellerAddSubscriberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resellerAddSubscriberType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verizonwireless.com/oas}resellerSubOrderBaseType">
 *       &lt;sequence>
 *         &lt;element name="min" type="{http://www.verizonwireless.com/oas}minType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="mdn" type="{http://www.verizonwireless.com/oas}mdnType"/>
 *           &lt;element name="nextAvailableMDN" type="{http://www.verizonwireless.com/oas}nextAvailableMDNType"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="esn" type="{http://www.verizonwireless.com/oas}esnType"/>
 *           &lt;element name="meid" type="{http://www.verizonwireless.com/oas}meidType"/>
 *           &lt;sequence>
 *             &lt;element name="deviceId" type="{http://www.verizonwireless.com/oas}imeiType"/>
 *             &lt;element name="iccid" type="{http://www.verizonwireless.com/oas}SIMCardType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="autoMPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;sequence>
 *             &lt;element name="mobileIPAddress" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *             &lt;element name="MPNPoolName" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *             &lt;element name="SubOrgID" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="FUSFExemptFlag" type="{http://www.verizonwireless.com/oas}yesNoType" minOccurs="0"/>
 *         &lt;element name="globalSIMCard" type="{http://www.verizonwireless.com/oas}globalSIMCardType" minOccurs="0"/>
 *         &lt;element name="portInFlag" type="{http://www.verizonwireless.com/oas}yesNoType" minOccurs="0"/>
 *         &lt;element name="feature" type="{http://www.verizonwireless.com/oas}featureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plan" type="{http://www.verizonwireless.com/oas}planType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resellerAddSubscriberType", propOrder = {
    "min",
    "mdn",
    "nextAvailableMDN",
    "esn",
    "meid",
    "deviceId",
    "iccid",
    "autoMPN",
    "mobileIPAddress",
    "mpnPoolName",
    "subOrgID",
    "fusfExemptFlag",
    "globalSIMCard",
    "portInFlag",
    "feature",
    "plan"
})
public class ResellerAddSubscriberType
    extends ResellerSubOrderBaseType
{

    protected String min;
    protected MdnType mdn;
    protected NextAvailableMDNType nextAvailableMDN;
    protected String esn;
    protected String meid;
    protected String deviceId;
    protected String iccid;
    protected String autoMPN;
    protected OasStringType mobileIPAddress;
    @XmlElement(name = "MPNPoolName")
    protected OasStringType mpnPoolName;
    @XmlElement(name = "SubOrgID")
    protected OasStringType subOrgID;
    @XmlElement(name = "FUSFExemptFlag")
    protected YesNoType fusfExemptFlag;
    protected String globalSIMCard;
    protected YesNoType portInFlag;
    protected List<FeatureType> feature;
    @XmlElement(required = true)
    protected PlanType plan;

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
     * Gets the value of the nextAvailableMDN property.
     * 
     * @return
     *     possible object is
     *     {@link NextAvailableMDNType }
     *     
     */
    public NextAvailableMDNType getNextAvailableMDN() {
        return nextAvailableMDN;
    }

    /**
     * Sets the value of the nextAvailableMDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextAvailableMDNType }
     *     
     */
    public void setNextAvailableMDN(NextAvailableMDNType value) {
        this.nextAvailableMDN = value;
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

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the iccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * Sets the value of the iccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccid(String value) {
        this.iccid = value;
    }

    /**
     * Gets the value of the autoMPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoMPN() {
        return autoMPN;
    }

    /**
     * Sets the value of the autoMPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoMPN(String value) {
        this.autoMPN = value;
    }

    /**
     * Gets the value of the mobileIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getMobileIPAddress() {
        return mobileIPAddress;
    }

    /**
     * Sets the value of the mobileIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setMobileIPAddress(OasStringType value) {
        this.mobileIPAddress = value;
    }

    /**
     * Gets the value of the mpnPoolName property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getMPNPoolName() {
        return mpnPoolName;
    }

    /**
     * Sets the value of the mpnPoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setMPNPoolName(OasStringType value) {
        this.mpnPoolName = value;
    }

    /**
     * Gets the value of the subOrgID property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getSubOrgID() {
        return subOrgID;
    }

    /**
     * Sets the value of the subOrgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setSubOrgID(OasStringType value) {
        this.subOrgID = value;
    }

    /**
     * Gets the value of the fusfExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getFUSFExemptFlag() {
        return fusfExemptFlag;
    }

    /**
     * Sets the value of the fusfExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setFUSFExemptFlag(YesNoType value) {
        this.fusfExemptFlag = value;
    }

    /**
     * Gets the value of the globalSIMCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalSIMCard() {
        return globalSIMCard;
    }

    /**
     * Sets the value of the globalSIMCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalSIMCard(String value) {
        this.globalSIMCard = value;
    }

    /**
     * Gets the value of the portInFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getPortInFlag() {
        return portInFlag;
    }

    /**
     * Sets the value of the portInFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setPortInFlag(YesNoType value) {
        this.portInFlag = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureType }
     * 
     * 
     */
    public List<FeatureType> getFeature() {
        if (feature == null) {
            feature = new ArrayList<FeatureType>();
        }
        return this.feature;
    }

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link PlanType }
     *     
     */
    public PlanType getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanType }
     *     
     */
    public void setPlan(PlanType value) {
        this.plan = value;
    }

}