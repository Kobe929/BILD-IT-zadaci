package zadaci_5_2_2016;

/*@author Filip Dautovic
 * Write a test
program that prompts the user to enter a, b, c, d, e, and f and displays the result.
If ad - bc is 0, report that “The equation has no solution.” 
 */

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);

        System.out.print("Enter 6 doubles:");
        double a = ulaz.nextDouble();
        double b = ulaz.nextDouble();
        double c = ulaz.nextDouble();
        double d = ulaz.nextDouble();
        double e = ulaz.nextDouble();
        double f = ulaz.nextDouble();

        LinearEquation linear = new LinearEquation(a,b,c,d,e,f);

        if (linear.isSolvable()) {
            System.out.println("X je: " + linear.getX() + ". Y je " + linear.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    
	ulaz.close();
	}

}