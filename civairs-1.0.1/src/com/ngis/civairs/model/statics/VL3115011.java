//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.10.04 à 11:04:45 AM GMT 
//


package com.ngis.civairs.model.statics;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VL311_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL311_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Precipitation"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Cloud"/>
 *     &lt;enumeration value="Dust"/>
 *     &lt;enumeration value="Fog/mist"/>
 *     &lt;enumeration value="Haze"/>
 *     &lt;enumeration value="Freezing fog"/>
 *     &lt;enumeration value="Light conditions"/>
 *     &lt;enumeration value="Smoke"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL311_5_0_1_1")
@XmlEnum
public enum VL3115011 {


    /**
     * To be used whenever any type of precipitation restricted the visibility
     * 
     */
    @XmlEnumValue("Precipitation")
    PRECIPITATION("Precipitation"),
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * Cloud is a visible cluster of tiny water and/or ice particles in the atmosphere.
     * 
     */
    @XmlEnumValue("Cloud")
    CLOUD("Cloud"),
    @XmlEnumValue("Dust")
    DUST("Dust"),

    /**
     * Fog: cloud at ground level, and occurs when air is cooled to its dew point and below, or when atmosperic moisture increases through evaporation from water that is warmer than the air. Visibility is below 1000m (ICAO Annex 3).
     * 
     * Mist is microscopic water droplets suspended in the air. It casts a thin greyish veil over the landscape but reduces visibility to a lesser extent than fog. Visibility is over 1000m but do not exceed 5000m (ICAO Annex 3).
     * 
     */
    @XmlEnumValue("Fog/mist")
    FOG_MIST("Fog/mist"),

    /**
     * Haze consists of fine particles of dust and pollution suspended in the atmosphere and is distinguished from fog by its bluish or yellowish tinge.
     * 
     */
    @XmlEnumValue("Haze")
    HAZE("Haze"),
    @XmlEnumValue("Freezing fog")
    FREEZING_FOG("Freezing fog"),
    @XmlEnumValue("Light conditions")
    LIGHT_CONDITIONS("Light conditions"),
    @XmlEnumValue("Smoke")
    SMOKE("Smoke"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL3115011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL3115011 fromValue(String v) {
        for (VL3115011 c: VL3115011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
