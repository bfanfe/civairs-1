package com.ngis.core.model.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ATSUnit database table.
 * 
 */
@Entity
@Table(name="ATSUnit")
@NamedQuery(name="ATSUnit.findAll", query="SELECT a FROM ATSUnit a")
public class ATSUnit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(length=60)
	private String APW_Alerting;

	@Column(length=60)
	private String ATS_Unit_Name;

	@Column(length=60)
	private String MSAW_Current_Alerting;

	@Column(length=60)
	private String RIMCAS_Alerting;

	@Column(length=60)
	private String STCA_Current_Alerting;

	//bi-directional many-to-one association to Occurence
	@ManyToOne
	@JoinColumn(name="Occurence_ID", nullable=false)
	private Occurence occurence;

	//bi-directional many-to-many association to Narrative
	@ManyToMany(mappedBy="atsunits")
	private List<Narrative> narratives;

	//bi-directional many-to-one association to Sector
	@OneToMany(mappedBy="atsunit")
	private List<Sector> sectors;

	public ATSUnit() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAPW_Alerting() {
		return this.APW_Alerting;
	}

	public void setAPW_Alerting(String APW_Alerting) {
		this.APW_Alerting = APW_Alerting;
	}

	public String getATS_Unit_Name() {
		return this.ATS_Unit_Name;
	}

	public void setATS_Unit_Name(String ATS_Unit_Name) {
		this.ATS_Unit_Name = ATS_Unit_Name;
	}

	public String getMSAW_Current_Alerting() {
		return this.MSAW_Current_Alerting;
	}

	public void setMSAW_Current_Alerting(String MSAW_Current_Alerting) {
		this.MSAW_Current_Alerting = MSAW_Current_Alerting;
	}

	public String getRIMCAS_Alerting() {
		return this.RIMCAS_Alerting;
	}

	public void setRIMCAS_Alerting(String RIMCAS_Alerting) {
		this.RIMCAS_Alerting = RIMCAS_Alerting;
	}

	public String getSTCA_Current_Alerting() {
		return this.STCA_Current_Alerting;
	}

	public void setSTCA_Current_Alerting(String STCA_Current_Alerting) {
		this.STCA_Current_Alerting = STCA_Current_Alerting;
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

	public List<Sector> getSectors() {
		return this.sectors;
	}

	public void setSectors(List<Sector> sectors) {
		this.sectors = sectors;
	}

	public Sector addSector(Sector sector) {
		getSectors().add(sector);
		sector.setAtsunit(this);

		return sector;
	}

	public Sector removeSector(Sector sector) {
		getSectors().remove(sector);
		sector.setAtsunit(null);

		return sector;
	}

}