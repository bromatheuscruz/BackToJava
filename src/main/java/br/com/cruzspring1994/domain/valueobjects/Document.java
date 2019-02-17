package br.com.cruzspring1994.domain.valueobjects;

import br.com.cruzspring1994.domain.shared.Notifiable;

public class Document extends Notifiable {
	
	public Document(String document) {
		this.document = document;
		
		validateCpf(document);
		validateCnpj(document);
	}
	
	private String document;
	
	private void validateCpf(String document) {
		
	}
	
	private void validateCnpj(String document) {
		
	}
	
	public String getDocument() {
		return document;
	}
	
	
	
}
