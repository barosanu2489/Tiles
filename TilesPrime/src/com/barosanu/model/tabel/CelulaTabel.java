package com.barosanu.model.tabel;

import java.util.ArrayList;
import java.util.List;

import com.barosanu.model.beans.Utilizator;

public class CelulaTabel {

	public static final int UTILIZATOR1 = 0;
	public static final int UTILIZATOR2 = 1;

	private int tokenID;
	private List<Utilizator> utilizatori = new ArrayList<Utilizator>(2);

	public Utilizator getUtilizator1() {
		return utilizatori.get(UTILIZATOR1);
	}

	public Utilizator getUtilizator2() {
		return utilizatori.get(UTILIZATOR2);
	}

	public void setUtilizator1(Utilizator utilizator) {
		utilizatori.set(UTILIZATOR1, utilizator);
	}

	public void setUtilizator2(Utilizator utilizator) {
		utilizatori.set(UTILIZATOR2, utilizator);
	}

	public void setUtilizator(Utilizator utilizator, int locUtilizator) {
		utilizatori.set(locUtilizator, utilizator);
	}

	public Utilizator getUtilizator(int locUtilizator) {
		return utilizatori.get(locUtilizator);
	}

	public void stergeUtilizator(int locUtilizator) {
		utilizatori.remove(locUtilizator);
	}
	
	public int getTokenID() {
		return tokenID;
	}

	public CelulaTabel(int tokenID) {
		this.tokenID = tokenID;
	}

	public void setTokenID(int tokenID) {
		this.tokenID = tokenID;
	}

}
