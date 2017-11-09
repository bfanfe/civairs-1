package com.ngis.civairs.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SeparationTrafficInfoTypeQuality database table.
 * 
 */
@Entity
@Table(name="SeparationTrafficInfoTypeQuality")
@NamedQuery(name="SeparationTrafficInfoTypeQuality.findAll", query="SELECT s FROM SeparationTrafficInfoTypeQuality s")
public class SeparationTrafficInfoTypeQuality implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Traffic_Info_Quality", length=60)
	private String traffic_Info_Quality;

	//bi-directional many-to-one association to SeparationAircraft
	@ManyToOne
	@JoinColumn(name="SeparationAircraft_ID", nullable=false)
	private SeparationAircraft separationAircraft;

	public SeparationTrafficInfoTypeQuality() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTraffic_Info_Quality() {
		return this.traffic_Info_Quality;
	}

	public void setTraffic_Info_Quality(String traffic_Info_Quality) {
		this.traffic_Info_Quality = traffic_Info_Quality;
	}

	public SeparationAircraft getSeparationAircraft() {
		return this.separationAircraft;
	}

	public void setSeparationAircraft(SeparationAircraft separationAircraft) {
		this.separationAircraft = separationAircraft;
	}

}