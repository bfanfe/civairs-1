//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.10.04 à 11:04:45 AM GMT 
//


package com.ngis.civairs.model.statics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Flight crew licenses, type, validity and ratings.
 * 
 * <p>Classe Java pour Flight_Crew_Licenses complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Flight_Crew_Licenses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Validity" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL397_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="397" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Ratings" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL398_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="398" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="License_Issued_By" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL399_12_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="399" />
 *                           &lt;attribute name="AdditionalText" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="AdditionalTextEncoding">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="xs:string"/>
 *                                 &lt;enumeration value="xs:base64Binary"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="License_Type" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1012_5_0_1_2">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="400" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Date_Of_License" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="639" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="entityId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="16" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flight_Crew_Licenses", propOrder = {

})
public class StaticFlightCrewLicenses {

    @XmlElement(name = "ATTRIBUTES")
    protected StaticFlightCrewLicenses.ATTRIBUTES attributes;
    @XmlAttribute(name = "entityId", required = true)
    protected String entityId;

    /**
     * Obtient la valeur de la propriété attributes.
     * 
     * @return
     *     possible object is
     *     {@link StaticFlightCrewLicenses.ATTRIBUTES }
     *     
     */
    public StaticFlightCrewLicenses.ATTRIBUTES getATTRIBUTES() {
        return attributes;
    }

    /**
     * Définit la valeur de la propriété attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticFlightCrewLicenses.ATTRIBUTES }
     *     
     */
    public void setATTRIBUTES(StaticFlightCrewLicenses.ATTRIBUTES value) {
        this.attributes = value;
    }

    /**
     * Obtient la valeur de la propriété entityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        if (entityId == null) {
            return "16";
        } else {
            return entityId;
        }
    }

    /**
     * Définit la valeur de la propriété entityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Validity" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL397_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="397" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Ratings" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL398_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="398" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="License_Issued_By" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL399_12_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="399" />
     *                 &lt;attribute name="AdditionalText" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="AdditionalTextEncoding">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="xs:string"/>
     *                       &lt;enumeration value="xs:base64Binary"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="License_Type" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1012_5_0_1_2">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="400" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Date_Of_License" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="639" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "validityOrRatingsOrLicenseIssuedBy"
    })
    public static class ATTRIBUTES {

        @XmlElements({
            @XmlElement(name = "Validity", type = StaticFlightCrewLicenses.ATTRIBUTES.Validity.class),
            @XmlElement(name = "Ratings", type = StaticFlightCrewLicenses.ATTRIBUTES.Ratings.class),
            @XmlElement(name = "License_Issued_By", type = StaticFlightCrewLicenses.ATTRIBUTES.LicenseIssuedBy.class),
            @XmlElement(name = "License_Type", type = StaticFlightCrewLicenses.ATTRIBUTES.LicenseType.class),
            @XmlElement(name = "Date_Of_License", type = StaticFlightCrewLicenses.ATTRIBUTES.DateOfLicense.class)
        })
        protected List<Object> validityOrRatingsOrLicenseIssuedBy;

        /**
         * Gets the value of the validityOrRatingsOrLicenseIssuedBy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the validityOrRatingsOrLicenseIssuedBy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValidityOrRatingsOrLicenseIssuedBy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StaticFlightCrewLicenses.ATTRIBUTES.Validity }
         * {@link StaticFlightCrewLicenses.ATTRIBUTES.Ratings }
         * {@link StaticFlightCrewLicenses.ATTRIBUTES.LicenseIssuedBy }
         * {@link StaticFlightCrewLicenses.ATTRIBUTES.LicenseType }
         * {@link StaticFlightCrewLicenses.ATTRIBUTES.DateOfLicense }
         * 
         * 
         */
        public List<Object> getValidityOrRatingsOrLicenseIssuedBy() {
            if (validityOrRatingsOrLicenseIssuedBy == null) {
                validityOrRatingsOrLicenseIssuedBy = new ArrayList<Object>();
            }
            return this.validityOrRatingsOrLicenseIssuedBy;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="639" />
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
        public static class DateOfLicense {

            @XmlValue
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setValue(XMLGregorianCalendar value) {
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
                    return "639";
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

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL399_12_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="399" />
         *       &lt;attribute name="AdditionalText" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="AdditionalTextEncoding">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="xs:string"/>
         *             &lt;enumeration value="xs:base64Binary"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
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
        public static class LicenseIssuedBy {

            @XmlValue
            protected VL39912011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;
            @XmlAttribute(name = "AdditionalText")
            @XmlSchemaType(name = "anySimpleType")
            protected String additionalText;
            @XmlAttribute(name = "AdditionalTextEncoding")
            protected String additionalTextEncoding;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL39912011 }
             *     
             */
            public VL39912011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL39912011 }
             *     
             */
            public void setValue(VL39912011 value) {
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
                    return "399";
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
             * Obtient la valeur de la propriété additionalText.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalText() {
                return additionalText;
            }

            /**
             * Définit la valeur de la propriété additionalText.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalText(String value) {
                this.additionalText = value;
            }

            /**
             * Obtient la valeur de la propriété additionalTextEncoding.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalTextEncoding() {
                return additionalTextEncoding;
            }

            /**
             * Définit la valeur de la propriété additionalTextEncoding.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalTextEncoding(String value) {
                this.additionalTextEncoding = value;
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
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1012_5_0_1_2">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="400" />
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
        public static class LicenseType {

            @XmlValue
            protected VL10125012 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL10125012 }
             *     
             */
            public VL10125012 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL10125012 }
             *     
             */
            public void setValue(VL10125012 value) {
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
                    return "400";
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

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL398_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="398" />
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
        public static class Ratings {

            @XmlValue
            protected VL3985011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL3985011 }
             *     
             */
            public VL3985011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL3985011 }
             *     
             */
            public void setValue(VL3985011 value) {
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
                    return "398";
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

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL397_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="397" />
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
        public static class Validity {

            @XmlValue
            protected VL3975011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL3975011 }
             *     
             */
            public VL3975011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL3975011 }
             *     
             */
            public void setValue(VL3975011 value) {
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
                    return "397";
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

        }

    }

}
