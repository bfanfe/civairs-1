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
 * <p>Classe Java pour VL166_5_0_1_2.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL166_5_0_1_2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Tricycle"/>
 *     &lt;enumeration value="Tricycle - Tricycle, retractable"/>
 *     &lt;enumeration value="Tricycle - Tricycle, fixed"/>
 *     &lt;enumeration value="Tailwheel"/>
 *     &lt;enumeration value="Tailwheel - Tailwheel/tailskid, fixed"/>
 *     &lt;enumeration value="Tailwheel - Tailwheel/tailskid, retractable"/>
 *     &lt;enumeration value="Mono-wheel"/>
 *     &lt;enumeration value="Mono-wheel - Mono-wheel/skid, fixed"/>
 *     &lt;enumeration value="Mono-wheel - Mono-wheel, retractable"/>
 *     &lt;enumeration value="Skid"/>
 *     &lt;enumeration value="Amphibious"/>
 *     &lt;enumeration value="Hull/float equipped"/>
 *     &lt;enumeration value="Ski"/>
 *     &lt;enumeration value="Quadricycle"/>
 *     &lt;enumeration value="Tandem"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL166_5_0_1_2")
@XmlEnum
public enum VL1665012 {

    @XmlEnumValue("Tricycle")
    TRICYCLE("Tricycle"),

    /**
     * Tricycle landing gear consists of a forward (nose) wheel and wheel assemblies located aft of the aircraft's centre of gravity. The nose gear is steerable by means of the rudder pedals. The landing gear can be retracted into the body (or wing). This includes landing gears in which the aircraft is, in addition to the tricycle gear, supported by a central body gear as in the MD11.
     * 
     * 
     * 
     */
    @XmlEnumValue("Tricycle - Tricycle, retractable")
    TRICYCLE_TRICYCLE_RETRACTABLE("Tricycle - Tricycle, retractable"),

    /**
     * Tricycle landing gear consists of a forward (nose) wheel and two or more wheel assemblies located aft of the aircraft’s centre of gravity. The nose gear is steerable by means of the rudder pedals. It is fixed, i.e. it cannot be retracted into the body or wing.
     * 
     * 
     */
    @XmlEnumValue("Tricycle - Tricycle, fixed")
    TRICYCLE_TRICYCLE_FIXED("Tricycle - Tricycle, fixed"),
    @XmlEnumValue("Tailwheel")
    TAILWHEEL("Tailwheel"),

    /**
     * Tailwheel/tailskid fixed is a landing gear consisting of two wheel assemblies forward of the aircraft's centre of gravity and a smaller wheel assembly or skid aft of the centre of gravity. The landing gear cannot be retracted.
     * 
     */
    @XmlEnumValue("Tailwheel - Tailwheel/tailskid, fixed")
    TAILWHEEL_TAILWHEEL_TAILSKID_FIXED("Tailwheel - Tailwheel/tailskid, fixed"),

    /**
     * Tailwheel/tailskid retractable is a landing gear consisting of retractable two wheel assemblies forward of the aircraft's centre of gravity and a smaller wheel assembly or skid aft of the centre of gravity, which may be retractable.
     * 
     */
    @XmlEnumValue("Tailwheel - Tailwheel/tailskid, retractable")
    TAILWHEEL_TAILWHEEL_TAILSKID_RETRACTABLE("Tailwheel - Tailwheel/tailskid, retractable"),
    @XmlEnumValue("Mono-wheel")
    MONO_WHEEL("Mono-wheel"),

    /**
     * This term is used for a landing gear consisting of one centered wheel or skid. Additional supports may include smaller wheels or skids. The landing gear cannot be retracted.
     * 
     */
    @XmlEnumValue("Mono-wheel - Mono-wheel/skid, fixed")
    MONO_WHEEL_MONO_WHEEL_SKID_FIXED("Mono-wheel - Mono-wheel/skid, fixed"),

    /**
     * This term is used for a landing gear consisting of one retractable centered wheel. Additional supports may include smaller wheels or skids, which may be retractable.
     * 
     */
    @XmlEnumValue("Mono-wheel - Mono-wheel, retractable")
    MONO_WHEEL_MONO_WHEEL_RETRACTABLE("Mono-wheel - Mono-wheel, retractable"),

    /**
     * Skid is a landing gear that consists of a set of beams supporting the aircraft on the ground. Skids are usually found on helicopters.
     * 
     */
    @XmlEnumValue("Skid")
    SKID("Skid"),

    /**
     * Amphibious is a landing gear that is designed to operate on water via the aircraft’s airframe or floats attached to the airframe and to operate on land via wheeled landing gear.
     * 
     */
    @XmlEnumValue("Amphibious")
    AMPHIBIOUS("Amphibious"),

    /**
     * This term is used for a landing gear that is designed to operate on water via the aircraft’s airframe or via floats attached to the airframe and does not include wheeled landing gear.
     * 
     */
    @XmlEnumValue("Hull/float equipped")
    HULL_FLOAT_EQUIPPED("Hull/float equipped"),

    /**
     * Ski is a landing gear designed to accommodate operations on snow and ice.
     * 
     */
    @XmlEnumValue("Ski")
    SKI("Ski"),

    /**
     * This term is used for a landing gear that consists of four retractable wheel assemblies: two forward and two aft of the aircraft's centre of gravity.
     * 
     */
    @XmlEnumValue("Quadricycle")
    QUADRICYCLE("Quadricycle"),

    /**
     * This term is used for a landing gear that consists of retractable two wheel assemblies mounted on the aircraft centerline one behind the other. Additional supports may include smaller wheels or skids. Tandem landing gear is also known as bicycle landing gear.
     * 
     */
    @XmlEnumValue("Tandem")
    TANDEM("Tandem"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL1665012(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL1665012 fromValue(String v) {
        for (VL1665012 c: VL1665012 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
