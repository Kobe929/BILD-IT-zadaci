package zadaci_29_1_2016;

/*@author Filip Dautovic
 * Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju. Koristite sljedeæi header: 
 * public static int sumDigits(long n). Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 
 * (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
 */
public class Zadatak4 {

	public static int sumDigits(long n) {
		long x = n / 100; // Prva cifra
		long xy = n % 100; // Ostatak
		long y = xy / 10; // Od ostatka dobijemo drugu cifru
		long z = xy % 10; // I treæu

		long suma = x + y + z; // Rezultat
		int suma1 = (int) suma; // Konvertovanje long u int
		return suma1;

	}

	public static void main(String[] args) {

		System.out.println(sumDigits(234));
	}

}
