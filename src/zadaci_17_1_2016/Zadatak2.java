package zadaci_17_1_2016;

/*@author Filip Dautovic
 *  Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti koriste�i se sljede�im headerom:
 *  public static double min(double[ ] array)
 */

public class Zadatak2 {

	public static double min(double[] array) {

		double temp; //Varijabla koja �e slu�it za sortiranje

		//Prola�enje kroz niz i stavljanje najmanjeg broja na index 0
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		return array[0];

	}

}
