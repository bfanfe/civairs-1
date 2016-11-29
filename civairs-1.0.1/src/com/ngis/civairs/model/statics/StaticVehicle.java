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
 * Information on the aerodrome vehicle involved in the occurrence.
 * 
 * <p>Classe Java pour Vehicle complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Vehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Type_Of_Vehicle" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1072_12_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="733" />
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
 *                   &lt;element name="Vehicle_Controlled" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1094_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="743" />
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
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="entityId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="48" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", propOrder = {

})
public class StaticVehicle {

    @XmlElement(name = "ATTRIBUTES")
    protected StaticVehicle.ATTRIBUTES attributes;
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
     *     {@link StaticVehicle.ATTRIBUTES }
     *     
     */
    public StaticVehicle.ATTRIBUTES getATTRIBUTES() {
        return attributes;
    }

    /**
     * Définit la valeur de la propriété attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticVehicle.ATTRIBUTES }
     *     
     */
    public void setATTRIBUTES(StaticVehicle.ATTRIBUTES value) {
        this.attributes = value;
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
            return "48";
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
     *         &lt;element name="Type_Of_Vehicle" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1072_12_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="733" />
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
     *         &lt;element name="Vehicle_Controlled" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1094_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="743" />
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
        "typeOfVehicleOrVehicleControlled"
    })
    public static class ATTRIBUTES {

        @XmlElements({
            @XmlElement(name = "Type_Of_Vehicle", type = StaticVehicle.ATTRIBUTES.TypeOfVehicle.class),
            @XmlElement(name = "Vehicle_Controlled", type = StaticVehicle.ATTRIBUTES.VehicleControlled.class)
        })
        protected List<Object> typeOfVehicleOrVehicleControlled;

        /**
         * Gets the value of the typeOfVehicleOrVehicleControlled property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the typeOfVehicleOrVehicleControlled property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTypeOfVehicleOrVehicleControlled().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StaticVehicle.ATTRIBUTES.TypeOfVehicle }
         * {@link StaticVehicle.ATTRIBUTES.VehicleControlled }
         * 
         * 
         */
        public List<Object> getTypeOfVehicleOrVehicleControlled() {
            if (typeOfVehicleOrVehicleControlled == null) {
                typeOfVehicleOrVehicleControlled = new ArrayList<Object>();
            }
            return this.typeOfVehicleOrVehicleControlled;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1072_12_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="733" />
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
        public static class TypeOfVehicle {

            @XmlValue
            protected VL107212011 value;
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
             *     {@link VL107212011 }
             *     
             */
            public VL107212011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL107212011 }
             *     
             */
            public void setValue(VL107212011 value) {
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
                    return "733";
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
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1094_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="743" />
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
        public static class VehicleControlled {

            @XmlValue
            protected VL10945011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL10945011 }
             *     
             */
            public VL10945011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL10945011 }
             *     
             */
            public void setValue(VL10945011 value) {
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
                    return "743";
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
