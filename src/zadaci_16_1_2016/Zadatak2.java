package zadaci_16_1_2016;

import java.util.Scanner;

/*@author Filip Dautovic
 * Napisati metodu koja prima jedan argument, broj pitanja, te generiše toliko nasumiènih, 
 * jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“. Metoda treba da broji broj taènih i 
 * netaènih odgovora te ih ispiše korisniku.
 */

public class Zadatak2 {

	public static void pitanja(int a) {

		Scanner ulaz = new Scanner(System.in);
		
		int broj1 = 0; //Varijabla za prvi broj
		int broj2 = 0; //Varijabla za drugi broj
		int rezultat = 0; //Varijabla za rezultat
		int rezultatKorisnik; //Varijabla za rezultat koji unosi korisnik
		int tacni = 0; //Brojac tacnih odgovora
		int netacni = 0; //Brojac netacnih odgovora

		//Prolazak kroz broj pitanja
		for (int i = 0; i < a; i++) {

			//Generisanje brojeva
			broj1 = (int) (Math.random() * 10);
			broj2 = (int) (Math.random() * 10);
			
			//Rezultat
			rezultat = broj1 - broj2;
			
			//Ispis korisniku da upiše odgovor
			System.out.println(broj1 + "-" + broj2 + "=");
			rezultatKorisnik = ulaz.nextInt();

			//Provjera da li je korisnik unijeo tacan rezultat 
			if (rezultatKorisnik == rezultat) {
				tacni++; //Brojanje tacnih
			} else
				netacni++; //Brojanje netacnih
		}
		ulaz.close();

		System.out.println("Imali ste " + tacni + " tacnih i " + netacni + " netacnih odgovora.");
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		//Ispis korisniku da unese broj pitanja
		System.out.println("Unesite broj pitanja:");

		//Ulaz od korisnika
		int a = ulaz.nextInt();
		
		//Pozivanje metode
		pitanja(a);

		ulaz.close();

	}

}
