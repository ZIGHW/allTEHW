package com.techelevator.critter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.critter.model.UserDAO;

@Controller
@SessionAttributes("currentUser")
public class AuthenticationController {

	private UserDAO userDAO;

	@Autowired
	public AuthenticationController(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String displayLoginForm() {
		return "login";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String login(@RequestParam String userName, 
<<<<<<< HEAD
						@RequestParam String password,
						@RequestParam(required=false) String destination,
=======
						@RequestParam String password, 
>>>>>>> a70fb3f6b75f7c1850e6038d7bea6f64ad30d776
						ModelMap model,
						HttpSession session) {
		if(userDAO.searchForUsernameAndPassword(userName, password)) {
			session.invalidate();
			model.put("currentUser", userName);
			if (destination != null) {
				return "redirect:" + destination;
			}
			return "redirect:/users/"+userName;
		} else {
			return "redirect:/login";
		}
	}

	@RequestMapping(path="/logout", method=RequestMethod.POST)
	public String logout(ModelMap model, HttpSession session) {
		model.remove("currentUser");
		session.removeAttribute("currentUser");
		return "redirect:/";
	}
}
