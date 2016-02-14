package zadaci_12_2_2016;

/*(IllegalArgumentException) Modify the Loan class in Listing 10.2 to
 throw IllegalArgumentException if the loan amount, interest rate, or
 number of years is less than or equal to zero.
 */

public class Zadatak5 {

	public static void main(String[] args) {
		
		try {
			
			@SuppressWarnings("unused")
			Loan loan = new Loan(5, 10, 10000);
			
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException: " + e.getMessage());
		}

	}

}
