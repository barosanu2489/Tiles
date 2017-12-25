package com.barosanu.model.beans;

import com.barosanu.model.ConstanteApplicatie;

public class Programator extends Utilizator {

	public Programator(String name,String pass, int Id) {
		super(name,pass, Id);		
	}

	@Override
	public int getAccesLevel() {
		return ConstanteApplicatie.ACCES_PROGRAMATOR;
	}

	public void programeazaUtilizator(Utilizator utilizator) {
	}

}
