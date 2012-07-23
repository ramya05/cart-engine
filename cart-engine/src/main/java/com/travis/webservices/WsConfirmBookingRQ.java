//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.19 at 05:01:03 PM IST 
//


package com.travis.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsConfirmBookingRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsConfirmBookingRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pnrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentDetails" type="{http://travis.com/webservices}paymentDetails" minOccurs="0"/>
 *         &lt;element name="authHead" type="{http://travis.com/webservices}wsAuthenticate" minOccurs="0"/>
 *         &lt;element name="perviousDiscountAmountOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalDiscountAmountOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldselectedAgencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyIdForAgentBooking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsConfirmBookingRQ", propOrder = {
    "pnrNumber",
    "refNumber",
    "referenceId",
    "paymentDetails",
    "authHead",
    "perviousDiscountAmountOne",
    "originalDiscountAmountOne",
    "oldselectedAgencyId",
    "agencyIdForAgentBooking",
    "remark"
})
public class WsConfirmBookingRQ {

    protected String pnrNumber;
    protected String refNumber;
    protected String referenceId;
    protected PaymentDetails paymentDetails;
    protected WsAuthenticate authHead;
    protected String perviousDiscountAmountOne;
    protected String originalDiscountAmountOne;
    protected String oldselectedAgencyId;
    protected String agencyIdForAgentBooking;
    protected String remark;

    /**
     * Gets the value of the pnrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrNumber() {
        return pnrNumber;
    }

    /**
     * Sets the value of the pnrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * Gets the value of the refNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNumber() {
        return refNumber;
    }

    /**
     * Sets the value of the refNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNumber(String value) {
        this.refNumber = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetails }
     *     
     */
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetails }
     *     
     */
    public void setPaymentDetails(PaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the authHead property.
     * 
     * @return
     *     possible object is
     *     {@link WsAuthenticate }
     *     
     */
    public WsAuthenticate getAuthHead() {
        return authHead;
    }

    /**
     * Sets the value of the authHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsAuthenticate }
     *     
     */
    public void setAuthHead(WsAuthenticate value) {
        this.authHead = value;
    }

    /**
     * Gets the value of the perviousDiscountAmountOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerviousDiscountAmountOne() {
        return perviousDiscountAmountOne;
    }

    /**
     * Sets the value of the perviousDiscountAmountOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerviousDiscountAmountOne(String value) {
        this.perviousDiscountAmountOne = value;
    }

    /**
     * Gets the value of the originalDiscountAmountOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDiscountAmountOne() {
        return originalDiscountAmountOne;
    }

    /**
     * Sets the value of the originalDiscountAmountOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDiscountAmountOne(String value) {
        this.originalDiscountAmountOne = value;
    }

    /**
     * Gets the value of the oldselectedAgencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldselectedAgencyId() {
        return oldselectedAgencyId;
    }

    /**
     * Sets the value of the oldselectedAgencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldselectedAgencyId(String value) {
        this.oldselectedAgencyId = value;
    }

    /**
     * Gets the value of the agencyIdForAgentBooking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyIdForAgentBooking() {
        return agencyIdForAgentBooking;
    }

    /**
     * Sets the value of the agencyIdForAgentBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyIdForAgentBooking(String value) {
        this.agencyIdForAgentBooking = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
