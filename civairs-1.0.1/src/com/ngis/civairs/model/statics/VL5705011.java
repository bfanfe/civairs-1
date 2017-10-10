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
 * <p>Classe Java pour VL570_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL570_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Converging tracks"/>
 *     &lt;enumeration value="Crossing tracks"/>
 *     &lt;enumeration value="Parallel tracks"/>
 *     &lt;enumeration value="Same Tracks"/>
 *     &lt;enumeration value="Diverging Tracks"/>
 *     &lt;enumeration value="Reciprocal Tracks"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL570_5_0_1_1")
@XmlEnum
public enum VL5705011 {

    @XmlEnumValue("Converging tracks")
    CONVERGING_TRACKS("Converging tracks"),

    /**
     * Crossing tracks are intersecting tracks where one track is separated from another by more than 45 degrees or from a reciprocal track by more than 45 degrees.
     * 
     */
    @XmlEnumValue("Crossing tracks")
    CROSSING_TRACKS("Crossing tracks"),
    @XmlEnumValue("Parallel tracks")
    PARALLEL_TRACKS("Parallel tracks"),
    @XmlEnumValue("Same Tracks")
    SAME_TRACKS("Same Tracks"),
    @XmlEnumValue("Diverging Tracks")
    DIVERGING_TRACKS("Diverging Tracks"),
    @XmlEnumValue("Reciprocal Tracks")
    RECIPROCAL_TRACKS("Reciprocal Tracks"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL5705011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL5705011 fromValue(String v) {
        for (VL5705011 c: VL5705011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
