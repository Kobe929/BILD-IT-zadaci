package zadaci_24_1_2016;

/*@author Filip Dautovic
 * Napisati metodu koja vraæa broj dana u godini. Metoda koristi sljedeæi header: 
 * public static int numberOfDayInAYear(int year). Napisati program koji pita korisnika da unese poèetnu godinu, 
 * krajnju godinu te ispisuje broj dana za svaku godinu u rasponu.
 */

import java.util.Scanner;

public class Zadatak1 {

	public static int numberOfDayInAYear(int year) {
		int days = 0; // Pocetni broj dana

		// Uslov ako je godina prijestupna onda ima 366 dana
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			days = 366;
		}
		// Ako nije ima 365
		else
			days = 365;
		
		return days;

	}

	public static void main(String[] args) {

		//Novi skener
		Scanner ulaz = new Scanner(System.in);

		//Ulaz od korisnika
		System.out.println("Unesite pocetnu godinu:");
		int pocetna = ulaz.nextInt();
		
		//Ulaz od korisnika
		System.out.println("Unesite krajnju godinu:");
		int krajnja = ulaz.nextInt();

		//Prolazimo kroz godine od unesene pocetne do unesene krajnje i ispisujemo koliko ima dana
		for (int i = pocetna; i <= krajnja; i++) {
			System.out.println(i + ". godina ima " + numberOfDayInAYear(i)
					+ " dana.");
		}
		
		ulaz.close();

	}

}
