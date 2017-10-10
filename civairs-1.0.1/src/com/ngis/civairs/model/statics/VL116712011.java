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
 * <p>Classe Java pour VL1167_12_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1167_12_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="State of Registry"/>
 *     &lt;enumeration value="State of Operator"/>
 *     &lt;enumeration value="State of Occurrence"/>
 *     &lt;enumeration value="Design Approval Holder"/>
 *     &lt;enumeration value="Operator"/>
 *     &lt;enumeration value="Owner"/>
 *     &lt;enumeration value="CAMO"/>
 *     &lt;enumeration value="NAA"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1167_12_0_1_1")
@XmlEnum
public enum VL116712011 {


    /**
     * State of registration of the aircraft
     * 
     */
    @XmlEnumValue("State of Registry")
    STATE_OF_REGISTRY("State of Registry"),

    /**
     * State granting the certificate to the aircraft operator
     * 
     */
    @XmlEnumValue("State of Operator")
    STATE_OF_OPERATOR("State of Operator"),

    /**
     * State where the occurrence occurred (geographical location)
     * 
     */
    @XmlEnumValue("State of Occurrence")
    STATE_OF_OCCURRENCE("State of Occurrence"),

    /**
     * Organisation responsible of the design/certificate of the aviation product (Aircraft, Engine, Propeller or equipement)
     * 
     */
    @XmlEnumValue("Design Approval Holder")
    DESIGN_APPROVAL_HOLDER("Design Approval Holder"),

    /**
     * Organisation which Aircraft Operator Certificate covers the aircraft
     * 
     */
    @XmlEnumValue("Operator")
    OPERATOR("Operator"),

    /**
     * Natural person or legal entity that owns the aircraft
     * 
     */
    @XmlEnumValue("Owner")
    OWNER("Owner"),

    /**
     * Continuous Airworthiness Monitoring Organisation
     * 
     */
    CAMO("CAMO"),

    /**
     * National Aviation Authority
     * 
     */
    NAA("NAA"),

    /**
     * Any other not listed above
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    VL116712011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL116712011 fromValue(String v) {
        for (VL116712011 c: VL116712011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
