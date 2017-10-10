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
 * <p>Classe Java pour VL1158_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1158_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bag, paper, multiwall "/>
 *     &lt;enumeration value="Bag, paper, multiwall, water resistant"/>
 *     &lt;enumeration value="Bag, plastic film"/>
 *     &lt;enumeration value="Bag, textile, siftproof "/>
 *     &lt;enumeration value="Bag, textile, water resistant "/>
 *     &lt;enumeration value="Bag, textile, without inner liner or coating"/>
 *     &lt;enumeration value="Bag, woven plastic, water-resistant"/>
 *     &lt;enumeration value="Bag, woven plastic, without inner liner or coating "/>
 *     &lt;enumeration value="Bag, woven, siftproof "/>
 *     &lt;enumeration value="Box, aluminium "/>
 *     &lt;enumeration value="Box, expanded plastic"/>
 *     &lt;enumeration value="Box, fibreboard"/>
 *     &lt;enumeration value="Box, natural wood - ordinary"/>
 *     &lt;enumeration value="Box, natural wood - with siftproof walls"/>
 *     &lt;enumeration value="Box, other metal"/>
 *     &lt;enumeration value="Box, plywood"/>
 *     &lt;enumeration value="Box, reconstituted wood"/>
 *     &lt;enumeration value="Box, steel"/>
 *     &lt;enumeration value="Boxes, solid plastic "/>
 *     &lt;enumeration value="Composite packaging - plastic receptacle with outer aluminium crate or box"/>
 *     &lt;enumeration value="Composite packaging - plastic receptacle with outer aluminium drum"/>
 *     &lt;enumeration value="Composite packaging - plastic receptacle with outer fibre drum"/>
 *     &lt;enumeration value="Composite packaging - plastic receptacle with outer fibreboard box"/>
 *     &lt;enumeration value="Composite packaging - plastic receptacle with outer plastic drum"/>
 *     &lt;enumeration value="Composite packaging - plastic receptacle with outer plywood box"/>
 *     &lt;enumeration value="Composite packaging - plastic receptacle with outer plywood drum"/>
 *     &lt;enumeration value="Composite packaging - plastic receptacle with outer solid plastic box"/>
 *     &lt;enumeration value="Composite packaging - plastic receptacle with outer steel crate or box"/>
 *     &lt;enumeration value="Composite packaging – plastic receptacle with outer steel drum"/>
 *     &lt;enumeration value="Composite packaging - plastic receptacle with outer wooden box"/>
 *     &lt;enumeration value="Composite packagings - glass, porcelain or stoneware receptacle with outer wooden box"/>
 *     &lt;enumeration value="Composite packagings - glass, porcelain or stoneware receptacle with outer steel drum"/>
 *     &lt;enumeration value="Composite packagings - glass, porcelain or stoneware receptacle with outer steel crate or box"/>
 *     &lt;enumeration value="Composite packagings - glass, porcelain or stoneware receptacle with outer aluminium drum"/>
 *     &lt;enumeration value="Composite packagings - glass, porcelain or stoneware receptacle with outer aluminium crate or box"/>
 *     &lt;enumeration value="Drum aluminium - non-removable head"/>
 *     &lt;enumeration value="Drum aluminium - removable head"/>
 *     &lt;enumeration value="Drum, fibre"/>
 *     &lt;enumeration value="Drum, metal (other than steel or aluminium) - non-removable head"/>
 *     &lt;enumeration value="Drum, metal (other than steel or aluminium) - removable head"/>
 *     &lt;enumeration value="Drum, plastic - non-removable head"/>
 *     &lt;enumeration value="Drum, plastic - removable head"/>
 *     &lt;enumeration value="Drum, plywood"/>
 *     &lt;enumeration value="Drum, steel - non-removable head"/>
 *     &lt;enumeration value="Drum, steel - removable head"/>
 *     &lt;enumeration value="Jerrican, aluminium - non-removable head"/>
 *     &lt;enumeration value="Jerrican, aluminium - removable head"/>
 *     &lt;enumeration value="Jerrican, plastic - non-removable head"/>
 *     &lt;enumeration value="Jerrican, plastic - removable head"/>
 *     &lt;enumeration value="Jerrican, steel - non-removable head"/>
 *     &lt;enumeration value="Jerrican, steel - removable head"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1158_5_0_1_1")
@XmlEnum
public enum VL11585011 {

