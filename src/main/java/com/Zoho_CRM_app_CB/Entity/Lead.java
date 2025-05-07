package com.Zoho_CRM_app_CB.Entity;

import javax.persistence.*;


@Entity
@Table(name="leads")
public class Lead{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="First_name",nullable=false,length=50)
	private String fname;
	@Column(name="Last_name",nullable=false,length=50)
	private String lname;
	@Column(name="Email",nullable=false,length=50,unique=true)
	private String email;
	@Column(name="Mobile",nullable=false,length=50)
	private long mobile;
	
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String role;
	
	
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
    
}
