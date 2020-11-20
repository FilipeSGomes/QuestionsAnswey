package com.br.questions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Flags extends Util {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int id; 
	
	@Column(name="Description")
	private String description; 
	
	@Column(name="Enabled")
	private boolean enabled; 
	
	

}
