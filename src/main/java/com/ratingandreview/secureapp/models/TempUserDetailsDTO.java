package com.ratingandreview.secureapp.models;

public class TempUserDetailsDTO {
	
	private String userName;
	private String userRole;
	private long userId;
	private String email;
	
	
	@Override
	public String toString() {
		return "TempUserDetailsDTO [userName=" + userName + ", userRole=" + userRole + ", userId=" + userId + ", email="
				+ email + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(Long long1) {
		this.userId = long1;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
