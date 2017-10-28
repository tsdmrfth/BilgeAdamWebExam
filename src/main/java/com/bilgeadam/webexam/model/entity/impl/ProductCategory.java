package com.bilgeadam.webexam.model.entity.impl;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.bilgeadam.webexam.model.entity.AbstractEntity;

/**
 * @author fatih taşdemir Oct 12, 2017
 */

@Entity
@Table(name = "PRODUCT_CATEGORY", uniqueConstraints = { @UniqueConstraint(columnNames = { "NAME" }) })
public class ProductCategory extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private String name;
	private List<Product> productsList;

	@Column(name = "NAME", length = 50, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "productCategory")
	public List<Product> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<Product> productsList) {
		this.productsList = productsList;
	}
}
