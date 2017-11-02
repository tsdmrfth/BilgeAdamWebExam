package com.bilgeadam.webexam.model.entity.impl;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

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
	private String productCategory;
	private Integer producedYear;
	private Integer availableStock;
	private ProductDetail productDetail;
	private MultipartFile productImage;
	private String productImageUrl;
	private Integer unitsInOrder;

	@NotNull(message = "{product.name.notNull}")
	@Size(min = 2, max = 50, message = "{product.name.size.error}")
	@Column(name = "NAME", length = 100, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotNull(message = "{product.brand.notNull}")
	@Size(min = 2, max = 50, message = "{product.brand.size.error}")
	@Column(name = "BRAND", length = 100, nullable = false)
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@NotNull(message = "{product.model.notNull}")
	@Size(min = 2, max = 50, message = "{product.model.size.error}")
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

	@NotNull(message = "{product.price.notNull}")
	@Column(name = "PRICE", nullable = false)
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@NotNull(message = "{product.category.notNull}")
	@Column(name = "PRODUCT_CATEGORY", nullable = false)
	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	@Past(message = "{product.producedYear.error}")
	@Column(name = "PRODUCED_YEAR", nullable = false)
	public Integer getProducedYear() {
		return producedYear;
	}

	public void setProducedYear(Integer producedYear) {
		this.producedYear = producedYear;
	}

	@Min(value = 0, message = "{product.availableStock.error}")
	@NotNull(message = "{product.availableStock.notNull}")
	@Column(name = "AVAILABLE_STOCK")
	public Integer getAvailableStock() {
		return availableStock;
	}

	public void setAvailableStock(Integer availableStock) {
		this.availableStock = availableStock;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	public ProductDetail getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}
	
	public MultipartFile getProductImage() {
		return productImage;
	}
	
	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}

	@Column(name = "IMAGE_URL", length = 255, nullable = false)
	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}
	
	public Integer getUnitsInOrder() {
		return unitsInOrder;
	}
	
	public void setUnitsInOrder(Integer unitsInOrder) {
		this.unitsInOrder = unitsInOrder;
	}
}
