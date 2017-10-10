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
 * <p>Classe Java pour VL168_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL168_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dawn"/>
 *     &lt;enumeration value="Daylight"/>
 *     &lt;enumeration value="Dusk/twilight"/>
 *     &lt;enumeration value="Night/dark"/>
 *     &lt;enumeration value="Night/moonlight"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL168_5_0_1_1")
@XmlEnum
public enum VL1685011 {


    /**
     * Dawn is the first appearance of light in the sky before sunrise, or the time when it appears; the beginning of daylight; morning twilight, daybreak.
     * 
     * Twilight:  The intervals of incomplete darkness following sunset and preceding sunrise.  The time at which evening twilight ends or morning twilight begins is determined by arbritrary convention, and several kinds of twilight have been defined and used; most commonly civil, nautical, and astronomical twilight. 
     * 
     *  1) Civil Twilight:  The period of time before sunrise and after sunset when the sun is not more than 6 degrees below the horizon. 
     * 
     *  2) Nautical Twilight:  The period of time before sunrise and after sunset when the sun is not more than 12 degrees below the horizon. 
     * 
     *  3) Astronomical Twilight:  The period of time before sunrise and sunset when the sun is not more than 18 degrees below the horizon.
     * 
     * 
     * 
     */
    @XmlEnumValue("Dawn")
    DAWN("Dawn"),

    /**
     * Daylight is the light available naturally between sunrise and sunset.
     * 
     */
    @XmlEnumValue("Daylight")
    DAYLIGHT("Daylight"),

    /**
     * Dusk is the darker stage of twilight before it is quite dark at night.
     * 
     * Twilight:  The intervals of incomplete darkness following sunset and preceding sunrise.  The time at which evening twilight ends or morning twilight begins is determined by arbritrary convention, and several kinds of twilight have been defined and used; most commonly civil, nautical, and astronomical twilight. 
     * 
     *  1) Civil Twilight:  The period of time before sunrise and after sunset when the sun is not more than 6 degrees below the horizon. 
     * 
     *  2) Nautical Twilight:  The period of time before sunrise and after sunset when the sun is not more than 12 degrees below the horizon. 
     * 
     *  3) Astronomical Twilight:  The period of time before sunrise and sunset when the sun is not more than 18 degrees below the horizon.
     * 
     * 
     * 
     */
    @XmlEnumValue("Dusk/twilight")
    DUSK_TWILIGHT("Dusk/twilight"),

    /**
     * Night is that part of the natural day (of 24 hours) during which no light is received from the sun; the time between the end of evening twilight and the beginning of morning twilight.
     * 
     */
    @XmlEnumValue("Night/dark")
    NIGHT_DARK("Night/dark"),

    /**
     * Night is that part of the natural day (of 24 hours) during which no light is received from the sun; the time between the end of evening twilight and the beginning of morning twilight.
     * 
     */
    @XmlEnumValue("Night/moonlight")
    NIGHT_MOONLIGHT("Night/moonlight"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL1685011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL1685011 fromValue(String v) {
        for (VL1685011 c: VL1685011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
