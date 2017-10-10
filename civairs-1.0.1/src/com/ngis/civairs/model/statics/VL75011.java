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
 * <p>Classe Java pour VL7_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL7_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Public aerodrome"/>
 *     &lt;enumeration value="Military airstrip, public"/>
 *     &lt;enumeration value="Private airstrip"/>
 *     &lt;enumeration value="Military airstrip"/>
 *     &lt;enumeration value="Light a/c aerodrome"/>
 *     &lt;enumeration value="Restricted aerodrome"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL7_5_0_1_1")
@XmlEnum
public enum VL75011 {


    /**
     * A defined area on land or water (including any buildings, installations and equipment) intended to be used either wholly or in part for the arrival, departure and surface movement of aircraft.
     * 
     */
    @XmlEnumValue("Public aerodrome")
    PUBLIC_AERODROME("Public aerodrome"),

    /**
     * A strip of land prepared for the taking off and landing of military aircraft which is available for use by the public.
     * 
     */
    @XmlEnumValue("Military airstrip, public")
    MILITARY_AIRSTRIP_PUBLIC("Military airstrip, public"),

    /**
     * A strip of land prepared for the taking off and landing of aircraft, that is not available for normal commercial operations.
     * 
     */
    @XmlEnumValue("Private airstrip")
    PRIVATE_AIRSTRIP("Private airstrip"),

    /**
     * A strip of land prepared for the taking off and landing of military aircraft which is not available for use by the public.
     * 
     */
    @XmlEnumValue("Military airstrip")
    MILITARY_AIRSTRIP("Military airstrip"),

    /**
     * A defined area on land or water (including any buildings, installations and equipment) intended to be used either wholly or in part for the arrival, departure and surface movement of gliders and microlight aircraft.
     * 
     */
    @XmlEnumValue("Light a/c aerodrome")
    LIGHT_A_C_AERODROME("Light a/c aerodrome"),

    /**
     * A defined area on land or water (including any buildings, installations and equipment) intended to be used either wholly or in part for the arrival, departure and surface movement of certain types of aircraft and/or certain users.
     * 
     */
    @XmlEnumValue("Restricted aerodrome")
    RESTRICTED_AERODROME("Restricted aerodrome"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL75011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL75011 fromValue(String v) {
        for (VL75011 c: VL75011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
