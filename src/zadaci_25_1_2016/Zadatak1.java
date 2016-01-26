package zadaci_25_1_2016;

/*@author Filip Dautovic
 * Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u abecednom redu. 
 * Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, program vraæa 
 * Atlanta, Chicago, Los Angeles.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Zadatak1 {

	public static void main(String[] args) {

		//Novi skener
		Scanner ulaz = new Scanner(System.in);

		//Nova lista za gradove
		ArrayList<String> gradovi = new ArrayList<>();

		//Ulaz od korisnika za gradove
		System.out.println("Unesite prvi grad:");
		gradovi.add(ulaz.nextLine());

		System.out.println("Unesite drugi grad:");
		gradovi.add(ulaz.nextLine());

		System.out.println("Unesite treci grad:");
		gradovi.add(ulaz.nextLine());

		//Sortiranje pomocu collections frameworka i metode sort
		Collections.sort(gradovi);

		//Ispis gradova
		System.out.println("Gradovi u abecednom redu:");
		for (String grad : gradovi) {
			System.out.println(grad);
		}

		ulaz.close();

	}

}
