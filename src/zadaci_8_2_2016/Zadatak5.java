package zadaci_8_2_2016;

/*@author Filip Dautovic
 * (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE
that are divisible by 5 or 6.
 */

import java.math.BigDecimal;

public class Zadatak5 {

	 public static void main(String[] args) {

		 	//Brojac
	        int brojac = 0;
	        
	        //Prvi broj koji se testira za 1 veci od long max value
	        BigDecimal broj = new BigDecimal(Long.MAX_VALUE).add(BigDecimal.ONE);
	       
	        //Petlja do 10
	        while (brojac < 10) {

	        	//Ako ostatak dijeljenja broja sa 5 ili 6 je nula
	            if (broj.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO) ||
	                broj.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO)) {
	                
	            	//Povecava se brojac
	            	brojac++;
	            	
	            	//I ispisuje broj
	                System.out.println(brojac+ ". broj: " +broj);
	            }
	            
	            //Broj se povecava za 1 i petlja se ponovo vrti
	            broj = broj.add(BigDecimal.ONE);
	        }
	    }
	}