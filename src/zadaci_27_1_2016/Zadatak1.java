package zadaci_27_1_2016;

/*@author Filip Dautovic
 * (Izraèunavanje napojnice) Napisati program koji uèitava ukupan iznos raèuna koji treba uplatiti kao i 
 * procenat tog raèuna kojeg želimo platiti kao napojnicu te izraèunava ukupan raèun i napojnicu. Na primjer, 
 * ukoliko korisnik unese 10 kao raèun i 15 % kao procenat za napojnicu program treba da ispiše da je ukupan raèun 
 * za uplatiti 11.5 a napojnica 1.5. 
 */

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		// Novi skener
		Scanner ulaz = new Scanner(System.in);

		// Ulaz od korisnika
		System.out.println("Unesite iznos raèuna:");
		double a = ulaz.nextDouble();

		// Procenat od racuna za napojnicu
		System.out.println("Unesite procenat za napojnicu:");
		double b = ulaz.nextDouble();

		// Racunanje napojnice
		double c = b / 100 * a;

		// Ukupno
		double d = c + a;

		// Napojnica zaokružena na 2 decimale
		double e = (double) Math.round(c * 100) / 100;

		// Ukupno zaokruženo na 2 decimale
		double f = (double) Math.round(d * 100) / 100;

		//Ispis
		System.out.println("Ukupan raèun za uplatiti iznosi " + f
				+ " a napojnica iznosi " + e + ".");

		ulaz.close();
	}

}
