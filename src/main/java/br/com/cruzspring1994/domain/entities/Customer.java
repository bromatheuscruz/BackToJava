package br.com.cruzspring1994.domain.entities;

import br.com.cruzspring1994.domain.enums.PersonType;
import br.com.cruzspring1994.domain.shared.Notifiable;
import br.com.cruzspring1994.domain.valueobjects.Document;
import br.com.cruzspring1994.domain.valueobjects.Email;
import br.com.cruzspring1994.domain.valueobjects.Name;

public class Customer extends Notifiable {
	
	public Customer(Name name, Email email, Document document, PersonType type) {
		this.name = name;
		this.email = email;
		this.document = document;
		this.type = type;
	}
	
	
	private Name name;
	private Email email;
	private Document document;
	private PersonType type;
	
	public Name getName() {
		return name;
	}
	
	public Email getEmail() {
		return email;
	}
	
	public Document getDocument() {
		return document;
	}
	
	public PersonType getPersonType() {
		return type;
	}
	
}
