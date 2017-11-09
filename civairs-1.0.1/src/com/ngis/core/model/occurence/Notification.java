package com.ngis.core.model.occurence;

import java.io.Serializable;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Notification database table.
 * 
 */
@Entity
@Table(name="Notification")
@NamedQueries(value = { 
		@NamedQuery(name="Notification.findAll", query="SELECT n FROM Notification n WHERE n.status=:status"), 
		@NamedQuery(name="Notification.findAllByEntity", query="SELECT n FROM Notification n WHERE n.status=:status AND n.identifier.responsibleEntity.id=:entityId") 
		})
public class Notification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Aerodrome_Code", length=10)
	private String aerodrome_Code;

	@Column(name="Airspace_Class", length=60)
	private String airspace_Class;

	@Column(name="Event_Location", length=250)
	private String event_Location;

	@Column(name="Event_Reference", nullable=false, length=60)
	private String event_Reference;

	@Column(name="Event_Title", nullable=false, length=60)
	private String event_Title;
	
	@Column(length=60)
	private String FIR_UIR_Name;
	
	@Lob
	@Column(name="Headline")
	private String headline;

	
	@Temporal(TemporalType.DATE)
	@Column(name="UtcDateD")
	private Date utcDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UtcTimeT")
	private Date utcTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Reporting_Time")
	private Date reportingTime;
	
	@Column(name="Status", length=60)
	private String status;

	//bi-directional many-to-one association to Identifier
	@ManyToOne
	@JoinColumn(name="Identifiers_ID", nullable=false)
	private Identifier identifier;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Local_Date")
	private Date local_Date;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Local_Time")
	private Date local_Time;

	//bi-directional many-to-many association to Occurence
	@ManyToMany(mappedBy="notifications")
	private List<Occurence> occurences;
	
	//bi-directional many-to-one association to Aircraft
	@OneToMany(mappedBy="notification", cascade=CascadeType.ALL)
	private List<Aircraft> aircrafts;
	
	//bi-directional many-to-one association to StaticAirspaceClass
	@ManyToOne
	@JoinColumn(name="Static_Airspace_Class_valueID")
	private StaticAirspaceClass staticAirspaceClass;
	
	//bi-directional many-to-one association to Analyse
	@ManyToOne
	@JoinColumn(name="Analyse_ID")
	private Analyse analyse;

	public Notification() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getAerodrome_Code() {
		return this.aerodrome_Code;
	}

	public void setAerodrome_Code(String aerodrome_Code) {
		this.aerodrome_Code = aerodrome_Code;
	}

	public String getAirspace_Class() {
		return this.airspace_Class;
	}

	public void setAirspace_Class(String airspace_Class) {
		this.airspace_Class = airspace_Class;
	}

	public String getEvent_Location() {
		return this.event_Location;
	}

	public void setEvent_Location(String event_Location) {
		this.event_Location = event_Location;
	}

	public String getEvent_Reference() {
		return this.event_Reference;
	}

	public void setEvent_Reference(String event_Reference) {
		this.event_Reference = event_Reference;
	}

	public String getEvent_Title() {
		return this.event_Title;
	}

	public void setEvent_Title(String event_Title) {
		this.event_Title = event_Title;
	}
	
	public String getFIR_UIR_Name() {
		return this.FIR_UIR_Name;
	}

	public void setFIR_UIR_Name(String FIR_UIR_Name) {
		this.FIR_UIR_Name = FIR_UIR_Name;
	}

	
	public String getHeadline() {
		return this.headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	
	public Date getUtcDate() {
		return this.utcDate;
	}

	public void setUtcDate(Date utcDate) {
		this.utcDate = utcDate;
	}

	public Date getUtcTime() {
		return this.utcTime;
	}

	public void setUtcTime(Date utcTime) {
		this.utcTime = utcTime;
	}

	public Identifier getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
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

	public List<Occurence> getOccurences() {
		return this.occurences;
	}

	public void setOccurences(List<Occurence> occurences) {
		this.occurences = occurences;
	}

	public Date getReportingTime() {
		return reportingTime;
	}

	public String getStatus() {
		return status;
	}

	public void setReportingTime(Date reportingTime) {
		this.reportingTime = reportingTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Aircraft> getAircrafts() {
		return this.aircrafts;
	}

	public void setAircrafts(List<Aircraft> aircrafts) {
		this.aircrafts = aircrafts;
	}

	public Aircraft addAircraft(Aircraft aircraft) {
		if(aircrafts == null) aircrafts = new ArrayList<Aircraft>();
		getAircrafts().add(aircraft);
		aircraft.setNotification(this);

		return aircraft;
	}

	public Aircraft removeAircraft(Aircraft aircraft) {
		if(aircrafts == null) aircrafts = new ArrayList<Aircraft>();
		getAircrafts().remove(aircraft);
		aircraft.setNotification(null);

		return aircraft;
	}
	
	public StaticAirspaceClass getStaticAirspaceClass() {
		return this.staticAirspaceClass;
	}

	public void setStaticAirspaceClass(StaticAirspaceClass staticAirspaceClass) {
		this.staticAirspaceClass = staticAirspaceClass;
	}
	
	public Analyse getAnalyse() {
		return this.analyse;
	}

	public void setAnalyse(Analyse analyse) {
		this.analyse = analyse;
	}

}