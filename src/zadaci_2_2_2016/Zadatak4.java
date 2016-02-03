package zadaci_2_2_2016;

/*
 * *8.1 (Sum elements column by column) Write a method that returns the sum of all the
 elements in a specified column in a matrix using the following header:
 public static double sumColumn(double[][] m, int columnIndex)

 Write a test program that reads a 3-by-4 matrix and displays the sum of each
 column. 
 */

import java.util.Scanner;

public class Zadatak4 {

	public static double sumColumn(double[][] m, int columnIndex) {

		//Zbir ce se koristiti u nizu
		double zbir = 0;

		//Prolazi se kroz kolonu i sabiraju se clanovi
		for (int i = 0; i < m.length; i++) {
			zbir += m[i][columnIndex];
		}

		return zbir;

	}

	public static void main(String[] args) {

		//Skener
		Scanner ulaz = new Scanner(System.in);
		
		//Matrica
		double[][] matrix = new double[3][4];
		
		//Popunjavanje matrice
		System.out.println("Unesite èlanove matrice 4 kolone, 3 reda:");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				matrix[i][j] = ulaz.nextDouble();
			}
		}
		
		ulaz.close();
		
		//Pozivanje metode nad svakom kolonom, i ispis
		System.out.println("Zbir èlanova kolone 0 je: " +sumColumn(matrix, 0));
		System.out.println("Zbir èlanova kolone 1 je: " +sumColumn(matrix, 1));
		System.out.println("Zbir èlanova kolone 2 je: " +sumColumn(matrix, 2));
		System.out.println("Zbir èlanova kolone 3 je: " +sumColumn(matrix, 3));
	
	
	}

}
