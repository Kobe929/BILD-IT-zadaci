package zadaci_18_1_2016;

import java.util.ArrayList;
import java.util.Scanner;

/*@author Filip Dautovic
 *  Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula prekida unos) te ispisuje 
 *  koliko je brojeva bilo iznad ili jednako prosjeku svih unešenih brojeva a koliko je bilo brojeva 
 *  ispod prosjeka. Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti 100.
 */

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		ArrayList<Integer> brojevi = new ArrayList<Integer>();

		int broj; //Varijabla za unos 
		int brojac = 0; // Pocetna vrijednost brojaca
		double prosjek; //Prosjek unesenih brojeva
		int veci = 0; //Varijabla za brojanje brojeva iznad prosjeka
		int manji = 0; //Varijabla za brojanje brojeva iznad prosjeka
		int jednako = 0; //Varijabla za brojeve jednake prosjeku
		int zbir = 0; //Zbir unesenih brojeva
		
		//Ispis korisniku da upiše brojeve
		System.out.println("Unesite brojeve (unos se prekida nulom):");

		//Unos brojeva i uslov za prekid
		for (int i = 0; i < 100; i++) {
			broj = ulaz.nextInt();
			if (broj != 0) {
				brojevi.add(broj);
				zbir += broj;
				brojac++;
			} else if (broj == 0)
				break;
		}

		//Raèunanje prosjeka
		prosjek = (double) zbir / (double) brojac;

		// Prolazak kroz listu i brojanje brojeva vecih, manjih i jednakih prosjeku
		for (int i = 0; i < brojevi.size(); i++) {
			if (brojevi.get(i) > prosjek) {
				veci++;
			} else if (brojevi.get(i) < prosjek) {
				manji++;
			} else if (brojevi.get(i) == prosjek) {
				jednako++;
			}
		}

		//Ispis rezultata
		System.out.println("Prosjek unesenih brojeva je " + prosjek + ".");
		System.out.println("Iznad prosjeka nalazi se " + veci
				+ " brojeva, ispod prosjeka " + manji + " a jednakih prosjeku "
				+ jednako + " brojeva.");

		ulaz.close();
	}
}