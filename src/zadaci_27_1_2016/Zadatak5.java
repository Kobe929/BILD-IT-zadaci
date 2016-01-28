package zadaci_27_1_2016;

/*@author Filip Dautovic
 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita pakovanja. Želimo napisati program 
 * koji uporeðuje cijene ta dva pakovanja. Program pita korisnika da unese težinu i cijenu oba pakovanja te 
 * ispisuje koje pakovanje ima bolju cijenu.
 */

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		//Novi skener
		Scanner ulaz = new Scanner(System.in);
		
		//Ulazi od korisnika
		System.out.println("Unesite cijenu prvog proizvoda:");
		double cijena1 = ulaz.nextDouble();
		System.out.println("Unesite tezinu prvog proizvoda:");
		double tezina1 = ulaz.nextDouble();
		
		System.out.println("Unesite cijenu drugug prozivoda:");
		double cijena2 = ulaz.nextDouble();
		System.out.println("Unesite cijenu drugog proizvoda:");
		double tezina2 = ulaz.nextDouble();
		
		//Racunanje prosjeka cijene i tezine
		double prosjekCijene = (cijena2 / cijena1) * 100; 
		double prosjekTezine = (tezina2 / tezina1) * 100;
		
		//Ako su isti ispisuje se
		if(prosjekCijene == prosjekTezine ){
			System.out.println("Proizvodi su jednako isplativi.");
		}
		//Ako je prvi isplativiji ispisuje se
		else if(prosjekCijene > prosjekTezine){
			System.out.println("Isplativiji je prvi proizvod.");
		}
		//I ako je drugi isplativiji
		else{
			System.out.println("Isplativiji je drugi proizvod.");
		}
		
		ulaz.close();
		
		
		
	}

}
