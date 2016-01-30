package mini2CrapsAndCreditCards;

/*@author Filip Dautovic
 * mini2 Credit Card Validation
 */
import java.util.*;

public class CreditCards {

	public static void main(String[] args) {

		// Novi skener
		Scanner ulaz = new Scanner(System.in);

		// Ulaz od korisnika
		try {
			System.out.println("Unesite broj kartice: ");
			long broj = ulaz.nextLong();

			// Poziv metode za provjeru kartice
			if (isValid(broj)) {
				System.out.println("\nBroj kartice: " + broj + " je validan.");
			} else {
				System.out.println("\nBroj kartice: " + broj + " nije validan.");
			}

			//Najveæi problem programa su korisnici
		} catch (InputMismatchException ex) {
			System.out.println("Neispravan unos.");
			ulaz.close();
		}
	}

	
	public static boolean isValid(long number) {
		int total;

		//Ako je zbir duplih sa parnih mjesta i sa neparnih djeljiv sa 10, i prefix i duzina unesenog broja kartica je validna
		total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

		return (total % 10 == 0) && (prefixMatched(number, 1) == true)
				&& (getSize(number) >= 13) && (getSize(number) <= 16);
	}

	//Zbir duplih sa parnih mjesta
	public static int sumOfDoubleEvenPlace(long number) {
		int rezultat = 0;
		long temp = 0;

		while (number > 0) {
			temp = number % 100;
			rezultat += getDigit((int) (temp / 10) * 2);
			number = number / 100;
		}
		return rezultat;
	}

	//Razdjeljivanje na cifre
	public static int getDigit(int number) {
		if (number <= 9) {

			return number;

		} else if (number > 9)

			return (number % 10 + number / 10);

		return number;

	}

	//Zbir sa neparnih mjesta
	public static int sumOfOddPlace(long number) {
		int rezultat = 0;

		while (number != 0) {
			long temp = number % 10;
			rezultat = rezultat + (int) temp;
			number = number / 100;
		}

		return rezultat;

	}

	//Usporedjivanje prefiksa
	public static boolean prefixMatched(long number, int d) {

		if ((getPrefix(number, d) == 4) || (getPrefix(number, d) == 5)
				|| (getPrefix(number, d) == 37) || (getPrefix(number, d) == 6)) {

			if (getPrefix(number, d) == 4) {
				System.out.print("Visa kartica.");
			} else if (getPrefix(number, d) == 5) {
				System.out.print("Master card kartica.");
			} else if (getPrefix(number, d) == 37) {
				System.out.print("American express kartica.");
			} else if (getPrefix(number, d) == 6) {
				System.out.print("Discover kartica.");
			}

			return true;

		} else {

			return false;

		}
	}

	//Racunanje duzine broja
	public static int getSize(long d) {
		int brojac = 0;

		while (d > 0) {
			d = d / 10;

			brojac++;
		}

		return brojac;

	}

	//"Dobavljanje" prefiksa
	public static long getPrefix(long number, int k) {
		if (getSize(number) < k) {
			return number;
		} else {

			int size = (int) getSize(number);

			for (int i = 0; i < (size - k); i++) {
				number = number / 10;
			}

			return number;

		}
	}
}
