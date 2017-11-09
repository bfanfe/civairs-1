-- MySQL dump 10.13  Distrib 5.7.11, for Linux (x86_64)
--
-- Host: localhost    Database: civairs_db
-- ------------------------------------------------------
-- Server version	5.7.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `civairs_db`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `civairs_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `civairs_db`;

--
-- Table structure for table `ATMStaff`
--

DROP TABLE IF EXISTS `ATMStaff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ATMStaff` (
  `ID` varchar(256) NOT NULL,
  `CISM_Offered` varchar(60) DEFAULT NULL,
  `Duty_Time_In_Position` varchar(60) DEFAULT NULL,
  `Category` varchar(60) DEFAULT NULL,
  `Sector_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_ATMStaff_Sector1_idx` (`Sector_ID`),
  CONSTRAINT `fk_ATMStaff_Sector1` FOREIGN KEY (`Sector_ID`) REFERENCES `Sector` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ATMStaff`
--

LOCK TABLES `ATMStaff` WRITE;
/*!40000 ALTER TABLE `ATMStaff` DISABLE KEYS */;
/*!40000 ALTER TABLE `ATMStaff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ATSUnit`
--

DROP TABLE IF EXISTS `ATSUnit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ATSUnit` (
  `ID` varchar(256) NOT NULL,
  `APW_Alerting` varchar(60) DEFAULT NULL,
  `RIMCAS_Alerting` varchar(60) DEFAULT NULL,
  `MSAW_Current_Alerting` varchar(60) DEFAULT NULL,
  `ATS_Unit_Name` varchar(60) DEFAULT NULL,
  `STCA_Current_Alerting` varchar(60) DEFAULT NULL,
  `Occurence_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_ATSUnit_Occurence1_idx` (`Occurence_ID`),
  CONSTRAINT `fk_ATSUnit_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ATSUnit`
--

LOCK TABLES `ATSUnit` WRITE;
/*!40000 ALTER TABLE `ATSUnit` DISABLE KEYS */;
/*!40000 ALTER TABLE `ATSUnit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ATSUnit_has_Narrative`
--

DROP TABLE IF EXISTS `ATSUnit_has_Narrative`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ATSUnit_has_Narrative` (
  `ATSUnit_ID` varchar(256) NOT NULL,
  `Narrative_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ATSUnit_ID`,`Narrative_ID`),
  KEY `fk_ATSUnit_has_Narrative_Narrative1_idx` (`Narrative_ID`),
  KEY `fk_ATSUnit_has_Narrative_ATSUnit1_idx` (`ATSUnit_ID`),
  CONSTRAINT `fk_ATSUnit_has_Narrative_ATSUnit1` FOREIGN KEY (`ATSUnit_ID`) REFERENCES `ATSUnit` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ATSUnit_has_Narrative_Narrative1` FOREIGN KEY (`Narrative_ID`) REFERENCES `Narrative` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ATSUnit_has_Narrative`
--

LOCK TABLES `ATSUnit_has_Narrative` WRITE;
/*!40000 ALTER TABLE `ATSUnit_has_Narrative` DISABLE KEYS */;
/*!40000 ALTER TABLE `ATSUnit_has_Narrative` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AerodromeGeneral`
--

DROP TABLE IF EXISTS `AerodromeGeneral`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AerodromeGeneral` (
  `ID` varchar(256) NOT NULL,
  `Aerodrome_Latitude` varchar(60) DEFAULT NULL,
  `Aerodrome_Longitude` varchar(60) DEFAULT NULL,
  `Area_Configuration` varchar(60) DEFAULT NULL,
  `Elevation_Above_MSL` varchar(60) DEFAULT NULL,
  `Location_Indicator` varchar(60) DEFAULT NULL,
  `Aerodrome_Status` varchar(60) DEFAULT NULL,
  `Surface_Type` varchar(60) DEFAULT NULL,
  `Landing_Area_Type` varchar(60) DEFAULT NULL,
  `Aerodrome_Type` varchar(60) DEFAULT NULL,
  `Location_On_Near_Aerodrome` varchar(20) DEFAULT NULL,
  `Occurence_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_AerodromeGeneral_Occurence1_idx` (`Occurence_ID`),
  CONSTRAINT `fk_AerodromeGeneral_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AerodromeGeneral`
--

LOCK TABLES `AerodromeGeneral` WRITE;
/*!40000 ALTER TABLE `AerodromeGeneral` DISABLE KEYS */;
/*!40000 ALTER TABLE `AerodromeGeneral` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AerodromeGeneral_has_Narrative`
--

DROP TABLE IF EXISTS `AerodromeGeneral_has_Narrative`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AerodromeGeneral_has_Narrative` (
  `AerodromeGeneral_ID` varchar(256) NOT NULL,
  `Narrative_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`AerodromeGeneral_ID`,`Narrative_ID`),
  KEY `fk_AerodromeGeneral_has_Narrative_Narrative1_idx` (`Narrative_ID`),
  KEY `fk_AerodromeGeneral_has_Narrative_AerodromeGeneral1_idx` (`AerodromeGeneral_ID`),
  CONSTRAINT `fk_AerodromeGeneral_has_Narrative_AerodromeGeneral1` FOREIGN KEY (`AerodromeGeneral_ID`) REFERENCES `AerodromeGeneral` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_AerodromeGeneral_has_Narrative_Narrative1` FOREIGN KEY (`Narrative_ID`) REFERENCES `Narrative` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AerodromeGeneral_has_Narrative`
--

LOCK TABLES `AerodromeGeneral_has_Narrative` WRITE;
/*!40000 ALTER TABLE `AerodromeGeneral_has_Narrative` DISABLE KEYS */;
/*!40000 ALTER TABLE `AerodromeGeneral_has_Narrative` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AerodromeWeatherReports`
--

DROP TABLE IF EXISTS `AerodromeWeatherReports`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AerodromeWeatherReports` (
  `ID` varchar(256) NOT NULL,
  `Wx_Report_Type` varchar(60) DEFAULT NULL,
  `Wx_Report_Validity` varchar(60) DEFAULT NULL,
  `Wx_Report` varchar(60) DEFAULT NULL,
  `Occurence_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_AerodromeWeatherReports_Occurence1_idx` (`Occurence_ID`),
  CONSTRAINT `fk_AerodromeWeatherReports_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AerodromeWeatherReports`
--

LOCK TABLES `AerodromeWeatherReports` WRITE;
/*!40000 ALTER TABLE `AerodromeWeatherReports` DISABLE KEYS */;
/*!40000 ALTER TABLE `AerodromeWeatherReports` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Aircraft`
--

DROP TABLE IF EXISTS `Aircraft`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Aircraft` (
  `ID` varchar(256) NOT NULL,
  `Manufacturer_Model` varchar(60) DEFAULT NULL,
  `Aircraft_Altitude` varchar(60) DEFAULT NULL,
  `A_C_Flight_Level` varchar(60) DEFAULT NULL,
  `Current_Traffic_Type` varchar(60) DEFAULT NULL,
  `Aircraft_Category` varchar(60) DEFAULT NULL,
  `Total_Cycles_A_C` varchar(60) DEFAULT NULL,
  `Airworthiness_Cert` varchar(60) DEFAULT NULL,
  `ATS_Route_Name` varchar(60) DEFAULT NULL,
  `Call_Sign` varchar(60) DEFAULT NULL,
  `Clearance_Validity` varchar(60) DEFAULT NULL,
  `Cleared_Altitude` varchar(60) DEFAULT NULL,
  `Cleared_Flight_Level` varchar(60) DEFAULT NULL,
  `Controlling_Agency` varchar(60) DEFAULT NULL,
  `Current_Flight_Rules` varchar(60) DEFAULT NULL,
  `Filed_Flight_Rules` varchar(60) DEFAULT NULL,
  `Filed_Traffic_Type` varchar(60) DEFAULT NULL,
  `Flight_Number` varchar(60) DEFAULT NULL,
  `Flight_Phase` varchar(60) DEFAULT NULL,
  `Instrument_Appr_Type` varchar(60) DEFAULT NULL,
  `Landing_Gear_Type` varchar(60) DEFAULT NULL,
  `Last_Departure_Point` varchar(60) DEFAULT NULL,
  `Maintenance_Docs` varchar(60) DEFAULT NULL,
  `Maximum_T_O_Mass` varchar(60) DEFAULT NULL,
  `Number_Of_Engines` varchar(60) DEFAULT NULL,
  `Occ_On_Ground` varchar(60) DEFAULT NULL,
  `Operation_Type` varchar(60) DEFAULT NULL,
  `Operator` varchar(60) DEFAULT NULL,
  `Planned_Destination` varchar(60) DEFAULT NULL,
  `Propulsion_Type` varchar(60) DEFAULT NULL,
  `Aircraft_Registration` varchar(60) DEFAULT NULL,
  `Rel_Wind_Direction` varchar(60) DEFAULT NULL,
  `Serial_Number` varchar(60) DEFAULT NULL,
  `SID_Route` varchar(60) DEFAULT NULL,
  `Speed_First_Event` varchar(60) DEFAULT NULL,
  `Type_Of_Airspeed` varchar(60) DEFAULT NULL,
  `SSR_Mode` varchar(60) DEFAULT NULL,
  `State_Of_Registry` varchar(60) DEFAULT NULL,
  `Aircraft_Total_Time` varchar(60) DEFAULT NULL,
  `Turbulence_Intensity` varchar(60) DEFAULT NULL,
  `Flight_Plan_Type` varchar(60) DEFAULT NULL,
  `Visib_Restrictions` varchar(60) DEFAULT NULL,
  `Wake_Turb_Category` varchar(60) DEFAULT NULL,
  `Mass_Group` varchar(60) DEFAULT NULL,
  `Year_Built` varchar(60) DEFAULT NULL,
  `Parts_Damaged` varchar(60) DEFAULT NULL,
  `Parts_Struck` varchar(60) DEFAULT NULL,
  `Species_Description` varchar(60) DEFAULT NULL,
  `Birds_Wildlife_Seen` varchar(60) DEFAULT NULL,
  `Birds_Wildlife_Struck` varchar(60) DEFAULT NULL,
  `Bird_Size` varchar(60) DEFAULT NULL,
  `Pilot_Advised_Of_Birds` varchar(60) DEFAULT NULL,
  `Time_Deviating_FL` varchar(60) DEFAULT NULL,
  `Cleared_FL_After` varchar(60) DEFAULT NULL,
  `Occurence_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_Aircraft_Occurence1_idx` (`Occurence_ID`),
  CONSTRAINT `fk_Aircraft_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Aircraft`
--

LOCK TABLES `Aircraft` WRITE;
/*!40000 ALTER TABLE `Aircraft` DISABLE KEYS */;
/*!40000 ALTER TABLE `Aircraft` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Aircraft_has_Narrative`
--

DROP TABLE IF EXISTS `Aircraft_has_Narrative`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Aircraft_has_Narrative` (
  `Aircraft_ID` varchar(256) NOT NULL,
  `Narrative_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`Aircraft_ID`,`Narrative_ID`),
  KEY `fk_Aircraft_has_Narrative_Narrative1_idx` (`Narrative_ID`),
  KEY `fk_Aircraft_has_Narrative_Aircraft1_idx` (`Aircraft_ID`),
  CONSTRAINT `fk_Aircraft_has_Narrative_Aircraft1` FOREIGN KEY (`Aircraft_ID`) REFERENCES `Aircraft` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Aircraft_has_Narrative_Narrative1` FOREIGN KEY (`Narrative_ID`) REFERENCES `Narrative` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Aircraft_has_Narrative`
--

LOCK TABLES `Aircraft_has_Narrative` WRITE;
/*!40000 ALTER TABLE `Aircraft_has_Narrative` DISABLE KEYS */;
/*!40000 ALTER TABLE `Aircraft_has_Narrative` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Airspace`
--

DROP TABLE IF EXISTS `Airspace`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Airspace` (
  `ID` varchar(256) NOT NULL,
  `Airspace_Class` varchar(60) DEFAULT NULL,
  `Airspace_Name` varchar(60) DEFAULT NULL,
  `Airspace_Type` varchar(60) DEFAULT NULL,
  `FIR_UIR_Name` varchar(60) DEFAULT NULL,
  `Special_Activities` text,
  `Occurence_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_Airspace_Occurence1_idx` (`Occurence_ID`),
  CONSTRAINT `fk_Airspace_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Airspace`
--

LOCK TABLES `Airspace` WRITE;
/*!40000 ALTER TABLE `Airspace` DISABLE KEYS */;
/*!40000 ALTER TABLE `Airspace` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Airspace_has_Narrative`
--

DROP TABLE IF EXISTS `Airspace_has_Narrative`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Airspace_has_Narrative` (
  `Airspace_ID` varchar(256) NOT NULL,
  `Narrative_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`Airspace_ID`,`Narrative_ID`),
  KEY `fk_Airspace_has_Narrative_Narrative1_idx` (`Narrative_ID`),
  KEY `fk_Airspace_has_Narrative_Airspace1_idx` (`Airspace_ID`),
  CONSTRAINT `fk_Airspace_has_Narrative_Airspace1` FOREIGN KEY (`Airspace_ID`) REFERENCES `Airspace` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Airspace_has_Narrative_Narrative1` FOREIGN KEY (`Narrative_ID`) REFERENCES `Narrative` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Airspace_has_Narrative`
--

LOCK TABLES `Airspace_has_Narrative` WRITE;
/*!40000 ALTER TABLE `Airspace_has_Narrative` DISABLE KEYS */;
/*!40000 ALTER TABLE `Airspace_has_Narrative` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DangerousGoods`
--

DROP TABLE IF EXISTS `DangerousGoods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DangerousGoods` (
  `ID` varchar(256) NOT NULL,
  `Dangerous_Good` varchar(60) DEFAULT NULL,
  `Origin_Of_Goods` varchar(60) DEFAULT NULL,
  `Air_Waybill_Consignment_Tracking_Number` varchar(60) DEFAULT NULL,
  `Shipper_Name` varchar(60) DEFAULT NULL,
  `Total_Number_Of_Packages_In_Consignment` varchar(60) DEFAULT NULL,
  `Subsidiary_Risk` varchar(60) DEFAULT NULL,
  `Type_Of_Outer_Packaging` varchar(60) DEFAULT NULL,
  `Packing_Group_Class_7_Category` varchar(60) DEFAULT NULL,
  `Number_Of_Inner_Packages` varchar(60) DEFAULT NULL,
  `Type_Of_Inner_Packaging` varchar(60) DEFAULT NULL,
  `Quantity_Per_Inner_Packaging` varchar(60) DEFAULT NULL,
  `Occurence_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_DangerousGoods_Occurence1_idx` (`Occurence_ID`),
  CONSTRAINT `fk_DangerousGoods_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DangerousGoods`
--

LOCK TABLES `DangerousGoods` WRITE;
/*!40000 ALTER TABLE `DangerousGoods` DISABLE KEYS */;
/*!40000 ALTER TABLE `DangerousGoods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DescriptiveFactor`
--

DROP TABLE IF EXISTS `DescriptiveFactor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DescriptiveFactor` (
  `ID` varchar(256) NOT NULL,
  `Descriptive_Factor_Subject` varchar(60) DEFAULT NULL,
  `Descriptive_Factor_Modifier` varchar(60) DEFAULT NULL,
  `Descriptive_Factor_Justification` varchar(60) DEFAULT NULL,
  `Events_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_DescriptiveFactor_Events1_idx` (`Events_ID`),
  CONSTRAINT `fk_DescriptiveFactor_Events1` FOREIGN KEY (`Events_ID`) REFERENCES `Events` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DescriptiveFactor`
--

LOCK TABLES `DescriptiveFactor` WRITE;
/*!40000 ALTER TABLE `DescriptiveFactor` DISABLE KEYS */;
/*!40000 ALTER TABLE `DescriptiveFactor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Engine`
--

DROP TABLE IF EXISTS `Engine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Engine` (
  `ID` varchar(256) NOT NULL,
  `Manufacturer_Model` varchar(60) DEFAULT NULL,
  `Time_Since_Overhaul` varchar(60) DEFAULT NULL,
  `Engine_Position` varchar(60) DEFAULT NULL,
  `Nature_Of_Engine_Involvement` varchar(60) DEFAULT NULL,
  `Thrust_Loss` varchar(60) DEFAULT NULL,
  `Engine_Serial_Number` varchar(60) DEFAULT NULL,
  `ATA_Chapter_Involved` varchar(60) DEFAULT NULL,
  `Time_Since_New` varchar(60) DEFAULT NULL,
  `Time_Since_Inspection` varchar(60) DEFAULT NULL,
  `Cycles_Since_New` varchar(60) DEFAULT NULL,
  `Cycles_Since_Overhaul` varchar(60) DEFAULT NULL,
  `Cycles_Since_Insp` varchar(60) DEFAULT NULL,
  `Date_Of_Manufacturing` varchar(60) DEFAULT NULL,
  `Date_Overhaul` varchar(60) DEFAULT NULL,
  `Date_Of_Inspection` varchar(60) DEFAULT NULL,
  `Mon_Sys_Funtioning` varchar(60) DEFAULT NULL,
  `Hazard_Eng_Effect` varchar(60) DEFAULT NULL,
  `Aircraft_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_Engine_Aircraft1_idx` (`Aircraft_ID`),
  CONSTRAINT `fk_Engine_Aircraft1` FOREIGN KEY (`Aircraft_ID`) REFERENCES `Aircraft` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Engine`
--

LOCK TABLES `Engine` WRITE;
/*!40000 ALTER TABLE `Engine` DISABLE KEYS */;
/*!40000 ALTER TABLE `Engine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EntityAttributes`
--

DROP TABLE IF EXISTS `EntityAttributes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EntityAttributes` (
  `Attribute_ID` int(11) NOT NULL,
  `Entity_ID` int(11) DEFAULT NULL,
  `Attribute_Name` varchar(60) DEFAULT NULL,
  `Entity_Name` varchar(60) DEFAULT NULL,
  `Attribute_Description` text,
  `Attribute_Detailed_Description` text,
  `Attribute_Explanation` text,
  PRIMARY KEY (`Attribute_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EntityAttributes`
--

LOCK TABLES `EntityAttributes` WRITE;
/*!40000 ALTER TABLE `EntityAttributes` DISABLE KEYS */;
INSERT INTO `EntityAttributes` VALUES (1,1,'Aerodrome_Latitude','AerodromeGeneral','Aerodrome latitude','Aerodrome latitude','The latitude of the aerodrome reference point. Aerodrome reference point: The designated geographical location of an aerodrome.'),(2,1,'Aerodrome_Longitude','AerodromeGeneral','Aerodrome longitude','Aerodrome longitude','The longitude of the aerodrome reference point. Aerodrome reference point: The designated geographical location of an aerodrome.'),(3,1,'Area_Configuration','AerodromeGeneral','Area configuration','Helicopter landing area configuration','Details on the configuration of the helicopter landing area.'),(4,1,'Elevation_Above_MSL','AerodromeGeneral','Elevation above MSL','Aerodrome elevation above MSL','Aerodrome elevation. The elevation of the highest point of the landing area. Elevation. The vertical distance of a point or a level, on or affixed to the surface of the earth, measured from mean sea level.'),(5,1,'Location_Indicator','AerodromeGeneral','Location indicator','Aerodrome location indicator','Location indicator. A four-letter code group formulated in accordance with rules prescribed by ICAO and assigned to the location of an aeronautical fixed station.'),(7,1,'Aerodrome_Status','AerodromeGeneral','Aerodrome status','Aerodrome status','The status of the aerodrome, i.e. whether it is a public, private or military aerodrome.'),(8,1,'Surface_Type','AerodromeGeneral','Surface type','Helicopter landing area surface type','The type of surface at the helicopter landing area.  N.B. To be entered only if the occurrence involves a landing of helicopters.'),(9,1,'Landing_Area_Type','AerodromeGeneral','Landing area type','Helicopter landing area type','The type of the helicopter landing area, i.e. whether it is, a surface heliport, a heliport on an elevated building or a helideck on a ship.'),(10,1,'Aerodrome_Type','AerodromeGeneral','Aerodrome type','Aerodrome type','The type of aerodrome, whether this is a land or water aerodrome.'),(11,2,'Wx_Report_Type','Aerodromeweatherreports','Aerodrome weather report type','Aerodrome weather report type','The type of weather report related to the aerodrome.'),(12,2,'Wx_Report_Validity','Aerodromeweatherreports','Aerodrome weather report validity','Aerodrome weather report validity','Information whether the aerodrome weather report was available, valid or not valid.'),(13,3,'Airspace_Class','AirSpace','Airspace class','Airspace class','Air traffic services airspaces. Airspaces of defined dimensions, alphabetically designated, within which specific types of flights may operate and for which air traffic services and rules of operation are specified. ICAO Annex 11.'),(14,3,'Airspace_Name','AirSpace','Airspace name','Airspace name','The name of the airspace.'),(15,3,'Airspace_Type','AirSpace','Airspace type','Airspace type','The type of the airspace, e.g. a danger area, a prohibited area or a terminal control area.'),(16,3,'FIR_UIR_Name','AirSpace','FIR/UIR name','Flight Information Region - name or Upper flight information region - name','A Flight Information Region is an airspace of defined dimensions within which flight information service and alerting service are provided. ICAO Annex 2  The name of the upper flight information region.  Flight information region: An airspace of defined dimensions within which flight information service and alerting service are provided.   (An 2, An 3, An 4, An 11, PANS-RAC)'),(17,3,'Special_Activities','AirSpace','Special activities','Special activities in airspace','Special activities in an airspace include airshows, parachuting, gliding, calibration flight, training flights and military exercises.'),(21,4,'Manufacturer_Model','Aircraft','Manufacturer/model','Aircraft make/model/series','The name of the aircraft manufacturer and model (international standard for aircraft make, model, and series groupings - CICTT).  The ICAO aircraft type designator - four character code assigned to the aircraft - is defined as an alias. [ICAO Doc 8643]'),(22,4,'Aircraft_Altitude','Aircraft','Aircraft altitude','The aircraft\'s altitude at the time of the occurrence','The aircraft\'s altitude at the time of the occurrence.  Altitude is the vertical distance of an aircraft measured from mean sea level.'),(25,4,'A_C_Flight_Level','Aircraft','A/C flight level','Aircraft flight level at the time of the occurrence','The aircraft flight level at the time of the occurrence. Flight level: A surface of constant atmospheric pressure which is related to a specific pressure datum, 1 013.2 hectopascals (hPa), and is separated from other such surfaces by specific pressure intervals.   Note 1. - A pressure type altimeter calibrated in accordance with the standard atmosphere:  a) when set to a QNH altimeter setting, will indicate altitude   b) when set to a QFE altimeter setting, will indicate height above the QFE reference datum   c) when set to a pressure 1 013.2 hPa, may be used to indicate flight levels. Note 2. - The terms height and altitude, used in Note 1 above, indicate altimetric rather than geometric heights and altitudes.'),(29,4,'Current_Traffic_Type','Aircraft','Current traffic type','Current traffic type','The type of the current traffic e.g. operational air traffic (OAT) or general air traffic (GAT). GAT encompasses all flights conducted in accordance with rules and procedures of ICAO.  N.B.. GAT can include military flights for which ICAO rules and procedures satisfy entirely their operational requirements. An example is a military transport aircraft flying on a civil airway route.  OAT encompasses all flights which do not comply with the provisions stated for GAT and for which rules and procedures have been specified by appropriate national authorities.  N.B.. OAT can include civil flights such as test-flights which require some deviation from ICAO rules to satisfy their operational requirements. : Eurocontrol (Flexible Use of Airspace Handbook)'),(32,4,'Aircraft_Category','Aircraft','Aircraft category','Aircraft category','Aircraft category. Classification of aircraft according to specified basic characteristics, e.g. aeroplane, helicopter, glider, free balloon. ICAO Annex 1.  Aircraft. Any machine that can derive support in the atmosphere from the reactions of the air other than the reactions of the air against the earth\'s surface. (Annex 8)'),(33,4,'Total_Cycles_A_C','Aircraft','Total cycles a/c','Aircraft total cycles','The total number of cycles to which this aircraft had been exposed.'),(35,4,'Airworthiness_Cert','Aircraft','Airworthiness cert.','Airworthiness certificate','A certificate provided by the national government organization of the Contracting Party responsible for regulating the airworthiness and environmental certification, approval or acceptance of aeronautical products, stating that the aircraft is fit to fly.'),(46,4,'ATS_Route_Name','Aircraft','ATS route name','ATS route name','The name of the ATS route.'),(54,4,'Call_Sign','Aircraft','Call sign','Aircraft call sign','The assigned International Telecommunications Union radio call sign of the aircraft. A group of letters, figures or a combination thereof which is either identical to, or the coded equivalent of, the aircraft call sign to be used in air-ground communications, and which is used to identify the aircraft in ground-ground air traffic services communication'),(57,4,'Clearance_Validity','Aircraft','Clearance validity','Clearance validity',''),(58,4,'Cleared_Altitude','Aircraft','Cleared altitude','Cleared altitude','The altitude to which the aircraft was cleared at the time of the occurrence.   Altitude is the vertical distance of the aircraft measured from mean sea level.'),(60,4,'Cleared_Flight_Level','Aircraft','Cleared flight level','Cleared flight level','The aircraft cleared flight level at the time of the occurrence.   Flight level: A surface of constant atmospheric pressure which is related to a specific pressure datum, 1 013.2 hectopascals (hPa), and is separated from other such surfaces by specific pressure intervals.   Note 1. - A pressure type altimeter calibrated in accordance with the standard atmosphere:   a) when set to a QNH altimeter setting, will indicate altitude    b) when set to a QFE altimeter setting, will indicate height above the QFE reference datum    c) when set to a pressure 1 013.2 hPa, may be used to indicate flight levels.  Note 2. - The terms height and altitude, used in Note 1 above, indicate altimetric rather than geometric heights and altitudes.'),(64,4,'Controlling_Agency','Aircraft','Controlling agency','Controlling agency','The agency which controlled the flight.  N.B. This includes the operator who is not an Air Traffic Services agency. An air traffic control service is a service provided for the purpose of: a) preventing collisions: between aircraft and on the manoeuvring area between aircraft and obstructions and b) expediting and maintaining an orderly flow of traffic.'),(79,4,'Current_Flight_Rules','Aircraft','Current flight rules','Current flight rules','The flight rules under which the aircraft was operating: e.g. IFR, VFR or Special VFR.'),(85,24,'Dew_Point','Occurrence','Dew point','Dew point temperature','The temperature to which the air must be cooled to become saturated by the water vapour already present in the air.'),(117,4,'Filed_Flight_Rules','Aircraft','Filed flight rules','Filed flight rules','The filed flight rules, e.g. IFR or VFR.'),(118,4,'Filed_Traffic_Type','Aircraft','Filed traffic type','Filed traffic type','The filed type of traffic, i.e. OAT or GAT [operational air traffic or general air traffic].GAT encompasses all flights conducted in accordance with rules and procedures of ICAO. N.B. GAT can include military flights for which ICAO rules and procedures satisfy their operational requirements entirely. An example is a military transport aircraft flying on a civil airway route.OAT encompasses all flights which do not comply with the provisions stated for GAT and for which rules and procedures have been specified by appropriate national authorities.N.B. OAT can include civil flights such as test-flights which require some deviation from ICAO rules to satisfy their operational requirements.Eurocontrol (Flexible Use of Airspace Handbook).'),(120,4,'Flight_Number','Aircraft','Flight number','Flight number (airline operation)','The flight number used for airline operations.'),(121,4,'Flight_Phase','Aircraft','Flight phase','The flight phase in which the occurrence took place','Enter the most significant phase of flight related to the occurrence. This is the phase of flight in which the event occurred which defined the accident/incident. Usually, this is the phase of flight in which the first event of the occurrence took place.'),(127,24,'Wx_Conditions','Occurrence','Wx conditions','Weather conditions','The general weather conditions in the area of the occurrence e.g. VMC, IMC or unknown.  '),(129,24,'Dang_Goods_Involved','Occurrence','Dang goods involved','Dangerous goods involved','Information whether dangerous goods were involved in the occurrence. Dangerous goods. Articles or substances which are capable of posing a risk to health, safety, property or the environment and which are shown in the list of dangerous goods in the Technical Instructions or which are classified according to those Intructions. ICAO Annex 18, Annex 6 part I.  Note:Dangerous goods are classified in Annex 18, Chapter 3.'),(140,24,'Height_Of_Cloud_Base','Occurrence','Height of cloud base','Height of cloud base','Ceiling: height of the lowest opaque layer of clouds.   Height: The vertical distance of a level, a point or an object considered as a point, measured from a specified datum.'),(165,4,'Instrument_Appr_Type','Aircraft','Instrument  appr type','Instrument approach type','The type of instrument approach, e.g. ILS complete or MLS.'),(166,4,'Landing_Gear_Type','Aircraft','Landing gear type','Landing gear type','The type of landing gear installed on this aircraft, e.g. fixed, skis or floats.'),(167,4,'Last_Departure_Point','Aircraft','Last departure point','Last departure point','The aerodrome or place from which the flight originated.'),(168,24,'Light_Conditions','Occurrence','Light conditions','Light conditions','The light conditions at the time of the occurrence.'),(174,4,'Maintenance_Docs','Aircraft','Maintenance docs','Maintenance documents status','Information on the status of the maintenance documentation, i.e. up-to-date or not.   E.g.: Maintenance release. A document which contains a certification confirming that the maintenance work to which it relates has been completed in a satisfactory manner, either in accordance with the approved data and the procedures described in the maintenance organization\'s procedures manual or under an equivalent system.'),(175,4,'Maximum_T_O_Mass','Aircraft','Maximum t/o mass','Maximum take-off mass','The maximum permissible take-off mass of the aircraft according to the Certificate of Airworthiness, the flight manual or other official document.'),(176,24,'Maximum_Gust','Occurrence','Maximum gust','Maximum wind gust','The maximum speed of a wind gust in knots or km/h. ICAO Annex 3.  A gust is any sudden increase of wind of short duration, usually a few seconds.'),(177,2,'Wx_Report','AerodromeWeatherReports','Wx report','Aviation routine weather report (in aeronautical meteorological code)','The aviation routine weather report (in aeronautical meteorological code). can be entered in this section in free text.'),(209,4,'Number_Of_Engines','Aircraft','Number of engines','Number of engines','Information on the number of engines of this aircraft.'),(213,4,'Occ_On_Ground','Aircraft','Occ. on ground','Occurrence on ground','An indication of whether the aircraft was airborne or not at the time of the occurrence.'),(214,4,'Operation_Type','Aircraft','Operation type','Operation type','The type of operation indicates whether this was a public transport operation (airline operation) or a general aviation flight.'),(215,4,'Operator','Aircraft','Operator','The name of the operator','The name of the aircraft operator exercising operational control over the flight (this should be entered for airline operations). State of the operator: The State that issued the Air Operation Certificate (AOC) of the operator. Annex 6: Part I: Operator. A person, organization or enterprise engaged in or offering to engage in an aircraft operation.  Operational control: The exercise of authority over the initiation, continuation, diversion or termination of a flight in the interest of the safety of the aircraft and the regularity and efficiency of the flight.  State of the Operator: The State which has issued the Air Operator Certificate (AOC).'),(228,4,'Planned_Destination','Aircraft','Planned destination','Planned destination','The place of intended landing.'),(230,28,'Phenomenon_Intensity','PrecipitationAndOtherWeatherPhenomena','Phenomenon intensity','Weather phenomenon intensity','The intensity of the weather phenomenon. '),(232,4,'Propulsion_Type','Aircraft','Propulsion type','Aircraft propulsion type','The type of propulsion system used by this aircraft, e.g. reciprocating engine or turbo-fan engine.'),(244,4,'Aircraft_Registration','Aircraft','Aircraft registration','Aircraft registration','The mark used to identify an aircraft. The mark consists of a common mark or nationality mark followed by a registration mark. The nationality mark shall be selected from the series of nationality symbols included in the radio call signs allocated to the State of Registry by the International Telecommunication Union. The nationality mark shall be notified to the International Civil Aviation Organization. The registration mark shall be letters, numbers, or a combination of letters and numbers, and shall be that assigned by the State of Registry or common mark registering authority. When letters are used for the registration mark, combinations shall not be used which might be confused with the five-letter combinations used in the International Code of Signals, Part II, the three-letter combinations beginning with Q used in the Q Code, and with the distress signal SOS, or other similar urgent signals, for example XXX, PAN and TTT. Rules regarding registration marks do not apply to meteorological pilot balloons used exclusively for meteorological purposes or to unmanned free balloons without a payload. ICAO Annex 7'),(245,4,'Rel_Wind_Direction','Aircraft','Rel wind direction','Relative wind direction','The direction of the wind relative to the flight path of the aircraft, i.e. crosswind, headwind, tailwind, quartering headwind or quartering tailwind. Wind is the air motion relative to the earth\'s surface.'),(254,4,'Serial_Number','Aircraft','Serial Number','Aircraft serial number','The serial number of the aircraft (free text field).'),(264,4,'SID_Route','Aircraft','SID route','Standard instrument departure route','Standard instrument departure: A designated instrument flight rule (IFR) departure route linking the aerodrome or a specified runway of the aerodrome with a specified significant point, normally on a designated ATS route, at which the en-route phase of a flight commences. PANS-OPS/I, PANS-OPS/II.'),(266,24,'Cloud_Amount','Occurrence','Cloud amount','The amount of cloud','Sky cover classification for aviation weather observations.'),(273,4,'Speed_First_Event','Aircraft','Speed (first event)','Speed at first event','The aircraft speed at the first event.'),(275,24,'Speed_Measured_At','Occurrence','Speed measured at','Wind speed measured at','Information as to where the wind speed was measured I.e. on the surface or at altitude.'),(276,4,'Type_Of_Airspeed','Aircraft','Type of airspeed','Type of airspeed','The type of airspeed reported in attribute 292  airspeed  - calibrated or true airspeed.'),(278,4,'SSR_Mode','Aircraft','SSR mode','Secondary surveillance radar mode','Secondary surveillance radar (SSR) mode, e.g. A, C or S. SSR Mode A is the basic ATC mode. SSR Mode C is used to obtain pressure altitude from the aircraft automatically. SSR Mode S makes available an air-ground data link, which could be used for ATS purposes in the high density airspace, in addition to its use for surveillance. ICAO Doc 9426.'),(281,4,'State_Of_Registry','Aircraft','State of registry','Aircraft State of registry','State of Registry. The State on whose register the aircraft is entered.'),(287,24,'Air_Temperature','Occurrence','Air temperature','Air temperature','The ambient air temperature.'),(291,4,'Aircraft_Total_Time','Aircraft','Aircraft total time','Aircraft total time','The total time of use of this aircraft in hours.'),(293,4,'Turbulence_Intensity','Aircraft','Turbulence intensity','Turbulence intensity','The intensity of the turbulence: light, moderate or severe. Turbulence: The irregular and instantaneous motions of air which is made up of a number of small of eddies that travel in the general air current. Atmospheric turbulence is caused by random fluctuations  in the wind flow. It can be caused by thermal or convective currents, differences in terrain and wind speed, along a frontal zone, or variation in temperature and pressure.  '),(297,4,'Flight_Plan_Type','Aircraft','Flight plan type','Flight plan type','The type of flight plan filed by this aircraft. Flight plan :Specified information provided to air traffic services units, relative to an intended flight or portion of a flight of an aircraft.'),(299,28,'Phenomenon_Type','PrecipitationAndOtherWeatherPhenomena','Phenomenon type','Weather phenomenon type','The type of weather phenomenon.  according to World Meteorological Organization (WMO) in consort with the International Civil Aviation Organization (ICAO). '),(310,24,'Visibility','Occurrence','Visibility','Visibility','Visibility for aeronautical purposes is the greater of: a) the greatest distance at which a black object of suitable dimensions, situated near the ground, can be seen and recognized when observed against a bright background  b) the greatest distance at which lights in the vicinity of 1 000 candelas can be seen and identified against an unlit background.  N.B. The two distances have different values in air of a given extinction coefficient, and the latter b) varies with the background illumination. The former a) is represented by the meteorological optical range (MOR). The value 9999 indicates unlimited visibility.'),(311,4,'Visib_Restrictions','Aircraft','Visib restrictions','Visibility restrictions','Visibility for aeronautical purposes is the greater of: a) the greatest distance at which a black object of suitable dimensions, situated near the ground, can be seen and recognized when observed against a bright background  b) the greatest distance at which lights in the vicinity of 1 000 candelas can be seen and identified against an unlit background.  N.B. The two distances have different values in air of a given extinction coefficient, and the latter b) varies with the background illumination. The former a) is represented by the meteorological optical range (MOR).'),(313,4,'Wake_Turb_Category','Aircraft','Wake turb. category','Wake turbulence category','Wake turbulence categories are allocated according to the maximum certificated take-off mass of the aircraft by which it is generated: HEAVY (H) - all aircraft types of 136 000 kg or more  MEDIUM (M) - aircraft types less than 136 000 kg but more than 7 000 kg  and LIGHT (L) - aircraft types of 7 000 kg or less. ICAO Doc 9426.'),(319,4,'Mass_Group','Aircraft','Mass group','Aircraft mass group','The mass group of the aircraft based on the maximum certificated take-off mass. Groups are:  0 - 2250 kg 2251 - 5700 kg 5701 - 27000 kg 27001 - 272000 kg >272000 kg  Mass: A quantity characteristic of a body, which relates the attraction of this body toward another body. Since the mass of a body is not fixed in magnitude, all masses are referred to the standard kilogram, which is a lump of platinum.  Mass of a body always has the same value  weight changes with change in the acceleration of gravity.   Note: Near the earth, the force of gravity creates a condition where mass is equal to weight. Thus the confusion and the often inter-changeability of Mass &Weight.   '),(320,24,'Wind_Direction','Occurrence','Wind direction','Wind direction','The direction of the wind in degrees.  Wind is the horizontal movement of air relative to the earth\'s surface and is caused by variations in temperature and pressure (for instance, air rises as it warms and a cool breeze moves in to take the place of the rising air.) The wind direction is the direction from which the wind is blowing (for example, a north wind comes from the north and blows toward the south.)'),(321,24,'Wind_Gusts','Occurrence','Wind gusts','Wind gusts','Information whether the wind was gusting or not. Gusts are included when wind speed is 10 knots (20 km/h) or more above the mean. ICAO Annex 3. A gust is a sudden, brief increase in wind speed that generally lasts less than 20 seconds. Wind is the air motion relative to the earth\'s surface.'),(322,24,'Wind_Speed','Occurrence','Wind speed','Wind speed','The speed of the wind in knots or kilometres per hour.  Wind is the horizontal movement of air relative to the earth\'s surface and is caused by variations in temperature and pressure (for instance, air rises as it warms and a cool breeze moves in to take the place of the rising air.) The wind direction is the direction from which the wind is blowing (for example, a north wind comes from the north and blows toward the south.)'),(327,4,'Year_Built','Aircraft','Year built','Year of aircraft manufacture','The year the aircraft was built.'),(340,9,'CISM_Offered','ATMStaff','CISM offered','ATM person\'s CISM offered','Information on whether the air traffic management controller incident stress management programme was offered.'),(347,9,'Duty_Time_In_Position','ATMStaff','Duty time in position','ATM person\'s duty time in position','The duty time of the air traffic management person in this position before the time of the occurrence.'),(357,9,'Category','ATMStaff','Category','ATM person\'s category','The category of this air traffic management person, e.g. area supervisor, planning controller or radar assistant.'),(363,10,'APW_Alerting','ATSUnit','APW alerting','Information on the alerting of an Area Proximity Warning System','Area Proximity Warning, is intended to alert situations where an eligible (SNET) aircraft is, or is predicted to be, flying in a region (SNET) of protected airspace. Operational Concept: APW informs the controller when an aircraft is predicted to penetrate, or has penetrated, a region (SNET) of airspace, which has been defined as protected. The penetration may be in the lateral, the vertical plane or a combination of the two. Note.- Regions (SNET): The functions of regions (SNET) is to provide a means of assigning particular characteristics to volumes of airspace. Relevant characteristics could include matters such as STCA separation criteria, MSAW minimum safe altitude (SNET) or Mode A codes for aircraft permitted to enter a volume of airspace protected by APW. (Ref.-EUROCONTROL-APW) '),(366,10,'RIMCAS_Alerting','ATSUnit','RIMCAS alerting','Runway Incursion Monitoring and Collision Alert System alerting','Definition: Information on whether the Runway Incursion Monitoring and Collision Alert System was functioning.RIMCAS: The RIMCAS function is integrated in A-SMGCS and is a software module designed to monitor movements on the aerodrome surface, using data from a surveillance system, in order to predict and identify possible conflict situations (Conflict Alerts) within the surveillance area. In its basic form, RIMCAS will warn of runway area incursion by aircraft or vehicles, or incursion of mobiles into other designated restricted areas on the airport, such as Instrument Landing System (ILS) critical areas, when an aircraft is due to land or take off on the active runway. The open systems architecture makes it possible to extend the Advanced Surface Movement Guidance and Control System with approach control functionality to provide a fully Integrated Tower System.'),(369,10,'MSAW_Current_Alerting','ATSUnit','MSAW current alerting','Minimum Safe Altitude Warning System alerting with current warning.','Information on the functioning of the Minimum Safe Altitude Warning System with current warning.  MSAW:The generation of minimum safe altitude warnings is a function of an ATC radar data processing system. The objective of the MSAW function is to assist in the prevention of controlled flight into terrain accidents by generating, in a timely manner, a warning of the possible infringement of a minimum safe altitude.'),(372,10,'ATS_Unit_Name','ATSUnit','ATS unit name','ATS unit\'s name','The name of this air traffic services unit.'),(379,10,'STCA_Current_Alerting','ATSUnit','STCA current alerting','Short Term conflict alert system with current warning alerting','Information on the functioning of the short term conflict alert system with current warning. STCA: The generation of short term conflict alerts is a function of an ATC radar data processing system. The objective of the STCA function is to assist the controller in maintaining separation between controlled flights by generating, in a timely manner, an alert of a potential infringement of separation minima.'),(387,13,'Manufacturer_Model','Engine','Manufacturer/model','Manufacturer/model of engine involved','Manufacturer/model of engine involved'),(389,13,'Time_Since_Overhaul','Engine','Time since overhaul','Time since overhaul of the engine (Hours)','Time since overhaul of the engine (Hours) at the time of occurrence'),(390,14,'Event_Type','Events','Event Type','Event type','The type of event, i.e. aircraft/system/component, consequential, air navigation services, aerodrome and ground aids, CAA, other or unknown.'),(391,14,'Phase','Events','Phase','Event phase','The phase of flight that relates to the event.'),(397,16,'Validity','FlightCrewLicenses','Validity','Flight crew license validity','Information on whether this flight crew member held a valid license.'),(398,16,'Ratings','FlightCrewLicenses','Ratings','Flight crew license ratings','Information on the ratings held by this flight crew member. A Rating is an authorization entered on or associated with a license and forming part thereof, stating special conditions, privileges or limitations pertaining to such license. ICAO Annex 1.'),(399,16,'License_Issued_By','FlightCrewLicenses','License issued by','License issued by','Information whether the license of this crew member was issued by the State of Registry of this aircraft or State of Operator.'),(400,16,'License_Type','FlightCrewLicenses','License type','Flight crew license, license type','The type of license held by this flight crew member.'),(402,17,'Category','FlightCrewMember','Category','Flight crew category','The category of this flight crew member on this flight, e.g. pilot-in-command or co-pilot.'),(403,17,'Duty_Last_24_Hours','FlightCrewMember','Duty last 24 hours','Flight crew member duty time last 24 hours','Annex 6 Part I : Duty period: Flight duty period. The total time from the moment a flight crew member commences duty, immediately subsequent to a rest period and prior to making a flight or a series of flights, to the moment the flight crew member is relieved of all duties having completed such flight or series of flights.'),(408,17,'Rest_Before_Duty','FlightCrewMember','Rest before duty','Flight crew member rest period before duty','Rest period. Any period of time on the ground during which a flight crew member is relieved of all duties by the operator.   Flight duty period. The total time from the moment a flight crew member commences duty, immediately subsequent to a rest period and prior to making a flight or a series of flights, to the moment the flight crew member is relieved of all duties having completed such flight or series of flights.  (Annex 6)'),(410,17,'Experience_All_A_C','FlightCrewMember','Experience all a/c','Flight crew member experience all aircraft categories total','The number of hours flown on all aircraft categories by this flight crew member in the time preceding this occurrence.'),(411,17,'Experience_This_A_C','FlightCrewMember','Experience this a/c','Flight crew member experience this aircraft total','The number of hours flown on this type of aircraft by this flight crew member in the time preceding this occurrence. Note: with this type it is meant to include aircraft of the same class rating. (Decision of the Taxonomy Working Group pf 2012 07 17).'),(418,20,'Person_Incapacitated','Incapacitation','Person incapacitated','Person incapacitated - category','Category of the incapacitated person.'),(419,20,'Reason_For_Incapacity','Incapacitation','Reason for incapacity','Reason for incapacitation','The reason for the incapacitation of this category of person.'),(424,22,'Narrative_Language','Narrative','Narrative language','The language of the narrative','The language used by the originator of the narrative.'),(425,22,'Narrative_Text','Narrative','Narrative text','The text of the narrative','The text of the narrative entered by the reporter of the occurrence.'),(427,51,'Safety_Recommendation','SafetyRecommendation','The area(s) of concern covered by the safety recommendation.','The area(s) of concern covered by the safety recommendation.','The area(s) of concern covered by the safety recommendation.'),(428,24,'ATM_Contribution','Occurrence','ATM contribution','ATM contribution','Information on whether and to what extent, in the judgement of the investigators, the air traffic management contributed to the occurrence.'),(430,24,'Occurrence_Category','Occurrence','Occurrence category','Occurrence categories',''),(431,24,'Occurrence_Class','Occurrence','Occurrence class','Occurrence class','The classification of the occurrence in relation to its severity.'),(432,24,'Highest_Damage','Occurrence','Highest Damage','Damage severity level','The highest level of damage sustained by any aircraft involved in the occurrence'),(433,24,'Local_Date','Occurrence','Local date','Local date','The local date of the occurrence. This date is formatted according to the system short date format.'),(436,24,'Effect_On_ATM_Service','Occurrence','Effect on ATM service','Effect on ATM service','The classification of the event based on the effect it had on the air traffic management service.'),(438,53,'Report_Identification','ReportingHistory','Report identification','Report identification','The identifying file reference of the final report.'),(439,24,'Latitude_Of_Occ','Occurrence','Latitude of occ','Latitude of occurrence','Latitude of the place of the occurrence in degrees, minutes and seconds.'),(440,24,'Location_Name','Occurrence','Location name','Location of occurrence','Location of occurrence should be the name of the closest settled area or geographical feature.'),(444,24,'Longitude_Of_Occ','Occurrence','Longitude of occ','Longitude of occurrence','Longitude of the place of the occurrence in degrees, minutes and seconds.'),(447,53,'Reporting_Entity','ReportingHistory','Reporting Entity','The name of the entity that provided the report','The name of the entity or organisation that provided the report.'),(448,24,'Damage_Not_To_A_C','Occurrence','Damage not to a/c','Damage on aerodrome','Third party property damage (i.e. damage not to the aircraft) on the aerodrome.'),(451,24,'Injury_Level','Occurrence','Injury level','Injury severity level','The highest level of injury sustained by any person in the occurrence.'),(452,24,'File_Number','Occurence','File number.','The occurrence file number.','The occurrence file number.'),(453,24,'Responsible_Entity','Occurence','Responsible entity','The identification of the entity that is responsible for the report.','The identification of the entity that is responsible for the report.'),(454,24,'State_Area_Of_Occ','Occurrence','State/area of occ','State or area of occurrence','The identification of the State or geographical area where the occurrence occurred. N.B. the designation employed for States and geographical areas do not imply the expression of any opinion whatsoever on the part of ICAO concerning the legal status of any country, territory, city, area or of its authorities, or concerning the delineation of its frontiers and boundaries.'),(455,24,'Occurrence_Status','Occurrence','Occurrence status','Occurrence status','The present status of the occurrence, e.g. open, initial notification, preliminary or closed.'),(456,24,'Third_Party_Damage','Occurrence','Third party damage','Third party damage','Any property damage sustained by third parties, i.e. not to the aircraft involved, on the ground. It also captures the main source of the damage.'),(457,24,'Local_Time','Occurrence','Local time','Local time','The local time of the occurrence time entered using the 24 hour clock e.g. 23:59.'),(459,24,'Total_Fatalities_Aircraft','Occurrence','Total fatalities aircraft','Total fatal injuries on aircraft','This is the sum of fatal injuries sustained on all of the aircraft involved.'),(460,24,'Total_Fatalities_Ground','Occurrence','Total fatalities ground','Total fatal injuries on ground','The total number of fatal injuries sustained by persons on the ground.'),(462,24,'Total_On_Board_A_C','Occurrence','Total on board a/c','Total injuries on aircraft','The total number of persons on board the aircraft involved in the occurrence.'),(463,24,'Total_Injuries-Ground','Occurrence','Total injuries-ground','Total injuries on ground','The total number of persons on the ground that sustained any injury in the occurrence.'),(468,24,'Total_Minor_Injuries-Aircraft','Occurrence','Total minor injuries-aircraft','Total minor injuries on aircraft','The total number of persons with minor injuries on board the aircraft involved in the occurrence.'),(469,24,'Total_Minor_Injuries-Ground','Occurrence','Total minor injuries-ground','Total minor injuries on ground','The total number of persons on ground involved in the occurrence with minor injuries.'),(471,24,'Total_Serious_Injuries-Aircraft','Occurrence','Total serious injuries-aircraft','Total serious injuries on aircraft','The total number of persons sustaining serious injuries on the aircraft.    A serious injury is an injury sustained by a person in an accident and which: a) requires hospitalization  or b) results in a fracture of any bone (except simple fractures of fingers, toes, or nose orfor more than 48 hours, commencing within 48 hours from the date when the injury was received  c) involves lacerations which cause severe haemorrhage, nerve, muscle or tendon damage  or d) involves injury to any internal organ  or e) involves second or third degree burns, or any burns affecting more than 5 percent of the body surface  or f) involves verified exposure to infectious substances or injurious radiation.'),(472,24,'Total_Serious_Injuries-Ground','Occurrence','Total serious injuries-ground','Total serious injuries on ground','The total number of persons sustaining serious injuries on the ground.   A serious injury is an injury sustained by a person in an accident and which: a) requires hospitalization for more than 48 hours, commencing within 48 hours from the date when the injury was received  or b) results in a fracture of any bone (except simple fractures of fingers, toes, or nose or  c) involves lacerations which cause severe haemorrhage, nerve, muscle or tendon damage  or d) involves injury to any internal organ  or e) involves second or third degree burns, or any burns affecting more than 5 percent of the body surface  or f) involves verified exposure to infectious substances or injurious radiation.'),(477,24,'UTC_Date','Occurrence','UTC date','UTC date of the occurrence','UTC: Time scale based on the second (SI), as defined and recommended by the CCIR, and maintained by the Bureau International des Poids et Mesures (BIPM). For most practical purposes associated with the Radio Regulations, UTC is equivalent to mean solar time at the prime meridian (0° longitude), formerly expressed in GMT.  The UTC date entered in the format which depends on the local installation. Use yyyy-mm-dd otherwise.'),(478,24,'UTC_Time','Occurrence','UTC time','UTC time','The UTC time of the occurrence entered using the 24 hour clock e.g. 23:59. UTC: Time scale based on the second (SI), as defined and recommended by the CCIR, and maintained by the Bureau International des Poids et Mesures (BIPM). For most practical purposes associated with the Radio Regulations, UTC is equivalent to mean solar time at the prime meridian (0° longitude), formerly expressed in GMT.'),(485,26,'Part_Name','PartInformation','Part name','Illustrated parts catalogue name of the component involved','The name of the part/component as indicated in the illustrated parts catalogue.'),(486,26,'Part_Number','PartInformation','Part number','Part number of the component involved','The part number of the involved component.'),(492,29,'Make_Of_Propeller','Propeller','Make of propeller','The manufacturer of the propeller','The manufacturer of the aircraft propeller.'),(493,29,'Propeller_Model','Propeller','Propeller model','The model of the propeller','The model of the aircraft propeller.'),(495,53,'Reporting_Form_Type','ReportingHistory','Reporting form type','Reporting form type','Type of reporting form used for specifying facts of an occurrence. The reference number of the report can be entered as additional text.'),(499,31,'Runway_Identifier','Runway','Runway identifier','The identifier of a runway',''),(509,31,'Surface_Type','Runway','Surface type','Runway surface type','This provides information on the type of surface in the take-off/landing area.'),(526,33,'Sector_Name','Sector','Sector name','Sector name','The identification/name of the sector.'),(527,33,'Services_Provided','Sector','Services provided','The services provided by sector','The services provided by sector (AIS, ATM, MET, SAR, etc.)'),(559,33,'Workload_Controller','Sector','Workload controller','Workload (perceived by the controller)','An Air Traffic Controller is a person authorized to provide an air traffic control service.'),(565,35,'ATM_Action','SeparationAircraft','ATM action','Avoiding action taken by ATM in loss of separation incident','Information on whether any air traffic management initiated avoidance action existed during an loss of separation incident, and whether it was adequate/late.'),(566,35,'A_C_Avoiding_Action','SeparationAircraft','A/c avoiding action','Avoiding action taken by aircraft in an incident involving a loss of separation','Information on whether any avoiding action was taken by the aircraft during an incident involving a loss of separation, and whether it was adequate/late.'),(570,34,'Horizontal_Rel_Mvmt','Separation','Horizontal rel mvmt','Information on the relative horizontal movement of the aircraft during the loss of separation','Information on the horizontal movement e.g. converging track, crossing tracks or parallel tracks, of the aircraft when a loss of separation incident took place.'),(574,34,'Military_A_C_Involved','Separation','Military a/c involved','Military aircraft involved in a loss of separation incident','This is used to record whether any military aircraft was involved in the loss of separationincident.'),(575,34,'Est_Minimum_Horiz_Sep','Separation','Est minimum horiz sep','Minimum horizontal separation estimated','The minimal horizontal distance during a  incident involving two aircraft as estimated by the investigation taking into account all available evidence (witnesses, recordings). Note, if the incident involved more than two aircraft, the separation page needs to be repeated for each pair.'),(577,34,'Req_Minimum_Horiz_Sep','Separation','Req minimum horiz sep','Minimum horizontal separation prescribed','The minimum horizontal separation that was prescribed at the time of the loss of separation incident.'),(579,34,'Min_Horiz_Sep_Rec','Separation','Min horiz sep rec','Minimum horizontal separation recorded','The minimal horizontal distance during a  incident involving two aircraft as recorded by a recording system such as RADAR recording.'),(581,34,'Est_Vert_Separation','Separation','Est vert separation','Minimum vertical separation estimated','The minimal vertical distance during a  incident involving two aircraft as estimated by the investigation taking into account all available evidence (witnesses, recordings). Note, if the incident involved more than two aircraft, the separation page needs to be repeated for each pair.'),(583,34,'Req_Vert_Separation','Separation','Req vert separation','Minimum vertical separation prescribed','The minimum vertical separation that was prescribed at the time of the loss of separation incident.'),(585,34,'Vertical_Sep_Recorded','Separation','Vertical sep recorded','Minimum vertical separation recorded','The minimal vertical distance during a  incident involving two aircraft as recorded by a recording system such as RADAR recording.'),(587,35,'Other_Aircraft_Seen','SeparationAircraft','Other aircraft seen','Other aircraft sighted in loss of separation incident','Information on whether this aircraft sighted the other aircraft involved in a loss of separation incident.'),(588,34,'Rate_Of_Closure','Separation','Rate of closure','Rate of closure in separation','The rate of closure between the aircraft involved in the loss of separation incident in knots.'),(591,35,'Risk_Reduction_A_C','SeparationAircraft','Risk reduction a/c','Risk reduction a/c from avoiding action in separation','Information on whether the risk of collision was reduced by the avoiding action taken during a loss of separation incident.'),(595,36,'Traffic_Info_Quality','SeparationTrafficInfoTypeQuality','Traffic info quality','The quality of the traffic information provided','Information on the quality of the overall traffic information at the time of the loss of separation incident, i.e. complete, incomplete, incorrect, late or none.'),(597,35,'Height_Altitude','SeparationAircraft','Height/altitude','The height or altitude at which the loss of separation occurred','The height or altitude at which the loss of separation incident occurred.  Height: The vertical distance of a level, a point or an object considered as a point, measured from a specified datum.     Altitude:The vertical distance of a level, a point or an object considered as a point, measured from mean sea level (MSL).'),(598,35,'Vertical_Profile_Of_Separation','SeparationAircraft','Vertical profile of separation','Vertical profile of the aircraft involved in a  separation occurrence.','Vertical profile of the aircraft involved in the loss of separation incident, i.e. climbing, descending or level flight before any avoidance action was taken.'),(601,24,'Headline','Occurrence','Headline','Headline','A short message identifying the accident to the human reader.'),(606,24,'Weather_Relevant','Occurrence','Weather relevant','Weather relevance','An indication whether, in the view of the investigation, the weather was relevant to the occurrence.'),(610,35,'RA_Type','SeparationAircraft','RA Type','Resolution Advisory Type','The type of RA:   Altitude crossing RA. A resolution advisory is altitude crossing if own ACAS aircraft is currently at least 30 m (100 ft) below or above the threat aircraft for upward or downward sense advisories, respectively. Climb RA. A positive RA recommending a climb but not an increased climb. Corrective RA. A resolution advisory that advises the pilot to deviate from the current flight path. Descend RA. A positive RA recommending a descent but not an increased descent. Increased rate RA. A resolution advisory with a strength that recommends increasing the altitude rate to a value exceeding that recommended by a previous climb or descend RA. Reversed sense RA. A resolution advisory that has had its sense reversed. Annex 10, Vol 4, Chapter 4.    Resolution advisory (RA). An indication given to the flight crew recommending:  a) a manoeuvre intended to provide separation from all threats or  b) a manoeuvre restriction intended to maintain existing separation  Positive RA. A resolution advisory that advises the pilot either to climb or to descend (applies to ACAS II). '),(611,35,'Pilot_Response_To_RA','SeparationAircraft','Pilot response to RA','Pilot response to Resolution Advisor','The classification of the response of the pilot to the RA, an indication whether he climbed, descended, turned, did not respond, etc.'),(613,35,'RA_Classification','SeparationAircraft','RA Classification','Resolution advisory Classification','Resolution advisory classification: the classification of an indication given to the flight crew recommending a manoeuvre intended to provide separation from all threats  or a manoeuvre restriction intended to maintain existing separation.'),(619,33,'RTF_Frequency','Sector','RTF Frequency','RTF Frequency','RTF Frequency'),(639,16,'Date_Of_License','FlightCrewLicenses','Date of license','The date the license was obtained','The date the license was obtained (the full date could be entered).'),(640,24,'Object_Damaged','Occurrence','Object damaged','Object damaged by impact of the aircraft','The object(s) damaged by the impact of the aircraft.'),(641,1,'Location_On_Near_Aerodrome','AerodromeGeneral','Location on/near aerodrome','Location of the occurrence on or near the aerodrome','The specific location of the occurrence on the aerodrome or an indication that the occurrence occurred near the aerodrome.  is meant to indicate that the occurrence occurred off the aerodrome but within 10 km from the aerodrome reference point.   Aerodrome reference point: The designate geographical location of an aerodrome. '),(643,4,'Parts_Damaged','Aircraft','Parts damaged','Parts of aircraft damaged','The parts of the aicraft damaged by the bird strike'),(644,4,'Parts_Struck','Aircraft','Parts struck','Parts of aircraft struck','The parts of the aircraft struck by the bird strike (but not necessarily damaged)'),(645,4,'Species_Description','Aircraft','Species description','Bird / wildlife species description ','Generally the species of birds / wildlife that were involved in the occurrence.  Note: Non-bird entries (mammal, reptile) are also included there.'),(646,4,'Birds_Wildlife_Seen','Aircraft','Birds/wildlife seen','Number of birds/wildlife seen','The estimated number of birds or wildlife seen.'),(647,4,'Birds_Wildlife_Struck','Aircraft','Birds/wildlife struck','Number of birds/wildlife struck','The estimated number of birds/wildlife that struck the aircraft.'),(648,4,'Bird_Size','Aircraft','Bird size','Bird size','The estimated size of the bird  (visual rendering based on average weight)'),(649,4,'Pilot_Advised_Of_Birds','Aircraft','Pilot advised of birds','Pilot advised of birds','Pilot advised of the presence of birds.'),(653,13,'Engine_Position','Engine','Engine position','The position of the engine','The position of the engine, counting from left to right, for which this information pertails.'),(654,13,'Nature_Of_Engine_Involvement','Engine','Nature of engine involvement','Nature of engine involvement','Nature of engine involvement'),(655,13,'Thrust_Loss','Engine','Thrust loss','Estimated % of thrust loss','Estimated % of thrust loss after an engine failure.'),(657,26,'Serial_Number','PartInformation','Serial number','Serial number of the part involved','The serial number of the involved component.'),(658,26,'Manufacturer','PartInformation','Manufacturer','Manufacturer of the part','The name of the manufacturer of the part.'),(659,26,'ATA_Chapter_Number','PartInformation','ATA chapter number','ATA chapter number of the part involved','Aircraft component and systems (descriptive factors list).'),(660,26,'Time_Since_New','PartInformation','Time since new','Part - Time since new','Number of hours since new.'),(661,26,'Time_Since_Overhaul','PartInformation','Time since overhaul','Part - Time since overhaul','Number of hours since overhaul.'),(662,26,'Time_Since_Inspection','PartInformation','Time since inspection','Part - Time since inspection','Number of hours since inspection.'),(663,26,'Cycles_Since_New','PartInformation','Cycles since new','Part - Cycles since new','Number of cycles since new.'),(664,26,'Cycles_Since_Overhaul','PartInformation','Cycles since overhaul','Part - Cycles since overhaul','Number of cycles since overhaul.'),(665,26,'Cycles_Since_Insp','PartInformation','Cycles since insp','Part - Cycles since inspection','Number of cycles since inspection.'),(666,26,'Date_Of_Manufacturing','PartInformation','Date of manufacturing','Part - Date of manufacturing','The date of part manufacturing.'),(667,26,'Date_Of_Overhaul','PartInformation','Date of overhaul','Part - Date of overhaul','The date of aircraft overhaul.'),(668,26,'Date_Repair_Insp','PartInformation','Date repair/insp','Part - Date of repair / inspection','The date of aircraft repair or inspection.'),(688,43,'Dangerous_Good','DangerousGoods','Dangerous Good','Dangerous good (Class number and UN number)','Dangerous goods are divided into classes on the basis of the specific chemical characteristics producing the risk.  Indicate the UN number and/or the specific name of product as additional text when relevant.'),(718,59,'Risk_Grade','RiskAssessment','Risk Grade','Risk Grade','The resulting risk grade for the occurrence. '),(733,48,'Type_Of_Vehicle','Vehicle','Type of vehicle','Type of aerodrome vehicle','The type of aerodrome vehicle involved in the runway incursion.'),(741,47,'Entity_Involved','RunwayIncursion','Entity involved','Entities involved in a runway incursion','The type(s) of entity involved in a runway incursion: aircraft, vehicle or person.'),(743,48,'Vehicle_Controlled','Vehicle','Vehicle controlled','Vehicle being controlled by an ATS unit','This is used to record whether the vehicle involved in the runway incursion was being controlled by an ATS unit.'),(788,51,'Recommendation_Data_Link','SafetyRecommendation','The Recommendation external data link.','The Recommendation external data link.','The Recommendation external data link.'),(800,53,'Report_Status','ReportingHistory','Report status','Report status',''),(801,53,'Reporting_Date','ReportingHistory','Reporting date','Reporting date',''),(802,53,'Report','ReportingHistory','Report','Report',''),(816,4,'Time_Deviating_FL','Aircraft','Time deviating FL','Time spent deviating from cleared flight level',''),(817,4,'Cleared_FL_After','Aircraft','Cleared FL after','Cleared Flight Level after deviation.','To be indicated if different from Cleared Flight Level before deviation.'),(881,13,'Engine_Serial_Number','Engine','Engine Serial Number','Engine Serial Number',''),(882,13,'ATA_Chapter_Involved','Engine','ATA chapter involved','ATA chapter of the engine component involved',''),(883,13,'Time_Since_New','Engine','Time since new','Engine - Time since new',''),(884,13,'Time_Since_Inspection','Engine','Time since inspection','Engine - Time since inspection',''),(885,13,'Cycles_Since_New','Engine','Cycles since new','Engine - Cycles since new',''),(886,13,'Cycles_Since_Overhaul','Engine','Cycles since overhaul','Engine - Cycles since overhaul',''),(887,13,'Cycles_Since_Insp','Engine','Cycles since insp','Engine - Cycles since inspection',''),(888,13,'Date_Of_Manufacturing','Engine','Date of manufacturing','Engine - Date of manufacturing',''),(889,13,'Date_Overhaul','Engine','Date overhaul','Engine - Date overhaul',''),(890,13,'Date_Of_Inspection','Engine','Date of inspection','Engine - Date of inspection',''),(891,13,'Mon_Sys_Funtioning','Engine','Mon sys funtioning','Engine - Monitoring system functioning',''),(893,29,'Prop_Serial','Propeller','Prop serial','Propeller Serial Number',''),(894,29,'ATA_Chapter_Involved','Propeller','ATA chapter involved','ATA chapter of the propeller component involved',''),(895,29,'Prop_Position','Propeller','Prop position','The position of the propeller',''),(896,29,'Prop_Involvement','Propeller','Prop involvement','Nature of the propeller involvement',''),(897,29,'Estimated_Thrust_Loss','Propeller','Estimated thrust loss','Estimated % of thrust loss',''),(899,29,'Time_Since_New','Propeller','Time since new','Propeller - Time since new',''),(900,29,'Time_Since_Overhaul','Propeller','Time since overhaul','Propeller - Time since overhaul',''),(901,29,'Time_Since_Inspection','Propeller','Time since inspection','Propeller - Time since inspection',''),(902,29,'Cycles_Since_New','Propeller','Cycles since new','Propeller - Cycles since new',''),(903,29,'Cycles_Since_Overh','Propeller','Cycles since overh','Propeller - Cycles since overhaul',''),(904,29,'Cycles_Since_Insp','Propeller','Cycles since insp','Propeller - Cycles since inspection',''),(905,29,'Date_Of_Manufacturing','Propeller','Date of manufacturing','Propeller - Date of manufacturing',''),(906,29,'Date_Of_Overhaul','Propeller','Date of overhaul','Propeller - Date of overhaul',''),(907,29,'Date_Repair_Insp','Propeller','Date repair/insp','Propeller - Date of repair / inspection',''),(908,29,'Mon_Sys_Funtioning','Propeller','Mon sys funtioning','Propeller - Monitoring system functioning',''),(939,59,'Risk_Method','RiskAssessment','Risk Method','Risk Grading Method',''),(940,59,'Risk_Level','RiskAssessment','Risk Level','Numerical Risk Level','Normalized numerical risk level. Possible values between 0 and 100.'),(945,13,'Hazard_Eng_Effect','Engine','Hazard. eng effect','Hazardous engine effects','Hazardous engine effects'),(946,29,'Hazardous_Prop_Effects','Propeller','Hazardous prop effects','Hazardous propeller effects',''),(1051,43,'Origin_Of_Goods','DangerousGoods','Origin of goods','Origin of shipped goods','The origin of goods is information on the source of the dangerous goods in terms of its location.'),(1052,43,'Air_Waybill_Consignment_Tracking_Number','DangerousGoods','Air Waybill/ Consignment/ Tracking Number','Dangerous goods Air Waybill/ Consignment/ Tracking Number','The Air Waybill/ Consignment or Tracking Number is the reference number of the receipt issues by the airline or operators for the goods being carried and provides evidence of the contract of carriage.'),(1053,43,'Shipper_Name','DangerousGoods','Shipper Name','Shipper Name','The shipper name is the name of the organization responsible for the shipping of the goods.'),(1054,43,'Total_Number_Of_Packages_In_Consignment','DangerousGoods','Total Number of Packages in Consignment     ','Total Number of Packages in Consignment     ','The total number of packages in the individual consignment under the specific Air Waybill or Consignment Number.  '),(1055,43,'Subsidiary_Risk','DangerousGoods','Subsidiary risk','Subsidiary risk',''),(1056,43,'Type_Of_Outer_Packaging','DangerousGoods','Type of outer packaging','Type of outer packaging',''),(1057,43,'Packing_Group_Class_7_Category','DangerousGoods','Packing Group/ Class 7 Category','Packing Group/ Class 7 Category',''),(1058,43,'Number_Of_Inner_Packages','DangerousGoods','Number of inner packages','Number of inner packages',''),(1059,43,'Type_Of_Inner_Packaging','DangerousGoods','Type of inner packaging','Type of inner packaging',''),(1060,43,'Quantity_Per_Inner_Packaging','DangerousGoods','Quantity per inner packaging','Quantity per inner packaging','The quantity per inner packaging'),(1064,53,'Parties_Informed','ReportingHistory','Parties Informed','Parties Informed','Parties which were notified on the occurrence by the reporter'),(1065,53,'Risk_Classification','ReportingHistory','Risk Classification','Reporting Risk Organization Classification','Internal risk classification of the reporting organization'),(1066,53,'Risk_Methodology','ReportingHistory','Risk Methodology','Reporting Organization Risk Classification Methodology','Internal risk classification methodology of the reporting organization'),(1067,53,'Description_Investigation','ReportingHistory','Description Investigation','Description of Occurrence Investigation','Description of Occurrence Investigation'),(1068,53,'Risk_Assessment','ReportingHistory','Risk Assessment','Risk Assessment','Risk Assessment'),(1069,53,'Corrective_Actions','ReportingHistory','Corrective Actions','Corrective Actions','Corrective Actions'),(1070,53,'Conclusions','ReportingHistory','Conclusions','Conclusions','Conclusions'),(1071,53,'Tracking_Sheet_Number','ReportingHistory','Tracking Sheet Number','Tracking Sheet Number','Reporter\'s internal reference to the item grouping all reporter\'s reports related to the same unsafe condition or safety issue. This items would record the analysis of the risk associated to the common unsafe condition and the mitigating actions proposed'),(1072,24,'Detection_Phase','Occurrence','Detection Phase','Detection Phase','Phase when the occurrence or finding was detected');
/*!40000 ALTER TABLE `EntityAttributes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Events`
--

DROP TABLE IF EXISTS `Events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Events` (
  `ID` varchar(256) NOT NULL,
  `Event_Type` varchar(60) DEFAULT NULL,
  `Phase` varchar(60) DEFAULT NULL,
  `Occurence_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_Events_Occurence1_idx` (`Occurence_ID`),
  CONSTRAINT `fk_Events_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Events`
--

LOCK TABLES `Events` WRITE;
/*!40000 ALTER TABLE `Events` DISABLE KEYS */;
/*!40000 ALTER TABLE `Events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ExplanatoryFactor`
--

DROP TABLE IF EXISTS `ExplanatoryFactor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ExplanatoryFactor` (
  `ID` varchar(256) NOT NULL,
  `Explanatory_Factor_Subject` varchar(60) DEFAULT NULL,
  `Explanatory_Factor_Modifier` varchar(60) DEFAULT NULL,
  `The_Person_Or_Organization` varchar(60) DEFAULT NULL,
  `Explanatory_Factor_Justification` text,
  `DescriptiveFactor_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_ExplanatoryFactor_DescriptiveFactor1_idx` (`DescriptiveFactor_ID`),
  CONSTRAINT `fk_ExplanatoryFactor_DescriptiveFactor1` FOREIGN KEY (`DescriptiveFactor_ID`) REFERENCES `DescriptiveFactor` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ExplanatoryFactor`
--

LOCK TABLES `ExplanatoryFactor` WRITE;
/*!40000 ALTER TABLE `ExplanatoryFactor` DISABLE KEYS */;
/*!40000 ALTER TABLE `ExplanatoryFactor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FlightCrewLicences`
--

DROP TABLE IF EXISTS `FlightCrewLicences`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FlightCrewLicences` (
  `ID` varchar(256) NOT NULL,
  `Validity` date DEFAULT NULL,
  `Ratings` varchar(60) DEFAULT NULL,
  `License_Issued_By` varchar(60) DEFAULT NULL,
  `License_Type` varchar(60) DEFAULT NULL,
  `Date_Of_License` date DEFAULT NULL,
  `FlightCrewMember_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_FlightCrewLicences_FlightCrewMember1_idx` (`FlightCrewMember_ID`),
  CONSTRAINT `fk_FlightCrewLicences_FlightCrewMember1` FOREIGN KEY (`FlightCrewMember_ID`) REFERENCES `FlightCrewMember` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FlightCrewLicences`
--

LOCK TABLES `FlightCrewLicences` WRITE;
/*!40000 ALTER TABLE `FlightCrewLicences` DISABLE KEYS */;
/*!40000 ALTER TABLE `FlightCrewLicences` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FlightCrewMember`
--

DROP TABLE IF EXISTS `FlightCrewMember`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FlightCrewMember` (
  `ID` varchar(256) NOT NULL,
  `Category` varchar(60) DEFAULT NULL,
  `Duty_Last_24_Hours` decimal(10,2) DEFAULT NULL,
  `Rest_Before_Duty` decimal(10,2) DEFAULT NULL,
  `Experience_All_A_C` decimal(10,2) DEFAULT NULL,
  `Experience_This_A_C` decimal(10,2) DEFAULT NULL,
  `Aircraft_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_FlightCrewMember_Aircraft1_idx` (`Aircraft_ID`),
  CONSTRAINT `fk_FlightCrewMember_Aircraft1` FOREIGN KEY (`Aircraft_ID`) REFERENCES `Aircraft` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FlightCrewMember`
--

LOCK TABLES `FlightCrewMember` WRITE;
/*!40000 ALTER TABLE `FlightCrewMember` DISABLE KEYS */;
/*!40000 ALTER TABLE `FlightCrewMember` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Identifiers`
--

DROP TABLE IF EXISTS `Identifiers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Identifiers` (
  `ID` varchar(256) NOT NULL,
  `File_Number` varchar(60) NOT NULL,
  `Responsible_Entity` varchar(60) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_Identifiers_1_idx` (`Responsible_Entity`),
  CONSTRAINT `fk_Identifiers_1` FOREIGN KEY (`Responsible_Entity`) REFERENCES `ResponsibleEntity` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Identifiers`
--

LOCK TABLES `Identifiers` WRITE;
/*!40000 ALTER TABLE `Identifiers` DISABLE KEYS */;
/*!40000 ALTER TABLE `Identifiers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Incapacitation`
--

DROP TABLE IF EXISTS `Incapacitation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Incapacitation` (
  `ID` varchar(256) NOT NULL,
  `Person_Incapacitated` varchar(60) DEFAULT NULL,
  `Reason_For_Incapacity` varchar(60) DEFAULT NULL,
  `Aircraft_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_Incapacitation_Aircraft1_idx` (`Aircraft_ID`),
  CONSTRAINT `fk_Incapacitation_Aircraft1` FOREIGN KEY (`Aircraft_ID`) REFERENCES `Aircraft` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Incapacitation`
--

LOCK TABLES `Incapacitation` WRITE;
/*!40000 ALTER TABLE `Incapacitation` DISABLE KEYS */;
/*!40000 ALTER TABLE `Incapacitation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Narrative`
--

DROP TABLE IF EXISTS `Narrative`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Narrative` (
  `ID` varchar(256) NOT NULL,
  `Narrative_Language` varchar(60) DEFAULT NULL,
  `Narrative_Text` text,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Narrative`
--

LOCK TABLES `Narrative` WRITE;
/*!40000 ALTER TABLE `Narrative` DISABLE KEYS */;
/*!40000 ALTER TABLE `Narrative` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Notification`
--

DROP TABLE IF EXISTS `Notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Notification` (
  `ID` varchar(256) NOT NULL,
  `Identifiers_ID` varchar(256) NOT NULL,
  `Occurrence_Class` varchar(60) DEFAULT NULL,
  `Local_Date` date DEFAULT NULL,
  `Local_Time` datetime DEFAULT NULL,
  `UTC_Date` date DEFAULT NULL,
  `UTC_Time` datetime DEFAULT NULL,
  `Headline` text,
  `Aircraft_ID` varchar(60) DEFAULT NULL,
  `Aircraft_Type` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_Notification_Identifiers1_idx` (`Identifiers_ID`),
  CONSTRAINT `fk_Notification_Identifiers1` FOREIGN KEY (`Identifiers_ID`) REFERENCES `Identifiers` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Notification`
--

LOCK TABLES `Notification` WRITE;
/*!40000 ALTER TABLE `Notification` DISABLE KEYS */;
/*!40000 ALTER TABLE `Notification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Occurence`
--

DROP TABLE IF EXISTS `Occurence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Occurence` (
  `ID` varchar(256) NOT NULL,
  `Dew_Point` varchar(60) DEFAULT NULL,
  `Wx_Conditions` varchar(60) DEFAULT NULL,
  `Dang_Goods_Involved` varchar(60) DEFAULT NULL,
  `Height_Of_Cloud_Base` varchar(60) DEFAULT NULL,
  `Light_Conditions` varchar(60) DEFAULT NULL,
  `Maximum_Gust` varchar(60) DEFAULT NULL,
  `Cloud_Amount` varchar(60) DEFAULT NULL,
  `Speed_Measured_At` varchar(60) DEFAULT NULL,
  `Air_Temperature` varchar(60) DEFAULT NULL,
  `Visibility` varchar(60) DEFAULT NULL,
  `Wind_Direction` varchar(60) DEFAULT NULL,
  `Wind_Gusts` varchar(60) DEFAULT NULL,
  `Wind_Speed` varchar(60) DEFAULT NULL,
  `ATM_Contribution` varchar(60) DEFAULT NULL,
  `Occurrence_Category` varchar(60) DEFAULT NULL,
  `Occurrence_Class` varchar(60) DEFAULT NULL,
  `Highest_Damage` varchar(60) DEFAULT NULL,
  `Local_Date` date DEFAULT NULL,
  `Effect_On_ATM_Service` varchar(60) DEFAULT NULL,
  `Latitude_Of_Occ` varchar(60) DEFAULT NULL,
  `Location_Name` varchar(60) DEFAULT NULL,
  `Longitude_Of_Occ` varchar(60) DEFAULT NULL,
  `Damage_Not_To_A_C` varchar(60) DEFAULT NULL,
  `Injury_Level` varchar(60) DEFAULT NULL,
  `State_Area_Of_Occ` varchar(60) DEFAULT NULL,
  `Occurrence_Status` varchar(60) DEFAULT NULL,
  `Third_Party_Damage` varchar(60) DEFAULT NULL,
  `Local_Time` datetime DEFAULT NULL,
  `Total_Fatalities_Aircraft` varchar(60) DEFAULT NULL,
  `Total_Fatalities_Ground` varchar(60) DEFAULT NULL,
  `Total_On_Board_A_C` varchar(60) DEFAULT NULL,
  `Total_Injuries-Ground` varchar(60) DEFAULT NULL,
  `Total_Minor_Injuries-Aircraft` varchar(60) DEFAULT NULL,
  `Total_Minor_Injuries-Ground` varchar(60) DEFAULT NULL,
  `Total_Serious_Injuries-Aircraft` varchar(60) DEFAULT NULL,
  `Total_Serious_Injuries-Ground` varchar(60) DEFAULT NULL,
  `UTC_Date` date DEFAULT NULL,
  `UTC_Time` datetime DEFAULT NULL,
  `Headline` varchar(60) DEFAULT NULL,
  `Weather_Relevant` varchar(60) DEFAULT NULL,
  `Object_Damaged` varchar(60) DEFAULT NULL,
  `Detection_Phase` varchar(60) DEFAULT NULL,
  `Identifiers_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_Occurence_Identifiers1_idx` (`Identifiers_ID`),
  CONSTRAINT `fk_Occurence_Identifiers1` FOREIGN KEY (`Identifiers_ID`) REFERENCES `Identifiers` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Occurence`
--

LOCK TABLES `Occurence` WRITE;
/*!40000 ALTER TABLE `Occurence` DISABLE KEYS */;
/*!40000 ALTER TABLE `Occurence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Occurence_Notification`
--

DROP TABLE IF EXISTS `Occurence_Notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Occurence_Notification` (
  `Occurence_ID` varchar(60) NOT NULL,
  `Notification_ID` varchar(60) NOT NULL,
  PRIMARY KEY (`Occurence_ID`,`Notification_ID`),
  KEY `fk_Occurence_Notification_Occurence1_idx` (`Occurence_ID`),
  KEY `fk_Occurence_Notification_Notification1` (`Notification_ID`),
  CONSTRAINT `fk_Occurence_Notification_Notification1` FOREIGN KEY (`Notification_ID`) REFERENCES `Notification` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Occurence_Notification_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Occurence_Notification`
--

LOCK TABLES `Occurence_Notification` WRITE;
/*!40000 ALTER TABLE `Occurence_Notification` DISABLE KEYS */;
/*!40000 ALTER TABLE `Occurence_Notification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Occurence_has_Narrative`
--

DROP TABLE IF EXISTS `Occurence_has_Narrative`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Occurence_has_Narrative` (
  `Occurence_ID` varchar(256) NOT NULL,
  `Narrative_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`Occurence_ID`,`Narrative_ID`),
  KEY `fk_Occurence_has_Narrative_Narrative1_idx` (`Narrative_ID`),
  KEY `fk_Occurence_has_Narrative_Occurence1_idx` (`Occurence_ID`),
  CONSTRAINT `fk_Occurence_has_Narrative_Narrative1` FOREIGN KEY (`Narrative_ID`) REFERENCES `Narrative` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Occurence_has_Narrative_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Occurence_has_Narrative`
--

LOCK TABLES `Occurence_has_Narrative` WRITE;
/*!40000 ALTER TABLE `Occurence_has_Narrative` DISABLE KEYS */;
/*!40000 ALTER TABLE `Occurence_has_Narrative` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PartInformation`
--

DROP TABLE IF EXISTS `PartInformation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PartInformation` (
  `ID` varchar(256) NOT NULL,
  `Part_Name` varchar(60) DEFAULT NULL,
  `Part_Number` varchar(60) DEFAULT NULL,
  `Serial_Number` varchar(60) DEFAULT NULL,
  `Manufacturer` varchar(60) DEFAULT NULL,
  `ATA_Chapter_Number` varchar(60) DEFAULT NULL,
  `Time_Since_New` varchar(60) DEFAULT NULL,
  `Time_Since_Overhaul` varchar(60) DEFAULT NULL,
  `Time_Since_Inspection` varchar(60) DEFAULT NULL,
  `Cycles_Since_New` varchar(60) DEFAULT NULL,
  `Cycles_Since_Overhaul` varchar(60) DEFAULT NULL,
  `Cycles_Since_Insp` varchar(60) DEFAULT NULL,
  `Date_Of_Manufacturing` date DEFAULT NULL,
  `Date_Of_Overhaul` date DEFAULT NULL,
  `Date_Repair_Insp` date DEFAULT NULL,
  `Aircraft_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_PartInformation_Aircraft1_idx` (`Aircraft_ID`),
  CONSTRAINT `fk_PartInformation_Aircraft1` FOREIGN KEY (`Aircraft_ID`) REFERENCES `Aircraft` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PartInformation`
--

LOCK TABLES `PartInformation` WRITE;
/*!40000 ALTER TABLE `PartInformation` DISABLE KEYS */;
/*!40000 ALTER TABLE `PartInformation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PrecipitationAndOtherWeatherPhenomena`
--

DROP TABLE IF EXISTS `PrecipitationAndOtherWeatherPhenomena`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PrecipitationAndOtherWeatherPhenomena` (
  `ID` varchar(256) NOT NULL,
  `Phenomenon_Intensity` varchar(60) DEFAULT NULL,
  `Phenomenon_Type` text,
  `Occurence_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_PrecipitationAndOtherWeatherPhenomena_Occurence1_idx` (`Occurence_ID`),
  CONSTRAINT `fk_PrecipitationAndOtherWeatherPhenomena_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PrecipitationAndOtherWeatherPhenomena`
--

LOCK TABLES `PrecipitationAndOtherWeatherPhenomena` WRITE;
/*!40000 ALTER TABLE `PrecipitationAndOtherWeatherPhenomena` DISABLE KEYS */;
/*!40000 ALTER TABLE `PrecipitationAndOtherWeatherPhenomena` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Propeller`
--

DROP TABLE IF EXISTS `Propeller`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Propeller` (
  `ID` varchar(256) NOT NULL,
  `Make_Of_Propeller` varchar(60) DEFAULT NULL,
  `Propeller_Model` varchar(60) DEFAULT NULL,
  `Prop_Serial` varchar(60) DEFAULT NULL,
  `ATA_Chapter_Involved` varchar(60) DEFAULT NULL,
  `Prop_Position` varchar(60) DEFAULT NULL,
  `Prop_Involvement` varchar(60) DEFAULT NULL,
  `Estimated_Thrust_Loss` varchar(60) DEFAULT NULL,
  `Time_Since_New` varchar(60) DEFAULT NULL,
  `Time_Since_Overhaul` varchar(60) DEFAULT NULL,
  `Time_Since_Inspection` varchar(60) DEFAULT NULL,
  `Cycles_Since_New` varchar(60) DEFAULT NULL,
  `Cycles_Since_Overh` varchar(60) DEFAULT NULL,
  `Cycles_Since_Insp` varchar(60) DEFAULT NULL,
  `Date_Of_Manufacturing` date DEFAULT NULL,
  `Date_Of_Overhaul` date DEFAULT NULL,
  `Date_Repair_Insp` date DEFAULT NULL,
  `Mon_Sys_Funtioning` varchar(60) DEFAULT NULL,
  `Hazardous_Prop_Effects` varchar(60) DEFAULT NULL,
  `Aircraft_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_Propeller_Aircraft1_idx` (`Aircraft_ID`),
  CONSTRAINT `fk_Propeller_Aircraft1` FOREIGN KEY (`Aircraft_ID`) REFERENCES `Aircraft` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Propeller`
--

LOCK TABLES `Propeller` WRITE;
/*!40000 ALTER TABLE `Propeller` DISABLE KEYS */;
/*!40000 ALTER TABLE `Propeller` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ReportingHistory`
--

DROP TABLE IF EXISTS `ReportingHistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ReportingHistory` (
  `ID` varchar(256) NOT NULL,
  `Report_Identification` varchar(60) DEFAULT NULL,
  `Reporting_Entity` varchar(60) DEFAULT NULL,
  `Reporting_Form_Type` varchar(60) DEFAULT NULL,
  `Report_Status` varchar(60) DEFAULT NULL,
  `Reporting_Date` date DEFAULT NULL,
  `Report` varchar(60) DEFAULT NULL,
  `Parties_Informed` varchar(60) DEFAULT NULL,
  `Risk_Classification` varchar(60) DEFAULT NULL,
  `Risk_Methodology` varchar(60) DEFAULT NULL,
  `Description_Investigation` varchar(60) DEFAULT NULL,
  `Risk_Assessment` varchar(60) DEFAULT NULL,
  `Corrective_Actions` text,
  `Conclusions` text,
  `Tracking_Sheet_Number` varchar(60) DEFAULT NULL,
  `Occurence_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_ReportingHistory_Occurence1_idx` (`Occurence_ID`),
  CONSTRAINT `fk_ReportingHistory_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ReportingHistory`
--

LOCK TABLES `ReportingHistory` WRITE;
/*!40000 ALTER TABLE `ReportingHistory` DISABLE KEYS */;
/*!40000 ALTER TABLE `ReportingHistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ReportingHistory_has_Narrative`
--

DROP TABLE IF EXISTS `ReportingHistory_has_Narrative`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ReportingHistory_has_Narrative` (
  `ReportingHistory_ID` varchar(256) NOT NULL,
  `Narrative_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ReportingHistory_ID`,`Narrative_ID`),
  KEY `fk_ReportingHistory_has_Narrative_Narrative1_idx` (`Narrative_ID`),
  KEY `fk_ReportingHistory_has_Narrative_ReportingHistory1_idx` (`ReportingHistory_ID`),
  CONSTRAINT `fk_ReportingHistory_has_Narrative_Narrative1` FOREIGN KEY (`Narrative_ID`) REFERENCES `Narrative` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ReportingHistory_has_Narrative_ReportingHistory1` FOREIGN KEY (`ReportingHistory_ID`) REFERENCES `ReportingHistory` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ReportingHistory_has_Narrative`
--

LOCK TABLES `ReportingHistory_has_Narrative` WRITE;
/*!40000 ALTER TABLE `ReportingHistory_has_Narrative` DISABLE KEYS */;
/*!40000 ALTER TABLE `ReportingHistory_has_Narrative` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ResourceLocator`
--

DROP TABLE IF EXISTS `ResourceLocator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ResourceLocator` (
  `ID` varchar(256) NOT NULL,
  `File_Name` varchar(60) DEFAULT NULL,
  `Description` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ResourceLocator`
--

LOCK TABLES `ResourceLocator` WRITE;
/*!40000 ALTER TABLE `ResourceLocator` DISABLE KEYS */;
/*!40000 ALTER TABLE `ResourceLocator` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ResponsibleEntity`
--

DROP TABLE IF EXISTS `ResponsibleEntity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ResponsibleEntity` (
  `ID` varchar(60) NOT NULL,
  `Name` varchar(60) NOT NULL,
  `Entity_Type` varchar(60) NOT NULL,
  `Address` varchar(256) DEFAULT NULL,
  `Phone` varchar(60) DEFAULT NULL,
  `Email` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ResponsibleEntity`
--

LOCK TABLES `ResponsibleEntity` WRITE;
/*!40000 ALTER TABLE `ResponsibleEntity` DISABLE KEYS */;
INSERT INTO `ResponsibleEntity` VALUES ('1000','NGIS','RESPONSIBLE_ENTITY_TYPE_SYSTEME','NGIS Head Quarter, 23 BP3415 Abidjan','+225 45 12 85 51','info@ngis.com'),('1001','ANAC','RESPONSIBLE_ENTITY_TYPE_ANAC','ANAC Côte d\'Ivoire, Aéroport d\'Abidjan','+225 21 21 00 02','info@anac.ci'),('1002','BEA','RESPONSIBLE_ENTITY_TYPE_BEA','BEA, Aéroport d\'Abidjan','+225 21 21 00 01','bea@anac.ci'),('1003','ASCNA','RESPONSIBLE_ENTITY_TYPE_ANSP','Représenation ASECNA Côte d\'Ivoire, Aéroport d\'Abidjan','+225 21 27 58 88','dexrci-info@asecna.org'),('1475947024','NAS IVOIRE','RESPONSIBLE_ENTITY_TYPE_HANDLING','NAS, Aéroport d\'Abidjan','+225 21 22 00 04','info@nas.ci'),('388613852','AERIA','RESPONSIBLE_ENTITY_TYPE_AGA','AERIA, Aéport d\'Abidjan','+225 21 21 00 03','info@aeria-ci.com');
/*!40000 ALTER TABLE `ResponsibleEntity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RiskAssessment`
--

DROP TABLE IF EXISTS `RiskAssessment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RiskAssessment` (
  `ID` varchar(256) NOT NULL,
  `Risk_Grade` varchar(60) DEFAULT NULL,
  `Risk_Method` varchar(60) DEFAULT NULL,
  `Risk_Level` varchar(60) DEFAULT NULL,
  `Occurence_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_RiskAssessment_Occurence1_idx` (`Occurence_ID`),
  CONSTRAINT `fk_RiskAssessment_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RiskAssessment`
--

LOCK TABLES `RiskAssessment` WRITE;
/*!40000 ALTER TABLE `RiskAssessment` DISABLE KEYS */;
/*!40000 ALTER TABLE `RiskAssessment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Runway`
--

DROP TABLE IF EXISTS `Runway`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Runway` (
  `ID` varchar(256) NOT NULL,
  `Runway_Identifier` varchar(60) DEFAULT NULL,
  `Surface_Type` varchar(60) DEFAULT NULL,
  `AerodromeGeneral_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_Runway_AerodromeGeneral1_idx` (`AerodromeGeneral_ID`),
  CONSTRAINT `fk_Runway_AerodromeGeneral1` FOREIGN KEY (`AerodromeGeneral_ID`) REFERENCES `AerodromeGeneral` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Runway`
--

LOCK TABLES `Runway` WRITE;
/*!40000 ALTER TABLE `Runway` DISABLE KEYS */;
/*!40000 ALTER TABLE `Runway` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RunwayIncursion`
--

DROP TABLE IF EXISTS `RunwayIncursion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RunwayIncursion` (
  `ID` varchar(256) NOT NULL,
  `Entity_Involved` varchar(60) DEFAULT NULL,
  `Occurence_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_RunwayIncursion_Occurence1_idx` (`Occurence_ID`),
  CONSTRAINT `fk_RunwayIncursion_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RunwayIncursion`
--

LOCK TABLES `RunwayIncursion` WRITE;
/*!40000 ALTER TABLE `RunwayIncursion` DISABLE KEYS */;
/*!40000 ALTER TABLE `RunwayIncursion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SafetyRecommendation`
--

DROP TABLE IF EXISTS `SafetyRecommendation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SafetyRecommendation` (
  `ID` varchar(256) NOT NULL,
  `Safety_Recommendation` varchar(60) DEFAULT NULL,
  `Recommendation_Data_Link` varchar(256) DEFAULT NULL,
  `Occurence_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_SafetyRecommendation_Occurence1_idx` (`Occurence_ID`),
  CONSTRAINT `fk_SafetyRecommendation_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SafetyRecommendation`
--

LOCK TABLES `SafetyRecommendation` WRITE;
/*!40000 ALTER TABLE `SafetyRecommendation` DISABLE KEYS */;
/*!40000 ALTER TABLE `SafetyRecommendation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Sector`
--

DROP TABLE IF EXISTS `Sector`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Sector` (
  `ID` varchar(256) NOT NULL,
  `Sector_Name` varchar(60) DEFAULT NULL,
  `Services_Provided` varchar(60) DEFAULT NULL,
  `Workload_Controller` varchar(60) DEFAULT NULL,
  `RTF_Frequency` varchar(60) DEFAULT NULL,
  `ATSUnit_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_Sector_ATSUnit1_idx` (`ATSUnit_ID`),
  CONSTRAINT `fk_Sector_ATSUnit1` FOREIGN KEY (`ATSUnit_ID`) REFERENCES `ATSUnit` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Sector`
--

LOCK TABLES `Sector` WRITE;
/*!40000 ALTER TABLE `Sector` DISABLE KEYS */;
/*!40000 ALTER TABLE `Sector` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Separation`
--

DROP TABLE IF EXISTS `Separation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Separation` (
  `ID` varchar(256) NOT NULL,
  `Horizontal_Rel_Mvmt` varchar(60) DEFAULT NULL,
  `Military_A_C_Involved` varchar(60) DEFAULT NULL,
  `Est_Minimum_Horiz_Sep` varchar(60) DEFAULT NULL,
  `Req_Minimum_Horiz_Sep` varchar(60) DEFAULT NULL,
  `Min_Horiz_Sep_Rec` varchar(60) DEFAULT NULL,
  `Est_Vert_Separation` varchar(60) DEFAULT NULL,
  `Req_Vert_Separation` varchar(60) DEFAULT NULL,
  `Vertical_Sep_Recorded` varchar(60) DEFAULT NULL,
  `Rate_Of_Closure` varchar(60) DEFAULT NULL,
  `Occurence_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_Separation_Occurence1_idx` (`Occurence_ID`),
  CONSTRAINT `fk_Separation_Occurence1` FOREIGN KEY (`Occurence_ID`) REFERENCES `Occurence` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Separation`
--

LOCK TABLES `Separation` WRITE;
/*!40000 ALTER TABLE `Separation` DISABLE KEYS */;
/*!40000 ALTER TABLE `Separation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SeparationAircraft`
--

DROP TABLE IF EXISTS `SeparationAircraft`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SeparationAircraft` (
  `ID` varchar(256) NOT NULL,
  `ATM_Action` varchar(60) DEFAULT NULL,
  `A_C_Avoiding_Action` varchar(60) DEFAULT NULL,
  `Other_Aircraft_Seen` varchar(60) DEFAULT NULL,
  `Risk_Reduction_A_C` varchar(60) DEFAULT NULL,
  `Height_Altitude` varchar(60) DEFAULT NULL,
  `Vertical_Profile_Of_Separation` varchar(60) DEFAULT NULL,
  `RA_Type` varchar(60) DEFAULT NULL,
  `Pilot_Response_To_RA` varchar(60) DEFAULT NULL,
  `RA_Classification` varchar(60) DEFAULT NULL,
  `Separation_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_SeparationAircraft_Separation1_idx` (`Separation_ID`),
  CONSTRAINT `fk_SeparationAircraft_Separation1` FOREIGN KEY (`Separation_ID`) REFERENCES `Separation` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SeparationAircraft`
--

LOCK TABLES `SeparationAircraft` WRITE;
/*!40000 ALTER TABLE `SeparationAircraft` DISABLE KEYS */;
/*!40000 ALTER TABLE `SeparationAircraft` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SeparationTrafficInfoTypeQuality`
--

DROP TABLE IF EXISTS `SeparationTrafficInfoTypeQuality`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SeparationTrafficInfoTypeQuality` (
  `ID` varchar(256) NOT NULL,
  `Traffic_Info_Quality` varchar(60) DEFAULT NULL,
  `SeparationAircraft_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_SeparationTrafficInfoTypeQuality_SeparationAircraft1_idx` (`SeparationAircraft_ID`),
  CONSTRAINT `fk_SeparationTrafficInfoTypeQuality_SeparationAircraft1` FOREIGN KEY (`SeparationAircraft_ID`) REFERENCES `SeparationAircraft` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SeparationTrafficInfoTypeQuality`
--

LOCK TABLES `SeparationTrafficInfoTypeQuality` WRITE;
/*!40000 ALTER TABLE `SeparationTrafficInfoTypeQuality` DISABLE KEYS */;
/*!40000 ALTER TABLE `SeparationTrafficInfoTypeQuality` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Vehicle`
--

DROP TABLE IF EXISTS `Vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Vehicle` (
  `ID` varchar(256) NOT NULL,
  `Type_Of_Vehicle` varchar(60) DEFAULT NULL,
  `Vehicle_Controlled` varchar(60) DEFAULT NULL,
  `AerodromeGeneral_ID` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_Vehicle_AerodromeGeneral_idx` (`AerodromeGeneral_ID`),
  CONSTRAINT `fk_Vehicle_AerodromeGeneral` FOREIGN KEY (`AerodromeGeneral_ID`) REFERENCES `AerodromeGeneral` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Vehicle`
--

LOCK TABLES `Vehicle` WRITE;
/*!40000 ALTER TABLE `Vehicle` DISABLE KEYS */;
/*!40000 ALTER TABLE `Vehicle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ng_permission`
--

DROP TABLE IF EXISTS `ng_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ng_permission` (
  `permission_id` varchar(60) NOT NULL,
  `permission_description` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ng_permission`
--

LOCK TABLES `ng_permission` WRITE;
/*!40000 ALTER TABLE `ng_permission` DISABLE KEYS */;
INSERT INTO `ng_permission` VALUES ('notification:create','Create Notification'),('notification:delete','Delete Notification'),('notification:update','Update Notification'),('notification:view','View Notifications'),('role:create','Create role'),('role:delete','Delete role'),('role:update','Update role'),('role:view','View roles'),('user:create','Create user'),('user:delete','Delete user'),('user:update','Update user'),('user:view','View users');
/*!40000 ALTER TABLE `ng_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ng_role`
--

DROP TABLE IF EXISTS `ng_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ng_role` (
  `role_id` varchar(60) NOT NULL,
  `role_description` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ng_role`
--

LOCK TABLES `ng_role` WRITE;
/*!40000 ALTER TABLE `ng_role` DISABLE KEYS */;
INSERT INTO `ng_role` VALUES ('ADMIN','Administrator'),('ENTITY_NOTIFIER','Responsible Entity Notifier'),('SYS_MANAGER','System manager');
/*!40000 ALTER TABLE `ng_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ng_user`
--

DROP TABLE IF EXISTS `ng_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ng_user` (
  `login` varchar(60) NOT NULL,
  `Responsible_Entity_ID` varchar(60) NOT NULL,
  `password` varchar(260) NOT NULL,
  `first_name` varchar(60) NOT NULL,
  `last_name` varchar(60) NOT NULL,
  `birth_date` date DEFAULT NULL,
  `adress` varchar(260) DEFAULT NULL,
  `phone_number` varchar(60) DEFAULT NULL,
  `email` text,
  PRIMARY KEY (`login`),
  KEY `fk_ng_user_1_idx` (`Responsible_Entity_ID`),
  CONSTRAINT `fk_ng_user_1` FOREIGN KEY (`Responsible_Entity_ID`) REFERENCES `ResponsibleEntity` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ng_user`
--

LOCK TABLES `ng_user` WRITE;
/*!40000 ALTER TABLE `ng_user` DISABLE KEYS */;
INSERT INTO `ng_user` VALUES ('allou','1003','280d44ab1e9f79b5cce2dd4f58f5fe91f0fbacdac9f7447dffc318ceb79f2d02','ALLOU','Kouakou Patrice',NULL,'','',''),('login','1000','280d44ab1e9f79b5cce2dd4f58f5fe91f0fbacdac9f7447dffc318ceb79f2d02','BAMBA','Fanfe','1979-12-04','23 BP 3415 ABIDJAN 23 COTE D\'IVOIRE','(+225) 451-285-51',''),('scott','1000','0ffe1abd1a08215353c233d6e009613e95eec4253832a761af28ff37ac5a150c','SCOTT','Scott','1980-12-01','','',''),('sys','1000','0ffe1abd1a08215353c233d6e009613e95eec4253832a761af28ff37ac5a150c','SYSTEME','Manager','1980-01-01','','','');
/*!40000 ALTER TABLE `ng_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_permission`
--

DROP TABLE IF EXISTS `role_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_permission` (
  `role_id` varchar(60) NOT NULL,
  `permission_id` varchar(60) NOT NULL,
  PRIMARY KEY (`role_id`,`permission_id`),
  KEY `fk_role_permission_ng_permission1_idx` (`permission_id`),
  CONSTRAINT `fk_role_permission_ng_permission1` FOREIGN KEY (`permission_id`) REFERENCES `ng_permission` (`permission_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_role_permission_ng_role1` FOREIGN KEY (`role_id`) REFERENCES `ng_role` (`role_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_permission`
--

LOCK TABLES `role_permission` WRITE;
/*!40000 ALTER TABLE `role_permission` DISABLE KEYS */;
INSERT INTO `role_permission` VALUES ('ENTITY_NOTIFIER','notification:create'),('SYS_MANAGER','notification:create'),('ENTITY_NOTIFIER','notification:delete'),('SYS_MANAGER','notification:delete'),('ENTITY_NOTIFIER','notification:update'),('SYS_MANAGER','notification:update'),('ENTITY_NOTIFIER','notification:view'),('SYS_MANAGER','notification:view'),('SYS_MANAGER','role:create'),('SYS_MANAGER','role:delete'),('SYS_MANAGER','role:update'),('SYS_MANAGER','role:view'),('ADMIN','user:create'),('SYS_MANAGER','user:create'),('ADMIN','user:delete'),('SYS_MANAGER','user:delete'),('ADMIN','user:update'),('SYS_MANAGER','user:update'),('ADMIN','user:view'),('SYS_MANAGER','user:view');
/*!40000 ALTER TABLE `role_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_user`
--

DROP TABLE IF EXISTS `role_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_user` (
  `role_id` varchar(60) NOT NULL,
  `login` varchar(60) NOT NULL,
  PRIMARY KEY (`role_id`,`login`),
  KEY `fk_role_user_ng_user1_idx` (`login`),
  CONSTRAINT `fk_role_user_ng_role` FOREIGN KEY (`role_id`) REFERENCES `ng_role` (`role_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_role_user_ng_user1` FOREIGN KEY (`login`) REFERENCES `ng_user` (`login`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_user`
--

LOCK TABLES `role_user` WRITE;
/*!40000 ALTER TABLE `role_user` DISABLE KEYS */;
INSERT INTO `role_user` VALUES ('ENTITY_NOTIFIER','allou'),('ADMIN','login'),('SYS_MANAGER','sys');
/*!40000 ALTER TABLE `role_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'civairs_db'
--

--
-- Dumping routines for database 'civairs_db'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-01 17:51:42
