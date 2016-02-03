package zadaci_2_2_2016;

/* @author Filip Dautovic
 * 7.7 (Count single digits) Write a program that generates 100 random integers between
 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
 say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */

public class Zadatak1 {

	public static void main(String[] args) {

		// Niz u koji æemo pohranjivati koliko se koji broj ponovio
		int[] brojac = new int[10];

		// Vrtimo 100 puta
		for (int i = 0; i < 100; i++) {

			// Generiše se random broj 100 puta
			int random = (int) (Math.random() * 10);

			// Zavisno od broja, povecava se broj na indeksu koji odgovara tom
			// broju
			brojac[random]++;
		}

		//Ispis
		for (int i = 0; i < brojac.length; i++) {
			System.out.println("Broj " + i + " se ponovio " + brojac[i]
					+ " puta.");
		}
	}

}
