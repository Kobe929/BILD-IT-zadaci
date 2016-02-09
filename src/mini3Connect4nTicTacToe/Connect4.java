package mini3Connect4nTicTacToe;

import java.util.*;

public class Connect4 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner ulaz = new Scanner(System.in);

		// Novi 2d niz
		char[][] field = new char[7][7];

		// Popunjavamo spejsovima
		for (int i = 0; i < 7; ++i)
			for (int j = 0; j < 7; ++j)
				field[i][j] = ' ';

		printField(field);

		// Mijenjanje igraca, prvi je crveni
		boolean isRed = true;
		
		while (true) {
			if (isRed)
				System.out.println("Red:");
			else
				System.out.println("Yellow:");
			System.out.print("Izaberite kolonu 1-7:");

			int column = ulaz.nextInt();
			if (column < 1 || column > 7) {
				System.out.println("1 do 7!");
				continue;
			}

			// Ako je kolona u koju korisnik pokusava unijet diks puna, ispisuje
			// se
			if (!putDisk(field, column - 1, isRed ? 'R' : 'Y')) {
				System.out.println("Kolona puna, izaberite drugu.");
				continue;
			}

			// Stampa se novo stanje polja
			printField(field);

			// Provjera ima li pobjednika poslje svakog poteza
			char result = getWinner(field);
			if (result == 'D') {
				System.out.println("Nerijeseno.");
				break;
			} else if (result == 'R') {
				System.out.println("Red wins.");
				break;
			} else if (result == 'Y') {
				System.out.println("Yellow wins.");
				break;
			}

			// Sljedeci igrac i sve ispocetka
			isRed = !isRed;
		}

	}

	// Prvo nam treba "tabla" za igru
	public static void printField(char[][] polje) {
		// To je ostvari matrica 7x7
		for (int red = 0; red < 7; ++red) {
			// Stavljamo linije da odvojimo polja u tabli
			System.out.print("| ");
			for (int kolona = 0; kolona < 7; ++kolona)
				System.out.print(polje[red][kolona] + " | ");
			System.out.println();
		}

		// I liniju na dnu
		for (int col = 0; col < 7; ++col)
			System.out.print("----");
		System.out.println();
	}

	// Ova metoda postavlja disk u tablu
	public static boolean putDisk(char[][] field, int column, char color) {

		// Ako polje na indeksu 0 i odabranoj koloni nije prazno disk se ne moze
		// postaviti
		if (field[0][column] != ' ')
			// Vraca se false da disk nije postavljen
			return false;

		// Prolazimo kroz redove
		for (int row = 0; row < 7; row++) {
			// Ako se pronadje unos na redu iz petlje i koloni unesenoj od
			// korisnika
			if (field[row][column] != ' ') {
				// Vraca se na red gdje nema nista i disk se stavlja u taj red
				// (na koloni koju je unio korisnik, naravno)
				field[row - 1][column] = color;
				// Vraca se true da je disk postavljen
				return true;
			}
		}
		// Ako prethodni upit nije nasao unos na koloni koju je unio korisnik
		// disk se postavlja na dno
		field[6][column] = color;
		// Vraca se true da je disk unesen
		return true;
	}

	/*
	 * Nakon sto smo definisali tablu i pravila unosa, moramo napraviti metode
	 * za provjeru da li postoji pobjednik poslje svakog unosa, u svakom redu,
	 * koloni i dijagonali
	 */

	// Da li postoji pobjednik u redovima
	private static char getWinnerInRows(char[][] field) {
		// Prolazak kroz svaki red
		for (int row = 0; row < 7; row++) {
			// Brojac diskova iste boje
			int count = 0;
			// Provjera da mjesto nije prazno, i ako nije da li je isto kao
			// prethodno

			for (int column = 1; column < 7; column++) {
				if (field[row][column] != ' '
						&& field[row][column] == field[row][column - 1])
					// Ako nije prazno i isto je kao prethodno brojac se
					// povecava za 1, i tako do kraja svakog reda
					count++;
				else
					// Ako nije prazno a nije ni isto kao prethodno brojac je 1
					count = 1;

				// Ako ima 4 diska iste boje
				if (count >= 4) {
					// Vraca se boja pobjednika (karakteri R ili Y)
					return field[row][column];
				}
			}
		}
		// Ako nema pobjednika vraca se char space
		return ' ';
	}

	// Provjera ima li pobjednika u kolonama-
	private static char getWinnerInColumns(char[][] field) {
		// ISto kao prethodna metoda samo se provjeravaju kolone
		for (int column = 0; column < 7; ++column) {
			int count = 0;

			for (int row = 1; row < 7; ++row) {
				if (field[row][column] != ' '
						&& field[row][column] == field[row - 1][column])
					++count;
				else
					count = 1;

				if (count >= 4) {

					return field[row][column];
				}
			}
		}

		return ' ';
	}

	// Sad malo brainfuck, provjera dijagonala
	private static char getWinnerInDiagonals(char[][] field) {

		// Krecemo od indeksa 0 1, znaci gore lijevo prema dole desno
		for (int column = 0; column < 7; ++column) {
			int count = 0;

			// Pocetak od reda indeksa 1, jer opet provjeravamo svako polje sa
			// prethodnim a da bi izbjegli outofbounds
			for (int row = 1; row < 7; ++row) {

				// Zaustavljamo provjeru kada je red + kolona 7, jer ne mogu
				// stat 4 diska u ostatak, i izbjegavamo da se pretrazuje van
				// polja
				if (column + row >= 7)
					break;
				// Ako je polje iste boje kao prethodno povecava se brojac
				if (field[row][column + row] != ' '
						&& field[row - 1][column + row - 1] == field[row][column
								+ row])
					++count;
				else
					count = 1;
				if (count >= 4)
					// Ako ima 4 ista vraca se
					return field[row][column + row];
			}
		}

		// Sad dijagonale koje poèinju sa svakim redom
		for (int row = 0; row < 7; ++row) {
			int count = 0;

			for (int column = 1; column < 7; ++column) {

				if (column + row >= 7)
					break;
				if (field[row + column][column] != ' '
						&& field[row + column - 1][column - 1] == field[row
								+ column][column])
					++count;
				else
					count = 1;
				if (count >= 4)
					return field[row + column][column];
			}
		}

		// Sad sa desne strane,
		for (int column = 0; column < 7; ++column) {
			int count = 0;
			// Prvo iz coska krecemo
			for (int row = 1; row < 7; ++row) {

				if (column - row < 0)
					break;
				if (field[row][column - row] != ' '
						&& field[row - 1][column - row + 1] == field[row][column
								- row])
					++count;
				else
					count = 1;
				if (count >= 4)
					return field[row][column - row];
			}
		}

		// I jos dijagonale koje krecu sa kraja svakog reda
		for (int row = 0; row < 7; ++row) {
			int count = 0;

			for (int column = 5; column >= 0; --column) {

				if (column - row < 0)
					break;
				if (field[column - row][column] != ' '
						&& field[column - row - 1][column + 1] == field[column
								- row][column])
					++count;
				else
					count = 1;
				if (count >= 4)
					return field[column - row][column];
			}
		}

		// Ako jos nema pobjednika vraca se space char
		return ' ';
	}

	// Metoda vraca pobjednika
	public static char getWinner(char[][] field) {
		// DA li ima pobjednik po redovima
		char winner = getWinnerInRows(field);
		if (winner != ' ')
			return winner;
		// da li ima pobjednika u kolonama
		winner = getWinnerInColumns(field);
		if (winner != ' ')
			return winner;
		// I po dijagonalama
		winner = getWinnerInDiagonals(field);
		if (winner != ' ')
			return winner;

		// Ako nema pobjednika, a sva mjesta su popunjena
		for (int i = 0; i < field.length; ++i)
			for (int j = 0; j < field[i].length; ++j)
				if (field[i][j] == ' ')
					return ' ';

		// Vraca se D, tj nerijeseno je
		return 'D';
	}

}