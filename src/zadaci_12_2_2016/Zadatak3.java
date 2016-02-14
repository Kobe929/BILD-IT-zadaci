package zadaci_12_2_2016;

/*@author Filip Dautovic
 * (InputMismatchException) Write a program that prompts the user to read
 two integers and displays their sum. Your program should prompt the user to
 read the number again if the input is incorrect
 */

import java.util.*;

public class Zadatak3 {

	public static void main(String[] args) {

		//Skener
		Scanner ulaz = new Scanner(System.in);

		//Uslov za petlju
		boolean uslov = true;

		//Petlja
		while (uslov) {
			//Traj
			try {
				System.out.println("Unesite prvi broj:");
				int a = ulaz.nextInt();

				System.out.println("Unesite drugi broj:");
				int b = ulaz.nextInt();

				//Ako su ulazi integeri ispisuje se rezultat 
				System.out.println("Rezultat sabiranja " + a + "+" + b
						+ " je: " + (a + b));
				
				//I petlja zavrsava sa radom
				uslov = false;
				
			} catch (InputMismatchException e) {
				//Ako se unese pogrsno idemo ispocetka
				ulaz.nextLine();
				System.out.println("Unesi cijele brojeve bro.");

			}
		}
		ulaz.close();
	}

}
