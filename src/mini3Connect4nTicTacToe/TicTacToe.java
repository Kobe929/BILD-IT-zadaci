package mini3Connect4nTicTacToe;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		// Kreiramo matricu 3x3
		int[][] field = new int[3][3];

		// Popunjavamo nulama
		for (int i = 0; i < 3; ++i)
			for (int j = 0; j < 3; ++j)
				field[i][j] = 0;

		// Uslov za petlju
		boolean uslov = false;

		// Varijabla kojace pamtit koji je igrac trenutno na potezu
		int player = 2;

		// Brojac poteza
		int count = 0;

		while (!uslov) {

			// Ispis
			printField(field);

			// U svakom potezu se igrac mijenja
			player = player == 2 ? 1 : 2;

			// MEtoda za unos
			field(field, player);

			// Povecava se brojac poteza
			count++;

			// Svaki put se provjerava da li imamo pobjednika
			uslov = getWinnerInRows(field, player) || getWinnerInColumns(field, player)
					|| getWinnerInDiagonals(field, player);

			// imamo maksimalno 9 poteza, inace se igra prekida
			if (count > 9) {
				break;
			}
		}

		// Ako neka metoda vrati true imamo pobjednika, ispisuje se koji je
		// igrac pobjednik
		if (uslov) {
			System.out.println("Pobijedio je " + player + ". igrac.");
		} else {
			System.out.println("Nerijeseno :(");
		}

		// Ispisuje se stanje na tabeli
		printField(field);

	}

	// Ispis tabele
	public static void printField(int[][] field) {

		// Gornja linija
		System.out.println(" K  O  L  O  N  A");
		System.out.println(" -------------------");
		for (int i = 0; i < field.length; i++) {

			// Ostale linije i unosi
			System.out.print(i == 0 ? "R" : i == 1 ? "E" : "D");

			System.out.print("|");
			for (int j = 0; j < field.length; j++) {

				System.out.print((field[i][j] != 0 ? "  "
						+ (field[i][j] == 1 ? "X" : "O") + " " : "    ")
						+ " |");
			}
			System.out.print("\n -------------------\n");
		}
	}

	// Metoda za unos
	public static void field(int[][] field, int player) {

		// Uslov koji se koristi u petlji
		boolean uslov = true;

		while (uslov) {

			// Ulaz od korisnika
			System.out.println("Igrac " + player + ", unesite red pa kolonu:");
			int row = userInput();
			int colum = userInput();

			// Ako je vec popunjeno ispisuje se greska
			if (field[row][colum] != 0) {
				System.out.println("Zauzeto! Izaberite drugo polje: ");
				printField(field);

			} else {
				// Ako je polje prazno, upisuje se znak
				field[row][colum] = player;
				uslov = false;
			}
		}
	}

	// Metoda za preocesuiranje ulaza
	public static int userInput() {

		@SuppressWarnings("resource")
		// bez ovoga se skener zatvori poslje prvog uèitavanja
		Scanner ulaz = new Scanner(System.in);

		// Varijabla u koju se prema unos od korisnika
		int broj = 0;

		// Uslov za petlju
		boolean uslov = true;

		while (uslov) {

			broj = ulaz.nextInt() - 1; // Smanjujemo unos za 1 radi indeksa

			if (broj >= 0 && broj < 3) {
				// Ako je unos ok picimo dalje
				uslov = false;
			} else {
				// Ako nije, sorry brah èitaj malo bolje
				System.out.println("1 -3 noob. Probaj ponovo:");
			}

		}

		// Vraca se uneseni broj
		return broj;

	}

	// Provjera redova
	public static boolean getWinnerInRows(int[][] field, int player) {

		// Prolazimo kroz redove
		for (int i = 0; i < field.length; i++) {
			int count = 0;

			for (int j = 0; j < field.length; j++) {

				// Ako je polje jednako igracu, povecava se brojac
				if (field[i][j] == player) {
					count++;
				}
			}
			// Ako imaju 3 ista znaka u redu igrac je pobijedio
			if (count == 3) {
				return true;
			}
		}
		// Ili ipak ne
		return false;
	}

	// Provjera kolona
	public static boolean getWinnerInColumns(int[][] field, int player) {

		// Proc cemo kroz matricu
		for (int i = 0; i < field.length; i++) {
			int count = 0;

			// I kolone
			for (int j = 0; j < field.length; j++) {

				// Ako na nekom polju ima roj igraca povecava se brojac
				if (field[j][i] == player) {
					count++;
				}
			}
			// Ako imaju 3 u koloni taj je igrac pobijedio
			if (count == 3) {
				return true;
			}
		}
		// Alas, no!
		return false;
	}

	// Provjera damned dijagonala
	//Sreca imaju samo 2
	public static boolean getWinnerInDiagonals(int[][] field, int player) {
		
		//Brojac
		int count = 0;
		
		//Prva
		for (int i = 0; i < field.length; i++) {
			if (field[i][i] == player) {
				count++;
			}
		}

		//Isto kao gore
		if (count == 3) {
			return true;
		}

		// Druga
		for (int i = 0; i < field.length; i++) {
			
			// Ako svi clanovi dijagonale ne sadrze broj nekog igraca, nije to to
			if (field[i][field.length - 1 - i] != player) {
				return false;
			}
		}
		return true;
	}

}