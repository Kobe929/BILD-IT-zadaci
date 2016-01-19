package zadaci_18_1_2016;

import java.util.Scanner;

/*@author Filip Dautovic
 * Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem redosljedu: 
 * public static void displaySortedNumbers(double num1, double num2, double num3). 
 * Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u rastuæem redosljedu. 
 */

public class Zadatak3 {

	public static void displaySortedNumbers(double num1, double num2,
			double num3) {

		//Smještaanje brojeva u niz
		double[] niz = { num1, num2, num3 };
		double temp = 0;

		//Jedonstavni bubble sort
		for (int j = 0; j < niz.length; j++) {
			for (int i = 0; i < niz.length - 1; i++) {
				if (niz[i] > niz[i + 1]) {
					temp = niz[i];
					niz[i] = niz[i + 1];
					niz[i + 1] = temp;
				}
			}
		}

		//Štampanje rezultata
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");

		}
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		// Uzimanje 3 broja i poziv metode
		System.out.println("Unesite tri broja za sortiranje:");
		displaySortedNumbers(ulaz.nextDouble(), ulaz.nextDouble(),
				ulaz.nextDouble());

		ulaz.close();
	}

}
