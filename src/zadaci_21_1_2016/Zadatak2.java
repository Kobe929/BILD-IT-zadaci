package zadaci_21_1_2016;

/*@author Filip Dautovic
 * Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše broj dana u datom mjesecu. 
 * Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2, program treba ispisati da je Februar 2012 
 * imao 29 dana. Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan. 
 */

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		// Novi skener
		Scanner ulaz = new Scanner(System.in);

		// Ulaz od korisnika
		System.out.println("Unesite godinu:");
		int godina = ulaz.nextInt();

		System.out.println("Unesite mjesec:");
		int mjesec = ulaz.nextInt();

		// Spisak mjeseci æe biti u jednom nizu
		String[] mjeseci = { "Januar", "Februar", "Mart", "April", "Maj",
				"Juni", "Juli", "August", "Septembar", "Oktobar", "Novembar",
				"Decembar" };

		// Spisak dana u drugom nizu
		int[] dani = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Provjera da li je unešen februar, i da li je godina prijestupna
		if ((mjesec == 2)
				&& ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0))) {
			System.out.println("Mjesec Februar " + godina + ". ima 29 dan/a.");

			// Ako nije ispisuje se mjesec sa unešenog indeksa - 1 i broj dana
			// sa unešenog - 1
		} else {
			System.out.println("Mjesec " + mjeseci[mjesec - 1] + " " + godina
					+ ". ima " + dani[mjesec - 1] + " dan/a.");

		}

		ulaz.close();

	}

}
