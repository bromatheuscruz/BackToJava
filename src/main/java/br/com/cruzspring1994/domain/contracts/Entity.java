package br.com.cruzspring1994.domain.contracts;

import java.util.UUID;

import br.com.cruzspring1994.domain.shared.Notifiable;

public abstract class Entity extends Notifiable {
	
	public Entity() {
		this.id = UUID.randomUUID();
	}
	
	private UUID id;
	
	public UUID getId() {
		return id;
	}
}
