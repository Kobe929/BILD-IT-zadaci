package zadaci_24_2_2016;

/*@autrhor Filip dautovic
 * (Generic linear search) Implement the following generic method for linear search.
 public static <E extends Comparable<E>>
 int linearSearch(E[] list, E key)

 */
public class Zadatak2 {

	public static void main(String[] args) {
		// nova lista
		Integer[] list = new Integer[10];

		// Popunjava se
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}

		//Pozivi metodi da traži broj 5 i broj 15
		System.out.println(linearSearch(list, 5));
		System.out.println(linearSearch(list, 15));

	}

	public static <E extends Comparable<E>> int linearSearch(E[] list, E value) {

		//Prolazak kroz listu
		for (int i = 0; i < list.length; i++) {
			//Ako se naðe traženi broj, vraæa se taj broj, a ako ne vraæa se -1
			if (list[i].compareTo(value) == 0) {
				return i;
			}
		}

		return -1;
	}
}