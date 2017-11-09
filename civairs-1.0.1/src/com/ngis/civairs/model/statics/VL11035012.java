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
 * <p>Classe Java pour VL1103_5_0_1_2.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1103_5_0_1_2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Low (green)"/>
 *     &lt;enumeration value="Medium (Yellow)"/>
 *     &lt;enumeration value="High (Red)"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1103_5_0_1_2")
@XmlEnum
public enum VL11035012 {


    /**
     * The level of risk was low.
     * 
     */
    @XmlEnumValue("Low (green)")
    LOW_GREEN("Low (green)"),

    /**
     * The level of risk was medium.
     * 
     */
    @XmlEnumValue("Medium (Yellow)")
    MEDIUM_YELLOW("Medium (Yellow)"),

    /**
     * The level of risk was high.
     * 
     */
    @XmlEnumValue("High (Red)")
    HIGH_RED("High (Red)");
    private final String value;

    VL11035012(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL11035012 fromValue(String v) {
        for (VL11035012 c: VL11035012 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
