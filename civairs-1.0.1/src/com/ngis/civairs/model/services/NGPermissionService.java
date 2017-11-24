package com.ngis.civairs.model.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ngis.civairs.model.dao.NGPermissionDAO;
import com.ngis.core.model.Permission;

@ManagedBean
@SessionScoped
public class NGPermissionService implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Permission> permissions;
	private Map<String, Permission> permissionsMap;
	
	@EJB
	private NGPermissionDAO dao;
	
	@PostConstruct
	private void init(){
		permissions = dao.getList();
		permissionsMap = new HashMap<String, Permission>();
		for(Permission permission : permissions){
			permissionsMap.put(permission.getPermissionId(), permission);
		}
	}

	public List<Permission> reloadPermissions(){
		permissions = dao.getList();
		return permissions;
	}
	
	public String savePermission(Permission permissionToSave){
		if(dao.findById(permissionToSave.getPermissionId()) == null) return dao.insert(permissionToSave);
		else return dao.update(permissionToSave);
	}
	
	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public Map<String, Permission> getPermissionsMap() {
		return permissionsMap;
	}

	public void setPermissionsMap(Map<String, Permission> permissionsMap) {
		this.permissionsMap = permissionsMap;
	}	
	
	public static Permission copy(Permission permission) {
		Permission copy = null;
		if (permission != null) {
			copy = new Permission();
			copy.setPermissionDescription(permission.getPermissionDescription());
			copy.setPermissionId(permission.getPermissionId());
			copy.setNgRoles(permission.getNgRoles());
			
		}
		return copy;
		
	}
	
	public static List<Permission> copyList(List<Permission> list){
		List<Permission> copy = null;
		if(list != null){
			copy = new ArrayList<Permission>();
			copy.addAll(list);
		}
		return copy;
	}

}
