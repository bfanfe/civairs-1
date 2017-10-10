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
 * <p>Classe Java pour VL598_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL598_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Level"/>
 *     &lt;enumeration value="Climb"/>
 *     &lt;enumeration value="Descent"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL598_5_0_1_1")
@XmlEnum
public enum VL5985011 {


    /**
     * Level
     * 
     */
    @XmlEnumValue("Level")
    LEVEL("Level"),

    /**
     * Climb
     * 
     */
    @XmlEnumValue("Climb")
    CLIMB("Climb"),

    /**
     * Descent
     * 
     */
    @XmlEnumValue("Descent")
    DESCENT("Descent"),

    /**
     * Unknown
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL5985011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL5985011 fromValue(String v) {
        for (VL5985011 c: VL5985011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
