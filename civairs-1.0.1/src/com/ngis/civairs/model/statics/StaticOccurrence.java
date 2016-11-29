//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.10.04 à 11:04:45 AM GMT 
//


package com.ngis.civairs.model.statics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * General information and classification of the occurrence.
 * 
 * <p>Classe Java pour Occurrence complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Occurrence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Dew_Point" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Dew_Point">
 *                           &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="C" />
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="85" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Wx_Conditions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL127_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="127" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Dang_Goods_Involved" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL129_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="129" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Height_Of_Cloud_Base" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Height_Of_Cloud_Base">
 *                           &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="ft" />
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="140" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Light_Conditions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL168_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="168" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Maximum_Gust" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Maximum_Gust">
 *                           &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="kt" />
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="176" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Cloud_Amount" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL266_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="266" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Speed_Measured_At" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL275_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="275" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Air_Temperature" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Air_Temperature">
 *                           &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="C" />
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="287" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Visibility" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Visibility">
 *                           &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="m" />
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="310" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Wind_Direction" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Wind_Direction">
 *                           &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Degree(s)" />
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="320" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Wind_Gusts" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL321_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="321" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Wind_Speed" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Wind_Speed">
 *                           &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="kt" />
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="322" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ATM_Contribution" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL428_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="428" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Occurrence_Category" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL430_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="430" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Occurrence_Class" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1015_5_0_1_2">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="431" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Highest_Damage" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL432_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="432" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Local_Date" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="433" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Effect_On_ATM_Service" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL436_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="436" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Latitude_Of_Occ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>LatitudeDecimal">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="439" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Location_Name" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>string255max">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="440" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Longitude_Of_Occ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>LongitudeDecimal">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="444" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Damage_Not_To_A_C" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL448_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="448" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Injury_Level" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL451_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="451" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="State_Area_Of_Occ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1090_12_0_1_3">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="454" />
 *                           &lt;attribute name="AdditionalText" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="AdditionalTextEncoding">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="xs:string"/>
 *                                 &lt;enumeration value="xs:base64Binary"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Occurrence_Status" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL455_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="455" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Third_Party_Damage" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL456_5_0_1_2">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="456" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Local_Time" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>Time">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="457" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Total_Fatalities_Aircraft" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Fatalities_Aircraft">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="459" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Total_Fatalities_Ground" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Fatalities_Ground">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="460" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Total_On_Board_A_C" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_On_Board_A_C">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="462" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Total_Injuries-Ground" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Injuries-Ground">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="463" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Total_Minor_Injuries-Aircraft" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Minor_Injuries-Aircraft">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="468" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Total_Minor_Injuries-Ground" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Minor_Injuries-Ground">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="469" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Total_Serious_Injuries-Aircraft" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Serious_Injuries-Aircraft">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="471" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Total_Serious_Injuries-Ground" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Serious_Injuries-Ground">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="472" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UTC_Date" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="477" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UTC_Time" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>Time">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="478" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Headline" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>string255max">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="601" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Weather_Relevant" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL606_5_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="606" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Object_Damaged" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1028_5_0_1_2">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="640" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Detection_Phase" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1168_12_0_1_1">
 *                           &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1072" />
 *                           &lt;attribute name="AdditionalText" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="AdditionalTextEncoding">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="xs:string"/>
 *                                 &lt;enumeration value="xs:base64Binary"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ENTITIES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Aerodrome_General" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Aerodrome_General" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Aerodrome_Weather_Reports" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Aerodrome_Weather_Reports" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Air_Space" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Air_Space" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Aircraft" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Aircraft" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ATS_Unit" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}ATS_Unit" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Dangerous_Goods" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Dangerous_Goods" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Events" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Events" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Narrative" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Narrative" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Precipitation_And_Other_Weather_Phenomena" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Precipitation_And_Other_Weather_Phenomena" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Reporting_History" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Reporting_History" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Risk_Assessment" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Risk_Assessment" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Runway_Incursion" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Runway_Incursion" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Separation" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Separation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="entityId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="24" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Occurrence", propOrder = {

})
public class StaticOccurrence {

