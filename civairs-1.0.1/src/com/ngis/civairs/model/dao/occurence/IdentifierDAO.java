package com.ngis.civairs.model.dao.occurence;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ngis.civairs.model.constants.NGConstants;
import com.ngis.core.model.occurence.Identifier;
import com.ngis.core.model.occurence.Notification;
import com.ngis.core.model.occurence.Occurence;

@Stateless
public class IdentifierDAO {
	
	@PersistenceContext(unitName = "civairs_db_pu")
	private EntityManager em;

	public String insert(Identifier toInsert) {
		// TODO Auto-generated method stub
		if (toInsert != null && toInsert.getId() != null && !toInsert.getId().isEmpty()) {
			if (selectById(toInsert.getId()) == null) {
				try {
					em.persist(toInsert);
					em.getEntityManagerFactory().getCache().evict(Notification.class);
					em.getEntityManagerFactory().getCache().evict(Occurence.class);
				} catch (Exception e) {
					return NGConstants.DB_INSERT_FAILED;
				}

				return NGConstants.DB_INSERT_OK;
			} else {
				return NGConstants.DB_INSERT_EXIST;
			}
		} else {
			return NGConstants.DB_INSERT_FAILED;
		}
	}

	public String update(Identifier toUpdate) {
		// TODO Auto-generated method stub
		if (toUpdate != null && toUpdate.getId() != null && !toUpdate.getId().isEmpty()) {

			try {
				// update role
				em.merge(toUpdate);
				return NGConstants.DB_UPDATE_OK;
			} catch (Exception e) {
				return NGConstants.DB_UPDATE_FAILED;
			}

		} else {
			return NGConstants.DB_UPDATE_FAILED;
		}
	}

	public String delete(Identifier toDelete) {
		// TODO Auto-generated method stub
		if (toDelete != null && toDelete.getId() != null && !toDelete.getId().isEmpty()) {
			try {
				Identifier dbEntity = selectById(toDelete.getId());
				if(dbEntity != null) {
					em.remove(dbEntity);
				}
				toDelete = null;
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

	public List<Identifier> selectAll() {
		// TODO Auto-generated method stub Identifier.findAll
		return em.createNamedQuery("Identifier.findAll").getResultList();
	}

	public Identifier selectById(String iD) {
		// TODO Auto-generated method stub
		try {
			return em.find(Identifier.class, iD);
		} catch (Exception e) {
			return null;
		}
	}

	public List<Identifier> customSelect() {
		// TODO Auto-generated method stub
		return null;
	}

}
