package com.barosanu.controller;

import com.barosanu.model.BazaDeDate;
import com.barosanu.model.beans.Utilizator;

public class ModelAccess {
	
	private BazaDeDate bazaDeDate = new BazaDeDate();
	private PersistenceAccess persistenceAccess;
	
	public void itializareUtilizatori() {
		for(Utilizator util : persistenceAccess.initializeazaUtilizatori()) {
			bazaDeDate.adaugaUtilizator(util);
		}
	}
	

}
