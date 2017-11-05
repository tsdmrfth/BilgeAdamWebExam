package com.bilgeadam.webexam.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bilgeadam.webexam.exception.SaveProductImageFailedException;
import com.bilgeadam.webexam.model.DatabaseService;
import com.bilgeadam.webexam.model.FormData;
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

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginFailed(Model model) {
		model.addAttribute("isFailed", "true");
		return "adminlogin";
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

	@RequestMapping(value = "/addproduct", method = RequestMethod.GET)
	public String addProduct(Model model) {
		model.addAttribute("formData", new FormData());
		return "addproduct";
	}

	@RequestMapping(value = "/addproduct", method = RequestMethod.POST)
	public String processAddForm(@Valid @ModelAttribute("formData") FormData formData, BindingResult bindingResult,
			HttpServletRequest request) {
		if (bindingResult.hasErrors()) {
			return "addproduct";
		}
		MultipartFile productImage = formData.getProductDetail().getProductImage();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		String productImageUrl = rootDirectory + "/resources/assets/images/"
				+ databaseService.getProductService().getProductBarcode(formData.getProduct()) + ".png";
		if (productImage != null && !productImage.isEmpty()) {
			try {
				productImage.transferTo(new File(productImageUrl));
			} catch (Exception e) {
			}
		}
		formData.getProductDetail().setProductImageUrl(productImageUrl);
		databaseService.getProductDetailService().save(formData.getProductDetail());
		formData.getProduct().setProductDetail(formData.getProductDetail());
		databaseService.getProductService().save(formData.getProduct());
		return "redirect:/stock";
	}

	@InitBinder
	public void initialiseBinder(WebDataBinder binder) {
		binder.setAllowedFields("productDetail.productImage", "product.availableStock", "productDetail.batteryPower",
				"product.brand", "productDetail.color", "productDetail.display", "product.model", "product.name",
				"product.price", "productDetail.processor", "product.producedYear", "product.productCategory",
				"productDetail.ram", "productDetail.resolution", "productDetail.storage", "productDetail.weight");
	}

	@ExceptionHandler(SaveProductImageFailedException.class)
	public ModelAndView handleSaveProductImageFailedException(SaveProductImageFailedException exception) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("error", exception.getException());
		modelAndView.setViewName("addproduct");
		return modelAndView;
	}

	// admin stock update

	// admin addproduct model -> productcategories
}
