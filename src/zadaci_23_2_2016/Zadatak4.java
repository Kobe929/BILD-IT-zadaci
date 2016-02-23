package zadaci_23_2_2016;

/*@author Filip Dautovic
 * (Sum the digits in an integer using recursion) Write a recursive method that
computes the sum of the digits in an integer. Use the following method header:
public static int sumDigits(long n)
 For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program
that prompts the user to enter an integer and displays its sum
 */

import java.util.*;

public class Zadatak4 {

	// Metoda za ispis naopako
	public static int sumDigits(int value) {

		// Ako vrijednost padne na 0 ne ispisuje se vise
		if (value <= 0) {
			return 0;
		}

		// Vraca se posljednja cifra + sljedeca posljednja cifra
		return (value % 10) + sumDigits(value / 10);

	}

	public static void main(String[] args) {
		try {
			// Novi skener
			Scanner ulaz = new Scanner(System.in);

			// Ulaz od korisnika
			System.out.println("Unesite neki cjelobrojni broj:");
			int broj = ulaz.nextInt();

			// Poziv metode
			System.out.println(sumDigits(broj));

			// Zatvaranje skenera
			ulaz.close();

			// Ako je korisnik debil:
		} catch (InputMismatchException ex) {
			System.err.println("Cijelobrojni broj!");
		}

	}

}
