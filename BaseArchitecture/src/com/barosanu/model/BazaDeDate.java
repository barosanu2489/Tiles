package com.barosanu.model;

import java.util.ArrayList;
import java.util.List;

import com.barosanu.model.beans.Utilizator;
import com.barosanu.model.tabel.TabelProgramari;

public class BazaDeDate {

	
	private List<Utilizator> listaUtilizatori;
	private TabelProgramari tabelSaptCurenta;
	private TabelProgramari tabelSaptViitoare;
	private TabelProgramari tabelSapt2;
	private TabelProgramari tabelSapt3;
	
	
	
	public BazaDeDate() {
		listaUtilizatori = new ArrayList<Utilizator>();
		tabelSaptCurenta = new TabelProgramari(ConstanteApplicatie.SAPTAMANA_CURENTA);
		tabelSaptViitoare = new TabelProgramari(ConstanteApplicatie.SAPTAMANA_VIITOARE);
		tabelSapt2 = new TabelProgramari(ConstanteApplicatie.PESTE_2_SAPTAMANI);
		tabelSapt3 = new TabelProgramari(ConstanteApplicatie.PESTE_3_SAPTAMANI);
	}
	
	public void adaugaUtilizator(Utilizator user) {
		listaUtilizatori.add(user);
	}
	public void stergeUtilizator(Utilizator user) {
		listaUtilizatori.remove(user);
	}
	
	
	
	
	
	

}
