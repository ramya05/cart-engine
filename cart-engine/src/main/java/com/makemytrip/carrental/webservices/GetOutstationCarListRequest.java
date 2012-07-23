//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.20 at 10:22:20 AM IST 
//


package com.makemytrip.carrental.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.mmt.services.product.IRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TripType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromCityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToCityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SortKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoOfRecords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SeatingCapacity" type="{http://carrental.makemytrip.com/webservices}SeatingCapacityList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceType",
    "tripType",
    "fromCityCode",
    "toCityCode",
    "date",
    "month",
    "year",
    "hour",
    "minute",
    "duration",
    "sortKey",
    "sortOrder",
    "maxAmount",
    "minAmount",
    "noOfRecords",
    "seatingCapacity"
})
@XmlRootElement(name = "GetOutstationCarListRequest")
public class GetOutstationCarListRequest implements IRequest{

    @XmlElement(name = "ServiceType", required = true)
    protected String serviceType;
    @XmlElement(name = "TripType")
    protected String tripType;
    @XmlElement(name = "FromCityCode", required = true)
    protected String fromCityCode;
    @XmlElement(name = "ToCityCode", required = true)
    protected String toCityCode;
    @XmlElement(name = "Date", required = true)
    protected String date;
    @XmlElement(name = "Month", required = true)
    protected String month;
    @XmlElement(name = "Year", required = true)
    protected String year;
    @XmlElement(name = "Hour", required = true, defaultValue = "08")
    protected String hour;
    @XmlElement(name = "Minute", required = true, defaultValue = "00")
    protected String minute;
    @XmlElement(name = "Duration", required = true, defaultValue = "01")
    protected String duration;
    @XmlElement(name = "SortKey", required = true, defaultValue = "price")
    protected String sortKey;
    @XmlElement(name = "SortOrder", required = true, defaultValue = "asc")
    protected String sortOrder;
    @XmlElement(name = "MaxAmount")
    protected String maxAmount;
    @XmlElement(name = "MinAmount")
    protected String minAmount;
    @XmlElement(name = "NoOfRecords", defaultValue = "0")
    protected Integer noOfRecords;
    @XmlElement(name = "SeatingCapacity")
    protected SeatingCapacityList seatingCapacity;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the tripType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripType() {
        return tripType;
    }

    /**
     * Sets the value of the tripType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripType(String value) {
        this.tripType = value;
    }

    /**
     * Gets the value of the fromCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCityCode() {
        return fromCityCode;
    }

    /**
     * Sets the value of the fromCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCityCode(String value) {
        this.fromCityCode = value;
    }

    /**
     * Gets the value of the toCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCityCode() {
        return toCityCode;
    }

    /**
     * Sets the value of the toCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCityCode(String value) {
        this.toCityCode = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHour(String value) {
        this.hour = value;
    }

    /**
     * Gets the value of the minute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinute() {
        return minute;
    }

    /**
     * Sets the value of the minute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinute(String value) {
        this.minute = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the sortKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortKey() {
        return sortKey;
    }

    /**
     * Sets the value of the sortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortKey(String value) {
        this.sortKey = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortOrder(String value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAmount(String value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinAmount(String value) {
        this.minAmount = value;
    }

    /**
     * Gets the value of the noOfRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfRecords() {
        return noOfRecords;
    }

    /**
     * Sets the value of the noOfRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfRecords(Integer value) {
        this.noOfRecords = value;
    }

    /**
     * Gets the value of the seatingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link SeatingCapacityList }
     *     
     */
    public SeatingCapacityList getSeatingCapacity() {
        return seatingCapacity;
    }

    /**
     * Sets the value of the seatingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatingCapacityList }
     *     
     */
    public void setSeatingCapacity(SeatingCapacityList value) {
        this.seatingCapacity = value;
    }

}
