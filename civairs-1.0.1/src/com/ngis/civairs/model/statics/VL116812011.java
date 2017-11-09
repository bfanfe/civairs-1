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
 * <p>Classe Java pour VL1168_12_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1168_12_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Manufacturing"/>
 *     &lt;enumeration value="Scheduled Maintenance"/>
 *     &lt;enumeration value="Non-scheduled Maintenance"/>
 *     &lt;enumeration value="Standing"/>
 *     &lt;enumeration value="Taxi"/>
 *     &lt;enumeration value="Take-Off"/>
 *     &lt;enumeration value="Climb"/>
 *     &lt;enumeration value="En-Route"/>
 *     &lt;enumeration value="Descent"/>
 *     &lt;enumeration value="Approach"/>
 *     &lt;enumeration value="Landing"/>
 *     &lt;enumeration value="Maneuvering"/>
 *     &lt;enumeration value="Hovering"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1168_12_0_1_1")
@XmlEnum
public enum VL116812011 {


    /**
     * Manufacturing or production
     * 
     */
    @XmlEnumValue("Manufacturing")
    MANUFACTURING("Manufacturing"),

    /**
     * Scheduled Maintenance
     * 
     */
    @XmlEnumValue("Scheduled Maintenance")
    SCHEDULED_MAINTENANCE("Scheduled Maintenance"),

    /**
     * Non-scheduled Maintenance
     * 
     */
    @XmlEnumValue("Non-scheduled Maintenance")
    NON_SCHEDULED_MAINTENANCE("Non-scheduled Maintenance"),

    /**
     * Standing or parked
     * 
     */
    @XmlEnumValue("Standing")
    STANDING("Standing"),

    /**
     * Taxi, including self-powered towing
     * 
     */
    @XmlEnumValue("Taxi")
    TAXI("Taxi"),

    /**
     * Take-Off
     * 
     */
    @XmlEnumValue("Take-Off")
    TAKE_OFF("Take-Off"),

    /**
     * Climb
     * 
     */
    @XmlEnumValue("Climb")
    CLIMB("Climb"),

    /**
     * En-Route
     * 
     */
    @XmlEnumValue("En-Route")
    EN_ROUTE("En-Route"),

    /**
     * Descent
     * 
     */
    @XmlEnumValue("Descent")
    DESCENT("Descent"),

    /**
     * Approach
     * 
     */
    @XmlEnumValue("Approach")
    APPROACH("Approach"),

    /**
     * Landing
     * 
     */
    @XmlEnumValue("Landing")
    LANDING("Landing"),

    /**
     * Maneuvering
     * 
     */
    @XmlEnumValue("Maneuvering")
    MANEUVERING("Maneuvering"),

    /**
     * Hovering
     * 
     */
    @XmlEnumValue("Hovering")
    HOVERING("Hovering"),

    /**
     * Unknown
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    VL116812011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL116812011 fromValue(String v) {
        for (VL116812011 c: VL116812011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
