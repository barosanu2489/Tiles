package com.barosanu.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import com.barosanu.BootStrap;
import com.barosanu.model.beans.Utilizator;

@ManagedBean(name = "UserSession")
public class UserSession {

	private Utilizator utilizator;
	private String numeUtilizator;

	@ManagedProperty(value = "#{BootStrap}")
	private BootStrap bootStrap;

	private int id;

	public BootStrap getBootStrap() {
		return bootStrap;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBootStrap(BootStrap bootStrap) {
		this.bootStrap = bootStrap;
	}

	public String getNumeUtilizator() {
		return utilizator.getName();
	}

	public void setNumeUtilizator(String numeUtilizator) {
		this.numeUtilizator = numeUtilizator;
	}

	public void check() {
		utilizator = bootStrap.getRegisteredUser(id);
		if (utilizator == null) {
			FacesContext context = FacesContext.getCurrentInstance();
			try {
				context.getExternalContext().responseSendError(401, "EROARE!!!!!!!!!");
			} catch (Exception e) {
				e.printStackTrace();
			}
			context.responseComplete();
		} else {
			System.out.println(utilizator);
		}
	}

}
