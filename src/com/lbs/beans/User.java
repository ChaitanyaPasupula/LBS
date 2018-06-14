package com.lbs.beans;

public class User {
	 private int userId ;
		private String userName ;
		private int age ;
		private String gender ;
		private String role ;
	    private String password;
	public User(int userId,String userName,int age,String gender,String role,String password){
		this.userId=userId;
		this.userName=userName;
		this.age=age;
		this.gender=gender;
		this.role=role;
	        this.password=password;
	}
		 public int getUserId() {
			return userId;
		}
		public void setUser_id(int userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
	        
		 public int getPassword() {
			return userId;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
