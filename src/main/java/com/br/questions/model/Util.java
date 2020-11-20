package com.br.questions.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Data;
@Data
public class Util implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Column(name="CreatedAt")
	private LocalDate createdAt;
	
	@Column(name="UpdatedAt")	
	private LocalDate updatedAt;
}
