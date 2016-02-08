package zadaci_6_2_2016;

/*@author Filip Dautovic
 * (The MyPoint class) Design a class named MyPoint to represent a point with
 x- and y-coordinates. The class contains:
 The data fields x and y that represent the coordinates with getter
 methods.
 A no-arg constructor that creates a point (0, 0).
 A constructor that constructs a point with specified coordinates.
 A method named distance that returns the distance from this point to a
 specified point of the MyPoint type.
 A method named distance that returns the distance from this point to
 another point with specified x- and y-coordinates.
 */

public class MyPoint {
	private double x;
	private double y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	//Vraca razdaljinu do specificne tacke
	public double distance(MyPoint p) {
		return Math.sqrt(((p.getX() - x) * ((p.getX() - x)))
				+ ((p.getY() - y) * (p.getY() - y)));
	}

	//Vraca razdaljinu do unesenih koordinata
	public double distance(double x1, double y1) {
		return Math.sqrt(((x1 - x) * ((x1 - x))) + ((y1 - y) * (y1 - y)));
	}

	// Getter za x
	public double getX() {
		return x;
	}

	// Getter za y
	public double getY() {
		return y;
	}

}