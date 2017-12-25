package com.barosanu.model.beans;

import java.util.List;

import com.barosanu.model.ConstanteApplicatie;

public class Utilizator {

	private String name;
	private String observatii;
	private String password;
	private int ID;

	public Utilizator(String name, String pass,int Id) {
		this.name = name;
		this.setPassword(pass);
		this.ID = Id;
	}

	// PROGRAMARI:
	private List<Integer> programariSapt0;// saptamana curenta
	private List<Integer> programariSapt1;// saptamana viitoare
	private List<Integer> programariSapt2;// peste doua saptamani
	private List<Integer> programariSapt3;// peste 3 saptamanani

	// DISPONIBILITATE:
	private List<Integer> disponibiltateSapt0;// saptamana curenta
	private List<Integer> disponibiltateSapt1;// saptamana viitoare
	private List<Integer> disponibiltateSapt2;// peste doua saptamani
	private List<Integer> disponibiltateSapt3;// peste 3 saptamanani

	public int getAccesLevel() {
		return ConstanteApplicatie.ACCES_UTILIZATOR;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utilizator other = (Utilizator) obj;
		if (ID != other.ID)
			return false;
		return true;
	}

	public boolean equals(Utilizator altUtilizator) {
		if (altUtilizator == null) {
			return false;
		} else if (altUtilizator.ID == this.ID) {
			return true;
		} else {
			return false;
		}
	}

	public void vizualizeazaProgramareaProprie() {
	}

	public void vizualizeazaProgramari() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void adaugaProgramare(int idSaptamana, int token) {
		switch (idSaptamana) {
		case ConstanteApplicatie.SAPTAMANA_CURENTA:
			programariSapt0.add(token);
			break;
		case ConstanteApplicatie.SAPTAMANA_VIITOARE:
			programariSapt1.add(token);
			break;
		case ConstanteApplicatie.PESTE_2_SAPTAMANI:
			programariSapt2.add(token);
			break;
		case ConstanteApplicatie.PESTE_3_SAPTAMANI:
			programariSapt3.add(token);
			break;
		default:
			break;
		}
	}

	public void adaugaDisponibilitate(int idSaptamana, int token) {
		switch (idSaptamana) {
		case ConstanteApplicatie.SAPTAMANA_CURENTA:
			disponibiltateSapt0.add(token);
			break;
		case ConstanteApplicatie.SAPTAMANA_VIITOARE:
			disponibiltateSapt1.add(token);
			break;
		case ConstanteApplicatie.PESTE_2_SAPTAMANI:
			disponibiltateSapt2.add(token);
			break;
		case ConstanteApplicatie.PESTE_3_SAPTAMANI:
			disponibiltateSapt3.add(token);
			break;
		default:
			break;
		}
	}

	public void stergeDisponibilitate(int idSaptamana, int token) {
		switch (idSaptamana) {
		case ConstanteApplicatie.SAPTAMANA_CURENTA:
			disponibiltateSapt0.remove(token);
			break;
		case ConstanteApplicatie.SAPTAMANA_VIITOARE:
			disponibiltateSapt1.remove(token);
			break;
		case ConstanteApplicatie.PESTE_2_SAPTAMANI:
			disponibiltateSapt2.remove(token);
			break;
		case ConstanteApplicatie.PESTE_3_SAPTAMANI:
			disponibiltateSapt3.remove(token);
			break;
		default:
			break;
		}
	}

	public void anuleazaProgramare(int idSaptamana, int token) {
		switch (idSaptamana) {
		case ConstanteApplicatie.SAPTAMANA_CURENTA:
			programariSapt0.remove(token);
			break;
		case ConstanteApplicatie.SAPTAMANA_VIITOARE:
			programariSapt1.remove(token);
			break;
		case ConstanteApplicatie.PESTE_2_SAPTAMANI:
			programariSapt2.remove(token);
			break;
		case ConstanteApplicatie.PESTE_3_SAPTAMANI:
			programariSapt3.remove(token);
			break;
		default:
			break;
		}
	}

	public int getID() {
		return ID;
	}

	public String getObservatii() {
		return observatii;
	}

	public void setObservatii(String observatii) {
		this.observatii = observatii;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
