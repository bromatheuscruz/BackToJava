package br.com.cruzspring1994.domain.valueobjects;

public class Email {
	
	private String address;
	
	public Email(String address) {
		this.address = address;
		
		validate();
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public boolean validate() {
		return false;
	}
	
	@Override
	public String toString() {
		return address;
	}
}
