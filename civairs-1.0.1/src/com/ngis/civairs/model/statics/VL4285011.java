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
 * <p>Classe Java pour VL428_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL428_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Directly involved"/>
 *     &lt;enumeration value="Indirectly involved"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL428_5_0_1_1")
@XmlEnum
public enum VL4285011 {


    /**
     * At least one ATM event or item was in the causal chain of events leading to an accident or incident. Without that ATM event the occurrence would not have happened. 
     * 
     */
    @XmlEnumValue("Directly involved")
    DIRECTLY_INVOLVED("Directly involved"),

    /**
     * No ATM event or item was in the causal chain of events leading to an accident or incident but at least one ATM event had the potential to increase the level of risk or played a role in the occurrence encountered by the aircraft. Without such ATM event, it is considered that the accident or incident might still have happened.
     * 
     */
    @XmlEnumValue("Indirectly involved")
    INDIRECTLY_INVOLVED("Indirectly involved"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL4285011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL4285011 fromValue(String v) {
        for (VL4285011 c: VL4285011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
