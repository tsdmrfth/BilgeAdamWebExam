package com.bilgeadam.webexam.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilgeadam.webexam.model.entity.impl.User;
import com.bilgeadam.webexam.model.service.AbstractService;
import com.bilgeadam.webexam.model.service.UserService;
import com.bilgeadam.webexam.model.dao.UserDAO;

@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {

	@Autowired
	public UserServiceImpl(UserDAO genericDAO) {
		super(genericDAO);
	}
	
}
