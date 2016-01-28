package zadaci_27_1_2016;

/*@author Filip Dautovic
 * Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj koji joj je proslijeðen kao argument: 
 * public static void reverse(int number). Na primjer, reverse(3456) treba da vrati 6543. Napisati program koji 
 * pita korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako.
 */

import java.util.Scanner;

public class Zadatak2 {
	
	
	public static void reverse(int broj) {
		
		int i = 0; //Varijabla koja ce se koristit u petlji
		
		System.out.print("Broj " + broj + " ispisan naopako je: ");
		
		while (broj != 0) { //Sve dok proslijedjeni broj nije nula
			i = broj % 10;
			broj /= 10;		//Uneseni broj se razlaze po ciframa 
			
			System.out.print(i); //I ispisuje od posljednje prema prvoj
		}
	}

	public static void main(String[] args) {
		
		//Novi skener
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite broj:");
		
		//Slanje unosa metodi
		reverse(ulaz.nextInt());
		
		ulaz.close();
		

	}

}
