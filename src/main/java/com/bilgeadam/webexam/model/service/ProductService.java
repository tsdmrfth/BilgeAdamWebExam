package com.bilgeadam.webexam.model.service;

import com.bilgeadam.webexam.model.entity.impl.Product;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

public interface ProductService extends GenericService<Product> {

	String getProductBarcode(Product product);
}
