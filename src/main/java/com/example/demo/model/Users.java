package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="employee")
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String role;
	private String follow;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFollow() {
		return follow;
	}
	public void setFollow(String follow) {
		this.follow = follow;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", role=" + role + ", follow=" + follow + "]";
	}
	public Users(int id, String name, String role, String follow) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.follow = follow;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
