package zadaci_21_1_2016;

/*@author Filip Dautovic
 * Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih pozitivnih djelilaca, 
 * iskljuèujuæi sebe. Na primjer, 6 je prvi savršeni broj jer 6 = 3 + 2 + 1. Sljedeæi savršeni broj je 
 * 28 jer 28 = 14 + 7 + 4 + 2 + 1. Samo 4 savršena broja postoje u rasponu od 0 do 10.000. 
 * Napišite program koji ispisuje sva 4.
 */

public class Zadatak4 {

	public static void main(String[] args) {

		//Prolazimo kroz brojeve od 1 do 10000
		for (int i = 1; i <= 10000; i++) {
			int zbir = 0;  	//Zbir svih djeljitelja broja, vraæa se na nulu za svaki broj
			for (int j = 1; j < i; j++) { //Prolazimo kroz djeljitelje
				if ((i % j) == 0) { //Testiramo da li su djeljitelji faktori broja
					zbir += j; //Ako jesu sabiramo djeljitelje
				}
			}
			if (zbir == i) { //Ako je zbir najmanjih faktora jednak broju broj je savršen
				System.out.println("Savršeni broj: " + zbir);
			}
		}

	}

}
