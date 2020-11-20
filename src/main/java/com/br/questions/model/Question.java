package com.br.questions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="Question")
@Data
public class Question extends Util{

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	@Column(name="Id_User")
	private User idUser;

	@Column(name="Id_Flag")
	private Flags idFlag;
	
	@Column(name="Comment")
	private String comment;
	
	@Column(name="Resolved")
	private boolean resolved;
	

}
