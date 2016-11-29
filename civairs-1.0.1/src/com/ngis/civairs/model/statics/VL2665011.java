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
 * <p>Classe Java pour VL266_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL266_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAVOK"/>
 *     &lt;enumeration value="No significant Clouds (NSC)"/>
 *     &lt;enumeration value="Few clouds (1/8-2/8)"/>
 *     &lt;enumeration value="Scattered (3/8 to 4/8)"/>
 *     &lt;enumeration value="Broken (5/8 to 7/8)"/>
 *     &lt;enumeration value="Overcast"/>
 *     &lt;enumeration value="Sky obscured"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL266_5_0_1_1")
@XmlEnum
public enum VL2665011 {

    CAVOK("CAVOK"),
    @XmlEnumValue("No significant Clouds (NSC)")
    NO_SIGNIFICANT_CLOUDS_NSC("No significant Clouds (NSC)"),

    /**
     * Few:  sky cover classification for aviation weather observations, descriptive of a sky cover of 1/8 to 2/8.  This is applied only when obscuring phenomenon aloft are present--that is, not when obscuring phenomenon are surface-based, such as fog.
     * 
     */
    @XmlEnumValue("Few clouds (1/8-2/8)")
    FEW_CLOUDS_1_8_2_8("Few clouds (1/8-2/8)"),
    @XmlEnumValue("Scattered (3/8 to 4/8)")
    SCATTERED_3_8_TO_4_8("Scattered (3/8 to 4/8)"),
    @XmlEnumValue("Broken (5/8 to 7/8)")
    BROKEN_5_8_TO_7_8("Broken (5/8 to 7/8)"),

    /**
     * Overcast: Sky condition when 9/10 or 10/10 of the sky is covered.
     * 
     */
    @XmlEnumValue("Overcast")
    OVERCAST("Overcast"),
    @XmlEnumValue("Sky obscured")
    SKY_OBSCURED("Sky obscured"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL2665011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL2665011 fromValue(String v) {
        for (VL2665011 c: VL2665011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
