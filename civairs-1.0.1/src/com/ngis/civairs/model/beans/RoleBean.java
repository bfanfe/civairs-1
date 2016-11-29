package com.ngis.civairs.model.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.primefaces.event.TransferEvent;
import org.primefaces.model.DualListModel;

import com.ngis.civairs.model.entities.NGPermission;
import com.ngis.civairs.model.entities.NGRole;
import com.ngis.civairs.model.services.NGMessageService;
import com.ngis.civairs.model.services.NGPermissionService;
import com.ngis.civairs.model.services.NGRoleService;

@ManagedBean
@SessionScoped
public class RoleBean {

	/*
	 * The following are Services handled in this backing bean
	 */

	/**
	 * permissionService contains the set of permissions retrieved from DAO
	 * layer
	 */
	@ManagedProperty("#{nGPermissionService}")
	private NGPermissionService permissionService;
	
	
	/**
	 * roleService handles facilities related to roles
	 */
	@ManagedProperty("#{nGRoleService}")
	private NGRoleService roleService;

	/*
	 * The following are attributes of roleBean
	 */
	private List<NGRole> roles;
	private List<NGPermission> sourcePermissions;
	private List<NGPermission> targetPermissions;
	private NGRole roleToUpdate;
	private NGRole roleToCreate;
	private DualListModel<NGPermission> dualListPermissions;

	@PostConstruct
	private void init() {
		loadRoles();
		loadDualListPermissions();
	}

	public NGRole getRoleToCreate() {
		return roleToCreate;
	}

	public void setRoleToCreate(NGRole roleToCreate) {
		this.roleToCreate = roleToCreate;
	}

	public NGPermissionService getPermissionService() {
		return permissionService;
	}

	public void setPermissionService(NGPermissionService permissionService) {
		this.permissionService = permissionService;
	}

	public NGRoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(NGRoleService roleService) {
		this.roleService = roleService;
	}

	public List<NGPermission> getSourcePermissions() {
		return sourcePermissions;
	}

	public List<NGPermission> getTargetPermissions() {
		return targetPermissions;
	}

	public void setSourcePermissions(List<NGPermission> sourcePermissions) {
		this.sourcePermissions = sourcePermissions;
	}

	public void setTargetPermissions(List<NGPermission> targetPermissions) {
		this.targetPermissions = targetPermissions;
	}

	public List<NGRole> getRoles() {
		return roles;
	}

	public void setRoles(List<NGRole> roles) {
		this.roles = roles;
	}

	public void loadRoles() {
		roles = roleService.getRoles();

	}

	/**
	 * loadDualListPermissions is called on postConstruct to build the
	 * dualListPermissions model. That model is used by the roles picklist
	 * component
	 */
	public void loadDualListPermissions() {
		sourcePermissions = NGPermissionService.copyList(permissionService.getPermissions());
		targetPermissions = new ArrayList<NGPermission>();
		dualListPermissions = new DualListModel<NGPermission>(sourcePermissions, targetPermissions);
	}

	public NGRole getRoleToUpdate() {
		return roleToUpdate;
	}

	public void setRoleToUpdate(NGRole roleToUpdate) {
		this.roleToUpdate = roleToUpdate;
	}

	/**
	 * changeRoleToUpdate is called when roles accordion selected tab update
	 * button is clicked. it sets the roleToUpdate to the one that appears on
	 * selected tab.
	 * 
	 * @param event
	 */
	public void changeRoleToUpdate(String roleId) {

		// set roleToUpdate to selected tab role
		setRoleToUpdate(roleService.getRole(roleId));

		// set pikList permissions
		sourcePermissions = NGPermissionService.copyList(permissionService.getPermissions());
		targetPermissions = new ArrayList<NGPermission>();

		if (roleToUpdate.getNgPermissions() != null) {
			targetPermissions = NGPermissionService.copyList(roleToUpdate.getNgPermissions());
			for (NGPermission permission : targetPermissions) {
				NGPermission p;
				for (int i = 0; i < sourcePermissions.size(); i++) {
					p = sourcePermissions.get(i);
					if (p.getPermissionId().equals(permission.getPermissionId())) {
						sourcePermissions.remove(p);
					}
				}
			}

		}
		dualListPermissions = new DualListModel<NGPermission>(sourcePermissions, targetPermissions);
		// load role update view
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		session.loadViewRoleUpdate();
		
	}

