package zadaci_29_1_2016;

/*@author Filip Dautovic
 * Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.
 */
public class Zadatak3 {

	public static void main(String[] args) {

		double rezultat = 0; //Varijabla koja æe se koristit u petlji

		//Petlja kreæe od 1, i se povecava za 2
		for (int i = 1; i < 97; i += 2) {
			rezultat += i / (double) (i + 2); //i se dijeli sa sljedecim krojem vecim za 2
		}

		//Strampa se rezultat
		System.out.println(rezultat);
	}

}