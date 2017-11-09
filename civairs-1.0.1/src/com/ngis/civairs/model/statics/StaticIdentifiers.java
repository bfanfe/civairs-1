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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour Identifiers complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Identifiers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="KEY" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd}keyString" minOccurs="0"/>
 *         &lt;element name="File_Number">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>string30max">
 *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="452" />
 *                 &lt;attribute name="specialAttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Responsible_Entity">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1017_5_0_1_4">
 *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="453" />
 *                 &lt;attribute name="specialAttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifiers", propOrder = {

})
public class StaticIdentifiers {

    @XmlElement(name = "KEY")
    protected String key;
    @XmlElement(name = "File_Number", required = true)
    protected StaticIdentifiers.FileNumber fileNumber;
    @XmlElement(name = "Responsible_Entity", required = true)
    protected StaticIdentifiers.ResponsibleEntity responsibleEntity;

    /**
     * Obtient la valeur de la propriété key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEY() {
        return key;
    }

    /**
     * Définit la valeur de la propriété key.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEY(String value) {
        this.key = value;
    }

    /**
     * Obtient la valeur de la propriété fileNumber.
     * 
     * @return
     *     possible object is
     *     {@link StaticIdentifiers.FileNumber }
     *     
     */
    public StaticIdentifiers.FileNumber getFileNumber() {
        return fileNumber;
    }

    /**
     * Définit la valeur de la propriété fileNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticIdentifiers.FileNumber }
     *     
     */
    public void setFileNumber(StaticIdentifiers.FileNumber value) {
        this.fileNumber = value;
    }

    /**
     * Obtient la valeur de la propriété responsibleEntity.
     * 
     * @return
     *     possible object is
     *     {@link StaticIdentifiers.ResponsibleEntity }
     *     
     */
    public StaticIdentifiers.ResponsibleEntity getResponsibleEntity() {
        return responsibleEntity;
    }

    /**
     * Définit la valeur de la propriété responsibleEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticIdentifiers.ResponsibleEntity }
     *     
     */
    public void setResponsibleEntity(StaticIdentifiers.ResponsibleEntity value) {
        this.responsibleEntity = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>string30max">
     *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="452" />
     *       &lt;attribute name="specialAttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class FileNumber {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "attributeId", required = true)
        protected String attributeId;
        @XmlAttribute(name = "specialAttributeId", required = true)
        protected String specialAttributeId;

        /**
         * Obtient la valeur de la propriété value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Définit la valeur de la propriété value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtient la valeur de la propriété attributeId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeId() {
            if (attributeId == null) {
                return "452";
            } else {
                return attributeId;
            }
        }

        /**
         * Définit la valeur de la propriété attributeId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeId(String value) {
            this.attributeId = value;
        }

        /**
         * Obtient la valeur de la propriété specialAttributeId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecialAttributeId() {
            if (specialAttributeId == null) {
                return "1";
            } else {
                return specialAttributeId;
            }
        }

        /**
         * Définit la valeur de la propriété specialAttributeId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecialAttributeId(String value) {
            this.specialAttributeId = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1017_5_0_1_4">
     *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="453" />
     *       &lt;attribute name="specialAttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ResponsibleEntity {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "attributeId", required = true)
        protected String attributeId;
        @XmlAttribute(name = "specialAttributeId", required = true)
        protected String specialAttributeId;

        /**
         * Obtient la valeur de la propriété value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Définit la valeur de la propriété value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtient la valeur de la propriété attributeId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeId() {
            if (attributeId == null) {
                return "453";
            } else {
                return attributeId;
            }
        }

        /**
         * Définit la valeur de la propriété attributeId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeId(String value) {
            this.attributeId = value;
        }

        /**
         * Obtient la valeur de la propriété specialAttributeId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecialAttributeId() {
            if (specialAttributeId == null) {
                return "2";
            } else {
                return specialAttributeId;
            }
        }

        /**
         * Définit la valeur de la propriété specialAttributeId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecialAttributeId(String value) {
            this.specialAttributeId = value;
        }

    }

}
