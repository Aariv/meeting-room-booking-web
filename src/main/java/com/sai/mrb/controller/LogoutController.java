/**
 * 
 */
package com.sai.mrb.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sv
 *
 */
@Controller
@RequestMapping("/logout")
public class LogoutController {
	
	@GetMapping
	public String logout(HttpSession httpSession) {
		httpSession.removeAttribute("name");
		httpSession.invalidate();
		return "index";
	}

}
