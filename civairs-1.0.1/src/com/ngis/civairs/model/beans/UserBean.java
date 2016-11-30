package com.ngis.civairs.model.beans;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.TransferEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.DualListModel;
import org.primefaces.model.TreeNode;

import com.ngis.civairs.model.beans.SessionBean;
import com.ngis.civairs.model.constants.NGConstants;
import com.ngis.civairs.model.entities.NGRole;
import com.ngis.civairs.model.entities.NGUser;
import com.ngis.civairs.model.entities.occurence.ResponsibleEntity;
import com.ngis.civairs.model.services.NGMessageService;
import com.ngis.civairs.model.services.NGRoleService;
import com.ngis.civairs.model.services.NGUserService;
import com.ngis.civairs.model.services.occurence.ResponsibleEntityService;
import com.ngis.civairs.model.tools.DigestEncriptor;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * The following are Services handled in this backing bean
	 */

	/**
	 * roleService handles facilities related to roles
	 */
	@ManagedProperty("#{nGRoleService}")
	private NGRoleService roleService;

	@ManagedProperty("#{nGUserService}")
	private NGUserService userService;
	
	@ManagedProperty("#{responsibleEntityService}")
	private ResponsibleEntityService responsibleEntityService;
	
	/*
	 * The following are attributes of roleBean
	 */
	private List<NGRole> roles;
	private List<NGUser> emptyRoleUsers;
	private NGUser userToCreate;
	private NGUser userToUpdate;
	
	private String currentPasswd;
	private String newPasswd;
	private String confirmPasswd;

	private List<NGRole> sourceRoles;
	private List<NGRole> targetRoles;
	private DualListModel<NGRole> dualListRoles;

	private TreeNode usersTreeRoot;

	private TreeNode selectedNode;

	private String updateDisabled;

	private boolean resetUserPassword;

	@PostConstruct
	private void init() {

		setUpdateDisabled("true");
		setResetUserPassword(false);
		loadRoles();
		populateUsersTree();
		loadDualListRoles();
	}

	/**
	 * loadDualListRoles is called on postConstruct to build the dualListRoles
	 * model. That model is used by the roles picklist component
	 */
	public void loadDualListRoles() {
		sourceRoles = NGRoleService.copyList(roleService.getRoles());
		targetRoles = new ArrayList<NGRole>();
		dualListRoles = new DualListModel<NGRole>(sourceRoles, targetRoles);
	}

	public void initUserToCreate() {
		userToCreate = new NGUser();
		// init user password do "welcome"
		setResetUserPassword(true);
		try {
			userToCreate.setPassword(DigestEncriptor.encripteSHA256("welcome"));
		} catch (Exception e) {
			userToCreate.setPassword("welcome");
		}
		
		loadDualListRoles();

		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		session.loadViewUserCreate();
		// load user udate view
		
	}

	public void changeUserToUpdate() {
		if (selectedNode != null) {
			setResetUserPassword(false);
			if (selectedNode.getType().equals("user")) {
				try {
					userToUpdate = (NGUser) selectedNode.getData();
					
					//change userToUpdate responsibleEntity instance
					String id = userToUpdate.getResponsibleEntity().getId();
					if(id != null){
						userToUpdate.setResponsibleEntity(responsibleEntityService.getResponsibleEntitiesMap().get(id));
					}

					// set pikList roles
					sourceRoles = NGRoleService.copyList(roleService.getRoles());
					targetRoles = new ArrayList<NGRole>();

					if (userToUpdate.getNgRoles() != null) {
						targetRoles = NGRoleService.copyList(userToUpdate.getNgRoles());
						for (NGRole role : targetRoles) {
							NGRole r;
							for (int i = 0; i < sourceRoles.size(); i++) {
								r = sourceRoles.get(i);
								if (r.getRoleId().equals(role.getRoleId())) {
									sourceRoles.remove(r);
								}
							}
						}

					}
					dualListRoles = new DualListModel<NGRole>(sourceRoles, targetRoles);
					
					
					// load user udate view
					ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
					SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
					session.loadViewUserUpdate();
					
				} catch (Exception e) {
					userToUpdate = null;
					NGMessageService.addError("Unable to select user !");
				}
			}
		}

	}

	/**
	 * 
	 * @param event
	 *            This method handles roles transfer between Picklist source and
	 *            target
	 */
	public void onRoleTransfer(TransferEvent event) {

		/*
		 * Check transfer if event is moving items from source to target then
		 * make this operation from sourceRoles to targetRoles
		 */
		if (event.isAdd()) {

			NGRole obj = null;

			for (Object item : event.getItems()) {
				obj = (NGRole) item;

				// remove transfered Role from source
				NGRole removeRole = null;
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
			NGRole obj = null;

			for (Object item : event.getItems()) {
				obj = (NGRole) item;

				// remove transfered Role from target
				NGRole removeRole = null;
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
	
	public void changePasswd(){
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		NGUser user = session.getSessionUser();
		String encryptedPasswd = null;
		String msg = null;
		if(currentPasswd != null){
			try {
				encryptedPasswd = DigestEncriptor.encripteSHA256(currentPasswd);
			} catch (NoSuchAlgorithmException e) {
			}
			
			if(encryptedPasswd != null){
				if(user.getPassword().equals(encryptedPasswd)){
					if(newPasswd != null){
						if(confirmPasswd.equals(newPasswd)){
							try {
								user.setPassword(DigestEncriptor.encripteSHA256(newPasswd));
								userService.updateUser(user);
							} catch (NoSuchAlgorithmException e) {
								msg = "Echec du changement de mot de passe !";
							}
						}else{
							msg = "Confirmation du Nouveau Mot de passe incorrecte !";
						}
					}else{
						msg = "Nouveau Mot de passe invalide !";
					}
				}else{
					msg = "Mot de passe actuel incorrect !";
				}
			}else{
				msg = "Mot de passe actuel invalide !";
			}
		}
		
		if(msg == null){
			NGMessageService.addInfo("Mot de passe modifié avec succès !");
		}else{
			NGMessageService.addError(msg);
		}
		
	}

	/**
	 * updateUser is called to persist changes on the selected tab role.
	 */
	public void updateUser() {
		/* save role */
		userToUpdate.setNgRoles(targetRoles);

		// Reset password if reset checkbox is check
		if (resetUserPassword) {
			String oldPasswd = userToUpdate.getPassword();
			try {
				userToUpdate.setPassword(DigestEncriptor.encripteSHA256("welcome"));
			} catch (Exception e) {
				userToUpdate.setPassword(oldPasswd);
			}

		}
		String dbResult = userService.updateUser(userToUpdate);
		roles = userService.reloadRoles();
		// roles = new ArrayList<NGRole>();

		/* add message to conntext */

		NGMessageService.addMessage(dbResult);
		populateUsersTree();
		goBackToUsersView();

	}

	/**
	 * createUser is call to persist a new user
	 */
	public void createUser() {
		/* save role */

		userToCreate.setNgRoles(targetRoles);

		String dbResult = userService.insertUser(userToCreate);
		roles = userService.reloadRoles();
		/* add message to conntext */

		NGMessageService.addMessage(dbResult);
		populateUsersTree();
		goBackToUsersView();
	}

	/**
	 * cancelUser is called to cancel either a creation or a modification
	 * process of a user
	 */
	public void cancelUser() {
		goBackToUsersView();
	}
	
	/**
	 * deleteUser is called to remove selected user
	 */
	public void deleteUser(){
		String dbResult = null;
		if (selectedNode != null && selectedNode.getType().equals("user")) {
			try{
				userToUpdate = (NGUser) selectedNode.getData();
				dbResult = userService.deleteUser(userToUpdate);
				roles = userService.reloadRoles();
				populateUsersTree();
			}catch(Exception e){
				dbResult = NGConstants.DB_DELETE_FAILED;
			}
			NGMessageService.addMessage(dbResult);
		}
		
		goBackToUsersView();
	}

	private void goBackToUsersView() {
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		session.loadViewUsers();
		
	}

	
	public void onNodeSelect(NodeSelectEvent event) {
		if (event.getTreeNode() != null && event.getTreeNode().getType().equals("user")) {
			setUpdateDisabled("false");
		} else {
			setUpdateDisabled("true");
		}
	}

	public void populateUsersTree() {
		emptyRoleUsers = userService.loadEmptyRoleUsers();
		usersTreeRoot = new DefaultTreeNode("Root", null);
		
		//Add users in roles to the tree
		if (roles != null) {
			for (NGRole role : roles) {
				if (!role.getNgUsers().isEmpty()) {
					TreeNode roleNode = new DefaultTreeNode("role", role, usersTreeRoot);
					for (NGUser user : role.getNgUsers()) {
						@SuppressWarnings("unused")
						TreeNode userNode = new DefaultTreeNode("user", user, roleNode);
					}
				}
			}
		}else{
			NGMessageService.addError("Empty roles !");
		}
		
		// Add users with empty roles to the tree
		for (NGUser user : emptyRoleUsers) {
			@SuppressWarnings("unused")
			TreeNode userNode = new DefaultTreeNode("user", user, usersTreeRoot);
		}
	}

	public TreeNode getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(TreeNode selectedNode) {
		this.selectedNode = selectedNode;
	}

	public TreeNode getUsersTreeRoot() {
		return usersTreeRoot;
	}

	public void setUsersTreeRoot(TreeNode usersTreeRoot) {
		this.usersTreeRoot = usersTreeRoot;
	}

	public NGUser getUserToCreate() {
		return userToCreate;
	}

	public NGUser getUserToUpdate() {
		return userToUpdate;
	}

	public void setUserToCreate(NGUser userToCreate) {
		this.userToCreate = userToCreate;
	}

	public void setUserToUpdate(NGUser userToUpdate) {
		this.userToUpdate = userToUpdate;
	}

	public NGRoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(NGRoleService roleService) {
		this.roleService = roleService;
	}

	public List<NGRole> getRoles() {
		return roles;
	}

	public void setRoles(List<NGRole> roles) {
		this.roles = roles;
	}

	public void loadRoles() {
		// users = userService.getUsers();

		roles = userService.reloadRoles();

	}

	public String getUpdateDisabled() {
		return updateDisabled;
	}

	public void setUpdateDisabled(String updateDisabled) {
		this.updateDisabled = updateDisabled;
	}

	public List<NGRole> getSourceRoles() {
		return sourceRoles;
	}

	public List<NGRole> getTargetRoles() {
		return targetRoles;
	}

	public DualListModel<NGRole> getDualListRoles() {
		return dualListRoles;
	}

	public void setSourceRoles(List<NGRole> sourceRoles) {
		this.sourceRoles = sourceRoles;
	}

	public void setTargetRoles(List<NGRole> targetRoles) {
		this.targetRoles = targetRoles;
	}

	public void setDualListRoles(DualListModel<NGRole> dualListRoles) {
		this.dualListRoles = dualListRoles;
	}

	public NGUserService getUserService() {
		return userService;
	}

	public void setUserService(NGUserService userService) {
		this.userService = userService;
	}

	public boolean getResetUserPassword() {
		return resetUserPassword;
	}

	public void setResetUserPassword(boolean resetUserPassword) {
		this.resetUserPassword = resetUserPassword;
	}

	public String getCurrentPasswd() {
		return currentPasswd;
	}

	public String getNewPasswd() {
		return newPasswd;
	}

	public String getConfirmPasswd() {
		return confirmPasswd;
	}

	public void setCurrentPasswd(String currentPasswd) {
		this.currentPasswd = currentPasswd;
	}

	public void setNewPasswd(String newPasswd) {
		this.newPasswd = newPasswd;
	}

	public void setConfirmPasswd(String confirmPasswd) {
		this.confirmPasswd = confirmPasswd;
	}
	
	public List<ResponsibleEntity> getResponsibleEntities() {
		return responsibleEntityService.getResponsibleEntities();
	}


	public void setResponsibleEntities(List<ResponsibleEntity> responsibleEntities) {
		responsibleEntityService.setResponsibleEntities(responsibleEntities);
	}

	public ResponsibleEntityService getResponsibleEntityService() {
		return responsibleEntityService;
	}

	public void setResponsibleEntityService(ResponsibleEntityService responsibleEntityService) {
		this.responsibleEntityService = responsibleEntityService;
	}

	
	
}
