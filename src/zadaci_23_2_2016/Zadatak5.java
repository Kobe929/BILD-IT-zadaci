package zadaci_23_2_2016;

/*@author Filip Dautovic
 * (Find the largest number in an array) Write a recursive method that returns the
largest integer in an array. Write a test program that prompts the user to enter a
list of eight integers and displays the largest element.
 */

import java.util.*;

public class Zadatak5 {

	// methodology
	public static int largestInt(int[] niz, int duzina, int poc) {

		// Ako je broj na indeksu 0 manji od broja na kraju, poc postaje taj
		// veci broj
		if (poc < niz[duzina]) {
			poc = niz[duzina];
			// ponovo se poziva metoda ali se duzina smanjuje za 1, jer smo
			// zadnji broj vec ispitali
			return largestInt(niz, duzina - 1, poc);
		}
		// Vraca se broj poslej svega
		return poc;
	}

	public static void main(String[] args) {

		try {
			// Novi skener
			Scanner ulaz = new Scanner(System.in);

			// Niz
			int[] niz = new int[8];

			// Popunjavanje niza
			System.out.println("Unesite 8 cijelih brojeva:");
			for (int i = 0; i < niz.length; i++) {
				niz[i] = ulaz.nextInt();
			}

			// Poziv metode i ispis
			System.out.println("Najveci broj u unesenom nizu je " + largestInt(niz, niz.length - 1, niz[0]));

			ulaz.close();

		} catch (InputMismatchException ex) {
			System.err.println("8 (nosam) cijelih brojeva telo.");
		}

	}

}
