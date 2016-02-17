package zadaci_15_2_2016;

/*
 * (NumberFormatException) Write the bin2Dec(String binaryString)
method to convert a binary string into a decimal number. Implement the
bin2Dec method to throw a NumberFormatException if the string is not a
binary string.
 */
public class Zadatak1 {

	public static void main(String[] args) {
		
		try {
			System.out.println(bin2Dec("h"));
		} catch (NumberFormatException fe) {
			System.out.println(fe.getMessage());
		}
		
	}

	//Metoda racuna decimalnu vrijednost unesenog stringa
	public static double bin2Dec(String binary) throws NumberFormatException {

		if (!isBinary(binary)) {
			throw new NumberFormatException(binary + " nije binarni broj.");
		}
		
		//Racunanje
		double temp = 0;
		double decimal = 0;
		for (int i = binary.length() - 1; i >= 0; i--) {

			if (binary.charAt(i) == '1') {
				decimal += Math.pow(2, temp);
			}
			temp++;
		}
		return decimal;
	}

	//Metoda provjerava da li su u stringu samo jedinice i nule
	public static boolean isBinary(String binary) {

		for (char ch : binary.toCharArray()) {
			if (ch != '1' && ch != '0')
				return false;
		}
		return true;
	}

}
