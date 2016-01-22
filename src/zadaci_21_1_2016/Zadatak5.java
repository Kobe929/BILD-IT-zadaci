package zadaci_21_1_2016;

/*@author Filip Dautovic
 * Neke web stranice forsiraju odre�ena pravila za passworde. Napisati metodu koja provjerava da li je 
 * unijeti string validan password. Pravila da bi password bio validan su sljede�a: 1. Password mora 
 * biti sa�injen od najmanje 8 karaktera. 2. Password smije da se sastoji samo od slova i brojeva. 3. 
 * Password mora sadr�ati najmanje 2 broja. Napisati program koji pita korisnika da unese password te mu 
 * ispisuje "password je validan" ukoliko su sva pravila ispo�tovana ili "password nije validan" ukoliko 
 * pravila nisu ispo�tovana.
 */

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		// Novi skener
		Scanner ulaz = new Scanner(System.in);

		// Ulaz od korisnika
		System.out
				.println("Unesite va� password. 1. 8 karaktera. 2. slova i brojevi. 3. najmanje 2 broja");
		String password = ulaz.nextLine();

		// Ako je password kra�i od 8 karaktera ispisuje se da mora imati barem
		// 8 karaktera
		if (password.length() <= 7)
			System.out.println("Password mora imati najmanje 8 znakova.");

		// Ako ima 8 ili vi�e karaktera idemo dalje
		char c; // Varijabla koju cemo koristit u petlji
		int count = 1; // Brojac brojeva

		for (int i = 0; i < password.length() - 1; i++) { // Prolazak kroz
															// karaktere
			c = password.charAt(i); // jedan po jedan karakter se smje�taju
			// u c i ispituju

			if (!Character.isLetterOrDigit(c)) { // Ako karakter NIJE
				// broj
				// ili slovo ispisuje se
				// gre�ka
				System.out
						.println("Password mo�e sadr�avati samo slova i brojeve.");
			}

			if (Character.isDigit(c)) { // Ako su karakteri brojevi
				count++; // Broji se koliko ima brojeva

			}
		}

		if (count < 2) { // Ako ima manje od 2 broja ispisuje se
							// gre�ka
			System.out.println("Password mora sadr�avati najmanje 2 broja");
			System.exit(0);
		} else {
			// Ako je sve ok ispisuje se da je password ispravan
			System.out.println("Password je ispravan.");
		}

		ulaz.close();
	}
}
