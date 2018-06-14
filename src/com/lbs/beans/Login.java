package com.lbs.beans;

public class Login {
	private String userName;
	private String password;
	private String role;
	
	public void setUserName(String userId) {
		this.userName = userId;
	}
        public String getUserName() {
		return userName;
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
	@Override
	public String toString() {
		return "Login [userId=" + userName + ", password=" + password
				+ ", role=" + role + "]";
	}
	
}
