/**
 * 
 */
package com.sai.mrb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sai.mrb.model.BookMeeting;
import com.sai.mrb.service.BookingMeetingService;

/**
 * @author sv
 *
 */
@Controller
public class BookMeetingController {
	
	@Autowired
	BookingMeetingService bookingMeetingService;
	
	@GetMapping("/book")
	public String getAll(ModelMap modelMap){
		modelMap.put("bookinglist", bookingMeetingService.listAll());
		return "booking";
	}
	
	@PostMapping("/bookmeeting")
	public BookMeeting bookMeeting(BookMeeting bookMeeting) {
		return bookingMeetingService.bookMeeting(bookMeeting);
	}
 
}
