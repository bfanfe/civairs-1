package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ATMStaff database table.
 * 
 */
@Entity
@Table(name="ATMStaff")
@NamedQuery(name="ATMStaff.findAll", query="SELECT a FROM ATMStaff a")
public class ATMStaff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Category", length=60)
	private String category;

	@Column(length=60)
	private String CISM_Offered;

	@Column(name="Duty_Time_In_Position", length=60)
	private String duty_Time_In_Position;

	//bi-directional many-to-one association to Sector
	@ManyToOne
	@JoinColumn(name="Sector_ID", nullable=false)
	private Sector sector;

	public ATMStaff() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCISM_Offered() {
		return this.CISM_Offered;
	}

	public void setCISM_Offered(String CISM_Offered) {
		this.CISM_Offered = CISM_Offered;
	}

	public String getDuty_Time_In_Position() {
		return this.duty_Time_In_Position;
	}

	public void setDuty_Time_In_Position(String duty_Time_In_Position) {
		this.duty_Time_In_Position = duty_Time_In_Position;
	}

	public Sector getSector() {
		return this.sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

}