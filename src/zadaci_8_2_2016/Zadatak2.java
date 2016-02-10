package zadaci_8_2_2016;

/*@author Filip Dautovic
 * (Square numbers) Find the first ten square numbers that are greater than
Long.MAX_VALUE. A square number is a number in the form of n2
. For example,
4, 9, and 16 are square numbers. Find an efficient approach to run your
program fast.
Opet mi malo nejasno al haj
 */
import java.math.BigDecimal;

public class Zadatak2 {

	
		public static void main(String[] args) {

	       
			//BigDecimal sa pocetkom na maksimalnoj vrijednosti long
			BigDecimal max = new BigDecimal(Long.MAX_VALUE);
	        
			//Pocinjemo od kvadrata maxvalue 
			long poc = (long) Math.sqrt(Long.MAX_VALUE);
			
			//Smjestavamo kvadrat u novi bigdecimal
	        BigDecimal n = new BigDecimal(poc);
	      
	        //Brojac
	        int count = 0;

	        //Petlja radi do 10, vikendom do 8
	        while (count < 10) {

	        	//Stackoverflow comment all the rest :/
	            BigDecimal squared = n.multiply(n);
	            if (squared.compareTo(max) > 0) {
	                count++;
	                System.out.println(count+": " + n + " squared = " + squared);
	            }
	            n = n.add(BigDecimal.ONE);
	        }
	    }

	}