package zadaci_20_1_2016;

/*@author Filip Dautovic
 * Napisati program koji uèitava iznos investicije, godišnju interesnu stopu i broj godina te vraæa 
 * buduæu vrijednost investicije koristeæi se sljedeæom formulom: 
 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
 * Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu i 1 kao broj 
 * godina program vam vraæa 1032.98 kao buducu vrijednost investicije.
 */

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		// Unos od korisnika
		System.out.println("Unesite iznos investicije:");
		double iznosInvesticije = ulaz.nextDouble();

		System.out.println("Unesite iznos godišnje interesne stope:");
		double godisnjaInteresnaStopa = ulaz.nextDouble();
		double mjesecnaInteresnaStopa = (godisnjaInteresnaStopa / 100) / 12;

		System.out.println("Unesite broj godina:");
		double brojGodina = ulaz.nextDouble();

		// Formula
		double buducaVrijednostInvesticije = iznosInvesticije
				* (Math.pow((1 + mjesecnaInteresnaStopa), (brojGodina * 12)));

		// Zaokruživanje
		buducaVrijednostInvesticije = (double) Math
				.round(buducaVrijednostInvesticije * 100) / 100;

		// Ispis rezultata
		System.out.println("Vrijednost investicije za " + brojGodina
				+ " godina bit ce " + buducaVrijednostInvesticije);

		ulaz.close();

	}

}
