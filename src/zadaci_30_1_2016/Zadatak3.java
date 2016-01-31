package zadaci_30_1_2016;

/*@author Filip Dautovic
 *  Napisati program koji pita korisnika da unese Social Security Number (SSN) u formatu 
 *  DDD-DD-DDDD gdje D predstavlja broj. Program treba da provjerava da li je broj unesešen u 
 *  ispravnom formatu. Ukoliko nije, program pita korisnika da pokuša ponovo. Ukoliko jeste unešen u 
 *  pravom formatu, program završava sa radom.
 */

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		// Skener
		Scanner ulaz = new Scanner(System.in);

		// Za kontrolisanje petlje
		boolean q = true;

		while (q) {

			// Ulaz od korisnika i prebacivanje u niz karaktera
			System.out.println("Unesite vas ssn:");
			String ssn = ulaz.nextLine();
			char[] ssn2 = ssn.toCharArray();

			// Ako korisnik unese netacan broj karaktera
			if (ssn2.length != 11) {
				System.out
						.println("\nNedovoljno ili previse znakova. Pokusajte ponovo");
				continue;
			}

			// Ako korisnik unese sve ispravno
			if ((Character.isDigit(ssn2[0])) && (Character.isDigit(ssn2[1]))
					&& (Character.isDigit(ssn2[2]))
					&& (Character.isDigit(ssn2[4]))
					&& (Character.isDigit(ssn2[5]))
					&& (Character.isDigit(ssn2[7]))
					&& (Character.isDigit(ssn2[8]))
					&& (Character.isDigit(ssn2[9]))
					&& (Character.isDigit(ssn2[10])) && (ssn2[3] == '-')
					&& (ssn2[6] == '-')) {
				System.out.println("Uneseni ssn je ispravan.");
				q = false;

				// Ako korisnik unese 11 znakova ali neispravnog formata
			} else {
				System.out.println("\nProvjerite format. Pokusajte ponovo.");
				continue;
			}

		}
		ulaz.close();
	}
}