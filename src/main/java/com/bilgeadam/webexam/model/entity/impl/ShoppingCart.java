package com.bilgeadam.webexam.model.entity.impl;

import java.util.List;

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
	private List<ShoppingCartItem> shoppingCartItems;
	private boolean isActive;
	private boolean isSold;
	private Customer cartOwner;

	@OneToMany(mappedBy = "belongedShoppingCart")
	public List<ShoppingCartItem> getShoppingCartItems() {
		return shoppingCartItems;
	}

	public void setShoppingCartItems(List<ShoppingCartItem> shoppingCartItems) {
		this.shoppingCartItems = shoppingCartItems;
	}

	@Column(name = "IS_ACTIVE")
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Column(name = "IS_SOLD", nullable = false)
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
}
