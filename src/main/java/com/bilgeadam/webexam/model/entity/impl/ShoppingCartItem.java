package com.bilgeadam.webexam.model.entity.impl;

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
@Table(name = "CART_ITEM")
public class ShoppingCartItem extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private Product addedProduct;
	private ShoppingCart belongedShoppingCart;

	@OneToOne
	@MapsId
	public Product getAddedProduct() {
		return addedProduct;
	}

	public void setAddedProduct(Product addedProduct) {
		this.addedProduct = addedProduct;
	}

	@ManyToOne
	@JoinColumn(name = "BELONGED_CART", nullable = false)
	public ShoppingCart getBelongedShoppingCart() {
		return belongedShoppingCart;
	}

	public void setBelongedShoppingCart(ShoppingCart belongedShoppingCart) {
		this.belongedShoppingCart = belongedShoppingCart;
	}

}
