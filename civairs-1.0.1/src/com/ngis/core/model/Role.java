package com.ngis.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ng_role database table.
 * 
 */
@Entity
@Table(name="ng_role")
@NamedQuery(name="NGRole.findAll", query="SELECT n FROM Role n")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="role_id")
	private String roleId;

	@Column(name="role_description")
	private String roleDescription;

	//bi-directional many-to-many association to NGPermission
	@ManyToMany
	@JoinTable(name="role_permission",
	joinColumns=@JoinColumn(name="role_id"),
	inverseJoinColumns=@JoinColumn(name="permission_id"))
	private List<Permission> permissions;

	//bi-directional many-to-many association to NGUser
	@ManyToMany
	@JoinTable(name="role_user",
	joinColumns=@JoinColumn(name="role_id"),
	inverseJoinColumns=@JoinColumn(name="login"))
	private List<User> users;

	public Role() {
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleDescription() {
		return this.roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}