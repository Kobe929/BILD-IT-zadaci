package zadaci_16_1_2016;

/*@author Filip Dautovic
 * Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od godine 101 do 2100, 
 * odvojene jednim spaceom. Tako�er ispisati i ukupan broj prijestupnih godina u ovom vremenskom periodu.
 */

public class Zadatak1 {

	public static void main(String[] args) {

		System.out.println("Prijestupne godine izme�u 101 i 2100 su:");
		
		int godine = 0; //Brojac godina
		int brojac = 0; //Brojac redova

		//Prolazimo kroz godine od 101 do 2100
		for (int i = 101; i <= 2100; i++) {
			
			//Uslov za prijestupnu godinu
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {

				System.out.print(i + " "); //�tampanje godina
				godine++; //Pove�avanje broja�a godina
				brojac++; //Pove�avanje broja�a redova
				
				//Ograni�avanje redova
				if (brojac == 10) {
					System.out.println();
					brojac = 0;
				}

			}

		}
		
		//Ispis rezultata
		System.out.println();
		System.out.println("Ukupan broj prijestupnih godina izme�u 101 i 2100 je " + godine);
	}
}
