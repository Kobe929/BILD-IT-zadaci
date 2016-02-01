package zadaci_1_2_2015;

/*@author Filip Dautovic
 * Napisati metodu sa sljede�im headerom: public static String format(int number, int width) koja vra�a string broja 
 * sa prefiksom od jedne ili vi�e nula. Veli�ina stringa je width argument. Na primjer, ukoliko pozovemo metodu 
 * format(34, 4) metoda vra�a 0034, ukoliko pozovemo format(34, 5) metoda vra�a 00034. Ukoliko je uneseni 
 * broj ve�i nego width argument, metoda vra�a samo string broja. Npr. ukoliko pozovemo format(34, 1) metoda vra�a 34.
 */

import java.text.DecimalFormat;

public class Zadatak4 {

	public static String format(int number, int width) {
		String zero = "0"; // Nule za dopunjavanje

		// Prazan "pattern"
		String pattern = "";
		for (int i = 0; i < width; i++) {
			// U zavisnosti od unesene duzine u string se upisuje toliko nula
			pattern += zero;

		}
		// Koristimo klasu DecimalFormat
		DecimalFormat formatter = new DecimalFormat(pattern);
		// Objekat formatter ce imati izgled kreiranog stringa, npr ako unesemo
		// 4, bit ce 4 nule

		// Uneseni broj ce se ubaciti u string, ukoliko je manje cifri od
		// unesene duzine ispisat ce se nule koje su vec u stringu i uneseni
		// broj, ukoliko je veci ispisat ce se broj a nule ce biti overwriteane
		return formatter.format(number);
	}

	public static void main(String[] args) {

		//Poziv metode
		System.out.println(format(123, 23));

	}
	/*Zadatak je rijesen proucavajuci ovo: https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html
	 * I jos masu uradjenih primjera
	 * 
	 */
}
