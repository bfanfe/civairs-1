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
 * <p>Classe Java pour VL64_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL64_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Air traffic control"/>
 *     &lt;enumeration value="Flight Information service station"/>
 *     &lt;enumeration value="Operator"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL64_5_0_1_1")
@XmlEnum
public enum VL645011 {

    @XmlEnumValue("Air traffic control")
    AIR_TRAFFIC_CONTROL("Air traffic control"),

    /**
     * Flight information service. A service provided for the purpose of giving advice and information useful for the safe and efficient conduct of flights. ICAO DOC 4444.
     * 
     */
    @XmlEnumValue("Flight Information service station")
    FLIGHT_INFORMATION_SERVICE_STATION("Flight Information service station"),
    @XmlEnumValue("Operator")
    OPERATOR("Operator"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL645011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL645011 fromValue(String v) {
        for (VL645011 c: VL645011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
