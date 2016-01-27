package zadaci_26_1_2016;

/*@author Filip Dautovic
 * Napisati metodu sa sljedeæim headerom: public static int isPrime(int n) koja provjerava da li je broj prost/prime. 
 * Napsati test program koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
 */

public class Zadatak3 {

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

		//Prolazak 1 - 100000
		for(int i = 1; i <= 100000; i++){
			if(isPrime(i)){			//Ako metoda vrati true ispisuje se broj
				System.out.println(i);
			}
		}
		
	}

}
