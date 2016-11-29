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
 * <p>Classe Java pour VL402_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL402_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pilot-in-command"/>
 *     &lt;enumeration value="Co-pilot"/>
 *     &lt;enumeration value="Flight engineer"/>
 *     &lt;enumeration value="Dual student"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL402_5_0_1_1")
@XmlEnum
public enum VL4025011 {

    @XmlEnumValue("Pilot-in-command")
    PILOT_IN_COMMAND("Pilot-in-command"),

    /**
     * Co-pilot. A licensed pilot serving in any piloting capacity other than as pilot-in-command but excluding a pilot who is on board the aircraft for the sole purpose of receiving flight instruction. ICAO Annex 1
     * 
     */
    @XmlEnumValue("Co-pilot")
    CO_PILOT("Co-pilot"),

    /**
     * The person other than one of the pilots, responsible for the operation and safety of the aircraft systems and engines during flight time.
     * 
     */
    @XmlEnumValue("Flight engineer")
    FLIGHT_ENGINEER("Flight engineer"),
    @XmlEnumValue("Dual student")
    DUAL_STUDENT("Dual student"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL4025011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL4025011 fromValue(String v) {
        for (VL4025011 c: VL4025011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
