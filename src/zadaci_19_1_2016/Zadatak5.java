package zadaci_19_1_2016;

/*@author Filip Dautovic
 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi header: 
 * public static int countLetters(String s). Napisati program koji pita korisnika da unese neki 
 * string te mu vrati koliko taj string ima slova.
 */

import java.util.Scanner;

public class Zadatak5 {

	public static int countLetters(String s){
		int broj = 0; //Poèetni broj slova
		
		char[] slova = s.toCharArray(); //Razlazemo string na elemente niza
		
		for(int i = 0; i < slova.length; i++){ //Prolazimo kroz niz
			if(slova[i] != ' '){  //Ukoliko elementi nisu space povecava se broj slova
			broj++;
			}
		}
		
		return broj; //Vracamo broj metodi
	}
	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		//Unos od korisnika
		System.out.println("Unesite string:");
		String s = ulaz.nextLine();

		ulaz.close();
		
		//Poziv metode i stampanje rezultata
		System.out.println("Uneseni string ima " +countLetters(s)+ " slova.");
	}

}
