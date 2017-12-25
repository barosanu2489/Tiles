package com.barosanu.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.barosanu.model.BazaDeDate;
import com.barosanu.model.beans.Utilizator;

public class SessionManager {

	private BazaDeDate bazaDeDate;
	private Map<Integer, Utilizator> utilizatoriInregistrati = new HashMap<Integer, Utilizator>();

	private static final int MAXIMUM_USERS = 10;

	public static final int LOGIN_SUCCESS = 1;
	public static final int LOGIN_FAIL_BY_CREDENTIALS = 2;
	public static final int LOGIN_FAIL_BY_NUMBERS = 3;

	public int registerUser(LoginBean loginBean) {
		int result = LOGIN_FAIL_BY_CREDENTIALS;
		Utilizator utilizator = bazaDeDate.cautaUtilizator(loginBean.getUsername(), loginBean.getPassword());
		if (utilizator != null && utilizatoriInregistrati.size() < MAXIMUM_USERS) {
			result = new Random().nextInt(2000);
			utilizatoriInregistrati.put(Integer.valueOf(result), utilizator);
		} 
		return result;

	}

	private static boolean initialized = false;

	public SessionManager(BazaDeDate bazaDeDate) {
		if (initialized)
			return;
		else {
			initialized = true;
			this.bazaDeDate = bazaDeDate;
		}
	}

	public boolean isUserRegistered(int id) {
		Utilizator utilizator = utilizatoriInregistrati.get(id);
		if (utilizator != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public Utilizator getUserById(int id) {
		return utilizatoriInregistrati.get(id);
	}
	

}
