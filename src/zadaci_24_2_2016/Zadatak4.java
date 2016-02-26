package zadaci_24_2_2016;

/*@autrhor filip Dautovic
 * 19.6 (Maximum element in a two-dimensional array) Write a generic method that
 returns the maximum element in a two-dimensional array.
 public static <E extends Comparable<E>> E max(E[][] list)
 */
public class Zadatak4 {

	public static void main(String[] args) {

		//Kreiramo novu 2d listu i popunjavamo
		Integer[][] list = new Integer[10][10];
		int broj = 3;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				list[i][j] = broj++;
			}
		}

		//Poziv metode i printnje
		System.out.println("Max = " + max(list));
	}

	public static <E extends Comparable<E>> E max(E[][] list) {

		//Prlazak i sortiranje slicno proslom zadatku
		E max = list[0][0];
		for (E[] elements : list) {
			for (E element : elements) {
				if (element.compareTo(max) > 0) {
					max = element;
				}
			}
		}

		return max;
	}
}