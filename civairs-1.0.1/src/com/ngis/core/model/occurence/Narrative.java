package com.ngis.core.model.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Narrative database table.
 * 
 */
@Entity
@Table(name="Narrative")
@NamedQuery(name="Narrative.findAll", query="SELECT n FROM Narrative n")
public class Narrative implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Narrative_Language", length=60)
	private String narrative_Language;

	@Lob
	@Column(name="Narrative_Text")
	private String narrative_Text;

	//bi-directional many-to-many association to ATSUnit
	@ManyToMany
	@JoinTable(
		name="ATSUnit_has_Narrative"
		, joinColumns={
			@JoinColumn(name="Narrative_ID", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ATSUnit_ID", nullable=false)
			}
		)
	private List<ATSUnit> atsunits;

	//bi-directional many-to-many association to AerodromeGeneral
	@ManyToMany
	@JoinTable(
		name="AerodromeGeneral_has_Narrative"
		, joinColumns={
			@JoinColumn(name="Narrative_ID", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="AerodromeGeneral_ID", nullable=false)
			}
		)
	private List<AerodromeGeneral> aerodromeGenerals;

	//bi-directional many-to-many association to Aircraft
	@ManyToMany
	@JoinTable(
		name="Aircraft_has_Narrative"
		, joinColumns={
			@JoinColumn(name="Narrative_ID", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="Aircraft_ID", nullable=false)
			}
		)
	private List<Aircraft> aircrafts;

	//bi-directional many-to-many association to Airspace
	@ManyToMany
	@JoinTable(
		name="Airspace_has_Narrative"
		, joinColumns={
			@JoinColumn(name="Narrative_ID", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="Airspace_ID", nullable=false)
			}
		)
	private List<Airspace> airspaces;

	//bi-directional many-to-many association to Occurence
	@ManyToMany(mappedBy="narratives")
	private List<Occurence> occurences;

	//bi-directional many-to-many association to ReportingHistory
	@ManyToMany(mappedBy="narratives")
	private List<ReportingHistory> reportingHistories;

	public Narrative() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNarrative_Language() {
		return this.narrative_Language;
	}

	public void setNarrative_Language(String narrative_Language) {
		this.narrative_Language = narrative_Language;
	}

	public String getNarrative_Text() {
		return this.narrative_Text;
	}

	public void setNarrative_Text(String narrative_Text) {
		this.narrative_Text = narrative_Text;
	}

	public List<ATSUnit> getAtsunits() {
		return this.atsunits;
	}

	public void setAtsunits(List<ATSUnit> atsunits) {
		this.atsunits = atsunits;
	}

	public List<AerodromeGeneral> getAerodromeGenerals() {
		return this.aerodromeGenerals;
	}

	public void setAerodromeGenerals(List<AerodromeGeneral> aerodromeGenerals) {
		this.aerodromeGenerals = aerodromeGenerals;
	}

	public List<Aircraft> getAircrafts() {
		return this.aircrafts;
	}

	public void setAircrafts(List<Aircraft> aircrafts) {
		this.aircrafts = aircrafts;
	}

	public List<Airspace> getAirspaces() {
		return this.airspaces;
	}

	public void setAirspaces(List<Airspace> airspaces) {
		this.airspaces = airspaces;
	}

	public List<Occurence> getOccurences() {
		return this.occurences;
	}

	public void setOccurences(List<Occurence> occurences) {
		this.occurences = occurences;
	}

	public List<ReportingHistory> getReportingHistories() {
		return this.reportingHistories;
	}

	public void setReportingHistories(List<ReportingHistory> reportingHistories) {
		this.reportingHistories = reportingHistories;
	}

}