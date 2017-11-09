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
 * <p>Classe Java pour VL29_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL29_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GAT"/>
 *     &lt;enumeration value="OAT"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL29_5_0_1_1")
@XmlEnum
public enum VL295011 {


    /**
     * General Air Traffic:
     *  GAT encompasses all flights conducted in accordance with rules and procedures of ICAO
     *  Note.-GAT can include military flights for which ICAO rules and procedures satisfy entirely their operational requirements.e.g. military transport aircraft flying on a civil airway route
     * 
     */
    GAT("GAT"),

    /**
     * Operational Air Traffic:
     *  OAT encompasses all flights which do not comply with the provisions stated for GAT and for which rules and procedures have been specified by appropriate national authorities.
     *  Note.- OAT can include civil flights such as test-flights which require some deviation from ICAO rules to satisfy their operational requirements.
     * 
     */
    OAT("OAT"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL295011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL295011 fromValue(String v) {
        for (VL295011 c: VL295011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
