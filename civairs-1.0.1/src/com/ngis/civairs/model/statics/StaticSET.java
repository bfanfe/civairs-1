//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.10.04 à 11:04:45 AM GMT 
//


package com.ngis.civairs.model.statics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFIERS" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Identifiers"/>
 *         &lt;element name="Occurrence" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Occurrence"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TaxonomyName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="ECCAIRS Aviation" />
 *       &lt;attribute name="TaxonomyVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="3.0.0.0" />
 *       &lt;attribute name="Domain" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="RIT" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identifiers",
    "occurrence"
})
@XmlRootElement(name = "SET")
public class StaticSET {

    @XmlElement(name = "IDENTIFIERS", required = true)
    protected StaticIdentifiers identifiers;
    @XmlElement(name = "Occurrence", required = true)
    protected StaticOccurrence occurrence;
    @XmlAttribute(name = "TaxonomyName", required = true)
    protected String taxonomyName;
    @XmlAttribute(name = "TaxonomyVersion", required = true)
    protected String taxonomyVersion;
    @XmlAttribute(name = "Domain", required = true)
    protected String domain;

    /**
     * Obtient la valeur de la propriété identifiers.
     * 
     * @return
     *     possible object is
     *     {@link StaticIdentifiers }
     *     
     */
    public StaticIdentifiers getIDENTIFIERS() {
        return identifiers;
    }

    /**
     * Définit la valeur de la propriété identifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticIdentifiers }
     *     
     */
    public void setIDENTIFIERS(StaticIdentifiers value) {
        this.identifiers = value;
    }

    /**
     * Obtient la valeur de la propriété occurrence.
     * 
     * @return
     *     possible object is
     *     {@link StaticOccurrence }
     *     
     */
    public StaticOccurrence getOccurrence() {
        return occurrence;
    }

    /**
     * Définit la valeur de la propriété occurrence.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticOccurrence }
     *     
     */
    public void setOccurrence(StaticOccurrence value) {
        this.occurrence = value;
    }

    /**
     * Obtient la valeur de la propriété taxonomyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxonomyName() {
        if (taxonomyName == null) {
            return "ECCAIRS Aviation";
        } else {
            return taxonomyName;
        }
    }

    /**
     * Définit la valeur de la propriété taxonomyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxonomyName(String value) {
        this.taxonomyName = value;
    }

    /**
     * Obtient la valeur de la propriété taxonomyVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxonomyVersion() {
        if (taxonomyVersion == null) {
            return "3.0.0.0";
        } else {
            return taxonomyVersion;
        }
    }

    /**
     * Définit la valeur de la propriété taxonomyVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxonomyVersion(String value) {
        this.taxonomyVersion = value;
    }

    /**
     * Obtient la valeur de la propriété domain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        if (domain == null) {
            return "RIT";
        } else {
            return domain;
        }
    }

    /**
     * Définit la valeur de la propriété domain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

}
