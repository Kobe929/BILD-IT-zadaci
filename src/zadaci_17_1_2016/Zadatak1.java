package zadaci_17_1_2016;

/*@author Filip Dautovic
 * Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj te printa sve proste brojeve u zadanom rangu.
 *  BONUS: metoda može primati i treæi argument, broj brojeva za isprintati po liniji.
 */

import java.util.Scanner;

public class Zadatak1 {

	
	public static void print(int a, int b, int c) {

		int brojac = 0; //Brojac brojeva u redu

		//Prolazak od pocetnog do krajnjeg broja
		for (int i = a; i <= b; i++) {
			System.out.print(i + " "); //Štampanje jednog broja i spacea
			brojac++;				   //Poveæavanje brojaèa
			if (brojac == c) {         //Ako brojaè doðe do vrijednosti unešenog broja c 
				System.out.println();  //Prelazi se u novi red
				brojac = 0;			   //I brojaè se vraæa na nulu
			}
		}

	}

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		//Pitanje korisnika da unese poèetni, krajnji i broj brojeva po redu
		System.out.println("Upišite broj od kojeg æe se poèeti:");
		int a = ulaz.nextInt();
		
		System.out.println("Upišite broj do kojeg æe se ispisivati");
		int b = ulaz.nextInt();
		
		System.out.println("Upišite koliko æe brojeva biti po redu:");
		int c = ulaz.nextInt();
		
		//Poziv metode
		print(a,b,c);
		
		ulaz.close();

	}

}
