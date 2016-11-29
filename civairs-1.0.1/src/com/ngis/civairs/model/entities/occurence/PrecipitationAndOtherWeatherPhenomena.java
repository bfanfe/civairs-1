package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PrecipitationAndOtherWeatherPhenomena database table.
 * 
 */
@Entity
@Table(name="PrecipitationAndOtherWeatherPhenomena")
@NamedQuery(name="PrecipitationAndOtherWeatherPhenomena.findAll", query="SELECT p FROM PrecipitationAndOtherWeatherPhenomena p")
public class PrecipitationAndOtherWeatherPhenomena implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Phenomenon_Intensity", length=60)
	private String phenomenon_Intensity;

	@Lob
	@Column(name="Phenomenon_Type")
	private String phenomenon_Type;

	//bi-directional many-to-one association to Occurence
	@ManyToOne
	@JoinColumn(name="Occurence_ID", nullable=false)
	private Occurence occurence;

	public PrecipitationAndOtherWeatherPhenomena() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhenomenon_Intensity() {
		return this.phenomenon_Intensity;
	}

	public void setPhenomenon_Intensity(String phenomenon_Intensity) {
		this.phenomenon_Intensity = phenomenon_Intensity;
	}

	public String getPhenomenon_Type() {
		return this.phenomenon_Type;
	}

	public void setPhenomenon_Type(String phenomenon_Type) {
		this.phenomenon_Type = phenomenon_Type;
	}

	public Occurence getOccurence() {
		return this.occurence;
	}

	public void setOccurence(Occurence occurence) {
		this.occurence = occurence;
	}

}