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
 * <p>Classe Java pour VL1143_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1143_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Complete inability to shut the engine down"/>
 *     &lt;enumeration value="Non-containment of high-energy debris"/>
 *     &lt;enumeration value="Significant thrust in the opposite direction"/>
 *     &lt;enumeration value="Toxic products"/>
 *     &lt;enumeration value="Uncontrolled fire"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1143_5_0_1_1")
@XmlEnum
public enum VL11435011 {

    @XmlEnumValue("Complete inability to shut the engine down")
    COMPLETE_INABILITY_TO_SHUT_THE_ENGINE_DOWN("Complete inability to shut the engine down"),
    @XmlEnumValue("Non-containment of high-energy debris")
    NON_CONTAINMENT_OF_HIGH_ENERGY_DEBRIS("Non-containment of high-energy debris"),
    @XmlEnumValue("Significant thrust in the opposite direction")
    SIGNIFICANT_THRUST_IN_THE_OPPOSITE_DIRECTION("Significant thrust in the opposite direction"),
    @XmlEnumValue("Toxic products")
    TOXIC_PRODUCTS("Toxic products"),
    @XmlEnumValue("Uncontrolled fire")
    UNCONTROLLED_FIRE("Uncontrolled fire"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    VL11435011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL11435011 fromValue(String v) {
        for (VL11435011 c: VL11435011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
