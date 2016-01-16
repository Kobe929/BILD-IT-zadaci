package zadaci_15_1_2016;

import java.util.ArrayList;
import java.util.Scanner;

/*@author Filip Dautovic
 * Napisati program koji ucitava niz brojeva, pronalazi najveci broj te ispisuje koliko se puta taj broj ponavlja. 
 * Pretpostavimo da se unos brojeva završava sa nulom.
 */
public class Zadatak5 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		// Kreiranje liste
		ArrayList<Integer> list = new ArrayList<Integer>();

		int broj = 1; // Pocetni broj, ne moze biti nula radi uslova
		int maxValue = 0; // Pocetna vrijednost
		int brojac = 0; // Pocetna vrijednost brojaca

		System.out.println("Unesite brojeve:");

		// Petlja za popunjavanje liste
		while (broj != 0) {
			broj = ulaz.nextInt();
			list.add(broj);
		}

		// Prolazak kroz listu i pronalazenje najveceg broja
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > maxValue) {
				maxValue = list.get(i);
			}
		}

		// Ispitivanje da li se najveci broj ponavlja i koliko
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == maxValue)
				brojac++;
		}

		System.out.println("Najveci broj je " + maxValue + " i pojavljuje se " + brojac + " puta.");

		ulaz.close();
	}
}