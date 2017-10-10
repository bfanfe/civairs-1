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
 * <p>Classe Java pour VL9_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL9_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Elevated heliport"/>
 *     &lt;enumeration value="Off-shore helideck"/>
 *     &lt;enumeration value="Prepared landing area"/>
 *     &lt;enumeration value="Ship helideck"/>
 *     &lt;enumeration value="Surface heliport"/>
 *     &lt;enumeration value="Natural landing site"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL9_5_0_1_1")
@XmlEnum
public enum VL95011 {


    /**
     * The helicopter landing area was a defined area on a raised structure intended to be used wholly or in part for the arrival, departure and surface movement of helicopters. ICAO Annex 6, 14.
     * 
     */
    @XmlEnumValue("Elevated heliport")
    ELEVATED_HELIPORT("Elevated heliport"),

    /**
     * A helideck is a defined area on a structure intended to be used wholly or in part for the arrival, departure and surface movement of helicopters. ICAO Annex 14.
     *  Helideck. A heliport located on a floating or fixed off-shore structure. ICAO Annex 6.
     * 
     */
    @XmlEnumValue("Off-shore helideck")
    OFF_SHORE_HELIDECK("Off-shore helideck"),
    @XmlEnumValue("Prepared landing area")
    PREPARED_LANDING_AREA("Prepared landing area"),

    /**
     * The helicopter landing area was a defined area on a ship intended to be used wholly or in part for the arrival, departure and surface movement of helicopters. 
     * 
     */
    @XmlEnumValue("Ship helideck")
    SHIP_HELIDECK("Ship helideck"),

    /**
     * The helicopter landing area was an aerodrome or a defined area on a structure, at surface level, intended to be used wholly or in part for the arrival, departure and surface movement of helicopters. ICAO Annex 14.
     * 
     */
    @XmlEnumValue("Surface heliport")
    SURFACE_HELIPORT("Surface heliport"),
    @XmlEnumValue("Natural landing site")
    NATURAL_LANDING_SITE("Natural landing site"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL95011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL95011 fromValue(String v) {
        for (VL95011 c: VL95011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
