package zadaci_1_2_2015;

/*@author Filip Dautovic
 * Napisati program koji prima karakter te vra�a njegov Unicode. Primjer: ukoliko korisnik unese karakter 
 * E program mu vra�a 69 kao unicode za taj karakter.
 */

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		// Boolean za petlju
		boolean uslov = true;

		// Petlja
		while (uslov) {

			// Ulaz od korisnika
			System.out
					.println("Unesite karakter da vidite na kojem je mjestu u ASCII kodu (� prekida program):");
			char slovo = ulaz.next().charAt(0);

			// Ako je unos ispravan ispisuje se na kojem je mjestu
			if ((int) slovo >= 1 && (int) slovo <= 127) {

				System.out.println("Karakter " + slovo + " nalazi se na "
						+ (int) slovo + " mjestu u ASCII kodu.");
			}

			// Ako se unese � petlja se prekida (zato �to se ne nalazi u
			// originalnom ASCII)
			else if (slovo == '�') {
				System.out.println("Hvala na koristenju.");
				break;
			}

			// Ako se unese nesto drugo idemo ispocetka
			else {
				System.out.println("Neispravan unos.");
			}

		}
		ulaz.close();
	}

}
