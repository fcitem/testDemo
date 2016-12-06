package com.fc.base;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class users implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	@JsonProperty(value="Username")
	private String username;
//	@JsonProperty(value="Password")
	private String password;
	public users() {
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
