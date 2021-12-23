package com.zamiurratul.spring.mock.crud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	@GetMapping({"/", "/index", "/home"})
	public String index(Model model) {
		model.addAttribute("welcomeMessage", welcomeMessage);
		return "index";
	}
	
	@GetMapping("/error")
	public String error(Model model) {
		return "error";
	}
}
