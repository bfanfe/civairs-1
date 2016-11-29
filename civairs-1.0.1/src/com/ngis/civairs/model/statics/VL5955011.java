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
 * <p>Classe Java pour VL595_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL595_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="Incomplete"/>
 *     &lt;enumeration value="Incorrect"/>
 *     &lt;enumeration value="Late"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL595_5_0_1_1")
@XmlEnum
public enum VL5955011 {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Incomplete")
    INCOMPLETE("Incomplete"),
    @XmlEnumValue("Incorrect")
    INCORRECT("Incorrect"),
    @XmlEnumValue("Late")
    LATE("Late"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL5955011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL5955011 fromValue(String v) {
        for (VL5955011 c: VL5955011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
