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
 * <p>Classe Java pour VL1136_12_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1136_12_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ECCAIRS"/>
 *     &lt;enumeration value="Event risk classification (ERC) (ARMS)"/>
 *     &lt;enumeration value="Risk assessment tool (Eurocontrol)"/>
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1136_12_0_1_1")
@XmlEnum
public enum VL113612011 {

    ECCAIRS("ECCAIRS"),
    @XmlEnumValue("Event risk classification (ERC) (ARMS)")
    EVENT_RISK_CLASSIFICATION_ERC_ARMS("Event risk classification (ERC) (ARMS)"),
    @XmlEnumValue("Risk assessment tool (Eurocontrol)")
    RISK_ASSESSMENT_TOOL_EUROCONTROL("Risk assessment tool (Eurocontrol)"),
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    VL113612011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL113612011 fromValue(String v) {
        for (VL113612011 c: VL113612011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
