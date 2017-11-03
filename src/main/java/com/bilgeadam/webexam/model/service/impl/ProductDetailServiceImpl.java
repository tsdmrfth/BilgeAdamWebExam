package com.bilgeadam.webexam.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilgeadam.webexam.model.dao.ProductDetailDAO;
import com.bilgeadam.webexam.model.entity.impl.ProductDetail;
import com.bilgeadam.webexam.model.service.AbstractService;
import com.bilgeadam.webexam.model.service.ProductDetailService;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Service
public class ProductDetailServiceImpl extends AbstractService<ProductDetail> implements ProductDetailService {

	@Autowired
	public ProductDetailServiceImpl(ProductDetailDAO productDetailDAO) {
		super(productDetailDAO);
	}

}
