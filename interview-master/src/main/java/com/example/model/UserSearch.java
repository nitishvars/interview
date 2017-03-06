package com.example.model;

public class UserSearch {
	private long id;
	private String username;
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
	
	
}
