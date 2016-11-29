package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Sector database table.
 * 
 */
@Entity
@Table(name="Sector")
@NamedQuery(name="Sector.findAll", query="SELECT s FROM Sector s")
public class Sector implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(length=60)
	private String RTF_Frequency;

	@Column(name="Sector_Name", length=60)
	private String sector_Name;

	@Column(name="Services_Provided", length=60)
	private String services_Provided;

	@Column(name="Workload_Controller", length=60)
	private String workload_Controller;

	//bi-directional many-to-one association to ATMStaff
	@OneToMany(mappedBy="sector")
	private List<ATMStaff> atmstaffs;

	//bi-directional many-to-one association to ATSUnit
	@ManyToOne
	@JoinColumn(name="ATSUnit_ID", nullable=false)
	private ATSUnit atsunit;

	public Sector() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRTF_Frequency() {
		return this.RTF_Frequency;
	}

	public void setRTF_Frequency(String RTF_Frequency) {
		this.RTF_Frequency = RTF_Frequency;
	}

	public String getSector_Name() {
		return this.sector_Name;
	}

	public void setSector_Name(String sector_Name) {
		this.sector_Name = sector_Name;
	}

	public String getServices_Provided() {
		return this.services_Provided;
	}

	public void setServices_Provided(String services_Provided) {
		this.services_Provided = services_Provided;
	}

	public String getWorkload_Controller() {
		return this.workload_Controller;
	}

	public void setWorkload_Controller(String workload_Controller) {
		this.workload_Controller = workload_Controller;
	}

	public List<ATMStaff> getAtmstaffs() {
		return this.atmstaffs;
	}

	public void setAtmstaffs(List<ATMStaff> atmstaffs) {
		this.atmstaffs = atmstaffs;
	}

	public ATMStaff addAtmstaff(ATMStaff atmstaff) {
		getAtmstaffs().add(atmstaff);
		atmstaff.setSector(this);

		return atmstaff;
	}

	public ATMStaff removeAtmstaff(ATMStaff atmstaff) {
		getAtmstaffs().remove(atmstaff);
		atmstaff.setSector(null);

		return atmstaff;
	}

	public ATSUnit getAtsunit() {
		return this.atsunit;
	}

	public void setAtsunit(ATSUnit atsunit) {
		this.atsunit = atsunit;
	}

}