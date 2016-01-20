package zadaci_19_1_2016;

/*@author Filip Dautovic
 * Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu. 
 */

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		// Novi skener
		Scanner ulaz = new Scanner(System.in);

		// Niz u koji æemo spremit brojeve
		int[] niz = new int[10];

		// Popunjavanje niza
		System.out.println("Unesite 10 cijelih brojeva:");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = ulaz.nextInt();
		}

		// Ispisivanje niza od indexa 9 do indexa 0
		System.out.println("Vaši brojevi naopako:");
		for (int i = niz.length - 1; i >= 0; i--) {
			System.out.print(niz[i] + " ");
		}
		
		ulaz.close();
	}

}
