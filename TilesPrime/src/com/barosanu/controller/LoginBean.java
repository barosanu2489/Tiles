package com.barosanu.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.barosanu.BootStrap;

@ManagedBean(name = "loginBean")
public class LoginBean {

	@ManagedProperty(value = "#{BootStrap}")
	private BootStrap bootStrap;
		
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public BootStrap getBootStrap() {
		return bootStrap;
	}

	public void setBootStrap(BootStrap bootStrap) {
		this.bootStrap = bootStrap;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login() {
		
		return bootStrap.registerUser(this);
		
	}

}
