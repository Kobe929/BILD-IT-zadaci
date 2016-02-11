package zadaci_9_2_2016;

import java.util.*;

/*@author Filip Dautovic
 * (New string split method) The split method in the String class returns an
 array of strings consisting of the substrings split by the delimiters. However, the
 delimiters are not returned. Implement the following new method that returns
 an array of strings consisting of the substrings split by the matching delimiters,
 including the matching delimiters.
 public static String[] split(String s, String regex)
 For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
 array of String, and split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf,
 #, and e in an array of String.
 Idemo u Split? :O :D :D
 */

public class Split {

	public static void main(String[] args) {

		String s = "honolulu";
		String regex = "no";

		String[] niz = split(s, regex);

		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + ", ");
		}

	}

	public static String[] split(String s, String regex) {

		// Nova lista koja ce cuvati razdvojene dijelove
		ArrayList<String> stringX = new ArrayList<>();

		// Drugi string koji cemo koristit
		String string2 = "";

		// Brojac
		int broj = 0;

		char[] regexC = new char[regex.length()];
		for (int i = 0; i < regexC.length; i++) {
			char charz = regex.charAt(i);
			regexC[i] = charz;
		}

		// Doso, proso
		for (int i = 0; i < s.length(); i++) {
			// Razdvajamo string na karaktere
			char charz = s.charAt(i);
			for (int j = 0; j < regexC.length; j++) {
				// Karaktere poredimo sa regex
				if (charz == regexC[j]) {
					
					//I odvajamo dio stringa koji je prije regexa
					string2 = s.substring(broj, i);
					
					//I ubacujemo ga u listu
					stringX.add(string2);

					// Potom i regex + space
					stringX.add(regexC[j] + "");
					
					broj = i + 1;
				}
			}
			
			//Pa poslje regexa dodajemo sljedeci dio, tj ostatak
			if (i == s.length() - 1) {
				string2 = s.substring(broj, s.length());
				stringX.add(string2);
			}

		}

		//Vracamo niz
		String[] stringSplit = new String[stringX.size()];
		for (int i = 0; i < stringSplit.length; i++) {
			stringSplit[i] = stringX.get(i);
		}
		return stringSplit;
	}

}
