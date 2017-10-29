package com.bilgeadam.webexam.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilgeadam.webexam.model.dao.ProductCategoryDAO;
import com.bilgeadam.webexam.model.entity.impl.ProductCategory;
import com.bilgeadam.webexam.model.service.AbstractService;
import com.bilgeadam.webexam.model.service.ProductCategoryService;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Service
public class ProductCategoryServiceImpl extends AbstractService<ProductCategory> implements ProductCategoryService {

	@Autowired
	public ProductCategoryServiceImpl(ProductCategoryDAO productCategoryDAO) {
		super(productCategoryDAO);
	}

}
