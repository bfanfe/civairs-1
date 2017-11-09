package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Runway database table.
 * 
 */
@Entity
@Table(name="Runway")
@NamedQuery(name="Runway.findAll", query="SELECT r FROM Runway r")
public class Runway implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Runway_Identifier", length=60)
	private String runway_Identifier;

	@Column(name="Surface_Type", length=60)
	private String surface_Type;

	//bi-directional many-to-one association to AerodromeGeneral
	@ManyToOne
	@JoinColumn(name="AerodromeGeneral_ID", nullable=false)
	private AerodromeGeneral aerodromeGeneral;

	public Runway() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRunway_Identifier() {
		return this.runway_Identifier;
	}

	public void setRunway_Identifier(String runway_Identifier) {
		this.runway_Identifier = runway_Identifier;
	}

	public String getSurface_Type() {
		return this.surface_Type;
	}

	public void setSurface_Type(String surface_Type) {
		this.surface_Type = surface_Type;
	}

	public AerodromeGeneral getAerodromeGeneral() {
		return this.aerodromeGeneral;
	}

	public void setAerodromeGeneral(AerodromeGeneral aerodromeGeneral) {
		this.aerodromeGeneral = aerodromeGeneral;
	}

}