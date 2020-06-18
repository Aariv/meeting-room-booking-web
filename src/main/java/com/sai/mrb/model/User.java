/**
 * 
 */
package com.sai.mrb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String emailid;
	private String role;
	private String team;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, String emailid, String role, String team) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
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
		return "User [id=" + id + ", name=" + name + ", emailid=" + emailid + ", role=" + role + ", team=" + team + "]";
	}

}
