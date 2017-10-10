package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Incapacitation database table.
 * 
 */
@Entity
@Table(name="Incapacitation")
@NamedQuery(name="Incapacitation.findAll", query="SELECT i FROM Incapacitation i")
public class Incapacitation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Person_Incapacitated", length=60)
	private String person_Incapacitated;

	@Column(name="Reason_For_Incapacity", length=60)
	private String reason_For_Incapacity;

	//bi-directional many-to-one association to Aircraft
	@ManyToOne
	@JoinColumn(name="Aircraft_ID", nullable=false)
	private Aircraft aircraft;

	public Incapacitation() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPerson_Incapacitated() {
		return this.person_Incapacitated;
	}

	public void setPerson_Incapacitated(String person_Incapacitated) {
		this.person_Incapacitated = person_Incapacitated;
	}

	public String getReason_For_Incapacity() {
		return this.reason_For_Incapacity;
	}

	public void setReason_For_Incapacity(String reason_For_Incapacity) {
		this.reason_For_Incapacity = reason_For_Incapacity;
	}

	public Aircraft getAircraft() {
		return this.aircraft;
	}

	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

}