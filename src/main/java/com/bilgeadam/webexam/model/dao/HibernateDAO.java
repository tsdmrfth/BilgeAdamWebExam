package com.bilgeadam.webexam.model.dao;

import java.lang.reflect.ParameterizedType;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.bilgeadam.webexam.model.entity.GenericEntity;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

public abstract class HibernateDAO<E extends GenericEntity> implements GenericDAO<E> {

	@Autowired
	private SessionFactory sessionFactory;

	private Class<E> entityClass;

	@SuppressWarnings("unchecked")
	public HibernateDAO() {
		this.entityClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	@Override
	public void save(E entity) {
		entity.setDeleted(false);
		entity.setCreatedDate(new Date());
		entity.setUpdatedDate(new Date());
		sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public void update(E entity) {
		entity.setUpdatedDate(new Date());
		sessionFactory.getCurrentSession().update(entity);
	}

	@Override
	public void delete(E entity) throws Exception {
		E e = findById(entity.getId());
		e.setDeleted(true);
		update(e);
	}

	@SuppressWarnings("unchecked")
	@Override
	public E findById(Integer id) throws Exception {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(entityClass);
		criteria.add(Restrictions.eq("id", id));
		criteria.add(Restrictions.eq("deleted", false));
		return (E) criteria.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> findAll() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(entityClass);
		criteria.add(Restrictions.eq("deleted", false));
		return criteria.list();
	}

}
