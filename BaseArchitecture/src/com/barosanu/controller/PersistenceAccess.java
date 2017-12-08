package com.barosanu.controller;

import java.util.ArrayList;
import java.util.List;

import com.barosanu.model.beans.Utilizator;

public class PersistenceAccess {
	

	public List<Utilizator> initializeazaUtilizatori(){
		//TODO: dummy data:
		ArrayList<Utilizator> listaUtilizatoriPersistata= new ArrayList<Utilizator>();
		listaUtilizatoriPersistata.add(new Utilizator("Ion Popescu", 100));
		listaUtilizatoriPersistata.add(new Utilizator("Gregorio Goguen", 101));
		listaUtilizatoriPersistata.add(new Utilizator("Douglass Liddle", 102));
		listaUtilizatoriPersistata.add(new Utilizator("Mason Steinke", 103));
		listaUtilizatoriPersistata.add(new Utilizator("Angel Storey", 104));
		listaUtilizatoriPersistata.add(new Utilizator("Ramon Franchi", 105));
		listaUtilizatoriPersistata.add(new Utilizator("Tilda Cowell", 106));
		listaUtilizatoriPersistata.add(new Utilizator("Macie Cleman", 107));
		listaUtilizatoriPersistata.add(new Utilizator("Malia Taketa", 108));
		listaUtilizatoriPersistata.add(new Utilizator("Hang Yoshimoto", 109));
		listaUtilizatoriPersistata.add(new Utilizator("Ramonita Debelak", 110));
		
		return listaUtilizatoriPersistata;
	}
	
	

}
