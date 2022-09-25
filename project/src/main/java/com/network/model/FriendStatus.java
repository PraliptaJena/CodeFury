package com.network.model;

public class FriendStatus {

	private String userEmail;
	private String femail;
	private String name;
	private String status;
	
	
	public FriendStatus(String userEmail, String femail, String name, String status) {
		super();
		this.userEmail = userEmail;
		this.femail = femail;
		this.name = name;
		this.status = status;
	}
	
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getFemail() {
		return femail;
	}
	public void setFemail(String femail) {
		this.femail = femail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
