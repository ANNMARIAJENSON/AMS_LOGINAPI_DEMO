package com.example.loginapi.entity;

public class LoginEntity {
	private String userName;
	private String passWord;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public LoginEntity(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	public LoginEntity() {
		super();
	}
	

}
