package zadaci_6_2_2016;

/*@author Filip DAutovic
 * (Displaying the prime factors) Write a program that prompts the user to enter
 a positive integer and displays all its smallest factors in decreasing order. For
 example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
 retrieve and display them in reverse order.
 */
import java.util.*;

public class Zadatak4 {

	public static void main(String[] args) {

		//Stack of integers? O.o Kopirao sam i analizirao Ensarov zadatak.
		
		//Stack integera, slicno kao lista
		Stack<Integer> stack = new Stack<>();

		//Ulaz
		Scanner ulaz = new java.util.Scanner(System.in);

		//Ulaz od korisnika
		System.out.print("Unesite neki broj : ");
		int broj = ulaz.nextInt();
		
		//Ne moze bit 1 da ga hebes
		if (broj < 1) {
			System.out.println("PRemal broj bro");
		}

		//Krece se od 2
		int prvi = 2;
		// Rastavi broj na faktore
		while (prvi <= broj) {
			if (broj % prvi == 0) {
				stack.push(prvi);
				broj = broj / prvi;
			} else
				prvi++;
		}

		//Ispisuju se od najveceg prema najmanjem
		for (int i = stack.size(); i > 0; i--) {
			System.out.print(stack.pop()+" ");
		}

		ulaz.close();
	}
}
