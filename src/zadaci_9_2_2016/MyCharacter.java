package zadaci_9_2_2016;

/*@authro Filip Dautovic
 * (Implement the Character class) The Character class is provided in the Java
library. Provide your own implementation for this class. Name the new class
MyCharacter.
 */

public class MyCharacter {
	

	//Novi char
	    private char ch;

	    //Konstruktor
	    public MyCharacter(char ch) {
	        this.ch = ch;
	    }

	    //Da li je broj?
	    public static boolean isDigit(char ch) {
	        return ch <= '9' && ch >= '0';
	    }

	    //Dal' je malo slovo?
	    public static boolean isLowerCase(char ch) {

	        return (ch <= 'z' && ch >= 'a');
	    }

	    //Vel'ko?
	    public static boolean isUpperCase(char ch) {
	        return (ch <= 'Z' && ch >= 'A');
	    }

	    //Slovo ikako? O.o
	    public static boolean isLetter(char ch) {
	        return (ch <= 'z' && ch >= 'a') ||
	                (ch <= 'Z' && ch >= 'A');
	    }

	    //Slovo ili broj?
	    public static boolean isLetterOrDigit(char ch) {
	        return isLetter(ch) || isDigit(ch);
	    }

	    //Prebaci u velko ako je malo
	    public static char toUpperCase(char ch) {
	        if (isLowerCase(ch)) {
	            return (char) (ch - 'a' + 'A');
	        } else {
	            return ch;
	        }
	    }

	    //Prebaci u malo ako je veliko 
	    public static char toLowerCase(char ch) {
	        if (isUpperCase(ch)) {
	            return (char) (ch - 'A' + 'a');
	        } else {
	            return ch;
	        }
	    }

	    //Vraca boolean na osnovu gornje metode
	    public boolean isDigit() {
	        return isDigit(ch);
	    }

	  //Vraca boolean na osnovu gornje metode
	    public boolean isLetter() {
	        return isLetter(ch);
	    }

	    //Vraca char
	    public char getChar() {
	        return ch;
	    }

	    //Uporedba 
	    public int compareTo(MyCharacter ch) {
	        return this.ch - ch.getChar();
	    }

	    //Jednako?
	    public boolean equals(MyCharacter ch) {
	        return this.ch == ch.getChar();
	    }

	}
