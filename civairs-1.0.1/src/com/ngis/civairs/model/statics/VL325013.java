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
 * <p>Classe Java pour VL32_5_0_1_3.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL32_5_0_1_3">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fixed wing"/>
 *     &lt;enumeration value="Fixed wing - Aeroplane"/>
 *     &lt;enumeration value="Fixed wing - Glider"/>
 *     &lt;enumeration value="Fixed wing - Glider - Glider - not powered"/>
 *     &lt;enumeration value="Fixed wing - Glider - Glider - powered - fixed powerplant installation"/>
 *     &lt;enumeration value="Fixed wing - Glider - Glider - powered - powerplant retractable"/>
 *     &lt;enumeration value="Fixed wing - UAS"/>
 *     &lt;enumeration value="Fixed wing - UAS - UAS - Model aircraft"/>
 *     &lt;enumeration value="Fixed wing - UAS - UAS - Other"/>
 *     &lt;enumeration value="Fixed wing - Other"/>
 *     &lt;enumeration value="Rotorcraft"/>
 *     &lt;enumeration value="Rotorcraft - Helicopter"/>
 *     &lt;enumeration value="Rotorcraft - Gyroplane"/>
 *     &lt;enumeration value="Rotorcraft - UAS (rotorcraft)"/>
 *     &lt;enumeration value="Rotorcraft - UAS (rotorcraft) - UAS (rotorcraft) - Model aircraft"/>
 *     &lt;enumeration value="Rotorcraft - UAS (rotorcraft) - UAS - Other (rotorcraft)"/>
 *     &lt;enumeration value="Rotorcraft - Other"/>
 *     &lt;enumeration value="Lighter than air"/>
 *     &lt;enumeration value="Lighter than air - Airship"/>
 *     &lt;enumeration value="Lighter than air - Airship - Airship - Gas - non-rigid structure"/>
 *     &lt;enumeration value="Lighter than air - Airship - Airship - Gas - rigid structure"/>
 *     &lt;enumeration value="Lighter than air - Airship - Hot air airship"/>
 *     &lt;enumeration value="Lighter than air - Balloon"/>
 *     &lt;enumeration value="Lighter than air - Balloon - Balloon - Gas - free"/>
 *     &lt;enumeration value="Lighter than air - Balloon - Balloon - Gas - tethered"/>
 *     &lt;enumeration value="Lighter than air - Balloon - Balloon - Hot air"/>
 *     &lt;enumeration value="Lighter than air - UAS (lighter than air)"/>
 *     &lt;enumeration value="Lighter than air - Other"/>
 *     &lt;enumeration value="Microlight"/>
 *     &lt;enumeration value="Microlight - Fixed-wing microlight"/>
 *     &lt;enumeration value="Microlight - Flexwing microlight"/>
 *     &lt;enumeration value="Microlight - Ultralight sailplane"/>
 *     &lt;enumeration value="Microlight - Other"/>
 *     &lt;enumeration value="Hybrid"/>
 *     &lt;enumeration value="Hybrid - Tilt-rotor"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Other - Hang-glider"/>
 *     &lt;enumeration value="Other - Hang-glider powered"/>
 *     &lt;enumeration value="Other - Parachute"/>
 *     &lt;enumeration value="Other - Para-glider"/>
 *     &lt;enumeration value="Other - Para-glider powered"/>
 *     &lt;enumeration value="Other - Para-motors/para-planes"/>
 *     &lt;enumeration value="Other - Rocket"/>
 *     &lt;enumeration value="Other - Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL32_5_0_1_3")
@XmlEnum
public enum VL325013 {

    @XmlEnumValue("Fixed wing")
    FIXED_WING("Fixed wing"),

    /**
     * A fixed wing aeroplane is a heavier than air aircraft with wings which remained in a fixed position under given conditions of flight. May include variable geometry aircraft.
     * 
     */
    @XmlEnumValue("Fixed wing - Aeroplane")
    FIXED_WING_AEROPLANE("Fixed wing - Aeroplane"),

    /**
     * JAR:‘Sailplane’ means a heavier-than-air aircraft that is supported in flight by the dynamic reaction of the air against its fixed lifting surfaces, the free flight of which does not depend on an engine.
     * 
     */
    @XmlEnumValue("Fixed wing - Glider")
    FIXED_WING_GLIDER("Fixed wing - Glider"),
    @XmlEnumValue("Fixed wing - Glider - Glider - not powered")
    FIXED_WING_GLIDER_GLIDER_NOT_POWERED("Fixed wing - Glider - Glider - not powered"),
    @XmlEnumValue("Fixed wing - Glider - Glider - powered - fixed powerplant installation")
    FIXED_WING_GLIDER_GLIDER_POWERED_FIXED_POWERPLANT_INSTALLATION("Fixed wing - Glider - Glider - powered - fixed powerplant installation"),
    @XmlEnumValue("Fixed wing - Glider - Glider - powered - powerplant retractable")
    FIXED_WING_GLIDER_GLIDER_POWERED_POWERPLANT_RETRACTABLE("Fixed wing - Glider - Glider - powered - powerplant retractable"),

