package zadaci_25_1_2016;

/*@author Filip Dautovic
 * Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi od 1. januara 1970 do trenutka 
 * pozivanja metode. Napisati program koji ispisuje trenutaèni datum i vrijeme u formatu 
 * "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
 */

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Zadatak3 {

	public static void main(String[] args) {
		
		//Poziv metode za dobivanje milisekundi
		long miliSekunde = System.currentTimeMillis();
		
		//POzivanje klase koja formatira datum
		SimpleDateFormat format = new SimpleDateFormat("dd. MMMMMMMM. yyyy. HH:mm:ss");   
		
		//Racunanje datuma
		Date datum = new Date(miliSekunde);
		
		//Ispis rezultata
		System.out.println("Trenutni datum i vrijeme: " +format.format(datum));
		
	}

}
