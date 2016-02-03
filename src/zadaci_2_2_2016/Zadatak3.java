package zadaci_2_2_2016;

/*@author Filip Dautovic
 * (Pattern recognition: consecutive four equal numbers) Write the following
 method that tests whether the array has four consecutive numbers with the same
 value.
 public static boolean isConsecutiveFour(int[] values)
 Write a test program that prompts the user to enter a series of integers and displays
 if the series contains four consecutive numbers with the same value. Your
 program should first prompt the user to enter the input size—i.e., the number of
 values in the series.
 */

import java.util.Scanner;

public class Zadatak3 {

	// Metoda
	public static boolean isConsecutiveFour(int[] values) {

		// Prolazimo kroz niz do -3 clana niza jer ne mogu biti cetiri uzastopna
		// u 3 clana, a i zbog greske jer if gleda na nepostojeca mjesta
		for (int i = 0; i < values.length - 3; i++) {
			//Uslov, ako je clan na i i na jos 3 sljedeca clana isti onda imamo 4 uzastopna broja
			if (values[i] == values[i + 1] && values[i] == values[i + 2]
					&& values[i] == values[i + 3]) {
				return true; //Vraca se true
			}

		}
		return false;

	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		//Unos duzine od korisnika
		System.out.println("Unesite duzinu niza:");
		int[] niz = new int[ulaz.nextInt()];

		//Ako je unesena duzina niza manja od 4 program prestaje sa radom, logika
		if (niz.length < 4) {
			System.out.println("Niz mora biti duži od 4.");
			System.exit(0);
		}

		//Popunjavanje niza
		System.out.println("Unesite brojeve:");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = ulaz.nextInt();
		}

		//Poziv metode, ako je true ispisuje se da ima 4 uzastopna broja, ako je false ispisuje se da nema
		if (isConsecutiveFour(niz)) {
			System.out.println("Niz ima cetiri uzastopna broja.");
		} else {
			System.out.println("Niz nema cetiri uzastopna broja.");
		}

		ulaz.close();
	}

}
