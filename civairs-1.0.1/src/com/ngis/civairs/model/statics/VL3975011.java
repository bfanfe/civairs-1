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
 * <p>Classe Java pour VL397_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL397_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Valid, no waivers"/>
 *     &lt;enumeration value="Valid, medical waivers"/>
 *     &lt;enumeration value="Not valid"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL397_5_0_1_1")
@XmlEnum
public enum VL3975011 {

    @XmlEnumValue("Valid, no waivers")
    VALID_NO_WAIVERS("Valid, no waivers"),
    @XmlEnumValue("Valid, medical waivers")
    VALID_MEDICAL_WAIVERS("Valid, medical waivers"),
    @XmlEnumValue("Not valid")
    NOT_VALID("Not valid"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL3975011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL3975011 fromValue(String v) {
        for (VL3975011 c: VL3975011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