    /**
     * The category of aircraft was UAS, also known as UAV and RPAS.
     * 
     */
    @XmlEnumValue("Fixed wing - UAS")
    FIXED_WING_UAS("Fixed wing - UAS"),

    /**
     * UAS - Unmanned Aircraft System Model aircraft (radio controlled, etc.), also known as UAV and RPAS
     * 
     */
    @XmlEnumValue("Fixed wing - UAS - UAS - Model aircraft")
    FIXED_WING_UAS_UAS_MODEL_AIRCRAFT("Fixed wing - UAS - UAS - Model aircraft"),

    /**
     * UAV - Other, also known as UAV and RPAS
     * 
     */
    @XmlEnumValue("Fixed wing - UAS - UAS - Other")
    FIXED_WING_UAS_UAS_OTHER("Fixed wing - UAS - UAS - Other"),
    @XmlEnumValue("Fixed wing - Other")
    FIXED_WING_OTHER("Fixed wing - Other"),
    @XmlEnumValue("Rotorcraft")
    ROTORCRAFT("Rotorcraft"),

    /**
     * A helicopter is a heavier-than-air aircraft supported in flight chiefly by the reactions of the air on one or more power driven rotors on substantially vertical axes.
     * 
     */
    @XmlEnumValue("Rotorcraft - Helicopter")
    ROTORCRAFT_HELICOPTER("Rotorcraft - Helicopter"),

    /**
     * A heavier-than-air aircraft supported in flight by the reactions of the air on one or more rotors which rotate freely on substantially vertical axes.
     *  (An 7)
     *  Formerly known as "autogyro"
     * 
     */
    @XmlEnumValue("Rotorcraft - Gyroplane")
    ROTORCRAFT_GYROPLANE("Rotorcraft - Gyroplane"),

    /**
     * UAS Unmanned Aircraft System (rotorcraft), also known as UAV and RPAS.
     * 
     */
    @XmlEnumValue("Rotorcraft - UAS (rotorcraft)")
    ROTORCRAFT_UAS_ROTORCRAFT("Rotorcraft - UAS (rotorcraft)"),

    /**
     * UAS Unmanned Aircraft System (rotorcraft) - Model aircraft (radio controlled, etc.), also known as UAV and RPAS.
     * 
     */
    @XmlEnumValue("Rotorcraft - UAS (rotorcraft) - UAS (rotorcraft) - Model aircraft")
    ROTORCRAFT_UAS_ROTORCRAFT_UAS_ROTORCRAFT_MODEL_AIRCRAFT("Rotorcraft - UAS (rotorcraft) - UAS (rotorcraft) - Model aircraft"),

    /**
     * Other UAS Unmanned Aircraft System (rotorcraft), also known as UAV and RPAS
     * 
     */
    @XmlEnumValue("Rotorcraft - UAS (rotorcraft) - UAS - Other (rotorcraft)")
    ROTORCRAFT_UAS_ROTORCRAFT_UAS_OTHER_ROTORCRAFT("Rotorcraft - UAS (rotorcraft) - UAS - Other (rotorcraft)"),
    @XmlEnumValue("Rotorcraft - Other")
    ROTORCRAFT_OTHER("Rotorcraft - Other"),
    @XmlEnumValue("Lighter than air")
    LIGHTER_THAN_AIR("Lighter than air"),

    /**
     * A power-driven lighter-than-air aircraft. (An 7)
     * 
     */
    @XmlEnumValue("Lighter than air - Airship")
    LIGHTER_THAN_AIR_AIRSHIP("Lighter than air - Airship"),
    @XmlEnumValue("Lighter than air - Airship - Airship - Gas - non-rigid structure")
    LIGHTER_THAN_AIR_AIRSHIP_AIRSHIP_GAS_NON_RIGID_STRUCTURE("Lighter than air - Airship - Airship - Gas - non-rigid structure"),
    @XmlEnumValue("Lighter than air - Airship - Airship - Gas - rigid structure")
    LIGHTER_THAN_AIR_AIRSHIP_AIRSHIP_GAS_RIGID_STRUCTURE("Lighter than air - Airship - Airship - Gas - rigid structure"),
    @XmlEnumValue("Lighter than air - Airship - Hot air airship")
    LIGHTER_THAN_AIR_AIRSHIP_HOT_AIR_AIRSHIP("Lighter than air - Airship - Hot air airship"),

