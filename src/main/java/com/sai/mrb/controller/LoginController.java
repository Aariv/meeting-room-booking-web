/**
 * 
 */
package com.sai.mrb.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sai.mrb.model.User;
import com.sai.mrb.service.UserService;

/**
 * @author sv
 *
 */
@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	UserService userService;

	@GetMapping
	public String login() {
		return "index";
	}

	@PostMapping(path = "/login")
	public String validateandLogin( @RequestParam("username") String name, @RequestParam("password") String password,
			Model m,@ModelAttribute("booking") User user, HttpSession httpSession) {
		String flag = "index";
		if (name.equalsIgnoreCase("admin") && password.equals("admin")) {
			httpSession.setAttribute("name", "admin");
			flag = "admin";
			System.out.println("Inside Admin");
		}
		else if (validateUser(user)) {
			flag = "user";
			System.out.println("Inside User");
		}
		else {
			m.addAttribute("message", "Invalid Credentials");
			flag = "error";
			System.out.println("Inside Error");
		}
		return flag;
	}

	private boolean validateUser(User user) {
		// TODO Auto-generated method stub
		return userService.validateUser(user);
	}

}
