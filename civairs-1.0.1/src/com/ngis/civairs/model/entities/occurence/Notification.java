package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Notification database table.
 * 
 */
@Entity
@Table(name="Notification")
@NamedQuery(name="Notification.findAll", query="SELECT n FROM Notification n")
public class Notification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Aircraft_ID", length=60)
	private String aircraft_ID;

	@Column(name="Aircraft_Type", length=60)
	private String aircraft_Type;

	@Lob
	@Column(name="Headline")
	private String headline;

	@Temporal(TemporalType.DATE)
	@Column(name="Local_Date")
	private Date local_Date;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Local_Time")
	private Date local_Time;

	@Column(name="Occurrence_Class", length=60)
	private String occurrence_Class;

	@Temporal(TemporalType.DATE)
	private Date UTC_Date;

	@Temporal(TemporalType.TIMESTAMP)
	private Date UTC_Time;

	//bi-directional many-to-one association to Identifier
	@ManyToOne
	@JoinColumn(name="Identifiers_ID", nullable=false)
	private Identifier identifier;

	//bi-directional many-to-many association to Occurence
	@ManyToMany(mappedBy="notifications")
	private List<Occurence> occurences;

	public Notification() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAircraft_ID() {
		return this.aircraft_ID;
	}

	public void setAircraft_ID(String aircraft_ID) {
		this.aircraft_ID = aircraft_ID;
	}

	public String getAircraft_Type() {
		return this.aircraft_Type;
	}

	public void setAircraft_Type(String aircraft_Type) {
		this.aircraft_Type = aircraft_Type;
	}

	public String getHeadline() {
		return this.headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
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

	public String getOccurrence_Class() {
		return this.occurrence_Class;
	}

	public void setOccurrence_Class(String occurrence_Class) {
		this.occurrence_Class = occurrence_Class;
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

	public Identifier getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}

	public List<Occurence> getOccurences() {
		return this.occurences;
	}

	public void setOccurences(List<Occurence> occurences) {
		this.occurences = occurences;
	}

}