package com.ngis.civairs.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ng_role database table.
 * 
 */
@Entity
@Table(name="ng_role")
@NamedQuery(name="NGRole.findAll", query="SELECT n FROM NGRole n")
public class NGRole implements Serializable {
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
	private List<NGPermission> ngPermissions;

	//bi-directional many-to-many association to NGUser
	@ManyToMany
	@JoinTable(name="role_user",
	joinColumns=@JoinColumn(name="role_id"),
	inverseJoinColumns=@JoinColumn(name="login"))
	private List<NGUser> ngUsers;

	public NGRole() {
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

	public List<NGPermission> getNgPermissions() {
		return this.ngPermissions;
	}

	public void setNgPermissions(List<NGPermission> ngPermissions) {
		this.ngPermissions = ngPermissions;
	}

	public List<NGUser> getNgUsers() {
		return this.ngUsers;
	}

	public void setNgUsers(List<NGUser> ngUsers) {
		this.ngUsers = ngUsers;
	}

}