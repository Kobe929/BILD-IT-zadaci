package zadaci_16_1_2016;

import java.util.Random;
import java.util.Scanner;

/*@author Filip Dautovic
 * Napisati metodu koja prima jedan argument te simulira bacanje nov�i�a toliko puta. Nakon �to se simulacija zavr�i, 
 * program ispisuje koliko puta je nov�i� pokazao glavu a koliko puta pismo.
 */

public class Zadatak5 {

	public static void main(String[] args) throws InterruptedException {

		int glava = 0; //Varijabla koja ce cuvati podatak o dobijanju glave
		int pismo = 0; //Varijabla koja je cuvati podatak o dobijanju pisma

		Scanner ulaz = new Scanner(System.in);

		//Pitanje korisnika koliko puta zeli baciti novcic
		System.out.println("Upi�ite koliko puta �elite baciti nov�i�:");
		int a = ulaz.nextInt();
		
		//Drama
		System.out.println("Bacanje nov�i�a...");

		//Petlja za prolazak kroz rjesenja
		for (int i = 0; i < a; i++) {
			Random broj = new Random(); //Jedan random broj koji ce simulirati bacanje novcica
			
			if (broj.nextDouble() <= 0.5) {		//U slucaju da je random manje ili jednako 0.5 dobija se glava
				glava++;
				System.out.println("Glava."); 
				Thread.sleep(1000); //Delay
			} else {							//U slucaju da je random vise od 0.5 dobija se pismo
				pismo++;
				System.out.println("Pismo.");
				Thread.sleep(1000); //Delay
			}
		}
		ulaz.close();
		
		//Ispis
		System.out.println(
				"Nov�i� je ba�en " + a + " puta i glava je dobijena " + glava + " puta a pismo " + pismo + " puta.");
	}
}
