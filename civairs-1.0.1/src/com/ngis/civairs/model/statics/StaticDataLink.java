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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour DataLink complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DataLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EccairsNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResponsibleEntity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OccurrenceKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Repository" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxonomyKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaxonomyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaxonomyVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataLink", namespace = "http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd", propOrder = {
    "eccairsNumber",
    "responsibleEntity",
    "occurrenceKey",
    "creationDate",
    "lastModificationDate",
    "repository",
    "taxonomyKey",
    "taxonomyName",
    "taxonomyVersion"
})
public class StaticDataLink {

    @XmlElement(name = "EccairsNumber", required = true)
    protected String eccairsNumber;
    @XmlElement(name = "ResponsibleEntity", required = true)
    protected String responsibleEntity;
    @XmlElement(name = "OccurrenceKey", required = true)
    protected String occurrenceKey;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastModificationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModificationDate;
    @XmlElement(name = "Repository")
    protected String repository;
    @XmlElement(name = "TaxonomyKey", required = true)
    protected String taxonomyKey;
    @XmlElement(name = "TaxonomyName", required = true)
    protected String taxonomyName;
    @XmlElement(name = "TaxonomyVersion", required = true)
    protected String taxonomyVersion;

    /**
     * Obtient la valeur de la propriété eccairsNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEccairsNumber() {
        return eccairsNumber;
    }

    /**
     * Définit la valeur de la propriété eccairsNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEccairsNumber(String value) {
        this.eccairsNumber = value;
    }

    /**
     * Obtient la valeur de la propriété responsibleEntity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleEntity() {
        return responsibleEntity;
    }

    /**
     * Définit la valeur de la propriété responsibleEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleEntity(String value) {
        this.responsibleEntity = value;
    }

    /**
     * Obtient la valeur de la propriété occurrenceKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurrenceKey() {
        return occurrenceKey;
    }

    /**
     * Définit la valeur de la propriété occurrenceKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurrenceKey(String value) {
        this.occurrenceKey = value;
    }

    /**
     * Obtient la valeur de la propriété creationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Définit la valeur de la propriété creationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Obtient la valeur de la propriété lastModificationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModificationDate() {
        return lastModificationDate;
    }

    /**
     * Définit la valeur de la propriété lastModificationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModificationDate(XMLGregorianCalendar value) {
        this.lastModificationDate = value;
    }

    /**
     * Obtient la valeur de la propriété repository.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepository() {
        return repository;
    }

    /**
     * Définit la valeur de la propriété repository.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepository(String value) {
        this.repository = value;
    }

    /**
     * Obtient la valeur de la propriété taxonomyKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxonomyKey() {
        return taxonomyKey;
    }

    /**
     * Définit la valeur de la propriété taxonomyKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxonomyKey(String value) {
        this.taxonomyKey = value;
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
        return taxonomyName;
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
        return taxonomyVersion;
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

}
