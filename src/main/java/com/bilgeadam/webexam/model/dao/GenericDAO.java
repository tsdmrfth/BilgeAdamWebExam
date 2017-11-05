package com.bilgeadam.webexam.model.dao;

import java.util.List;

import com.bilgeadam.webexam.model.entity.GenericEntity;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

public interface GenericDAO<E extends GenericEntity> {

	void save(E entity);

	void update(E entity);

	void delete(E entity);

	E findById(Integer id);

	List<E> findAll();

}
