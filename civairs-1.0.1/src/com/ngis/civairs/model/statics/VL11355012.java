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
 * <p>Classe Java pour VL1135_5_0_1_2.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1135_5_0_1_2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fire"/>
 *     &lt;enumeration value="Shutdown"/>
 *     &lt;enumeration value="Shutdown - Shutdown - fire warning"/>
 *     &lt;enumeration value="Shutdown - Shutdown - temperature"/>
 *     &lt;enumeration value="Shutdown - Shutdown - vibration"/>
 *     &lt;enumeration value="Shutdown - Shutdown - other"/>
 *     &lt;enumeration value="Uncontained failure"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1135_5_0_1_2")
@XmlEnum
public enum VL11355012 {

    @XmlEnumValue("Fire")
    FIRE("Fire"),
    @XmlEnumValue("Shutdown")
    SHUTDOWN("Shutdown"),
    @XmlEnumValue("Shutdown - Shutdown - fire warning")
    SHUTDOWN_SHUTDOWN_FIRE_WARNING("Shutdown - Shutdown - fire warning"),
    @XmlEnumValue("Shutdown - Shutdown - temperature")
    SHUTDOWN_SHUTDOWN_TEMPERATURE("Shutdown - Shutdown - temperature"),
    @XmlEnumValue("Shutdown - Shutdown - vibration")
    SHUTDOWN_SHUTDOWN_VIBRATION("Shutdown - Shutdown - vibration"),
    @XmlEnumValue("Shutdown - Shutdown - other")
    SHUTDOWN_SHUTDOWN_OTHER("Shutdown - Shutdown - other"),
    @XmlEnumValue("Uncontained failure")
    UNCONTAINED_FAILURE("Uncontained failure"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL11355012(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL11355012 fromValue(String v) {
        for (VL11355012 c: VL11355012 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
