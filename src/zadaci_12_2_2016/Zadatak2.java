package zadaci_12_2_2016;

/*@auhtorF ilip Dautovic
 * (Algebra: perfect square) Write a program that prompts the user to enter an integer
 m and find the smallest integer n such that m * n is a perfect square. (Hint:
 Store all smallest factors of m into an array list. n is the product of the factors that
 appear an odd number of times in the array list. For example, consider m = 90,
 store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
 in the array list. So, n is 10.)
 */

import java.util.*;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		// Unos broja od korisnika
		System.out.println("Unesite broj:");
		int m = ulaz.nextInt();

		// Ispis
		System.out.println("Najmanji broj koji cini da je uneseni broj " + m
				+ " pomnozen sa tim brojem je " + neparni(faktori(m)) + ".");

		ulaz.close();
	}

	// PRonalazenje faktora
	public static ArrayList<Integer> faktori(int n) {

		ArrayList<Integer> lista = new ArrayList<>();

		// Prosti faktori, pocinjemo od 2
		for (int i = 2; n > 1; i++) {

			if (n % i == 0) {
				lista.add(i);
				n /= i;
				i = 1;
			}
		}

		// Vracaju se faktori
		return lista;
	}

	// PRovjeramao da li se broj nalazi
	public static boolean itContains(ArrayList<Integer> list, int n) {
		for (Integer broj : list) {
			if (n == broj) {
				
				return true;
			}
		}
		// Ako ga nema vraca se false
		return false;
	}

	//
	public static int neparni(ArrayList<Integer> list) {

		// Lista u kojoj se cuvaju brojevi.
		ArrayList<Integer> neparniFaktori = new ArrayList<>();

		int faktorn = 1; // Varijabla koja ce cuvati broj koji trazimo

		// Prolazimo broz listu
		for (int i = 0; i < list.size(); i++) {
			int brojac = 1;
			for (int j = 0; j < list.size(); j++) {
				if (i != j) {
					// Ako se broj ponavlja brojac se povecava
					if (list.get(j) == list.get(i)) {
						brojac++;
					}
				}
			}

			// Uslov za dodavanje u listu
			if (!itContains(neparniFaktori, list.get(i)) && brojac % 2 != 0) {
				// Ako se broj nalazi u listi i nije na parnom mjestu dodaje se
				neparniFaktori.add(list.get(i));
			}
		}

		// Svaki int i iz liste se mnozi
		for (Integer i : neparniFaktori) {
			faktorn *= i;
		}
		// Vraca se broj koji trazimo
		return faktorn;
	}

}