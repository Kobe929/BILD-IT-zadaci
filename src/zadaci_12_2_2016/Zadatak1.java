package zadaci_12_2_2016;

/*@author Filip Dautovic
 * (Area of a convex polygon) A polygon is convex if it contains any line segments
 that connects two points of the polygon. Write a program that prompts the user to
 enter the number of points in a convex polygon, then enter the points clockwise,
 and display the area of the polygon. 
 */

import java.util.*;

//Eclipse me podsjetio da imamo points u jednoj od prethodnih zadaca, yay
import zadaci_6_2_2016.MyPoint;

public class Zadatak1 {

	public static void main(String[] args) {

		//Skener
		Scanner ulaz = new Scanner(System.in);

		//Broj tacaka
		System.out.println("Unesite broj tacaka:");
		int brojT = ulaz.nextInt();

		if(brojT < 3){
			System.out.println();
		}
		
		//Koordinate
		System.out.print("Unesite koordinate, 2 po 2:");
		ArrayList<MyPoint> points = new ArrayList<>();

		//Strpavamo u listu
		for (int i = 0; i < brojT; i++) {
			points.add(new MyPoint(ulaz.nextDouble(), ulaz.nextDouble()));
		}

		System.out.println("Povrsina poligona je: " + izracunaj(points));

		ulaz.close();
	}

	//Matematika...
	public static double izracunaj(ArrayList<MyPoint> points) {

		
		double sum1 = 0;
		double sum2 = 0;
		
		//Prolazimo kroz listu unesenih tacaka i sabiramo povrsine
		for (int i = 0; i < points.size(); i++) {
			int max = (i + 1) % points.size();

			MyPoint p1 = points.get(i);
			MyPoint p2 = points.get(max);

			sum1 += (p1.x * p2.y);
			sum2 += (p1.y * p2.x);
		}

		double area = 0.5 * (sum1 - sum2);
		
		//Vracamo povrsinu
		if (area > 0) {
			return area;
		} else {
			return -area;
		}
		
		//Rezultat mi se ne poklapa sa onim u knjizi, probao par kombinacija i uvijek varira
	}
}
