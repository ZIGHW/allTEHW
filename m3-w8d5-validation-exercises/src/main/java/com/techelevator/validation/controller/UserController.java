package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.techelevator.validation.model.Login;

@Controller
public class UserController {
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String showMailingListForm(Model modelHolder) {
		if(! modelHolder.containsAttribute("login")) {
			modelHolder.addAttribute("login", new Login());
		}
		
		return "login";
	}
	
	
	@RequestMapping(path="/login/submit", method=RequestMethod.POST)
	public String handleMailingListForm(
			@Valid @ModelAttribute("login") Login login, 
			BindingResult result,
			RedirectAttributes attr
	) {
		
		attr.addFlashAttribute("login", login);
		if(result.hasErrors()) {
			attr.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "login", result);
			return "redirect:/login";
		}
		
		return "redirect:/login/thankYou";
	}
	
	@RequestMapping(path="/login/thankYou", method=RequestMethod.GET)
	public String showThankYou() {
		return "thankYou";
	}
	
	
}
