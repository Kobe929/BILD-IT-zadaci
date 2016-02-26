package zadaci_24_2_2016;

/*@autohr Filip dautovic
 * (Distinct elements in ArrayList) Write the following method that returns a new
ArrayList. The new list contains the non-duplicate elements from the original list.
public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 */

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		//nova arraylista
		ArrayList<String> string = new ArrayList<>();
		//popunjavamo necim bezveze
		for (int i = 0; i < 5; i++) {
			string.add("hgt");
		}

		//pozivamo metodu
		string = removeDuplicates(string);
		
		//stampamo preostalo
		for (String s : string) {
			System.out.println(s);
		}
	}

	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

		//nova lista koja ce se vratit
		ArrayList<E> list1 = new ArrayList<>(list.size());
		
		//prolazimo kroz listu
		for (E string : list) {
			//ako nova lista ne sadrzi rijednost koja se provjerava onda se ona dodaje novoj listi
			if (!list1.contains(string)) {
				list1.add(string);
			}
		}
		//curik
		return list1;
	}

}
