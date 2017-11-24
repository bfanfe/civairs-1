package com.ngis.core.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.event.TransferEvent;
import org.primefaces.model.DualListModel;

import com.ngis.civairs.model.services.NGRoleService;
import com.ngis.core.exceptions.CRUDException;
import com.ngis.core.exceptions.ServiceException;
import com.ngis.core.model.ResponsibleEntity;
import com.ngis.core.model.Role;
import com.ngis.core.model.User;
import com.ngis.core.services.MessageService;
import com.ngis.core.services.ResponsibleEntityService;
import com.ngis.core.services.RoleService;
import com.ngis.core.services.UserService;

@ManagedBean
@SessionScoped
public class UserBean {

	/*
	 * Static views and attributes
	 */
	public static final String USERS_VIEW = "/app/admin/users/users?faces-redirect=true";
	public static final String USER_CREATE_VIEW = "/app/admin/users/user-create-view?faces-redirect=true";
	public static final String USER_UPDATE_VIEW = "/app/admin/users/user-update-view?faces-redirect=true";

	/*
	 * Attributes
	 */
	private User newUser;
	private User selectedUser;
	private User userToUpdateOrDelete;
	private List<User> userList;
	private List<ResponsibleEntity> responsibleEntityList;
	private boolean isUserUnSelected;

	private List<Role> sourceRoles;
	private List<Role> targetRoles;
	private DualListModel<Role> dualListRoles;
	
	private String updateDisabled;

	private boolean resetUserPassword;

	@EJB
	UserService userService;

	@EJB
	MessageService messageService;

	@EJB
	ResponsibleEntityService responsibleEntitySerice;

	@EJB
	RoleService roleService;

	@PostConstruct
	private void init() {
		userList = userService.findAll();
		responsibleEntityList = responsibleEntitySerice.findAll();
		loadDualListRoles();
		setUserUnSelected(true);
		setUpdateDisabled("true");
		setResetUserPassword(false);
	}

	/*
	 * methodes
	 */
	public String initNewUser() {
		newUser = new User();
		loadDualListRoles();
		return USER_CREATE_VIEW;
	}
	
	public void onUserSelect(){
		if (selectedUser != null) setUserUnSelected(false);
		else setUserUnSelected(true);
	}

	public String initUpdateUser() {
		if (selectedUser != null) {
			// set pikList roles
			sourceRoles = roleService.copyRoleList(roleService.findAll());
			targetRoles = roleService.copyRolesOfUser(selectedUser);
			sourceRoles = roleService.removeRolesFromList(sourceRoles, targetRoles);
			dualListRoles = new DualListModel<Role>(sourceRoles, targetRoles);
			//userToUpdateOrDelete = userService.findById(selectedUser.getLogin());
			return USER_UPDATE_VIEW;
		} else
			return null;
	}
	
	public void testResponsibleEntity(){
		messageService.infoMessage("Entity selected is : "+selectedUser.getResponsibleEntity().getName());
	}
	
	/*
	 * cancelUser is called to cancel either a creation or a modification
	 * process of a user
	 */
	public String cancelUser() {
		return USERS_VIEW;
	}

	/*
	 * createUser is call to persist a new user
	 */

	public String createUser() {
		try {
			newUser.setRoles(dualListRoles.getTarget());
			userService.setUserPassword(newUser, "welcome");
			userService.create(newUser);
			userList = userService.findAll();

			return USERS_VIEW;

		} catch (CRUDException ce) {
			messageService.errorMessage(ce.getMessage());
			return null;
		} catch (ServiceException se) {
			messageService.errorMessage(se.getMessage());
			return null;
		}

	}

	public String updateUser() {
		try {
			selectedUser.setRoles(dualListRoles.getTarget());
			userService.update(selectedUser);
			userList = userService.findAll();
			return USERS_VIEW;
		} catch (CRUDException ce) {
			messageService.errorMessage(ce.getMessage());
			return null;
		}
	}
	
	public String deleteUser() {
		try {
			userService.delete(selectedUser);
			userList = userService.findAll();
			return USERS_VIEW;
		} catch (CRUDException ce) {
			messageService.errorMessage(ce.getMessage());
			return null;
		}
	}

