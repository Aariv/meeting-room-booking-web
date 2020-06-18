/**
 * 
 */
package com.sai.mrb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author sv
 *
 */
@Entity
public class MeetingRoom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String location;
	private String floor;

	public MeetingRoom() {
		// TODO Auto-generated constructor stub
	}

	public MeetingRoom(Integer id, String name, String location, String floor) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.floor = floor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return "MeetingRoom [id=" + id + ", name=" + name + ", location=" + location + ", floor=" + floor + "]";
	}

}
