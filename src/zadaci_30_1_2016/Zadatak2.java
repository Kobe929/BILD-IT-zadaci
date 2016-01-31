package zadaci_30_1_2016;

/*@author Filip Dautovic
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje dužinu tog stringa kao i prvo slovo stringa. 
 */

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		//Skener
		Scanner ulaz = new Scanner(System.in);
		
		//Ulaz od korisnika
		System.out.println("Unesite string:");
		String rijec = ulaz.nextLine();
		
		//Strpavanje i razlaganje stringa u niz karaktera
		char[] slova = rijec.toCharArray();
		
		//Ispis
		System.out.println("Duzina unesenog stringa je "+slova.length+ " slova, a prvo slovo je " +slova[0]);
	
		ulaz.close();
	}

}
