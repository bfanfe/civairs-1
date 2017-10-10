package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Vehicle database table.
 * 
 */
@Entity
@Table(name="Vehicle")
@NamedQuery(name="Vehicle.findAll", query="SELECT v FROM Vehicle v")
public class Vehicle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Type_Of_Vehicle", length=60)
	private String type_Of_Vehicle;

	@Column(name="Vehicle_Controlled", length=60)
	private String vehicle_Controlled;

	//bi-directional many-to-one association to AerodromeGeneral
	@ManyToOne
	@JoinColumn(name="AerodromeGeneral_ID", nullable=false)
	private AerodromeGeneral aerodromeGeneral;

	public Vehicle() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType_Of_Vehicle() {
		return this.type_Of_Vehicle;
	}

	public void setType_Of_Vehicle(String type_Of_Vehicle) {
		this.type_Of_Vehicle = type_Of_Vehicle;
	}

	public String getVehicle_Controlled() {
		return this.vehicle_Controlled;
	}

	public void setVehicle_Controlled(String vehicle_Controlled) {
		this.vehicle_Controlled = vehicle_Controlled;
	}

	public AerodromeGeneral getAerodromeGeneral() {
		return this.aerodromeGeneral;
	}

	public void setAerodromeGeneral(AerodromeGeneral aerodromeGeneral) {
		this.aerodromeGeneral = aerodromeGeneral;
	}

}