package zadaci_19_1_2016;

/*@author Filip Dautovic
 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima godišnju interesnu stopu od 5%. 
 * Mjeseèna interesna stopa je stoga 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na raèunu 
 * postaje 100 * (1 + 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na raèunu postaje 
 * (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon treæeg mjeseca, vrijednost na raèunu postaje 
 * (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. Napisati program koji pita korisnika da 
 * unese mjeseèni iznos štednje te broj mjeseci nakon kojeg bi želio znati stanje raèuna. 
 */

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		// Novi skener
		Scanner ulaz = new Scanner(System.in);

		double godisnjaKamata = 0.05; // Fiksna godisnja kamata
		double mjesecnaKamata = godisnjaKamata / 12; // Mjesecna kamata, daje
														// malo precizniji
														// rezultat nego da odma
														// stavim 0.00417
		double iznos = 0; // Pocetni iznos

		// Unos od korisnika
		System.out.println("Unesite iznos koji želite uplaæivati: ");
		double uplata = ulaz.nextDouble();

		System.out
				.println("Unesite kroj mjeseci za koji želite izraèunati uštedu: ");
		double brojMjeseci = ulaz.nextDouble();

		// Racunanje
		for (int i = 0; i < brojMjeseci; i++) {
			iznos = (iznos + uplata) * (1 + mjesecnaKamata);
		}

		// Zaokruzivanje na 2 decimale (pare su ipak :D )
		double pare = (double) Math.round(iznos * 100) / 100;

		// Ispis rezultata
		System.out.println("Za " + brojMjeseci
				+ " mjeseci na stednom racunu cete imati $" + pare + ".");

		// Zatvaranje skenera
		ulaz.close();

	}

}
