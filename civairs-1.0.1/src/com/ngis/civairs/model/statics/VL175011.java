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
 * <p>Classe Java pour VL17_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL17_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Aerobatics"/>
 *     &lt;enumeration value="Airshow"/>
 *     &lt;enumeration value="Balloons"/>
 *     &lt;enumeration value="Calibration flights"/>
 *     &lt;enumeration value="Glider"/>
 *     &lt;enumeration value="Military exercise"/>
 *     &lt;enumeration value="Model aircraft"/>
 *     &lt;enumeration value="Parachuting"/>
 *     &lt;enumeration value="Training flights"/>
 *     &lt;enumeration value="UAS / RPAS"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL17_5_0_1_1")
@XmlEnum
public enum VL175011 {


    /**
     * Aerobatics is the practice of flying maneuvers involving aircraft attitudes that are not used in normal flight. The term is sometimes referred to as acrobatics, especially when translated
     * 
     */
    @XmlEnumValue("Aerobatics")
    AEROBATICS("Aerobatics"),

    /**
     * An airshow is a demonstration involving display aircraft flying in the airspace.
     * 
     */
    @XmlEnumValue("Airshow")
    AIRSHOW("Airshow"),
    @XmlEnumValue("Balloons")
    BALLOONS("Balloons"),

    /**
     * A calibration flight is the operation of an aircraft in the airspace to calibrate the aerodrome and area navigation and approach aids. It is a planned and co-ordinated flights for the purpose of verification of navaids performance that may generate restrictions to other traffic.
     * 
     */
    @XmlEnumValue("Calibration flights")
    CALIBRATION_FLIGHTS("Calibration flights"),

    /**
     * Gliding is flying an aeroplane which is without engine power.
     * 
     */
    @XmlEnumValue("Glider")
    GLIDER("Glider"),

    /**
     * Planned and co-ordinated, either routine or non routine military activity.
     * 
     */
    @XmlEnumValue("Military exercise")
    MILITARY_EXERCISE("Military exercise"),
    @XmlEnumValue("Model aircraft")
    MODEL_AIRCRAFT("Model aircraft"),

    /**
     * Parachuting is the use of any contrivance, natural or artificial which serves to check a fall through the air, or to support a person in the air.
     * 
     */
    @XmlEnumValue("Parachuting")
    PARACHUTING("Parachuting"),

    /**
     * A training flight is the operation of an aircraft in the airspace for the purpose of flight instruction.
     * 
     */
    @XmlEnumValue("Training flights")
    TRAINING_FLIGHTS("Training flights"),

    /**
     * The special activity in the airspace was Unmanned Aircraft Systems / Remotely Piloted Aircraft Systems
     * 
     */
    @XmlEnumValue("UAS / RPAS")
    UAS_RPAS("UAS / RPAS"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL175011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL175011 fromValue(String v) {
        for (VL175011 c: VL175011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
