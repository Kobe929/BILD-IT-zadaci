package zadaci_16_1_2016;

import java.io.*;
import java.util.Scanner;

/*@author Filip Dautovic
 * Napi�ite program koji �e brojati broj karaktera, rije�i i linija teksta u nekom fileu. 
 * Rije�i trebaju biti odvojene jednim spaceom. Ime file proslijediti kao argument u va� program. 
 * (Ovo je text koji �u jakoristiti za testiranje, ukoliko nema ideja)
 */
public class Zadatak3 {

	public static void main(String[] args) throws FileNotFoundException {

		int karakter = 0; //Pocetni kroj karaktera
		int rijeci = 0; //Pocetni broj rijeci
		int linije = 0; //Pocetni broj linija

		
		try {
			File tekst = new File("src\\zadaci_16_1_2016\\text.txt"); //Ucitaj fajl

			Scanner ulaz = new Scanner(tekst); //Skeniranje teksta

			while (ulaz.hasNextLine()) {
				linije++; //Sve dok skener ima novu liniju povecavaj broj linija

				String linija = ulaz.nextLine(); //Smjestanje linije u string

				Scanner ulaz2 = new Scanner(linija); //Skeniranje linije na rijeci

				while (ulaz2.hasNext()) { //Sve dok ima rijeci povecavaj im broj
					rijeci++;
					String word = ulaz2.next(); //Smjesti rijec po rijec u string
					karakter += word.length(); //i sabiri duzine svake rijeci
				}
				ulaz2.close();
			}

			ulaz.close();
			
			//Ispisi rezultat u konzolu 
			System.out.println("Skenirani tekst ima " +karakter+ " karaktera " + rijeci + " rijeci i " + linije + " linija.");

			//Ukoliko fajl nije pronadjen prikazi gresku
		} catch (FileNotFoundException e) {
			System.out.println("Fajl nije prona�en.");

		}
	}
}
