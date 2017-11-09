package com.ngis.core.beans;

import java.io.Serializable;
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

import com.ngis.civairs.model.services.NGMessageService;
import com.ngis.core.model.Permission;
import com.ngis.core.model.Role;
import com.ngis.core.services.PermissionService;
import com.ngis.core.services.RoleService;

@ManagedBean
@SessionScoped
public class RoleBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/*
	 * The following are Services handled in this backing bean
	 */

	/**
	 * permissionService contains the set of permissions retrieved from DAO
	 * layer
	 */
	@ManagedProperty("#{nGPermissionService}")
	private PermissionService permissionService;
	
	
	/**
	 * roleService handles facilities related to roles
	 */
	@ManagedProperty("#{nGRoleService}")
	private RoleService roleService;

	/*
	 * The following are attributes of roleBean
	 */
	private int activeRoleIndex = 0;
	private List<Role> roles;
	private List<Permission> sourcePermissions;
	private List<Permission> targetPermissions;
	private Role roleToUpdate;
	private Role roleToCreate;
	private DualListModel<Permission> dualListPermissions;

	@PostConstruct
	private void init() {
		loadRoles();
		loadDualListPermissions();
	}

	public Role getRoleToCreate() {
		return roleToCreate;
	}

	public void setRoleToCreate(Role roleToCreate) {
		this.roleToCreate = roleToCreate;
	}

	public PermissionService getPermissionService() {
		return permissionService;
	}

	public void setPermissionService(PermissionService permissionService) {
		this.permissionService = permissionService;
	}

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	public List<Permission> getSourcePermissions() {
		return sourcePermissions;
	}

	public List<Permission> getTargetPermissions() {
		return targetPermissions;
	}

	public void setSourcePermissions(List<Permission> sourcePermissions) {
		this.sourcePermissions = sourcePermissions;
	}

	public void setTargetPermissions(List<Permission> targetPermissions) {
		this.targetPermissions = targetPermissions;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
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
		sourcePermissions = PermissionService.copyList(permissionService.getPermissions());
		targetPermissions = new ArrayList<Permission>();
		dualListPermissions = new DualListModel<Permission>(sourcePermissions, targetPermissions);
	}

	public Role getRoleToUpdate() {
		return roleToUpdate;
	}

	public void setRoleToUpdate(Role roleToUpdate) {
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
		sourcePermissions = PermissionService.copyList(permissionService.getPermissions());
		targetPermissions = new ArrayList<Permission>();

		if (roleToUpdate.getPermissions() != null) {
			targetPermissions = PermissionService.copyList(roleToUpdate.getPermissions());
			for (Permission permission : targetPermissions) {
				Permission p;
				for (int i = 0; i < sourcePermissions.size(); i++) {
					p = sourcePermissions.get(i);
					if (p.getPermissionId().equals(permission.getPermissionId())) {
						sourcePermissions.remove(p);
					}
				}
			}

		}
		dualListPermissions = new DualListModel<Permission>(sourcePermissions, targetPermissions);
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
		setRoleToCreate(new Role());
		
		// set pikList permissions
		sourcePermissions = PermissionService.copyList(permissionService.getPermissions());
		targetPermissions = new ArrayList<Permission>();
		dualListPermissions = new DualListModel<Permission>(sourcePermissions, targetPermissions);

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

			Permission p = null;

			for (Object item : event.getItems()) {
				p = (Permission) item;

				// remove transfered Permisson from source
				Permission removePermission = null;
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
			Permission p = null;

			for (Object item : event.getItems()) {
				p = (Permission) item;

				// remove transfered Permisson from target
				Permission removePermission = null;
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
		roleToUpdate.setPermissions(targetPermissions);
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

		roleToCreate.setPermissions(targetPermissions);
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

	public DualListModel<Permission> getDualListPermissions() {
		return dualListPermissions;
	}

	public void setDualListPermissions(DualListModel<Permission> dualListPermissions) {
		this.dualListPermissions = dualListPermissions;
	}

	public int getActiveRoleIndex() {
		return activeRoleIndex;
	}

	public void setActiveRoleIndex(int activeRoleIndex) {
		this.activeRoleIndex = activeRoleIndex;
	}

	

}
