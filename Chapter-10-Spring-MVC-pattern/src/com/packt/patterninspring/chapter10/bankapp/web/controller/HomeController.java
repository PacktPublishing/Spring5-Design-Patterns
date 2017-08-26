package com.packt.patterninspring.chapter10.bankapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.packt.patterninspring.chapter10.bankapp.model.User;

/**
 * @author Dinesh.Rajput
 *
 */
@Controller
public class HomeController {
	
	@GetMapping(value = "/")
	public String home (){
		return "home";
	}
	
	@GetMapping(value = "/create")
	public String create (){
		return "addUser";
	}
	
	@PostMapping(value = "/create")
	public String saveUser (@ModelAttribute("user") User user, ModelMap model, BindingResult result){
		model.put("user", user);
		return "addUser";
	}
}
