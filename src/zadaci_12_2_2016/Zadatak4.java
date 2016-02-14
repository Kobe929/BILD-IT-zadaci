package zadaci_12_2_2016;

/*@author Filip Dautovic
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following
requirements:
 Creates an array with 100 randomly chosen integers.
 Prompts the user to enter the index of the array, then displays the corresponding
element value. If the specified index is out of bounds, display the
message Out of Bounds.
 */

import java.util.*;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		Random rand = new Random();
		
		int[] niz = new int[100];
		
		for(int i = 0; i < niz.length; i++){
			niz[i] = rand.nextInt(1000);
		}

		System.out.println("Unesite polje u nizu na kojem zelite vidjeti vrijednost");
		
		boolean uslov = true;
		
		while(uslov){
			try{
				System.out.println(niz[ulaz.nextInt()]);
			} catch(IndexOutOfBoundsException e){
				System.out.println("Index ne postoji. Unesite od 0 do 99.");
			}
		}
		
		ulaz.close();
		
	}

}
