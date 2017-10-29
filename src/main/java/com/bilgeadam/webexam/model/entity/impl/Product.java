package com.bilgeadam.webexam.model.entity.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bilgeadam.webexam.model.entity.AbstractEntity;

/**
 * @author Fatih Taşdemir Oct 28, 2017
 */

@Entity
@Table(name = "PRODUCT")
public class Product extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private String name;
	private String brand;
	private String model;
	private String barcode;
	private double price;
	private ProductCategory productCategory;
	private Integer producedYear;
	private Integer availableStock;
	private ProductDetail productDetail;

	@Column(name = "NAME", length = 100, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "BRAND", length = 100, nullable = false)
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column(name = "MODEL", length = 100, nullable = false)
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "BARCODE", length = 15, nullable = false)
	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	@Column(name = "PRICE", nullable = false)
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@ManyToOne
	@JoinColumn(name = "PRODUCT_CATEGORY", referencedColumnName = "NAME")
	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	@Column(name = "PRODUCED_YEAR", nullable = false)
	public Integer getProducedYear() {
		return producedYear;
	}

	public void setProducedYear(Integer producedYear) {
		this.producedYear = producedYear;
	}

	@Column(name = "AVAILABLE_STOCK")
	public Integer getAvailableStock() {
		return availableStock;
	}

	public void setAvailableStock(Integer availableStock) {
		this.availableStock = availableStock;
	}

	@OneToOne(targetEntity = ProductDetail.class)
	@MapsId
	public ProductDetail getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}

}
