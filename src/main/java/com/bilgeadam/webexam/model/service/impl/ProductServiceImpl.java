package com.bilgeadam.webexam.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilgeadam.webexam.model.dao.ProductDAO;
import com.bilgeadam.webexam.model.entity.impl.Product;
import com.bilgeadam.webexam.model.service.AbstractService;
import com.bilgeadam.webexam.model.service.ProductService;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Service
public class ProductServiceImpl extends AbstractService<Product> implements ProductService {

	@Autowired
	public ProductServiceImpl(ProductDAO productDAO) {
		super(productDAO);
	}

}