    @XmlEnumValue("Bag, paper, multiwall ")
    BAG_PAPER_MULTIWALL("Bag, paper, multiwall "),
    @XmlEnumValue("Bag, paper, multiwall, water resistant")
    BAG_PAPER_MULTIWALL_WATER_RESISTANT("Bag, paper, multiwall, water resistant"),
    @XmlEnumValue("Bag, plastic film")
    BAG_PLASTIC_FILM("Bag, plastic film"),
    @XmlEnumValue("Bag, textile, siftproof ")
    BAG_TEXTILE_SIFTPROOF("Bag, textile, siftproof "),
    @XmlEnumValue("Bag, textile, water resistant ")
    BAG_TEXTILE_WATER_RESISTANT("Bag, textile, water resistant "),
    @XmlEnumValue("Bag, textile, without inner liner or coating")
    BAG_TEXTILE_WITHOUT_INNER_LINER_OR_COATING("Bag, textile, without inner liner or coating"),
    @XmlEnumValue("Bag, woven plastic, water-resistant")
    BAG_WOVEN_PLASTIC_WATER_RESISTANT("Bag, woven plastic, water-resistant"),
    @XmlEnumValue("Bag, woven plastic, without inner liner or coating ")
    BAG_WOVEN_PLASTIC_WITHOUT_INNER_LINER_OR_COATING("Bag, woven plastic, without inner liner or coating "),
    @XmlEnumValue("Bag, woven, siftproof ")
    BAG_WOVEN_SIFTPROOF("Bag, woven, siftproof "),
    @XmlEnumValue("Box, aluminium ")
    BOX_ALUMINIUM("Box, aluminium "),
    @XmlEnumValue("Box, expanded plastic")
    BOX_EXPANDED_PLASTIC("Box, expanded plastic"),
    @XmlEnumValue("Box, fibreboard")
    BOX_FIBREBOARD("Box, fibreboard"),
    @XmlEnumValue("Box, natural wood - ordinary")
    BOX_NATURAL_WOOD_ORDINARY("Box, natural wood - ordinary"),
    @XmlEnumValue("Box, natural wood - with siftproof walls")
    BOX_NATURAL_WOOD_WITH_SIFTPROOF_WALLS("Box, natural wood - with siftproof walls"),
    @XmlEnumValue("Box, other metal")
    BOX_OTHER_METAL("Box, other metal"),
    @XmlEnumValue("Box, plywood")
    BOX_PLYWOOD("Box, plywood"),
    @XmlEnumValue("Box, reconstituted wood")
    BOX_RECONSTITUTED_WOOD("Box, reconstituted wood"),
    @XmlEnumValue("Box, steel")
    BOX_STEEL("Box, steel"),
    @XmlEnumValue("Boxes, solid plastic ")
    BOXES_SOLID_PLASTIC("Boxes, solid plastic "),
    @XmlEnumValue("Composite packaging - plastic receptacle with outer aluminium crate or box")
    COMPOSITE_PACKAGING_PLASTIC_RECEPTACLE_WITH_OUTER_ALUMINIUM_CRATE_OR_BOX("Composite packaging - plastic receptacle with outer aluminium crate or box"),
    @XmlEnumValue("Composite packaging - plastic receptacle with outer aluminium drum")
    COMPOSITE_PACKAGING_PLASTIC_RECEPTACLE_WITH_OUTER_ALUMINIUM_DRUM("Composite packaging - plastic receptacle with outer aluminium drum"),
    @XmlEnumValue("Composite packaging - plastic receptacle with outer fibre drum")
    COMPOSITE_PACKAGING_PLASTIC_RECEPTACLE_WITH_OUTER_FIBRE_DRUM("Composite packaging - plastic receptacle with outer fibre drum"),
    @XmlEnumValue("Composite packaging - plastic receptacle with outer fibreboard box")
    COMPOSITE_PACKAGING_PLASTIC_RECEPTACLE_WITH_OUTER_FIBREBOARD_BOX("Composite packaging - plastic receptacle with outer fibreboard box"),
    @XmlEnumValue("Composite packaging - plastic receptacle with outer plastic drum")
    COMPOSITE_PACKAGING_PLASTIC_RECEPTACLE_WITH_OUTER_PLASTIC_DRUM("Composite packaging - plastic receptacle with outer plastic drum"),
    @XmlEnumValue("Composite packaging - plastic receptacle with outer plywood box")
    COMPOSITE_PACKAGING_PLASTIC_RECEPTACLE_WITH_OUTER_PLYWOOD_BOX("Composite packaging - plastic receptacle with outer plywood box"),
    @XmlEnumValue("Composite packaging - plastic receptacle with outer plywood drum")
    COMPOSITE_PACKAGING_PLASTIC_RECEPTACLE_WITH_OUTER_PLYWOOD_DRUM("Composite packaging - plastic receptacle with outer plywood drum"),
    @XmlEnumValue("Composite packaging - plastic receptacle with outer solid plastic box")
    COMPOSITE_PACKAGING_PLASTIC_RECEPTACLE_WITH_OUTER_SOLID_PLASTIC_BOX("Composite packaging - plastic receptacle with outer solid plastic box"),
    @XmlEnumValue("Composite packaging - plastic receptacle with outer steel crate or box")
    COMPOSITE_PACKAGING_PLASTIC_RECEPTACLE_WITH_OUTER_STEEL_CRATE_OR_BOX("Composite packaging - plastic receptacle with outer steel crate or box"),
    @XmlEnumValue("Composite packaging \u2013 plastic receptacle with outer steel drum")
    COMPOSITE_PACKAGING_PLASTIC_RECEPTACLE_WITH_OUTER_STEEL_DRUM("Composite packaging \u2013 plastic receptacle with outer steel drum"),
    @XmlEnumValue("Composite packaging - plastic receptacle with outer wooden box")
    COMPOSITE_PACKAGING_PLASTIC_RECEPTACLE_WITH_OUTER_WOODEN_BOX("Composite packaging - plastic receptacle with outer wooden box"),
    @XmlEnumValue("Composite packagings - glass, porcelain or stoneware receptacle with outer wooden box")
    COMPOSITE_PACKAGINGS_GLASS_PORCELAIN_OR_STONEWARE_RECEPTACLE_WITH_OUTER_WOODEN_BOX("Composite packagings - glass, porcelain or stoneware receptacle with outer wooden box"),
    @XmlEnumValue("Composite packagings - glass, porcelain or stoneware receptacle with outer steel drum")
    COMPOSITE_PACKAGINGS_GLASS_PORCELAIN_OR_STONEWARE_RECEPTACLE_WITH_OUTER_STEEL_DRUM("Composite packagings - glass, porcelain or stoneware receptacle with outer steel drum"),
    @XmlEnumValue("Composite packagings - glass, porcelain or stoneware receptacle with outer steel crate or box")
    COMPOSITE_PACKAGINGS_GLASS_PORCELAIN_OR_STONEWARE_RECEPTACLE_WITH_OUTER_STEEL_CRATE_OR_BOX("Composite packagings - glass, porcelain or stoneware receptacle with outer steel crate or box"),
    @XmlEnumValue("Composite packagings - glass, porcelain or stoneware receptacle with outer aluminium drum")
    COMPOSITE_PACKAGINGS_GLASS_PORCELAIN_OR_STONEWARE_RECEPTACLE_WITH_OUTER_ALUMINIUM_DRUM("Composite packagings - glass, porcelain or stoneware receptacle with outer aluminium drum"),
    @XmlEnumValue("Composite packagings - glass, porcelain or stoneware receptacle with outer aluminium crate or box")
    COMPOSITE_PACKAGINGS_GLASS_PORCELAIN_OR_STONEWARE_RECEPTACLE_WITH_OUTER_ALUMINIUM_CRATE_OR_BOX("Composite packagings - glass, porcelain or stoneware receptacle with outer aluminium crate or box"),
    @XmlEnumValue("Drum aluminium - non-removable head")
    DRUM_ALUMINIUM_NON_REMOVABLE_HEAD("Drum aluminium - non-removable head"),
    @XmlEnumValue("Drum aluminium - removable head")
    DRUM_ALUMINIUM_REMOVABLE_HEAD("Drum aluminium - removable head"),
    @XmlEnumValue("Drum, fibre")
    DRUM_FIBRE("Drum, fibre"),
    @XmlEnumValue("Drum, metal (other than steel or aluminium) - non-removable head")
    DRUM_METAL_OTHER_THAN_STEEL_OR_ALUMINIUM_NON_REMOVABLE_HEAD("Drum, metal (other than steel or aluminium) - non-removable head"),
    @XmlEnumValue("Drum, metal (other than steel or aluminium) - removable head")
    DRUM_METAL_OTHER_THAN_STEEL_OR_ALUMINIUM_REMOVABLE_HEAD("Drum, metal (other than steel or aluminium) - removable head"),
    @XmlEnumValue("Drum, plastic - non-removable head")
    DRUM_PLASTIC_NON_REMOVABLE_HEAD("Drum, plastic - non-removable head"),
    @XmlEnumValue("Drum, plastic - removable head")
    DRUM_PLASTIC_REMOVABLE_HEAD("Drum, plastic - removable head"),
    @XmlEnumValue("Drum, plywood")
    DRUM_PLYWOOD("Drum, plywood"),
    @XmlEnumValue("Drum, steel - non-removable head")
    DRUM_STEEL_NON_REMOVABLE_HEAD("Drum, steel - non-removable head"),
    @XmlEnumValue("Drum, steel - removable head")
    DRUM_STEEL_REMOVABLE_HEAD("Drum, steel - removable head"),
    @XmlEnumValue("Jerrican, aluminium - non-removable head")
    JERRICAN_ALUMINIUM_NON_REMOVABLE_HEAD("Jerrican, aluminium - non-removable head"),
    @XmlEnumValue("Jerrican, aluminium - removable head")
    JERRICAN_ALUMINIUM_REMOVABLE_HEAD("Jerrican, aluminium - removable head"),
    @XmlEnumValue("Jerrican, plastic - non-removable head")
    JERRICAN_PLASTIC_NON_REMOVABLE_HEAD("Jerrican, plastic - non-removable head"),
    @XmlEnumValue("Jerrican, plastic - removable head")
    JERRICAN_PLASTIC_REMOVABLE_HEAD("Jerrican, plastic - removable head"),
    @XmlEnumValue("Jerrican, steel - non-removable head")
    JERRICAN_STEEL_NON_REMOVABLE_HEAD("Jerrican, steel - non-removable head"),
    @XmlEnumValue("Jerrican, steel - removable head")
    JERRICAN_STEEL_REMOVABLE_HEAD("Jerrican, steel - removable head"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL11585011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL11585011 fromValue(String v) {
        for (VL11585011 c: VL11585011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
