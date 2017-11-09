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
 * <p>Classe Java pour VL451_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL451_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fatal"/>
 *     &lt;enumeration value="Serious"/>
 *     &lt;enumeration value="Minor"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL451_5_0_1_1")
@XmlEnum
public enum VL4515011 {


    /**
     * For statistical purposes "Fatal" is death from an injury received in the occurrence which occurs within 30 days of the accident. ICAO Annex 13.
     * 
     */
    @XmlEnumValue("Fatal")
    FATAL("Fatal"),

    /**
     * A serious injury is an injury sustained by a person in an accident and which:
     *  a) requires hospitalization for more than 48 hours, commencing within 48 hours from the date when the injury was received; or
     *  b) results in a fracture of any bone (except simple fractures of fingers, toes, or nose or;
     *  c) involves lacerations which cause severe hemorrhage, nerve, muscle or tendon damage; or
     *  d) involves injury to any internal organ; or
     *  e) involves second or third degree burns, or any burns affecting more than 5 percent of te body surface; or
     *  f) involves verified exposure to infectious substances or injurious radiation.
     * 
     */
    @XmlEnumValue("Serious")
    SERIOUS("Serious"),
    @XmlEnumValue("Minor")
    MINOR("Minor"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL4515011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL4515011 fromValue(String v) {
        for (VL4515011 c: VL4515011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
