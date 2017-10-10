package com.ngis.civairs.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ngis.civairs.model.constants.NGConstants;
import com.ngis.civairs.model.entities.NGPermission;
import com.ngis.civairs.model.entities.NGRole;
import com.ngis.civairs.model.entities.NGUser;

@Stateless
public class NGRoleDAO {
	@PersistenceContext( unitName = "civairs_db_pu")
	private EntityManager em;
	
	public String insert(NGRole entity){
		if(entity != null && entity.getRoleId() != null && !entity.getRoleId().isEmpty()){
			if(findById(entity.getRoleId()) == null) {
				try{
					em.persist(entity);
					em.getEntityManagerFactory().getCache().evict(NGUser.class);
					em.getEntityManagerFactory().getCache().evict(NGPermission.class);
				}catch(Exception e){
					return NGConstants.DB_INSERT_FAILED;
				}
				
				return NGConstants.DB_INSERT_OK;
			}else{
				return NGConstants.DB_INSERT_EXIST;
			}
		}else{
			return NGConstants.DB_INSERT_FAILED;
		}			
	}
	
	public String update(NGRole entity){
		if(entity != null && entity.getRoleId() != null && !entity.getRoleId().isEmpty()){
			
			try{
				//update role
				em.merge(entity);
				
				//remove all managed users from persistence context 
				em.getEntityManagerFactory().getCache().evict(NGUser.class);
				em.getEntityManagerFactory().getCache().evict(NGPermission.class);
			return NGConstants.DB_UPDATE_OK;
			}catch(Exception e){
				e.printStackTrace();
				return NGConstants.DB_UPDATE_FAILED;
			}
			
		}else{
			return NGConstants.DB_UPDATE_FAILED;
		}		
	}
	
	public String remove(NGRole entity) {
		if (entity != null && entity.getRoleId() != null && !entity.getRoleId().isEmpty()) {
			try {
				NGRole dbEntity = findById(entity.getRoleId());
				if(dbEntity != null) {
					em.remove(dbEntity);
					em.getEntityManagerFactory().getCache().evict(NGUser.class);
					em.getEntityManagerFactory().getCache().evict(NGPermission.class);
				}
				entity = null;
				return NGConstants.DB_DELETE_OK;
			} catch (Exception e) {
				e.printStackTrace();
				return NGConstants.DB_DELETE_FAILED;
			}
		} else {
			return NGConstants.DB_DELETE_FAILED;
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<NGRole> getList(){
		Query query = em.createQuery("SELECT p FROM NGRole p");
		return (List<NGRole>) query.getResultList();
		
	}
		
	public NGRole findById(String id){
		try{
			return em.find(NGRole.class, id);
		}catch(Exception e){
			return null;
		}		
	}

}
