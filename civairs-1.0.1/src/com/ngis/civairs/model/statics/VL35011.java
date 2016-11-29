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
 * <p>Classe Java pour VL3_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL3_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Confined area"/>
 *     &lt;enumeration value="Pinnacle"/>
 *     &lt;enumeration value="Sloping"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL3_5_0_1_1")
@XmlEnum
public enum VL35011 {


    /**
     * A helicopter landing area surface whether natural or artificial which is bounded, limited, restricted, restrained, shut up or enclosed in a manner which affects the landings and take-offs.
     * 
     */
    @XmlEnumValue("Confined area")
    CONFINED_AREA("Confined area"),

    /**
     * Any natural peaked formation, e.g. a lofty rock or stone pointed at the top, a peak or a rock projecting out of the sea, which forms the helicopter landing area surface whether natural or artificial.
     * 
     */
    @XmlEnumValue("Pinnacle")
    PINNACLE("Pinnacle"),

    /**
     * The helicopter landing area surface had a gradient, either natural or artificial.
     * 
     */
    @XmlEnumValue("Sloping")
    SLOPING("Sloping"),

    /**
     * A helicopter landing area configuration other than the above.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * A helicopter landing area configuration that has not been determined.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL35011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL35011 fromValue(String v) {
        for (VL35011 c: VL35011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
