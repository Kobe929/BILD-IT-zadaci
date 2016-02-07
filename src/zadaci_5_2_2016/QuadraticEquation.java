package zadaci_5_2_2016;

/*@author Filip Dautovic
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + x = 0. The class contains:
  Private data fields a, b, and c that represent three coefficients.
  A constructor for the arguments for a, b, and c.
  Three getter methods for a, b, and c.
  A method named getDiscriminant() that returns the discriminant, which is
b2 - 4ac.
  The methods named getRoot1() and getRoot2() for returning two roots of
the equation
r1 = -b + 2b2 - 4ac
2a
and r2 = -b - 2b2 - 4ac
2a
These methods are useful only if the discriminant is nonnegative. Let these methods
return 0 if the discriminant is negative.
 */

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	//Konstruktor
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//Metode
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	//Formule kopirane od Halima.
	
	public double getDiscriminant() {
		return b * b - 4.0 * a * c;
	}

	public double getRoot1() {
		return (-b + Math.pow(getDiscriminant(), 0.5)) / (2.0 * a);
	}

	public double getRoot2() {
		return (-b - Math.pow(getDiscriminant(), 0.5)) / (2.0 * a);
	}

}
