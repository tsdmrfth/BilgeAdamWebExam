package com.bilgeadam.webexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bilgeadam.webexam.model.DatabaseService;
import com.bilgeadam.webexam.model.entity.impl.Product;
import com.bilgeadam.webexam.model.entity.impl.ProductDetail;
import com.bilgeadam.webexam.model.entity.impl.User;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Controller
@RequestMapping("/adminpanel")
public class AdminPanelController {

	@Autowired
	DatabaseService databaseService;

	@GetMapping
	public String root() {
		return "adminlogin";
	}

	@RequestMapping("/stock")
	public String products() {
		return "stock";
	}

	@PostMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password, Model model) {
		User user = new User();
		user.setPassword(password);
		user.setUsername(username);
		if ("admin".equals(username) && "asdf".equals(password)) {
			return "adminpanel";
		}
		return "adminlogin";
		// boolean result = databaseService.getUserService().checkUser(user);
		// if (!result) {
		// model.addAttribute("error", "error");
		// return "redirect/login";
		// }
		// return "redirect:/users";
	}

	@GetMapping("/addproduct")
	public String addProduct(Model model) {
		Product productToAdd = new Product();
		ProductDetail productDetail = new ProductDetail();
		model.addAttribute("productToAdd", productToAdd);
		model.addAttribute("productDetail", productDetail);
		return "addproduct";
	}

	@PostMapping("/addproduct")
	public String processAddProduct(@ModelAttribute Product productToAdd, @ModelAttribute ProductDetail productDetail) {
		databaseService.getProductDetailService().save(productDetail);
		productToAdd.setProductDetail(productDetail);
		databaseService.getProductService().save(productToAdd);
		return "redirect:/stock";
	}

	// admin stock update

	// admin addproduct model -> productcategories
}
