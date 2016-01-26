package zadaci_25_1_2016;

/*@author Filip Dautovic
 * Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje koliko je pozitivnih brojeva korisnik unijeo, 
 * koliko negativnih te izraèunava ukupnu sumu i prosjek svih unesenih brojeva. (Korisnik prekida unos tako što unese nulu). 
 * Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše da je broj pozitivnih brojeva 3, 
 * negativnih brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.
 */

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		//Novi skener
		Scanner ulaz = new Scanner(System.in);

		int brojacPozitivnih = 0; 
		int brojacNegativnih = 0;
		int brojacUnosa = 0;
		double zbir = 0;

		while (ulaz.hasNext()) {  //Loop æe raditi sve dok ima unosa

			int broj = ulaz.nextInt(); //Ulaz od korisnika

			if (broj < 0) {
				brojacNegativnih++;  //Ako je broj manji od nule povecava se broj negativnih
			}

			else if (broj > 0) {
				brojacPozitivnih++;  //Ako je broj veci od nule povecava se broj pozitivnih
				} 
			
			
			else if (broj == 0) {
				break;			//Ako je broj nula zaustavlja se petlja
			}
			
			zbir = zbir + broj;  //Svaki broj se dodaje zbiru
			brojacUnosa++; //I povecava se broj unesenih
		}

		double prosjek = (double) (zbir / brojacUnosa);		//Prosjek dobivamo dijeljeci zbir svih brojeva sa brojem unesenih

		//Ispis rezultata
		System.out.println("Broj pozitivnih brojeva je " + brojacPozitivnih);
		System.out.println("Broj negativnih brojeva je " + brojacNegativnih);
		System.out.println("Zbir brojeva je " + zbir + " a prosjek " + prosjek);
		
		ulaz.close();
	}
}
