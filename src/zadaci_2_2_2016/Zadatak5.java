package zadaci_2_2_2016;

/*@author Filip Dautovic
 * (Algebra: add two matrices) Write a method to add two matrices. The header of
 the method is as follows:
 public static double[][] addMatrix(double[][] a, double[][] b) 

 In order to be added, the two matrices must have the same dimensions and the
 same or compatible types of elements. Let c be the resulting matrix. 

 Write a test program that prompts the user to enter two 3 * 3 matrices and
 displays their sum. Here is a sample run: 
 */

import java.util.Scanner;

public class Zadatak5 {

	public static double[][] addMatrix(double[][] a, double[][] b) {

		/*
		 Matrica koja æe sadržavati rezultate, istih dimenzija je kao i dvije koje se sabiraju
		 */
		double[][] c = new double[a.length][a[0].length]; 

		//Prolazi se kroz matricu, i brojevi na istim indeksima se sabiraju
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		//Vraca se matrica c
		return c;
	}

	public static void main(String[] args) {
		
		//Skener
		Scanner ulaz = new Scanner(System.in);
	
		//Korisnik unosi kroj redova i kolona
		System.out.println("Unesite broj redova matrice:");
		int x = ulaz.nextInt();
		System.out.println("Unesite broj kolona matrice:");
		int y=ulaz.nextInt();
				
		double[][] matrix1 = new double[x][y];
		double[][] matrix2 = new double[x][y];
		
		
		//Popunjavanje prve matrice
		System.out.println("Unesite èlanove prve matrice:");
		for(int i = 0; i < matrix1.length; i++){
			for(int j = 0; j < matrix1[0].length; j++)
				matrix1[i][j]=ulaz.nextDouble();
		}
		
		//Popunjavanje druge matrice
		System.out.println("Unesite èlanove druge matrice:");
		for(int i = 0; i < matrix2.length ; i++){
			for(int j = 0 ; j < matrix2[0].length ; j++){
				matrix2[i][j]=ulaz.nextDouble();
			}
				
		}
		ulaz.close();
		
		//Poziva se metoda, i rezultat se smjestava u novu matricu
		double[][] rezultat = addMatrix(matrix1, matrix2);
		
		//Ispis matrice
		System.out.println("Zbir matrica je:");
		for(int i = 0; i <rezultat.length; i++){
			for(int j = 0; j < rezultat[0].length; j++){
				System.out.print(rezultat[i][j] +" ");
			}
				System.out.println();
		}
	}

}
