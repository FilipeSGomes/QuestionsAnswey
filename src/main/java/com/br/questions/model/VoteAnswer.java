package com.br.questions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.Data;

@Entity(name="Vote_Answer")
@Data
public class VoteAnswer extends Util{

	private static final long serialVersionUID = 1l;
	@Id
	private Long id;
	
	@JoinColumn(name="Id_Question")
	private Question idQuestion;
	
	@JoinColumn(name="Id_Answer")
	private Answer idAnswer;
	
	@JoinColumn(name="Id_User")
	private User idUser;
	
	@Column(name="Score")
	private int score;

	
	
	
}
