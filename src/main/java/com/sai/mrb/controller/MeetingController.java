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

import com.sai.mrb.model.MeetingRoom;
import com.sai.mrb.service.MeetingRoomService;

/**
 * @author sv
 *
 */
@Controller
@RequestMapping("/meetingroom")
public class MeetingController {
	
	@Autowired
	 MeetingRoomService meetingRoomService;
	
	@GetMapping()
	public List<MeetingRoom> getAll(){
		return meetingRoomService.listAll();
	}
	
	@PostMapping("/addroom")
	public MeetingRoom addRoom(@RequestBody MeetingRoom meetingRoom) {
		return meetingRoomService.addRoom(meetingRoom);
	}

}
