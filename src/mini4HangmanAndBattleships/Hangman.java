package mini4HangmanAndBattleships;

/*@author Filip DAutovic
 * Simple hangman
 */
import java.util.Scanner;

public class Hangman {

	// Niz rijeci
	static String[] rijeci = { "meduza", "problematika", " debilizam",
			"philips", "menadzer", "neampojma",
			"hibridnognojivopogoditcesmalomorgen" };

	// Boolean za uslov
	static boolean tacno;

	public static void main(String[] args) {

		// Novi skener
		Scanner ulaz = new Scanner(System.in);

		// String za petlju
		String izbor = "1";

		// Petlja radi dok je string 1
		while (izbor.equals("1")) {

			// Pozivamo metodu da nam vrati rndom rijec iz gornjeg niza
			String word = getRijec();

			// Tu istu rijec saljemo na "maskiranje"
			String hiddenWord = getHiddenRijec(word);

			// Brojac pogresnih pogadnjanja
			int fulio = 0;

			// Druga petlja radi dok su rijeci razlicite
			while (!word.equals(hiddenWord)) {

				// Ispis korisniku da unese slovo
				System.out.print("Pogodite slova u rijeci: " + hiddenWord);
				char slovo = ulaz.next().charAt(0);

				// Ako slovo nije vec uneseno
				if (!vecUneseno(hiddenWord, slovo)) {

					// Onda se salje metodi koja provjerava postoji li slovo u
					// originalnoj rijeci i ako ima strpava ga u maskiranu rijec
					hiddenWord = provjeriSlovo(word, hiddenWord, slovo);

					//Ako se vrne false ispisuje se da se slovo ne nalazi u rijeci i povecava brojac pogresnih pokusaja
					if (!tacno) {
						System.out.println(slovo + " se ne nalazi u rijeci.");
						fulio++;
					}

				} else {
					//Ako je vec uneseno, to se i ispisuje
					System.out.println(slovo + " je vec otkriveno.");
				}

				//Ispisuje se ciko
				crtez(fulio);

				//Ako je 7 puta uneseno pogresno slovo unutrasnja petlja prestaje sa radom
				if (fulio == 7) {
					break;
				}
			}
			
			System.out.println("Izgubili ste. Unijeli ste pogresno slovo "
					+ fulio + " puta. Rijesenje je:" + word);
			System.out.println("Ponovo? upisite 1 za da, 2 za ne:");
			izbor = ulaz.next();
		}

	}

	//Vraca random rijec iz gornjeg niza
	public static String getRijec() {
		return rijeci[(int) (Math.random() * rijeci.length)];
	}

	//Vraca zvjezdice u duzini orig rijeci
	public static String getHiddenRijec(String rijec) {

		String secret = "";
		for (int i = 0; i < rijec.length(); i++) {
			secret += "*";
		}
		return secret;
	}

	//Provjerava da li se slovo nalazi u orig rijeci 
	static public String provjeriSlovo(String word, String hiddenWord,
			char slovo) {

		tacno = false;
		StringBuilder s = new StringBuilder(hiddenWord);
		for (int i = 0; i < word.length(); i++) {

			//Ako da, smjestava ga u maskirano slovo
			if (slovo == word.charAt(i) && s.charAt(i) == '*') {
				tacno = true;
				s = s.deleteCharAt(i);
				s = s.insert(i, slovo);
			}
		}
		return s.toString();
	}

	//Ispituje da li je slovo vec otkriveno, tako sto provjerava nalazi li se u secret rijeci
	public static boolean vecUneseno(String hiddenWord, char slovo) {

		for (int i = 0; i < hiddenWord.length(); i++) {

			if (slovo == hiddenWord.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	// Ispis cike WoW
	public static void crtez(int n) {
		if (n == 0) {
			System.out.println("-------");
			System.out.println("|       ");
			System.out.println("|       ");
			System.out.println("|         ");
			System.out.println("|         ");
		} else if (n == 1) {
			System.out.println("-------");
			System.out.println("|      |");
			System.out.println("|       ");
			System.out.println("|       ");
			System.out.println("|       ");
		} else if (n == 2) {
			System.out.println("-------");
			System.out.println("|      |");
			System.out.println("|      O");
			System.out.println("|       ");
			System.out.println("|       ");
		} else if (n == 3) {
			System.out.println("-------");
			System.out.println("|      |");
			System.out.println("|      O");
			System.out.println("|      l");
			System.out.println("|       ");
		} else if (n == 4) {
			System.out.println("-------");
			System.out.println("|      |");
			System.out.println("|      O");
			System.out.println("|     /l");
			System.out.println("|       ");
		} else if (n == 5) {
			System.out.println("-------");
			System.out.println("|      |");
			System.out.println("|      O");
			System.out.println("|     /l\\");
			System.out.println("|         ");
		} else if (n == 6) {
			System.out.println("-------");
			System.out.println("|      |");
			System.out.println("|      O");
			System.out.println("|     /l\\");
			System.out.println("|     / ");
		} else if (n == 7) {
			System.out.println("-------");
			System.out.println("|      |");
			System.out.println("|      O");
			System.out.println("|     /l\\");
			System.out.println("|     / \\");
		}

	}

}
