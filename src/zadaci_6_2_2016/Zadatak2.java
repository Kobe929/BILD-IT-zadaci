package zadaci_6_2_2016;

//Write a client program that tests all methods in the class.

public class Zadatak2 {

	public static void main(String[] args) {
		
		//Testiranje metoda
		MyInteger broj = new MyInteger(13);
        String str = "559";
		
		System.out.println("Broj " +broj.getValue() +", prime: "+ broj.isPrime() +" neparan: "+ broj.isOdd() +" paran: "+ broj.isEven());
       
        System.out.println("String " +str+ " int vrijednost: " +MyInteger.parseInt(str));
       

    }
}
