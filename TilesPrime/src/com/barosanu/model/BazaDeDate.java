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

	// TODO hardcoded for now
	public void restoreFromPersistence() {
		adaugaUtilizator(new Utilizator("PopescuIon", "1234", 1));
		adaugaUtilizator(new Utilizator("PopescuVasile", "1234", 2));
		adaugaUtilizator(new Utilizator("PopescuGigel", "1234", 3));
		adaugaUtilizator(new Utilizator("PopescuBibi", "1234", 4));
	}
	
	public Utilizator cautaUtilizator(String nume, String parola) {
		for(Utilizator utilizator: listaUtilizatori) {
			if(utilizator.getName().equals(nume)) {
				if (utilizator.getPassword().equals(parola)) {
					return utilizator;
				}
			}
		}
		System.out.println("Nu s-a gasit niciun utiliztor!!!!");
		return null;
		
	}

}
