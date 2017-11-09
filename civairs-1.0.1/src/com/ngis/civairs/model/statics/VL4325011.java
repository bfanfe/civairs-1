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
 * <p>Classe Java pour VL432_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL432_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Destroyed"/>
 *     &lt;enumeration value="Substantial"/>
 *     &lt;enumeration value="Minor"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL432_5_0_1_1")
@XmlEnum
public enum VL4325011 {


    /**
     * The damage sustained makes it inadvisable to restore the aircraft to an airworthy condition. 
     *  Note: This differs from the definition of a hull loss which reads: The aircraft is damaged beyond economical repair. A determination of "Hull loss" is thus not the result of a technical evaluation but may result from economic considerations.
     * 
     */
    @XmlEnumValue("Destroyed")
    DESTROYED("Destroyed"),

    /**
     * The aircraft sustained damage or structural failure which:
     *  - adversely affected the structural strength, performance or flight characteristics of the aircraft and
     *  - would normally require major repair or replacement of the affected component, except for engine failure or damage, when the damage is limited to the engine, its cowlings or accessories; or for damage limited to propellers, wing tips, antennas, tyres, brakes, fairings, small dents or puncture holes in the aircraft skin. ICAO Annex 13.
     * Major repair: a repair
     * - (1) That, if improperly done, might appreciably affect weight, balance, structural strength, performance, powerplant operation, flight characteristics, or other qualities affecting airworthiness; or
     * -  (2) That is not done according to accepted practices or cannot be done by elementary operations.
     * 
     */
    @XmlEnumValue("Substantial")
    SUBSTANTIAL("Substantial"),

    /**
     * Minor damage: The aircraft can be rendered airworthy by simple repairs or replacement and an extensive inspection is not necessary.
     * 
     */
    @XmlEnumValue("Minor")
    MINOR("Minor"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL4325011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL4325011 fromValue(String v) {
        for (VL4325011 c: VL4325011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
