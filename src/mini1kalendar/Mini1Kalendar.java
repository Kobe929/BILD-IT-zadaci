package mini1kalendar;

/*@author Filip Dautovic
 * Mini 1 - Kalendar
 *Disclaimer na kraju
 */

import java.io.*;
import java.util.Scanner;

public class Mini1Kalendar {

	// Metoda stavlja 1 u mjesecu na taèan dan
	public static int day(int M, int D, int Y) {
		int y = Y - (14 - M) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = M + 12 * ((14 - M) / 12) - 2;
		int d = (D + x + (31 * m) / 12) % 7;
		return d;

	}

	public static void main(String[] args) throws IOException {

		// Novi skener
		Scanner ulaz = new Scanner(System.in);

		// Poèetna vrijednost izbora
		int izbor = 0;

		// Traženje od korisnika da izabere opciju
		System.out
				.println("Upisite 1 za kalendar, 2 za podsjetnike, 3 za ispis podsjetnika, 0 za prekid:");

		// Sve dok vrijednost izbora nije nula program æe raditi
		do {

			// Unos izbora
			izbor = ulaz.nextInt();

			// Ako korisnik unese broj 1 ispisuje se kalendar
			if (izbor == 1) {

				// Unos željenog mjeseca od korisnika po rednom broju
				System.out
						.println("Unesite mjesec koji želite vidjeti (1-12):");
				int M = ulaz.nextInt();

				// Unos godine od korisnika
				System.out
						.println("Unesite godinu u kojoj želite vidjeti mjesec:");
				int Y = ulaz.nextInt();

				// Niz za imena mjeseca
				String[] months = { "", "January", "February", "March",
						"April", "May", "June", "July", "August", "September",
						"October", "November", "December" };

				// Niz za broj dana u mjesecu
				int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,
						31 };

				// Ako je godina prijestupna februar ima 29 dana
				if ((M == 2 && ((Y % 4 == 0 && Y % 100 != 0)) || (Y % 400 == 0))) {
					days[M] = 29;
				}

				// Štampanje mjeseca, godine i dana u sedmici
				System.out.println("   " + months[M] + " " + Y);
				System.out.println(" S  M Tu  W Th  F  S");

				// Poèetni dan mjeseca
				int d = day(M, 1, Y);

				// Štampanje kalendara
				for (int i = 0; i < d; i++)
					// Uporeðivanje da li se prvi dan u mjesecu poklapa sa danom
					// u sedmici, ako se ne poklapa stampa se prazan prostor
					System.out.print("   ");
				for (int i = 1; i <= days[M]; i++) { // Stampaju se dani u
														// mjesecu, zavisno
														// koliko ima dana
					System.out.printf("%2d ", i);
					if (((i + d) % 7 == 0) || (i == days[M])) // Ako i doðe do
																// broja 7
																// prebacuje se
																// u novi red
						System.out.println(); // Ako i doðe do broja dana u
												// mjesecu prebacuje se u
												// sljedeæi red
				}
				System.out.println(); // Odvajanje još jednog reda radi
										// preglednosti

				// Ispis korisniku šta dalje želi da uradi
				System.out
						.println("Vasa sljedeca akcija? 1: Prikazi kalendar. 2: Dodaj podsjetnik. 3: Ucitaj sve podsjetnike. 0: Prekid.");
				izbor = 4;
			}

			// Ukoliko korisnik upise broj 2 kao izbor
			else if (izbor == 2) {

				// Pita ga se za koji dan hoce da unese podsjetnik
				System.out.println("Unesite dan:");
				int dan = ulaz.nextInt();

				// Za koji mjesec
				System.out.println("Unesite mjesec:");
				int mjesec = ulaz.nextInt();

				// Za koju godinu
				System.out.println("Unesite godinu:");
				int godina = ulaz.nextInt();

				// Prazan nextLine zbog problema preskakanja pravog nextLine
				ulaz.nextLine();

				// Tekst podsjetnika
				System.out.println("Unesite tekst podsjetnika:");
				String reminder = ulaz.nextLine();

				try {

					// Sadrzaj podsjetnika zajedno sa datumom se zapisuje u txt
					// file
					FileWriter pisac = new FileWriter("reminders.txt", true);
					pisac.write("Podsjetnik: " + reminder);
					pisac.write(" Datum :" + dan + ". ");
					pisac.write(mjesec + ". ");
					pisac.write(godina + ". ");
					pisac.write(System.getProperty("line.separator"));
					pisac.close();

					System.out.println("Podsjetnik uspjesno upisan.");

				} catch (Exception e) {
					e.printStackTrace();

				}

				System.out.println(); // Novi red radi preglednosti

				// Ispis korisniku šta dalje želi da uradi
				System.out
						.println("Vasa sljedeca akcija? 1: Prikazi kalendar. 2: Dodaj podsjetnik. 3: Ucitaj sve podsjetnike. 0: Prekid.");

				izbor = 4;

				// Ukoliko korisnik izabere opciju 3 ispisuju se svi podsjetnici
			} else if (izbor == 3) {
				try (BufferedReader citac2 = new BufferedReader(new FileReader(
						"reminders.txt"))) {
					String text = null;
					while ((text = citac2.readLine()) != null) {
						System.out.println(text);
					}
					citac2.close();
					System.out.println(); // Novi red radi preglednosti

					// Ukoliko podsjetnik još nije kreiran
				} catch (FileNotFoundException e) {
					System.out
							.println("Ne postoji nikakav podsjetnik trenutno. ");
				}

				// Ispis korisniku za sljedeæi korak
				System.out
						.println("Vasa sljedeca akcija? 1: Prikazi kalendar. 2: Dodaj podsjetnik. 3: Ucitaj sve podsjetnike. 0: Prekid.");
				izbor = 4;
			}

			// Ukoliko korisnik izabere opciju 0, program se prekida
			else if (izbor == 0) {
				System.out.println("Hvala što ste koristili ovaj program.");
			}
			// Ukoliko korisnik unese broj koji nije 0,1,2 ili 3 ispisuje se
			// greška
			else {
				System.out.println("Greška. Opcija ne postoji.");

				// Ispis korisniku za sljedeæi korak
				System.out
						.println("Vasa sljedeca akcija? 1: Prikazi kalendar. 2: Dodaj podsjetnik. 3: Ucitaj sve podsjetnike. 0: Prekid.");
				izbor = 4;
			}
		} while (izbor != 0); // Program radi dok se ne unese nula

		ulaz.close();
	}
	/*
	 * Disclaimer: Kako pravilno ispisati prvi dan u sedmici sam nasao na web-u.
	 * OStalo je trial and error koliko je vrijeme dopustalo. Not pretty but
	 * works somehow. Link:
	 * http://introcs.cs.princeton.edu/java/21function/Calendar.java.html
	 */
}
