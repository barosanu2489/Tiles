package com.barosanu.model.beans;

import java.util.List;

import com.barosanu.model.ConstanteApplicatie;

public class Utilizator {

	private String name;
	private String password;

	private List<Integer> programariSapt0;// saptamana curenta
	private List<Integer> programariSapt1;// saptamana viitoare
	private List<Integer> programariSapt2;// peste doua saptamani
	private List<Integer> programariSapt3;// peste 3 saptamanani

	public int getAccesLevel() {
		return ConstanteApplicatie.ACCES_UTILIZATOR;
	}

	public void vizualizeazaProgramareaProprie() {
	}

	public void anuleazaProgramareProprie() {
	}

	public void vizualizeazaProgramari() {
	}

	public void actualizeazaDisponibilitate() {
	}

	public void actualizeazaObservatieProprie() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void adaugaToken(int idSaptamana, int token) {
		switch (idSaptamana) {
		case ConstanteApplicatie.SAPTAMANA_CURENTA:
			programariSapt0.add(token);
			break;
		case ConstanteApplicatie.SAPTAMANA_VIITOARE:
			programariSapt1.add(token);
			break;
		case ConstanteApplicatie.PESTE_2_SAPTAMANI:
			programariSapt2.add(token);
			break;
		case ConstanteApplicatie.PESTE_3_SAPTAMANI:
			programariSapt3.add(token);
			break;
		default:
			break;
		}
	}

}
