package br.com.cruzspring1994.domain.shared;

import java.util.ArrayList;
import java.util.List;

public abstract class Notifiable {
	
	protected List<Notification> notifications = new ArrayList<Notification>();
	
	public void addNotification(Notification notification) {
		notifications.add(notification);
	}
	
	public void addNotifications(List<Notification> notifications) {
		for (Notification notification : notifications) {
			this.notifications.add(notification);
		}
	}
	
	public boolean isValid() {
		return notifications.isEmpty() ? true : false;
	}
	
	public boolean isInvalid() {
		System.out.println(notifications.isEmpty());
		return notifications.isEmpty() ? false : true;
	}
	
	
	
}
