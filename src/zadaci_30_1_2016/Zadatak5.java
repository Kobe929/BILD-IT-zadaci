package zadaci_30_1_2016;

/*@author Filip Dautovic
 *  Napisati program koji pita korisnika da unese cijeli broj te ispisuje piramidu svih brojeva do tog broja. (Na primjer, ukoliko korisnik 
 *  unese 7 vrh piramide je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
 */

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		// Skener
		Scanner ulaz = new Scanner(System.in);

		// Ulaz od korisnika
		System.out.println("Unesite visinu piramide:");
		int visina = ulaz.nextInt();

		for (int i = 1; i <= visina; i++) {

			// Stampanje praznih mjesta
			for (int j = 1; j <= visina - i; j++) {
				System.out.printf("%2s", " ");
			}
			// STampanje lijevog dijela
			for (int k = i; k >= 1; k--) {
				System.out.printf("%2d", k);
			}
			// Stampanje desnog dijela
			for (int k = 2; k <= i; k++) {
				System.out.printf("%2d", k);
			}
			// Nova linija
			System.out.println();
		}

		ulaz.close();
	}
}