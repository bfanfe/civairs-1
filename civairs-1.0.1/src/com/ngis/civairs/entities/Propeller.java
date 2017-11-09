package com.ngis.civairs.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Propeller database table.
 * 
 */
@Entity
@Table(name="Propeller")
@NamedQuery(name="Propeller.findAll", query="SELECT p FROM Propeller p")
public class Propeller implements Serializable {
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

	@Column(name="Cycles_Since_Overh", length=60)
	private String cycles_Since_Overh;

	@Temporal(TemporalType.DATE)
	@Column(name="Date_Of_Manufacturing")
	private Date date_Of_Manufacturing;

	@Temporal(TemporalType.DATE)
	@Column(name="Date_Of_Overhaul")
	private Date date_Of_Overhaul;

	@Temporal(TemporalType.DATE)
	@Column(name="Date_Repair_Insp")
	private Date date_Repair_Insp;

	@Column(name="Estimated_Thrust_Loss", length=60)
	private String estimated_Thrust_Loss;

	@Column(name="Hazardous_Prop_Effects", length=60)
	private String hazardous_Prop_Effects;

	@Column(name="Make_Of_Propeller", length=60)
	private String make_Of_Propeller;

	@Column(name="Mon_Sys_Funtioning", length=60)
	private String mon_Sys_Funtioning;

	@Column(name="Prop_Involvement", length=60)
	private String prop_Involvement;

	@Column(name="Prop_Position", length=60)
	private String prop_Position;

	@Column(name="Prop_Serial", length=60)
	private String prop_Serial;

	@Column(name="Propeller_Model", length=60)
	private String propeller_Model;

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

	public Propeller() {
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

	public String getCycles_Since_Overh() {
		return this.cycles_Since_Overh;
	}

	public void setCycles_Since_Overh(String cycles_Since_Overh) {
		this.cycles_Since_Overh = cycles_Since_Overh;
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

	public String getEstimated_Thrust_Loss() {
		return this.estimated_Thrust_Loss;
	}

	public void setEstimated_Thrust_Loss(String estimated_Thrust_Loss) {
		this.estimated_Thrust_Loss = estimated_Thrust_Loss;
	}

	public String getHazardous_Prop_Effects() {
		return this.hazardous_Prop_Effects;
	}

	public void setHazardous_Prop_Effects(String hazardous_Prop_Effects) {
		this.hazardous_Prop_Effects = hazardous_Prop_Effects;
	}

	public String getMake_Of_Propeller() {
		return this.make_Of_Propeller;
	}

	public void setMake_Of_Propeller(String make_Of_Propeller) {
		this.make_Of_Propeller = make_Of_Propeller;
	}

	public String getMon_Sys_Funtioning() {
		return this.mon_Sys_Funtioning;
	}

	public void setMon_Sys_Funtioning(String mon_Sys_Funtioning) {
		this.mon_Sys_Funtioning = mon_Sys_Funtioning;
	}

	public String getProp_Involvement() {
		return this.prop_Involvement;
	}

	public void setProp_Involvement(String prop_Involvement) {
		this.prop_Involvement = prop_Involvement;
	}

	public String getProp_Position() {
		return this.prop_Position;
	}

	public void setProp_Position(String prop_Position) {
		this.prop_Position = prop_Position;
	}

	public String getProp_Serial() {
		return this.prop_Serial;
	}

	public void setProp_Serial(String prop_Serial) {
		this.prop_Serial = prop_Serial;
	}

	public String getPropeller_Model() {
		return this.propeller_Model;
	}

	public void setPropeller_Model(String propeller_Model) {
		this.propeller_Model = propeller_Model;
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