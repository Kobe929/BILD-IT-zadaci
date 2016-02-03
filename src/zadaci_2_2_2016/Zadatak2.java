package zadaci_2_2_2016;

/*@author Filip Dautovic
 * 7.13 (Random number chooser) Write a method that returns a random number between
 1 and 54, excluding the numbers passed in the argument. The method header is
 specified as follows:
 public static int getRandom(int... numbers)
 */

import java.util.Random;

public class Zadatak2 {

	public static int getRandom(int... numbers) {

		// Random
		Random rand = new Random();

		// Random int 0 - 54
		int random = rand.nextInt(54);

		// Boolean za petlju
		boolean uslov = true;

		while (uslov) {
			// Prolaz kroz niz
			for (int i = 0; i < numbers.length; i++) {
				// Uslov, ako se broj nalazi u nizu ponovo se generise broj i
				// prolazi se kroz niz ispocetka
				if (numbers[i] == random || random == 0 || random == 1) {
					// Imao sam problem da se povremeno ispise 0 ili 1, pa sam
					// njih posebno iskljucio, patch takoreci, vjerovatno sam
					// napravio ocigledan propust
					random = rand.nextInt(54);
					i = 0;
					// i se vraca na 0

				} else {
					// Ako if uslov prodje, petlja se zavrsava
					uslov = false;
				}
			}

		}

		// I vraca se random
		return random;
	}

	public static void main(String[] args) {

		// Niz koji se salje, samo 50 fali
		int[] iskljuceni = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
				16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
				32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
				48, 49, 51, 52, 53, 54 };

		// int[] iskljuceni = {10, 15, 20, 25, 30, 35, 40, 45, 50};

		// Poziv metode
		System.out.println(getRandom(iskljuceni));
	}

}
