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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Runway information and description.
 * 
 * <p>Classe Java pour Runway complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Runway">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Runway_Identifier" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Runway_Identifier">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="499" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Surface_Type" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL509_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="509" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Aircraft" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}L-Aircraft" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="entityId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="31" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Runway", propOrder = {

})
public class StaticRunway {

    @XmlElement(name = "ATTRIBUTES")
    protected StaticRunway.ATTRIBUTES attributes;
    @XmlElement(name = "LINKS")
    protected StaticRunway.LINKS links;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "entityId", required = true)
    protected String entityId;

    /**
     * Obtient la valeur de la propriété attributes.
     * 
     * @return
     *     possible object is
     *     {@link StaticRunway.ATTRIBUTES }
     *     
     */
    public StaticRunway.ATTRIBUTES getATTRIBUTES() {
        return attributes;
    }

    /**
     * Définit la valeur de la propriété attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticRunway.ATTRIBUTES }
     *     
     */
    public void setATTRIBUTES(StaticRunway.ATTRIBUTES value) {
        this.attributes = value;
    }

    /**
     * Obtient la valeur de la propriété links.
     * 
     * @return
     *     possible object is
     *     {@link StaticRunway.LINKS }
     *     
     */
    public StaticRunway.LINKS getLINKS() {
        return links;
    }

    /**
     * Définit la valeur de la propriété links.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticRunway.LINKS }
     *     
     */
    public void setLINKS(StaticRunway.LINKS value) {
        this.links = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
            return "31";
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
     *         &lt;element name="Runway_Identifier" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Runway_Identifier">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="499" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Surface_Type" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL509_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="509" />
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
        "runwayIdentifierOrSurfaceType"
    })
    public static class ATTRIBUTES {

        @XmlElements({
            @XmlElement(name = "Runway_Identifier", type = StaticRunway.ATTRIBUTES.RunwayIdentifier.class),
            @XmlElement(name = "Surface_Type", type = StaticRunway.ATTRIBUTES.SurfaceType.class)
        })
        protected List<Object> runwayIdentifierOrSurfaceType;

        /**
         * Gets the value of the runwayIdentifierOrSurfaceType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the runwayIdentifierOrSurfaceType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRunwayIdentifierOrSurfaceType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StaticRunway.ATTRIBUTES.RunwayIdentifier }
         * {@link StaticRunway.ATTRIBUTES.SurfaceType }
         * 
         * 
         */
        public List<Object> getRunwayIdentifierOrSurfaceType() {
            if (runwayIdentifierOrSurfaceType == null) {
                runwayIdentifierOrSurfaceType = new ArrayList<Object>();
            }
            return this.runwayIdentifierOrSurfaceType;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Runway_Identifier">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="499" />
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
        public static class RunwayIdentifier {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

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
                    return "499";
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
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL509_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="509" />
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
        public static class SurfaceType {

            @XmlValue
            protected VL5095011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL5095011 }
             *     
             */
            public VL5095011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL5095011 }
             *     
             */
            public void setValue(VL5095011 value) {
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
                    return "509";
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
     *         &lt;element name="Aircraft" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}L-Aircraft" maxOccurs="unbounded" minOccurs="0"/>
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
        "aircraft"
    })
    public static class LINKS {

        @XmlElement(name = "Aircraft")
        protected List<StaticLAircraft> aircraft;

        /**
         * Gets the value of the aircraft property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aircraft property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAircraft().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StaticLAircraft }
         * 
         * 
         */
        public List<StaticLAircraft> getAircraft() {
            if (aircraft == null) {
                aircraft = new ArrayList<StaticLAircraft>();
            }
            return this.aircraft;
        }

    }

}
