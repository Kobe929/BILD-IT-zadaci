package zadaci_29_1_2016;
 
 /*@author Filip Dautovic
  * Napisati program koji igra sa protivnikom rock-paper-scissors. (papir-bunar-makaze ili tako nekako po naški) 
  * Program nasumièno generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program pita korisnika da 
  * unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik pobijedio, da li je raèunar pobijedio ili je bilo neriješeno. 
  */
import java.util.*;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		Random rand = new Random();
		
		int cpu = rand.nextInt(3-0);

		//Izbor
		System.out.println("Izbor: 0 Rock. 1 Paper. 2. Scossors");
		
		//Ulaz
		int user = ulaz.nextInt();
		
		//Uslovi
		if (cpu == user){
			System.out.println("Nerijeseno");
		}
		if (user == 0 && cpu == 1 || cpu == 2 && user == 1 || user == 1 && cpu == 2){
			System.out.println("Izgubili ste");
		}
		if (user == 0 && cpu == 2 || cpu == 1 && user == 2 || user == 1 && cpu == 0){
			System.out.println("Pobijedili ste.");
		}
	ulaz.close();
	}

}
