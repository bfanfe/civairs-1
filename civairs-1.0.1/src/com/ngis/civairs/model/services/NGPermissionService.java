package com.ngis.civairs.model.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ngis.civairs.model.dao.NGPermissionDAO;
import com.ngis.civairs.model.entities.NGPermission;

@ManagedBean
@SessionScoped
public class NGPermissionService {
	
	private List<NGPermission> permissions;
	private Map<String, NGPermission> permissionsMap;
	
	@EJB
	private NGPermissionDAO dao;
	
	@PostConstruct
	private void init(){
		permissions = dao.getList();
		permissionsMap = new HashMap<String, NGPermission>();
		for(NGPermission permission : permissions){
			permissionsMap.put(permission.getPermissionId(), permission);
		}
	}

	public List<NGPermission> reloadPermissions(){
		permissions = dao.getList();
		return permissions;
	}
	
	public String savePermission(NGPermission permissionToSave){
		if(dao.findById(permissionToSave.getPermissionId()) == null) return dao.insert(permissionToSave);
		else return dao.update(permissionToSave);
	}
	
	public List<NGPermission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<NGPermission> permissions) {
		this.permissions = permissions;
	}

	public Map<String, NGPermission> getPermissionsMap() {
		return permissionsMap;
	}

	public void setPermissionsMap(Map<String, NGPermission> permissionsMap) {
		this.permissionsMap = permissionsMap;
	}	
	
	public static NGPermission copy(NGPermission permission) {
		NGPermission copy = null;
		if (permission != null) {
			copy = new NGPermission();
			copy.setPermissionDescription(permission.getPermissionDescription());
			copy.setPermissionId(permission.getPermissionId());
			copy.setNgRoles(permission.getNgRoles());
			
		}
		return copy;
		
	}
	
	public static List<NGPermission> copyList(List<NGPermission> list){
		List<NGPermission> copy = null;
		if(list != null){
			copy = new ArrayList<NGPermission>();
			copy.addAll(list);
		}
		return copy;
	}

}
