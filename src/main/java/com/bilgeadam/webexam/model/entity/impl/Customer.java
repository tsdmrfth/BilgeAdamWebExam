package com.bilgeadam.webexam.model.entity.impl;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	private List<Address> address;
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

	@ElementCollection
	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
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

}
