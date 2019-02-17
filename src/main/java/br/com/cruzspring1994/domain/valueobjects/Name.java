package br.com.cruzspring1994.domain.valueobjects;

import br.com.cruzspring1994.domain.shared.Notifiable;
import br.com.cruzspring1994.domain.shared.validations.Validation;

public class Name extends Notifiable {

	private String firstName;
	private String lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		addNotifications(new Validation()
				.hasMinLen(firstName, 3, "Primeiro nome", "O primeiro nome deve conter no mínimo três caracteres")
				.hasMaxLen(firstName, 40, "Primeiro nome", "O primeiro nome deve conter no máximo quarenta caracteres")
				.hasMinLen(lastName, 3, "Ùltimo nome", "O último nome deve conter no mínimo três caracteres")
				.hasMaxLen(lastName, 40, "Ùltimo nome", "O último nome deve conter no máximo quarenta caracteres")
				.validate());
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	

}
