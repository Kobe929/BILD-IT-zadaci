package zadaci_4_2_2016;

/*@author Filip Dautovic
 * 8.28 (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
identical if their corresponding elements are equal. Write a method that returns
true if m1 and m2 are strictly identical, using the following header:
public static boolean equals(int[][] m1, int[][] m2)
 Write a test program that prompts the user to enter two 3 * 3 arrays of
integers and displays whether the two are strictly identical. Here are the
sample runs.
 */

import java.util.Scanner;

public class Zadatak2 {

	public static boolean equals(int[][] m1, int[][] m2){
		
		//Prolazi se kroz nizove i ispituje da li ima neki clan koji nije isti
		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m1[i].length; j++){
				if(m1[i][j] != m2[i][j]){
					//Ako ima vraca se false
					return false;
				}
			}
		}
		//Ako nema vraca se true
		return true;
	}
	public static void main(String[] args) {
		
		//Novi skener
		Scanner ulaz = new Scanner(System.in);
		
		//Matrice koje usporedjujemo
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
		
		//Popunjavanje prve matrice
		System.out.println("Unesite clanove u prvu 3x3 matricu:");
		for(int i = 0; i < matrix1.length; i++){
			for(int j = 0; j < matrix1[0].length; j++){
				matrix1[i][j] = ulaz.nextInt();
			}
		}

		//Popunjavanje druge matrice
		System.out.println("Unesite clanove u drugu 3x3 matricu:");
		for(int i = 0; i < matrix2.length; i++){
			for(int j = 0; j < matrix2[0].length; j++){
				matrix2[i][j] = ulaz.nextInt();
			}
		}
		
		//Poziv metode i ispis
		if(equals(matrix1, matrix2)){
			System.out.println("Matrice su identicne.");
		}else{
			System.out.println("Matrice nisu identicne.");
		}
		
		ulaz.close();
	}

}
