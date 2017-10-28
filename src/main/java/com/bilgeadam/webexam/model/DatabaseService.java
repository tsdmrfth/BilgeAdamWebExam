package com.bilgeadam.webexam.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bilgeadam.webexam.model.service.UserService;

@Component
public class DatabaseService {

	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}
}
