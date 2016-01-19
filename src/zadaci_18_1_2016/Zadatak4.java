package zadaci_18_1_2016;

import java.util.Random;

/*@author Filip Dautovic
 * Napisati metodu koja printa 100 nasumi�nih uppercase karaktera i 100 nasumi�nih brojeva, 10 po liniji.
 */

public class Zadatak4 {
	
	
	public static void random(){
		
		Random rand = new Random();
		
		// Slova koja �e se printati, valjda nisam koje presko�io
		String slova = "ABCDEFGHIJKLMNOPRSTUWXYZ";
		int brojac = 0; //Broja� za redove
		
		
		for(int i = 0; i < 100; i++){
			System.out.print(slova.charAt(rand.nextInt(slova.length())) + " ");
			brojac++; //100 puta printamo po jedan char sa random lokacije u stringu
			if(brojac == 10){
				System.out.println(); //Prelazak u novi red
				brojac = 0;
			}
		}
		
		for(int i = 0; i < 100; i++){
			System.out.print(rand.nextInt(100) + " "); //100 puta printamo random broj od 0 do 100 (radi preglednosti)
			brojac++;
			if(brojac == 10){
				System.out.println(); //Prelazak u novi red
				brojac = 0;
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		
		//Poziv metode
		random();

	}
	
	

}
