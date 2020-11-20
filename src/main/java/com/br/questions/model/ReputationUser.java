package com.br.questions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Entity
@Data
public class ReputationUser extends Util{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="user_id")
	private User user;

	@Column(name="Score")
	private int score;

	
	
}
