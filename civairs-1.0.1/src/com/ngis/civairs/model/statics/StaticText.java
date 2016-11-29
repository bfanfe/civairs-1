//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.10.04 à 11:04:45 AM GMT 
//


package com.ngis.civairs.model.statics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Text complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Text">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EncodedText" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Text", namespace = "http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd", propOrder = {
    "plainText",
    "encodedText"
})
@XmlSeeAlso({
    com.ngis.civairs.model.statics.StaticAerodromeWeatherReports.ATTRIBUTES.WxReport.class,
    com.ngis.civairs.model.statics.StaticNarrative.ATTRIBUTES.NarrativeText.class,
    com.ngis.civairs.model.statics.StaticReportingHistory.ATTRIBUTES.DescriptionInvestigation.class,
    com.ngis.civairs.model.statics.StaticReportingHistory.ATTRIBUTES.RiskAssessment.class,
    com.ngis.civairs.model.statics.StaticReportingHistory.ATTRIBUTES.CorrectiveActions.class,
    com.ngis.civairs.model.statics.StaticReportingHistory.ATTRIBUTES.Conclusions.class
})
public class StaticText {

    @XmlElement(name = "PlainText")
    protected String plainText;
    @XmlElement(name = "EncodedText")
    protected byte[] encodedText;

    /**
     * Obtient la valeur de la propriété plainText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlainText() {
        return plainText;
    }

    /**
     * Définit la valeur de la propriété plainText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlainText(String value) {
        this.plainText = value;
    }

    /**
     * Obtient la valeur de la propriété encodedText.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncodedText() {
        return encodedText;
    }

    /**
     * Définit la valeur de la propriété encodedText.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncodedText(byte[] value) {
        this.encodedText = value;
    }

}
