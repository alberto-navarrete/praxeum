package com.ironpapalords.jorder.ank.app.models.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@NotEmpty
	private String email;

	@NotEmpty
	@Size(max = 128)
	private String password;

}