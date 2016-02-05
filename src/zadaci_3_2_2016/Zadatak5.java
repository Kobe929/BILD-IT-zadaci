package zadaci_3_2_2016;

/*@author Filip Dautovic
 * *8.22 (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
 matrix filled with 0s and 1s, displays the matrix, and checks if every row and
 every column have an even number of 1s
 */

public class Zadatak5 {

	public static void main(String[] args) {

		//Nova matrica
		int[][] matrix = new int[6][6];

		int[] jediniceURedu = new int[6]; //Niz koji ce cuvati broj jedinica po redovima
		int[] jediniceUKoloni = new int[6]; //Niz koji ce cuvati broj jedinica po kolonama

		int brojacRed = 0; //Brojac jedinica u redu
		int brojacKolona = 0;  //Brojac jedinica u koloni

		//Popunjavanje matrice sa random 0 i 1
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		//Prolazak kroz matricu
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				//Ako je vrijednost 1, povecava se brojac jedinica za red
				if (matrix[i][j] == 1) {
					brojacRed++;
				}
				//I smjestava se u niz
				if (j == 3) {
					jediniceURedu[i] = brojacRed;
					brojacRed = 0;
				}
				//Jedinice po kolonama
				if (matrix[j][i] == 1) {
					brojacKolona++;
				}
				
				//Izbrojane jedinice se prebacju u niz
				if (j == 3) {
					jediniceUKoloni[i] = brojacKolona;
					brojacKolona = 0;
				}
			}
		}

		boolean jednako = true;
		//Prolazak kroz nizove gdje smo smjestili rezultate
		for (int i = 0; i < 5; i++) {
			//Ako broj nije isti
			if (jediniceURedu[i] != jediniceURedu[i + 1]) {
				jednako = false;
			}
			
			if (jediniceUKoloni[i] != jediniceUKoloni[i + 1]) {
				jednako = false;
			}
		}
		//Ako je isti
		if (jednako) {
			System.out.println("Imaju isti broj jedinica");
		} else {
			System.out.println("Nemaju isti broj jedinica");
		}

	}

}