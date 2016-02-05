package zadaci_3_2_2016;

/*
 * (Algebra: multiply two matrices) Write a method to multiply two matrices. The
header of the method is:
public static double[][]
 multiplyMatrix(double[][] a, double[][] b)
 To multiply matrix a by matrix b, the number of columns in a must be the same as
the number of rows in b, and the two matrices must have elements of the same or
compatible types. Let c be the result of the multiplication. Assume the column size
of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.
For example, for two 3 * 3 matrices a and b, c is


where cij = ai1 * b1j + ai2 * b2j + ai3 * b3j
.
 Write a test program that prompts the user to enter two 3 * 3 matrices and displays
their product.
 */
import java.util.Scanner;
public class Zadatak2 {

	 
		public static double[][] multiplyMatrix(double[][] a, double[][] b) {

			/*
			 Matrica koja ae sadržavati rezultate, istih dimenzija je kao i dvije koje se mnoze
			 */
			double[][] c = new double[a.length][a[0].length]; 

			//Prolazi se kroz matricu, i mnozi se prema formuli iz zadatka
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[i].length; j++) {
					c[i][j] = (a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] *b[2][j]);
				}
			}

			//Vraca se matrica c
			return c;
		}

		public static void main(String[] args) {
			
			//Skener
			Scanner ulaz = new Scanner(System.in);
		
			
			//MAtrice koje ce se mnozit
			double[][] matrix1 = new double[3][3];
			double[][] matrix2 = new double[3][3];
			
			
			//Popunjavanje prve matrice
			System.out.println("Unesite clanove prve 3x3 matrice:");
			for(int i = 0; i < matrix1.length; i++){
				for(int j = 0; j < matrix1[0].length; j++)
					matrix1[i][j]=ulaz.nextDouble();
			}
			
			//Popunjavanje druge matrice
			System.out.println("Unesite clanove druge 3x3 matrice:");
			for(int i = 0; i < matrix2.length ; i++){
				for(int j = 0 ; j < matrix2[0].length ; j++){
					matrix2[i][j]=ulaz.nextDouble();
				}
					
			}
			ulaz.close();
			
			//Poziva se metoda, i rezultat se smjestava u novu matricu
			double[][] rezultat = multiplyMatrix(matrix1, matrix2);
			
			//Ispis matrice
			System.out.println("Produkt matrica je:");
			for(int i = 0; i <rezultat.length; i++){
				for(int j = 0; j < rezultat[0].length; j++){
					System.out.print(rezultat[i][j] +" ");
				}
					System.out.println();
			}
		}

	}