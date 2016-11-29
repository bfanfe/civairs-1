package com.ngis.civairs.model.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

public class NGViewService implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String VIEW_MAIN="/app/main.xhtml";
	public static final String VIEW_LOGIN="/login.xhtml";
	public static final String VIEW_LOGOUT="/logout.xhtml";
	public static final String MENU_TAB_MENU = "/WEB-INF/layout/menus/tab-menu.xhtml";
	public static final String MENU_MAIN_MENU = "/WEB-INF/layout/menus/main-menu.xhtml";
	public static final String MENU_SUB_MENUS = "/WEB-INF/layout/menus/sub-menus.xhtml";
	
	public static final String DEFAULT_TEMPLATE = "/WEB-INF/layout/template.xhtml";
	public static final String SESSION_TIMEOUT = "/WEB-INF/layout/session-timeout.xhtml";
	
	/*
	 * Define the view to include into main content
	 */
	
	/* Parametres views */
	public static final String VIEW_PARAMETRE = "/app/admin/parametres/parametres.xhtml";
	public static final String VIEW_PARAMETRE_UPDATE = "/app/admin/parametres/parametre-update.xhtml";
	
	public static final String VIEW_PERSONNEL_SLI = "/app/staff-sli/personnel-sli.xhtml";
	public static final String VIEW_PERSONNEL_SLI_UPDATE = "/app/staff-sli/personnel-sli-update.xhtml";
	public static final String VIEW_PERSONNEL_SLI_CREATE = "/app/staff-sli/personnel-sli-create.xhtml";
	
	/* details personnel sli*/
	public static final String VIEW_PERSONNEL_SLI_DETAILS_FORMATION = "/app/staff-sli/personnel-sli-details/details-formation-sli.xhtml";
	public static final String VIEW_PERSONNEL_SLI_DETAILS_PERMIS= "/app/staff-sli/personnel-sli-details/details-permis-sli.xhtml";
	public static final String VIEW_PERSONNEL_SLI_DETAILS_PORT_ARI = "/app/staff-sli/personnel-sli-details/details-port-ari-sli.xhtml";
	public static final String VIEW_PERSONNEL_SLI_DETAILS_QUALIFICATION = "/app/staff-sli/personnel-sli-details/details-qualification-sli.xhtml";
	public static final String VIEW_PERSONNEL_SLI_DETAILS_RETRAITE = "/app/staff-sli/personnel-sli-details/details-retraite-sli.xhtml";
	public static final String VIEW_PERSONNEL_SLI_DETAILS_SIGYCOP = "/app/staff-sli/personnel-sli-details/details-sigycop-sli.xhtml";
	public static final String VIEW_PERSONNEL_SLI_DETAILS_STAGE = "/app/staff-sli/personnel-sli-details/details-stage-sli.xhtml";
	
	/* Details update personnel sli*/
	public static final String VIEW_PERSONNEL_SLI_UPDATE_DETAILS_FORMATION = "/app/staff-sli/personnel-sli-details/update/details-formation-update.xhtml";
	public static final String VIEW_PERSONNEL_SLI_UPDATE_DETAILS_PERMIS= "/app/staff-sli/personnel-sli-details/update/details-permis-update.xhtml";
	public static final String VIEW_PERSONNEL_SLI_UPDATE_DETAILS_PORT_ARI = "/app/staff-sli/personnel-sli-details/update/details-port-ari-update.xhtml";
	public static final String VIEW_PERSONNEL_SLI_UPDATE_DETAILS_QUALIFICATION = "/app/staff-sli/personnel-sli-details/update/details-qualification-update.xhtml";
	public static final String VIEW_PERSONNEL_SLI_UPDATE_DETAILS_SIGYCOP = "/app/staff-sli/personnel-sli-details/update/details-sigycop-update.xhtml";
	public static final String VIEW_PERSONNEL_SLI_UPDATE_DETAILS_STAGE = "/app/staff-sli/personnel-sli-details/update/details-stage-update.xhtml";
	
	/* Details create personnel sli*/
	public static final String VIEW_PERSONNEL_SLI_CREATE_DETAILS_FORMATION = "/app/staff-sli/personnel-sli-details/create/details-formation-create.xhtml";
	public static final String VIEW_PERSONNEL_SLI_CREATE_DETAILS_PERMIS= "/app/staff-sli/personnel-sli-details/create/details-permis-create.xhtml";
	public static final String VIEW_PERSONNEL_SLI_CREATE_DETAILS_PORT_ARI = "/app/staff-sli/personnel-sli-details/create/details-port-ari-create.xhtml";
	public static final String VIEW_PERSONNEL_SLI_CREATE_DETAILS_QUALIFICATION = "/app/staff-sli/personnel-sli-details/create/details-qualification-create.xhtml";
	public static final String VIEW_PERSONNEL_SLI_CREATE_DETAILS_SIGYCOP = "/app/staff-sli/personnel-sli-details/create/details-sigycop-create.xhtml";
	public static final String VIEW_PERSONNEL_SLI_CREATE_DETAILS_STAGE = "/app/staff-sli/personnel-sli-details/create/details-stage-create.xhtml";
	
	/* Update details personnel sli*/
	public static final String VIEW_PERSONNEL_SLI_UPDATE_FORMATION = "/app/staff-sli/personnel-sli-details/update/update-formation.xhtml";
	public static final String VIEW_PERSONNEL_SLI_UPDATE_PERMIS= "/app/staff-sli/personnel-sli-details/update/update-permis.xhtml";
	public static final String VIEW_PERSONNEL_SLI_UPDATE_PORT_ARI = "/app/staff-sli/personnel-sli-details/update/update-port-ari.xhtml";
	public static final String VIEW_PERSONNEL_SLI_UPDATE_QUALIFICATION = "/app/staff-sli/personnel-sli-details/update/update-qualification.xhtml";
	public static final String VIEW_PERSONNEL_SLI_UPDATE_SIGYCOP = "/app/staff-sli/personnel-sli-details/update/update-sigycop.xhtml";
	public static final String VIEW_PERSONNEL_SLI_UPDATE_STAGE = "/app/staff-sli/personnel-sli-details/update/update-stage.xhtml";
	
	/* Create details personnel sli*/
	public static final String VIEW_PERSONNEL_SLI_CREATE_FORMATION = "/app/staff-sli/personnel-sli-details/create/update-formation.xhtml";
	public static final String VIEW_PERSONNEL_SLI_CREATE_PERMIS= "/app/staff-sli/personnel-sli-details/create/update-permis.xhtml";
	public static final String VIEW_PERSONNEL_SLI_CREATE_PORT_ARI = "/app/staff-sli/personnel-sli-details/create/update-port-ari.xhtml";
	public static final String VIEW_PERSONNEL_SLI_CREATE_QUALIFICATION = "/app/staff-sli/personnel-sli-details/create/update-qualification.xhtml";
	public static final String VIEW_PERSONNEL_SLI_CREATE_SIGYCOP = "/app/staff-sli/personnel-sli-details/create/update-sigycop.xhtml";
	public static final String VIEW_PERSONNEL_SLI_CREATE_STAGE = "/app/staff-sli/personnel-sli-details/create/update-stage.xhtml";
	
	
	
	/* Add update details personnel sli*/
	public static final String VIEW_PERSONNEL_SLI_ADD_FORMATION = "/app/staff-sli/personnel-sli-details/update/add-formation.xhtml";
	public static final String VIEW_PERSONNEL_SLI_ADD_QUALIFICATION = "/app/staff-sli/personnel-sli-details/update/add-qualification.xhtml";
	public static final String VIEW_PERSONNEL_SLI_ADD_STAGE = "/app/staff-sli/personnel-sli-details/update/add-stage.xhtml";
	public static final String VIEW_PERSONNEL_SLI_ADD_PERMIS = "/app/staff-sli/personnel-sli-details/update/add-permis.xhtml";
	public static final String VIEW_PERSONNEL_SLI_ADD_SIGYCOP = "/app/staff-sli/personnel-sli-details/update/add-sigycop.xhtml";
	public static final String VIEW_PERSONNEL_SLI_ADD_PORT_ARI = "/app/staff-sli/personnel-sli-details/update/add-port-ari.xhtml";
	
	/* Add create details personnel sli*/
	public static final String VIEW_PERSONNEL_SLI_ADD_CREATE_FORMATION = "/app/staff-sli/personnel-sli-details/create/add-formation.xhtml";
	public static final String VIEW_PERSONNEL_SLI_ADD_CREATE_QUALIFICATION = "/app/staff-sli/personnel-sli-details/create/add-qualification.xhtml";
	public static final String VIEW_PERSONNEL_SLI_ADD_CREATE_STAGE = "/app/staff-sli/personnel-sli-details/create/add-stage.xhtml";
	public static final String VIEW_PERSONNEL_SLI_ADD_CREATE_PERMIS = "/app/staff-sli/personnel-sli-details/create/add-permis.xhtml";
	public static final String VIEW_PERSONNEL_SLI_ADD_CREATE_SIGYCOP = "/app/staff-sli/personnel-sli-details/create/add-sigycop.xhtml";
	public static final String VIEW_PERSONNEL_SLI_ADD_CREATE_PORT_ARI = "/app/staff-sli/personnel-sli-details/create/add-port-ari.xhtml";
	
	public static final String VIEW_FORMATION_SLI = "/app/staff-sli/formation-sli/formation-sli.xhtml";
	public static final String VIEW_FORMATION_SLI_UPDATE = "/app/staff-sli/formation-sli/formation-sli-update.xhtml";
	public static final String VIEW_FORMATION_SLI_CREATE = "/app/staff-sli/formation-sli/formation-sli-create.xhtml";
	
	public static final String VIEW_QUALIFICATION_SLI = "/app/staff-sli/qualification-sli/qualification-sli.xhtml";
	public static final String VIEW_QUALIFICATION_SLI_UPDATE = "/app/staff-sli/qualification-sli/qualification-sli-update.xhtml";
	public static final String VIEW_QUALIFICATION_SLI_CREATE = "/app/staff-sli/qualification-sli/qualification-sli-create.xhtml";
	
	public static final String VIEW_STAGE_SLI = "/app/staff-sli/stage-sli/stage-sli.xhtml";
	public static final String VIEW_STAGE_SLI_UPDATE = "/app/staff-sli/stage-sli/stage-sli-update.xhtml";
	public static final String VIEW_STAGE_SLI_CREATE = "/app/staff-sli/stage-sli/stage-sli-create.xhtml";
	
	public static final String VIEW_PERMIS_SLI = "/app/staff-sli/permis-sli/permis-sli.xhtml";
	public static final String VIEW_PERMIS_SLI_UPDATE = "/app/staff-sli/permis-sli/permis-sli-update.xhtml";
	public static final String VIEW_PERMIS_SLI_CREATE = "/app/staff-sli/permis-sli/permis-sli-create.xhtml";
	
	public static final String VIEW_SIGYCOP_SLI = "/app/staff-sli/sigycop-sli/sigycop-sli.xhtml";
	public static final String VIEW_SIGYCOP_SLI_UPDATE = "/app/staff-sli/sigycop-sli/sigycop-sli-update.xhtml";
	public static final String VIEW_SIGYCOP_SLI_CREATE = "/app/staff-sli/sigycop-sli/sigycop-sli-create.xhtml";
	
	public static final String VIEW_PORT_ARI_SLI = "/app/staff-sli/port-ari-sli/port-ari-sli.xhtml";
	public static final String VIEW_PORT_ARI_SLI_UPDATE = "/app/staff-sli/port-ari-sli/port-ari-sli-update.xhtml";
	public static final String VIEW_PORT_ARI_SLI_CREATE = "/app/staff-sli/port-ari-sli/port-ari-sli-create.xhtml";
	
	/*
	 * ==================== Staff ATC views =============================================================
	 */
	
	public static final String VIEW_PERSONNEL_ATC = "/app/staff-atc/personnel-atc.xhtml";
	public static final String VIEW_PERSONNEL_ATC_UPDATE = "/app/staff-atc/personnel-atc-update.xhtml";
	public static final String VIEW_PERSONNEL_ATC_CREATE = "/app/staff-atc/personnel-atc-create.xhtml";
	
	/* details personnel atc*/
	public static final String VIEW_PERSONNEL_ATC_DETAILS_FORMATION = "/app/staff-atc/personnel-atc-details/details-formation-atc.xhtml";
	public static final String VIEW_PERSONNEL_ATC_DETAILS_ANGLAIS= "/app/staff-atc/personnel-atc-details/details-anglais-atc.xhtml";
	public static final String VIEW_PERSONNEL_ATC_DETAILS_AUTORISATION = "/app/staff-atc/personnel-atc-details/details-autorisation-atc.xhtml";
	public static final String VIEW_PERSONNEL_ATC_DETAILS_QUALIFICATION = "/app/staff-atc/personnel-atc-details/details-qualification-atc.xhtml";
	public static final String VIEW_PERSONNEL_ATC_DETAILS_RETRAITE = "/app/staff-atc/personnel-atc-details/details-retraite-atc.xhtml";
	public static final String VIEW_PERSONNEL_ATC_DETAILS_COMPETENCE = "/app/staff-atc/personnel-atc-details/details-competence-atc.xhtml";
	public static final String VIEW_PERSONNEL_ATC_DETAILS_MEDICALE = "/app/staff-atc/personnel-atc-details/details-medicale-atc.xhtml";
	public static final String VIEW_PERSONNEL_ATC_DETAILS_LICENCE = "/app/staff-atc/personnel-atc-details/details-licence-atc.xhtml";
	
	/* Details update personnel atc*/
	public static final String VIEW_PERSONNEL_ATC_UPDATE_DETAILS_FORMATION = "/app/staff-atc/personnel-atc-details/update/details-formation-update.xhtml";
	public static final String VIEW_PERSONNEL_ATC_UPDATE_DETAILS_ANGLAIS= "/app/staff-atc/personnel-atc-details/update/details-anglais-update.xhtml";
	public static final String VIEW_PERSONNEL_ATC_UPDATE_DETAILS_AUTORISATION = "/app/staff-atc/personnel-atc-details/update/details-autorisation-update.xhtml";
	public static final String VIEW_PERSONNEL_ATC_UPDATE_DETAILS_QUALIFICATION = "/app/staff-atc/personnel-atc-details/update/details-qualification-update.xhtml";
	public static final String VIEW_PERSONNEL_ATC_UPDATE_DETAILS_COMPETENCE = "/app/staff-atc/personnel-atc-details/update/details-competence-update.xhtml";
	public static final String VIEW_PERSONNEL_ATC_UPDATE_DETAILS_MEDICALE = "/app/staff-atc/personnel-atc-details/update/details-medicale-update.xhtml";
	public static final String VIEW_PERSONNEL_ATC_UPDATE_DETAILS_LICENCE = "/app/staff-atc/personnel-atc-details/update/details-licence-update.xhtml";
	
	/* Details create personnel atc*/
	public static final String VIEW_PERSONNEL_ATC_CREATE_DETAILS_FORMATION = "/app/staff-atc/personnel-atc-details/create/details-formation-create.xhtml";
	public static final String VIEW_PERSONNEL_ATC_CREATE_DETAILS_ANGLAIS= "/app/staff-atc/personnel-atc-details/create/details-anglais-create.xhtml";
	public static final String VIEW_PERSONNEL_ATC_CREATE_DETAILS_AUTORISATION = "/app/staff-atc/personnel-atc-details/create/details-autorisation-create.xhtml";
	public static final String VIEW_PERSONNEL_ATC_CREATE_DETAILS_QUALIFICATION = "/app/staff-atc/personnel-atc-details/create/details-qualification-create.xhtml";
	public static final String VIEW_PERSONNEL_ATC_CREATE_DETAILS_COMPETENCE = "/app/staff-atc/personnel-atc-details/create/details-competence-create.xhtml";
	public static final String VIEW_PERSONNEL_ATC_CREATE_DETAILS_MEDICALE = "/app/staff-atc/personnel-atc-details/create/details-medicale-create.xhtml";
	public static final String VIEW_PERSONNEL_ATC_CREATE_DETAILS_LICENCE = "/app/staff-atc/personnel-atc-details/create/details-licence-create.xhtml";
	
	/* Update details personnel atc*/
	public static final String VIEW_PERSONNEL_ATC_UPDATE_FORMATION = "/app/staff-atc/personnel-atc-details/update/update-formation.xhtml";
	public static final String VIEW_PERSONNEL_ATC_UPDATE_ANGLAIS= "/app/staff-atc/personnel-atc-details/update/update-anglais.xhtml";
	public static final String VIEW_PERSONNEL_ATC_UPDATE_AUTORISATION = "/app/staff-atc/personnel-atc-details/update/update-autorisation.xhtml";
	public static final String VIEW_PERSONNEL_ATC_UPDATE_QUALIFICATION = "/app/staff-atc/personnel-atc-details/update/update-qualification.xhtml";
	public static final String VIEW_PERSONNEL_ATC_UPDATE_COMPETENCE = "/app/staff-atc/personnel-atc-details/update/update-competence.xhtml";
	public static final String VIEW_PERSONNEL_ATC_UPDATE_MEDICALE = "/app/staff-atc/personnel-atc-details/update/update-medicale.xhtml";
	public static final String VIEW_PERSONNEL_ATC_UPDATE_LICENCE = "/app/staff-atc/personnel-atc-details/update/update-licence.xhtml";
	
	/* Create details personnel atc*/
	public static final String VIEW_PERSONNEL_ATC_CREATE_FORMATION = "/app/staff-atc/personnel-atc-details/create/update-formation.xhtml";
	public static final String VIEW_PERSONNEL_ATC_CREATE_ANGLAIS= "/app/staff-atc/personnel-atc-details/create/update-anglais.xhtml";
	public static final String VIEW_PERSONNEL_ATC_CREATE_AUTORISATION = "/app/staff-atc/personnel-atc-details/create/update-autorisation.xhtml";
	public static final String VIEW_PERSONNEL_ATC_CREATE_QUALIFICATION = "/app/staff-atc/personnel-atc-details/create/update-qualification.xhtml";
	public static final String VIEW_PERSONNEL_ATC_CREATE_COMPETENCE = "/app/staff-atc/personnel-atc-details/create/update-competence.xhtml";
	public static final String VIEW_PERSONNEL_ATC_CREATE_MEDICALE = "/app/staff-atc/personnel-atc-details/create/update-medicale.xhtml";
	public static final String VIEW_PERSONNEL_ATC_CREATE_LICENCE = "/app/staff-atc/personnel-atc-details/create/update-licence.xhtml";
	
	
	
	/* Add update details personnel atc*/
	public static final String VIEW_PERSONNEL_ATC_ADD_FORMATION = "/app/staff-atc/personnel-atc-details/update/add-formation.xhtml";
	public static final String VIEW_PERSONNEL_ATC_ADD_QUALIFICATION = "/app/staff-atc/personnel-atc-details/update/add-qualification.xhtml";
	public static final String VIEW_PERSONNEL_ATC_ADD_MEDICALE = "/app/staff-atc/personnel-atc-details/update/add-medicale.xhtml";
	public static final String VIEW_PERSONNEL_ATC_ADD_ANGLAIS = "/app/staff-atc/personnel-atc-details/update/add-anglais.xhtml";
	public static final String VIEW_PERSONNEL_ATC_ADD_COMPETENCE = "/app/staff-atc/personnel-atc-details/update/add-competence.xhtml";
	public static final String VIEW_PERSONNEL_ATC_ADD_AUTORISATION = "/app/staff-atc/personnel-atc-details/update/add-autorisation.xhtml";
	public static final String VIEW_PERSONNEL_ATC_ADD_LICENCE = "/app/staff-atc/personnel-atc-details/update/add-licence.xhtml";
	
	/* Add create details personnel atc*/
	public static final String VIEW_PERSONNEL_ATC_ADD_CREATE_FORMATION = "/app/staff-atc/personnel-atc-details/create/add-formation.xhtml";
	public static final String VIEW_PERSONNEL_ATC_ADD_CREATE_QUALIFICATION = "/app/staff-atc/personnel-atc-details/create/add-qualification.xhtml";
	public static final String VIEW_PERSONNEL_ATC_ADD_CREATE_MEDICALE = "/app/staff-atc/personnel-atc-details/create/add-medicale.xhtml";
	public static final String VIEW_PERSONNEL_ATC_ADD_CREATE_ANGLAIS = "/app/staff-atc/personnel-atc-details/create/add-anglais.xhtml";
	public static final String VIEW_PERSONNEL_ATC_ADD_CREATE_COMPETENCE = "/app/staff-atc/personnel-atc-details/create/add-competence.xhtml";
	public static final String VIEW_PERSONNEL_ATC_ADD_CREATE_AUTORISATION = "/app/staff-atc/personnel-atc-details/create/add-autorisation.xhtml";
	public static final String VIEW_PERSONNEL_ATC_ADD_CREATE_LICENCE = "/app/staff-atc/personnel-atc-details/create/add-licence.xhtml";
	
	public static final String VIEW_FORMATION_ATC = "/app/staff-atc/formation-atc/formation-atc.xhtml";
	public static final String VIEW_FORMATION_ATC_UPDATE = "/app/staff-atc/formation-atc/formation-atc-update.xhtml";
	public static final String VIEW_FORMATION_ATC_CREATE = "/app/staff-atc/formation-atc/formation-atc-create.xhtml";
	
	public static final String VIEW_QUALIFICATION_ATC = "/app/staff-atc/qualification-atc/qualification-atc.xhtml";
	public static final String VIEW_QUALIFICATION_ATC_UPDATE = "/app/staff-atc/qualification-atc/qualification-atc-update.xhtml";
	public static final String VIEW_QUALIFICATION_ATC_CREATE = "/app/staff-atc/qualification-atc/qualification-atc-create.xhtml";
	
	public static final String VIEW_ANGLAIS_ATC = "/app/staff-atc/anglais-atc/anglais-atc.xhtml";
	public static final String VIEW_ANGLAIS_ATC_UPDATE = "/app/staff-atc/anglais-atc/anglais-atc-update.xhtml";
	public static final String VIEW_ANGLAIS_ATC_CREATE = "/app/staff-atc/anglais-atc/anglais-atc-create.xhtml";
	
	public static final String VIEW_AUTORISATION_ATC = "/app/staff-atc/autorisation-atc/autorisation-atc.xhtml";
	public static final String VIEW_AUTORISATION_ATC_UPDATE = "/app/staff-atc/autorisation-atc/autorisation-atc-update.xhtml";
	public static final String VIEW_AUTORISATION_ATC_CREATE = "/app/staff-atc/autorisation-atc/autorisation-atc-create.xhtml";
	
	public static final String VIEW_COMPETENCE_ATC = "/app/staff-atc/competence-atc/competence-atc.xhtml";
	public static final String VIEW_COMPETENCE_ATC_UPDATE = "/app/staff-atc/competence-atc/competence-atc-update.xhtml";
	public static final String VIEW_COMPETENCE_ATC_CREATE = "/app/staff-atc/competence-atc/competence-atc-create.xhtml";
	
	public static final String VIEW_MEDICALE_ATC = "/app/staff-atc/medicale-atc/medicale-atc.xhtml";
	public static final String VIEW_MEDICALE_ATC_UPDATE = "/app/staff-atc/medicale-atc/medicale-atc-update.xhtml";
	public static final String VIEW_MEDICALE_ATC_CREATE = "/app/staff-atc/medicale-atc/medicale-atc-create.xhtml";
	
	public static final String VIEW_LICENCE_ATC = "/app/staff-atc/licence-atc/licence-atc.xhtml";
	public static final String VIEW_LICENCE_ATC_UPDATE = "/app/staff-atc/licence-atc/licence-atc-update.xhtml";
	public static final String VIEW_LICENCE_ATC_CREATE = "/app/staff-atc/licence-atc/licence-atc-create.xhtml";
	
	/*
	 * ==================== Vehicule VSLI views =============================================================
	 */
	
	public static final String VIEW_VEHICULE_VSLI = "/app/vehicules-vsli/vehicule-vsli.xhtml";
	public static final String VIEW_VEHICULE_VSLI_UPDATE = "/app/vehicules-vsli/vehicule-vsli-update.xhtml";
	public static final String VIEW_VEHICULE_VSLI_CREATE = "/app/vehicules-vsli/vehicule-vsli-create.xhtml";
	
	/* details vehicule sli*/
	public static final String VIEW_VEHICULE_VSLI_DETAILS_ANOMALIE = "/app/vehicules-vsli/vehicule-vsli-details/details-anomalie-vsli.xhtml";
	public static final String VIEW_VEHICULE_VSLI_DETAILS_VIDANGE= "/app/vehicules-vsli/vehicule-vsli-details/details-vidange-vsli.xhtml";
	public static final String VIEW_VEHICULE_VSLI_DETAILS_ASSURANCE = "/app/vehicules-vsli/vehicule-vsli-details/details-assurance-vsli.xhtml";
	public static final String VIEW_VEHICULE_VSLI_DETAILS_VISITE = "/app/vehicules-vsli/vehicule-vsli-details/details-visite-vsli.xhtml";
	public static final String VIEW_VEHICULE_VSLI_DETAILS_PARAMETRE = "/app/vehicules-vsli/vehicule-vsli-details/details-parametre-vsli.xhtml";
	
	/* Details update vehicule sli*/
	public static final String VIEW_VEHICULE_VSLI_UPDATE_DETAILS_ANOMALIE = "/app/vehicules-vsli/vehicule-vsli-details/update/details-anomalie-update.xhtml";
	public static final String VIEW_VEHICULE_VSLI_UPDATE_DETAILS_VIDANGE= "/app/vehicules-vsli/vehicule-vsli-details/update/details-vidange-update.xhtml";
	public static final String VIEW_VEHICULE_VSLI_UPDATE_DETAILS_ASSURANCE = "/app/vehicules-vsli/vehicule-vsli-details/update/details-assurance-update.xhtml";
	public static final String VIEW_VEHICULE_VSLI_UPDATE_DETAILS_VISITE = "/app/vehicules-vsli/vehicule-vsli-details/update/details-visite-update.xhtml";
	public static final String VIEW_VEHICULE_VSLI_UPDATE_DETAILS_PARAMETRE = "/app/vehicules-vsli/vehicule-vsli-details/update/details-parametre-update.xhtml";
	
	/* Details create vehicule sli*/
	public static final String VIEW_VEHICULE_VSLI_CREATE_DETAILS_ANOMALIE = "/app/vehicules-vsli/vehicule-vsli-details/create/details-anomalie-create.xhtml";
	public static final String VIEW_VEHICULE_VSLI_CREATE_DETAILS_VIDANGE= "/app/vehicules-vsli/vehicule-vsli-details/create/details-vidange-create.xhtml";
	public static final String VIEW_VEHICULE_VSLI_CREATE_DETAILS_ASSURANCE = "/app/vehicules-vsli/vehicule-vsli-details/create/details-assurance-create.xhtml";
	public static final String VIEW_VEHICULE_VSLI_CREATE_DETAILS_VISITE = "/app/vehicules-vsli/vehicule-vsli-details/create/details-visite-create.xhtml";
	public static final String VIEW_VEHICULE_VSLI_CREATE_DETAILS_PARAMETRE = "/app/vehicules-vsli/vehicule-vsli-details/create/details-parametre-create.xhtml";
	
	/* Update details vehicule sli*/
	public static final String VIEW_VEHICULE_VSLI_UPDATE_ANOMALIE = "/app/vehicules-vsli/vehicule-vsli-details/update/update-anomalie.xhtml";
	public static final String VIEW_VEHICULE_VSLI_UPDATE_VIDANGE= "/app/vehicules-vsli/vehicule-vsli-details/update/update-vidange.xhtml";
	public static final String VIEW_VEHICULE_VSLI_UPDATE_ASSURANCE = "/app/vehicules-vsli/vehicule-vsli-details/update/update-assurance.xhtml";
	public static final String VIEW_VEHICULE_VSLI_UPDATE_VISITE = "/app/vehicules-vsli/vehicule-vsli-details/update/update-visite.xhtml";
	public static final String VIEW_VEHICULE_VSLI_UPDATE_PARAMETRE = "/app/vehicules-vsli/vehicule-vsli-details/update/update-parametre.xhtml";
	
	/* Create details vehicule sli*/
	public static final String VIEW_VEHICULE_VSLI_CREATE_ANOMALIE = "/app/vehicules-vsli/vehicule-vsli-details/create/update-anomalie.xhtml";
	public static final String VIEW_VEHICULE_VSLI_CREATE_VIDANGE= "/app/vehicules-vsli/vehicule-vsli-details/create/update-vidange.xhtml";
	public static final String VIEW_VEHICULE_VSLI_CREATE_ASSURANCE = "/app/vehicules-vsli/vehicule-vsli-details/create/update-assurance.xhtml";
	public static final String VIEW_VEHICULE_VSLI_CREATE_VISITE = "/app/vehicules-vsli/vehicule-vsli-details/create/update-visite.xhtml";
	public static final String VIEW_VEHICULE_VSLI_CREATE_PARAMETRE = "/app/vehicules-vsli/vehicule-vsli-details/create/update-parametre.xhtml";
	
	
	
	/* Add update details vehicule sli*/
	public static final String VIEW_VEHICULE_VSLI_ADD_ANOMALIE = "/app/vehicules-vsli/vehicule-vsli-details/update/add-anomalie.xhtml";
	public static final String VIEW_VEHICULE_VSLI_ADD_ASSURANCE = "/app/vehicules-vsli/vehicule-vsli-details/update/add-assurance.xhtml";
	public static final String VIEW_VEHICULE_VSLI_ADD_PARAMETRE = "/app/vehicules-vsli/vehicule-vsli-details/update/add-parametre.xhtml";
	public static final String VIEW_VEHICULE_VSLI_ADD_VIDANGE = "/app/vehicules-vsli/vehicule-vsli-details/update/add-vidange.xhtml";
	public static final String VIEW_VEHICULE_VSLI_ADD_VISITE = "/app/vehicules-vsli/vehicule-vsli-details/update/add-visite.xhtml";
	
	/* Add create details vehicule sli*/
	public static final String VIEW_VEHICULE_VSLI_ADD_CREATE_ANOMALIE = "/app/vehicules-vsli/vehicule-vsli-details/create/add-anomalie.xhtml";
	public static final String VIEW_VEHICULE_VSLI_ADD_CREATE_ASSURANCE = "/app/vehicules-vsli/vehicule-vsli-details/create/add-assurance.xhtml";
	public static final String VIEW_VEHICULE_VSLI_ADD_CREATE_PARAMETRE = "/app/vehicules-vsli/vehicule-vsli-details/create/add-parametre.xhtml";
	public static final String VIEW_VEHICULE_VSLI_ADD_CREATE_VIDANGE = "/app/vehicules-vsli/vehicule-vsli-details/create/add-vidange.xhtml";
	public static final String VIEW_VEHICULE_VSLI_ADD_CREATE_VISITE = "/app/vehicules-vsli/vehicule-vsli-details/create/add-visite.xhtml";
	
	public static final String VIEW_ANOMALIE_VSLI = "/app/vehicules-vsli/anomalie-vsli/anomalie-vsli.xhtml";
	public static final String VIEW_ANOMALIE_VSLI_UPDATE = "/app/vehicules-vsli/anomalie-vsli/anomalie-vsli-update.xhtml";
	public static final String VIEW_ANOMALIE_VSLI_CREATE = "/app/vehicules-vsli/anomalie-vsli/anomalie-vsli-create.xhtml";
	
	public static final String VIEW_ASSURANCE_VSLI = "/app/vehicules-vsli/assurance-vsli/assurance-vsli.xhtml";
	public static final String VIEW_ASSURANCE_VSLI_UPDATE = "/app/vehicules-vsli/assurance-vsli/assurance-vsli-update.xhtml";
	public static final String VIEW_ASSURANCE_VSLI_CREATE = "/app/vehicules-vsli/assurance-vsli/assurance-vsli-create.xhtml";
	
	public static final String VIEW_VIDANGE_VSLI = "/app/vehicules-vsli/vidange-vsli/vidange-vsli.xhtml";
	public static final String VIEW_VIDANGE_VSLI_UPDATE = "/app/vehicules-vsli/vidange-vsli/vidange-vsli-update.xhtml";
	public static final String VIEW_VIDANGE_VSLI_CREATE = "/app/vehicules-vsli/vidange-vsli/vidange-vsli-create.xhtml";
	
	
	public static final String VIEW_VISITE_VSLI = "/app/vehicules-vsli/visite-vsli/visite-vsli.xhtml";
	public static final String VIEW_VISITE_VSLI_UPDATE = "/app/vehicules-vsli/visite-vsli/visite-vsli-update.xhtml";
	public static final String VIEW_VISITE_VSLI_CREATE = "/app/vehicules-vsli/visite-vsli/visite-vsli-create.xhtml";
	
	public static final String VIEW_PARAMETRE_VSLI = "/app/vehicules-vsli/parametre-vsli/parametre-vsli.xhtml";
	public static final String VIEW_PARAMETRE_VSLI_UPDATE = "/app/vehicules-vsli/parametre-vsli/parametre-vsli-update.xhtml";
	public static final String VIEW_PARAMETRE_VSLI_CREATE = "/app/vehicules-vsli/parametre-vsli/parametre-vsli-create.xhtml";
	
	
	/*
	 * ==================== Vehicule PARC views =============================================================
	 */
	
	public static final String VIEW_VEHICULE_PARC = "/app/vehicules-parc/vehicule-parc.xhtml";
	public static final String VIEW_VEHICULE_PARC_UPDATE = "/app/vehicules-parc/vehicule-parc-update.xhtml";
	public static final String VIEW_VEHICULE_PARC_CREATE = "/app/vehicules-parc/vehicule-parc-create.xhtml";
	
	/* details vehicule PARC*/
	public static final String VIEW_VEHICULE_PARC_DETAILS_SOMMIER = "/app/vehicules-parc/vehicule-parc-details/details-sommier-parc.xhtml";
	
	/* Details update vehicule PARC*/
	public static final String VIEW_VEHICULE_PARC_UPDATE_DETAILS_SOMMIER = "/app/vehicules-parc/vehicule-parc-details/update/details-sommier-update.xhtml";

	/* Details create vehicule PARC*/
	public static final String VIEW_VEHICULE_PARC_CREATE_DETAILS_SOMMIER = "/app/vehicules-parc/vehicule-parc-details/create/details-sommier-create.xhtml";
	
	/* Update details vehicule PARC*/
	public static final String VIEW_VEHICULE_PARC_UPDATE_SOMMIER = "/app/vehicules-parc/vehicule-parc-details/update/update-sommier.xhtml";
	
	/* Create details vehicule PARC*/
	public static final String VIEW_VEHICULE_PARC_CREATE_SOMMIER = "/app/vehicules-parc/vehicule-parc-details/create/update-sommier.xhtml";
	
	
	/* Add update details vehicule PARC*/
	public static final String VIEW_VEHICULE_PARC_ADD_SOMMIER = "/app/vehicules-parc/vehicule-parc-details/update/add-sommier.xhtml";
	
	/* Add create details vehicule PARC*/
	public static final String VIEW_VEHICULE_PARC_ADD_CREATE_SOMMIER = "/app/vehicules-parc/vehicule-parc-details/create/add-sommier.xhtml";
	
	public static final String VIEW_SOMMIER_PARC = "/app/vehicules-parc/sommier-parc/sommier-parc.xhtml";
	public static final String VIEW_SOMMIER_PARC_UPDATE = "/app/vehicules-parc/sommier-parc/sommier-parc-update.xhtml";
	public static final String VIEW_SOMMIER_PARC_CREATE = "/app/vehicules-parc/sommier-parc/sommier-parc-create.xhtml";
	
		
	public static final String VIEW_PERMIS_CONDUIRE = "/app/sli/permis-conduire.xhtml";
	public static final String VIEW_SIGYCOP = "/app/sli/aptitude-cigycop.xhtml";
	
	//users views
	public static final String VIEW_USERS = "/app/admin/users/users.xhtml";
	public static final String VIEW_USER_UPDATE = "/app/admin/users/user-update-view.xhtml";
	public static final String VIEW_USER_CREATE = "/app/admin/users/user-create-view.xhtml";
	public static final String VIEW_CHANGE_PASSWD = "/app/admin/users/user-change-password.xhtml";
	
	//roles view
	
	public static final String VIEW_RESPONSIBLE_ENTITIES = "/app/admin/users/responsible-entities.xhtml";	
	
	public static final String VIEW_RESPONSIBLE_ENTITY_CREATE = "/app/admin/users/responsible-entity-create-view.xhtml";
	public static final String VIEW_RESPONSIBLE_ENTITY_UPDATE = "/app/admin/users/responsible-entity-update-view.xhtml";
	public static final String VIEW_ROLES = "/app/admin/users/roles.xhtml";
	public static final String VIEW_ROLE_UPDATE = "/app/admin/users/role-update-view.xhtml";
	public static final String VIEW_ROLE_CREATE = "/app/admin/users/role-create-view.xhtml";
	/*
	 * Define de menu labels
	 */
	public static final String LABEL_PERSONNEL_SLI = "Personnel SLI";
	public static final String LABEL_PERMIS_CONDUIRE = "Permis de conduire";
	public static final String LABEL_SIGYCOP = "Aptitude CIGYCOP";
	
		
	public static String getDefaultView(){
		List<String> userPermitedViews = new ArrayList<String>();
		Subject currentUser = SecurityUtils.getSubject();
		if(currentUser.isPermitted("role")) userPermitedViews.add(VIEW_ROLES);
		if(currentUser.isPermitted("user")) userPermitedViews.add(VIEW_USERS);
		if(currentUser.isPermitted("personnel-sli")) userPermitedViews.add(VIEW_PERSONNEL_SLI);
		if(userPermitedViews != null && !userPermitedViews.isEmpty()){
			return userPermitedViews.get(0);
		}else{
			return VIEW_MAIN;
		}
	}
	
	}
