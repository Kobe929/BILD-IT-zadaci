package mini2CrapsAndCreditCards;

/*@author Filip Dautovic
 * Simple Craps
 */

import java.util.Scanner;

public class Craps {

	//Metoda za bacanje kocki
	public static int bacaj() {

		//Kocke od 1-6
		int kocka1 = (int) (Math.random() * 6) + 1;
		int kocka2 = (int) (Math.random() * 6) + 1;

		//Rezultat je zbir dbivenih brojeva
		return kocka1 + kocka2;
	}

	public static void igra() {
		
		//Poziva se metoda za bacanje kocki
		int rezultat = bacaj();

		//Ako se dobije 2, 3 ili 12 korisnik gubi
		if (rezultat == 2 || rezultat == 3 || rezultat == 12) {
			System.out.println("Zbir kocki je " + rezultat + ". Izgubili ste.");
		}

		//Ako se dobije 7 ili 11 korisnik dobiva
		else if (rezultat == 7 || rezultat == 11) {
			System.out.println("Zbir kocki je " + rezultat
					+ ". Pobijedili ste!");
		}

		else {
			//Ako se dobije neka druga kombinacija
			while (true) {
				//Baca se ponovo
				int rezultat2 = bacaj();
				//Ako u drugom bacanju rezultat bude 7 korisnik gubi
				if (rezultat2 == 7) {
					System.out.println("Prethodno izvucen broj je " + rezultat
							+ ", ponovnim bacanjem ste dobili 7. Izgubili ste.");
					break;
				}
				//Ako se dobije isti zbir korisnik pobijedjuje
				if (rezultat2 == rezultat) {
					System.out
							.println("Prethodno izvucen broj je "
									+ rezultat
									+ ", ponovnim bacanjem ste dobili isti broj. Pobijedili ste.");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		int izbor = 0;

		//Ispis opcija korsniku
		System.out.println("Unesite 1 za novu igru, 0 za prekid.");
		
		do {

			izbor = ulaz.nextInt();
			if (izbor == 1) { //Ako se unese 1 pocinje igra
				igra();
				System.out.println("Unesite 1 za novu igru, 0 za prekid.");
			}
			else if(izbor == 0){ //Ako se unese 0 zahvaljuje se korisniku na igranju i program zavrsava sa radom
				System.out.println("Hvala na igranju.");
				System.exit(0);
			}
			else{
				//Ako se unese nesto trece korisnik se pita da ponovo izabere
				System.out.println("Neispravan unos.");
				System.out.println("Unesite 1 za novu igru, 0 za prekid.");
			}
		} while (izbor != 0); //Petlja radi dok se ne unese nula
		
		ulaz.close();

	}

}
