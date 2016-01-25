package zadaci_24_1_2016;

/*@author Filip Dautovic
 *  Napisati program koji ispisuje sve moguæe kombinacije za biranje dva broja u rasponu od 1 do 7. 
 *  Takoðer, program ispisuje broj svih moguæih kombinacija.  Dakle, program treba da ispiše sve moguæe parove 
 *  brojeva u datom rasponu, krenuvši sa 1 2, 1 3, 1 4, itd. Broj moguæih kombinacija je 21. 
 */

public class Zadatak3 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 7; i++){       //Prolazenje kroz kombinacije, slicno kao kroz 2d niz
			for(int j = 1; j < i; j++){
				System.out.println(i +" "+ j); //Stampanje
			}
		}
	}

}
