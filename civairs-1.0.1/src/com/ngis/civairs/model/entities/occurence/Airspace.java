package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Airspace database table.
 * 
 */
@Entity
@Table(name="Airspace")
@NamedQuery(name="Airspace.findAll", query="SELECT a FROM Airspace a")
public class Airspace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Airspace_Class", length=60)
	private String airspace_Class;

	@Column(name="Airspace_Name", length=60)
	private String airspace_Name;

	@Column(name="Airspace_Type", length=60)
	private String airspace_Type;

	@Column(length=60)
	private String FIR_UIR_Name;

	@Lob
	@Column(name="Special_Activities")
	private String special_Activities;

	//bi-directional many-to-one association to Occurence
	@ManyToOne
	@JoinColumn(name="Occurence_ID", nullable=false)
	private Occurence occurence;

	//bi-directional many-to-many association to Narrative
	@ManyToMany(mappedBy="airspaces")
	private List<Narrative> narratives;

	public Airspace() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAirspace_Class() {
		return this.airspace_Class;
	}

	public void setAirspace_Class(String airspace_Class) {
		this.airspace_Class = airspace_Class;
	}

	public String getAirspace_Name() {
		return this.airspace_Name;
	}

	public void setAirspace_Name(String airspace_Name) {
		this.airspace_Name = airspace_Name;
	}

	public String getAirspace_Type() {
		return this.airspace_Type;
	}

	public void setAirspace_Type(String airspace_Type) {
		this.airspace_Type = airspace_Type;
	}

	public String getFIR_UIR_Name() {
		return this.FIR_UIR_Name;
	}

	public void setFIR_UIR_Name(String FIR_UIR_Name) {
		this.FIR_UIR_Name = FIR_UIR_Name;
	}

	public String getSpecial_Activities() {
		return this.special_Activities;
	}

	public void setSpecial_Activities(String special_Activities) {
		this.special_Activities = special_Activities;
	}

	public Occurence getOccurence() {
		return this.occurence;
	}

	public void setOccurence(Occurence occurence) {
		this.occurence = occurence;
	}

	public List<Narrative> getNarratives() {
		return this.narratives;
	}

	public void setNarratives(List<Narrative> narratives) {
		this.narratives = narratives;
	}

}