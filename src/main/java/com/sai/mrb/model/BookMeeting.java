/**
 * 
 */
package com.sai.mrb.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author sv
 *
 */
@Entity
public class BookMeeting {
	
	@Id
	@GeneratedValue
	private Integer id;
	private LocalDate startDate;
	private LocalDate endDate;
	private LocalDate startTime;
	private LocalDate endTime;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	User user;	
	
	@ManyToOne
	@JoinColumn(name = "meeting_id")
	MeetingRoom meetingRoom;
	
	public BookMeeting() {
		// TODO Auto-generated constructor stub
	}

	public BookMeeting(Integer id, LocalDate startDate, LocalDate endDate, LocalDate startTime, LocalDate endTime,
			User user, MeetingRoom meetingRoom) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.user = user;
		this.meetingRoom = meetingRoom;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public MeetingRoom getMeetingRoom() {
		return meetingRoom;
	}

	public void setMeetingRoom(MeetingRoom meetingRoom) {
		this.meetingRoom = meetingRoom;
	}

	@Override
	public String toString() {
		return "BookMeeting [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", startTime="
				+ startTime + ", endTime=" + endTime + ", user=" + user + ", meetingRoom=" + meetingRoom + "]";
	}
	
}
