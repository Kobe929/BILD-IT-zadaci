package zadaci_29_1_2016;

import java.util.Random;
import java.util.Scanner;

/*@author Filip Dautovic
 * Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim headerom: public static void printMatrix(int n). 
 * Svaki element u matrici je ili 0 ili 1, nasumièno generisana. Napisati test program koji pita korisnika da unese broj n 
 * te mu ispiše n x n matricu u konzoli.
 */
public class Zadatak5 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		// Pitanje korisnika
		System.out.println("Upišite velièinu matrice:");
		int a = ulaz.nextInt();

		// Pozivanje metode
		printMatrix(a);

		ulaz.close();
	}

	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n]; // Kreiranje matrice

		Random broj = new Random(); // Kreiranje jednog random broja

		// Ispunjavanje matrice
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// Ako je random broj manji od 0.5 upisuje se 1, ako je veæ
				// upisuje se 0
				if (broj.nextDouble() <= 0.5) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = 0;
				}
			}
		}
		// Ispis matrice
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
