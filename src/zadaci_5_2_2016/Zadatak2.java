package zadaci_5_2_2016;

/*
 * Write a test
 program that creates three RegularPolygon objects, created using the no-arg
 constructor, using RegularPolygon(6, 4), and using RegularPolygon(10,
 4, 5.6, 7.8). For each object, display its perimeter and area
 */

public class Zadatak2 {

	public static void main(String[] args) {

		// Kreiranje objekata
		RegularPolygon[] regularPolygons = new RegularPolygon[3];
		regularPolygons[0] = new RegularPolygon();
		regularPolygons[1] = new RegularPolygon(6, 4);
		regularPolygons[2] = new RegularPolygon(10, 4, 5.6, 8.7);

		// Ispis
		for (int i = 0; i < 3; i++) {
			System.out.println("Polygon " + i + " has the perimeter of "
					+ regularPolygons[i].getArea() + " and area of  "
					+ regularPolygons[i].getPerimeter());
		}
	}
}