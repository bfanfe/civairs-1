package com.ngis.civairs.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ngis.civairs.model.constants.NGConstants;
import com.ngis.core.model.Permission;
import com.ngis.core.model.Role;
import com.ngis.core.model.User;

@Stateless
public class NGRoleDAO {
	@PersistenceContext( unitName = "civairs_db_pu")
	private EntityManager em;
	
	public String insert(Role entity){
		if(entity != null && entity.getRoleId() != null && !entity.getRoleId().isEmpty()){
			if(findById(entity.getRoleId()) == null) {
				try{
					em.persist(entity);
					em.getEntityManagerFactory().getCache().evict(User.class);
					em.getEntityManagerFactory().getCache().evict(Permission.class);
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
	
	public String update(Role entity){
		if(entity != null && entity.getRoleId() != null && !entity.getRoleId().isEmpty()){
			
			try{
				//update role
				em.merge(entity);
				
				//remove all managed users from persistence context 
				em.getEntityManagerFactory().getCache().evict(User.class);
				em.getEntityManagerFactory().getCache().evict(Permission.class);
			return NGConstants.DB_UPDATE_OK;
			}catch(Exception e){
				e.printStackTrace();
				return NGConstants.DB_UPDATE_FAILED;
			}
			
		}else{
			return NGConstants.DB_UPDATE_FAILED;
		}		
	}
	
	public String remove(Role entity) {
		if (entity != null && entity.getRoleId() != null && !entity.getRoleId().isEmpty()) {
			try {
				Role dbEntity = findById(entity.getRoleId());
				if(dbEntity != null) {
					em.remove(dbEntity);
					em.getEntityManagerFactory().getCache().evict(User.class);
					em.getEntityManagerFactory().getCache().evict(Permission.class);
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
	public List<Role> getList(){
		Query query = em.createQuery("SELECT p FROM Role p");
		return (List<Role>) query.getResultList();
		
	}
		
	public Role findById(String id){
		try{
			return em.find(Role.class, id);
		}catch(Exception e){
			return null;
		}		
	}

}
