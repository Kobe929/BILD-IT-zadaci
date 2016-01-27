package zadaci_26_1_2016;

/*@author Filip Dautovic
 * Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše ta ista tri broja u rastuæem redosljedu. 
 * Bonus: Napisati metodu koja prima tri cijela broja kao argumente te vraæa brojeve u rastuæem redosljedu. 
 */

import java.util.*;

public class Zadatak4 {

	//Metoda za sortiranje
	public static void sort3(int a, int b, int c) {

		//Lista u koju cemo smjestit brojeve
		List<Integer> brojevi = new ArrayList<>();
		brojevi.add(a);
		brojevi.add(b);
		brojevi.add(c);
		
		//Sortiranje pomocu collections
		Collections.sort(brojevi);

		//Stampanje
		for (Integer broj : brojevi) {
			System.out.print(broj + " ");
		}
	}

	public static void main(String[] args) {

		//Skener
		Scanner ulaz = new Scanner(System.in);
		
		//Ulaz od korisnika
		System.out.println("Unesite 3 broja:");
		int a = ulaz.nextInt();
		int b = ulaz.nextInt();
		int c = ulaz.nextInt();
		
		//Poziv metode
		sort3(a,b,c);
		
		ulaz.close();
	}

}