    /**
     * A non-power-driven lighter-than-air aircraft. 
     *  Note.- For the purposes of ICAO Annex 1, this definition applies to free balloons. 
     *  The note to the above definition appears only in ICAO Annex 1.
     * 
     */
    @XmlEnumValue("Lighter than air - Balloon")
    LIGHTER_THAN_AIR_BALLOON("Lighter than air - Balloon"),
    @XmlEnumValue("Lighter than air - Balloon - Balloon - Gas - free")
    LIGHTER_THAN_AIR_BALLOON_BALLOON_GAS_FREE("Lighter than air - Balloon - Balloon - Gas - free"),
    @XmlEnumValue("Lighter than air - Balloon - Balloon - Gas - tethered")
    LIGHTER_THAN_AIR_BALLOON_BALLOON_GAS_TETHERED("Lighter than air - Balloon - Balloon - Gas - tethered"),
    @XmlEnumValue("Lighter than air - Balloon - Balloon - Hot air")
    LIGHTER_THAN_AIR_BALLOON_BALLOON_HOT_AIR("Lighter than air - Balloon - Balloon - Hot air"),

    /**
     * UAS Unmanned Aircraft System, also known as UAV and RPAS.
     * 
     */
    @XmlEnumValue("Lighter than air - UAS (lighter than air)")
    LIGHTER_THAN_AIR_UAS_LIGHTER_THAN_AIR("Lighter than air - UAS (lighter than air)"),
    @XmlEnumValue("Lighter than air - Other")
    LIGHTER_THAN_AIR_OTHER("Lighter than air - Other"),

    /**
     * May also be called "ultra-light".
     * The definitions vary from State to State. 
     * One definition in ICAO documentation reads: an aircraft having a MTOM not exceeding 454 kg.  (1 000 lbs) which is not usually used for public transport purposes. (ICAO Doc 9626, 1996, 1st ed., p. 5.2-2)  
     * JAR definition: ‘Microlight’ is an aeroplane having no more than two seats, Vs,, not exceeding 35 knots (65 KM/h) CAS, and
     * a maximum take-off mass of no more than:-
     *  300 kg for a landplane, single seater; or
     *  330 kg for an amphibian or floatplane, single seater; or
     *  495 kg for an amphibian or floatplane, two-seater, provided that a microlight capable of operating as
     * both a floatplane and a landplane falls below both MTOM limits, as appropriate.
     * - 450 kg for a landplane, two-seater; or
     * Note: Foot-launched aircraft are excluded from this definition.
     * 
     */
    @XmlEnumValue("Microlight")
    MICROLIGHT("Microlight"),
    @XmlEnumValue("Microlight - Fixed-wing microlight")
    MICROLIGHT_FIXED_WING_MICROLIGHT("Microlight - Fixed-wing microlight"),
    @XmlEnumValue("Microlight - Flexwing microlight")
    MICROLIGHT_FLEXWING_MICROLIGHT("Microlight - Flexwing microlight"),
    @XmlEnumValue("Microlight - Ultralight sailplane")
    MICROLIGHT_ULTRALIGHT_SAILPLANE("Microlight - Ultralight sailplane"),
    @XmlEnumValue("Microlight - Other")
    MICROLIGHT_OTHER("Microlight - Other"),
    @XmlEnumValue("Hybrid")
    HYBRID("Hybrid"),
    @XmlEnumValue("Hybrid - Tilt-rotor")
    HYBRID_TILT_ROTOR("Hybrid - Tilt-rotor"),

    /**
     * e.g.: Parachute, Para-glider, Hang-glider, etc.
     * Ornithopter: A heavier-than-air aircraft supported in flight chiefly by the reactions of the air on planes to which a flapping motion is imparted. ICAO Annex 7.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Other - Hang-glider")
    OTHER_HANG_GLIDER("Other - Hang-glider"),
    @XmlEnumValue("Other - Hang-glider powered")
    OTHER_HANG_GLIDER_POWERED("Other - Hang-glider powered"),
    @XmlEnumValue("Other - Parachute")
    OTHER_PARACHUTE("Other - Parachute"),
    @XmlEnumValue("Other - Para-glider")
    OTHER_PARA_GLIDER("Other - Para-glider"),
    @XmlEnumValue("Other - Para-glider powered")
    OTHER_PARA_GLIDER_POWERED("Other - Para-glider powered"),
    @XmlEnumValue("Other - Para-motors/para-planes")
    OTHER_PARA_MOTORS_PARA_PLANES("Other - Para-motors/para-planes"),
    @XmlEnumValue("Other - Rocket")
    OTHER_ROCKET("Other - Rocket"),
    @XmlEnumValue("Other - Other")
    OTHER_OTHER("Other - Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL325013(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL325013 fromValue(String v) {
        for (VL325013 c: VL325013 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
