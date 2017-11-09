package com.ngis.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ng_permission database table.
 * 
 */
@Entity
@Table(name="ng_permission")
@NamedQuery(name="NGPermission.findAll", query="SELECT n FROM Permission n")
public class Permission implements Serializable {
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
	private List<Role> roles;

	public Permission() {
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

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}