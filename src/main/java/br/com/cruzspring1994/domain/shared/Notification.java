package br.com.cruzspring1994.domain.shared;

public final class Notification {
	
	public Notification(String property, String message) {
		this.property = property;
		this.message = message;
	}
	
	private String property;
	private String message;
	
	public String getProperty() {
		return property;
	}
	
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return property + " " + message;
	}
}
