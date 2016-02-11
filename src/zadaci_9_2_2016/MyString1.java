package zadaci_9_2_2016;

/*@author Filip Dautovic
 * (Implement the String class) The String class is provided in the Java library.
 Provide your own implementation for the following methods (name the new
 class MyString1):
 public MyString1(char[] chars);
 public char charAt(int index);
 public int length();
 public MyString1 substring(int begin, int end);
 public MyString1 toLowerCase();
 public boolean equals(MyString1 s);
 public static MyString1 valueOf(int i);
 */

public class MyString1 {

	char[] chars;

	// Metode iz zadatka

	// Atrpavanje u niz
	public MyString1(char[] chars) {

		this.chars = new char[chars.length];

		for (int i = 0; i < chars.length; i++)
			this.chars[i] = chars[i];

	}

	

	// Vracanje karaktera sa pozicije
	public char charAt(int index) {
		return this.charAt(index);

	}

	// Vracanje duzine stringa
	public int length() {
		return this.chars.length;
	}

	// Vracanje karaktera od-do
	public MyString1 substring(int begin, int end) {
		//Novi niz karaktera duzine od do onesenih
		char[] chars = new char[end - begin + 1];
		
		//Strpavanje
		for (int i = 0; i < chars.length; i++) {
			chars[i] = this.chars[begin++];
		}
		//Vraca trimmed
		return new MyString1(chars);
	}

	// Konvertuje u mala slova
	public MyString1 toLowerCase() {
		//Novi niz
		char[] chars = new char[this.chars.length];
		//MAkse otale, prolazim krozate!
		for (int i = 0; i < chars.length; i++) {
			//I svaki char konvertuje u mala slova (ako su vel'ka)
			chars[i] = Character.toLowerCase(this.chars[i]);
		}
		return new MyString1(chars);
	}

	// Dal' su siti stringovi?
	public boolean equals(MyString1 s) {
		
		boolean equals = true;
		// Ako nisu iste duzine nisu jednaki
		if (this.chars.length != s.chars.length) {
			equals = false;
		} else {
			// Ispituje da li je svaki karakter jednak
			for (int i = 0; i < this.chars.length; i++) {
				if (this.chars[i] != s.chars[i]) {
					equals = false;
				}
			}
		}
		
		//ako prodje testove, sorry you positive brah
		return equals;
	}

	// Vraca vrijednost broja
	public static MyString1 valueOf(int i) {
		int broj1 = i;
		int brojac = 0;
		// provjera dužine broja
		while (i != 0) {
			i /= 10;
			brojac++;
		}
		char[] chars = new char[brojac];
		// petlja odvaja brojeve i smješta ih u niz
		for (int j = chars.length - 1; j >= 0; j--) {
			int broj2 = broj1 % 10;
			chars[j] = Character.forDigit(broj2, 10);
			broj1 /= 10;
		}

		return new MyString1(chars);
	}

	
	
}