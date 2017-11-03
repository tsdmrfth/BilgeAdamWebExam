package com.bilgeadam.webexam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bilgeadam.webexam.model.DatabaseService;
import com.bilgeadam.webexam.model.entity.impl.Address;
import com.bilgeadam.webexam.model.entity.impl.Customer;
import com.bilgeadam.webexam.model.entity.impl.Product;
import com.bilgeadam.webexam.model.entity.impl.ShoppingCart;

/**
 * @author Fatih Taşdemir Oct 30, 2017
 */

@Controller
@RequestMapping({ "/", "home" })
public class CustomerPanelController {

	@Autowired
	DatabaseService databaseService;

	@GetMapping
	public String home(Model model) {
		model.addAttribute("products", databaseService.getProductService().findAll());
		return "products";
	}

	@RequestMapping("/addtocart/{id}")
	public String addToCart(@PathVariable Integer id) {
		Address address = new Address();
		Customer cartOwner = new Customer();
		Product productToCart = databaseService.getProductService().findById(id);
		ShoppingCart shoppingCart = new ShoppingCart();

		address.setCountry("Turkey");
		address.setCity("");
		address.setDistrict("Kadıköy");
		address.setApartmentNumber("22");
		address.setBuildingNumber("11");
		address.setNeighborhood("Ziverbey Mahallesi");
		address.setStreet("Recai Bey Sokak");

		cartOwner.setEmail("tsdmrfth@gmail.com");
		cartOwner.setFirstName("Fatih");
		cartOwner.setLastName("Tasdemir");
		cartOwner.setPassword("asdf");
		cartOwner.setAddress(address);
		List<ShoppingCart> shoppingCarts = new ArrayList<>();
		cartOwner.setCustomerShoppingCart(shoppingCarts);
		;

		List<Product> shoppingCartItem = new ArrayList<>();
		shoppingCartItem.add(productToCart);
		shoppingCart.setShoppingCartItems(shoppingCartItem);

		shoppingCart.setActive(true);
		shoppingCart.setCartOwner(cartOwner);

		databaseService.getAddressService().save(address);
		databaseService.getCustomerService().save(cartOwner);
		databaseService.getShoppingCartService().save(shoppingCart);
		return "products";
	}
}
