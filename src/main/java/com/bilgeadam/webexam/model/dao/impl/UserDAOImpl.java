package com.bilgeadam.webexam.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.bilgeadam.webexam.model.dao.HibernateDAO;
import com.bilgeadam.webexam.model.dao.UserDAO;
import com.bilgeadam.webexam.model.entity.impl.User;

@Repository
public class UserDAOImpl extends HibernateDAO<User> implements UserDAO {
		
}
