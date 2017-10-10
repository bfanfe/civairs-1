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
 * <p>Classe Java pour VL357_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL357_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Area supervisor"/>
 *     &lt;enumeration value="AFIS officer"/>
 *     &lt;enumeration value="Co-ordinator"/>
 *     &lt;enumeration value="Executive controller"/>
 *     &lt;enumeration value="Flight data assistant"/>
 *     &lt;enumeration value="Planning controller"/>
 *     &lt;enumeration value="Radar assistant"/>
 *     &lt;enumeration value="Sector supervisor"/>
 *     &lt;enumeration value="Supervisor other"/>
 *     &lt;enumeration value="Technical staff"/>
 *     &lt;enumeration value="Watch supervisor"/>
 *     &lt;enumeration value="Student"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL357_5_0_1_1")
@XmlEnum
public enum VL3575011 {

    @XmlEnumValue("Area supervisor")
    AREA_SUPERVISOR("Area supervisor"),
    @XmlEnumValue("AFIS officer")
    AFIS_OFFICER("AFIS officer"),
    @XmlEnumValue("Co-ordinator")
    CO_ORDINATOR("Co-ordinator"),
    @XmlEnumValue("Executive controller")
    EXECUTIVE_CONTROLLER("Executive controller"),
    @XmlEnumValue("Flight data assistant")
    FLIGHT_DATA_ASSISTANT("Flight data assistant"),
    @XmlEnumValue("Planning controller")
    PLANNING_CONTROLLER("Planning controller"),
    @XmlEnumValue("Radar assistant")
    RADAR_ASSISTANT("Radar assistant"),
    @XmlEnumValue("Sector supervisor")
    SECTOR_SUPERVISOR("Sector supervisor"),
    @XmlEnumValue("Supervisor other")
    SUPERVISOR_OTHER("Supervisor other"),
    @XmlEnumValue("Technical staff")
    TECHNICAL_STAFF("Technical staff"),
    @XmlEnumValue("Watch supervisor")
    WATCH_SUPERVISOR("Watch supervisor"),
    @XmlEnumValue("Student")
    STUDENT("Student"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    VL3575011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL3575011 fromValue(String v) {
        for (VL3575011 c: VL3575011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
