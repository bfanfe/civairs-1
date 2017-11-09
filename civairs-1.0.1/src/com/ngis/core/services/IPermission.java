package com.ngis.core.services;

import java.util.List;

import javax.ejb.Local;

import com.ngis.core.model.Permission;
import com.ngis.core.model.Role;

@Local
public interface IPermission {
	
	public void createPermission(Permission permission, List<Role> roles);
	public void updatePermission(Permission permission, List<Role> roles);
	public List<Permission> findAllPermission();
	public void deletePermission(String permissionId);

}
