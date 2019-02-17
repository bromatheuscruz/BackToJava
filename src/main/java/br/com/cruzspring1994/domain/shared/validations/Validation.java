package br.com.cruzspring1994.domain.shared.validations;

import java.util.ArrayList;
import java.util.List;

import br.com.cruzspring1994.domain.shared.Notification;

public class Validation {

	private List<Notification> notifications = new ArrayList<Notification>();

	public Validation hasMinLen(String value, int min, String property, String message) {
		if (value.length() < min)
			notifications.add(new Notification(property, message));
		return this;
	}

	public Validation hasMaxLen(String value, int max, String property, String message) {
		if (value.length() > max)
			notifications.add(new Notification(property, message));
		return this;
	}

	public Validation isRequired(Object value, String property, String message) {
		if (value == null)
			notifications.add(new Notification(property, message));
		return this;
	}

	public List<Notification> validate() {
		return notifications;
	}

}
