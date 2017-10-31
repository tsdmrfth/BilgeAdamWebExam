package com.bilgeadam.webexam.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bilgeadam.webexam.model.dao.HibernateDAO;
import com.bilgeadam.webexam.model.dao.UserDAO;
import com.bilgeadam.webexam.model.entity.impl.User;

@Repository
public class UserDAOImpl extends HibernateDAO<User> implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean checkUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("username", user.getUsername()));
		criteria.add(Restrictions.eq("password", user.getPassword()));
		if (criteria.uniqueResult() == null) {
			return false;
		}
		return true;
	}

}
