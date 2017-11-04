package com.bilgeadam.webexam.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.bilgeadam.webexam.model.dao.HibernateDAO;
import com.bilgeadam.webexam.model.dao.ProductDAO;
import com.bilgeadam.webexam.model.entity.impl.Product;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Repository
public class ProductDAOImpl extends HibernateDAO<Product> implements ProductDAO {

	@Override
	public void save(Product product) {
		String shortedBrand = null;
		String shortedModel = null;
		if (product.getBrand().length() < 5) {
			shortedBrand = shortedBrand + "";
		} else {
			shortedBrand = product.getBrand().substring(0, 3);
		}

		if (product.getModel().length() < 5) {
			shortedModel = shortedModel + "";
		} else {
			shortedModel = product.getModel().substring(0, 3);
		}

		String shortedYear = String.valueOf(product.getProducedYear()).substring(1, 3);
		String ram = String.valueOf(product.getProductDetail().getRam());
		String barcode = (shortedBrand + ram + shortedModel + shortedYear).toUpperCase();
		product.setBarcode(barcode);
		super.save(product);
	}
}
