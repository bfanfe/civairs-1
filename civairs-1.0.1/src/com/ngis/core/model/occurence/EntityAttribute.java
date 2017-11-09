package com.ngis.core.model.occurence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the EntityAttributes database table.
 * 
 */
@Entity
@Table(name="EntityAttributes")
@NamedQuery(name="EntityAttribute.findAll", query="SELECT e FROM EntityAttribute e")
public class EntityAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Attribute_ID", unique=true, nullable=false)
	private int attribute_ID;

	@Lob
	@Column(name="Attribute_Description")
	private String attribute_Description;

	@Lob
	@Column(name="Attribute_Detailed_Description")
	private String attribute_Detailed_Description;

	@Lob
	@Column(name="Attribute_Explanation")
	private String attribute_Explanation;

	@Column(name="Attribute_Name", length=60)
	private String attribute_Name;

	@Column(name="Entity_ID")
	private int entity_ID;

	@Column(name="Entity_Name", length=60)
	private String entity_Name;

	public EntityAttribute() {
	}

	public int getAttribute_ID() {
		return this.attribute_ID;
	}

	public void setAttribute_ID(int attribute_ID) {
		this.attribute_ID = attribute_ID;
	}

	public String getAttribute_Description() {
		return this.attribute_Description;
	}

	public void setAttribute_Description(String attribute_Description) {
		this.attribute_Description = attribute_Description;
	}

	public String getAttribute_Detailed_Description() {
		return this.attribute_Detailed_Description;
	}

	public void setAttribute_Detailed_Description(String attribute_Detailed_Description) {
		this.attribute_Detailed_Description = attribute_Detailed_Description;
	}

	public String getAttribute_Explanation() {
		return this.attribute_Explanation;
	}

	public void setAttribute_Explanation(String attribute_Explanation) {
		this.attribute_Explanation = attribute_Explanation;
	}

	public String getAttribute_Name() {
		return this.attribute_Name;
	}

	public void setAttribute_Name(String attribute_Name) {
		this.attribute_Name = attribute_Name;
	}

	public int getEntity_ID() {
		return this.entity_ID;
	}

	public void setEntity_ID(int entity_ID) {
		this.entity_ID = entity_ID;
	}

	public String getEntity_Name() {
		return this.entity_Name;
	}

	public void setEntity_Name(String entity_Name) {
		this.entity_Name = entity_Name;
	}

}