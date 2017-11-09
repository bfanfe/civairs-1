package com.ngis.civairs.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ng_permission database table.
 * 
 */
@Entity
@Table(name="ng_permission")
@NamedQuery(name="NGPermission.findAll", query="SELECT n FROM NGPermission n")
public class NGPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="permission_id")
	private String permissionId;

	@Column(name="permission_description")
	private String permissionDescription;

	//bi-directional many-to-many association to NGRole
	@ManyToMany
	@JoinTable(name="role_permission",
	joinColumns=@JoinColumn(name="permission_id"),
	inverseJoinColumns=@JoinColumn(name="role_id"))
	private List<NGRole> ngRoles;

	public NGPermission() {
	}

	public String getPermissionId() {
		return this.permissionId;
	}

	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}

	public String getPermissionDescription() {
		return this.permissionDescription;
	}

	public void setPermissionDescription(String permissionDescription) {
		this.permissionDescription = permissionDescription;
	}

	public List<NGRole> getNgRoles() {
		return this.ngRoles;
	}

	public void setNgRoles(List<NGRole> ngRoles) {
		this.ngRoles = ngRoles;
	}

}