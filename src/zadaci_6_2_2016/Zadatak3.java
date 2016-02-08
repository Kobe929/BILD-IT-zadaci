package zadaci_6_2_2016;

/*
 * Write a
test program that creates the two points (0, 0) and (10, 30.5) and displays the
distance between them.
 */

public class Zadatak3 {

	public static void main(String[] args) {

		MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println("Razdaljina izmedju 2 tacke: " +p1.distance(p2));

	}

}
