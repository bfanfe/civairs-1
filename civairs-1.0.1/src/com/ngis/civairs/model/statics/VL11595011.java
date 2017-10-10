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
 * <p>Classe Java pour VL1159_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1159_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I  Packing Group I, High Danger"/>
 *     &lt;enumeration value="II  Packing Group II, Medium Danger"/>
 *     &lt;enumeration value="III  Packing Group III, Low Danger"/>
 *     &lt;enumeration value="I – White - Radioactive Material Category I label required/applied to package"/>
 *     &lt;enumeration value="II – Yellow - Radioactive Material Category II label required/applied to package"/>
 *     &lt;enumeration value="III – Yellow - Radioactive Material Category III label required/applied to package"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1159_5_0_1_1")
@XmlEnum
public enum VL11595011 {

    @XmlEnumValue("I  Packing Group I, High Danger")
    I_PACKING_GROUP_I_HIGH_DANGER("I  Packing Group I, High Danger"),
    @XmlEnumValue("II  Packing Group II, Medium Danger")
    II_PACKING_GROUP_II_MEDIUM_DANGER("II  Packing Group II, Medium Danger"),
    @XmlEnumValue("III  Packing Group III, Low Danger")
    III_PACKING_GROUP_III_LOW_DANGER("III  Packing Group III, Low Danger"),
    @XmlEnumValue("I \u2013 White - Radioactive Material Category I label required/applied to package")
    I_WHITE_RADIOACTIVE_MATERIAL_CATEGORY_I_LABEL_REQUIRED_APPLIED_TO_PACKAGE("I \u2013 White - Radioactive Material Category I label required/applied to package"),
    @XmlEnumValue("II \u2013 Yellow - Radioactive Material Category II label required/applied to package")
    II_YELLOW_RADIOACTIVE_MATERIAL_CATEGORY_II_LABEL_REQUIRED_APPLIED_TO_PACKAGE("II \u2013 Yellow - Radioactive Material Category II label required/applied to package"),
    @XmlEnumValue("III \u2013 Yellow - Radioactive Material Category III label required/applied to package")
    III_YELLOW_RADIOACTIVE_MATERIAL_CATEGORY_III_LABEL_REQUIRED_APPLIED_TO_PACKAGE("III \u2013 Yellow - Radioactive Material Category III label required/applied to package"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL11595011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL11595011 fromValue(String v) {
        for (VL11595011 c: VL11595011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
