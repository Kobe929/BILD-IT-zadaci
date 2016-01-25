package zadaci_24_1_2016;

/*@author Filip Dautovic
 * Napisati program koji pita korisnika da unese dva stringa te provjerava i ispisuje da li je drugi string 
 * substring prvog stringa. Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao drugi 
 * string program mu ispisuje da je BC substring ABCD stringa.
 */

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		//Unos prvog stringa
		System.out.println("Unesite prvi string:");
		String string1 = ulaz.nextLine();

		//Unos drugog stringa
		System.out.println("Unesite drugi string:");
		String string2 = ulaz.nextLine();
		
		//Ispitivanje uslova i printanje rezultata
		if(string1.contains(string2)){
			System.out.println("Drugi string je substring prvog stringa");
		}
		
		ulaz.close();
	}

}
