package zadaci_21_1_2016;

/*@author Filip Dautovic
 * Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika da unese njihov zbir. 
 * Ukoliko korisnik pogriješi, program ispisuje pitanje ponovo sve sa porukom da pokuša ponovo.  
 * Ukoliko korisnik unese taèan odgovor, program mu èestita i završava sa radom.
 */

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		// Novi skener
		Scanner ulaz = new Scanner(System.in);

		// KReiranje 3 random broja 0 - 100
		int a = (int) ((Math.random() * 100));
		int b = (int) ((Math.random() * 100));
		int c = (int) ((Math.random() * 100));

		// Rezultat ta 3 broja
		int rezultat = a + b + c;

		// Rezultat koji ce korisnik unijeti
		int uneseniRezultat;

		do {

			// Ispis korisniku da unese rezultat
			System.out.println("Unesite zbir: " + a + " + " + b + " + " + c);

			// Unos rezultata
			uneseniRezultat = ulaz.nextInt();

			// Ako korisnik unese tacan rezultat program mu cestita i zavrsava
			if (rezultat == uneseniRezultat) {
				System.out.println("Cestitamo.");

				// Ako korisnik unese pogresan rezultat program ga pita da
				// ponovo unese rezultata
			} else if (rezultat != uneseniRezultat) {
				System.out.println("Pokusajte ponovo");
			}

		} while (rezultat != uneseniRezultat); // Petlja radi sve dok korisnik
												// ne unese tacan rezultat
		
		//Zatvaranje skenera
		ulaz.close();
	}

}
