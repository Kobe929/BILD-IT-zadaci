package zadaci_24_1_2016;

/*@author Filip Dautovic
 * Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u stringu. 
 * Metoda treba da koristi sljedeæi header: public static int count(String str, char a). 
 * Na primjer, ukoliko pozovemo metodu na sljedeæi naèin: count("Welcome", e) metoda treba da vrati 2.
 *  Napisati program koji pita korisnika da unese string i koji karakter želi da prebroji u datom stringu te mu 
 *  ispiše koliko se puta odreðeni karakter ponovio u zadatom stringu.
 */

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite rijec:");
		String rijec = ulaz.nextLine();
		
		//Uzimanje slova od korisnika
		System.out
				.println("Unesite slovo koje zelite da prebrojite u rijeci:");
		char slovo = ulaz.next().charAt(0);
		
		//Ispisivanje rezultata i poziv metode
		System.out.println("Slovo " + slovo + " se u unesenoj rijeci ponavlja "
				+ count(rijec, slovo) + " puta.");

		ulaz.close();
	}

	public static int count(String str, char a) {

		int brojac = 0;
		//Prolazak kroz string
		for (int i = 0; i < str.length(); i++) {
			
			//Gledanje svakog karaktera u stringu
			char slovo = str.charAt(i);
			
			if (slovo == a) {
				brojac++;
			}
		}
		return brojac;
	}

}