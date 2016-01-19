package zadaci_17_1_2016;

/*@author Filip Dautovic
 * Napišite potom test program koji pita korisnika da unese deset brojeva te poziva ovu metodu 
 * da vrati najmanji element u nizu.
 */

import java.util.Scanner;

public class Zadatak2Test extends Zadatak2 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in); // Skener

		double[] testArray = new double[10]; // Niz koji æe se poslati metodi

		System.out.println("Unesite 10 decimalnih brojeva:"); // Ispis korisniku
																// da upiše
																// brojeve

		for (int i = 0; i < testArray.length; i++) {
			testArray[i] = ulaz.nextDouble(); // Unos podataka u niz
		}

		// Stampanje rezultata
		System.out.println("Najmanji broj u nizu je: " + min(testArray));

		ulaz.close();
	}

}
