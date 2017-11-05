package com.bilgeadam.webexam.model.entity.impl;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import com.bilgeadam.webexam.model.entity.AbstractEntity;

/**
 * @author fatih taşdemir Oct 12, 2017
 */

@Entity
@Table(name = "PRODUCT_DETAILS")
public class ProductDetail extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private Integer batteryPower;
	private double processor;
	private double weight;
	private String color;
	private Integer storage;
	private String resolution;
	private Integer display;
	private Integer ram;
	private MultipartFile productImage;
	private String productImageUrl;

	@NotNull(message = "{productDetail.batteryPower.notNull}")
	@Column(name = "BATTERY_POWER")
	public Integer getBatteryPower() {
		return batteryPower;
	}

	public void setBatteryPower(Integer batteryPower) {
		this.batteryPower = batteryPower;
	}

	@NotNull(message = "{productDetail.processor.notNull}")
	@Column(name = "PROCESSOR")
	public double getProcessor() {
		return processor;
	}

	public void setProcessor(double processor) {
		this.processor = processor;
	}

	@Column(name = "WEIGHT")
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@NotNull(message = "{productDetail.color.notNull}")
	@Column(name = "COLOR", length = 50)
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@NotNull(message = "{productDetail.storage.notNull}")
	@Column(name = "STORAGE")
	public Integer getStorage() {
		return storage;
	}

	public void setStorage(Integer storage) {
		this.storage = storage;
	}

	@Column(name = "RESOLUTION")
	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	@Column(name = "DISPLAY")
	public Integer getDisplay() {
		return display;
	}

	public void setDisplay(Integer display) {
		this.display = display;
	}

	@NotNull(message = "{productDetail.ram.notNull}")
	@Column(name = "RAM")
	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	@Basic
	@Transient
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
}
