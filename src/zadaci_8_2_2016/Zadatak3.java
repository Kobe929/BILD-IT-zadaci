package zadaci_8_2_2016;

/*@author Filip Dautovic
 * (Large prime numbers) Write a program that finds five prime numbers larger
than Long.MAX_VALUE
 */
import java.math.BigInteger;

public class Zadatak3 {

	public static void main(String[] args) {
		// Prvi 50-o cifreni broj
				BigInteger broj = new BigInteger(
						"10000000000000000000000000000000000000000000000000");

				// Brojac
				int brojac = 0;

				// Petlja radi do 10
				while (brojac < 10) {

					// Ispitujemo da li je svaki sljedeci broj prime
					if (broj.isProbablePrime(5)) {

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