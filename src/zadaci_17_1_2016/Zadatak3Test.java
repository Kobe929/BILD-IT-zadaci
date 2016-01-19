package zadaci_17_1_2016;

/*@author Filip Dautovic
 * Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva te provjerava
 * da li su striktno identièni.
 */

import java.util.Scanner;

public class Zadatak3Test extends Zadatak3 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		// Pitanje korisnika za podatke o nizovima
		System.out.println("Koliko èlanova želite da prvi niz ima?");

		int a = ulaz.nextInt(); // Ovo æe biti dužina niza
		int[] niz1 = new int[a];

		System.out.println("Unesite èlanove prvog niza:");

		for (int i = 0; i < niz1.length; i++) { // Unos èlanova
			niz1[i] = ulaz.nextInt();
		}

		System.out.println("Koliko èlanova želite da drugi niz ima?");

		int b = ulaz.nextInt(); // Drugi niz
		int[] niz2 = new int[b];

		System.out.println("Unesite èlanove drugog niza:");

		for (int i = 0; i < niz2.length; i++) { // Unos clanova drugog niza
			niz2[i] = ulaz.nextInt();
		}

		// Poziv metode
		System.out.println(equals(niz1, niz2));

		ulaz.close();
	}

}
