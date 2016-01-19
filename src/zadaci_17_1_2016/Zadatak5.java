package zadaci_17_1_2016;

import java.util.Scanner;

/*@author Filip Dautovic
 *Implementirati sljedeæu metodu da sortira redove u 2D nizu.
 *public static double[ ][ ] sortRows(double[ ][ ] array) 
 *Napisati testni program koji pita korisnika da unese 3x3 matricu 
 *(ili da pita korisnika koliku matricu želi unijeti) te mu ispisuje na konzoli matricu sa sortiranim redovima - 
 *od najmanjeg broja do najveæeg.
 */

public class Zadatak5 {

	public static double[][] sortRows(double[][] array) {
		
		//Sortiranje
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				java.util.Arrays.sort(array[j]);
			}
			
		}
		return array;
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		double[][] matrica = new double[3][3];

		
		System.out.println("Unesite elemente u matricu 3x3:");
		
		//Unos elemenata
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica.length; j++) {
				matrica[i][j] = ulaz.nextDouble();
			}
		}

		//Poziv metode
		double[][] matrica2 = sortRows(matrica);

		//Ispis
		for (int i = 0; i < matrica2.length; i++) {
			for (int j = 0; j < matrica2[i].length; j++) {
				System.out.print(matrica2[i][j] + " ");
			}
			System.out.println();
		}
		ulaz.close();
	}
	//Poludio, ne radi kako treba nego samo redove sortira. Born stupid :(
	 
}
