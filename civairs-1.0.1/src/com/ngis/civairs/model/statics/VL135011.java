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
 * <p>Classe Java pour VL13_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL13_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL13_5_0_1_1")
@XmlEnum
public enum VL135011 {


    /**
     * An ATS airspace class A is one in which IFR flights only are permitted, all flights are provided with ATC service and are separated from each other. ICAO Annex 11.
     * 
     */
    A("A"),

    /**
     * An ATS airspace class B is one in which IFR and VFR flights are permitted, all flights are provided with ATC service and are separated from each other. ICAO Annex 11.
     * 
     */
    B("B"),

    /**
     * An ATS airspace class C is one in which IFR and VFR flights are permitted, all flights are provided with air traffic control service and IFR flights are separated from other IFR flights and from VFR flights. VFR flights are separated from IFR flights and receive traffic information in respect of other VFR flights. ICAO Annex 11.
     * 
     */
    C("C"),

    /**
     * An ATS airspace class D is one in which IFR and VFR flights are permitted and all flights are provided with air traffic control service, IFR flights are separated from other IFR flights and receive traffic information in respect of VFR flights, VFR flights receive traffic information in respect of all other flights. ICAO Annex 11.
     * 
     */
    D("D"),

    /**
     * An ATS airspace class E is one in which IFR and VFR flights are permitted, IFR flights are provided with air traffic control service and are separated from other IFR flights. All flights receive traffic information as far as is practical. Class E shall not be used for control zones. ICAO Annex 11.
     * 
     */
    E("E"),

    /**
     * An ATS airspace class F is one in which IFR and VFR flights are permitted, all participating IFR flights receive an air traffic advisory service and all flights receive flight information service if requested. ICAO Annex 11.
     * 
     */
    F("F"),

    /**
     * An ATS airspace class G is one in which IFR and VFR flights are permitted and receive flight information service if requested. ICAO Annex 11.
     * 
     */
    G("G"),

    /**
     * There is no ICAO definition for this type of airspace,
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL135011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL135011 fromValue(String v) {
        for (VL135011 c: VL135011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
