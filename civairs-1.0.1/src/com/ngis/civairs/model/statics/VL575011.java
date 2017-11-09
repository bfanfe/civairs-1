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
 * <p>Classe Java pour VL57_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL57_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Valid"/>
 *     &lt;enumeration value="Not Valid"/>
 *     &lt;enumeration value="Not applicable"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL57_5_0_1_1")
@XmlEnum
public enum VL575011 {


    /**
     * Valid
     * 
     */
    @XmlEnumValue("Valid")
    VALID("Valid"),

    /**
     * Not Valid
     * 
     */
    @XmlEnumValue("Not Valid")
    NOT_VALID("Not Valid"),

    /**
     * Not applicable
     * 
     */
    @XmlEnumValue("Not applicable")
    NOT_APPLICABLE("Not applicable"),

    /**
     * Unknown
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL575011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL575011 fromValue(String v) {
        for (VL575011 c: VL575011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
