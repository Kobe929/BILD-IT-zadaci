package zadaci_20_1_2016;

import java.util.Scanner;

/* @author Filip Dautovic
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje sve karaktere koji se 
 * nalaze na neparnim pozicijama. Na primjer, ako korisnik unese string Beijing Chicago, program vraæa BiigCiao.
 */
public class Zadatak4 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		// Unos od korisnika
		System.out.println("Unesite string:");
		String tekst = ulaz.nextLine();

		// Smjestavanje stringova u niz karaktera
		char[] slova = tekst.toCharArray();

		// Ispitivanje da li su karakteri na parnim ili neparnim pozicijama
		for (int i = 0; i < slova.length; i++) {
			if (i % 2 == 0)
				System.out.print(slova[i]); // Posto u nizu index pocinje od
											// nule u uslovu stoji da je
											// karakterna parnom mjestu jer je 0
											// na kojem je prvi karakter parna
		}
		ulaz.close();
	}

}
