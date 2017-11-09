package com.ngis.core.model;

import java.io.Serializable;
import javax.persistence.*;

import com.ngis.civairs.entities.Identifier;
import com.ngis.civairs.model.enums.EnumResponsibleEntityType;

import java.util.List;


/**
 * The persistent class for the ResponsibleEntity database table.
 * 
 */
@Entity
@Table(name="ResponsibleEntity")
@NamedQuery(name="ResponsibleEntity.findAll", query="SELECT r FROM ResponsibleEntity r")
public class ResponsibleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=60)
	private String id;

	@Column(name="Address", length=256)
	private String address;

	@Column(name="Email", length=60)
	private String email;

	@Column(name="Entity_Type", nullable=false, length=60)
	private String entity_Type;

	@Column(name="Name", nullable=false, length=60)
	private String name;

	@Column(name="Phone", length=60)
	private String phone;

	//bi-directional many-to-one association to Identifier
	@OneToMany(mappedBy="responsibleEntity")
	private List<Identifier> identifiers;

	public ResponsibleEntity() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEntity_Type() {
		return this.entity_Type;
	}
	
	public String getEntity_Type_Label() {
		String entity_Type_Label = entity_Type;
		for(EnumResponsibleEntityType eType: EnumResponsibleEntityType.values() ){
			if(eType.getId().equals(entity_Type)) entity_Type_Label = eType.getValue();
		}
		return entity_Type_Label;
	}

	public void setEntity_Type(String entity_Type) {
		this.entity_Type = entity_Type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Identifier> getIdentifiers() {
		return this.identifiers;
	}

	public void setIdentifiers(List<Identifier> identifiers) {
		this.identifiers = identifiers;
	}

	public Identifier addIdentifier(Identifier identifier) {
		getIdentifiers().add(identifier);
		identifier.setResponsibleEntity(this);

		return identifier;
	}

	public Identifier removeIdentifier(Identifier identifier) {
		getIdentifiers().remove(identifier);
		identifier.setResponsibleEntity(null);

		return identifier;
	}

}