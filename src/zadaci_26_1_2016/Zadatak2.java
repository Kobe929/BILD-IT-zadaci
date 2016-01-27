package zadaci_26_1_2016;

/*@author Filip Dautovic
 * Napisati program koji pita korisnika da unese dva cijela, pozitivna broja te ispisuje najveæi i 
 * najmanji zajednièki djelilac za ta dva broja.
 */

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		// Unos od korisnika
		System.out.println("Unesite prvi broj:");
		int a = ulaz.nextInt();

		System.out.println("Unesite drugi broj:");
		int b = ulaz.nextInt();

		// Ispis i poziv metoda
		System.out.println("Najveci djelilac je: " + najveciDjelilac(a, b));
		System.out.println("Najmanji djelilac je: " + najmanjiDjelilac(a, b));

		ulaz.close();
	}

	// Metoda za nalazenje najveceg djelioca
	public static int najveciDjelilac(int a, int b) {

		while (a != 0 && b != 0) {
			int c = b;
			b = a % b;
			a = c;
		}
		return a + b;

	}

	// Metoda za nalazenje najmanjeg djelioca
	public static int najmanjiDjelilac(int a, int b) {

		int minDjelilac = a * (b / najveciDjelilac(a, b));
		return minDjelilac;
	}
}
