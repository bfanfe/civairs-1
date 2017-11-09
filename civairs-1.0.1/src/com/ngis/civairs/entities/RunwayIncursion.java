package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the RunwayIncursion database table.
 * 
 */
@Entity
@Table(name="RunwayIncursion")
@NamedQuery(name="RunwayIncursion.findAll", query="SELECT r FROM RunwayIncursion r")
public class RunwayIncursion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Entity_Involved", length=60)
	private String entity_Involved;

	//bi-directional many-to-one association to Occurence
	@ManyToOne
	@JoinColumn(name="Occurence_ID", nullable=false)
	private Occurence occurence;

	public RunwayIncursion() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEntity_Involved() {
		return this.entity_Involved;
	}

	public void setEntity_Involved(String entity_Involved) {
		this.entity_Involved = entity_Involved;
	}

	public Occurence getOccurence() {
		return this.occurence;
	}

	public void setOccurence(Occurence occurence) {
		this.occurence = occurence;
	}

}