package com.bilgeadam.webexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bilgeadam.webexam.model.DatabaseService;
import com.bilgeadam.webexam.model.entity.impl.User;

@Controller
@RequestMapping({ "/", "/login" })
public class UserController {

	@Autowired
	DatabaseService databaseService;

	@GetMapping
	public String root() {
		return "login";
	}

	@PostMapping("/signup")
	public String signup(@RequestParam String pwd, @RequestParam String email, Model model) {
		User user = new User();
		user.setEmail(email);
		user.setPassword(pwd);
		boolean result = databaseService.getUserService().checkUser(user);
		if (!result) {
			model.addAttribute("error", "error");
			return "redirect/login";
		}
		return "redirect:/users";
	}

}
