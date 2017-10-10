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
 * <p>Classe Java pour VL610_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL610_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Climb"/>
 *     &lt;enumeration value="Descend"/>
 *     &lt;enumeration value="Crossing"/>
 *     &lt;enumeration value="Reversal"/>
 *     &lt;enumeration value="Increase"/>
 *     &lt;enumeration value="Reduce / Adjust"/>
 *     &lt;enumeration value="Maintain vertical speed"/>
 *     &lt;enumeration value="Monitor vertical speed"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL610_5_0_1_1")
@XmlEnum
public enum VL6105011 {

    @XmlEnumValue("Climb")
    CLIMB("Climb"),
    @XmlEnumValue("Descend")
    DESCEND("Descend"),
    @XmlEnumValue("Crossing")
    CROSSING("Crossing"),
    @XmlEnumValue("Reversal")
    REVERSAL("Reversal"),
    @XmlEnumValue("Increase")
    INCREASE("Increase"),
    @XmlEnumValue("Reduce / Adjust")
    REDUCE_ADJUST("Reduce / Adjust"),
    @XmlEnumValue("Maintain vertical speed")
    MAINTAIN_VERTICAL_SPEED("Maintain vertical speed"),
    @XmlEnumValue("Monitor vertical speed")
    MONITOR_VERTICAL_SPEED("Monitor vertical speed"),

    /**
     * An RA accurred but the exact type of RA was unknown.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL6105011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL6105011 fromValue(String v) {
        for (VL6105011 c: VL6105011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
