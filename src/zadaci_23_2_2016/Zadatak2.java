package zadaci_23_2_2016;

/*@author Filip Dautovic
 * (Print the characters in a string reversely) Write a recursive method that displays
a string reversely on the console using the following header:
public static void reverseDisplay(String value)

 For example, reverseDisplay("abcd") displays dcba. Write a test program
that prompts the user to enter a string and displays its reversal.
 */

public class Zadatak2 {

	// Metoda za adoteM
	public static void reverseDisplay(String value) {

		// Ako dužina padne na 0
		if (value.length() == 0)
			return;

		// Printa se substring na lokaciji duzina -1
		System.out.print(value.substring(value.length() - 1));

		// Ponovo se poziva metoda sa otkinutim posljednim karakterom
		reverseDisplay(value.substring(0, value.length() - 1));

	}

	public static void main(String[] args) {

		//Poziv metode
		reverseDisplay("Metoda");

	}

}
