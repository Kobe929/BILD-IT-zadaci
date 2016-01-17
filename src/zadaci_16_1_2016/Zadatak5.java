package zadaci_16_1_2016;

import java.util.Random;
import java.util.Scanner;

/*@author Filip Dautovic
 * Napisati metodu koja prima jedan argument te simulira bacanje novèiæa toliko puta. Nakon što se simulacija završi, 
 * program ispisuje koliko puta je novèiæ pokazao glavu a koliko puta pismo.
 */

public class Zadatak5 {

	public static void main(String[] args) throws InterruptedException {

		int glava = 0; //Varijabla koja ce cuvati podatak o dobijanju glave
		int pismo = 0; //Varijabla koja je cuvati podatak o dobijanju pisma

		Scanner ulaz = new Scanner(System.in);

		//Pitanje korisnika koliko puta zeli baciti novcic
		System.out.println("Upišite koliko puta želite baciti novèiæ:");
		int a = ulaz.nextInt();
		
		//Drama
		System.out.println("Bacanje novèiæa...");

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
				"Novèiæ je baèen " + a + " puta i glava je dobijena " + glava + " puta a pismo " + pismo + " puta.");
	}
}
