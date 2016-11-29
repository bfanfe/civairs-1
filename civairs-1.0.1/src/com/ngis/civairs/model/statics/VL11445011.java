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
 * <p>Classe Java pour VL1144_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1144_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Development of eccessive drag"/>
 *     &lt;enumeration value="Failure that results in excessive imbalance"/>
 *     &lt;enumeration value="Release of the propeller or any major portion of it"/>
 *     &lt;enumeration value="Significant thrust in the opposite direction to that commanded by the pilot"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1144_5_0_1_1")
@XmlEnum
public enum VL11445011 {

    @XmlEnumValue("Development of eccessive drag")
    DEVELOPMENT_OF_ECCESSIVE_DRAG("Development of eccessive drag"),
    @XmlEnumValue("Failure that results in excessive imbalance")
    FAILURE_THAT_RESULTS_IN_EXCESSIVE_IMBALANCE("Failure that results in excessive imbalance"),
    @XmlEnumValue("Release of the propeller or any major portion of it")
    RELEASE_OF_THE_PROPELLER_OR_ANY_MAJOR_PORTION_OF_IT("Release of the propeller or any major portion of it"),
    @XmlEnumValue("Significant thrust in the opposite direction to that commanded by the pilot")
    SIGNIFICANT_THRUST_IN_THE_OPPOSITE_DIRECTION_TO_THAT_COMMANDED_BY_THE_PILOT("Significant thrust in the opposite direction to that commanded by the pilot"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    VL11445011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL11445011 fromValue(String v) {
        for (VL11445011 c: VL11445011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
