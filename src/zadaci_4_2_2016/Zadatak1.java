package zadaci_4_2_2016;

/*@author Filip Dautovic
 * *8.26 (Row sorting) Implement the following method to sort the rows in a twodimensional
array. A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m)
 Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and displays a new row-sorted matrix. 
 */
import java.util.Scanner;

public class Zadatak1 {

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
			
			System.out.println("Sortirana matrica:");
			for (int i = 0; i < matrica2.length; i++) {
				for (int j = 0; j < matrica2[i].length; j++) {
					System.out.print(matrica2[i][j] + " ");
				}
				System.out.println();
			}
			ulaz.close();
		}
		 
	}