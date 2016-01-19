package zadaci_18_1_2016;

/*@author Filip Dautovic
 * Napisati program koji pita korisnika da unese neki cijeli broj te ispisuje njegove najmanje faktore 
 * u rastuæem redosljedu. Na primjer, ukoliko korisnik unese 120 program treba da ispiše 
 * 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
 */

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unestite broj koji želite razložiti na najmanje faktore: ");
		int broj = ulaz.nextInt();
		
		int i=2; //Poèinjemo od broja 2
		
		while(broj>1) //Petlja se izvršava sve dok je unešeni broj veæi od 1
		  {
			//Ako je broj djeljiv sa i štampa se i, ako nije i se poveæava za 1
		   if(broj%i == 0){
			   System.out.print(i+", "); 
			   broj=broj/i;
		    }else i++;
		  
		  }
		
		ulaz.close();
		}
	
		
		/*
		 * Disclaimer, nisam imao pojma kako rastaviti broj na najmanje faktore i bez jave a kamoli u javi, 
		 * pa sam našao na netu, pošto je dijeljenje "kontra" od množenja.
		 * Zapravo pokušavamo podijelit broj sa najmanjim moguæim brojem, ako može taj broj je jedan od faktora,
		 * ako ne može poveæavamo broj sve dok rezultat dijeljenja unesenog broja sa brojem koji pokušavamo ne bude 1.
		 * 
		 * Math knowledge +1, hvala Dejane.
		 * Evo link, od njih je i petlja:
		 * http://www.guideforschool.com/274-program-to-find-the-prime-factors-of-a-number-method-1/
		 */
		

	}


