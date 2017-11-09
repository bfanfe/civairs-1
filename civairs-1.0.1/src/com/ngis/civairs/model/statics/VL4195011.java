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
 * <p>Classe Java pour VL419_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL419_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Alcohol"/>
 *     &lt;enumeration value="Carbon monoxide"/>
 *     &lt;enumeration value="Chemicals"/>
 *     &lt;enumeration value="Drugs"/>
 *     &lt;enumeration value="Food poisoning"/>
 *     &lt;enumeration value="Hypoxia"/>
 *     &lt;enumeration value="Injury"/>
 *     &lt;enumeration value="Medical condition"/>
 *     &lt;enumeration value="Psychiatric condition"/>
 *     &lt;enumeration value="Smoke/fumes"/>
 *     &lt;enumeration value="Not applicable"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL419_5_0_1_1")
@XmlEnum
public enum VL4195011 {

    @XmlEnumValue("Alcohol")
    ALCOHOL("Alcohol"),
    @XmlEnumValue("Carbon monoxide")
    CARBON_MONOXIDE("Carbon monoxide"),
    @XmlEnumValue("Chemicals")
    CHEMICALS("Chemicals"),
    @XmlEnumValue("Drugs")
    DRUGS("Drugs"),
    @XmlEnumValue("Food poisoning")
    FOOD_POISONING("Food poisoning"),
    @XmlEnumValue("Hypoxia")
    HYPOXIA("Hypoxia"),
    @XmlEnumValue("Injury")
    INJURY("Injury"),
    @XmlEnumValue("Medical condition")
    MEDICAL_CONDITION("Medical condition"),
    @XmlEnumValue("Psychiatric condition")
    PSYCHIATRIC_CONDITION("Psychiatric condition"),
    @XmlEnumValue("Smoke/fumes")
    SMOKE_FUMES("Smoke/fumes"),
    @XmlEnumValue("Not applicable")
    NOT_APPLICABLE("Not applicable"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL4195011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL4195011 fromValue(String v) {
        for (VL4195011 c: VL4195011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
