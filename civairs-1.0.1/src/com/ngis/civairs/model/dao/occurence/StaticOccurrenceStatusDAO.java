package com.ngis.civairs.model.dao.occurence;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ngis.civairs.model.constants.NGConstants;
import com.ngis.core.model.occurence.StaticOccurrenceStatus;

@Stateless
public class StaticOccurrenceStatusDAO {
	
	@PersistenceContext(unitName = "civairs_db_pu")
	private EntityManager em;

	public String insert(StaticOccurrenceStatus toInsert) {
		// TODO Auto-generated method stub
		if (toInsert != null && toInsert.getValueID() != null && !toInsert.getValueID().isEmpty()) {
			if (selectByValueID(toInsert.getValueID()) == null) {
				try {
					em.persist(toInsert);
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

	public String update(StaticOccurrenceStatus toUpdate) {
		// TODO Auto-generated method stub
		if (toUpdate != null && toUpdate.getValueID() != null && !toUpdate.getValueID().isEmpty()) {

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

	public String delete(StaticOccurrenceStatus toDelete) {
		// TODO Auto-generated method stub
		if (toDelete != null && toDelete.getValueID() != null && !toDelete.getValueID().isEmpty()) {
			try {
				StaticOccurrenceStatus dbEntity = selectByValueID(toDelete.getValueID());
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

	public List<StaticOccurrenceStatus> selectAll() {
		// TODO Auto-generated method stub Notification.findAll
		return em.createNamedQuery("StaticOccurrenceStatus.findAll").getResultList();
	}
	
	/*
	@SuppressWarnings("unchecked")
	public List<StaticManufacturerModel> selectAllByEntity(String status, String entityValueID) {
		// TODO Auto-generated method stub Notification.findAll
		return em.createNamedQuery("Notification.findAllByEntity").setParameter("status", status).setParameter("entityValueID", entityValueID).getResultList();
	}*/

	public StaticOccurrenceStatus selectByValueID(String iD) {
		// TODO Auto-generated method stub
		try {
			return em.find(StaticOccurrenceStatus.class, iD);
		} catch (Exception e) {
			return null;
		}
	}

	public List<StaticOccurrenceStatus> customSelect() {
		// TODO Auto-generated method stub
		return null;
	}

}
