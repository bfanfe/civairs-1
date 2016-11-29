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
import javax.xml.bind.annotation.XmlType;


/**
 * The aerodrome weather reports (in an aeronautical meteorological code).
 * 
 * <p>Classe Java pour Aerodrome_Weather_Reports complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Aerodrome_Weather_Reports">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Wx_Report" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd}Text">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="177" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="entityId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aerodrome_Weather_Reports", propOrder = {

})
public class StaticAerodromeWeatherReports {

    @XmlElement(name = "ATTRIBUTES")
    protected StaticAerodromeWeatherReports.ATTRIBUTES attributes;
    @XmlAttribute(name = "entityId", required = true)
    protected String entityId;

    /**
     * Obtient la valeur de la propriété attributes.
     * 
     * @return
     *     possible object is
     *     {@link StaticAerodromeWeatherReports.ATTRIBUTES }
     *     
     */
    public StaticAerodromeWeatherReports.ATTRIBUTES getATTRIBUTES() {
        return attributes;
    }

    /**
     * Définit la valeur de la propriété attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticAerodromeWeatherReports.ATTRIBUTES }
     *     
     */
    public void setATTRIBUTES(StaticAerodromeWeatherReports.ATTRIBUTES value) {
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
            return "2";
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
     *         &lt;element name="Wx_Report" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd}Text">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="177" />
     *               &lt;/extension>
     *             &lt;/complexContent>
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
        "wxReport"
    })
    public static class ATTRIBUTES {

        @XmlElement(name = "Wx_Report")
        protected List<StaticAerodromeWeatherReports.ATTRIBUTES.WxReport> wxReport;

        /**
         * Gets the value of the wxReport property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wxReport property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWxReport().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StaticAerodromeWeatherReports.ATTRIBUTES.WxReport }
         * 
         * 
         */
        public List<StaticAerodromeWeatherReports.ATTRIBUTES.WxReport> getWxReport() {
            if (wxReport == null) {
                wxReport = new ArrayList<StaticAerodromeWeatherReports.ATTRIBUTES.WxReport>();
            }
            return this.wxReport;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd}Text">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="177" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class WxReport
            extends StaticText
        {

            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

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
                    return "177";
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
