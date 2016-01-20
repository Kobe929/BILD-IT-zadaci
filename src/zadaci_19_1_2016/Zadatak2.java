package zadaci_19_1_2016;

/*@author Filip Dautovic
 * Napisati program koji simulira nasumi�no izvla�enje karte iz �pila od 52 karte. 
 * Program treba ispisati koja karta je izvu�ena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) 
 * te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10 u znaku kocke.
 */

import java.util.Random;

public class Zadatak2 {

	public static void main(String[] args) {

		// Smjestiti �emo karte u niz karte a znakove u niz znak
		String[] karte = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		String[] znak = { "Srce", "Pik", "Djetelina", "Kocka" };

		Random rand = new Random();

		// Koristimo random da isprintamo nasumi�nu kartu iz niza karte i
		// nasumi�ni znak
		System.out.println("Karta koju ste izvukli je "
				+ karte[rand.nextInt(13)] + " u znaku " + znak[rand.nextInt(4)]
				+ ".");

	}

}
