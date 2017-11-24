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
import com.ngis.civairs.model.services.NGRoleService;
import com.ngis.civairs.model.services.NGUserService;
import com.ngis.civairs.model.services.occurence.ResponsibleEntityService2;
import com.ngis.civairs.model.tools.DigestEncriptor;
import com.ngis.core.model.Role;
import com.ngis.core.model.User;
import com.ngis.core.services.MessageService;
import com.ngis.core.model.ResponsibleEntity;

@ManagedBean
@SessionScoped
public class UserBean2 implements Serializable {

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
	private ResponsibleEntityService2 responsibleEntityService;

	/*
	 * The following are attributes of roleBean
	 */
	private List<Role> roles;
	private List<User> emptyRoleUsers;
	private User userToCreate;
	private User userToUpdate;

	private String currentPasswd;
	private String newPasswd;
	private String confirmPasswd;

	private List<Role> sourceRoles;
	private List<Role> targetRoles;
	private DualListModel<Role> dualListRoles;

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
		targetRoles = new ArrayList<Role>();
		dualListRoles = new DualListModel<Role>(sourceRoles, targetRoles);
	}

	public void initUserToCreate() {
		
		/*
		 * Création d'un utilisateur
		 */
		userToCreate = new User();
		
		/*
		 * Initialisation du paramètre "resetUserPassword" à "true" 
		 * Ce paramètre est utiliser lors de la persistence de l'utilisateur
		 * Si sont test est vrais, le mot de passe de l'utilisateur sera mis à sa valeur 
		 * par defaut "welcome"
		 */
		setResetUserPassword(true);
		try {
			
			//Initialisation du mot de passe avec la valeur crypt
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
					userToUpdate = (User) selectedNode.getData();

					// change userToUpdate responsibleEntity instance
					String id = userToUpdate.getResponsibleEntity().getId();
					if (id != null) {
						userToUpdate.setResponsibleEntity(responsibleEntityService.getResponsibleEntitiesMap().get(id));
					}

					// set pikList roles
					sourceRoles = NGRoleService.copyList(roleService.getRoles());
					targetRoles = new ArrayList<Role>();

					if (userToUpdate.getRoles() != null) {
						targetRoles = NGRoleService.copyList(userToUpdate.getRoles());
						for (Role role : targetRoles) {
							Role r;
							for (int i = 0; i < sourceRoles.size(); i++) {
								r = sourceRoles.get(i);
								if (r.getRoleId().equals(role.getRoleId())) {
									sourceRoles.remove(r);
								}
							}
						}

					}
					dualListRoles = new DualListModel<Role>(sourceRoles, targetRoles);

					// load user udate view
					ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
					SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
					session.loadViewUserUpdate();

				} catch (Exception e) {
					userToUpdate = null;
					//MessageService.errorMessage("Unable to select user !");
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

	public void changePasswd() {
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		User user = session.getSessionUser();
		String encryptedPasswd = null;
		String msg = null;
		if (currentPasswd != null) {
			try {
				encryptedPasswd = DigestEncriptor.encripteSHA256(currentPasswd);
			} catch (NoSuchAlgorithmException e) {
			}

			if (encryptedPasswd != null) {
				if (user.getPassword().equals(encryptedPasswd)) {
					if (newPasswd != null) {
						if (confirmPasswd.equals(newPasswd)) {
							try {
								user.setPassword(DigestEncriptor.encripteSHA256(newPasswd));
								userService.updateUser(user);
							} catch (NoSuchAlgorithmException e) {
								msg = "Echec du changement de mot de passe !";
							}
						} else {
							msg = "Confirmation du Nouveau Mot de passe incorrecte !";
						}
					} else {
						msg = "Nouveau Mot de passe invalide !";
					}
				} else {
					msg = "Mot de passe actuel incorrect !";
				}
			} else {
				msg = "Mot de passe actuel invalide !";
			}
		}

		if (msg == null) {
			//MessageService.infoMessage("Mot de passe modifié avec succès !");
		} else {
			//MessageService.errorMessage(msg);
		}

	}

	/**
	 * updateUser is called to persist changes on the selected tab role.
	 */
	public void updateUser() {
		/* save role */
		userToUpdate.setRoles(targetRoles);

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
		// roles = new ArrayList<Role>();

		/* add message to conntext */

		//MessageService.infoMessage(dbResult);
		populateUsersTree();
		goBackToUsersView();

	}

	/**
	 * createUser is call to persist a new user
	 */
	public void createUser() {
		/* save role */

		userToCreate.setRoles(targetRoles);

		String dbResult = userService.insertUser(userToCreate);
		roles = userService.reloadRoles();
		/* add message to conntext */

		//MessageService.infoMessage(dbResult);
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
	public void deleteUser() {
		String dbResult = null;
		if (selectedNode != null && selectedNode.getType().equals("user")) {
			try {
				userToUpdate = (User) selectedNode.getData();
				dbResult = userService.deleteUser(userToUpdate);
				roles = userService.reloadRoles();
				populateUsersTree();
			} catch (Exception e) {
				dbResult = NGConstants.DB_DELETE_FAILED;
			}
			//MessageService.infoMessage(dbResult);
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

	
	/**
	 * Cette methode construit et remplit le Tree des User
	 * Le Tree affiche les Users en trois niveaux hiérarchiques:
	 *  - les Role représentés par des dossier contiennent les ResponsibleEntity 
	 *  - les ResponsibleEntity, eux-même sous forme de dossiers également, contiennent les User
	 *  - enfin les User 
	 */
	public void populateUsersTree() {
		
		/*
		 * Certains User peuvent ne pas avoir de roles
		 * Ces User sont récuperé ci-dessous
		 */
		emptyRoleUsers = userService.loadEmptyRoleUsers();
		
		//Creation de la racine du Tree
		usersTreeRoot = new DefaultTreeNode("Root", null);

		

		// peuplement du Tree
		if (roles != null) {
			
			//parcours de la liste des Role 
			for (Role role : roles) {
				
				//Test si le Role courant contient des User
				if (!role.getUsers().isEmpty()) {
					
					//si le Role courant contient des User, noeud est créé dans le Tree pour ce Role
					TreeNode roleNode = new DefaultTreeNode("role", role, usersTreeRoot);
					
					
					//Initialisation de la liste des ResponsibleEntity à ajouter au Role courant
					List<ResponsibleEntity> responsibleE = new ArrayList<ResponsibleEntity>();
					
					//Parcours des User du Role courant
					int userRE = 0;
					for (User user : role.getUsers()) {
						
						/*Test si le le ResponsibleEntity du User courant est déjà ajouté
						 *  ou non à la liste des ResponsibleEntity
						 */
						userRE = 0;
						for (int i = 0; i < responsibleE.size(); i++) {
							if (user.getResponsibleEntity().getId().equals(responsibleE.get(i).getId())) {
								userRE++;
							}
						}
						
						//Sinon ajout du ResponsibleEntity à la liste
						if (userRE == 0)
							responsibleE.add(user.getResponsibleEntity());

					}
					
					
					/*Parcours de la liste des ResponsibleEntity et création 
					 * de leurs noeuds dans celui du Role courant
					 */
					for (ResponsibleEntity entityR : responsibleE) {
						
						//Creation du noeud du ResponsibleEntity courant
						TreeNode entityNode = new DefaultTreeNode("entityR", entityR, roleNode);

						// Parcours de la liste des User du Role courant
						for (User user : role.getUsers()) {
							
							//Test si le User courant appartient au ResponsibleEntity courant
							if (user.getResponsibleEntity().getId().equals(entityR.getId())) {
								
								//Si créer son noeud dans celui du ResponsibleEntity
								@SuppressWarnings("unused")
								TreeNode userNode = new DefaultTreeNode("user", user, entityNode);
							}
						}
					}
				}
			}
		} else {
			//MessageService.errorMessage("Empty roles !");
		}

		// Créer les noeud des User qui n'ont pas de role directement sur la racine du Tree
		for (User user : emptyRoleUsers) {
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

	public User getUserToCreate() {
		return userToCreate;
	}

	public User getUserToUpdate() {
		return userToUpdate;
	}

	public void setUserToCreate(User userToCreate) {
		this.userToCreate = userToCreate;
	}

	public void setUserToUpdate(User userToUpdate) {
		this.userToUpdate = userToUpdate;
	}

	public NGRoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(NGRoleService roleService) {
		this.roleService = roleService;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
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

	public List<Role> getSourceRoles() {
		return sourceRoles;
	}

	public List<Role> getTargetRoles() {
		return targetRoles;
	}

	public DualListModel<Role> getDualListRoles() {
		return dualListRoles;
	}

	public void setSourceRoles(List<Role> sourceRoles) {
		this.sourceRoles = sourceRoles;
	}

	public void setTargetRoles(List<Role> targetRoles) {
		this.targetRoles = targetRoles;
	}

	public void setDualListRoles(DualListModel<Role> dualListRoles) {
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

	/**
	 * Modifie la valeur du paramètre "resetUserPassword" 
	 * Ce paramètre est utiliser lors de la persistence de l'utilisateur
	 * Si sont test est vrais, le mot de passe de l'utilisateur sera mis à sa valeur 
	 * par defaut "welcome"
	 * @param resetUserPassword
	 */
	public void setResetUserPassword(boolean resetUserPassword) {
		this.resetUserPassword = resetUserPassword;
	}

	/**
	 * Recupère la valeur du mot de passe actuel du User
	 * @return String
	 */
	public String getCurrentPasswd() {
		return currentPasswd;
	}

	
	/**
	 * Recupère la valeur du nouveau mot de passe du User
	 * @return String
	 */
	public String getNewPasswd() {
		return newPasswd;
	}

	
	/**
	 * Recupère la valeur de la confirmation du mot de passe du User
	 * @return String
	 */
	public String getConfirmPasswd() {
		return confirmPasswd;
	}

	/**
	 * Modifie la valeur du mot de passe actuel du User
	 * @param currentPasswd
	 */
	public void setCurrentPasswd(String currentPasswd) {
		this.currentPasswd = currentPasswd;
	}

	
	/**
	 * Modifie la valeur du nouveau mot de passe du User
	 * @param newPasswd
	 */
	public void setNewPasswd(String newPasswd) {
		this.newPasswd = newPasswd;
	}

	
	/**
	 * Modifie la valeur de confirmation du mot de passe du User
	 * @param confirmPasswd
	 */
	public void setConfirmPasswd(String confirmPasswd) {
		this.confirmPasswd = confirmPasswd;
	}

	
	/**
	 * Récupère la liste des ResponsibleEntity
	 * Cette liste est fournie par le service responsibleEntityService
	 * @return List<ResponsibleEntity> 
	 */
	public List<ResponsibleEntity> getResponsibleEntities() {
		return responsibleEntityService.getResponsibleEntities();
	}
	
	
	/**
	 * Modifie la liste des ResponsibleEntity 
	 * Cette est liste est gérée par le service responsibleEntityService
	 * @param responsibleEntities
	 */
	public void setResponsibleEntities(List<ResponsibleEntity> responsibleEntities) {
		responsibleEntityService.setResponsibleEntities(responsibleEntities);
	}

	/**
	 * Récupère le service responsibleEntityService
	 * @return ResponsibleEntityService
	 */
	public ResponsibleEntityService2 getResponsibleEntityService() {
		return responsibleEntityService;
	}

	/**
	 * Modifie le service responsibleEntityService
	 * @param responsibleEntityService
	 */
	public void setResponsibleEntityService(ResponsibleEntityService2 responsibleEntityService) {
		this.responsibleEntityService = responsibleEntityService;
	}

	
}
