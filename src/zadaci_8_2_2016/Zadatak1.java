package zadaci_8_2_2016;

/*@author filip DAutovic
 * (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are
 divisible by 2 or 3.
 Malo nejasno
 */
import java.math.BigInteger;

public class Zadatak1 {

	public static void main(String[] args) {

		// Prvi 50-o cifreni broj
		BigInteger broj = new BigInteger(
				"10000000000000000000000000000000000000000000000000");

		// Brojac
		int brojac = 0;

		// Petlja radi do 10
		while (brojac < 10) {

			// Ispitujemo da li je svaki sljedeci broj djeljiv sa 2 ili 3
			if (broj.mod(new BigInteger("2")).equals(new BigInteger("0"))
					|| broj.mod(new BigInteger("3"))
							.equals(new BigInteger("0"))) {

				// Povecava se brojac
				brojac++;

				// Ispis
				System.out.println(broj);
			}
			// Povecava se broj
			broj = broj.add(new BigInteger("1"));
		}
	}
}