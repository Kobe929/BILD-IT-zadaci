package zadaci_17_1_2016;

/*@author Filip Dautovic
 * Napisati metodu koja prima 2 argumenta: po�etni broj i krajnji broj te printa sve proste brojeve u zadanom rangu.
 *  BONUS: metoda mo�e primati i tre�i argument, broj brojeva za isprintati po liniji.
 */

import java.util.Scanner;

public class Zadatak1 {

	
	public static void print(int a, int b, int c) {

		int brojac = 0; //Brojac brojeva u redu

		//Prolazak od pocetnog do krajnjeg broja
		for (int i = a; i <= b; i++) {
			System.out.print(i + " "); //�tampanje jednog broja i spacea
			brojac++;				   //Pove�avanje broja�a
			if (brojac == c) {         //Ako broja� do�e do vrijednosti une�enog broja c 
				System.out.println();  //Prelazi se u novi red
				brojac = 0;			   //I broja� se vra�a na nulu
			}
		}

	}

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		//Pitanje korisnika da unese po�etni, krajnji i broj brojeva po redu
		System.out.println("Upi�ite broj od kojeg �e se po�eti:");
		int a = ulaz.nextInt();
		
		System.out.println("Upi�ite broj do kojeg �e se ispisivati");
		int b = ulaz.nextInt();
		
		System.out.println("Upi�ite koliko �e brojeva biti po redu:");
		int c = ulaz.nextInt();
		
		//Poziv metode
		print(a,b,c);
		
		ulaz.close();

	}

}
