package zadaci_5_2_2016;

/*@author Filip Dautovic
 * (Geometry: intersecting point) Suppose two line segments intersect. The two endpoints
for the first line segment are (x1, y1) and (x2, y2) and for the second line
segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
these four endpoints and displays the intersecting point. As discussed in Programming
Exercise 3.25, the intersecting point can be found by solving a linear equation.
Use the LinearEquation class in Programming Exercise 9.11 to solve this
equation.
 */

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		// Ulaz od korisnika
		System.out.println("Unesite koordinate prve tacke prve linije:");
		double x1 = ulaz.nextDouble();
		double y1 = ulaz.nextDouble();

		System.out.println("Unesite koordinate druge tacke prve linije:");
		double x2 = ulaz.nextDouble();
		double y2 = ulaz.nextDouble();

		System.out.println("Unesite koordinate prve tacke druge linije:");
		double x3 = ulaz.nextDouble();
		double y3 = ulaz.nextDouble();

		System.out.println("Unesite koordinate druge tacke druge linije:");
		double x4 = ulaz.nextDouble();
		double y4 = ulaz.nextDouble();

		// Ako su paralelne, ne sijeku se
		double paralele = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);

		if (paralele == 0) {
			System.out.println("Linije su paralelne");
			System.exit(0);
		}

		// Kreiranje objekta za racunanje
		LinearEquation linear = new LinearEquation((y1 - y2), (-x1 + x2),
				(y3 - y4), (-x3 + x4), (-y1 * (x1 - x2 + (y1 - y2) * x1)), (-y3
						* (x3 - x4) + (y3 - y4) * x3));

		// linije se sjeku na :
		System.out.println("Linije se sjeku na " + linear.getX() + " "
				+ linear.getY());

		ulaz.close();
	}
}