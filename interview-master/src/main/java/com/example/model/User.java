package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String username;
	private String password;
	
	@NotNull
	private String name;
	private String email;
	private String mobileNumber;
	private String college;
	private String company;
	
	// This should be enum
	private String level;
	
	private String thirdPartyAccountID;
	private String thirdPartyAuthServer;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getThirdPartyAccountID() {
		return thirdPartyAccountID;
	}
	public void setThirdPartyAccountID(String thirdPartyAccountID) {
		this.thirdPartyAccountID = thirdPartyAccountID;
	}
	public String getThirdPartyAuthServer() {
		return thirdPartyAuthServer;
	}
	public void setThirdPartyAuthServer(String thirdPartyAuthServer) {
		this.thirdPartyAuthServer = thirdPartyAuthServer;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", college=" + college + ", company=" + company + ", level=" + level + "]";
	}
}
