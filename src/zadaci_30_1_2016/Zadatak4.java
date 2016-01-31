package zadaci_30_1_2016;

import java.time.LocalDateTime;

/*@author Filip Dautovic
 * Napisati metodu koja vraæa datum i trenutaèno vrijeme.
 */

public class Zadatak4 {

	public static void main(String[] args) {

		// Najjednostavniji nacin koji sam nasao u nekom komentaru na
		// stackoverflow, istrazit cu jos metoda i nacina formatiranja
		LocalDateTime ldt = LocalDateTime.now();

		System.out.println(ldt);
	}

}
