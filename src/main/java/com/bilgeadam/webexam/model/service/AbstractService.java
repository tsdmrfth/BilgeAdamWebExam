package com.bilgeadam.webexam.model.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bilgeadam.webexam.model.entity.GenericEntity;
import com.bilgeadam.webexam.model.dao.GenericDAO;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Transactional
public class AbstractService<E extends GenericEntity> implements GenericService<E> {

	protected final GenericDAO<E> genericDAO;

	public AbstractService(GenericDAO<E> genericDAO) {
		this.genericDAO = genericDAO;
	}

	@Override
	public void save(E entity) {
		genericDAO.save(entity);
	}

	@Override
	public void update(E entity) {
		genericDAO.update(entity);
	}

	@Override
	public void delete(E entity) {
		genericDAO.delete(entity);
	}

	@Override
	public E findById(Integer id) {
		return genericDAO.findById(id);
	}

	@Override
	public List<E> findAll() {
		return genericDAO.findAll();
	}
}
