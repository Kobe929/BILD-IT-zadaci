package zadaci_17_1_2016;

/*@author Filip Dautovic 
 * Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu. Metoda treba da koristi sljedeæi header:
 * public static int[ ] locateLargest(double[ ][ ] a)
 */

public class Zadatak4 {

	public static int[] locateLargest(double[][] a) {

		
		double temp = 0; //Varijabla koja ce sluziti za "lociranje" najveceg elementa
		int red = 0;    //Varijabla koja ce zapamtiti u kojem redu se nalazi najveci element
		int kolona = 0;  //Varijabla koja ce zapamtiti u kojoj koloni se nalazi najveci element

		//Prolazak kroz matricu 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > temp) {
					temp = a[i][j];
					red = i;
					kolona = j;
				}
			}
		}
		//Vracanje niza koji sadrzi broj reda i kolone
		return new int[] { red, kolona };

	}
}
