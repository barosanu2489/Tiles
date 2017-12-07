package com.barosanu.model;

import java.util.ArrayList;
import java.util.List;

import com.barosanu.model.beans.ProgramUser;
import com.barosanu.model.tabel.TabelProgramari;

public class BazaDeDate {

	
	/**
	 * va fi chemata din persistenta
	 * pentru test voi hardcoda;
	 */
	private void initializare() {
		listaUtilizatori = new ArrayList<ProgramUser>();
		tabelSaptCurenta = new TabelProgramari(ConstanteApplicatie.SAPTAMANA_CURENTA);
		tabelSaptViitoare = new TabelProgramari(ConstanteApplicatie.SAPTAMANA_VIITOARE);
		tabelSapt2 = new TabelProgramari(ConstanteApplicatie.PESTE_2_SAPTAMANI);
		tabelSapt3 = new TabelProgramari(ConstanteApplicatie.PESTE_3_SAPTAMANI);
	}
	
	private List<ProgramUser> listaUtilizatori;
	private TabelProgramari tabelSaptCurenta;
	private TabelProgramari tabelSaptViitoare;
	private TabelProgramari tabelSapt2;
	private TabelProgramari tabelSapt3;
	
	
	
	public BazaDeDate() {
		initializare();
	}
	
	public void adaugaUtilizator(ProgramUser user) {
		listaUtilizatori.add(user);
	}
	public void stergeUtilizator(ProgramUser user) {
		listaUtilizatori.remove(user);
	}
	
	
	
	
	
	

}
