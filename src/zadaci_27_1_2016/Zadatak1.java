package zadaci_27_1_2016;

/*@author Filip Dautovic
 * (Izra�unavanje napojnice) Napisati program koji u�itava ukupan iznos ra�una koji treba uplatiti kao i 
 * procenat tog ra�una kojeg �elimo platiti kao napojnicu te izra�unava ukupan ra�un i napojnicu. Na primjer, 
 * ukoliko korisnik unese 10 kao ra�un i 15 % kao procenat za napojnicu program treba da ispi�e da je ukupan ra�un 
 * za uplatiti 11.5 a napojnica 1.5. 
 */

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		// Novi skener
		Scanner ulaz = new Scanner(System.in);

		// Ulaz od korisnika
		System.out.println("Unesite iznos ra�una:");
		double a = ulaz.nextDouble();

		// Procenat od racuna za napojnicu
		System.out.println("Unesite procenat za napojnicu:");
		double b = ulaz.nextDouble();

		// Racunanje napojnice
		double c = b / 100 * a;

		// Ukupno
		double d = c + a;

		// Napojnica zaokru�ena na 2 decimale
		double e = (double) Math.round(c * 100) / 100;

		// Ukupno zaokru�eno na 2 decimale
		double f = (double) Math.round(d * 100) / 100;

		//Ispis
		System.out.println("Ukupan ra�un za uplatiti iznosi " + f
				+ " a napojnica iznosi " + e + ".");

		ulaz.close();
	}

}
