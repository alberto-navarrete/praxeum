package com.ironpapalords.jorder.ank.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3196900215455514296L;

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;
	
	@ColumnTransformer(forColumn = "email", 
			read = "CONVERT(NVARCHAR, DecryptByPassPhrase(N'password',email))", 
			write = "EncryptByPassPhrase(N'password',?)")
	@Column(name = "email", columnDefinition = "varbinary", length = 255)
	private String email;
	
	@ColumnTransformer(forColumn = "access_key", 
			read = "CONVERT(NVARCHAR, DecryptByPassPhrase(N'password',access_key))", 
			write = "EncryptByPassPhrase(N'password',?)")
	@Column(name = "access_key", columnDefinition = "varbinary", length = 255)
	private String accessKey;

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", email=" + email + ", accessKey=" + accessKey + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}
	
	

}