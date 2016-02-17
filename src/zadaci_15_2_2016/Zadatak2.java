package zadaci_15_2_2016;

/*
 * (OutOfMemoryError) Write a program that causes the JVM to throw an
 OutOfMemoryError and catches and handles this error.
 */

public class Zadatak2 {

	public static void main(String[] args) {

		try {
			double[][] niz = new double[9999599][65776864];
			String ha = niz.toString();
		} catch (OutOfMemoryError e) {
			System.err.println("My pc fan speed jumped up just a bit.... "
					+ e.getMessage());
		}
	}

}
