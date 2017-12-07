package com.barosanu.model.tabel;

import com.barosanu.model.beans.Utilizator;

/**
 * Clasa ce contine valorile tokenilor celulelor Acestea sunt doar o conventie
 * pentru a face legatura intre celula, table si utilizatorii ei. <br>
 * Actual, in program sunt:<br>
 * 9 x 7 intrari la gara<br>
 * 6 x 7 intrari la livada<br>
 * 4 * 3 intrari sub Tampa<br>
 * 2 x 3 intrari Republicii<br>
 * 
 * Total: 123<br>
 * Lungimea vectorului de valori va fi 150;<br>
 *
 */
public class TabelProgramari {

	private static final int NUMAR_MAXIM_PROGRAMARI = 150;

	/**
	 * @see ConstanteApplicatie-indicatori saptamana <br>
	 *      {@value 1-4}
	 */
	private int saptamana;
	private CelulaTabel[] celule = new CelulaTabel[NUMAR_MAXIM_PROGRAMARI];

	public int getSaptamana() {
		return saptamana;
	}

	public void setSaptamana(int saptamana) {
		this.saptamana = saptamana;
	}

	public TabelProgramari(int saptamana) {
		this.saptamana = saptamana;
	}

	public void adaugaProgramare(int idCelula, Utilizator utilizator) {
		if (idCelula > NUMAR_MAXIM_PROGRAMARI || idCelula < 0) {
			return;
		}
		CelulaTabel celulaCurenta = celule[idCelula];
		if (celulaCurenta == null) {
			celulaCurenta = new CelulaTabel(idCelula);
		}
		if (celulaCurenta.getUtilizator1() == null) {
			celulaCurenta.setUtilizator1(utilizator);
			utilizator.adaugaToken(saptamana, idCelula);
		} else if (celulaCurenta.getUtilizator2() == null) {
			celulaCurenta.setUtilizator2(utilizator);
			utilizator.adaugaToken(saptamana, idCelula);
		}
	}
	
	public void stergeProgramare() {
		
	}

}
