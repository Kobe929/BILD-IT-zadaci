package zadaci_23_2_2016;

/*@author Filip Dautovic
 * (Occurrences of a specified character in a string) Write a recursive method that
finds the number of occurrences of a specified letter in a string using the following
method header:
public static int count(String str, char a)
 For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string and a character, and displays the number of
occurrences for the character in the string.
 */

import java.util.*;

public class Zadatak3 {

	// Methodie
	public static int count(String str, char a) {

		// Ako dužina stringa padne na 0, rekurzija se zavrsava
		if (str.length() == 0) {
			return 0;
		}

		// Privremeni substring od str
		String temp = str.substring(1);

		// Ako se karakter nalazi na indeksu 0 stringa pponovo se poziva metoda
		// sa +1
		if (str.charAt(0) == a) {
			return count(temp, a) + 1;
		} else {
			// Ako se ne nalazi ponovo se poziva metoda
			return count(temp, a);
		}
	}

	public static void main(String[] args) {

		//Novi skener
		Scanner ulaz = new Scanner(System.in);

		//Ulaz od korisnika
		System.out.println("Unesite rijec:");
		String rijec = ulaz.nextLine();

		System.out.println("Unesite slovo:");
		String charTemp = ulaz.nextLine();
		char slovo = charTemp.charAt(0); 
		
		//Pozive metode i ispis
		System.out.println("Slovo " +slovo+ " se u rijeci " +rijec+ " nalazi " +count(rijec, slovo)+ " puta.");

		ulaz.close();
	}

}
