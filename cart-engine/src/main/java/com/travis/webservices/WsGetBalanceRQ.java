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
 * <p>Java class for wsGetBalanceRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsGetBalanceRQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsAuthenticate" type="{http://travis.com/webservices}wsAuthenticate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsGetBalanceRQ", propOrder = {
    "wsAuthenticate"
})
public class WsGetBalanceRQ {

    protected WsAuthenticate wsAuthenticate;

    /**
     * Gets the value of the wsAuthenticate property.
     * 
     * @return
     *     possible object is
     *     {@link WsAuthenticate }
     *     
     */
    public WsAuthenticate getWsAuthenticate() {
        return wsAuthenticate;
    }

    /**
     * Sets the value of the wsAuthenticate property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsAuthenticate }
     *     
     */
    public void setWsAuthenticate(WsAuthenticate value) {
        this.wsAuthenticate = value;
    }

}
