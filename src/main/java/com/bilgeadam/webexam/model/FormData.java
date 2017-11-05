package com.bilgeadam.webexam.model;

import com.bilgeadam.webexam.model.entity.impl.Product;
import com.bilgeadam.webexam.model.entity.impl.ProductDetail;

/*
 * This class is for combining two Spring <form>
 * one of them performs to addition Product and the other
 * to add the ProductDetail.
 * 
 * @author Fatih Taşdemir Nov 4, 2017
 */

public class FormData {

	private Product product;
	private ProductDetail productDetail;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductDetail getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}

}
