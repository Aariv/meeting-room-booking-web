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
import com.sai.mrb.model.MeetingRoom;
import com.sai.mrb.service.MeetingRoomService;

/**
 * @author sv
 *
 */
@Controller
public class MeetingController {
	
	@Autowired
	 MeetingRoomService meetingRoomService;
	
	@GetMapping("/meetingroom")
	public String getAll(ModelMap modelMap){
		modelMap.put("roomlist", meetingRoomService.listAll());
		return "meetingroom";
	}
	
	@GetMapping("/backmeeting")
	public String back() {
		return "admin";
	}
	
	@PostMapping("/addroom")
	public String addRoom(@ModelAttribute("room") MeetingRoom meetingRoom) {
		 meetingRoomService.addRoom(meetingRoom);
		 return "admin";
	}

}
