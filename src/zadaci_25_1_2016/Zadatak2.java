package zadaci_25_1_2016;

/*@author Filip Dautovic
 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljuæujuæi i 2 i 1000. Program treba da 
 * ispiše 8 brojeva po liniji te razmak izmeðu brojeva treba da bude jedan space.
 */

public class Zadatak2 {

	// Metoda koja ispituje da li je broj prost
	public static boolean isPrime(int n) {
		if (n == 1) { // Broj 1 se ne racuna
			return false;
		}
		for (int i = 2; i < n; i++) { // Prolazi se od broja 2 do broja 8000 (iz
										// for petlje)
			if (n % i == 0) { // Ako je broj paran nije prost
				return false;
			}
		}
		return true; // Ako je broj "prosao" sve uslove onda se vraca true
	}

	public static void main(String[] args) {

		int brojac = 0; // Brojac redova

		for (int i = 2; i <= 8000; i++) { // Prolazi se kroz brojeve od 2 do
											// 8000
			if (isPrime(i)) { // Brojevi se proslijedjuju metodi
				System.out.print(i + " "); // Ako se vrati boolean true stampa
											// se broj
				brojac++; // Brojac se povecava za svaki ispisani prime
				if (brojac == 8) {
					System.out.println(); // Ako se ispise 8 brojeva u redu
											// prelazi se u sljedeci red i
											// brojac se resetuje
					brojac = 0;
				}
			}
		}

	}

}
