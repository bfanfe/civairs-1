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
 * <p>Classe Java pour VL8_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL8_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Concrete/asphalt/steel"/>
 *     &lt;enumeration value="Grass"/>
 *     &lt;enumeration value="Ice"/>
 *     &lt;enumeration value="Snow"/>
 *     &lt;enumeration value="Steel mesh"/>
 *     &lt;enumeration value="Water"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL8_5_0_1_1")
@XmlEnum
public enum VL85011 {

    @XmlEnumValue("Concrete/asphalt/steel")
    CONCRETE_ASPHALT_STEEL("Concrete/asphalt/steel"),
    @XmlEnumValue("Grass")
    GRASS("Grass"),
    @XmlEnumValue("Ice")
    ICE("Ice"),

    /**
     * Snow is precipitation in the form of feathery ice crystals or large agglomerations in the form of flakes. Snow is composed of millions of star-shaped hexagonal ice crystals. 
     * 
     */
    @XmlEnumValue("Snow")
    SNOW("Snow"),
    @XmlEnumValue("Steel mesh")
    STEEL_MESH("Steel mesh"),
    @XmlEnumValue("Water")
    WATER("Water"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL85011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL85011 fromValue(String v) {
        for (VL85011 c: VL85011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
