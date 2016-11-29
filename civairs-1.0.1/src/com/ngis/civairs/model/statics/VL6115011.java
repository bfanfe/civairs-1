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
 * <p>Classe Java pour VL611_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL611_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Climb"/>
 *     &lt;enumeration value="Descend"/>
 *     &lt;enumeration value="Turn"/>
 *     &lt;enumeration value="No response done"/>
 *     &lt;enumeration value="No response required"/>
 *     &lt;enumeration value="Reduction vertical rate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL611_5_0_1_1")
@XmlEnum
public enum VL6115011 {

    @XmlEnumValue("Climb")
    CLIMB("Climb"),
    @XmlEnumValue("Descend")
    DESCEND("Descend"),
    @XmlEnumValue("Turn")
    TURN("Turn"),
    @XmlEnumValue("No response done")
    NO_RESPONSE_DONE("No response done"),
    @XmlEnumValue("No response required")
    NO_RESPONSE_REQUIRED("No response required"),
    @XmlEnumValue("Reduction vertical rate")
    REDUCTION_VERTICAL_RATE("Reduction vertical rate");
    private final String value;

    VL6115011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL6115011 fromValue(String v) {
        for (VL6115011 c: VL6115011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
