package mini2CrapsAndCreditCards;

/*@author Filip Dautovic
 * 10000 Craps statistic
 */

public class CrapsBonus {
	// Metoda za bacanje kocki
	public static int bacaj() {

		// Kocke od 1-6
		int kocka1 = (int) (Math.random() * 6) + 1;
		int kocka2 = (int) (Math.random() * 6) + 1;

		// Rezultat je zbir dbivenih brojeva
		return kocka1 + kocka2;
	}

	public static int[] igra() {

		// Poziva se metoda za bacanje kocki
		int rezultat = bacaj();

		int win = 0; // Umjesto ispisivanja pobjeda ili izgubljenih one se
						// upisuju u varijable, malo san zakomplikovao ali radi
		int lost = 0;

		// Ako se dobije 2, 3 ili 12 korisnik gubi
		if (rezultat == 2 || rezultat == 3 || rezultat == 12) {
			// System.out.println("Zbir kocki je " + rezultat +
			// ". Izgubili ste.");
			lost++;
		}

		// Ako se dobije 7 ili 11 korisnik dobiva
		else if (rezultat == 7 || rezultat == 11) {
			// System.out.println("Zbir kocki je " + rezultat
			// + ". Pobijedili ste!");
			win++;
		}

		else {
			// Ako se dobije neka druga kombinacija
			while (true) {
				// Baca se ponovo
				int rezultat2 = bacaj();
				// Ako u drugom bacanju rezultat bude 7 korisnik gubi
				if (rezultat2 == 7) {
					// System.out.println("Prethodno izvucen broj je " +
					// rezultat
					// + ", ponovnim bacanjem ste dobili 7. Izgubili ste.");
					lost++;
					break;
				}
				// Ako se dobije isti zbir korisnik pobijedjuje
				if (rezultat2 == rezultat) {
					// System.out
					// .println("Prethodno izvucen broj je "
					// + rezultat
					// +
					// ", ponovnim bacanjem ste dobili isti broj. Pobijedili ste.");
					win++;
					break;
				}
			}
		}
		return new int[] { win, lost };
	}

	public static void main(String[] args) {

		// Brojanje
		int pobjede = 0;
		int izgubljene = 0;

		// Prolazak 0 - 9999
		for (int i = 0; i < 10000; i++) {

			// Brojanje
			int rezultat[] = igra();
			if (rezultat[0] == 1)
				pobjede++;
			else if (rezultat[1] == 1)
				izgubljene++;
		}

		// ispis
		System.out.println("Od odigranih 10000 partija, pobijedjeno je "
				+ pobjede + " puta a izgubljeno " + izgubljene + " puta.");

	}

}
