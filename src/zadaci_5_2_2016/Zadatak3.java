package zadaci_5_2_2016;

/*@author Filip Dautovic
 //Advanced maths?? :(
 *  Write a test
 program that prompts the user to enter values for a, b, and c and displays the result
 based on the discriminant. If the discriminant is positive, display the two roots. If
 the discriminant is 0, display the one root. Otherwise, display “The equation has
 no roots.” 
 */

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Enter value a:");
		double a = ulaz.nextDouble();

		System.out.println("Enter value b:");
		double b = ulaz.nextDouble();

		System.out.println("Enter value c:");
		double c = ulaz.nextDouble();

		QuadraticEquation equation = new QuadraticEquation(a, b, c);
		double discriminant = equation.getDiscriminant();

		if (discriminant > 0) {
			System.out.println("The roots are " + equation.getRoot1() + " and "
					+ equation.getRoot2());
		} else if (discriminant == 0) {
			System.out.println("The root is " + equation.getRoot1());
		} else {
			System.out.println("The equation has no roots");

		}
		ulaz.close();
	}

}
