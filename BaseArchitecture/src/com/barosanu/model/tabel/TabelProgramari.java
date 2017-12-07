package com.barosanu.model.tabel;

public class TabelProgramari {
	
	/**
	 * @see ConstanteApplicatie-indicatori saptamana
	 * <br>
	 * {@value 1-4}
	 */
	private int saptamana;

	public int getSaptamana() {
		return saptamana;
	}

	public void setSaptamana(int saptamana) {
		this.saptamana = saptamana;
	}

	public TabelProgramari(int saptamana) {
		this.saptamana = saptamana;
	}
	
	

}
