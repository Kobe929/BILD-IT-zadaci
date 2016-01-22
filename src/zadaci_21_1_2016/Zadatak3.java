package zadaci_21_1_2016;

/*@author Filip Dautovic
 * Napisati program koji pita korisnika da unese godinu i prva tri slova imena mjeseca (prvo slovo uppercase) 
 * te mu ispiše broj dana u tom mjesecu. Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan 
 * program mu ispisuje da Jan 2011 ima 31 dan.
 */

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		// Novi skener
		Scanner ulaz = new Scanner(System.in);

		// Spisak mjeseci æe biti u jednom nizu
		String[] mjeseci = { "Januar", "Februar", "Mart", "April", "Maj",
				"Juni", "Juli", "August", "Septembar", "Oktobar", "Novembar",
				"Decembar" };

		// Spisak dana u drugom nizu
		int[] dani = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Ulaz za mjesec
		System.out.println("Unesite 3 prva slova mjeseca, prvo veliko :");
		String mjesecz = ulaz.next();

		// Prebacivanje na mala slova (nije reagovalo direkt O.o )
		String mjesec = mjesecz.toLowerCase();

		// Ako se pretjera sa slovima, moglo se dodati jos opcija...
		if (mjesec.length() > 3)
			System.out
					.println("Neispravan unos, potrebno je unijeti samo 3 prva slova mjeseca.");

		// Ulaz za godinu
		System.out.println("Unesite godinu:");
		int godina = ulaz.nextInt();

		// Uslovi za unos...
		if (mjesec.contentEquals("jan")) {
			System.out.println("Mjesec " + mjeseci[0] + " " + godina + " ima "
					+ dani[0] + " dana.");
		} else if (mjesec.contentEquals("feb")) {
			if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)) { // Akoje
																					// prijestupna
																					// godina
																					// februar
																					// ima
																					// 29
																					// dana
				System.out.println("Mjesec Februar " + godina
						+ ". ima 29 dana (prijestupna godina).");
			} else {
				System.out.println("Mjesec " + mjeseci[1] + " " + godina
						+ " ima " + dani[1] + " dana.");
			}
		} else if (mjesec.contentEquals("mar")) {
			System.out.println("Mjesec " + mjeseci[2] + " " + godina + " ima "
					+ dani[2] + " dana.");
		} else if (mjesec.contentEquals("apr")) {
			System.out.println("Mjesec " + mjeseci[3] + " " + godina + " ima "
					+ dani[3] + " dana.");
		} else if (mjesec.contentEquals("maj")) {
			System.out.println("Mjesec " + mjeseci[4] + " " + godina + " ima "
					+ dani[4] + " dana.");
		} else if (mjesec.contentEquals("jun")) {
			System.out.println("Mjesec " + mjeseci[5] + " " + godina + " ima "
					+ dani[5] + " dana.");
		} else if (mjesec.contentEquals("jul")) {
			System.out.println("Mjesec " + mjeseci[6] + " " + godina + " ima "
					+ dani[6] + " dana.");
		} else if (mjesec.contentEquals("aug")) {
			System.out.println("Mjesec " + mjeseci[7] + " " + godina + " ima "
					+ dani[7] + " dana.");
		} else if (mjesec.contentEquals("sep")) {
			System.out.println("Mjesec " + mjeseci[8] + " " + godina + " ima "
					+ dani[8] + " dana.");
		} else if (mjesec.contentEquals("okt")) {
			System.out.println("Mjesec " + mjeseci[9] + " " + godina + " ima "
					+ dani[9] + " dana.");
		} else if (mjesec.contentEquals("nov")) {
			System.out.println("Mjesec " + mjeseci[10] + " " + godina + " ima "
					+ dani[10] + " dana.");
		} else if (mjesec.contentEquals("dec")) {
			System.out.println("Mjesec " + mjeseci[11] + " " + godina + " ima "
					+ dani[11] + " dana.");
		} else {
			System.out.println("Pogresan unos."); //Ako se unese nešto drugo izbacuje se greška
		}

		ulaz.close();
	}

}
