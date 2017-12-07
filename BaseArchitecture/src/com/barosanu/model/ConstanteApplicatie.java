package com.barosanu.model;

public class ConstanteApplicatie {
	
	//indicatori saptamana
	public static final int SAPTAMANA_CURENTA = 0;
	public static final int SAPTAMANA_VIITOARE = 1;
	public static final int PESTE_2_SAPTAMANI = 2;
	public static final int PESTE_3_SAPTAMANI = 3;
	
	//niveluri acces:
	
	/**
	 * Acces de baza:<br>
	 * - isi vizualizeaza propria programare;<br>
	 * - isi anuleaza propria programare;<br>
	 * - vizualizeaza programari;<br>
	 * - isi actualizeaza disponibiliatea<br>
	 * - isi actualizeaza propriile informatii
	 * 
	 */
	public static final int ACCES_UTILIZATOR = 0;
	
	/**
	 * In plus fata de utilizator:<br>
	 * - programeaza utilizatori
	 * - actualizeaza informatiile utilizatorilor
	 */
	public static final int ACCES_PROGRAMATOR = 1;
	
	/**
	 * In plus fata de programator:
	 * - adauga si sterge utilizatori
	 * - adauga informatii pe siteul programului
	 */
	public static final int ACCES_ADMINISTRATOR = 2;
	

}
