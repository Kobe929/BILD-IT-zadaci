package zadaci_26_1_2016;

/*@author Filip Dautovic
 * Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te broji i ispisuje koliko je koji broj puta unijet. 
 * Pretpostavimo da nula prekida unos brojeva. Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58 2 6 0 program 
 * nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd.
 */

import java.util.*;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		int[] brojevi = new int[100]; // Niz za brojeve

		// Ispis korisniku
		System.out
				.println("Unesite cijele brojeve izmedju 0 i 100 (Nula prekida unos):");

		// Popunjavanje niza
		for (int i = 0; i < brojevi.length; i++) {
			int a = ulaz.nextInt();
			brojevi[a] = brojevi[a] + a; // u zavisnosti od unesenog broja na to
											// mjesto u nizu se stavlja taj
											// broj, ako se broj ponovo uunese
											// vrijednosti se sabiraju
			if (a == 0)
				break; // Ako se unese nula petlja zavrsava
		}

		for (int i = 1; i < brojevi.length; i++) {
			if (brojevi[i] != 0) {
				System.out.println("Broj " +i+ " je unesen " + brojevi[i] / i + " puta.");
				// Ao je na neko mjesto broj unesen vise puta, vrijednost ce
				// biti taj broj puta toliko puta, stoga dijeljenjem te
				// vrijednosti sa i dobivamo koliko je puta broj unesen
			}
		}

		ulaz.close();
	}

}
