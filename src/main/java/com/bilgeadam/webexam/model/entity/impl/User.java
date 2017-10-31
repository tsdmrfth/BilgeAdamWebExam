package com.bilgeadam.webexam.model.entity.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bilgeadam.webexam.model.entity.AbstractEntity;

@Entity
@Table(name = "USERS")
public class User extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

	@Column(name = "USERNAME", length = 255, nullable = false)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", length = 255, nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
