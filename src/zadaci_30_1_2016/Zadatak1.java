package zadaci_30_1_2016;

/*@author Filip Dautovic
 * Napisati program koji pita korisnika da unese cijeli trocifreni broj te provjerava da li je unijeti broj palindrom. 
 * Broj je palindrom ukoliko se èita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.
 */

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
	
		//Novi skener
		Scanner ulaz = new Scanner(System.in);
		
		//Unos broja
		System.out.println("Unesite broj:");
		int broj = ulaz.nextInt();
		
		//Ako je broj isti i kad je naopako ispisuje se da je palindrom
		if(broj == reverse(broj)){
			System.out.println("Broj " +broj+ " je palindrom.");
		}else{
			System.out.println("Broj " +broj+ " nije palindrom.");
		}
		
		ulaz.close();
	}

	//Metoda vraca broj naopako
	public static int reverse(int broj) {

		int reverse = 0; // Varijabla koja ce se koristit u petlji

		while (broj != 0) { // Sve dok proslijedjeni broj nije nula
			reverse = reverse * 10 + broj % 10;
			broj /= 10; // Uneseni broj se razlaze po ciframa, skroz desna cifra
						// postaje reverse i pomjera se za jedno mjesto lijevo

		}
		// Vraca se okrenuti broj
		return reverse;
	}
}
