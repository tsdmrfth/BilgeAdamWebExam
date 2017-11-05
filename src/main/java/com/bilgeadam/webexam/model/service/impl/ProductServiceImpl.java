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
	ProductDAO productDAO;
	
	public ProductServiceImpl(ProductDAO productDAO) {
		super(productDAO);
		this.productDAO = productDAO;
	}

	@Override
	public String getProductBarcode(Product product) {
		return productDAO.getProductBarcode(product);
	}

}
