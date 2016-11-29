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
 * <p>Classe Java pour VL10_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL10_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Land"/>
 *     &lt;enumeration value="Heliport"/>
 *     &lt;enumeration value="Prepared landing area"/>
 *     &lt;enumeration value="Water"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL10_5_0_1_1")
@XmlEnum
public enum VL105011 {


    /**
     * A land aerodrome is a defined area on land (including any buildings, installations and equipment) intended to be used either wholly or in part for the arrival, departure and surface movement of aircraft.
     * 
     */
    @XmlEnumValue("Land")
    LAND("Land"),

    /**
     * A heliport is an aerodrome or a defined area on a structure intended to be used wholly or in part for the arrival, departure and surface movement of helicopters. ICAO Annex 14.
     * 
     */
    @XmlEnumValue("Heliport")
    HELIPORT("Heliport"),

    /**
     * A prepared landing area is a defined area, other than an aerodrome or heliport, on land or water which has been prepared for the arrival, departure and surface movement of aircraft.
     * 
     */
    @XmlEnumValue("Prepared landing area")
    PREPARED_LANDING_AREA("Prepared landing area"),

    /**
     * A water aerodrome is a defined area of water (including any buildings, installations and equipment) intended to be used either wholly or in part for the arrival, departure and surface movement of aircraft.
     * 
     */
    @XmlEnumValue("Water")
    WATER("Water"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL105011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL105011 fromValue(String v) {
        for (VL105011 c: VL105011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
