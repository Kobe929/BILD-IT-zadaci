package zadaci_26_1_2016;

/*@author Filip Dautovic
 *  Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase karaktera i 4 broja u sljedeæem 
 *  formatu AAA-1234. Napisati program koji nasumièno generiše tablicu.
 */

import java.util.Random;

public class Zadatak1 {

	public static void main(String[] args) {

		//Random koji ce se koristit za cijeli zadatak
		Random rand = new Random();

		//Generisanje 3 uppercase karaktera
		char char1 = (char) (rand.nextInt(26) + 'A');
		char char2 = (char) (rand.nextInt(26) + 'A');
		char char3 = (char) (rand.nextInt(26) + 'A');
		
		//Generisanje 4 broja 0-10
		int broj1 = rand.nextInt(10);
		int broj2 = rand.nextInt(10);
		int broj3 = rand.nextInt(10);
		int broj4 = rand.nextInt(10);
		
		//Ispis
		System.out.println(char1+""+char2+""+char3+"-"+broj1+""+broj2+""+broj3+""+broj4);
		
	}

}
