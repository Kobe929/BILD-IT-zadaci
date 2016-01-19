package zadaci_17_1_2016;

/*@author Filip Dautovic
 * Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi na istim pozicijama jednaki. 
 * Napisati metodu koja vraæa true ukoliko su nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi header:
 * public static boolean equals(int[ ] niz1, int[ ] niz2)
 */

public class Zadatak3 {

	
	public static boolean equals(int[ ] niz1, int[ ] niz2){
		
		//Prvo provjeravano da li nizovi imaju istu dužinu
		if(niz1.length != niz2.length){
			return false;
		}
		//Onda provjeravamo da li nizovi imaju iste vrijednosti na istim indexima
		else{
			for(int i = 0; i < niz1.length; i++){
				if(niz1[i] != niz2[i]){
					return false;
				}
				
			}
			
		}
		
		//Ako ni jedan uslov nije ispunjen nizovi su identièni
		return true;
		
	}
	
}