	/*
	 * loadDualListRoles is called on postConstruct to build the dualListRoles
	 * model. That model is used by the roles picklist component
	 */
	public void loadDualListRoles() {
		sourceRoles = roleService.findAll();
		targetRoles = new ArrayList<Role>();
		dualListRoles = new DualListModel<Role>(sourceRoles, targetRoles);
	}

	/**
	 * 
	 * @param event
	 *            This method handles roles transfer between Picklist source and
	 *            target
	 */
	public void onRoleTransfer(TransferEvent event) {

		/*onRoleTransfer
		 * Check transfer if event is moving items from source to target then
		 * make this operation from sourceRoles to targetRoles
		 */
				
		if (event.isAdd()) {

			Role obj = null;

			for (Object item : event.getItems()) {
				obj = (Role) item;

				// remove transfered Role from source
				Role removeRole = null;
				for (int i = 0; i < sourceRoles.size(); i++) {
					removeRole = sourceRoles.get(i);
					if (removeRole.getRoleId().equals(obj.getRoleId()))
						sourceRoles.remove(removeRole);
				}

				// add transfered Role to target
				targetRoles.add(obj);
				
			}

		}

		/*
		 * Check transfer if event is moving items from target to source then
		 * make this operation from targetRoles to sourceRoles
		 */
		if (event.isRemove()) {
			Role obj = null;

			for (Object item : event.getItems()) {
				obj = (Role) item;

				// remove transfered Role from target
				Role removeRole = null;
				for (int i = 0; i < targetRoles.size(); i++) {
					removeRole = targetRoles.get(i);
					if (removeRole.getRoleId().equals(obj.getRoleId()))
						targetRoles.remove(removeRole);
				}

				// add transfered Role to source
				sourceRoles.add(obj);

			}
		}

	}

	

	/*
	 * Setters and getters
	 */
	public boolean isUserUnSelected() {
		return isUserUnSelected;
	}

	public void setUserUnSelected(boolean isUserSelected) {
		this.isUserUnSelected = isUserSelected;
	}

	public User getNewUser() {
		return newUser;
	}

	public void setNewUser(User newUser) {
		this.newUser = newUser;
	}

	public User getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
		if (selectedUser != null)
			setUserUnSelected(false);
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public List<ResponsibleEntity> getResponsibleEntityList() {
		return responsibleEntityList;
	}

	public void setResponsibleEntityList(List<ResponsibleEntity> responsibleEntityList) {
		this.responsibleEntityList = responsibleEntityList;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<Role> getSourceRoles() {
		return sourceRoles;
	}

	public void setSourceRoles(List<Role> sourceRoles) {
		this.sourceRoles = sourceRoles;
	}

	public List<Role> getTargetRoles() {
		return targetRoles;
	}

	public void setTargetRoles(List<Role> targetRoles) {
		this.targetRoles = targetRoles;
	}

	public DualListModel<Role> getDualListRoles() {
		return dualListRoles;
	}

	public void setDualListRoles(DualListModel<Role> dualListRoles) {
		this.dualListRoles = dualListRoles;
	}

	public ResponsibleEntityService getResponsibleEntitySerice() {
		return responsibleEntitySerice;
	}

	public void setResponsibleEntitySerice(ResponsibleEntityService responsibleEntitySerice) {
		this.responsibleEntitySerice = responsibleEntitySerice;
	}

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	public void setResponsibleEntity(ResponsibleEntity entity) {
		newUser.setResponsibleEntity(entity);
	}

	public ResponsibleEntity getResponsibleEntity() {
		return newUser.getResponsibleEntity();
	}

	public User getUserToUpdateOrDelete() {
		return userToUpdateOrDelete;
	}

	public void setUserToUpdateOrDelete(User userToUpdateOrDelete) {
		this.userToUpdateOrDelete = userToUpdateOrDelete;
	}

	public String getUpdateDisabled() {
		return updateDisabled;
	}

	public void setUpdateDisabled(String updateDisabled) {
		this.updateDisabled = updateDisabled;
	}

	public boolean isResetUserPassword() {
		return resetUserPassword;
	}

	public void setResetUserPassword(boolean resetUserPassword) {
		this.resetUserPassword = resetUserPassword;
	}
	
	

}
