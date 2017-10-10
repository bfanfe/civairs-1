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
 * <p>Classe Java pour VL232_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL232_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Electrical"/>
 *     &lt;enumeration value="Reciprocating"/>
 *     &lt;enumeration value="Turboprop"/>
 *     &lt;enumeration value="Turbofan"/>
 *     &lt;enumeration value="Turbojet"/>
 *     &lt;enumeration value="Turboshaft"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL232_5_0_1_1")
@XmlEnum
public enum VL2325011 {

    @XmlEnumValue("Electrical")
    ELECTRICAL("Electrical"),

    /**
     * Reciprocating Engine :
     * 
     * An engine, especially an internal-combustion engine, in which a piston or pistons moving back and forth work upon a crankshaft or other device to create rotational movement. 
     * 
     * Also include here: 
     * 
     * Rotary Engine
     * 
     * An engine, especially an internal-combustion engine, in which the pressure of combustion is contained in a chamber formed by part of the housing and sealed in by one face of the triangular rotor work upon a crankshaft or other device to create rotational movement.
     * 
     * Like a piston engine, the rotary engine uses the pressure created when a combination of air and fuel is burned. In a piston engine, that pressure is contained in the cylinders and forces pistons to move back and forth. The connecting rods and crankshaft convert the reciprocating motion of the pistons into rotational motion that can be used to power a car. 
     * In a rotary engine, the pressure of combustion is contained in a chamber formed by part of the housing and sealed in by one face of the triangular rotor, which is what the engine uses instead of pistons. 
     * 
     * 
     */
    @XmlEnumValue("Reciprocating")
    RECIPROCATING("Reciprocating"),

    /**
     * Turbo-Prop engine:
     * A simple turbojet core with the addition of a propeller output reduction gearbox and a propeller shaft. 
     * 
     * 	Types of Turbo-Prop 
     * 
     *  1.	Free Turbine Turbo-Prop
     *  2.	Fixed Turbine Turbo-Prop
     * 
     * 
     */
    @XmlEnumValue("Turboprop")
    TURBOPROP("Turboprop"),

    /**
     * Turbofan engine: A turbojet engine in which additional propulsive thrust is gained by extending a portion of the compressor or turbine blades outside the inner engine case. The extended blades propel bypass air flows along the engine axis but between the inner and outer engine casing. This air is not combusted but does provide additional thrust caused by the propulsive effect imparted to it by the extended compressor blading. 
     * 
     * Types of Turbo-Fan 
     * 
     *  1.	Low Bypass
     *  2.	Medium Bypass
     *  3.	High Bypass
     *  4.	Ultra-High Bypass
     * 
     * 
     */
    @XmlEnumValue("Turbofan")
    TURBOFAN("Turbofan"),

    /**
     * Turbo-Jet  engine:
     * 
     * A jet engine incorporating a turbine-driven air compressor to take in and compress the air for the combustion of fuel (or for heating by a nuclear reactor), the gases of combustion (or the heated air) being used both to rotate the turbine and to create a thrust producing jet. Often called a turbojet. 
     * 
     * 
     */
    @XmlEnumValue("Turbojet")
    TURBOJET("Turbojet"),

    /**
     * Turbo-Shaft engine:
     * A gas Turbine engine desighned for use in Rotary Wing Aircraft. Turboshaft engines provide power to a transmission unit connected to a rotar, rather than to a propeller.
     * 
     * Types of Turbo-Shaft 
     * 
     *  1.	Free Turbine Turbo-Shaft
     *  2.	Fixed Turbine Turbo-Shaft
     * 
     * 
     */
    @XmlEnumValue("Turboshaft")
    TURBOSHAFT("Turboshaft"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL2325011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL2325011 fromValue(String v) {
        for (VL2325011 c: VL2325011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
