package zadaci_5_2_2016;

public class LinearEquation {

	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	// Konstruktor
	public LinearEquation(double a, double b, double c, double d, double e,
			double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	// Da li je rjesivo
	public boolean isSolvable() {
		return (a * d - b * c != 0);
	}

	//Racunanje x
	public double getX() {
		if (isSolvable())
			return (e * d - b * f) / (a * d - b * c);
		else {
			System.err.println("The equation has no solution.");
			return 0;
		}
	}

	//Racunanje y
	public double getY() {
		if (isSolvable())
			return (a * f - e * c) / (a * d - b * c);
		else {
			System.err.println("The equation has no solution.");
			return 0;
		}
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

}