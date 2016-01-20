package zadaci_19_1_2016;

/*@author Filip Dautovic
 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveæi zajednièki prefix za ta dva stringa, 
 * ukoliko isti postoji. Na primjer, ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai" i 
 * "Dobrodošli u Vankuver" program treba da ispiše: Najveæi zajednièki prefix za dva stringa je "Dobrodošli u". 
 */

import java.util.Scanner;
import java.util.*;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		// Uzimamo prvu recenicu od korisnika
		System.out.println("Unesite prvu reèenicu:");
		String recenica1 = ulaz.nextLine();

		// Uzimamo drugu recenicu od korisnika
		System.out.println("Unesite drugu reèenicu:");
		String recenica2 = ulaz.nextLine();

		// Smjestavamo sadrzaj prve recenice u niz dijeleci ga na svakom spaceu
		String[] razlozena1 = recenica1.split(" ");

		// Razlazemo i drugu
		String[] razlozena2 = recenica2.split(" ");

		// Lista koja ce sadrzavati jednake clanove
		ArrayList<String> zajednicke = new ArrayList<String>();

		// Prolazimo kroz prvu recenicu i ispitujemo ima li istih clanova kao i
		// druga
		for (int i = 0; i < razlozena1.length; i++) {
			if (razlozena1[i].contentEquals(razlozena2[i])) {
				zajednicke.add(razlozena1[i]); // Ako ima, prebacujemo ih u
												// listu
			} else
				break; // Imao sam bug, a mozda i feature :D da je program
						// printao sve iste rijeci ne samo prefikse pa sam ga
						// brejkao
		}

		// U slucaju da nema zajednickih prefiksa
		if (zajednicke.isEmpty()) {
			System.out.println("Nema zajednickih prefiksa.");
		} else {
			System.out.println("Zajednièki prefiksi su:"); // Ako ima, stampaju
															// se
			for (int i = 0; i < zajednicke.size(); i++) {
				System.out.print(zajednicke.get(i) + " ");
			}

		}

		ulaz.close();
	}
}