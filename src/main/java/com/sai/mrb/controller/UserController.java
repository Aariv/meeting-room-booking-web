/**
 * 
 */
package com.sai.mrb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sai.mrb.model.User;
import com.sai.mrb.service.UserService;

/**
 * @author sv
 *
 */

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping()
	public List<User> getAll(){
		System.out.println("Inside the User Controller");
		
		return userService.listAll();
	}
	
	@PostMapping("/adduser")
	public User add(@RequestBody User user) {
		return userService.addUser(user);
	}

}
