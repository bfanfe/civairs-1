package com.ngis.core.services;

import java.util.List;

import javax.ejb.Local;

import com.ngis.core.model.Permission;
import com.ngis.core.model.Role;
import com.ngis.core.model.User;

@Local
public interface IRole {
	
	public void createRole(Role role, List<Permission> permissions, List<User> users);
	public void updateRole(Role role, List<Permission> permissions, List<User> users);
	public List<Role> findAllRole();
	public void deleteRole(String roleId);

}
