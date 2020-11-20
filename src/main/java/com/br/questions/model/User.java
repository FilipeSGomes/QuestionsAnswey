package com.br.questions.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

import lombok.Data;
@Entity
@Data 
public class User extends Util {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Name")
	@NotNull
	private String name;
	
	@Column(name="Email")
	@NotNull
	private String email;
	
	@Column(name="Birthdate")
	@NotNull
	private LocalDate birthdate;

	@Column(name="Enable")
	private boolean enable;

	  @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	    private List<ReputationUser> reputation;
	  

	
	
}
