package zadaci_20_1_2016;

import java.util.Scanner;

/*@author Filip Dautovic
 * Napisati metode sa sljedeæim headerima: public static int reverse(int number) i 
 * public static boolean isPalindrome(int number). Prva metoda prima cijeli broj kao argument i 
 * vraæa isti ispisan naopako. (npr. reverse(456) vraæa 654.) Druga metoda vraæa true ukoliko je broj
 *  palindrom a false ukoliko nije. Koristite reverse metodu da implementirate isPalindrome metodu. 
 *  Napišite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne. 
 */

public class Zadatak3 {

	public static int reverse(int number) {

		int broj = number; //Varijabla koja æe æuvat vrijednost number-a
		int reverse = 0; //Varijabla koja æe èuvati obrnut broj

		//"Okreæanje"
		while (broj != 0) {
			reverse = reverse * 10;
			reverse = reverse + broj % 10;
			broj = broj / 10;
		}
		return reverse;
	}

	public static boolean isPalindrome(int number){
		
		//Ispitivanje da li je broj palindrom
		if(number == reverse(number)){
			return true;
			
		}else{ 
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		//Ulaz od korisnika
		System.out.println("Unesite broj:");
		int a = ulaz.nextInt();
		
		//Poziv metoda
		System.out.println(reverse(a) +" "+ isPalindrome(a));

		ulaz.close();
	}

}
