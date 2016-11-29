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
 * <p>Classe Java pour VL245_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL245_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Crosswind"/>
 *     &lt;enumeration value="Head wind"/>
 *     &lt;enumeration value="Quartering headwind"/>
 *     &lt;enumeration value="Quartering tailwind"/>
 *     &lt;enumeration value="Tail wind"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL245_5_0_1_1")
@XmlEnum
public enum VL2455011 {

    @XmlEnumValue("Crosswind")
    CROSSWIND("Crosswind"),
    @XmlEnumValue("Head wind")
    HEAD_WIND("Head wind"),
    @XmlEnumValue("Quartering headwind")
    QUARTERING_HEADWIND("Quartering headwind"),
    @XmlEnumValue("Quartering tailwind")
    QUARTERING_TAILWIND("Quartering tailwind"),
    @XmlEnumValue("Tail wind")
    TAIL_WIND("Tail wind"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL2455011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL2455011 fromValue(String v) {
        for (VL2455011 c: VL2455011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
