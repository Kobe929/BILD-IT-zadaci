package zadaci_20_1_2016;

import java.util.Scanner;

/*@author Filip Dautovic
 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeæe v, možemo izraèunati minimalnu 
 * dužinu piste potrebne da avion uzleti koristeæi se sljedeæom formulom: dužina = v * v / 2a. Napisati 
 * program koji pita korisnika da unese v u m/s i a u m/s(nakvadrat) te ispisuje korisniku minimalnu dužinu piste. 
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je 514.286)
 */

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		//Unos ubrzanja
		System.out.println("Unesite ubrzanje aviona u m/s2:");
		double a = ulaz.nextDouble();
		
		//Unos brzine
		System.out.println("Unesite brzinu pri kojoj avion uzlijece u m/s:");
		double v = ulaz.nextDouble();
		
		//Formula
		double duzina = Math.pow(v,2) / (2 * a);
		duzina = (double) Math.round(duzina * 1000) / 1000; //Zaokruživanje
		
		
		//Ispis rezultata
		System.out.println("Minimalna dužina piste je " +duzina+ " metara.");
		
		ulaz.close();
		
	}

}
