package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the PartInformation database table.
 * 
 */
@Entity
@Table(name="PartInformation")
@NamedQuery(name="PartInformation.findAll", query="SELECT p FROM PartInformation p")
public class PartInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(length=60)
	private String ATA_Chapter_Number;

	@Column(name="Cycles_Since_Insp", length=60)
	private String cycles_Since_Insp;

	@Column(name="Cycles_Since_New", length=60)
	private String cycles_Since_New;

	@Column(name="Cycles_Since_Overhaul", length=60)
	private String cycles_Since_Overhaul;

	@Temporal(TemporalType.DATE)
	@Column(name="Date_Of_Manufacturing")
	private Date date_Of_Manufacturing;

	@Temporal(TemporalType.DATE)
	@Column(name="Date_Of_Overhaul")
	private Date date_Of_Overhaul;

	@Temporal(TemporalType.DATE)
	@Column(name="Date_Repair_Insp")
	private Date date_Repair_Insp;

	@Column(name="Manufacturer", length=60)
	private String manufacturer;

	@Column(name="Part_Name", length=60)
	private String part_Name;

	@Column(name="Part_Number", length=60)
	private String part_Number;

	@Column(name="Serial_Number", length=60)
	private String serial_Number;

	@Column(name="Time_Since_Inspection", length=60)
	private String time_Since_Inspection;

	@Column(name="Time_Since_New", length=60)
	private String time_Since_New;

	@Column(name="Time_Since_Overhaul", length=60)
	private String time_Since_Overhaul;

	//bi-directional many-to-one association to Aircraft
	@ManyToOne
	@JoinColumn(name="Aircraft_ID", nullable=false)
	private Aircraft aircraft;

	public PartInformation() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getATA_Chapter_Number() {
		return this.ATA_Chapter_Number;
	}

	public void setATA_Chapter_Number(String ATA_Chapter_Number) {
		this.ATA_Chapter_Number = ATA_Chapter_Number;
	}

	public String getCycles_Since_Insp() {
		return this.cycles_Since_Insp;
	}

	public void setCycles_Since_Insp(String cycles_Since_Insp) {
		this.cycles_Since_Insp = cycles_Since_Insp;
	}

	public String getCycles_Since_New() {
		return this.cycles_Since_New;
	}

	public void setCycles_Since_New(String cycles_Since_New) {
		this.cycles_Since_New = cycles_Since_New;
	}

	public String getCycles_Since_Overhaul() {
		return this.cycles_Since_Overhaul;
	}

	public void setCycles_Since_Overhaul(String cycles_Since_Overhaul) {
		this.cycles_Since_Overhaul = cycles_Since_Overhaul;
	}

	public Date getDate_Of_Manufacturing() {
		return this.date_Of_Manufacturing;
	}

	public void setDate_Of_Manufacturing(Date date_Of_Manufacturing) {
		this.date_Of_Manufacturing = date_Of_Manufacturing;
	}

	public Date getDate_Of_Overhaul() {
		return this.date_Of_Overhaul;
	}

	public void setDate_Of_Overhaul(Date date_Of_Overhaul) {
		this.date_Of_Overhaul = date_Of_Overhaul;
	}

	public Date getDate_Repair_Insp() {
		return this.date_Repair_Insp;
	}

	public void setDate_Repair_Insp(Date date_Repair_Insp) {
		this.date_Repair_Insp = date_Repair_Insp;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getPart_Name() {
		return this.part_Name;
	}

	public void setPart_Name(String part_Name) {
		this.part_Name = part_Name;
	}

	public String getPart_Number() {
		return this.part_Number;
	}

	public void setPart_Number(String part_Number) {
		this.part_Number = part_Number;
	}

	public String getSerial_Number() {
		return this.serial_Number;
	}

	public void setSerial_Number(String serial_Number) {
		this.serial_Number = serial_Number;
	}

	public String getTime_Since_Inspection() {
		return this.time_Since_Inspection;
	}

	public void setTime_Since_Inspection(String time_Since_Inspection) {
		this.time_Since_Inspection = time_Since_Inspection;
	}

	public String getTime_Since_New() {
		return this.time_Since_New;
	}

	public void setTime_Since_New(String time_Since_New) {
		this.time_Since_New = time_Since_New;
	}

	public String getTime_Since_Overhaul() {
		return this.time_Since_Overhaul;
	}

	public void setTime_Since_Overhaul(String time_Since_Overhaul) {
		this.time_Since_Overhaul = time_Since_Overhaul;
	}

	public Aircraft getAircraft() {
		return this.aircraft;
	}

	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

}