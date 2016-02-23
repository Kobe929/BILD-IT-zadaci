package zadaci_23_2_2016;

/*@author Filip Dautovic
 * (Print the digits in an integer reversely) Write a recursive method that displays
an int value reversely on the console using the following header:
public static void reverseDisplay(int value)
 */

import java.util.*;

public class Zadatak1 {

	// Metoda za ispis naopako
	public static void reverseDisplay(int value) {

		// Ako vrijednost padne na 0 ne ispisuje se vise
		if (value <= 0) {
			return;
		}

		// Stampa se posljednja cifra
		System.out.print(value % 10);

		// Ponovo se proslijedjuje broj ali bez zadnej cifre
		reverseDisplay(value / 10);

	}

	public static void main(String[] args) {

		try {
			// Novi skener
			Scanner ulaz = new Scanner(System.in);

			// Ulaz od korisnika
			System.out.println("Unesite neki cjelobrojni broj:");
			int broj = ulaz.nextInt();

			//Poziv metode
			reverseDisplay(broj);

			//Zatvaranje skenera
			ulaz.close();
			
			//Ako je korisnik debil:
		} catch (InputMismatchException ex) {
			System.err.println("Cijelobrojni broj!");
		}

	}

}
