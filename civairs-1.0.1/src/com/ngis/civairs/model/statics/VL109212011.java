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
 * <p>Classe Java pour VL1092_12_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1092_12_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Radome"/>
 *     &lt;enumeration value="Windshield"/>
 *     &lt;enumeration value="Nose excluding radome / windshield"/>
 *     &lt;enumeration value="Engine 1"/>
 *     &lt;enumeration value="Engine 2"/>
 *     &lt;enumeration value="Engine 3"/>
 *     &lt;enumeration value="Engine 4"/>
 *     &lt;enumeration value="Propeller"/>
 *     &lt;enumeration value="Wing"/>
 *     &lt;enumeration value="Rotor"/>
 *     &lt;enumeration value="Fuselage"/>
 *     &lt;enumeration value="Landing gear"/>
 *     &lt;enumeration value="Tail"/>
 *     &lt;enumeration value="Lights"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1092_12_0_1_1")
@XmlEnum
public enum VL109212011 {

    @XmlEnumValue("Radome")
    RADOME("Radome"),
    @XmlEnumValue("Windshield")
    WINDSHIELD("Windshield"),
    @XmlEnumValue("Nose excluding radome / windshield")
    NOSE_EXCLUDING_RADOME_WINDSHIELD("Nose excluding radome / windshield"),
    @XmlEnumValue("Engine 1")
    ENGINE_1("Engine 1"),
    @XmlEnumValue("Engine 2")
    ENGINE_2("Engine 2"),
    @XmlEnumValue("Engine 3")
    ENGINE_3("Engine 3"),
    @XmlEnumValue("Engine 4")
    ENGINE_4("Engine 4"),
    @XmlEnumValue("Propeller")
    PROPELLER("Propeller"),
    @XmlEnumValue("Wing")
    WING("Wing"),
    @XmlEnumValue("Rotor")
    ROTOR("Rotor"),
    @XmlEnumValue("Fuselage")
    FUSELAGE("Fuselage"),
    @XmlEnumValue("Landing gear")
    LANDING_GEAR("Landing gear"),
    @XmlEnumValue("Tail")
    TAIL("Tail"),
    @XmlEnumValue("Lights")
    LIGHTS("Lights"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    VL109212011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL109212011 fromValue(String v) {
        for (VL109212011 c: VL109212011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
