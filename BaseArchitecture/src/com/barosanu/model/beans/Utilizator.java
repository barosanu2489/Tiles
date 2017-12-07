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

}
