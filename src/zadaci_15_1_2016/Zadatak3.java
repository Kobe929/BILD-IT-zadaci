package zadaci_15_1_2016;

import java.util.Scanner;

/*@author Filip Dautovic
 * Napisati metodu koja prima dva cijela broja kao argumente te vraca najveci zajednicki djelilac za ta dva broja.
 */

public class Zadatak3 {

	public static void maxDjelilac(int a, int b) {

		int max = 0; //Varijabla koja ce cuvati vrijednost djelioca
		int x = a; //Varijabla x ce cuvati vrijednost manjeg broja
		if (a > b) //Ukoliko je drugi broj manji varijabla x preuzima njegovu vrijednost
			x = b;

		//Prolazak kroz niz 
		for (int i = 1; i < x; i++) {
			if ((a % i == 0) && (b % i == 0)) { //Uslov
				max = i;
			}
		}
		//Ispis
		System.out.println("Najveci djelilac za brojeve " + a + " i " + b + " je " + max);

	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		//Uzimanje brojeva od korisnika
		
		System.out.println("Unesite prvi broj:");
		int a = ulaz.nextInt();

		System.out.println("unesite drugi broj");
		int b = ulaz.nextInt();

		//Pozivanje metode
		maxDjelilac(a, b);
		
		ulaz.close();
	}

}