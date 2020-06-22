/**
 * 
 */
package com.sai.mrb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sai.mrb.model.BookMeeting;
import com.sai.mrb.repo.BookMeetingRepository;

/**
 * @author sv
 *
 */
@Service
public class BookingMeetingService  {
	
	@Autowired
	BookMeetingRepository bookMeetingRepository;
	
	public List<BookMeeting> listAll(){
		return (List<BookMeeting>) bookMeetingRepository.findAll();
	}
	
	public BookMeeting bookMeeting(BookMeeting bookMeeting) {
		bookMeeting = bookMeetingRepository.save(bookMeeting);
		
		return bookMeeting;
	}

}
