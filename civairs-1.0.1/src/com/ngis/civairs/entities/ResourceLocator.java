package com.ngis.civairs.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ResourceLocator database table.
 * 
 */
@Entity
@Table(name="ResourceLocator")
@NamedQuery(name="ResourceLocator.findAll", query="SELECT r FROM ResourceLocator r")
public class ResourceLocator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Description", length=60)
	private String description;

	@Column(name="File_Name", length=60)
	private String file_Name;

	public ResourceLocator() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFile_Name() {
		return this.file_Name;
	}

	public void setFile_Name(String file_Name) {
		this.file_Name = file_Name;
	}

}