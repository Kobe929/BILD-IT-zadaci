package zadaci_18_1_2016;

/*@author Filip Dautovic
 * Napisati program koji pita korisnika da unese neki cijeli broj te ispisuje njegove najmanje faktore 
 * u rastu�em redosljedu. Na primjer, ukoliko korisnik unese 120 program treba da ispi�e 
 * 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
 */

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unestite broj koji �elite razlo�iti na najmanje faktore: ");
		int broj = ulaz.nextInt();
		
		int i=2; //Po�injemo od broja 2
		
		while(broj>1) //Petlja se izvr�ava sve dok je une�eni broj ve�i od 1
		  {
			//Ako je broj djeljiv sa i �tampa se i, ako nije i se pove�ava za 1
		   if(broj%i == 0){
			   System.out.print(i+", "); 
			   broj=broj/i;
		    }else i++;
		  
		  }
		
		ulaz.close();
		}
	
		
		/*
		 * Disclaimer, nisam imao pojma kako rastaviti broj na najmanje faktore i bez jave a kamoli u javi, 
		 * pa sam na�ao na netu, po�to je dijeljenje "kontra" od mno�enja.
		 * Zapravo poku�avamo podijelit broj sa najmanjim mogu�im brojem, ako mo�e taj broj je jedan od faktora,
		 * ako ne mo�e pove�avamo broj sve dok rezultat dijeljenja unesenog broja sa brojem koji poku�avamo ne bude 1.
		 * 
		 * Math knowledge +1, hvala Dejane.
		 * Evo link, od njih je i petlja:
		 * http://www.guideforschool.com/274-program-to-find-the-prime-factors-of-a-number-method-1/
		 */
		

	}


