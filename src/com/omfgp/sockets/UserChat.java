package com.omfgp.sockets;

public class UserChat {

	private String userName;
	private String message;
	
	public UserChat() {	}
	
	public void setMessage(String msg) {
		this.message = msg;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setUserName(String name) {
		this.userName = name;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
}
