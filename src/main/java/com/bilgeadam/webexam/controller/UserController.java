package com.bilgeadam.webexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bilgeadam.webexam.model.entity.impl.User;
import com.bilgeadam.webexam.model.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public String root(Model model) {
		model.addAttribute("users", userService.findAll());
		return "users";
	}
	
	@PostMapping("/signup")
	public String signup(@RequestParam String pwd,@RequestParam String email) {
		User user = new User();
		user.setEmail(email);
		user.setPassword(pwd);
        userService.save(user);
		return "redirect:/users";
	}
	
}
