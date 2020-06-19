/**
 * 
 */
package com.sai.mrb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sai.mrb.model.MeetingRoom;
import com.sai.mrb.repo.MeetingRoomRepository;

/**
 * @author sv
 *
 */
@Service
public class MeetingRoomService {
	
	@Autowired
	MeetingRoomRepository roomrepo;
	
	public List<MeetingRoom> listAll(){
		return (List<MeetingRoom>) roomrepo.findAll();
	}
	
	public MeetingRoom addRoom(MeetingRoom meetingroom) {
		meetingroom = roomrepo.save(meetingroom);
		
		return meetingroom;
	}

}
