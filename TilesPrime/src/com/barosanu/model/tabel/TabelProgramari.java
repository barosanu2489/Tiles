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

	public void adaugaProgramare(int idCelula, Utilizator utilizator, int locUtilizator) {
		if (idCelula > NUMAR_MAXIM_PROGRAMARI || idCelula < 0) {
			return;
		}
		if (locUtilizator != CelulaTabel.UTILIZATOR1 || locUtilizator != CelulaTabel.UTILIZATOR2) {
			return;
		}
		if (celule[idCelula] == null) {
			celule[idCelula] = new CelulaTabel(idCelula);
		}
		celule[idCelula].setUtilizator(utilizator, locUtilizator);
		utilizator.adaugaProgramare(saptamana, idCelula);
	}

	public void stergeProgramare(int idCelula, int locUtilizator) {
		if (celule[idCelula] == null) {
			return;
		}
		if (locUtilizator != CelulaTabel.UTILIZATOR1 || locUtilizator != CelulaTabel.UTILIZATOR2) {
			return;
		}
		celule[idCelula].getUtilizator(locUtilizator).anuleazaProgramare(saptamana, idCelula);
		celule[idCelula].stergeUtilizator(locUtilizator);

	}

}
