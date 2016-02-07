package zadaci_5_2_2016;

/*
 * (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides
have the same length and all angles have the same degree (i.e., the polygon is
both equilateral and equiangular). Design a class named RegularPolygon that
contains:
 A private int data field named n that defines the number of sides in the polygon
with default value 3.
 A private double data field named side that stores the length of the side with
default value 1.
 A private double data field named x that defines the x-coordinate of the polygon’s
center with default value 0.
 A private double data field named y that defines the y-coordinate of the polygon’s
center with default value 0.
 A no-arg constructor that creates a regular polygon with default values.
 A constructor that creates a regular polygon with the specified number of sides
and length of side, centered at (0, 0).
 A constructor that creates a regular polygon with the specified number of sides,
length of side, and x- and y-coordinates.
 The accessor and mutator methods for all data fields.
 The method getPerimeter() that returns the perimeter of the polygon.
 The method getArea() that returns the area of the polygon. The formula for
computing the area of a regular polygon is Area = formula
 */

public class RegularPolygon {

	//Varijable iz zadatka
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;

	//No args konstruktor sa default values
	public RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;

	}

	//Konstruktor sa unosom broja strana i duzina
	public RegularPolygon(int numberOfSides, double sideLength) {
		this();
		side = sideLength;
		n = numberOfSides;

	}

	//Konstruktor sa brojem strana, duzinom i dijagonalama
	public RegularPolygon(int numberOfSides, double sideLength, double x1,
			double y1) {
		this(numberOfSides, sideLength);
		x = x1;
		y = y1;
	}

	//Vraca broj strana
	public int getNumberOfSides() {
		return n;
	}

	//Postavlja broj strana
	public void setNumberOfSides(int numberOfSides) {
		n = numberOfSides;
	}

	//Vraca duzinu strana
	public double getSideLength() {
		return side;
	}

	//Posavlja duzinu strana
	public void setSideLength(double sideLength) {
		side = sideLength;
	}

	//Vraca x koortinatu centra dijagonale
	public double getCenterX() {
		return x;
	}
	
	//Postavlja x koordinatu centra dijagonale
	public void setCenterX(double x2) {
		x = x2;
	}
	
	//Vraca y koordinatu y dijagonale
	public double getCenterY() {
		return y;
	}

	//Postavlja y koordinatu centra dijagonale
	public void setCenterY(double y2) {
		y = y2;
	}


	//Vraca obim
	public double getPerimeter() {

		return n * side;
	}

	//Vraca povrsinu
	public double getArea() {

		//Formula iz zadatka
		return (n * side * side) / (4.0 * Math.tan(Math.PI / n));
	}

}
