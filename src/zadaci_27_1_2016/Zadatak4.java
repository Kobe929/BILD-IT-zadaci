package zadaci_27_1_2016;

/*@author Filip Dautovic
 *  Palindrome prime je prosti broj koji je takoðer i palindrom. Na primjer, 131 je palindrome prime, kao i brojevi 
 *  313 i 757. Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji. 
 */

// POTPUNO ISTI KAO TRECI ZADATAK; SAMO STO JE U IF UMJESTO ! STAVLJENO =
 
public class Zadatak4 {
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

		public static int reverse(int broj) {

			int reverse = 0; // Varijabla koja ce se koristit u petlji

			while (broj != 0) { // Sve dok proslijedjeni broj nije nula
				reverse = reverse * 10 + broj % 10;
				broj /= 10; // Uneseni broj se razlaze po ciframa, skroz desna cifra
							// postaje reverse i pomjera se za jedno mjesto lijevo

			}
			// Vraca se okrenuti broj
			return reverse;
		}
	public static void main(String[] args) {
		
		int brojac = 0; // Brojac redova
		int brojacEmirp = 0; // Brojac emirp brojeva
		int i = 1; // Broj koji se ispituje

		while (brojacEmirp <= 100) { // Petlja radi dok broj izracunatih brojeva
										// ne bude 100
			if (isPrime(i) && isPrime(reverse(i)) && i == reverse(i)) { // Ispituje
																		// se da
																		// li je
																		// broj
																		// prime,
																		// da li
																		// je
																		// prime
																		// kad
																		// je
																		// kontra
																		// i da
																		// li je
																		// palindrom
				System.out.print(i + " ");
				brojacEmirp++; // Stampanje broja, povecavanje brojaca redova i
								// brojaca isprintanih brojeva
				brojac++;

				// Novi red
				if (brojac == 10) {
					System.out.println();
					brojac = 0;
				}
			}
			i++; // Povecavanje broja koji se ispituje
		}
	}

}
