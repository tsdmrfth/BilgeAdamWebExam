package com.bilgeadam.webexam.model.entity.impl;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

import com.bilgeadam.webexam.model.entity.AbstractEntity;

/***
 * @author Fatih Taşdemir Oct 28, 2017
 */

@Entity
@Table(name = "CUSTOMER")
public class Customer extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phoneNumber;
	private Gender gender;
	private Address address;
	private List<ShoppingCart> customerShoppingCart;
	private List<Order> ownedOrder;

	@Column(name = "FIRST_NAME", length = 50, nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME", length = 100, nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "EMAIL", length = 255, nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PASSWORD", length = 255, nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Pattern(regexp = "###-###-####")
	@Max(value = 10)
	@Column(name = "PHONE_NUMBER", nullable = false)
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "GENDER", nullable = false)
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@OneToOne(targetEntity = Address.class)
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@OneToMany(mappedBy = "cartOwner")
	public List<ShoppingCart> getCustomerShoppingCart() {
		return customerShoppingCart;
	}

	public void setCustomerShoppingCart(List<ShoppingCart> customerShoppingCart) {
		this.customerShoppingCart = customerShoppingCart;
	}

	@OneToMany(mappedBy = "orderOwner")
	public List<Order> getOwnedOrder() {
		return ownedOrder;
	}

	public void setOwnedOrder(List<Order> ownedOrder) {
		this.ownedOrder = ownedOrder;
	}

	private enum Gender {
		MALE, FEMALE, UNSPECIFIED;
	}

}
