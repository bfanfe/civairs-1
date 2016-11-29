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
 * <p>Classe Java pour VL293_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL293_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Light"/>
 *     &lt;enumeration value="Moderate"/>
 *     &lt;enumeration value="Severe"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL293_5_0_1_1")
@XmlEnum
public enum VL2935011 {


    /**
     * No turbulence was experienced.
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * Light turbulence is that turbulence in which cabin crew can move about the aircraft without losing their balance. Turbulence that momentarily causes slight, erratic changes in altitude or attitude (this could be reported as 'light turbulence'), or turbulence that causes slight, rapid and somewhat rhythmic bumpiness without appreciable changes in altitude or attitude (this could be reported as 'light chop').
     * 
     */
    @XmlEnumValue("Light")
    LIGHT("Light"),

    /**
     * Moderate turbulence is that in which cabin crew need to use handholds to move about the cabin and meal service must be discontinued.
     * Moderate turbulence - similar to light turbulence, but greater intensity. Changes in altitude/attitude occur. Aircraft remains in control at all times. Variations in indicated air speed. 
     * Turbulence that causes changes in altitude or attitude, but in which the aircraft remains in control at all times, and that usually causes variations in indicated airspeed (IAS) (this could be reported as 'moderate turbulence'), or turbulence that causes rapid bumps or jolts without appreciable changes in aircraft
     * altitude or attitude (this could be reported as 'moderate chop').
     * 
     */
    @XmlEnumValue("Moderate")
    MODERATE("Moderate"),

    /**
     * Severe Turbulence : Turbulence which causes loose objects to move around the cabin and causes brief periods where effective control of the aircraft is impossible. It may cause damage to aircraft structures. 
     * Also:Turbulence that causes large, abrupt changes in altitude or attitude. It usually causes large variations in indicated airspeed (IAS). Aircraft may be momentarily
     * out of control.
     * Extreme turbulence is defined as causing structural damage and prolonged loss of control of the aircraft.
     * Severe and extreme turbulence can occur in convective activity (thunderstorms). 
     * Clear Air Turbulence (CAT) can occur in conjunction with the Jet Stream or in association with mountainous terrain over which high speed winds are moving.
     * 
     * 
     * 
     */
    @XmlEnumValue("Severe")
    SEVERE("Severe"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL2935011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL2935011 fromValue(String v) {
        for (VL2935011 c: VL2935011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
