package zadaci_3_2_2016;

/*@author Filip Dautovic
 * (Compute the weekly hours for each employee) Suppose the weekly hours for all
 employees are stored in a two-dimensional array. Each row records an employee’s
 seven-day work hours with seven columns. For example, the following
 array stores the work hours for eight employees. Write a program that displays
 employees and their total hours in decreasing order of the total hours.
 */

import java.util.*;

class Zadatak1 {

	public static void main(String[] args) {

		//Novi skener
		Scanner ulaz = new Scanner(System.in);

		//Korisnik unosi koliko radnika ima
		System.out.println("Unesite broj radnika:");
		int brojRadnika = ulaz.nextInt();

		//Lista imena radnika
		ArrayList<String> radnici = new ArrayList<String>();

		//Niz sa radnicima i satima
		int[][] sati = new int[brojRadnika][6];

		//Zbir ce se kasnije koristiti za sate
		int zbir = 0;

		//Prazan nextLine, desava se problem da nextInt proguta nextLine ako idu jedan iza drugog
		ulaz.nextLine();

		//Korisnik unosi imena radnika
		for (int i = 0; i < brojRadnika; i++) {
			System.out.println("Unesite ime radnika: " + i);
			radnici.add(ulaz.nextLine());
		}

		//Korisnik unosi sate za svakog radnika
		for (int i = 0; i < brojRadnika; i++) {
			System.out.println("Unesite sate od " + radnici.get(i));
			for (int j = 0; j < 6; j++) {
				System.out.println("Dan " + (j + 1));
				sati[i][j] = ulaz.nextInt();
			}

		}

		//SAbiru se sati za svakog radnika pojedinacno
		for (int i = 0; i < brojRadnika; i++) {
			for (int j = 0; j < 6; j++) {
				zbir += sati[i][j];
			} //Ispisuje se rezultat
			System.out.println("Radnik " + radnici.get(i)
					+ " je ove sedmice radio " + zbir + " sati.");
			zbir = 0;
			//Zbir se resetuje za sljedeceg radnika
		}

		ulaz.close();
	}

}
