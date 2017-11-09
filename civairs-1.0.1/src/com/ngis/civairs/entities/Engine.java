package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Engine database table.
 * 
 */
@Entity
@Table(name="Engine")
@NamedQuery(name="Engine.findAll", query="SELECT e FROM Engine e")
public class Engine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(length=60)
	private String ATA_Chapter_Involved;

	@Column(name="Cycles_Since_Insp", length=60)
	private String cycles_Since_Insp;

	@Column(name="Cycles_Since_New", length=60)
	private String cycles_Since_New;

	@Column(name="Cycles_Since_Overhaul", length=60)
	private String cycles_Since_Overhaul;

	@Column(name="Date_Of_Inspection", length=60)
	private String date_Of_Inspection;

	@Column(name="Date_Of_Manufacturing", length=60)
	private String date_Of_Manufacturing;

	@Column(name="Date_Overhaul", length=60)
	private String date_Overhaul;

	@Column(name="Engine_Position", length=60)
	private String engine_Position;

	@Column(name="Engine_Serial_Number", length=60)
	private String engine_Serial_Number;

	@Column(name="Hazard_Eng_Effect", length=60)
	private String hazard_Eng_Effect;

	@Column(name="Manufacturer_Model", length=60)
	private String manufacturer_Model;

	@Column(name="Mon_Sys_Funtioning", length=60)
	private String mon_Sys_Funtioning;

	@Column(name="Nature_Of_Engine_Involvement", length=60)
	private String nature_Of_Engine_Involvement;

	@Column(name="Thrust_Loss", length=60)
	private String thrust_Loss;

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

	public Engine() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getATA_Chapter_Involved() {
		return this.ATA_Chapter_Involved;
	}

	public void setATA_Chapter_Involved(String ATA_Chapter_Involved) {
		this.ATA_Chapter_Involved = ATA_Chapter_Involved;
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

	public String getDate_Of_Inspection() {
		return this.date_Of_Inspection;
	}

	public void setDate_Of_Inspection(String date_Of_Inspection) {
		this.date_Of_Inspection = date_Of_Inspection;
	}

	public String getDate_Of_Manufacturing() {
		return this.date_Of_Manufacturing;
	}

	public void setDate_Of_Manufacturing(String date_Of_Manufacturing) {
		this.date_Of_Manufacturing = date_Of_Manufacturing;
	}

	public String getDate_Overhaul() {
		return this.date_Overhaul;
	}

	public void setDate_Overhaul(String date_Overhaul) {
		this.date_Overhaul = date_Overhaul;
	}

	public String getEngine_Position() {
		return this.engine_Position;
	}

	public void setEngine_Position(String engine_Position) {
		this.engine_Position = engine_Position;
	}

	public String getEngine_Serial_Number() {
		return this.engine_Serial_Number;
	}

	public void setEngine_Serial_Number(String engine_Serial_Number) {
		this.engine_Serial_Number = engine_Serial_Number;
	}

	public String getHazard_Eng_Effect() {
		return this.hazard_Eng_Effect;
	}

	public void setHazard_Eng_Effect(String hazard_Eng_Effect) {
		this.hazard_Eng_Effect = hazard_Eng_Effect;
	}

	public String getManufacturer_Model() {
		return this.manufacturer_Model;
	}

	public void setManufacturer_Model(String manufacturer_Model) {
		this.manufacturer_Model = manufacturer_Model;
	}

	public String getMon_Sys_Funtioning() {
		return this.mon_Sys_Funtioning;
	}

	public void setMon_Sys_Funtioning(String mon_Sys_Funtioning) {
		this.mon_Sys_Funtioning = mon_Sys_Funtioning;
	}

	public String getNature_Of_Engine_Involvement() {
		return this.nature_Of_Engine_Involvement;
	}

	public void setNature_Of_Engine_Involvement(String nature_Of_Engine_Involvement) {
		this.nature_Of_Engine_Involvement = nature_Of_Engine_Involvement;
	}

	public String getThrust_Loss() {
		return this.thrust_Loss;
	}

	public void setThrust_Loss(String thrust_Loss) {
		this.thrust_Loss = thrust_Loss;
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