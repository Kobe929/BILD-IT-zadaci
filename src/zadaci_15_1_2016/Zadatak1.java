package zadaci_15_1_2016;

import java.util.ArrayList;

/*author @Filip Dautovic
 * Napisati sljede�u metodu koja vra�a najve�u vrijednosti u ArrayListu Integera. 
 * Metoda vra�a null ukoliko je lista null ili ukoliko lista sadr�i 0 elemenata. 
 */

public class Zadatak1 {

	public static Integer max(ArrayList<Integer> list) {
		int maxValue = 0; // Integer u koji �e se spremati vrijednost

		// Ispitivanje da li je lista null ili ima 0 elemenata
		if ((list == null) || (list.isEmpty()))
			return null;

		// ako nije sortirati listu i dodijeliti varijabli maxValue najve�u vrijednost
		else {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) > maxValue) {
					maxValue = list.get(i);
				}
			}
			return maxValue; //Vra�anje najve�e vrijednosti
		}
	}

	public static void main(String[] args) {
		//Test
		
		//Kreiranje liste
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//Dodavanje nekih integera
		list.add(23);
		list.add(6);
		list.add(45);
		list.add(929);
		list.add(89);
		list.add(2);
		
		//�tampanje rezultata
		System.out.println(max(list));

	}

}
