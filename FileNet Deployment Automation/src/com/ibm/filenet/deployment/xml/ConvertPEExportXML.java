//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.08 at 11:54:51 AM EEST 
//


package com.ibm.filenet.deployment.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Pair" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{}PEExportXML"/>
 *         &lt;element ref="{}PEConvertDestination"/>
 *       &lt;/all>
 *       &lt;attribute name="deleteDestinationFilesOnError" type="{}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "ConvertPEExportXML")
public class ConvertPEExportXML {

    @XmlElement(name = "Pair", required = true)
    protected String pair;
    @XmlElement(name = "PEExportXML", required = true)
    protected PEExportXML peExportXML;
    @XmlElement(name = "PEConvertDestination", required = true)
    protected PEConvertDestination peConvertDestination;
    @XmlAttribute(name = "deleteDestinationFilesOnError")
    protected String deleteDestinationFilesOnError;

    /**
     * Gets the value of the pair property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPair() {
        return pair;
    }

    /**
     * Sets the value of the pair property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPair(String value) {
        this.pair = value;
    }

    /**
     * Gets the value of the peExportXML property.
     * 
     * @return
     *     possible object is
     *     {@link PEExportXML }
     *     
     */
    public PEExportXML getPEExportXML() {
        return peExportXML;
    }

    /**
     * Sets the value of the peExportXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link PEExportXML }
     *     
     */
    public void setPEExportXML(PEExportXML value) {
        this.peExportXML = value;
    }

    /**
     * Gets the value of the peConvertDestination property.
     * 
     * @return
     *     possible object is
     *     {@link PEConvertDestination }
     *     
     */
    public PEConvertDestination getPEConvertDestination() {
        return peConvertDestination;
    }

    /**
     * Sets the value of the peConvertDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PEConvertDestination }
     *     
     */
    public void setPEConvertDestination(PEConvertDestination value) {
        this.peConvertDestination = value;
    }

    /**
     * Gets the value of the deleteDestinationFilesOnError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteDestinationFilesOnError() {
        if (deleteDestinationFilesOnError == null) {
            return "true";
        } else {
            return deleteDestinationFilesOnError;
        }
    }

    /**
     * Sets the value of the deleteDestinationFilesOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteDestinationFilesOnError(String value) {
        this.deleteDestinationFilesOnError = value;
    }

}