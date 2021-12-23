package com.zamiurratul.spring.mock.crud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zamiurratul.spring.mock.crud.model.User;
import com.zamiurratul.spring.mock.crud.repository.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/registration")
	public String showRegistration(Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}
	
	@PostMapping("/create")
	public String create(@Valid User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "registration";
		}
		userRepository.save(user);
		return "redirect:/index";
	}
	
	@GetMapping("/all")
	public String allUsers(Model model) {
		List<User> users = userRepository.findAll();
		model.addAttribute("users", users);
		return "users";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable long id, Model model) {
		User user = userRepository.getOne(id);
		model.addAttribute("user", user);
		return "edit-user";
	}
	
	@PostMapping("/update")
	public String update(@Valid User user, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "edit-user";
		}
		userRepository.save(user);
		return "redirect:/users/all";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable long id, Model model) {
		userRepository.deleteById(id);
		return "redirect:/users/all";
	}
}
