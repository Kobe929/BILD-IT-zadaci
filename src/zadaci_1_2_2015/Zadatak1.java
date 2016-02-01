package zadaci_1_2_2015;

/*@authr Filip Dautovic
 * Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) te ispisuje koji je to karakter. Na primjer, 
 * ukoliko korisnik unese 69 kao ASCII kod, program mu ispisuje da je karakter sa tim brojem karakter E.
 */

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		//Novi skaner
		Scanner ulaz = new Scanner(System.in);

		//Boolean za petlju
		boolean uslov = true;

		//Petlja
		while (uslov) {
			
			//Ulaz od korisnika
			System.out
					.println("Unesite broj od 1 do 127 da vidite koji je karakter u ASCII kodu (nula prekida program):");
			int broj = ulaz.nextInt();

			//Ako je broj ispravan ispisuje se koji je karakter
			if (broj >= 1 && broj <= 127) {

				System.out.println((char) broj);
			}

			//Ako se unese nula petlja se prekida
			else if (broj == 0) {
				System.out.println("Hvala na koristenju.");
				break;
			} 
			
			//Ako se unese nesto drugo idemo ispocetka
			else {
				System.out.println("Neispravan unos.");
			}

		}
		ulaz.close();
	}

}