    @XmlElement(name = "ATTRIBUTES")
    protected StaticOccurrence.ATTRIBUTES attributes;
    @XmlElement(name = "ENTITIES")
    protected StaticOccurrence.ENTITIES entities;
    @XmlAttribute(name = "entityId", required = true)
    protected String entityId;

    /**
     * Obtient la valeur de la propriété attributes.
     * 
     * @return
     *     possible object is
     *     {@link StaticOccurrence.ATTRIBUTES }
     *     
     */
    public StaticOccurrence.ATTRIBUTES getATTRIBUTES() {
        return attributes;
    }

    /**
     * Définit la valeur de la propriété attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticOccurrence.ATTRIBUTES }
     *     
     */
    public void setATTRIBUTES(StaticOccurrence.ATTRIBUTES value) {
        this.attributes = value;
    }

    /**
     * Obtient la valeur de la propriété entities.
     * 
     * @return
     *     possible object is
     *     {@link StaticOccurrence.ENTITIES }
     *     
     */
    public StaticOccurrence.ENTITIES getENTITIES() {
        return entities;
    }

    /**
     * Définit la valeur de la propriété entities.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticOccurrence.ENTITIES }
     *     
     */
    public void setENTITIES(StaticOccurrence.ENTITIES value) {
        this.entities = value;
    }

