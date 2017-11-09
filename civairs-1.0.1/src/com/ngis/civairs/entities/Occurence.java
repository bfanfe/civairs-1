package com.ngis.civairs.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Occurence database table.
 * 
 */
@Entity
@Table(name="Occurence")
@NamedQuery(name="Occurence.findAll", query="SELECT o FROM Occurence o")
public class Occurence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Air_Temperature", length=60)
	private String air_Temperature;

	@Column(length=60)
	private String ATM_Contribution;

	@Column(name="Cloud_Amount", length=60)
	private String cloud_Amount;

	@Column(name="Damage_Not_To_A_C", length=60)
	private String damage_Not_To_A_C;

	@Column(name="Dang_Goods_Involved", length=60)
	private String dang_Goods_Involved;

	@Column(name="Detection_Phase", length=60)
	private String detection_Phase;

	@Column(name="Dew_Point", length=60)
	private String dew_Point;

	@Column(name="Effect_On_ATM_Service", length=60)
	private String effect_On_ATM_Service;

	@Column(name="Headline", length=60)
	private String headline;

	@Column(name="Height_Of_Cloud_Base", length=60)
	private String height_Of_Cloud_Base;

	@Column(name="Highest_Damage", length=60)
	private String highest_Damage;

	@Column(name="Injury_Level", length=60)
	private String injury_Level;

	@Column(name="Latitude_Of_Occ", length=60)
	private String latitude_Of_Occ;

	@Column(name="Light_Conditions", length=60)
	private String light_Conditions;

	@Temporal(TemporalType.DATE)
	@Column(name="Local_Date")
	private Date local_Date;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Local_Time")
	private Date local_Time;

	@Column(name="Location_Name", length=60)
	private String location_Name;

	@Column(name="Longitude_Of_Occ", length=60)
	private String longitude_Of_Occ;

	@Column(name="Maximum_Gust", length=60)
	private String maximum_Gust;

	@Column(name="Object_Damaged", length=60)
	private String object_Damaged;

	@Column(name="Occurrence_Category", length=60)
	private String occurrence_Category;

	@Column(name="Occurrence_Class", length=60)
	private String occurrence_Class;

	@Column(name="Occurrence_Status", length=60)
	private String occurrence_Status;

	@Column(name="Speed_Measured_At", length=60)
	private String speed_Measured_At;

	@Column(name="State_Area_Of_Occ", length=60)
	private String state_Area_Of_Occ;

	@Column(name="Third_Party_Damage", length=60)
	private String third_Party_Damage;

	@Column(name="Total_Fatalities_Aircraft", length=60)
	private String total_Fatalities_Aircraft;

	@Column(name="Total_Fatalities_Ground", length=60)
	private String total_Fatalities_Ground;

	@Column(name="`Total_Injuries-Ground`", length=60)
	private String total_Injuries_Ground;

	@Column(name="`Total_Minor_Injuries-Aircraft`", length=60)
	private String total_Minor_Injuries_Aircraft;

	@Column(name="`Total_Minor_Injuries-Ground`", length=60)
	private String total_Minor_Injuries_Ground;

	@Column(name="Total_On_Board_A_C", length=60)
	private String total_On_Board_A_C;

	@Column(name="`Total_Serious_Injuries-Aircraft`", length=60)
	private String total_Serious_Injuries_Aircraft;

	@Column(name="`Total_Serious_Injuries-Ground`", length=60)
	private String total_Serious_Injuries_Ground;

	@Temporal(TemporalType.DATE)
	private Date UTC_Date;

	@Temporal(TemporalType.TIMESTAMP)
	private Date UTC_Time;

	@Column(name="Visibility", length=60)
	private String visibility;

	@Column(name="Weather_Relevant", length=60)
	private String weather_Relevant;

	@Column(name="Wind_Direction", length=60)
	private String wind_Direction;

	@Column(name="Wind_Gusts", length=60)
	private String wind_Gusts;

	@Column(name="Wind_Speed", length=60)
	private String wind_Speed;

	@Column(name="Wx_Conditions", length=60)
	private String wx_Conditions;

	//bi-directional many-to-one association to ATSUnit
	@OneToMany(mappedBy="occurence")
	private List<ATSUnit> atsunits;

	//bi-directional many-to-one association to AerodromeGeneral
	@OneToMany(mappedBy="occurence")
	private List<AerodromeGeneral> aerodromeGenerals;

	//bi-directional many-to-one association to AerodromeWeatherReport
	@OneToMany(mappedBy="occurence")
	private List<AerodromeWeatherReport> aerodromeWeatherReports;

	//bi-directional many-to-one association to Aircraft
	@OneToMany(mappedBy="occurence")
	private List<Aircraft> aircrafts;

	//bi-directional many-to-one association to Airspace
	@OneToMany(mappedBy="occurence")
	private List<Airspace> airspaces;

	//bi-directional many-to-one association to DangerousGood
	@OneToMany(mappedBy="occurence")
	private List<DangerousGood> dangerousGoods;

	//bi-directional many-to-one association to Event
	@OneToMany(mappedBy="occurence")
	private List<Event> events;

	//bi-directional many-to-one association to Identifier
	@ManyToOne
	@JoinColumn(name="Identifiers_ID", nullable=false)
	private Identifier identifier;

	//bi-directional many-to-many association to Narrative
	@ManyToMany
	@JoinTable(
		name="Occurence_has_Narrative"
		, joinColumns={
			@JoinColumn(name="Occurence_ID", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="Narrative_ID", nullable=false)
			}
		)
	private List<Narrative> narratives;

	//bi-directional many-to-many association to Notification
	@ManyToMany
	@JoinTable(
		name="Occurence_Notification"
		, joinColumns={
			@JoinColumn(name="Occurence_ID", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="Notification_ID", nullable=false)
			}
		)
	private List<Notification> notifications;

	//bi-directional many-to-one association to PrecipitationAndOtherWeatherPhenomena
	@OneToMany(mappedBy="occurence")
	private List<PrecipitationAndOtherWeatherPhenomena> precipitationAndOtherWeatherPhenomenas;

	//bi-directional many-to-one association to ReportingHistory
	@OneToMany(mappedBy="occurence")
	private List<ReportingHistory> reportingHistories;

	//bi-directional many-to-one association to RiskAssessment
	@OneToMany(mappedBy="occurence")
	private List<RiskAssessment> riskAssessments;

	//bi-directional many-to-one association to RunwayIncursion
	@OneToMany(mappedBy="occurence")
	private List<RunwayIncursion> runwayIncursions;

	//bi-directional many-to-one association to SafetyRecommendation
	@OneToMany(mappedBy="occurence")
	private List<SafetyRecommendation> safetyRecommendations;

	//bi-directional many-to-one association to Separation
	@OneToMany(mappedBy="occurence")
	private List<Separation> separations;

	public Occurence() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAir_Temperature() {
		return this.air_Temperature;
	}

	public void setAir_Temperature(String air_Temperature) {
		this.air_Temperature = air_Temperature;
	}

	public String getATM_Contribution() {
		return this.ATM_Contribution;
	}

	public void setATM_Contribution(String ATM_Contribution) {
		this.ATM_Contribution = ATM_Contribution;
	}

	public String getCloud_Amount() {
		return this.cloud_Amount;
	}

	public void setCloud_Amount(String cloud_Amount) {
		this.cloud_Amount = cloud_Amount;
	}

	public String getDamage_Not_To_A_C() {
		return this.damage_Not_To_A_C;
	}

	public void setDamage_Not_To_A_C(String damage_Not_To_A_C) {
		this.damage_Not_To_A_C = damage_Not_To_A_C;
	}

	public String getDang_Goods_Involved() {
		return this.dang_Goods_Involved;
	}

	public void setDang_Goods_Involved(String dang_Goods_Involved) {
		this.dang_Goods_Involved = dang_Goods_Involved;
	}

	public String getDetection_Phase() {
		return this.detection_Phase;
	}

	public void setDetection_Phase(String detection_Phase) {
		this.detection_Phase = detection_Phase;
	}

	public String getDew_Point() {
		return this.dew_Point;
	}

	public void setDew_Point(String dew_Point) {
		this.dew_Point = dew_Point;
	}

	public String getEffect_On_ATM_Service() {
		return this.effect_On_ATM_Service;
	}

	public void setEffect_On_ATM_Service(String effect_On_ATM_Service) {
		this.effect_On_ATM_Service = effect_On_ATM_Service;
	}

	public String getHeadline() {
		return this.headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getHeight_Of_Cloud_Base() {
		return this.height_Of_Cloud_Base;
	}

	public void setHeight_Of_Cloud_Base(String height_Of_Cloud_Base) {
		this.height_Of_Cloud_Base = height_Of_Cloud_Base;
	}

	public String getHighest_Damage() {
		return this.highest_Damage;
	}

	public void setHighest_Damage(String highest_Damage) {
		this.highest_Damage = highest_Damage;
	}

	public String getInjury_Level() {
		return this.injury_Level;
	}

	public void setInjury_Level(String injury_Level) {
		this.injury_Level = injury_Level;
	}

	public String getLatitude_Of_Occ() {
		return this.latitude_Of_Occ;
	}

	public void setLatitude_Of_Occ(String latitude_Of_Occ) {
		this.latitude_Of_Occ = latitude_Of_Occ;
	}

	public String getLight_Conditions() {
		return this.light_Conditions;
	}

	public void setLight_Conditions(String light_Conditions) {
		this.light_Conditions = light_Conditions;
	}

	public Date getLocal_Date() {
		return this.local_Date;
	}

	public void setLocal_Date(Date local_Date) {
		this.local_Date = local_Date;
	}

	public Date getLocal_Time() {
		return this.local_Time;
	}

	public void setLocal_Time(Date local_Time) {
		this.local_Time = local_Time;
	}

	public String getLocation_Name() {
		return this.location_Name;
	}

	public void setLocation_Name(String location_Name) {
		this.location_Name = location_Name;
	}

	public String getLongitude_Of_Occ() {
		return this.longitude_Of_Occ;
	}

	public void setLongitude_Of_Occ(String longitude_Of_Occ) {
		this.longitude_Of_Occ = longitude_Of_Occ;
	}

	public String getMaximum_Gust() {
		return this.maximum_Gust;
	}

	public void setMaximum_Gust(String maximum_Gust) {
		this.maximum_Gust = maximum_Gust;
	}

	public String getObject_Damaged() {
		return this.object_Damaged;
	}

	public void setObject_Damaged(String object_Damaged) {
		this.object_Damaged = object_Damaged;
	}

	public String getOccurrence_Category() {
		return this.occurrence_Category;
	}

	public void setOccurrence_Category(String occurrence_Category) {
		this.occurrence_Category = occurrence_Category;
	}

	public String getOccurrence_Class() {
		return this.occurrence_Class;
	}

	public void setOccurrence_Class(String occurrence_Class) {
		this.occurrence_Class = occurrence_Class;
	}

	public String getOccurrence_Status() {
		return this.occurrence_Status;
	}

	public void setOccurrence_Status(String occurrence_Status) {
		this.occurrence_Status = occurrence_Status;
	}

	public String getSpeed_Measured_At() {
		return this.speed_Measured_At;
	}

	public void setSpeed_Measured_At(String speed_Measured_At) {
		this.speed_Measured_At = speed_Measured_At;
	}

	public String getState_Area_Of_Occ() {
		return this.state_Area_Of_Occ;
	}

	public void setState_Area_Of_Occ(String state_Area_Of_Occ) {
		this.state_Area_Of_Occ = state_Area_Of_Occ;
	}

	public String getThird_Party_Damage() {
		return this.third_Party_Damage;
	}

	public void setThird_Party_Damage(String third_Party_Damage) {
		this.third_Party_Damage = third_Party_Damage;
	}

	public String getTotal_Fatalities_Aircraft() {
		return this.total_Fatalities_Aircraft;
	}

	public void setTotal_Fatalities_Aircraft(String total_Fatalities_Aircraft) {
		this.total_Fatalities_Aircraft = total_Fatalities_Aircraft;
	}

	public String getTotal_Fatalities_Ground() {
		return this.total_Fatalities_Ground;
	}

	public void setTotal_Fatalities_Ground(String total_Fatalities_Ground) {
		this.total_Fatalities_Ground = total_Fatalities_Ground;
	}

	public String getTotal_Injuries_Ground() {
		return this.total_Injuries_Ground;
	}

	public void setTotal_Injuries_Ground(String total_Injuries_Ground) {
		this.total_Injuries_Ground = total_Injuries_Ground;
	}

	public String getTotal_Minor_Injuries_Aircraft() {
		return this.total_Minor_Injuries_Aircraft;
	}

	public void setTotal_Minor_Injuries_Aircraft(String total_Minor_Injuries_Aircraft) {
		this.total_Minor_Injuries_Aircraft = total_Minor_Injuries_Aircraft;
	}

	public String getTotal_Minor_Injuries_Ground() {
		return this.total_Minor_Injuries_Ground;
	}

	public void setTotal_Minor_Injuries_Ground(String total_Minor_Injuries_Ground) {
		this.total_Minor_Injuries_Ground = total_Minor_Injuries_Ground;
	}

	public String getTotal_On_Board_A_C() {
		return this.total_On_Board_A_C;
	}

	public void setTotal_On_Board_A_C(String total_On_Board_A_C) {
		this.total_On_Board_A_C = total_On_Board_A_C;
	}

	public String getTotal_Serious_Injuries_Aircraft() {
		return this.total_Serious_Injuries_Aircraft;
	}

	public void setTotal_Serious_Injuries_Aircraft(String total_Serious_Injuries_Aircraft) {
		this.total_Serious_Injuries_Aircraft = total_Serious_Injuries_Aircraft;
	}

	public String getTotal_Serious_Injuries_Ground() {
		return this.total_Serious_Injuries_Ground;
	}

	public void setTotal_Serious_Injuries_Ground(String total_Serious_Injuries_Ground) {
		this.total_Serious_Injuries_Ground = total_Serious_Injuries_Ground;
	}

	public Date getUTC_Date() {
		return this.UTC_Date;
	}

	public void setUTC_Date(Date UTC_Date) {
		this.UTC_Date = UTC_Date;
	}

	public Date getUTC_Time() {
		return this.UTC_Time;
	}

	public void setUTC_Time(Date UTC_Time) {
		this.UTC_Time = UTC_Time;
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getWeather_Relevant() {
		return this.weather_Relevant;
	}

	public void setWeather_Relevant(String weather_Relevant) {
		this.weather_Relevant = weather_Relevant;
	}

	public String getWind_Direction() {
		return this.wind_Direction;
	}

	public void setWind_Direction(String wind_Direction) {
		this.wind_Direction = wind_Direction;
	}

	public String getWind_Gusts() {
		return this.wind_Gusts;
	}

	public void setWind_Gusts(String wind_Gusts) {
		this.wind_Gusts = wind_Gusts;
	}

	public String getWind_Speed() {
		return this.wind_Speed;
	}

	public void setWind_Speed(String wind_Speed) {
		this.wind_Speed = wind_Speed;
	}

	public String getWx_Conditions() {
		return this.wx_Conditions;
	}

	public void setWx_Conditions(String wx_Conditions) {
		this.wx_Conditions = wx_Conditions;
	}

	public List<ATSUnit> getAtsunits() {
		return this.atsunits;
	}

	public void setAtsunits(List<ATSUnit> atsunits) {
		this.atsunits = atsunits;
	}

	public ATSUnit addAtsunit(ATSUnit atsunit) {
		getAtsunits().add(atsunit);
		atsunit.setOccurence(this);

		return atsunit;
	}

	public ATSUnit removeAtsunit(ATSUnit atsunit) {
		getAtsunits().remove(atsunit);
		atsunit.setOccurence(null);

		return atsunit;
	}

	public List<AerodromeGeneral> getAerodromeGenerals() {
		return this.aerodromeGenerals;
	}

	public void setAerodromeGenerals(List<AerodromeGeneral> aerodromeGenerals) {
		this.aerodromeGenerals = aerodromeGenerals;
	}

	public AerodromeGeneral addAerodromeGeneral(AerodromeGeneral aerodromeGeneral) {
		getAerodromeGenerals().add(aerodromeGeneral);
		aerodromeGeneral.setOccurence(this);

		return aerodromeGeneral;
	}

	public AerodromeGeneral removeAerodromeGeneral(AerodromeGeneral aerodromeGeneral) {
		getAerodromeGenerals().remove(aerodromeGeneral);
		aerodromeGeneral.setOccurence(null);

		return aerodromeGeneral;
	}

	public List<AerodromeWeatherReport> getAerodromeWeatherReports() {
		return this.aerodromeWeatherReports;
	}

	public void setAerodromeWeatherReports(List<AerodromeWeatherReport> aerodromeWeatherReports) {
		this.aerodromeWeatherReports = aerodromeWeatherReports;
	}

	public AerodromeWeatherReport addAerodromeWeatherReport(AerodromeWeatherReport aerodromeWeatherReport) {
		getAerodromeWeatherReports().add(aerodromeWeatherReport);
		aerodromeWeatherReport.setOccurence(this);

		return aerodromeWeatherReport;
	}

	public AerodromeWeatherReport removeAerodromeWeatherReport(AerodromeWeatherReport aerodromeWeatherReport) {
		getAerodromeWeatherReports().remove(aerodromeWeatherReport);
		aerodromeWeatherReport.setOccurence(null);

		return aerodromeWeatherReport;
	}

	public List<Aircraft> getAircrafts() {
		return this.aircrafts;
	}

	public void setAircrafts(List<Aircraft> aircrafts) {
		this.aircrafts = aircrafts;
	}

	public Aircraft addAircraft(Aircraft aircraft) {
		getAircrafts().add(aircraft);
		aircraft.setOccurence(this);

		return aircraft;
	}

	public Aircraft removeAircraft(Aircraft aircraft) {
		getAircrafts().remove(aircraft);
		aircraft.setOccurence(null);

		return aircraft;
	}

	public List<Airspace> getAirspaces() {
		return this.airspaces;
	}

	public void setAirspaces(List<Airspace> airspaces) {
		this.airspaces = airspaces;
	}

	public Airspace addAirspace(Airspace airspace) {
		getAirspaces().add(airspace);
		airspace.setOccurence(this);

		return airspace;
	}

	public Airspace removeAirspace(Airspace airspace) {
		getAirspaces().remove(airspace);
		airspace.setOccurence(null);

		return airspace;
	}

	public List<DangerousGood> getDangerousGoods() {
		return this.dangerousGoods;
	}

	public void setDangerousGoods(List<DangerousGood> dangerousGoods) {
		this.dangerousGoods = dangerousGoods;
	}

	public DangerousGood addDangerousGood(DangerousGood dangerousGood) {
		getDangerousGoods().add(dangerousGood);
		dangerousGood.setOccurence(this);

		return dangerousGood;
	}

	public DangerousGood removeDangerousGood(DangerousGood dangerousGood) {
		getDangerousGoods().remove(dangerousGood);
		dangerousGood.setOccurence(null);

		return dangerousGood;
	}

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public Event addEvent(Event event) {
		getEvents().add(event);
		event.setOccurence(this);

		return event;
	}

	public Event removeEvent(Event event) {
		getEvents().remove(event);
		event.setOccurence(null);

		return event;
	}

	public Identifier getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}

	public List<Narrative> getNarratives() {
		return this.narratives;
	}

	public void setNarratives(List<Narrative> narratives) {
		this.narratives = narratives;
	}

	public List<Notification> getNotifications() {
		return this.notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public List<PrecipitationAndOtherWeatherPhenomena> getPrecipitationAndOtherWeatherPhenomenas() {
		return this.precipitationAndOtherWeatherPhenomenas;
	}

	public void setPrecipitationAndOtherWeatherPhenomenas(List<PrecipitationAndOtherWeatherPhenomena> precipitationAndOtherWeatherPhenomenas) {
		this.precipitationAndOtherWeatherPhenomenas = precipitationAndOtherWeatherPhenomenas;
	}

	public PrecipitationAndOtherWeatherPhenomena addPrecipitationAndOtherWeatherPhenomena(PrecipitationAndOtherWeatherPhenomena precipitationAndOtherWeatherPhenomena) {
		getPrecipitationAndOtherWeatherPhenomenas().add(precipitationAndOtherWeatherPhenomena);
		precipitationAndOtherWeatherPhenomena.setOccurence(this);

		return precipitationAndOtherWeatherPhenomena;
	}

	public PrecipitationAndOtherWeatherPhenomena removePrecipitationAndOtherWeatherPhenomena(PrecipitationAndOtherWeatherPhenomena precipitationAndOtherWeatherPhenomena) {
		getPrecipitationAndOtherWeatherPhenomenas().remove(precipitationAndOtherWeatherPhenomena);
		precipitationAndOtherWeatherPhenomena.setOccurence(null);

		return precipitationAndOtherWeatherPhenomena;
	}

	public List<ReportingHistory> getReportingHistories() {
		return this.reportingHistories;
	}

	public void setReportingHistories(List<ReportingHistory> reportingHistories) {
		this.reportingHistories = reportingHistories;
	}

	public ReportingHistory addReportingHistory(ReportingHistory reportingHistory) {
		getReportingHistories().add(reportingHistory);
		reportingHistory.setOccurence(this);

		return reportingHistory;
	}

	public ReportingHistory removeReportingHistory(ReportingHistory reportingHistory) {
		getReportingHistories().remove(reportingHistory);
		reportingHistory.setOccurence(null);

		return reportingHistory;
	}

	public List<RiskAssessment> getRiskAssessments() {
		return this.riskAssessments;
	}

	public void setRiskAssessments(List<RiskAssessment> riskAssessments) {
		this.riskAssessments = riskAssessments;
	}

	public RiskAssessment addRiskAssessment(RiskAssessment riskAssessment) {
		getRiskAssessments().add(riskAssessment);
		riskAssessment.setOccurence(this);

		return riskAssessment;
	}

	public RiskAssessment removeRiskAssessment(RiskAssessment riskAssessment) {
		getRiskAssessments().remove(riskAssessment);
		riskAssessment.setOccurence(null);

		return riskAssessment;
	}

	public List<RunwayIncursion> getRunwayIncursions() {
		return this.runwayIncursions;
	}

	public void setRunwayIncursions(List<RunwayIncursion> runwayIncursions) {
		this.runwayIncursions = runwayIncursions;
	}

	public RunwayIncursion addRunwayIncursion(RunwayIncursion runwayIncursion) {
		getRunwayIncursions().add(runwayIncursion);
		runwayIncursion.setOccurence(this);

		return runwayIncursion;
	}

	public RunwayIncursion removeRunwayIncursion(RunwayIncursion runwayIncursion) {
		getRunwayIncursions().remove(runwayIncursion);
		runwayIncursion.setOccurence(null);

		return runwayIncursion;
	}

	public List<SafetyRecommendation> getSafetyRecommendations() {
		return this.safetyRecommendations;
	}

	public void setSafetyRecommendations(List<SafetyRecommendation> safetyRecommendations) {
		this.safetyRecommendations = safetyRecommendations;
	}

	public SafetyRecommendation addSafetyRecommendation(SafetyRecommendation safetyRecommendation) {
		getSafetyRecommendations().add(safetyRecommendation);
		safetyRecommendation.setOccurence(this);

		return safetyRecommendation;
	}

	public SafetyRecommendation removeSafetyRecommendation(SafetyRecommendation safetyRecommendation) {
		getSafetyRecommendations().remove(safetyRecommendation);
		safetyRecommendation.setOccurence(null);

		return safetyRecommendation;
	}

	public List<Separation> getSeparations() {
		return this.separations;
	}

	public void setSeparations(List<Separation> separations) {
		this.separations = separations;
	}

	public Separation addSeparation(Separation separation) {
		getSeparations().add(separation);
		separation.setOccurence(this);

		return separation;
	}

	public Separation removeSeparation(Separation separation) {
		getSeparations().remove(separation);
		separation.setOccurence(null);

		return separation;
	}

}