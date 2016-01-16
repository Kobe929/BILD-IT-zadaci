package zadaci_15_1_2016;

/*@author Filip Dautovic
 * Napišite program koji generiše 100 nasumicnih cijelih brojeva izmedju 0 i 9 te ispisuje koliko se puta koji broj ponovio.
 */
public class Zadatak4 {

	public static void main(String[] args) {

		int[] brojevi = new int[100]; // Niz brojeva
		int[] brojac = new int[10]; // Niz za brojace

		// Popunjavanje brojeva
		for (int i = 0; i < brojevi.length; i++) {
			brojevi[i] = (int) (Math.random() * 10);
		}

		// Prolazak kroz niz i ispitivanje uslova
		for (int i = 0; i < brojevi.length; i++) {
			if (brojevi[i] == 0)
				brojac[0]++;
			else if (brojevi[i] == 1)
				brojac[1]++;
			else if (brojevi[i] == 2)
				brojac[2]++;
			else if (brojevi[i] == 3)
				brojac[3]++;
			else if (brojevi[i] == 4)
				brojac[4]++;
			else if (brojevi[i] == 5)
				brojac[5]++;
			else if (brojevi[i] == 6)
				brojac[6]++;
			else if (brojevi[i] == 7)
				brojac[7]++;
			else if (brojevi[i] == 8)
				brojac[8]++;
			else
				brojac[9]++;
		}

		// Ispis rezultata
		for (int i = 0; i < brojac.length; i++) {
			System.out.println("Broj " + i + " ponavlja se " + brojac[i] + " puta");
		}

	}

}