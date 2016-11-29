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
 * <p>Classe Java pour VL1028_5_0_1_2.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1028_5_0_1_2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Structures"/>
 *     &lt;enumeration value="Structures - Building/houses"/>
 *     &lt;enumeration value="Structures - Hospital/medical centre"/>
 *     &lt;enumeration value="Structures - School/university"/>
 *     &lt;enumeration value="Structures - Residential area"/>
 *     &lt;enumeration value="Structures - Industrial Building"/>
 *     &lt;enumeration value="Structures - Industrial area/park"/>
 *     &lt;enumeration value="Structures - Powerlines/cables"/>
 *     &lt;enumeration value="Structures - Aerodrome facilities"/>
 *     &lt;enumeration value="Structures - Fence/Pole"/>
 *     &lt;enumeration value="Structures - Windturbine"/>
 *     &lt;enumeration value="Objects"/>
 *     &lt;enumeration value="Objects - Parked aircraft - unoccupied aircraft"/>
 *     &lt;enumeration value="Objects - Vehicle – on aerodrome"/>
 *     &lt;enumeration value="Objects - Vehicle – off aerodrome"/>
 *     &lt;enumeration value="Objects - Crane"/>
 *     &lt;enumeration value="Environment"/>
 *     &lt;enumeration value="Environment - Crop/vegetation"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1028_5_0_1_2")
@XmlEnum
public enum VL10285012 {


    /**
     * Structures were damaged by impact.
     * 
     */
    @XmlEnumValue("Structures")
    STRUCTURES("Structures"),

    /**
     * A Building/house was damaged by impact.
     * 
     */
    @XmlEnumValue("Structures - Building/houses")
    STRUCTURES_BUILDING_HOUSES("Structures - Building/houses"),

    /**
     * An hospital/medical centre was damaged by impact.
     * 
     */
    @XmlEnumValue("Structures - Hospital/medical centre")
    STRUCTURES_HOSPITAL_MEDICAL_CENTRE("Structures - Hospital/medical centre"),

    /**
     * A school/university was damaged by impact.
     * 
     */
    @XmlEnumValue("Structures - School/university")
    STRUCTURES_SCHOOL_UNIVERSITY("Structures - School/university"),

    /**
     * A residential area was damaged by impact.
     * 
     */
    @XmlEnumValue("Structures - Residential area")
    STRUCTURES_RESIDENTIAL_AREA("Structures - Residential area"),

    /**
     * An industrial building was damaged by impact.
     * 
     */
    @XmlEnumValue("Structures - Industrial Building")
    STRUCTURES_INDUSTRIAL_BUILDING("Structures - Industrial Building"),

    /**
     * An industrial area/park was damaged by impact.
     * 
     */
    @XmlEnumValue("Structures - Industrial area/park")
    STRUCTURES_INDUSTRIAL_AREA_PARK("Structures - Industrial area/park"),

    /**
     * A powerline/cable was damaged by impact.
     * 
     */
    @XmlEnumValue("Structures - Powerlines/cables")
    STRUCTURES_POWERLINES_CABLES("Structures - Powerlines/cables"),

    /**
     *  Aerodrome facilities were damaged by impact.
     * 
     */
    @XmlEnumValue("Structures - Aerodrome facilities")
    STRUCTURES_AERODROME_FACILITIES("Structures - Aerodrome facilities"),

    /**
     * A fence/pole was damaged by impact.
     * 
     */
    @XmlEnumValue("Structures - Fence/Pole")
    STRUCTURES_FENCE_POLE("Structures - Fence/Pole"),

    /**
     * A windturbine was damaged by impact.
     * 
     */
    @XmlEnumValue("Structures - Windturbine")
    STRUCTURES_WINDTURBINE("Structures - Windturbine"),

    /**
     * Objects other than structures were damaged by impact.
     * 
     */
    @XmlEnumValue("Objects")
    OBJECTS("Objects"),

    /**
     * A parked aircraft, without any person on board, was damaged by impact.
     * 
     */
    @XmlEnumValue("Objects - Parked aircraft - unoccupied aircraft")
    OBJECTS_PARKED_AIRCRAFT_UNOCCUPIED_AIRCRAFT("Objects - Parked aircraft - unoccupied aircraft"),

    /**
     * A type of vehicle, on the aerodrome/airstrip, was damaged by impact. To cover damages on other vehicles, cars, bikes, etc.
     * 
     */
    @XmlEnumValue("Objects - Vehicle \u2013 on aerodrome")
    OBJECTS_VEHICLE_ON_AERODROME("Objects - Vehicle \u2013 on aerodrome"),

    /**
     * A type of vehicle, off the aerodrome/airstrip, was damaged by impact.
     * 
     */
    @XmlEnumValue("Objects - Vehicle \u2013 off aerodrome")
    OBJECTS_VEHICLE_OFF_AERODROME("Objects - Vehicle \u2013 off aerodrome"),

    /**
     * A crane was damaged by impact.
     * 
     */
    @XmlEnumValue("Objects - Crane")
    OBJECTS_CRANE("Objects - Crane"),

    /**
     * Any environmental damage resulting from the aircraft impact.
     * 
     */
    @XmlEnumValue("Environment")
    ENVIRONMENT("Environment"),

    /**
     * To cover crop damage, e.g. environmental damage resulting
     * from leaking/spilled aircraft fluids
     * 
     * 
     */
    @XmlEnumValue("Environment - Crop/vegetation")
    ENVIRONMENT_CROP_VEGETATION("Environment - Crop/vegetation"),
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * Objects damaged by impact were other than those listed above.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The type of objects damaged by impact is unknown.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL10285012(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL10285012 fromValue(String v) {
        for (VL10285012 c: VL10285012 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
