/**
 * 
 */
package com.sai.mrb.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author sv
 *
 */

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	@Column(length=255)
	private String emailid;
	private String password;
	private String role;
	private String team;
	
	@OneToMany(mappedBy = "user")
	private Set<BookMeeting> bookMeeting;
	
	public Set<BookMeeting> getBookMeeting() {
		return bookMeeting;
	}

	public void setBookMeeting(Set<BookMeeting> bookMeeting) {
		this.bookMeeting = bookMeeting;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, String emailid, String password, String role, String team) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.password = password;
		this.role = role;
		this.team = team;
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

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailid=" + emailid + ", password=" + password + ", role="
				+ role + ", team=" + team + "]";
	}

}
