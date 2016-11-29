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
 * <p>Classe Java pour VL117_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL117_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Instrument flight rules (IFR)"/>
 *     &lt;enumeration value="Visual flight rules (VFR)"/>
 *     &lt;enumeration value="IFR/VFR"/>
 *     &lt;enumeration value="VFR/IFR"/>
 *     &lt;enumeration value="Controlled VFR"/>
 *     &lt;enumeration value="Special VFR"/>
 *     &lt;enumeration value="VFR night"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL117_5_0_1_1")
@XmlEnum
public enum VL1175011 {

    @XmlEnumValue("Instrument flight rules (IFR)")
    INSTRUMENT_FLIGHT_RULES_IFR("Instrument flight rules (IFR)"),
    @XmlEnumValue("Visual flight rules (VFR)")
    VISUAL_FLIGHT_RULES_VFR("Visual flight rules (VFR)"),
    @XmlEnumValue("IFR/VFR")
    IFR_VFR("IFR/VFR"),
    @XmlEnumValue("VFR/IFR")
    VFR_IFR("VFR/IFR"),

    /**
     * Controlled VFR relates to a VFR flight cleared by air traffic control to operate within a control zone in VMC.
     * 
     */
    @XmlEnumValue("Controlled VFR")
    CONTROLLED_VFR("Controlled VFR"),

    /**
     * Special VFR relates to a VFR flight cleared by air traffic control to operate within a control zone in meteorological conditions below VMC.
     * 
     */
    @XmlEnumValue("Special VFR")
    SPECIAL_VFR("Special VFR"),
    @XmlEnumValue("VFR night")
    VFR_NIGHT("VFR night"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL1175011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL1175011 fromValue(String v) {
        for (VL1175011 c: VL1175011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
