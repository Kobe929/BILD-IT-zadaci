package zadaci_1_2_2015;

/*@author Filip Dautovic
 * U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji pita korisnika da unese short broj te mu 
 * ispiše svih 16 bita za dati cijeli broj. Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje 0000000000000101
 */

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		//Novi skener
		Scanner ulaz = new Scanner(System.in);

		//Ulaz od korisnika
		System.out.println("Unesite neki broj u rasponu short (-32,768 do 32,767:");
		short a = ulaz.nextShort();

		//begC http://stackoverflow.com/questions/31523419/java-print-a-short-as-binary-with-all-16-bits
		//Funkcija pretvara integer u binary (short brojevi su i integer) ali ne ispisuje u 16bit formatu
		//Pa manuelno mijenjamo prazan prostor nulama
		System.out.println(String.format("%16s", Integer.toBinaryString(a))
				.replace(' ', '0'));

		//endC. Prvi put se susreæem sa ovim. Ja, Filip, razumijem ovaj kod
		
		ulaz.close();
	}

}