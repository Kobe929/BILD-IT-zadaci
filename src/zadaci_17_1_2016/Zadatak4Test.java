package zadaci_17_1_2016;

/*@author Filip Dautovic
 * Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju najveæeg elementa u nizu.
 */

import java.util.Scanner;

public class Zadatak4Test extends Zadatak4 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		//Pitati korisnika za dimenzije
		System.out.println("Unesite broj redova:");
		int a = ulaz.nextInt();

		System.out.println("Unesite broj kolona:");
		int b = ulaz.nextInt();

		//Kreirati matricu sa dimenzijama koje je korisnik unijeo
		double[][] niz = new double[a][b];

		//Popunjavanje matrice
		System.out.println("Unesite brojeve u matricu:");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = ulaz.nextDouble();
			}
		}

		//Ispisivanje matrice radi preglednosti
		System.out.println("Vasa matrica izgleda ovako:");

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		//Smjestavanje vracenih vrijednosti u novi niz, zato sto sam smotan
		int[] returnedInfo = locateLargest(niz);

		//Stampanje rezultata
		System.out.println("Najveæi èlan nalazi se u " + returnedInfo[0]
				+ ". indeksu reda i  " + returnedInfo[1] + ". indeksu kolone");

		ulaz.close();
	}

}
