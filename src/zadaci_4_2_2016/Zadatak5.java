package zadaci_4_2_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite broj redova i kolona:");
		int a = ulaz.nextInt();
		int b = ulaz.nextInt();
		
		//Nova matrica
		double[][] matrix = new double[a][b];

		//Popunjavanje
		System.out.println("Unesite vrijednosti u matricu:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ulaz.nextDouble();
			}
		}

		//Poziv klase i metode
		Location location = Location.locateLargest(matrix);

		//Ispis
		System.out.println("Najveci element u matrici je "
				+ location.maxValue + " na indeksu (" + location.row + "."
				+ location.column + ")");

		ulaz.close();
	}

}