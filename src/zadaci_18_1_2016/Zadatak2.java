package zadaci_18_1_2016;

/*@author Filip Dautovic
 * ISBN-10 (International Standard Book Number) se sadr�i od 10 brojeva: d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. 
 * Posljednji broj, d10, slu�i kao checksum i njega izra�unavamo iz prvih devet brojeva koriste�i se 
 * sljede�om formulom: (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. 
 * Ukoliko je checksum 10, zadnji broj ozna�avamo sa X u skladu sa ISBN-10 konvencijom. Napisati program 
 * koji pita korisnika da unese prvih 9 brojeva te ispi�e desetocifreni ISBN-10 broj. (Primjer: ukoliko unesemo, 
 * kao prvih 9 brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj. Ukoliko unesemo 013031997 kao 
 * prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
 */

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		// Kreiranje niza koji �e �uvati unesene brojeve
		int[] isbn = new int[9];

		System.out.println("Unesite 9 brojeva za ra�unanje ISBN: ");

		// Popunjavanje elementima
		for (int i = 0; i < isbn.length; i++) {
			isbn[i] = ulaz.nextInt();
		}

		// d10 je deseti broj koji �e se ra�unati
		int d10 = 0;

		// Ra�unanje brojeva od d1 do d9
		for (int i = 0; i < isbn.length; i++) {
			d10 += (isbn[i] * i);
		}

		// I onda taj sav halabuk % 11 i dobijamo d10
		d10 = d10 % 11;

		// Ako je d10 jednako 10
		if (d10 == 10) {
			for (int i = 0; i < isbn.length; i++) {
				System.out.print(isbn[i]);
			}
			System.out.print("X"); // Na kraju niza �tampa se X

			// Ako d10 nije 10
		} else {
			for (int i = 0; i < isbn.length; i++) {
				System.out.print(isbn[i]);
			}
			System.out.print(d10); // Onda se �tampa vrijednost d10

		}

		ulaz.close();
	}

}
