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
 * <p>Classe Java pour VL1072_12_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1072_12_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="“Follow Me” Vehicle"/>
 *     &lt;enumeration value="Air Start Unit"/>
 *     &lt;enumeration value="Bird control vehicle"/>
 *     &lt;enumeration value="Bus"/>
 *     &lt;enumeration value="Car"/>
 *     &lt;enumeration value="Catering truck"/>
 *     &lt;enumeration value="Construction work vehicle"/>
 *     &lt;enumeration value="Fire Services vehicle"/>
 *     &lt;enumeration value="FO and runway inspection vehicle"/>
 *     &lt;enumeration value="Forklift"/>
 *     &lt;enumeration value="General use Tractor"/>
 *     &lt;enumeration value="Lavatory service vehicle"/>
 *     &lt;enumeration value="Maintenance vehicle"/>
 *     &lt;enumeration value="Medical services vehicle"/>
 *     &lt;enumeration value="Military vehicle"/>
 *     &lt;enumeration value="Pallet/container loading vehicle "/>
 *     &lt;enumeration value="Passenger steps/stairs vehicle"/>
 *     &lt;enumeration value="Police vehicle"/>
 *     &lt;enumeration value="Refuelling truck"/>
 *     &lt;enumeration value="Security vehicle"/>
 *     &lt;enumeration value="Snow clearing vehicle"/>
 *     &lt;enumeration value="Tugging / Towing vehicle"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1072_12_0_1_1")
@XmlEnum
public enum VL107212011 {


    /**
     * A vehicle used for ground guidance purposes
     * 
     */
    @XmlEnumValue("\u201cFollow Me\u201d Vehicle")
    FOLLOW_ME_VEHICLE("\u201cFollow Me\u201d Vehicle"),

    /**
     * A vehicle equipped with an air start unit, supplying air pressure to aircraft
     * 
     */
    @XmlEnumValue("Air Start Unit")
    AIR_START_UNIT("Air Start Unit"),

    /**
     * A vehicle used for bird control purposes
     * 
     */
    @XmlEnumValue("Bird control vehicle")
    BIRD_CONTROL_VEHICLE("Bird control vehicle"),

    /**
     * A bus used for the transportation of passengers and/or crew
     * 
     */
    @XmlEnumValue("Bus")
    BUS("Bus"),

    /**
     * A car used for the transportation of passengers or for other ground handling services (e.g. aircraft dispatching)
     * 
     */
    @XmlEnumValue("Car")
    CAR("Car"),

    /**
     * A truck used for supplying aircraft with catering related material
     * 
     */
    @XmlEnumValue("Catering truck")
    CATERING_TRUCK("Catering truck"),

    /**
     * Construction work vehicle	A vehicle used for construction, maintenance or other engineering work at the aerodrome
     * 
     */
    @XmlEnumValue("Construction work vehicle")
    CONSTRUCTION_WORK_VEHICLE("Construction work vehicle"),

    /**
     * A vehicle used for fire suppression purposes
     * 
     */
    @XmlEnumValue("Fire Services vehicle")
    FIRE_SERVICES_VEHICLE("Fire Services vehicle"),

    /**
     * A vehicle used for aerodrome surfaces inspection including foreign objects (FO)   
     * 
     */
    @XmlEnumValue("FO and runway inspection vehicle")
    FO_AND_RUNWAY_INSPECTION_VEHICLE("FO and runway inspection vehicle"),

    /**
     * A vehicle used to elevate or pick items using a fork mechanism at the front
     * 
     */
    @XmlEnumValue("Forklift")
    FORKLIFT("Forklift"),

    /**
     * A general purpose vehicle used at aerodromes for towing carts (for aircraft towing see relevant vehicle category)
     * 
     */
    @XmlEnumValue("General use Tractor")
    GENERAL_USE_TRACTOR("General use Tractor"),

    /**
     * A vehicle used for replacing lavatory liquid from aircraft
     * 
     */
    @XmlEnumValue("Lavatory service vehicle")
    LAVATORY_SERVICE_VEHICLE("Lavatory service vehicle"),

    /**
     * A vehicle used for aircraft maintenance related tasks
     * 
     */
    @XmlEnumValue("Maintenance vehicle")
    MAINTENANCE_VEHICLE("Maintenance vehicle"),

    /**
     * A vehicle used for medical services (e.g. ambulance)
     * 
     */
    @XmlEnumValue("Medical services vehicle")
    MEDICAL_SERVICES_VEHICLE("Medical services vehicle"),

    /**
     * A vehicle used by the military
     * 
     */
    @XmlEnumValue("Military vehicle")
    MILITARY_VEHICLE("Military vehicle"),

    /**
     * A vehicle used for loading and unloading containers and pallets from aircraft (e.g. high-loader, scissor lift etc.)
     * 
     */
    @XmlEnumValue("Pallet/container loading vehicle ")
    PALLET_CONTAINER_LOADING_VEHICLE("Pallet/container loading vehicle "),

    /**
     * A vehicle equipped with stairs/a vehicle that serves as a stair
     * 
     */
    @XmlEnumValue("Passenger steps/stairs vehicle")
    PASSENGER_STEPS_STAIRS_VEHICLE("Passenger steps/stairs vehicle"),

    /**
     * A vehicle used for policing purposes.
     * 
     */
    @XmlEnumValue("Police vehicle")
    POLICE_VEHICLE("Police vehicle"),

    /**
     * A truck used for the refuelling of aircraft ( includes fuel hydrant trucks)
     * 
     */
    @XmlEnumValue("Refuelling truck")
    REFUELLING_TRUCK("Refuelling truck"),

    /**
     * A vehicle used for security related purposes
     * 
     */
    @XmlEnumValue("Security vehicle")
    SECURITY_VEHICLE("Security vehicle"),

    /**
     * Vehicle used for snow removal/clearing. Includes blowers and sweepers.
     * 
     * 
     */
    @XmlEnumValue("Snow clearing vehicle")
    SNOW_CLEARING_VEHICLE("Snow clearing vehicle"),

    /**
     * A vehicle used for the towing of aircraft. It can be a purpose built vehicle or a "general purpose tractor". Both are included in this category. 
     * 
     */
    @XmlEnumValue("Tugging / Towing vehicle")
    TUGGING_TOWING_VEHICLE("Tugging / Towing vehicle"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * a vehicle of unknown or unspecified nature
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL107212011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL107212011 fromValue(String v) {
        for (VL107212011 c: VL107212011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
