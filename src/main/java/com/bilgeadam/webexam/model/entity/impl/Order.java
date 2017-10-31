package com.bilgeadam.webexam.model.entity.impl;

import javax.persistence.CascadeType;
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
@Table(name = "CUSTOMER_ORDER")
public class Order extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private ShoppingCart ownedProducts;
	private double totalCost;
	private PaymentType paymentType;
	private Customer orderOwner;

	@OneToOne
	@MapsId
	public ShoppingCart getOwnedProducts() {
		return ownedProducts;
	}

	public void setOwnedProducts(ShoppingCart ownedProducts) {
		this.ownedProducts = ownedProducts;
	}

	@Column(name = "TOTAL_COST", nullable = false)
	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	@Column(name = "PAYMENT_TYPE", nullable = false)
	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ORDER_OWNER")
	public Customer getOrderOwner() {
		return orderOwner;
	}

	public void setOrderOwner(Customer orderOwner) {
		this.orderOwner = orderOwner;
	}

}
