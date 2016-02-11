package zadaci_9_2_2016;
 
/*@auth Filip D
  * (Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString2):
public MyString2(String s);
public int compare(String s);
public MyString2 substring(int begin);
public MyString2 toUpperCase();
public char[] toChars();
public static MyString2 valueOf(boolean b);
  */

public class MyString2 {

	//Init string
	String string;
	
	// Konstruktujemo
	public MyString2(String s){
		this.string = s;
	}
	
	// Ciji je veci?
	public int compare(String s){
		
		int veci = 0;	
		if (this.string.length() > s.length()){
			veci = 1;
		}
		else if (this.string.length() < s.length()){
			veci = -1;
		}
		
		// Detajnija usporedba char po char
		else {
			for(int i = 0; i < this.string.length();i++){
				char karakter1 = this.string.charAt(i);
				char karakter2 = s.charAt(i);
				if(karakter1 > karakter2){
					veci = 1;
					break;
				}
				if(karakter1 < karakter2){
					veci = -1;
					break;
				}	
			}
		}
		return veci;
	}
	
	// Vraca dio stringa od izabranog indeksa
	public MyString2 substring(int begin){
		
		String string = this.string.substring(begin, this.string.length());
		return new MyString2(string);
		
	}
	
	// Konvertujemo u uppercase 
	public MyString2 toUpperCase(){
		
		String string = "";
		
		for(int i = 0; i < this.string.length(); i++){
			char karakter = this.string.toUpperCase().charAt(i);
			string += karakter;
		}
		//Strpavamo u novi string i zurick
		return new MyString2(string);
	}
	
	// String -> niz karaktera
	public char[] toChars(){
		char[] chars = new char[this.string.length()];
		for(int i = 0; i < chars.length; i++){
			char charz = this.string.charAt(i);
			chars[i] = charz;
		}
		//Vraca se niz
		return chars;
	}
	
	// Zavisi da li proslijedimo true ili false, string postaje "true" ili "false"
	public static MyString2 valueOf(boolean b){
		if(b == true)
			return new MyString2("true");
		else{
			return new MyString2("false");
		}
	}
	
}

