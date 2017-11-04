package com.bilgeadam.webexam.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bilgeadam.webexam.model.service.AddressService;
import com.bilgeadam.webexam.model.service.CustomerService;
import com.bilgeadam.webexam.model.service.OrderService;
import com.bilgeadam.webexam.model.service.ProductDetailService;
import com.bilgeadam.webexam.model.service.ProductService;
import com.bilgeadam.webexam.model.service.ShoppingCartService;
import com.bilgeadam.webexam.model.service.UserService;

@Component
public class DatabaseService {

	@Autowired
	private AddressService addressService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private ProductDetailService productDetailService;
	@Autowired
	private ProductService productService;
	@Autowired
	private ShoppingCartService shoppingCartService;
	@Autowired
	private UserService userService;

	public AddressService getAddressService() {
		return addressService;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public ProductDetailService getProductDetailService() {
		return productDetailService;
	}

	public ProductService getProductService() {
		return productService;
	}

	public ShoppingCartService getShoppingCartService() {
		return shoppingCartService;
	}

	public UserService getUserService() {
		return userService;
	}

}
