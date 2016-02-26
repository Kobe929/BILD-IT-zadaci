package zadaci_24_2_2016;

/*@authro Filp Dautovic
 * 19.5 (Maximum element in an array) Implement the following method that returns the
maximum element in an array.
public static <E extends Comparable<E>> E max(E[] list)
 */

public class Zadatak3 {

	public static void main(String[] args) {
		
		//Nova lista
		Integer[] list = new Integer[10];
	        for (int i = 0; i < list.length; i++) {
	            list[i] = i;
	        }

	        //Poziv metode i stampanje
	        System.out.println("Max = " + max(list));
	    }

	    public static <E extends Comparable<E>> E max(E[] list) {

	    	//Prolazimo kroz listu i najveci element spremamo u max
	        E max = list[0];
	        for (int i = 1; i < list.length; i++) {
	            E element = list[i];
	            if (element.compareTo(max) > 0) {
	                max = element;
	            }
	        }

	        return max;
	    }
	}