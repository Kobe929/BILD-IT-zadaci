package zadaci_29_1_2016;

/*@authro Filip Dautovic
 * Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 te ispisuje ime mjeseca za taj broj. 
 * (Januar za 1, Ferbruar za 2....)
 */
public class Zadatak1 {

	public static void main(String[] args) {
		
		//Random broj
		int a = (int) (Math.random() * 12) + 1;

		//Ispis
		if (a == 1) {
			System.out.println("Januar.");
		} else if (a == 2) {
			System.out.println("Februar.");
		} else if (a == 3) {
			System.out.println("Mart.");
		} else if (a == 4) {
			System.out.println("April.");
		} else if (a == 5) {
			System.out.println("Maj.");
		} else if (a == 6) {
			System.out.println("Juni.");
		} else if (a == 7) {
			System.out.println("Juli.");
		} else if (a == 8) {
			System.out.println("August.");
		} else if (a == 9) {
			System.out.println("Septembar.");
		} else if (a == 10) {
			System.out.println("Oktobar.");
		} else if (a == 11) {
			System.out.println("Novembar.");
		} else if (a == 12) {
			System.out.println("Decembar.");
		}

	}

}
