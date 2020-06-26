/**
 * 
 */
package com.sai.mrb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.sai.mrb.model.User;
import com.sai.mrb.service.UserService;

/**
 * @author sv
 *
 */

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/add")
	public String listUsers(ModelMap modelMap) {
		modelMap.put("userlist", userService.listAll());
		return "add";
	}
	
	@GetMapping("/backuser")
	public String back() {
		return "admin";
	}

	@PostMapping("/adduser")
	public String add(@ModelAttribute("user") User user) {
		userService.addUser(user);
		return "admin";
	}

}
