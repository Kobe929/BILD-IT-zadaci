package zadaci_15_1_2016;

/*@author Filip Dautovic
 * Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela pretpostavka, znam). 
 * Napisati program koji pita korisnika da unese string te mu ispište broj samoglasnika i suglasnika u datom stringu.
 */

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		// Integeri koji æe sadržavati broj samoglasnika i suglasnika
		int samo = 0;
		int sugl = 0;

		Scanner ulaz = new Scanner(System.in);

		String recenica = ulaz.nextLine();

		// Konvertovanje iz stringa u niz karaktera malih slova
		char[] slova = (recenica.toLowerCase()).toCharArray();

		// Prolaženje kroz niz i brojanje samoglasnika i suglasnika
		for (int i = 0; i < slova.length; i++) {

			if (slova[i] == ' ') {
				i++; // Ako postoji prazno mjesto preskaèe se
			}
			// Brojanje samoglasnika
			if ((slova[i] == 'a') || (slova[i] == 'e') || (slova[i] == 'i') || (slova[i] == 'o') || (slova[i] == 'u')) {
				samo++;
				// I suglasnika
			} else {
				sugl++;
			}
		}
		// Ispisivanje rezultata u konzolu
		System.out.println("Unesena reèenica ima " + samo + " samoglasnika i " + sugl + " suglasnika.");
		ulaz.close(); // Zatvaranje skenera
	}

}
