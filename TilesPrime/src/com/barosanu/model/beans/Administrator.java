package com.barosanu.model.beans;

import com.barosanu.model.ConstanteApplicatie;

public class Administrator extends Programator {

	public Administrator(String name, String pass, int id) {
		super(name,pass, id);
	}

	@Override
	public int getAccesLevel() {
		return ConstanteApplicatie.ACCES_ADMINISTRATOR;

	}

	public void adaugaUtilizator(Utilizator utilizator) {
	}

	public void stergeUtilizator(Utilizator utilizator) {
	}

	public void publicaInformatie(String informatie) {
	}

}
