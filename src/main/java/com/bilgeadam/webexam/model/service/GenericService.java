package com.bilgeadam.webexam.model.service;

import java.util.List;

import com.bilgeadam.webexam.model.entity.GenericEntity;

public interface GenericService<E extends GenericEntity> {

	public abstract void save(E entity);

	public abstract void update(E entity);

	public abstract void delete(E entity);

	public abstract E findById(Integer id);

	public abstract List<E> findAll();
	
}