	/**
	 * This method inits the roleToCreate
	 */
	public void initRoleToCreate() {
		// create new role
		setRoleToCreate(new NGRole());
		
		// set pikList permissions
		sourcePermissions = NGPermissionService.copyList(permissionService.getPermissions());
		targetPermissions = new ArrayList<NGPermission>();
		dualListPermissions = new DualListModel<NGPermission>(sourcePermissions, targetPermissions);

		// load role create view
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		session.loadViewRoleCreate();
		
	}

	/**
	 * 
	 * @param event
	 *            This method handles permissions transfer between Picklist
	 *            source and target
	 */
	public void onPermissionTransfer(TransferEvent event) {

		/*
		 * Check transfer if event is moving items from source to target then
		 * make this operation from sourcePermissions to targetPermissions
		 */
		if (event.isAdd()) {

			NGPermission p = null;

			for (Object item : event.getItems()) {
				p = (NGPermission) item;

				// remove transfered Permisson from source
				NGPermission removePermission = null;
				for (int i = 0; i < sourcePermissions.size(); i++) {
					removePermission = sourcePermissions.get(i);
					if (removePermission.getPermissionId().equals(p.getPermissionId()))
						sourcePermissions.remove(removePermission);
				}

				// add transfered Permisson to target
				targetPermissions.add(p);
			}

		}

		/*
		 * Check transfer if event is moving items from target to source then
		 * make this operation from targetPermissions to sourcePermissions
		 */
		if (event.isRemove()) {
			NGPermission p = null;

			for (Object item : event.getItems()) {
				p = (NGPermission) item;

				// remove transfered Permisson from target
				NGPermission removePermission = null;
				for (int i = 0; i < targetPermissions.size(); i++) {
					removePermission = targetPermissions.get(i);
					if (removePermission.getPermissionId().equals(p.getPermissionId()))
						targetPermissions.remove(removePermission);
				}

				// add transfered Permisson to source
				sourcePermissions.add(p);

			}
		}

	}

	/**
	 * updateRole is called to persist changes on the selected tab role.
	 */
	public void updateRole() {
		/* save role */
		roleToUpdate.setNgPermissions(targetPermissions);
		String dbResult = roleService.saveRole(roleToUpdate);

		/* add message to conntext */

		NGMessageService.addMessage(dbResult);
		goBackToRolesView();

	}

	/**
	 * createRole is call to persist a new role
	 */
	public void createRole() {
		/* save role */

		roleToCreate.setNgPermissions(targetPermissions);
		String dbResult = roleService.saveRole(roleToCreate);
		roles = roleService.reloadRoles();
		/* add message to conntext */

		NGMessageService.addMessage(dbResult);
		goBackToRolesView();
	}

	/**
	 * deleteRole is called to remove selected role
	 */
	public void deleteRole(String roleId) {
		setRoleToUpdate(roleService.getRole(roleId));
		String dbResult = roleService.deleteRole(roleToUpdate);
		roles = roleService.reloadRoles();
		NGMessageService.addMessage(dbResult);
		goBackToRolesView();

	}

	private void goBackToRolesView() {
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		session.loadViewRoles();
		
	}

	/**
	 * cancelRole is called to cancel either a creation or a modification
	 * process of a role
	 */
	public void cancelRole() {
		goBackToRolesView();
	}

	public DualListModel<NGPermission> getDualListPermissions() {
		return dualListPermissions;
	}

	public void setDualListPermissions(DualListModel<NGPermission> dualListPermissions) {
		this.dualListPermissions = dualListPermissions;
	}

	

}
