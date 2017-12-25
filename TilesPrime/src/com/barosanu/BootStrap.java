package com.barosanu;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.barosanu.controller.LoginBean;
import com.barosanu.controller.SessionManager;
import com.barosanu.model.BazaDeDate;
import com.barosanu.model.beans.Utilizator;

/**
 * 
 * Starting point of the application</br>
 * This is the main CONTROLLER CLASS!!
 *
 */
@ApplicationScoped
@ManagedBean(eager = true, name = "BootStrap")
public class BootStrap {

	private BazaDeDate bazaDeDate;
	private SessionManager sessionManager;
	
	public BootStrap(){}

	@PostConstruct
	public void init() {
		bazaDeDate = new BazaDeDate();
		bazaDeDate.restoreFromPersistence();
		sessionManager = new SessionManager(bazaDeDate);
	}

	public String registerUser(LoginBean loginBean) {
		int result = sessionManager.registerUser(loginBean);

		if (result != SessionManager.LOGIN_FAIL_BY_CREDENTIALS) {
			return "mainpage?faces-redirect=true&id=" + result ;
		} else {
			return "login";
		}
	}
	
	public Utilizator getRegisteredUser(int id) {
		return sessionManager.getUserById(id);
	}

}