    /**
     * Obtient la valeur de la propriété entityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        if (entityId == null) {
            return "24";
        } else {
            return entityId;
        }
    }

    /**
     * Définit la valeur de la propriété entityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Dew_Point" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Dew_Point">
     *                 &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="C" />
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="85" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Wx_Conditions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL127_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="127" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Dang_Goods_Involved" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL129_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="129" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Height_Of_Cloud_Base" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Height_Of_Cloud_Base">
     *                 &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="ft" />
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="140" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Light_Conditions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL168_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="168" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Maximum_Gust" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Maximum_Gust">
     *                 &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="kt" />
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="176" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Cloud_Amount" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL266_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="266" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Speed_Measured_At" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL275_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="275" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Air_Temperature" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Air_Temperature">
     *                 &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="C" />
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="287" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Visibility" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Visibility">
     *                 &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="m" />
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="310" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Wind_Direction" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Wind_Direction">
     *                 &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Degree(s)" />
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="320" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Wind_Gusts" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL321_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="321" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Wind_Speed" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Wind_Speed">
     *                 &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="kt" />
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="322" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ATM_Contribution" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL428_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="428" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Occurrence_Category" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL430_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="430" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Occurrence_Class" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1015_5_0_1_2">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="431" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Highest_Damage" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL432_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="432" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Local_Date" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="433" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Effect_On_ATM_Service" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL436_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="436" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Latitude_Of_Occ" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>LatitudeDecimal">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="439" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Location_Name" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>string255max">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="440" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Longitude_Of_Occ" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>LongitudeDecimal">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="444" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Damage_Not_To_A_C" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL448_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="448" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Injury_Level" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL451_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="451" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="State_Area_Of_Occ" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1090_12_0_1_3">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="454" />
     *                 &lt;attribute name="AdditionalText" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="AdditionalTextEncoding">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="xs:string"/>
     *                       &lt;enumeration value="xs:base64Binary"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Occurrence_Status" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL455_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="455" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Third_Party_Damage" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL456_5_0_1_2">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="456" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Local_Time" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>Time">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="457" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Total_Fatalities_Aircraft" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Fatalities_Aircraft">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="459" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Total_Fatalities_Ground" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Fatalities_Ground">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="460" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Total_On_Board_A_C" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_On_Board_A_C">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="462" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Total_Injuries-Ground" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Injuries-Ground">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="463" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Total_Minor_Injuries-Aircraft" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Minor_Injuries-Aircraft">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="468" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Total_Minor_Injuries-Ground" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Minor_Injuries-Ground">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="469" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Total_Serious_Injuries-Aircraft" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Serious_Injuries-Aircraft">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="471" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Total_Serious_Injuries-Ground" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Serious_Injuries-Ground">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="472" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UTC_Date" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="477" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UTC_Time" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>Time">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="478" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Headline" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>string255max">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="601" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Weather_Relevant" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL606_5_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="606" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Object_Damaged" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1028_5_0_1_2">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="640" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Detection_Phase" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1168_12_0_1_1">
     *                 &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1072" />
     *                 &lt;attribute name="AdditionalText" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="AdditionalTextEncoding">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="xs:string"/>
     *                       &lt;enumeration value="xs:base64Binary"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dewPointOrWxConditionsOrDangGoodsInvolved"
    })
    public static class ATTRIBUTES {

        @XmlElements({
            @XmlElement(name = "Dew_Point", type = StaticOccurrence.ATTRIBUTES.DewPoint.class),
            @XmlElement(name = "Wx_Conditions", type = StaticOccurrence.ATTRIBUTES.WxConditions.class),
            @XmlElement(name = "Dang_Goods_Involved", type = StaticOccurrence.ATTRIBUTES.DangGoodsInvolved.class),
            @XmlElement(name = "Height_Of_Cloud_Base", type = StaticOccurrence.ATTRIBUTES.HeightOfCloudBase.class),
            @XmlElement(name = "Light_Conditions", type = StaticOccurrence.ATTRIBUTES.LightConditions.class),
            @XmlElement(name = "Maximum_Gust", type = StaticOccurrence.ATTRIBUTES.MaximumGust.class),
            @XmlElement(name = "Cloud_Amount", type = StaticOccurrence.ATTRIBUTES.CloudAmount.class),
            @XmlElement(name = "Speed_Measured_At", type = StaticOccurrence.ATTRIBUTES.SpeedMeasuredAt.class),
            @XmlElement(name = "Air_Temperature", type = StaticOccurrence.ATTRIBUTES.AirTemperature.class),
            @XmlElement(name = "Visibility", type = StaticOccurrence.ATTRIBUTES.Visibility.class),
            @XmlElement(name = "Wind_Direction", type = StaticOccurrence.ATTRIBUTES.WindDirection.class),
            @XmlElement(name = "Wind_Gusts", type = StaticOccurrence.ATTRIBUTES.WindGusts.class),
            @XmlElement(name = "Wind_Speed", type = StaticOccurrence.ATTRIBUTES.WindSpeed.class),
            @XmlElement(name = "ATM_Contribution", type = StaticOccurrence.ATTRIBUTES.ATMContribution.class),
            @XmlElement(name = "Occurrence_Category", type = StaticOccurrence.ATTRIBUTES.OccurrenceCategory.class),
            @XmlElement(name = "Occurrence_Class", type = StaticOccurrence.ATTRIBUTES.OccurrenceClass.class),
            @XmlElement(name = "Highest_Damage", type = StaticOccurrence.ATTRIBUTES.HighestDamage.class),
            @XmlElement(name = "Local_Date", type = StaticOccurrence.ATTRIBUTES.LocalDate.class),
            @XmlElement(name = "Effect_On_ATM_Service", type = StaticOccurrence.ATTRIBUTES.EffectOnATMService.class),
            @XmlElement(name = "Latitude_Of_Occ", type = StaticOccurrence.ATTRIBUTES.LatitudeOfOcc.class),
            @XmlElement(name = "Location_Name", type = StaticOccurrence.ATTRIBUTES.LocationName.class),
            @XmlElement(name = "Longitude_Of_Occ", type = StaticOccurrence.ATTRIBUTES.LongitudeOfOcc.class),
            @XmlElement(name = "Damage_Not_To_A_C", type = StaticOccurrence.ATTRIBUTES.DamageNotToAC.class),
            @XmlElement(name = "Injury_Level", type = StaticOccurrence.ATTRIBUTES.InjuryLevel.class),
            @XmlElement(name = "State_Area_Of_Occ", type = StaticOccurrence.ATTRIBUTES.StateAreaOfOcc.class),
            @XmlElement(name = "Occurrence_Status", type = StaticOccurrence.ATTRIBUTES.OccurrenceStatus.class),
            @XmlElement(name = "Third_Party_Damage", type = StaticOccurrence.ATTRIBUTES.ThirdPartyDamage.class),
            @XmlElement(name = "Local_Time", type = StaticOccurrence.ATTRIBUTES.LocalTime.class),
            @XmlElement(name = "Total_Fatalities_Aircraft", type = StaticOccurrence.ATTRIBUTES.TotalFatalitiesAircraft.class),
            @XmlElement(name = "Total_Fatalities_Ground", type = StaticOccurrence.ATTRIBUTES.TotalFatalitiesGround.class),
            @XmlElement(name = "Total_On_Board_A_C", type = StaticOccurrence.ATTRIBUTES.TotalOnBoardAC.class),
            @XmlElement(name = "Total_Injuries-Ground", type = StaticOccurrence.ATTRIBUTES.TotalInjuriesGround.class),
            @XmlElement(name = "Total_Minor_Injuries-Aircraft", type = StaticOccurrence.ATTRIBUTES.TotalMinorInjuriesAircraft.class),
            @XmlElement(name = "Total_Minor_Injuries-Ground", type = StaticOccurrence.ATTRIBUTES.TotalMinorInjuriesGround.class),
            @XmlElement(name = "Total_Serious_Injuries-Aircraft", type = StaticOccurrence.ATTRIBUTES.TotalSeriousInjuriesAircraft.class),
            @XmlElement(name = "Total_Serious_Injuries-Ground", type = StaticOccurrence.ATTRIBUTES.TotalSeriousInjuriesGround.class),
            @XmlElement(name = "UTC_Date", type = StaticOccurrence.ATTRIBUTES.UTCDate.class),
            @XmlElement(name = "UTC_Time", type = StaticOccurrence.ATTRIBUTES.UTCTime.class),
            @XmlElement(name = "Headline", type = StaticOccurrence.ATTRIBUTES.Headline.class),
            @XmlElement(name = "Weather_Relevant", type = StaticOccurrence.ATTRIBUTES.WeatherRelevant.class),
            @XmlElement(name = "Object_Damaged", type = StaticOccurrence.ATTRIBUTES.ObjectDamaged.class),
            @XmlElement(name = "Detection_Phase", type = StaticOccurrence.ATTRIBUTES.DetectionPhase.class)
        })
        protected List<Object> dewPointOrWxConditionsOrDangGoodsInvolved;

        /**
         * Gets the value of the dewPointOrWxConditionsOrDangGoodsInvolved property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dewPointOrWxConditionsOrDangGoodsInvolved property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDewPointOrWxConditionsOrDangGoodsInvolved().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StaticOccurrence.ATTRIBUTES.DewPoint }
         * {@link StaticOccurrence.ATTRIBUTES.WxConditions }
         * {@link StaticOccurrence.ATTRIBUTES.DangGoodsInvolved }
         * {@link StaticOccurrence.ATTRIBUTES.HeightOfCloudBase }
         * {@link StaticOccurrence.ATTRIBUTES.LightConditions }
         * {@link StaticOccurrence.ATTRIBUTES.MaximumGust }
         * {@link StaticOccurrence.ATTRIBUTES.CloudAmount }
         * {@link StaticOccurrence.ATTRIBUTES.SpeedMeasuredAt }
         * {@link StaticOccurrence.ATTRIBUTES.AirTemperature }
         * {@link StaticOccurrence.ATTRIBUTES.Visibility }
         * {@link StaticOccurrence.ATTRIBUTES.WindDirection }
         * {@link StaticOccurrence.ATTRIBUTES.WindGusts }
         * {@link StaticOccurrence.ATTRIBUTES.WindSpeed }
         * {@link StaticOccurrence.ATTRIBUTES.ATMContribution }
         * {@link StaticOccurrence.ATTRIBUTES.OccurrenceCategory }
         * {@link StaticOccurrence.ATTRIBUTES.OccurrenceClass }
         * {@link StaticOccurrence.ATTRIBUTES.HighestDamage }
         * {@link StaticOccurrence.ATTRIBUTES.LocalDate }
         * {@link StaticOccurrence.ATTRIBUTES.EffectOnATMService }
         * {@link StaticOccurrence.ATTRIBUTES.LatitudeOfOcc }
         * {@link StaticOccurrence.ATTRIBUTES.LocationName }
         * {@link StaticOccurrence.ATTRIBUTES.LongitudeOfOcc }
         * {@link StaticOccurrence.ATTRIBUTES.DamageNotToAC }
         * {@link StaticOccurrence.ATTRIBUTES.InjuryLevel }
         * {@link StaticOccurrence.ATTRIBUTES.StateAreaOfOcc }
         * {@link StaticOccurrence.ATTRIBUTES.OccurrenceStatus }
         * {@link StaticOccurrence.ATTRIBUTES.ThirdPartyDamage }
         * {@link StaticOccurrence.ATTRIBUTES.LocalTime }
         * {@link StaticOccurrence.ATTRIBUTES.TotalFatalitiesAircraft }
         * {@link StaticOccurrence.ATTRIBUTES.TotalFatalitiesGround }
         * {@link StaticOccurrence.ATTRIBUTES.TotalOnBoardAC }
         * {@link StaticOccurrence.ATTRIBUTES.TotalInjuriesGround }
         * {@link StaticOccurrence.ATTRIBUTES.TotalMinorInjuriesAircraft }
         * {@link StaticOccurrence.ATTRIBUTES.TotalMinorInjuriesGround }
         * {@link StaticOccurrence.ATTRIBUTES.TotalSeriousInjuriesAircraft }
         * {@link StaticOccurrence.ATTRIBUTES.TotalSeriousInjuriesGround }
         * {@link StaticOccurrence.ATTRIBUTES.UTCDate }
         * {@link StaticOccurrence.ATTRIBUTES.UTCTime }
         * {@link StaticOccurrence.ATTRIBUTES.Headline }
         * {@link StaticOccurrence.ATTRIBUTES.WeatherRelevant }
         * {@link StaticOccurrence.ATTRIBUTES.ObjectDamaged }
         * {@link StaticOccurrence.ATTRIBUTES.DetectionPhase }
         * 
         * 
         */
        public List<Object> getDewPointOrWxConditionsOrDangGoodsInvolved() {
            if (dewPointOrWxConditionsOrDangGoodsInvolved == null) {
                dewPointOrWxConditionsOrDangGoodsInvolved = new ArrayList<Object>();
            }
            return this.dewPointOrWxConditionsOrDangGoodsInvolved;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Air_Temperature">
         *       &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="C" />
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="287" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class AirTemperature {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "Unit", required = true)
            protected String unit;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété unit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnit() {
                if (unit == null) {
                    return "C";
                } else {
                    return unit;
                }
            }

            /**
             * Définit la valeur de la propriété unit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnit(String value) {
                this.unit = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "287";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL428_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="428" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ATMContribution {

            @XmlValue
            protected VL4285011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL4285011 }
             *     
             */
            public VL4285011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL4285011 }
             *     
             */
            public void setValue(VL4285011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "428";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL266_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="266" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class CloudAmount {

            @XmlValue
            protected VL2665011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL2665011 }
             *     
             */
            public VL2665011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL2665011 }
             *     
             */
            public void setValue(VL2665011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "266";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL448_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="448" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DamageNotToAC {

            @XmlValue
            protected VL4485011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL4485011 }
             *     
             */
            public VL4485011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL4485011 }
             *     
             */
            public void setValue(VL4485011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "448";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL129_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="129" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DangGoodsInvolved {

            @XmlValue
            protected VL1295011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL1295011 }
             *     
             */
            public VL1295011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL1295011 }
             *     
             */
            public void setValue(VL1295011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "129";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1168_12_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1072" />
         *       &lt;attribute name="AdditionalText" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="AdditionalTextEncoding">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="xs:string"/>
         *             &lt;enumeration value="xs:base64Binary"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DetectionPhase {

            @XmlValue
            protected VL116812011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;
            @XmlAttribute(name = "AdditionalText")
            @XmlSchemaType(name = "anySimpleType")
            protected String additionalText;
            @XmlAttribute(name = "AdditionalTextEncoding")
            protected String additionalTextEncoding;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL116812011 }
             *     
             */
            public VL116812011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL116812011 }
             *     
             */
            public void setValue(VL116812011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "1072";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

            /**
             * Obtient la valeur de la propriété additionalText.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalText() {
                return additionalText;
            }

            /**
             * Définit la valeur de la propriété additionalText.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalText(String value) {
                this.additionalText = value;
            }

            /**
             * Obtient la valeur de la propriété additionalTextEncoding.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalTextEncoding() {
                return additionalTextEncoding;
            }

            /**
             * Définit la valeur de la propriété additionalTextEncoding.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalTextEncoding(String value) {
                this.additionalTextEncoding = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Dew_Point">
         *       &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="C" />
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="85" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DewPoint {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "Unit", required = true)
            protected String unit;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété unit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnit() {
                if (unit == null) {
                    return "C";
                } else {
                    return unit;
                }
            }

            /**
             * Définit la valeur de la propriété unit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnit(String value) {
                this.unit = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "85";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL436_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="436" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class EffectOnATMService {

            @XmlValue
            protected VL4365011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL4365011 }
             *     
             */
            public VL4365011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL4365011 }
             *     
             */
            public void setValue(VL4365011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "436";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>string255max">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="601" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Headline {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "601";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Height_Of_Cloud_Base">
         *       &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="ft" />
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="140" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class HeightOfCloudBase {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "Unit", required = true)
            protected String unit;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété unit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnit() {
                if (unit == null) {
                    return "ft";
                } else {
                    return unit;
                }
            }

            /**
             * Définit la valeur de la propriété unit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnit(String value) {
                this.unit = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "140";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL432_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="432" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class HighestDamage {

            @XmlValue
            protected VL4325011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL4325011 }
             *     
             */
            public VL4325011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL4325011 }
             *     
             */
            public void setValue(VL4325011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "432";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL451_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="451" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class InjuryLevel {

            @XmlValue
            protected VL4515011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL4515011 }
             *     
             */
            public VL4515011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL4515011 }
             *     
             */
            public void setValue(VL4515011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "451";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>LatitudeDecimal">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="439" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class LatitudeOfOcc {

            @XmlValue
            protected double value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             */
            public double getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             */
            public void setValue(double value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "439";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL168_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="168" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class LightConditions {

            @XmlValue
            protected VL1685011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL1685011 }
             *     
             */
            public VL1685011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL1685011 }
             *     
             */
            public void setValue(VL1685011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "168";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="433" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class LocalDate {

            @XmlValue
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setValue(XMLGregorianCalendar value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "433";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>Time">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="457" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class LocalTime {

            @XmlValue
            protected XMLGregorianCalendar value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setValue(XMLGregorianCalendar value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "457";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>string255max">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="440" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class LocationName {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "440";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>LongitudeDecimal">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="444" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class LongitudeOfOcc {

            @XmlValue
            protected double value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             */
            public double getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             */
            public void setValue(double value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "444";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Maximum_Gust">
         *       &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="kt" />
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="176" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class MaximumGust {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "Unit", required = true)
            protected String unit;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété unit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnit() {
                if (unit == null) {
                    return "kt";
                } else {
                    return unit;
                }
            }

            /**
             * Définit la valeur de la propriété unit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnit(String value) {
                this.unit = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "176";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1028_5_0_1_2">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="640" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ObjectDamaged {

            @XmlValue
            protected VL10285012 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL10285012 }
             *     
             */
            public VL10285012 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL10285012 }
             *     
             */
            public void setValue(VL10285012 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "640";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL430_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="430" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class OccurrenceCategory {

            @XmlValue
            protected VL4305011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL4305011 }
             *     
             */
            public VL4305011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL4305011 }
             *     
             */
            public void setValue(VL4305011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "430";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1015_5_0_1_2">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="431" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class OccurrenceClass {

            @XmlValue
            protected VL10155012 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL10155012 }
             *     
             */
            public VL10155012 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL10155012 }
             *     
             */
            public void setValue(VL10155012 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "431";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL455_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="455" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class OccurrenceStatus {

            @XmlValue
            protected VL4555011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL4555011 }
             *     
             */
            public VL4555011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL4555011 }
             *     
             */
            public void setValue(VL4555011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "455";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL275_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="275" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class SpeedMeasuredAt {

            @XmlValue
            protected VL2755011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL2755011 }
             *     
             */
            public VL2755011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL2755011 }
             *     
             */
            public void setValue(VL2755011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "275";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL1090_12_0_1_3">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="454" />
         *       &lt;attribute name="AdditionalText" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="AdditionalTextEncoding">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="xs:string"/>
         *             &lt;enumeration value="xs:base64Binary"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class StateAreaOfOcc {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;
            @XmlAttribute(name = "AdditionalText")
            @XmlSchemaType(name = "anySimpleType")
            protected String additionalText;
            @XmlAttribute(name = "AdditionalTextEncoding")
            protected String additionalTextEncoding;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "454";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

            /**
             * Obtient la valeur de la propriété additionalText.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalText() {
                return additionalText;
            }

            /**
             * Définit la valeur de la propriété additionalText.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalText(String value) {
                this.additionalText = value;
            }

            /**
             * Obtient la valeur de la propriété additionalTextEncoding.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalTextEncoding() {
                return additionalTextEncoding;
            }

            /**
             * Définit la valeur de la propriété additionalTextEncoding.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalTextEncoding(String value) {
                this.additionalTextEncoding = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL456_5_0_1_2">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="456" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ThirdPartyDamage {

            @XmlValue
            protected VL4565012 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL4565012 }
             *     
             */
            public VL4565012 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL4565012 }
             *     
             */
            public void setValue(VL4565012 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "456";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Fatalities_Aircraft">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="459" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class TotalFatalitiesAircraft {

            @XmlValue
            protected int value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             */
            public int getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             */
            public void setValue(int value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "459";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Fatalities_Ground">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="460" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class TotalFatalitiesGround {

            @XmlValue
            protected int value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             */
            public int getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             */
            public void setValue(int value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "460";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Injuries-Ground">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="463" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class TotalInjuriesGround {

            @XmlValue
            protected int value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             */
            public int getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             */
            public void setValue(int value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "463";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Minor_Injuries-Aircraft">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="468" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class TotalMinorInjuriesAircraft {

            @XmlValue
            protected int value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             */
            public int getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             */
            public void setValue(int value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "468";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Minor_Injuries-Ground">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="469" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class TotalMinorInjuriesGround {

            @XmlValue
            protected int value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             */
            public int getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             */
            public void setValue(int value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "469";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_On_Board_A_C">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="462" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class TotalOnBoardAC {

            @XmlValue
            protected int value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             */
            public int getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             */
            public void setValue(int value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "462";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Serious_Injuries-Aircraft">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="471" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class TotalSeriousInjuriesAircraft {

            @XmlValue
            protected int value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             */
            public int getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             */
            public void setValue(int value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "471";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Total_Serious_Injuries-Ground">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="472" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class TotalSeriousInjuriesGround {

            @XmlValue
            protected int value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             */
            public int getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             */
            public void setValue(int value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "472";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="477" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class UTCDate {

            @XmlValue
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setValue(XMLGregorianCalendar value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "477";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataTypes.xsd>Time">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="478" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class UTCTime {

            @XmlValue
            protected XMLGregorianCalendar value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setValue(XMLGregorianCalendar value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "478";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Visibility">
         *       &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="m" />
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="310" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Visibility {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "Unit", required = true)
            protected String unit;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété unit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnit() {
                if (unit == null) {
                    return "m";
                } else {
                    return unit;
                }
            }

            /**
             * Définit la valeur de la propriété unit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnit(String value) {
                this.unit = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "310";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL606_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="606" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class WeatherRelevant {

            @XmlValue
            protected VL6065011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL6065011 }
             *     
             */
            public VL6065011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL6065011 }
             *     
             */
            public void setValue(VL6065011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "606";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Wind_Direction">
         *       &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Degree(s)" />
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="320" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class WindDirection {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "Unit", required = true)
            protected String unit;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété unit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnit() {
                if (unit == null) {
                    return "Degree(s)";
                } else {
                    return unit;
                }
            }

            /**
             * Définit la valeur de la propriété unit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnit(String value) {
                this.unit = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "320";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL321_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="321" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class WindGusts {

            @XmlValue
            protected VL3215011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL3215011 }
             *     
             */
            public VL3215011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL3215011 }
             *     
             */
            public void setValue(VL3215011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "321";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>Base_Wind_Speed">
         *       &lt;attribute name="Unit" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="kt" />
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="322" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class WindSpeed {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "Unit", required = true)
            protected String unit;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété unit.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnit() {
                if (unit == null) {
                    return "kt";
                } else {
                    return unit;
                }
            }

            /**
             * Définit la valeur de la propriété unit.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnit(String value) {
                this.unit = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "322";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd>VL127_5_0_1_1">
         *       &lt;attribute name="attributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="127" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class WxConditions {

            @XmlValue
            protected VL1275011 value;
            @XmlAttribute(name = "attributeId", required = true)
            protected String attributeId;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link VL1275011 }
             *     
             */
            public VL1275011 getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link VL1275011 }
             *     
             */
            public void setValue(VL1275011 value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété attributeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttributeId() {
                if (attributeId == null) {
                    return "127";
                } else {
                    return attributeId;
                }
            }

            /**
             * Définit la valeur de la propriété attributeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttributeId(String value) {
                this.attributeId = value;
            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Aerodrome_General" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Aerodrome_General" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Aerodrome_Weather_Reports" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Aerodrome_Weather_Reports" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Air_Space" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Air_Space" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Aircraft" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Aircraft" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ATS_Unit" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}ATS_Unit" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Dangerous_Goods" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Dangerous_Goods" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Events" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Events" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Narrative" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Narrative" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Precipitation_And_Other_Weather_Phenomena" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Precipitation_And_Other_Weather_Phenomena" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Reporting_History" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Reporting_History" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Risk_Assessment" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Risk_Assessment" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Runway_Incursion" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Runway_Incursion" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Separation" type="{http://eccairsportal.jrc.ec.europa.eu/ECCAIRS5_dataBridge.xsd}Separation" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aerodromeGeneralOrAerodromeWeatherReportsOrAirSpace"
    })
    public static class ENTITIES {

        @XmlElements({
            @XmlElement(name = "Aerodrome_General", type = StaticAerodromeGeneral.class),
            @XmlElement(name = "Aerodrome_Weather_Reports", type = StaticAerodromeWeatherReports.class),
            @XmlElement(name = "Air_Space", type = StaticAirSpace.class),
            @XmlElement(name = "Aircraft", type = StaticAircraft.class),
            @XmlElement(name = "ATS_Unit", type = StaticATSUnit.class),
            @XmlElement(name = "Dangerous_Goods", type = StaticDangerousGoods.class),
            @XmlElement(name = "Events", type = StaticEvents.class),
            @XmlElement(name = "Narrative", type = StaticNarrative.class),
            @XmlElement(name = "Precipitation_And_Other_Weather_Phenomena", type = StaticPrecipitationAndOtherWeatherPhenomena.class),
            @XmlElement(name = "Reporting_History", type = StaticReportingHistory.class),
            @XmlElement(name = "Risk_Assessment", type = StaticRiskAssessment.class),
            @XmlElement(name = "Runway_Incursion", type = StaticRunwayIncursion.class),
            @XmlElement(name = "Separation", type = StaticSeparation.class)
        })
        protected List<Object> aerodromeGeneralOrAerodromeWeatherReportsOrAirSpace;

        /**
         * Gets the value of the aerodromeGeneralOrAerodromeWeatherReportsOrAirSpace property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aerodromeGeneralOrAerodromeWeatherReportsOrAirSpace property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAerodromeGeneralOrAerodromeWeatherReportsOrAirSpace().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StaticAerodromeGeneral }
         * {@link StaticAerodromeWeatherReports }
         * {@link StaticAirSpace }
         * {@link StaticAircraft }
         * {@link StaticATSUnit }
         * {@link StaticDangerousGoods }
         * {@link StaticEvents }
         * {@link StaticNarrative }
         * {@link StaticPrecipitationAndOtherWeatherPhenomena }
         * {@link StaticReportingHistory }
         * {@link StaticRiskAssessment }
         * {@link StaticRunwayIncursion }
         * {@link StaticSeparation }
         * 
         * 
         */
        public List<Object> getAerodromeGeneralOrAerodromeWeatherReportsOrAirSpace() {
            if (aerodromeGeneralOrAerodromeWeatherReportsOrAirSpace == null) {
                aerodromeGeneralOrAerodromeWeatherReportsOrAirSpace = new ArrayList<Object>();
            }
            return this.aerodromeGeneralOrAerodromeWeatherReportsOrAirSpace;
        }

    }

}
