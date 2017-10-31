package com.bilgeadam.webexam.model.service;

import com.bilgeadam.webexam.model.entity.impl.User;

public interface UserService extends GenericService<User> {
	
		boolean checkUser(User user);
}
