package com.bilgeadam.webexam.model.service;

import java.util.List;

import com.bilgeadam.webexam.model.entity.GenericEntity;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

public interface GenericService<E extends GenericEntity> {

	public abstract void save(E entity);

	public abstract void update(E entity);

	public abstract void delete(E entity) throws Exception;

	public abstract E findById(Integer id) throws Exception;

	public abstract List<E> findAll();

}
