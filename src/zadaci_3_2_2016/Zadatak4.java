package zadaci_3_2_2016;

/*@author Filip Dautovic
 * *8.16 (Sort two-dimensional array) Write a method to sort a two-dimensional array
 using the following header:
 public static void sort(int m[][])
 The method performs a primary sort on rows and a secondary sort on columns.
 For example, the following array
 {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
 will be sorted to
 {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 */

public class Zadatak4 {

	public static void sort(int m[][]) {

		//Sortiranje redova
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				java.util.Arrays.sort(m[j]);
			}

		}
		//Ispis sortirane
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		//Random 3x3 matrica
		int[][] matrix = new int[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
			}
		}

		//Ispis
		System.out.println("Random matrica: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		//Ispis sortirane (poziv metode)
		System.out.println("Sortirana matrica: ");

		sort(matrix);

	}
}
