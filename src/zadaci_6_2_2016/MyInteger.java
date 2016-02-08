package zadaci_6_2_2016;

/*
 * (The MyInteger class) Design a class named MyInteger. The class contains:
 An int data field named value that stores the int value represented by this
 object.
 A constructor that creates a MyInteger object for the specified int value.
 A getter method that returns the int value.
 The methods isEven(), isOdd(), and isPrime() that return true if the
 value in this object is even, odd, or prime, respectively.
 The static methods isEven(int), isOdd(int), and isPrime(int) that
 return true if the specified value is even, odd, or prime, respectively.
 The static methods isEven(MyInteger), isOdd(MyInteger), and
 isPrime(MyInteger) that return true if the specified value is even, odd,
 or prime, respectively.
 The methods equals(int) and equals(MyInteger) that return true if
 the value in this object is equal to the specified value.
 A static method parseInt(char[]) that converts an array of numeric
 characters to an int value.
 A static method parseInt(String) that converts a string into an int
 value.
 */

public class MyInteger {

	// Varijabla
	private int value;

	// Konstruktr
	public MyInteger(int value) {
		this.value = value;
	}

	// Vraca vrijednost
	public int getValue() {
		return value;
	}

	// Postavlja vrijednost
	public void setValue(int value) {
		this.value = value;
	}

	// Vraca da li je paran broj
	public boolean isEven() {
		return value % 2 == 0;
	}

	// Vraca da li je neparan
	public boolean isOdd() {
		return !isEven();
	}

	// Da li je prime
	public boolean isPrime() {
		double range = Math.sqrt(value);
		for (int i = 2; i < range; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	// Konvertuje niz karaktera u broj(int)
	public static int parseInt(char[] value) {

		double valueD = 0;
		int valueInt = value.length - 1;
		for (char broj : value) {

			valueD += Math.pow(10, valueInt--) * (broj - '0');
		}

		return (int) valueD;
	}

	// Konvertuje string u broj (int) tako sto string strpa u niz karaktera pa
	// pozove metodu iznad
	public static int parseInt(String value) {

		return MyInteger.parseInt(value.toCharArray());
	}

}
