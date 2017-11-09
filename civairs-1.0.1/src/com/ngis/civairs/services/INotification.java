package com.ngis.civairs.services;

import java.util.List;

import javax.ejb.Local;

import com.ngis.civairs.entities.Aircraft;
import com.ngis.civairs.entities.Notification;

@Local
public interface INotification {
	
	public void createNotification(Notification notification, List<Aircraft> aircrafts);
	public void updateNotification(Notification notification, List<Aircraft> aircrafts);
	public List<Notification> findAllNotification();

}
