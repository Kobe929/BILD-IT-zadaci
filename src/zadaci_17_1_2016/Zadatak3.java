package zadaci_17_1_2016;

/*@author Filip Dautovic
 * Nizovi niz1 i niz2 su striktno identi�ni ukoliko su svi njihovi elementi na istim pozicijama jednaki. 
 * Napisati metodu koja vra�a true ukoliko su nizovi niz1 i niz2 striktno identi�ni. Koristiti sljede�i header:
 * public static boolean equals(int[ ] niz1, int[ ] niz2)
 */

public class Zadatak3 {

	
	public static boolean equals(int[ ] niz1, int[ ] niz2){
		
		//Prvo provjeravano da li nizovi imaju istu du�inu
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
		
		//Ako ni jedan uslov nije ispunjen nizovi su identi�ni
		return true;
		
	}
	
}
