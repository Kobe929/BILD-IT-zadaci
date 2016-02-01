package zadaci_1_2_2015;

/*Napisati program koji uèitava 10 brojeva te ispisuje koilko je jedinstvenih brojeva unijeto te sve jedinstvene 
 * brojeve koji su unijeti, razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo jednom.
 */

import java.util.*;

public class Zadatak5 {

	public static void main(String[] args) {

		// Novi hashset set, prvi put koristim
		HashSet<String> set = new HashSet<String>();

		// Novi skener
		Scanner ulaz = new Scanner(System.in);

		// Brojac jedinstvenih brojeva
		int brojac = 0;

		// Niz tipa string u koji cemo stavit brojeve
		String[] brojevi = new String[10];

		// popunjavanje niza
		System.out.println("Unesite 10 brojeva:");
		for (int i = 0; i < brojevi.length; i++) {
			brojevi[i] = ulaz.nextLine();
		}

		// Prolazimo kroz niz, ako je broj uspjesno dodat u hashset, znaci da
		// vec nema u setu, ispisuje se i povecava se brojac

		System.out.println("Jedinstveni brojevi su:");
		for (String broj : brojevi) {
			if (set.add(broj)) {
				System.out.print(broj + " ");
				// Brojac jedinstvenih
				brojac++;
			}
		}
		
		System.out.println("\nOd svih unesenih brojeva, jedinstvenih je "
				+ brojac);
		
		ulaz.close();
	}
}