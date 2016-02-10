package zadaci_8_2_2016;

/*@author Filip Dautovic
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written
 in the form 2p - 1 for some positive integer p. Write a program that finds
 all Mersenne primes with p … 100 and displays the output as shown below.
 (Hint: You have to use BigInteger to store the number, because it is too big to
 be stored in long. Your program may take several hours to run.)
 p 2^p – 1
 2 3
 3 7
 5 31
 */

import java.math.*;

public class Zadatak4 {

	public static void main(String[] args) {

		// Brojac za petlju, ako bi jednostavnoprolazili do 100 ne bi na ispisao
		// sve nego samo za 100 testiranih
		int brojac = 0;

		// Petlja radi dok se ne nadje 100 brojeva
		for (int i = 2; brojac < 100; i++) {
			// Ako je broj trenutno testiran prime
			if (isPrime(i)) {
				brojac++;
				// Povecava se brojac i ispisuje prime + mersenne prime tog
				// broja
				System.out.println(i + " " + getMersennePrime(i));
			}
		}

	}

	public static boolean isPrime(long n) {
		if (n == 1) { // Broj 1 se ne racuna
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) { // Ako je broj paran nije prost
				return false;
			}
		}
		return true; // Ako je broj "prosao" sve uslove onda se vraca true
	}

	// Metoda koja racuna mersenne
	public static BigDecimal getMersennePrime(int p) {

		// 2p - 1 iz zadatka
		return new BigDecimal(2).pow(p).subtract(BigDecimal.ONE);
	}
}
