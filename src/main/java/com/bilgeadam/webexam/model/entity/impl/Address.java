package com.bilgeadam.webexam.model.entity.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bilgeadam.webexam.model.entity.AbstractEntity;

/***
 * @author Fatih Taşdemir Oct 28, 2017
 */

@Entity
@Table(name = "ADDRESS")
public class Address extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private String country;
	private String city;
	private String district;
	private String neighborhood;
	private String street;
	private String buildingNumber;
	private String apartmentNumber;

	@Column(name = "COUNTRY", length = 124, nullable = false)
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "CITY", length = 124, nullable = false)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "DISTRICT", length = 124, nullable = false)
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Column(name = "NEIGHBORHOOD", length = 124, nullable = false)
	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	@Column(name = "STREET", length = 124, nullable = false)
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "BUILDING_NUMBER", length = 124, nullable = false)
	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	@Column(name = "APARTMENT_NUMBER", length = 124, nullable = false)
	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

}
