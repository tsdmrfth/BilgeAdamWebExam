package com.bilgeadam.webexam.model.entity.impl;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bilgeadam.webexam.model.entity.AbstractEntity;

/***
 * @author Fatih Taşdemir Oct 28, 2017
 */

@Entity
@Table(name = "SHOPPING_CART")
public class ShoppingCart extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private boolean isActive;
	private boolean isSold = false;
	private Customer cartOwner;
	private List<Product> shoppingCartItems;

	@Column(name = "IS_ACTIVE")
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Column(name = "IS_SOLD")
	public boolean isSold() {
		return isSold;
	}

	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}

	@ManyToOne
	@JoinColumn(name = "CART_OWNER")
	public Customer getCartOwner() {
		return cartOwner;
	}

	public void setCartOwner(Customer cartOwner) {
		this.cartOwner = cartOwner;
	}

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	public List<Product> getShoppingCartItems() {
		return shoppingCartItems;
	}

	public void setShoppingCartItems(List<Product> shoppingCartItems) {
		this.shoppingCartItems = shoppingCartItems;
	}
}
