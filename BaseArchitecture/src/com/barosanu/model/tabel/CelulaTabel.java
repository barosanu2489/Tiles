package com.barosanu.model.tabel;

import com.barosanu.model.beans.Utilizator;

public class CelulaTabel {

	private int tokenID;
	private Utilizator[] utilizatori;
	
	public Utilizator getUtilizator1() {
		return utilizatori[0];
	}
	
	public Utilizator getUtilizator2() {
		return utilizatori[1];
	}
	
	public void setUtilizator1(Utilizator utilizator) {
		utilizatori[0] = utilizator;
	}
	
	public void setUtilizator2(Utilizator utilizator) {
		utilizatori[1] = utilizator;
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
