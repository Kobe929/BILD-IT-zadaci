package zadaci_25_1_2016;

import java.util.Scanner;

/*@author Filip Dautovic
 * Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu) te ispiše korisniku koliko 
 * je to u godinama i danima. Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.  
 */

public class Zadatak4 {

	public static void main(String[] args) {

		// Ulaz minuta od korisnika
		System.out.println("Unesite broj minuta:");
		Scanner ulaz = new Scanner(System.in);
		long minute = ulaz.nextLong();

		long godine = minute / (365 * 24 * 60); // Raèunanje godina
		long ostaloMinuta = minute % (365 * 24 * 60); // Ostatak minuta od
														// godina
		long dani = ostaloMinuta / (24 * 60); // Dani u ostalim minutama

		// Ispis rezultata
		System.out.println(minute + " minuta iznosi " + godine + " godine i "
				+ dani + " dana.");

		ulaz.close();
	}

}
