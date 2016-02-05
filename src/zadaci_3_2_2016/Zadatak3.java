package zadaci_3_2_2016;

import java.util.Random;

/*
 * (Largest row and column) Write a program that randomly fills in 0s and 1s into
 a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
 most 1s. 
 */

public class Zadatak3 {

	public static void main(String[] args) {

		int[][] matrix = new int[4][4]; // Kreiranje matrice

		Random broj = new Random(); // Kreiranje jednog random broja

		// Ispunjavanje matrice
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
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
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		int maxRed = 0;
		int maxKolona = 0;
		int indexReda = 0;
		int indexKolone = 0;
		int countRed;
		int countKolona;

		// Prolazimo kroz matricu
		for (int i = 0; i < matrix.length; i++) {
			countRed = 0; // Resetovanje kod svakog prolaska
			countKolona = 0;
			for (int j = 0; j < matrix.length; j++) {

				// ako je broj u redu 1, povecava se brojac jedinica
				if (matrix[i][j] == 1) {
					countRed++;
				}

				// ako je broj u koloni 1 povecava se brojac
				if (matrix[j][i] == 1) {
					countKolona++;
				}
			}

			if (countRed >= maxRed) {
				maxRed = countRed;
				// Ako je u sljedeæem redu više jedinica, pamti se koji je to
				// red
				indexReda = i;
			}

			if (countKolona >= maxKolona) {
				maxKolona = countKolona;
				// Ako je u sljedeæoj koloni više jedinica, pamti se koja je
				// kolona
				indexKolone = i;
			}
		}
		// ispis rezultata
		System.out.println();
		System.out.println("The largest row index: " + indexReda);
		System.out.println("The largest column index: " + indexKolone);

	}
}
