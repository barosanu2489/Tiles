package com.barosanu.model.tabel;



/**
 * Clasa ce contine valorile tokenilor celulelor
 * Acestea sunt doar o conventie pentru a face legatura intre celula, table si utilizatorii ei.
 * <br>
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
public interface ItokensValues {
	
	public static final int[] TOKENI_CELULE = new int[150];

}
