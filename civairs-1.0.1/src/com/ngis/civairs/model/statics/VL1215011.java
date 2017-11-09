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
 * <p>Classe Java pour VL121_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL121_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standing"/>
 *     &lt;enumeration value="Taxi"/>
 *     &lt;enumeration value="Take-off"/>
 *     &lt;enumeration value="En route"/>
 *     &lt;enumeration value="Approach"/>
 *     &lt;enumeration value="Landing"/>
 *     &lt;enumeration value="Manoeuvring"/>
 *     &lt;enumeration value="Post-impact"/>
 *     &lt;enumeration value="Tow"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL121_5_0_1_1")
@XmlEnum
public enum VL1215011 {


    /**
     * The phase of flight in which the occurrence took place was when the aircraft was standing.
     * 
     * The phase of flight prior to pushback or taxi, or after arrival, at the gate, ramp, or parking area, while the aircraft is stationary.
     * 
     */
    @XmlEnumValue("Standing")
    STANDING("Standing"),

    /**
     * The phase of flight in which the occurrence took place was when the aircraft was taxiing.
     * 
     * The phase of flight in which movement of an aircraft on the surface of an aerodrome under its own power occurs, excluding take-off and landing. ICAO Annex 2.
     * 
     */
    @XmlEnumValue("Taxi")
    TAXI("Taxi"),

    /**
     * The occurrence took place when the aircraft was taking off.
     * 
     * The phase of flight from the application of take-off power until reaching the first prescribed power reduction, or until reaching the VFR pattern or 1000 feet (300 metres) above runway end elevation, whichever comes first or the termination (abort) of the take-off. It includes initial climb or climb into traffic pattern.
     * 
     */
    @XmlEnumValue("Take-off")
    TAKE_OFF("Take-off"),

    /**
     * The occurrence took place when the aircraft was en-route.
     * 
     * Instrument Flight Rules (IFR): From completion of Initial Climb through cruise altitude and completion of controlled descent to the Initial Approach Fix (IAF).
     * 
     * Visual Flight Rules (VFR): From completion of Initial Climb through cruise and controlled descent to the VFR pattern altitude or 1000 feet above runway elevation, whichever comes first.
     * 
     */
    @XmlEnumValue("En route")
    EN_ROUTE("En route"),

    /**
     * The phase of flight in which the occurrence took place was when the aircraft was on approach to the aerodrome.
     * 
     * The phase of flight from the outer marker to the to the point of transition from nose-low to nose-high attitude immediately prior to the flare above the runway [IFR]; or [VFR] from 1000 feet (300 metres) above the runway end elevation or from the point of VFR pattern entry to the flare above the runway.
     * 
     */
    @XmlEnumValue("Approach")
    APPROACH("Approach"),

    /**
     * The phase of flight in which the occurrence took place was when the aircraft was landing.
     * 
     * The phase of flight from the point of transition from nose-low to nose-up attitude, immediately before landing (flare), through touchdown and until aircraft exits landing runway, comes to a stop or when power is applied for takeoff in the case of a touch-and-go landing, whichever occurs first.
     * 
     */
    @XmlEnumValue("Landing")
    LANDING("Landing"),

    /**
     * The phase of flight in which the occurrence took place was when the aircraft was manoeuvring.
     * 
     * An event involving a phase of flight in which planned low-level flight, or attitude, or planned abnormal attitude, or abnormal acceleration occurs. It includes low altitude/aerobatic flight operations.
     * 
     */
    @XmlEnumValue("Manoeuvring")
    MANOEUVRING("Manoeuvring"),

    /**
     * The phase, in an accident or incident sequence, after the aircraft has collided with the first object, place or person.
     * 
     */
    @XmlEnumValue("Post-impact")
    POST_IMPACT("Post-impact"),
    @XmlEnumValue("Tow")
    TOW("Tow"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL1215011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL1215011 fromValue(String v) {
        for (VL1215011 c: VL1215011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
