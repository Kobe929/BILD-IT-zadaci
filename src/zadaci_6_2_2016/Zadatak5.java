package zadaci_6_2_2016;

/*@author Filip Dautovic
 * (Displaying the prime numbers) Write a program that displays all the prime
numbers less than 120 in decreasing order. Use the StackOfIntegers class
to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
reverse order.
 */

import java.util.*;

public class Zadatak5 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		// Strpavanje brojeva do 120
		for (int i = 1; i < 120; i++) {
			// Isptivanje da li su prime pomocu MyInteger klase
			MyInteger it = new MyInteger(i);
			if (it.isPrime())
				stack.push(i);
		}

		// Ispis
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

}