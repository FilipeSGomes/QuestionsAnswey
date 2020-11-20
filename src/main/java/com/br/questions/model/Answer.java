package com.br.questions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.Data;

@Entity(name="Answer")
@Data
public class Answer extends Util{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;


	@JoinColumn(name = "id")
	private User idUser;

	@Column(name="Id_Question")
	private Question idQuestion;
	
	@Column(name="Comment")
	private String comment;
	
	
	
}
