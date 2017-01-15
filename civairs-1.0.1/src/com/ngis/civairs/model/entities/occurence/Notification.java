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
	@Column(name="LocalDateD")
	private Date localDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LocalTimeT")
	private Date localTime;

	@Column(name="Occurence_Class", length=60)
	private String occurence_Class;

	@Temporal(TemporalType.DATE)
	@Column(name="UtcDateD")
	private Date utcDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UtcTimeT")
	private Date utcTime;

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

	public Date getLocalDate() {
		return this.localDate;
	}

	public void setLocalDate(Date localDate) {
		this.localDate = localDate;
	}

	public Date getLocalTime() {
		return this.localTime;
	}

	public void setLocalTime(Date localTime) {
		this.localTime = localTime;
	}

	public String getOccurence_Class() {
		return this.occurence_Class;
	}

	public void setOccurence_Class(String occurence_Class) {
		this.occurence_Class = occurence_Class;
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

	public List<Occurence> getOccurences() {
		return this.occurences;
	}

	public void setOccurences(List<Occurence> occurences) {
		this.occurences = occurences;
	}

}