package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Registration;

@Controller
public class RegistrationController {
	
	
	@RequestMapping(path="/registration", method=RequestMethod.GET)
	public String showRegistrationForm(Model modelHolder) {
		if(! modelHolder.containsAttribute("registration")) {
			modelHolder.addAttribute("registration", new Registration());
		}
		
		return "registration";
	}
	
	
	@RequestMapping(path="/registration/submit", method=RequestMethod.POST)
	public String handleRegistrationForm(
			@Valid @ModelAttribute("registration") Registration registration, 
			BindingResult result,
			RedirectAttributes attr
	) {
		
		attr.addFlashAttribute("registration", registration);
		if(result.hasErrors()) {
			attr.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "registration", result);
			return "redirect:/registration";
		}
		
		return "redirect:/login/thankYou";
	}
	
	
}