package zadaci_20_1_2016;

/*@author Filip Dautovic
 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u rasponu godina koje korisnik unese. 
 * Program pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu. 
 * Razmak izmeðu godina treba biti jedan space. 
 */

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {

		Scanner ulaz = new Scanner(System.in);

		// Unos godine od koje se racuna
		System.out.println("Unesite pocetnu godinu:");
		int pocetna = ulaz.nextInt();

		// Unos godine do koje se racuna
		System.out.println("Unesite zavrsnu godinu:");
		int zavrsna = ulaz.nextInt();

		int godine = 0; // Brojac godina
		int brojac = 0; // Brojac redova

		System.out.println("Prijestupne godina izmeðu " + pocetna + ". i "
				+ zavrsna + ". :");

		// Prolazimo kroz godine
		for (int i = pocetna; i <= zavrsna; i++) {

			// Uslov za prijestupnu godinu
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {

				System.out.print(i + " "); // Štampanje godina
				Thread.sleep(150);  // Malo usporeno da ne bole oèi
				godine++; // Poveæavanje brojaèa godina
				brojac++; // Poveæavanje brojaèa redova

				// Ogranièavanje redova
				if (brojac == 10) {
					System.out.println();
					brojac = 0;
				}

			}

		}

		// Ispis rezultata
		System.out.println();
		System.out.println("Ukupan broj prijestupnih godina izmeðu " + pocetna
				+ ". i " + zavrsna + ". je " + godine + " .");
		
		ulaz.close();
	}

}
