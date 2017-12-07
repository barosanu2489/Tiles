package com.barosanu.model.tabel;

public class CelulaTabel {

	private int tokenID;
	private String programUser1;
	private String programUser2;

	public int getTokenID() {
		return tokenID;
	}

	public void setTokenID(int tokenID) {
		this.tokenID = tokenID;
	}

	public String getProgramUser1() {
		return programUser1;
	}

	public void setProgramUser1(String programUser1) {
		this.programUser1 = programUser1;
	}

	public String getProgramUser2() {
		return programUser2;
	}

	public void setProgramUser2(String programUser2) {
		this.programUser2 = programUser2;
	}

	@Override
	public String toString() {
		return "CelulaTabel [tokenID=" + tokenID + ", programUser1=" + programUser1 + ", programUser2=" + programUser2
				+ "]";
	}

}
