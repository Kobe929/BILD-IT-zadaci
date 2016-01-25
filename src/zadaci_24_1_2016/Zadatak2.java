package zadaci_24_1_2016;

/*@author Filip Dautovic
 *  Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na primjer, brojevi 3 i 5 su twin primes, 
 *  brojevi 5 i 7 i 11 i 13 su takoðer twin primes. Napisati program koji ispisuje sve twin prime brojeve manje od 
 *  10000, 10 parova po liniji.
 */

public class Zadatak2 {

	//Metoda koja gleda da li je broj prost
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	//Metoda koja gleda da li jebroj i broj+2 prost i ispisuje ih
	public static void twinPrimes() {
		// int brojac = 0;
		for (int i = 2; i <= 10000 - 2; i++) {
			// brojac++;
			int num1 = i;
			int num2 = i + 2;
			if (isPrime(num1) && isPrime(num2)) {
				System.out.println(num1 + " " + num2);
				//Kada pokusam ispisat 10 po redu kod pobudali, i izgleda ruzno, jbg
				/*
				 * if (brojac == 10) { System.out.println();
				 * System.out.println(); brojac = 0; }
				 */
			}
		}
	}

	public static void main(String[] args) {

		twinPrimes();
	}
}